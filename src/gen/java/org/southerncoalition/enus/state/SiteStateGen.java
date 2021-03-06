package org.southerncoalition.enus.state;

import java.util.Arrays;
import org.southerncoalition.enus.request.api.ApiRequest;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.util.Date;
import org.southerncoalition.enus.agency.SiteAgency;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import io.vertx.core.logging.LoggerFactory;
import java.text.NumberFormat;
import java.util.ArrayList;
import org.apache.commons.collections.CollectionUtils;
import java.lang.Long;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.vertx.core.json.JsonObject;
import java.lang.String;
import io.vertx.core.logging.Logger;
import org.southerncoalition.enus.cluster.Cluster;
import java.math.RoundingMode;
import org.southerncoalition.enus.wrap.Wrap;
import org.southerncoalition.enus.writer.AllWriter;
import java.math.MathContext;
import org.apache.solr.client.solrj.response.QueryResponse;
import java.util.Set;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.southerncoalition.enus.request.SiteRequestEnUS;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.solr.client.solrj.util.ClientUtils;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.southerncoalition.enus.context.SiteContextEnUS;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.state.SiteState&fq=classeEtendGen_indexed_boolean:true">Find the class  in Solr. </a>
 * <br/>
 **/
public abstract class SiteStateGen<DEV> extends Cluster {
	protected static final Logger LOGGER = LoggerFactory.getLogger(SiteState.class);

	public static final List<String> ROLES = Arrays.asList("SiteAdmin");
	public static final List<String> ROLE_READS = Arrays.asList("");

	public static final String SiteState_AName = "a state";
	public static final String SiteState_This = "this ";
	public static final String SiteState_ThisName = "this state";
	public static final String SiteState_A = "a ";
	public static final String SiteState_TheName = "the state";
	public static final String SiteState_NameSingular = "state";
	public static final String SiteState_NamePlural = "states";
	public static final String SiteState_NameActual = "current state";
	public static final String SiteState_AllName = "all the states";
	public static final String SiteState_SearchAllNameBy = "search states by ";
	public static final String SiteState_Title = "states";
	public static final String SiteState_ThePluralName = "the states";
	public static final String SiteState_NoNameFound = "no state found";
	public static final String SiteState_NameVar = "state";
	public static final String SiteState_OfName = "of state";
	public static final String SiteState_ANameAdjective = "a state";
	public static final String SiteState_NameAdjectiveSingular = "state";
	public static final String SiteState_NameAdjectivePlural = "states";
	public static final String SiteState_Color = "pale-blue";
	public static final String SiteState_IconGroup = "regular";
	public static final String SiteState_IconName = "globe-americas";

	//////////////
	// stateKey //
	//////////////

	/**	 The entity stateKey
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long stateKey;
	@JsonIgnore
	public Wrap<Long> stateKeyWrap = new Wrap<Long>().p(this).c(Long.class).var("stateKey").o(stateKey);

	/**	<br/> The entity stateKey
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.state.SiteState&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateKey">Find the entity stateKey in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateKey(Wrap<Long> c);

	public Long getStateKey() {
		return stateKey;
	}

	public void setStateKey(Long stateKey) {
		this.stateKey = stateKey;
		this.stateKeyWrap.alreadyInitialized = true;
	}
	public SiteState setStateKey(String o) {
		if(NumberUtils.isParsable(o))
			this.stateKey = Long.parseLong(o);
		this.stateKeyWrap.alreadyInitialized = true;
		return (SiteState)this;
	}
	protected SiteState stateKeyInit() {
		if(!stateKeyWrap.alreadyInitialized) {
			_stateKey(stateKeyWrap);
			if(stateKey == null)
				setStateKey(stateKeyWrap.o);
		}
		stateKeyWrap.alreadyInitialized(true);
		return (SiteState)this;
	}

	public Long solrStateKey() {
		return stateKey;
	}

	public String strStateKey() {
		return stateKey == null ? "" : stateKey.toString();
	}

	public String jsonStateKey() {
		return stateKey == null ? "" : stateKey.toString();
	}

	public String nomAffichageStateKey() {
		return null;
	}

	public String htmTooltipStateKey() {
		return null;
	}

	public String htmStateKey() {
		return stateKey == null ? "" : StringEscapeUtils.escapeHtml4(strStateKey());
	}

	///////////////
	// stateName //
	///////////////

	/**	 The entity stateName
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String stateName;
	@JsonIgnore
	public Wrap<String> stateNameWrap = new Wrap<String>().p(this).c(String.class).var("stateName").o(stateName);

	/**	<br/> The entity stateName
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.state.SiteState&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateName">Find the entity stateName in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateName(Wrap<String> c);

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
		this.stateNameWrap.alreadyInitialized = true;
	}
	protected SiteState stateNameInit() {
		if(!stateNameWrap.alreadyInitialized) {
			_stateName(stateNameWrap);
			if(stateName == null)
				setStateName(stateNameWrap.o);
		}
		stateNameWrap.alreadyInitialized(true);
		return (SiteState)this;
	}

	public String solrStateName() {
		return stateName;
	}

	public String strStateName() {
		return stateName == null ? "" : stateName;
	}

	public String jsonStateName() {
		return stateName == null ? "" : stateName;
	}

	public String nomAffichageStateName() {
		return "name";
	}

	public String htmTooltipStateName() {
		return null;
	}

	public String htmStateName() {
		return stateName == null ? "" : StringEscapeUtils.escapeHtml4(strStateName());
	}

	public void inputStateName(String classApiMethodMethod) {
		SiteState s = (SiteState)this;
		if(
				CollectionUtils.containsAny(siteRequest_.getUserResourceRoles(), ROLES)
				|| CollectionUtils.containsAny(siteRequest_.getUserRealmRoles(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("placeholder", "name")
				.a("id", classApiMethodMethod, "_stateName");
				if("Page".equals(classApiMethodMethod) || "PATCH".equals(classApiMethodMethod)) {
					a("class", "setStateName classSiteState inputSiteState", pk, "StateName w3-input w3-border ");
					a("name", "setStateName");
				} else {
					a("class", "valueStateName w3-input w3-border classSiteState inputSiteState", pk, "StateName w3-input w3-border ");
					a("name", "stateName");
				}
				if("Page".equals(classApiMethodMethod)) {
					a("onclick", "removeGlow($(this)); ");
					a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setStateName', $(this).val(), function() { addGlow($('#", classApiMethodMethod, "_stateName')); }, function() { addError($('#", classApiMethodMethod, "_stateName')); }); ");
				}
				a("value", strStateName())
			.fg();

		} else {
			e("span").a("class", "varSiteState", pk, "StateName ").f().sx(htmStateName()).g("span");
		}
	}

	public void htmStateName(String classApiMethodMethod) {
		SiteState s = (SiteState)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggest", classApiMethodMethod, "SiteStateStateName").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-pale-blue ").f();
							e("label").a("for", classApiMethodMethod, "_stateName").a("class", "").f().sx("name").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputStateName(classApiMethodMethod);
							} g("div");
							if(
									CollectionUtils.containsAny(siteRequest_.getUserResourceRoles(), ROLES)
									|| CollectionUtils.containsAny(siteRequest_.getUserRealmRoles(), ROLES)
									) {
								if("Page".equals(classApiMethodMethod)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-pale-blue ")
										.a("onclick", "removeGlow($('#", classApiMethodMethod, "_stateName')); $('#", classApiMethodMethod, "_stateName').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#SiteStateForm :input[name=pk]').val() }], 'setStateName', null, function() { addGlow($('#", classApiMethodMethod, "_stateName')); }, function() { addError($('#", classApiMethodMethod, "_stateName')); }); ")
											.f();
											e("i").a("class", "far fa-eraser ").f().g("i");
										} g("button");
									} g("div");
								}
							}
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	///////////////////////
	// stateAbbreviation //
	///////////////////////

	/**	 The entity stateAbbreviation
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String stateAbbreviation;
	@JsonIgnore
	public Wrap<String> stateAbbreviationWrap = new Wrap<String>().p(this).c(String.class).var("stateAbbreviation").o(stateAbbreviation);

	/**	<br/> The entity stateAbbreviation
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.state.SiteState&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateAbbreviation">Find the entity stateAbbreviation in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateAbbreviation(Wrap<String> c);

	public String getStateAbbreviation() {
		return stateAbbreviation;
	}

	public void setStateAbbreviation(String stateAbbreviation) {
		this.stateAbbreviation = stateAbbreviation;
		this.stateAbbreviationWrap.alreadyInitialized = true;
	}
	protected SiteState stateAbbreviationInit() {
		if(!stateAbbreviationWrap.alreadyInitialized) {
			_stateAbbreviation(stateAbbreviationWrap);
			if(stateAbbreviation == null)
				setStateAbbreviation(stateAbbreviationWrap.o);
		}
		stateAbbreviationWrap.alreadyInitialized(true);
		return (SiteState)this;
	}

	public String solrStateAbbreviation() {
		return stateAbbreviation;
	}

	public String strStateAbbreviation() {
		return stateAbbreviation == null ? "" : stateAbbreviation;
	}

	public String jsonStateAbbreviation() {
		return stateAbbreviation == null ? "" : stateAbbreviation;
	}

	public String nomAffichageStateAbbreviation() {
		return "abbreviation";
	}

	public String htmTooltipStateAbbreviation() {
		return null;
	}

	public String htmStateAbbreviation() {
		return stateAbbreviation == null ? "" : StringEscapeUtils.escapeHtml4(strStateAbbreviation());
	}

	public void inputStateAbbreviation(String classApiMethodMethod) {
		SiteState s = (SiteState)this;
		if(
				CollectionUtils.containsAny(siteRequest_.getUserResourceRoles(), ROLES)
				|| CollectionUtils.containsAny(siteRequest_.getUserRealmRoles(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("placeholder", "abbreviation")
				.a("id", classApiMethodMethod, "_stateAbbreviation");
				if("Page".equals(classApiMethodMethod) || "PATCH".equals(classApiMethodMethod)) {
					a("class", "setStateAbbreviation classSiteState inputSiteState", pk, "StateAbbreviation w3-input w3-border ");
					a("name", "setStateAbbreviation");
				} else {
					a("class", "valueStateAbbreviation w3-input w3-border classSiteState inputSiteState", pk, "StateAbbreviation w3-input w3-border ");
					a("name", "stateAbbreviation");
				}
				if("Page".equals(classApiMethodMethod)) {
					a("onclick", "removeGlow($(this)); ");
					a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setStateAbbreviation', $(this).val(), function() { addGlow($('#", classApiMethodMethod, "_stateAbbreviation')); }, function() { addError($('#", classApiMethodMethod, "_stateAbbreviation')); }); ");
				}
				a("value", strStateAbbreviation())
			.fg();

		} else {
			e("span").a("class", "varSiteState", pk, "StateAbbreviation ").f().sx(htmStateAbbreviation()).g("span");
		}
	}

	public void htmStateAbbreviation(String classApiMethodMethod) {
		SiteState s = (SiteState)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggest", classApiMethodMethod, "SiteStateStateAbbreviation").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-pale-blue ").f();
							e("label").a("for", classApiMethodMethod, "_stateAbbreviation").a("class", "").f().sx("abbreviation").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputStateAbbreviation(classApiMethodMethod);
							} g("div");
							if(
									CollectionUtils.containsAny(siteRequest_.getUserResourceRoles(), ROLES)
									|| CollectionUtils.containsAny(siteRequest_.getUserRealmRoles(), ROLES)
									) {
								if("Page".equals(classApiMethodMethod)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-pale-blue ")
										.a("onclick", "removeGlow($('#", classApiMethodMethod, "_stateAbbreviation')); $('#", classApiMethodMethod, "_stateAbbreviation').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#SiteStateForm :input[name=pk]').val() }], 'setStateAbbreviation', null, function() { addGlow($('#", classApiMethodMethod, "_stateAbbreviation')); }, function() { addError($('#", classApiMethodMethod, "_stateAbbreviation')); }); ")
											.f();
											e("i").a("class", "far fa-eraser ").f().g("i");
										} g("button");
									} g("div");
								}
							}
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	////////////////
	// agencyKeys //
	////////////////

	/**	 The entity agencyKeys
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<Long>(). 
	 */
	@JsonSerialize(contentUsing = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected List<Long> agencyKeys = new ArrayList<Long>();
	@JsonIgnore
	public Wrap<List<Long>> agencyKeysWrap = new Wrap<List<Long>>().p(this).c(List.class).var("agencyKeys").o(agencyKeys);

	/**	<br/> The entity agencyKeys
	 *  It is constructed before being initialized with the constructor by default List<Long>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.state.SiteState&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyKeys">Find the entity agencyKeys in Solr</a>
	 * <br/>
	 * @param agencyKeys is the entity already constructed. 
	 **/
	protected abstract void _agencyKeys(List<Long> o);

	public List<Long> getAgencyKeys() {
		return agencyKeys;
	}

	public void setAgencyKeys(List<Long> agencyKeys) {
		this.agencyKeys = agencyKeys;
		this.agencyKeysWrap.alreadyInitialized = true;
	}
	public SiteState addAgencyKeys(Long...objets) {
		for(Long o : objets) {
			addAgencyKeys(o);
		}
		return (SiteState)this;
	}
	public SiteState addAgencyKeys(Long o) {
		if(o != null && !agencyKeys.contains(o))
			this.agencyKeys.add(o);
		return (SiteState)this;
	}
	public SiteState setAgencyKeys(JsonArray objets) {
		agencyKeys.clear();
		for(int i = 0; i < objets.size(); i++) {
			Long o = objets.getLong(i);
			addAgencyKeys(o);
		}
		return (SiteState)this;
	}
	public SiteState addAgencyKeys(String o) {
		if(NumberUtils.isParsable(o)) {
			Long p = Long.parseLong(o);
			addAgencyKeys(p);
		}
		return (SiteState)this;
	}
	protected SiteState agencyKeysInit() {
		if(!agencyKeysWrap.alreadyInitialized) {
			_agencyKeys(agencyKeys);
		}
		agencyKeysWrap.alreadyInitialized(true);
		return (SiteState)this;
	}

	public List<Long> solrAgencyKeys() {
		return agencyKeys;
	}

	public String strAgencyKeys() {
		return agencyKeys == null ? "" : agencyKeys.toString();
	}

	public String jsonAgencyKeys() {
		return agencyKeys == null ? "" : agencyKeys.toString();
	}

	public String nomAffichageAgencyKeys() {
		return "agencies";
	}

	public String htmTooltipAgencyKeys() {
		return null;
	}

	public String htmAgencyKeys() {
		return agencyKeys == null ? "" : StringEscapeUtils.escapeHtml4(strAgencyKeys());
	}

	public void inputAgencyKeys(String classApiMethodMethod) {
		SiteState s = (SiteState)this;
		if(
				CollectionUtils.containsAny(siteRequest_.getUserResourceRoles(), ROLES)
				|| CollectionUtils.containsAny(siteRequest_.getUserRealmRoles(), ROLES)
				) {
			e("i").a("class", "far fa-search w3-xxlarge w3-cell w3-cell-middle ").f().g("i");
				e("input")
					.a("type", "text")
					.a("placeholder", "agencies")
					.a("class", "value suggestAgencyKeys w3-input w3-border w3-cell w3-cell-middle ")
					.a("name", "setAgencyKeys")
					.a("id", classApiMethodMethod, "_agencyKeys")
					.a("autocomplete", "off")
					.a("oninput", "suggestSiteStateAgencyKeys($(this).val() ? searchSiteAgencyFilters($(this.parentElement)) : [", pk == null ? "" : "{'name':'fq','value':'stateKey:" + pk + "'}", "], $('#listSiteStateAgencyKeys_", classApiMethodMethod, "'), ", pk, "); ")
				.fg();

		} else {
			e("span").a("class", "varSiteState", pk, "AgencyKeys ").f().sx(htmAgencyKeys()).g("span");
		}
	}

	public void htmAgencyKeys(String classApiMethodMethod) {
		SiteState s = (SiteState)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggest", classApiMethodMethod, "SiteStateAgencyKeys").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row ").f();
							{ e("a").a("href", "/agency?fq=stateKey:", pk).a("class", "w3-cell w3-btn w3-center h4 w3-block h4 w3-pale-yellow w3-hover-pale-yellow ").f();
								e("i").a("class", "far fa-road ").f().g("i");
								sx("agencies");
							} g("a");
						} g("div");
						{ e("div").a("class", "w3-cell-row ").f();
							{ e("h5").a("class", "w3-cell ").f();
								sx("relate  to this state");
							} g("h5");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();
								{ e("div").a("class", "w3-cell-row ").f();

								inputAgencyKeys(classApiMethodMethod);
								} g("div");
							} g("div");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
								{ e("ul").a("class", "w3-ul w3-hoverable ").a("id", "listSiteStateAgencyKeys_", classApiMethodMethod).f();
								} g("ul");
								if(
										CollectionUtils.containsAny(siteRequest_.getUserResourceRoles(), SiteAgency.ROLES)
										|| CollectionUtils.containsAny(siteRequest_.getUserRealmRoles(), SiteAgency.ROLES)
										) {
									{ e("div").a("class", "w3-cell-row ").f();
										e("button")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-pale-yellow ")
											.a("id", classApiMethodMethod, "_agencyKeys_add")
											.a("onclick", "$(this).addClass('w3-disabled'); this.disabled = true; this.innerHTML = 'Sending…'; postSiteAgencyVals({ stateKey: \"", pk, "\" }, function() {}, function() { addError($('#", classApiMethodMethod, "agencyKeys')); });")
											.f().sx("add a agency")
										.g("button");
									} g("div");
								}
							} g("div");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	////////////////////////
	// agencyCompleteName //
	////////////////////////

	/**	 The entity agencyCompleteName
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String agencyCompleteName;
	@JsonIgnore
	public Wrap<String> agencyCompleteNameWrap = new Wrap<String>().p(this).c(String.class).var("agencyCompleteName").o(agencyCompleteName);

	/**	<br/> The entity agencyCompleteName
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.state.SiteState&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyCompleteName">Find the entity agencyCompleteName in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyCompleteName(Wrap<String> c);

	public String getAgencyCompleteName() {
		return agencyCompleteName;
	}

	public void setAgencyCompleteName(String agencyCompleteName) {
		this.agencyCompleteName = agencyCompleteName;
		this.agencyCompleteNameWrap.alreadyInitialized = true;
	}
	protected SiteState agencyCompleteNameInit() {
		if(!agencyCompleteNameWrap.alreadyInitialized) {
			_agencyCompleteName(agencyCompleteNameWrap);
			if(agencyCompleteName == null)
				setAgencyCompleteName(agencyCompleteNameWrap.o);
		}
		agencyCompleteNameWrap.alreadyInitialized(true);
		return (SiteState)this;
	}

	public String solrAgencyCompleteName() {
		return agencyCompleteName;
	}

	public String strAgencyCompleteName() {
		return agencyCompleteName == null ? "" : agencyCompleteName;
	}

	public String jsonAgencyCompleteName() {
		return agencyCompleteName == null ? "" : agencyCompleteName;
	}

	public String nomAffichageAgencyCompleteName() {
		return null;
	}

	public String htmTooltipAgencyCompleteName() {
		return null;
	}

	public String htmAgencyCompleteName() {
		return agencyCompleteName == null ? "" : StringEscapeUtils.escapeHtml4(strAgencyCompleteName());
	}

	//////////////
	// initDeep //
	//////////////

	protected boolean alreadyInitializedSiteState = false;

	public SiteState initDeepSiteState(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		if(!alreadyInitializedSiteState) {
			alreadyInitializedSiteState = true;
			initDeepSiteState();
		}
		return (SiteState)this;
	}

	public void initDeepSiteState() {
		initSiteState();
		super.initDeepCluster(siteRequest_);
	}

	public void initSiteState() {
		stateKeyInit();
		stateNameInit();
		stateAbbreviationInit();
		agencyKeysInit();
		agencyCompleteNameInit();
	}

	@Override public void initDeepForClass(SiteRequestEnUS siteRequest_) {
		initDeepSiteState(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSiteState(SiteRequestEnUS siteRequest_) {
			super.siteRequestCluster(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSiteState(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSiteState(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtainForClass(v);
			}
		}
		return o;
	}
	public Object obtainSiteState(String var) {
		SiteState oSiteState = (SiteState)this;
		switch(var) {
			case "stateKey":
				return oSiteState.stateKey;
			case "stateName":
				return oSiteState.stateName;
			case "stateAbbreviation":
				return oSiteState.stateAbbreviation;
			case "agencyKeys":
				return oSiteState.agencyKeys;
			case "agencyCompleteName":
				return oSiteState.agencyCompleteName;
			default:
				return super.obtainCluster(var);
		}
	}

	///////////////
	// attribute //
	///////////////

	@Override public boolean attributeForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attributeSiteState(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attributeForClass(v, val);
			}
		}
		return o != null;
	}
	public Object attributeSiteState(String var, Object val) {
		SiteState oSiteState = (SiteState)this;
		switch(var) {
			case "agencyKeys":
				oSiteState.addAgencyKeys((Long)val);
				if(!saves.contains(var))
					saves.add(var);
				return val;
			default:
				return super.attributeCluster(var, val);
		}
	}

	/////////////
	// define //
	/////////////

	@Override public boolean defineForClass(String var, String val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = defineSiteState(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.defineForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object defineSiteState(String var, String val) {
		switch(var) {
			case "stateName":
				if(val != null)
					setStateName(val);
				saves.add(var);
				return val;
			case "stateAbbreviation":
				if(val != null)
					setStateAbbreviation(val);
				saves.add(var);
				return val;
			default:
				return super.defineCluster(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrDocument solrDocument) {
		populateSiteState(solrDocument);
	}
	public void populateSiteState(SolrDocument solrDocument) {
		SiteState oSiteState = (SiteState)this;
		saves = (List<String>)solrDocument.get("saves_stored_strings");
		if(saves != null) {

			if(saves.contains("stateKey")) {
				Long stateKey = (Long)solrDocument.get("stateKey_stored_long");
				if(stateKey != null)
					oSiteState.setStateKey(stateKey);
			}

			if(saves.contains("stateName")) {
				String stateName = (String)solrDocument.get("stateName_stored_string");
				if(stateName != null)
					oSiteState.setStateName(stateName);
			}

			if(saves.contains("stateAbbreviation")) {
				String stateAbbreviation = (String)solrDocument.get("stateAbbreviation_stored_string");
				if(stateAbbreviation != null)
					oSiteState.setStateAbbreviation(stateAbbreviation);
			}

			List<Long> agencyKeys = (List<Long>)solrDocument.get("agencyKeys_stored_longs");
			if(agencyKeys != null)
				oSiteState.agencyKeys.addAll(agencyKeys);

			if(saves.contains("agencyCompleteName")) {
				String agencyCompleteName = (String)solrDocument.get("agencyCompleteName_stored_string");
				if(agencyCompleteName != null)
					oSiteState.setAgencyCompleteName(agencyCompleteName);
			}
		}

		super.populateCluster(solrDocument);
	}

	/////////////
	// index //
	/////////////

	public static void index() {
		try {
			SiteRequestEnUS siteRequest = new SiteRequestEnUS();
			siteRequest.initDeepSiteRequestEnUS();
			SiteContextEnUS siteContext = new SiteContextEnUS();
			siteContext.getSiteConfig().setConfigPath("/usr/local/src/southerncoalition/config/southerncoalition.config");
			siteContext.initDeepSiteContextEnUS();
			siteRequest.setSiteContext_(siteContext);
			siteRequest.setSiteConfig_(siteContext.getSiteConfig());
			SolrQuery solrQuery = new SolrQuery();
			solrQuery.setQuery("*:*");
			solrQuery.setRows(1);
			solrQuery.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.southerncoalition.enus.state.SiteState"));
			QueryResponse queryResponse = siteRequest.getSiteContext_().getSolrClient().query(solrQuery);
			if(queryResponse.getResults().size() > 0)
				siteRequest.setSolrDocument(queryResponse.getResults().get(0));
			SiteState o = new SiteState();
			o.siteRequestSiteState(siteRequest);
			o.initDeepSiteState(siteRequest);
			o.indexSiteState();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexForClass() {
		indexSiteState();
	}

	@Override public void indexForClass(SolrInputDocument document) {
		indexSiteState(document);
	}

	public void indexSiteState(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexSiteState(document);
			clientSolr.add(document);
			clientSolr.commit(false, false, true);
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexSiteState() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexSiteState(document);
			SolrClient clientSolr = siteRequest_.getSiteContext_().getSolrClient();
			clientSolr.add(document);
			clientSolr.commit(false, false, true);
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexSiteState(SolrInputDocument document) {
		if(stateKey != null) {
			document.addField("stateKey_indexed_long", stateKey);
			document.addField("stateKey_stored_long", stateKey);
		}
		if(stateName != null) {
			document.addField("stateName_indexed_string", stateName);
			document.addField("stateName_stored_string", stateName);
		}
		if(stateAbbreviation != null) {
			document.addField("stateAbbreviation_indexed_string", stateAbbreviation);
			document.addField("stateAbbreviation_stored_string", stateAbbreviation);
		}
		if(agencyKeys != null) {
			for(java.lang.Long o : agencyKeys) {
				document.addField("agencyKeys_indexed_longs", o);
			}
			for(java.lang.Long o : agencyKeys) {
				document.addField("agencyKeys_stored_longs", o);
			}
		}
		if(agencyCompleteName != null) {
			document.addField("agencyCompleteName_indexed_string", agencyCompleteName);
			document.addField("agencyCompleteName_stored_string", agencyCompleteName);
		}
		super.indexCluster(document);

	}

	public void unindexSiteState() {
		try {
		SiteRequestEnUS siteRequest = new SiteRequestEnUS();
			siteRequest.initDeepSiteRequestEnUS();
			SiteContextEnUS siteContext = new SiteContextEnUS();
			siteContext.initDeepSiteContextEnUS();
			siteRequest.setSiteContext_(siteContext);
			siteRequest.setSiteConfig_(siteContext.getSiteConfig());
			initDeepSiteState(siteRequest);
			SolrClient solrClient = siteContext.getSolrClient();
			solrClient.deleteById(id.toString());
			solrClient.commit(false, false, true);
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public static String varIndexedSiteState(String entityVar) {
		switch(entityVar) {
			case "stateKey":
				return "stateKey_indexed_long";
			case "stateName":
				return "stateName_indexed_string";
			case "stateAbbreviation":
				return "stateAbbreviation_indexed_string";
			case "agencyKeys":
				return "agencyKeys_indexed_longs";
			case "agencyCompleteName":
				return "agencyCompleteName_indexed_string";
			default:
				return Cluster.varIndexedCluster(entityVar);
		}
	}

	public static String varSearchSiteState(String entityVar) {
		switch(entityVar) {
			default:
				return Cluster.varSearchCluster(entityVar);
		}
	}

	public static String varSuggestedSiteState(String entityVar) {
		switch(entityVar) {
			default:
				return Cluster.varSuggestedCluster(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrDocument solrDocument) {
		storeSiteState(solrDocument);
	}
	public void storeSiteState(SolrDocument solrDocument) {
		SiteState oSiteState = (SiteState)this;

		Long stateKey = (Long)solrDocument.get("stateKey_stored_long");
		if(stateKey != null)
			oSiteState.setStateKey(stateKey);

		String stateName = (String)solrDocument.get("stateName_stored_string");
		if(stateName != null)
			oSiteState.setStateName(stateName);

		String stateAbbreviation = (String)solrDocument.get("stateAbbreviation_stored_string");
		if(stateAbbreviation != null)
			oSiteState.setStateAbbreviation(stateAbbreviation);

		List<Long> agencyKeys = (List<Long>)solrDocument.get("agencyKeys_stored_longs");
		if(agencyKeys != null)
			oSiteState.agencyKeys.addAll(agencyKeys);

		String agencyCompleteName = (String)solrDocument.get("agencyCompleteName_stored_string");
		if(agencyCompleteName != null)
			oSiteState.setAgencyCompleteName(agencyCompleteName);

		super.storeCluster(solrDocument);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestSiteState() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(SiteRequestEnUS::getApiRequest_).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof SiteState) {
			SiteState original = (SiteState)o;
			if(!Objects.equals(stateKey, original.getStateKey()))
				apiRequest.addVars("stateKey");
			if(!Objects.equals(stateName, original.getStateName()))
				apiRequest.addVars("stateName");
			if(!Objects.equals(stateAbbreviation, original.getStateAbbreviation()))
				apiRequest.addVars("stateAbbreviation");
			if(!Objects.equals(agencyKeys, original.getAgencyKeys()))
				apiRequest.addVars("agencyKeys");
			if(!Objects.equals(agencyCompleteName, original.getAgencyCompleteName()))
				apiRequest.addVars("agencyCompleteName");
			super.apiRequestCluster();
		}
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode(), stateKey, stateName, stateAbbreviation, agencyKeys, agencyCompleteName);
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof SiteState))
			return false;
		SiteState that = (SiteState)o;
		return super.equals(o)
				&& Objects.equals( stateKey, that.stateKey )
				&& Objects.equals( stateName, that.stateName )
				&& Objects.equals( stateAbbreviation, that.stateAbbreviation )
				&& Objects.equals( agencyKeys, that.agencyKeys )
				&& Objects.equals( agencyCompleteName, that.agencyCompleteName );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("SiteState { ");
		sb.append( "stateKey: " ).append(stateKey);
		sb.append( ", stateName: \"" ).append(stateName).append( "\"" );
		sb.append( ", stateAbbreviation: \"" ).append(stateAbbreviation).append( "\"" );
		sb.append( ", agencyKeys: " ).append(agencyKeys);
		sb.append( ", agencyCompleteName: \"" ).append(agencyCompleteName).append( "\"" );
		sb.append(" }");
		return sb.toString();
	}
}
