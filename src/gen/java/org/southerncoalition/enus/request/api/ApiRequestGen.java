package org.southerncoalition.enus.request.api;

import java.util.Arrays;
import org.southerncoalition.enus.request.api.ApiRequest;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.util.Date;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import java.lang.Integer;
import java.text.NumberFormat;
import io.vertx.core.logging.LoggerFactory;
import java.util.ArrayList;
import org.apache.commons.collections.CollectionUtils;
import java.lang.Long;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import java.util.Locale;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.time.ZoneOffset;
import java.lang.String;
import io.vertx.core.logging.Logger;
import org.southerncoalition.enus.cluster.Cluster;
import java.math.RoundingMode;
import org.southerncoalition.enus.wrap.Wrap;
import org.southerncoalition.enus.writer.AllWriter;
import java.math.MathContext;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.Instant;
import org.southerncoalition.enus.request.SiteRequestEnUS;
import java.time.ZoneId;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import java.util.List;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.lang.Object;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.api.ApiRequest&fq=classeEtendGen_indexed_boolean:true">Find the class  in Solr. </a>
 * <br/>
 **/
public abstract class ApiRequestGen<DEV> extends Object {
	protected static final Logger LOGGER = LoggerFactory.getLogger(ApiRequest.class);

	//////////////////
	// siteRequest_ //
	//////////////////

	/**	 The entity siteRequest_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SiteRequestEnUS siteRequest_;
	@JsonIgnore
	public Wrap<SiteRequestEnUS> siteRequest_Wrap = new Wrap<SiteRequestEnUS>().p(this).c(SiteRequestEnUS.class).var("siteRequest_").o(siteRequest_);

	/**	<br/> The entity siteRequest_
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.api.ApiRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteRequest_(Wrap<SiteRequestEnUS> c);

	public SiteRequestEnUS getSiteRequest_() {
		return siteRequest_;
	}

	public void setSiteRequest_(SiteRequestEnUS siteRequest_) {
		this.siteRequest_ = siteRequest_;
		this.siteRequest_Wrap.alreadyInitialized = true;
	}
	protected ApiRequest siteRequest_Init() {
		if(!siteRequest_Wrap.alreadyInitialized) {
			_siteRequest_(siteRequest_Wrap);
			if(siteRequest_ == null)
				setSiteRequest_(siteRequest_Wrap.o);
		}
		siteRequest_Wrap.alreadyInitialized(true);
		return (ApiRequest)this;
	}

	/////////////
	// created //
	/////////////

	/**	 The entity created
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected ZonedDateTime created;
	@JsonIgnore
	public Wrap<ZonedDateTime> createdWrap = new Wrap<ZonedDateTime>().p(this).c(ZonedDateTime.class).var("created").o(created);

	/**	<br/> The entity created
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.api.ApiRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:created">Find the entity created in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _created(Wrap<ZonedDateTime> c);

	public ZonedDateTime getCreated() {
		return created;
	}

	public void setCreated(ZonedDateTime created) {
		this.created = created;
		this.createdWrap.alreadyInitialized = true;
	}
	public ApiRequest setCreated(Instant o) {
		this.created = o == null ? null : ZonedDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
		this.createdWrap.alreadyInitialized = true;
		return (ApiRequest)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public ApiRequest setCreated(String o) {
		this.created = o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME.withZone(ZoneId.of(siteRequest_.getSiteConfig_().getSiteZone()))).truncatedTo(ChronoUnit.MILLIS);
		this.createdWrap.alreadyInitialized = true;
		return (ApiRequest)this;
	}
	public ApiRequest setCreated(Date o) {
		this.created = o == null ? null : ZonedDateTime.ofInstant(o.toInstant(), ZoneId.of(siteRequest_.getSiteConfig_().getSiteZone())).truncatedTo(ChronoUnit.MILLIS);
		this.createdWrap.alreadyInitialized = true;
		return (ApiRequest)this;
	}
	protected ApiRequest createdInit() {
		if(!createdWrap.alreadyInitialized) {
			_created(createdWrap);
			if(created == null)
				setCreated(createdWrap.o);
		}
		createdWrap.alreadyInitialized(true);
		return (ApiRequest)this;
	}

	public Date solrCreated() {
		return created == null ? null : Date.from(created.toInstant());
	}

	public String strCreated() {
		return created == null ? "" : created.format(DateTimeFormatter.ofPattern("EEE d MMM yyyy H:mm:ss a zz", Locale.forLanguageTag("en-US")));
	}

	public String jsonCreated() {
		return created == null ? "" : created.format(DateTimeFormatter.ISO_DATE_TIME);
	}

	public String nomAffichageCreated() {
		return null;
	}

	public String htmTooltipCreated() {
		return null;
	}

	public String htmCreated() {
		return created == null ? "" : StringEscapeUtils.escapeHtml4(strCreated());
	}

	//////////
	// rows //
	//////////

	/**	 The entity rows
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer rows;
	@JsonIgnore
	public Wrap<Integer> rowsWrap = new Wrap<Integer>().p(this).c(Integer.class).var("rows").o(rows);

	/**	<br/> The entity rows
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.api.ApiRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:rows">Find the entity rows in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _rows(Wrap<Integer> c);

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
		this.rowsWrap.alreadyInitialized = true;
	}
	public ApiRequest setRows(String o) {
		if(NumberUtils.isParsable(o))
			this.rows = Integer.parseInt(o);
		this.rowsWrap.alreadyInitialized = true;
		return (ApiRequest)this;
	}
	protected ApiRequest rowsInit() {
		if(!rowsWrap.alreadyInitialized) {
			_rows(rowsWrap);
			if(rows == null)
				setRows(rowsWrap.o);
		}
		rowsWrap.alreadyInitialized(true);
		return (ApiRequest)this;
	}

	public Integer solrRows() {
		return rows;
	}

	public String strRows() {
		return rows == null ? "" : rows.toString();
	}

	public String jsonRows() {
		return rows == null ? "" : rows.toString();
	}

	public String nomAffichageRows() {
		return null;
	}

	public String htmTooltipRows() {
		return null;
	}

	public String htmRows() {
		return rows == null ? "" : StringEscapeUtils.escapeHtml4(strRows());
	}

	//////////////
	// numFound //
	//////////////

	/**	 The entity numFound
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long numFound;
	@JsonIgnore
	public Wrap<Long> numFoundWrap = new Wrap<Long>().p(this).c(Long.class).var("numFound").o(numFound);

	/**	<br/> The entity numFound
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.api.ApiRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:numFound">Find the entity numFound in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _numFound(Wrap<Long> c);

	public Long getNumFound() {
		return numFound;
	}

	public void setNumFound(Long numFound) {
		this.numFound = numFound;
		this.numFoundWrap.alreadyInitialized = true;
	}
	public ApiRequest setNumFound(String o) {
		if(NumberUtils.isParsable(o))
			this.numFound = Long.parseLong(o);
		this.numFoundWrap.alreadyInitialized = true;
		return (ApiRequest)this;
	}
	protected ApiRequest numFoundInit() {
		if(!numFoundWrap.alreadyInitialized) {
			_numFound(numFoundWrap);
			if(numFound == null)
				setNumFound(numFoundWrap.o);
		}
		numFoundWrap.alreadyInitialized(true);
		return (ApiRequest)this;
	}

	public Long solrNumFound() {
		return numFound;
	}

	public String strNumFound() {
		return numFound == null ? "" : numFound.toString();
	}

	public String jsonNumFound() {
		return numFound == null ? "" : numFound.toString();
	}

	public String nomAffichageNumFound() {
		return null;
	}

	public String htmTooltipNumFound() {
		return null;
	}

	public String htmNumFound() {
		return numFound == null ? "" : StringEscapeUtils.escapeHtml4(strNumFound());
	}

	//////////////
	// numPATCH //
	//////////////

	/**	 The entity numPATCH
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long numPATCH;
	@JsonIgnore
	public Wrap<Long> numPATCHWrap = new Wrap<Long>().p(this).c(Long.class).var("numPATCH").o(numPATCH);

	/**	<br/> The entity numPATCH
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.api.ApiRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:numPATCH">Find the entity numPATCH in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _numPATCH(Wrap<Long> c);

	public Long getNumPATCH() {
		return numPATCH;
	}

	public void setNumPATCH(Long numPATCH) {
		this.numPATCH = numPATCH;
		this.numPATCHWrap.alreadyInitialized = true;
	}
	public ApiRequest setNumPATCH(String o) {
		if(NumberUtils.isParsable(o))
			this.numPATCH = Long.parseLong(o);
		this.numPATCHWrap.alreadyInitialized = true;
		return (ApiRequest)this;
	}
	protected ApiRequest numPATCHInit() {
		if(!numPATCHWrap.alreadyInitialized) {
			_numPATCH(numPATCHWrap);
			if(numPATCH == null)
				setNumPATCH(numPATCHWrap.o);
		}
		numPATCHWrap.alreadyInitialized(true);
		return (ApiRequest)this;
	}

	public Long solrNumPATCH() {
		return numPATCH;
	}

	public String strNumPATCH() {
		return numPATCH == null ? "" : numPATCH.toString();
	}

	public String jsonNumPATCH() {
		return numPATCH == null ? "" : numPATCH.toString();
	}

	public String nomAffichageNumPATCH() {
		return null;
	}

	public String htmTooltipNumPATCH() {
		return null;
	}

	public String htmNumPATCH() {
		return numPATCH == null ? "" : StringEscapeUtils.escapeHtml4(strNumPATCH());
	}

	//////////
	// uuid //
	//////////

	/**	 The entity uuid
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String uuid;
	@JsonIgnore
	public Wrap<String> uuidWrap = new Wrap<String>().p(this).c(String.class).var("uuid").o(uuid);

	/**	<br/> The entity uuid
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.api.ApiRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:uuid">Find the entity uuid in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _uuid(Wrap<String> c);

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		this.uuidWrap.alreadyInitialized = true;
	}
	protected ApiRequest uuidInit() {
		if(!uuidWrap.alreadyInitialized) {
			_uuid(uuidWrap);
			if(uuid == null)
				setUuid(uuidWrap.o);
		}
		uuidWrap.alreadyInitialized(true);
		return (ApiRequest)this;
	}

	public String solrUuid() {
		return uuid;
	}

	public String strUuid() {
		return uuid == null ? "" : uuid;
	}

	public String jsonUuid() {
		return uuid == null ? "" : uuid;
	}

	public String nomAffichageUuid() {
		return null;
	}

	public String htmTooltipUuid() {
		return null;
	}

	public String htmUuid() {
		return uuid == null ? "" : StringEscapeUtils.escapeHtml4(strUuid());
	}

	////////
	// id //
	////////

	/**	 The entity id
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String id;
	@JsonIgnore
	public Wrap<String> idWrap = new Wrap<String>().p(this).c(String.class).var("id").o(id);

	/**	<br/> The entity id
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.api.ApiRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> c);

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		this.idWrap.alreadyInitialized = true;
	}
	protected ApiRequest idInit() {
		if(!idWrap.alreadyInitialized) {
			_id(idWrap);
			if(id == null)
				setId(idWrap.o);
		}
		idWrap.alreadyInitialized(true);
		return (ApiRequest)this;
	}

	public String solrId() {
		return id;
	}

	public String strId() {
		return id == null ? "" : id;
	}

	public String jsonId() {
		return id == null ? "" : id;
	}

	public String nomAffichageId() {
		return null;
	}

	public String htmTooltipId() {
		return null;
	}

	public String htmId() {
		return id == null ? "" : StringEscapeUtils.escapeHtml4(strId());
	}

	///////////
	// empty //
	///////////

	/**	 The entity empty
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Boolean empty;
	@JsonIgnore
	public Wrap<Boolean> emptyWrap = new Wrap<Boolean>().p(this).c(Boolean.class).var("empty").o(empty);

	/**	<br/> The entity empty
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.api.ApiRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:empty">Find the entity empty in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _empty(Wrap<Boolean> c);

	public Boolean getEmpty() {
		return empty;
	}

	public void setEmpty(Boolean empty) {
		this.empty = empty;
		this.emptyWrap.alreadyInitialized = true;
	}
	public ApiRequest setEmpty(String o) {
		this.empty = Boolean.parseBoolean(o);
		this.emptyWrap.alreadyInitialized = true;
		return (ApiRequest)this;
	}
	protected ApiRequest emptyInit() {
		if(!emptyWrap.alreadyInitialized) {
			_empty(emptyWrap);
			if(empty == null)
				setEmpty(emptyWrap.o);
		}
		emptyWrap.alreadyInitialized(true);
		return (ApiRequest)this;
	}

	public Boolean solrEmpty() {
		return empty;
	}

	public String strEmpty() {
		return empty == null ? "" : empty.toString();
	}

	public String jsonEmpty() {
		return empty == null ? "" : empty.toString();
	}

	public String nomAffichageEmpty() {
		return null;
	}

	public String htmTooltipEmpty() {
		return null;
	}

	public String htmEmpty() {
		return empty == null ? "" : StringEscapeUtils.escapeHtml4(strEmpty());
	}

	////////
	// pk //
	////////

	/**	 The entity pk
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pk;
	@JsonIgnore
	public Wrap<Long> pkWrap = new Wrap<Long>().p(this).c(Long.class).var("pk").o(pk);

	/**	<br/> The entity pk
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.api.ApiRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pk(Wrap<Long> c);

	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
		this.pkWrap.alreadyInitialized = true;
	}
	public ApiRequest setPk(String o) {
		if(NumberUtils.isParsable(o))
			this.pk = Long.parseLong(o);
		this.pkWrap.alreadyInitialized = true;
		return (ApiRequest)this;
	}
	protected ApiRequest pkInit() {
		if(!pkWrap.alreadyInitialized) {
			_pk(pkWrap);
			if(pk == null)
				setPk(pkWrap.o);
		}
		pkWrap.alreadyInitialized(true);
		return (ApiRequest)this;
	}

	public Long solrPk() {
		return pk;
	}

	public String strPk() {
		return pk == null ? "" : pk.toString();
	}

	public String jsonPk() {
		return pk == null ? "" : pk.toString();
	}

	public String nomAffichagePk() {
		return null;
	}

	public String htmTooltipPk() {
		return null;
	}

	public String htmPk() {
		return pk == null ? "" : StringEscapeUtils.escapeHtml4(strPk());
	}

	//////////////
	// original //
	//////////////

	/**	 The entity original
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Object original;
	@JsonIgnore
	public Wrap<Object> originalWrap = new Wrap<Object>().p(this).c(Object.class).var("original").o(original);

	/**	<br/> The entity original
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.api.ApiRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:original">Find the entity original in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _original(Wrap<Object> c);

	public Object getOriginal() {
		return original;
	}

	public void setOriginal(Object original) {
		this.original = original;
		this.originalWrap.alreadyInitialized = true;
	}
	protected ApiRequest originalInit() {
		if(!originalWrap.alreadyInitialized) {
			_original(originalWrap);
			if(original == null)
				setOriginal(originalWrap.o);
		}
		originalWrap.alreadyInitialized(true);
		return (ApiRequest)this;
	}

	/////////
	// pks //
	/////////

	/**	 The entity pks
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<Long>(). 
	 */
	@JsonSerialize(contentUsing = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected List<Long> pks = new ArrayList<Long>();
	@JsonIgnore
	public Wrap<List<Long>> pksWrap = new Wrap<List<Long>>().p(this).c(List.class).var("pks").o(pks);

	/**	<br/> The entity pks
	 *  It is constructed before being initialized with the constructor by default List<Long>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.api.ApiRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pks">Find the entity pks in Solr</a>
	 * <br/>
	 * @param pks is the entity already constructed. 
	 **/
	protected abstract void _pks(List<Long> c);

	public List<Long> getPks() {
		return pks;
	}

	public void setPks(List<Long> pks) {
		this.pks = pks;
		this.pksWrap.alreadyInitialized = true;
	}
	public ApiRequest addPks(Long...objets) {
		for(Long o : objets) {
			addPks(o);
		}
		return (ApiRequest)this;
	}
	public ApiRequest addPks(Long o) {
		if(o != null && !pks.contains(o))
			this.pks.add(o);
		return (ApiRequest)this;
	}
	public ApiRequest setPks(JsonArray objets) {
		pks.clear();
		for(int i = 0; i < objets.size(); i++) {
			Long o = objets.getLong(i);
			addPks(o);
		}
		return (ApiRequest)this;
	}
	public ApiRequest addPks(String o) {
		if(NumberUtils.isParsable(o)) {
			Long p = Long.parseLong(o);
			addPks(p);
		}
		return (ApiRequest)this;
	}
	protected ApiRequest pksInit() {
		if(!pksWrap.alreadyInitialized) {
			_pks(pks);
		}
		pksWrap.alreadyInitialized(true);
		return (ApiRequest)this;
	}

	public List<Long> solrPks() {
		return pks;
	}

	public String strPks() {
		return pks == null ? "" : pks.toString();
	}

	public String jsonPks() {
		return pks == null ? "" : pks.toString();
	}

	public String nomAffichagePks() {
		return null;
	}

	public String htmTooltipPks() {
		return null;
	}

	public String htmPks() {
		return pks == null ? "" : StringEscapeUtils.escapeHtml4(strPks());
	}

	/////////////
	// classes //
	/////////////

	/**	 The entity classes
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	@JsonInclude(Include.NON_NULL)
	protected List<String> classes = new ArrayList<String>();
	@JsonIgnore
	public Wrap<List<String>> classesWrap = new Wrap<List<String>>().p(this).c(List.class).var("classes").o(classes);

	/**	<br/> The entity classes
	 *  It is constructed before being initialized with the constructor by default List<String>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.api.ApiRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:classes">Find the entity classes in Solr</a>
	 * <br/>
	 * @param classes is the entity already constructed. 
	 **/
	protected abstract void _classes(List<String> c);

	public List<String> getClasses() {
		return classes;
	}

	public void setClasses(List<String> classes) {
		this.classes = classes;
		this.classesWrap.alreadyInitialized = true;
	}
	public ApiRequest addClasses(String...objets) {
		for(String o : objets) {
			addClasses(o);
		}
		return (ApiRequest)this;
	}
	public ApiRequest addClasses(String o) {
		if(o != null && !classes.contains(o))
			this.classes.add(o);
		return (ApiRequest)this;
	}
	public ApiRequest setClasses(JsonArray objets) {
		classes.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addClasses(o);
		}
		return (ApiRequest)this;
	}
	protected ApiRequest classesInit() {
		if(!classesWrap.alreadyInitialized) {
			_classes(classes);
		}
		classesWrap.alreadyInitialized(true);
		return (ApiRequest)this;
	}

	public List<String> solrClasses() {
		return classes;
	}

	public String strClasses() {
		return classes == null ? "" : classes.toString();
	}

	public String jsonClasses() {
		return classes == null ? "" : classes.toString();
	}

	public String nomAffichageClasses() {
		return null;
	}

	public String htmTooltipClasses() {
		return null;
	}

	public String htmClasses() {
		return classes == null ? "" : StringEscapeUtils.escapeHtml4(strClasses());
	}

	//////////
	// vars //
	//////////

	/**	 The entity vars
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	@JsonInclude(Include.NON_NULL)
	protected List<String> vars = new ArrayList<String>();
	@JsonIgnore
	public Wrap<List<String>> varsWrap = new Wrap<List<String>>().p(this).c(List.class).var("vars").o(vars);

	/**	<br/> The entity vars
	 *  It is constructed before being initialized with the constructor by default List<String>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.api.ApiRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:vars">Find the entity vars in Solr</a>
	 * <br/>
	 * @param vars is the entity already constructed. 
	 **/
	protected abstract void _vars(List<String> c);

	public List<String> getVars() {
		return vars;
	}

	public void setVars(List<String> vars) {
		this.vars = vars;
		this.varsWrap.alreadyInitialized = true;
	}
	public ApiRequest addVars(String...objets) {
		for(String o : objets) {
			addVars(o);
		}
		return (ApiRequest)this;
	}
	public ApiRequest addVars(String o) {
		if(o != null && !vars.contains(o))
			this.vars.add(o);
		return (ApiRequest)this;
	}
	public ApiRequest setVars(JsonArray objets) {
		vars.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addVars(o);
		}
		return (ApiRequest)this;
	}
	protected ApiRequest varsInit() {
		if(!varsWrap.alreadyInitialized) {
			_vars(vars);
		}
		varsWrap.alreadyInitialized(true);
		return (ApiRequest)this;
	}

	public List<String> solrVars() {
		return vars;
	}

	public String strVars() {
		return vars == null ? "" : vars.toString();
	}

	public String jsonVars() {
		return vars == null ? "" : vars.toString();
	}

	public String nomAffichageVars() {
		return null;
	}

	public String htmTooltipVars() {
		return null;
	}

	public String htmVars() {
		return vars == null ? "" : StringEscapeUtils.escapeHtml4(strVars());
	}

	//////////////
	// initDeep //
	//////////////

	protected boolean alreadyInitializedApiRequest = false;

	public ApiRequest initDeepApiRequest(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		if(!alreadyInitializedApiRequest) {
			alreadyInitializedApiRequest = true;
			initDeepApiRequest();
		}
		return (ApiRequest)this;
	}

	public void initDeepApiRequest() {
		initApiRequest();
	}

	public void initApiRequest() {
		siteRequest_Init();
		createdInit();
		rowsInit();
		numFoundInit();
		numPATCHInit();
		uuidInit();
		idInit();
		emptyInit();
		pkInit();
		originalInit();
		pksInit();
		classesInit();
		varsInit();
	}

	public void initDeepForClass(SiteRequestEnUS siteRequest_) {
		initDeepApiRequest(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestApiRequest(SiteRequestEnUS siteRequest_) {
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestApiRequest(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainApiRequest(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtainForClass(v);
			}
		}
		return o;
	}
	public Object obtainApiRequest(String var) {
		ApiRequest oApiRequest = (ApiRequest)this;
		switch(var) {
			case "siteRequest_":
				return oApiRequest.siteRequest_;
			case "created":
				return oApiRequest.created;
			case "rows":
				return oApiRequest.rows;
			case "numFound":
				return oApiRequest.numFound;
			case "numPATCH":
				return oApiRequest.numPATCH;
			case "uuid":
				return oApiRequest.uuid;
			case "id":
				return oApiRequest.id;
			case "empty":
				return oApiRequest.empty;
			case "pk":
				return oApiRequest.pk;
			case "original":
				return oApiRequest.original;
			case "pks":
				return oApiRequest.pks;
			case "classes":
				return oApiRequest.classes;
			case "vars":
				return oApiRequest.vars;
			default:
				return null;
		}
	}

	///////////////
	// attribute //
	///////////////

	public boolean attributeForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attributeApiRequest(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attributeForClass(v, val);
			}
		}
		return o != null;
	}
	public Object attributeApiRequest(String var, Object val) {
		ApiRequest oApiRequest = (ApiRequest)this;
		switch(var) {
			default:
				return null;
		}
	}

	/////////////
	// define //
	/////////////

	public boolean defineForClass(String var, String val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = defineApiRequest(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.defineForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object defineApiRequest(String var, String val) {
		switch(var) {
			default:
				return null;
		}
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestApiRequest() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(SiteRequestEnUS::getApiRequest_).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof ApiRequest) {
			ApiRequest original = (ApiRequest)o;
		}
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash();
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof ApiRequest))
			return false;
		ApiRequest that = (ApiRequest)o;
		return true;
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ApiRequest { ");
		sb.append(" }");
		return sb.toString();
	}
}
