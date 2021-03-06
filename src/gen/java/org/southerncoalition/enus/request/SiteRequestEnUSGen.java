package org.southerncoalition.enus.request;

import java.util.Arrays;
import org.apache.solr.common.SolrDocumentList;
import org.apache.commons.lang3.StringUtils;
import java.lang.Long;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.sqlclient.Transaction;
import io.vertx.core.logging.Logger;
import org.southerncoalition.enus.cluster.Cluster;
import java.math.RoundingMode;
import io.vertx.core.http.CaseInsensitiveHeaders;
import org.southerncoalition.enus.writer.AllWriter;
import java.math.MathContext;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Objects;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import java.util.Optional;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.southerncoalition.enus.user.SiteUser;
import org.southerncoalition.enus.context.SiteContextEnUS;
import org.southerncoalition.enus.request.api.ApiRequest;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.southerncoalition.enus.config.SiteConfig;
import java.util.HashMap;
import java.text.NumberFormat;
import io.vertx.core.logging.LoggerFactory;
import java.util.Stack;
import java.util.ArrayList;
import io.vertx.sqlclient.SqlConnection;
import org.apache.commons.collections.CollectionUtils;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.String;
import org.southerncoalition.enus.wrap.Wrap;
import org.apache.solr.client.solrj.response.QueryResponse;
import io.vertx.core.Vertx;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.southerncoalition.enus.request.SiteRequestEnUS;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import io.vertx.ext.web.api.OperationRequest;
import org.apache.commons.lang3.math.NumberUtils;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.lang.Object;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true">Find the class  in Solr. </a>
 * <br/>
 **/
public abstract class SiteRequestEnUSGen<DEV> extends Object {
	protected static final Logger LOGGER = LoggerFactory.getLogger(SiteRequestEnUS.class);

	//////////////////
	// siteContext_ //
	//////////////////

	/**	 The entity siteContext_
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected SiteContextEnUS siteContext_;
	@JsonIgnore
	public Wrap<SiteContextEnUS> siteContext_Wrap = new Wrap<SiteContextEnUS>().p(this).c(SiteContextEnUS.class).var("siteContext_").o(siteContext_);

	/**	<br/> The entity siteContext_
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:siteContext_">Find the entity siteContext_ in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteContext_(Wrap<SiteContextEnUS> c);

	public SiteContextEnUS getSiteContext_() {
		return siteContext_;
	}

	public void setSiteContext_(SiteContextEnUS siteContext_) {
		this.siteContext_ = siteContext_;
		this.siteContext_Wrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS siteContext_Init() {
		if(!siteContext_Wrap.alreadyInitialized) {
			_siteContext_(siteContext_Wrap);
			if(siteContext_ == null)
				setSiteContext_(siteContext_Wrap.o);
		}
		siteContext_Wrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	/////////////////
	// siteConfig_ //
	/////////////////

	/**	 The entity siteConfig_
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected SiteConfig siteConfig_;
	@JsonIgnore
	public Wrap<SiteConfig> siteConfig_Wrap = new Wrap<SiteConfig>().p(this).c(SiteConfig.class).var("siteConfig_").o(siteConfig_);

	/**	<br/> The entity siteConfig_
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:siteConfig_">Find the entity siteConfig_ in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteConfig_(Wrap<SiteConfig> c);

	public SiteConfig getSiteConfig_() {
		return siteConfig_;
	}

	public void setSiteConfig_(SiteConfig siteConfig_) {
		this.siteConfig_ = siteConfig_;
		this.siteConfig_Wrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS siteConfig_Init() {
		if(!siteConfig_Wrap.alreadyInitialized) {
			_siteConfig_(siteConfig_Wrap);
			if(siteConfig_ == null)
				setSiteConfig_(siteConfig_Wrap.o);
		}
		siteConfig_Wrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	//////////////////
	// siteRequest_ //
	//////////////////

	/**	 The entity siteRequest_
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected SiteRequestEnUS siteRequest_;
	@JsonIgnore
	public Wrap<SiteRequestEnUS> siteRequest_Wrap = new Wrap<SiteRequestEnUS>().p(this).c(SiteRequestEnUS.class).var("siteRequest_").o(siteRequest_);

	/**	<br/> The entity siteRequest_
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
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
	protected SiteRequestEnUS siteRequest_Init() {
		if(!siteRequest_Wrap.alreadyInitialized) {
			_siteRequest_(siteRequest_Wrap);
			if(siteRequest_ == null)
				setSiteRequest_(siteRequest_Wrap.o);
		}
		siteRequest_Wrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	/////////////////
	// apiRequest_ //
	/////////////////

	/**	 The entity apiRequest_
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected ApiRequest apiRequest_;
	@JsonIgnore
	public Wrap<ApiRequest> apiRequest_Wrap = new Wrap<ApiRequest>().p(this).c(ApiRequest.class).var("apiRequest_").o(apiRequest_);

	/**	<br/> The entity apiRequest_
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:apiRequest_">Find the entity apiRequest_ in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _apiRequest_(Wrap<ApiRequest> c);

	public ApiRequest getApiRequest_() {
		return apiRequest_;
	}

	public void setApiRequest_(ApiRequest apiRequest_) {
		this.apiRequest_ = apiRequest_;
		this.apiRequest_Wrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS apiRequest_Init() {
		if(!apiRequest_Wrap.alreadyInitialized) {
			_apiRequest_(apiRequest_Wrap);
			if(apiRequest_ == null)
				setApiRequest_(apiRequest_Wrap.o);
		}
		apiRequest_Wrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	///////////
	// vertx //
	///////////

	/**	 The entity vertx
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Vertx vertx;
	@JsonIgnore
	public Wrap<Vertx> vertxWrap = new Wrap<Vertx>().p(this).c(Vertx.class).var("vertx").o(vertx);

	/**	<br/> The entity vertx
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:vertx">Find the entity vertx in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _vertx(Wrap<Vertx> c);

	public Vertx getVertx() {
		return vertx;
	}

	public void setVertx(Vertx vertx) {
		this.vertx = vertx;
		this.vertxWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS vertxInit() {
		if(!vertxWrap.alreadyInitialized) {
			_vertx(vertxWrap);
			if(vertx == null)
				setVertx(vertxWrap.o);
		}
		vertxWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	////////////////
	// jsonObject //
	////////////////

	/**	 The entity jsonObject
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected JsonObject jsonObject;
	@JsonIgnore
	public Wrap<JsonObject> jsonObjectWrap = new Wrap<JsonObject>().p(this).c(JsonObject.class).var("jsonObject").o(jsonObject);

	/**	<br/> The entity jsonObject
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:jsonObject">Find the entity jsonObject in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _jsonObject(Wrap<JsonObject> c);

	public JsonObject getJsonObject() {
		return jsonObject;
	}

	public void setJsonObject(JsonObject jsonObject) {
		this.jsonObject = jsonObject;
		this.jsonObjectWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS jsonObjectInit() {
		if(!jsonObjectWrap.alreadyInitialized) {
			_jsonObject(jsonObjectWrap);
			if(jsonObject == null)
				setJsonObject(jsonObjectWrap.o);
		}
		jsonObjectWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	///////////////
	// solrQuery //
	///////////////

	/**	 The entity solrQuery
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected SolrQuery solrQuery;
	@JsonIgnore
	public Wrap<SolrQuery> solrQueryWrap = new Wrap<SolrQuery>().p(this).c(SolrQuery.class).var("solrQuery").o(solrQuery);

	/**	<br/> The entity solrQuery
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:solrQuery">Find the entity solrQuery in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _solrQuery(Wrap<SolrQuery> c);

	public SolrQuery getSolrQuery() {
		return solrQuery;
	}

	public void setSolrQuery(SolrQuery solrQuery) {
		this.solrQuery = solrQuery;
		this.solrQueryWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS solrQueryInit() {
		if(!solrQueryWrap.alreadyInitialized) {
			_solrQuery(solrQueryWrap);
			if(solrQuery == null)
				setSolrQuery(solrQueryWrap.o);
		}
		solrQueryWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	//////////////////////
	// operationRequest //
	//////////////////////

	/**	 The entity operationRequest
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected OperationRequest operationRequest;
	@JsonIgnore
	public Wrap<OperationRequest> operationRequestWrap = new Wrap<OperationRequest>().p(this).c(OperationRequest.class).var("operationRequest").o(operationRequest);

	/**	<br/> The entity operationRequest
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:operationRequest">Find the entity operationRequest in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _operationRequest(Wrap<OperationRequest> c);

	public OperationRequest getOperationRequest() {
		return operationRequest;
	}

	public void setOperationRequest(OperationRequest operationRequest) {
		this.operationRequest = operationRequest;
		this.operationRequestWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS operationRequestInit() {
		if(!operationRequestWrap.alreadyInitialized) {
			_operationRequest(operationRequestWrap);
			if(operationRequest == null)
				setOperationRequest(operationRequestWrap.o);
		}
		operationRequestWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	///////////////////
	// queryResponse //
	///////////////////

	/**	 The entity queryResponse
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected QueryResponse queryResponse;
	@JsonIgnore
	public Wrap<QueryResponse> queryResponseWrap = new Wrap<QueryResponse>().p(this).c(QueryResponse.class).var("queryResponse").o(queryResponse);

	/**	<br/> The entity queryResponse
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:queryResponse">Find the entity queryResponse in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _queryResponse(Wrap<QueryResponse> c);

	public QueryResponse getQueryResponse() {
		return queryResponse;
	}

	public void setQueryResponse(QueryResponse queryResponse) {
		this.queryResponse = queryResponse;
		this.queryResponseWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS queryResponseInit() {
		if(!queryResponseWrap.alreadyInitialized) {
			_queryResponse(queryResponseWrap);
			if(queryResponse == null)
				setQueryResponse(queryResponseWrap.o);
		}
		queryResponseWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	///////////////////
	// searchResults //
	///////////////////

	/**	 The entity searchResults
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected SolrDocumentList searchResults;
	@JsonIgnore
	public Wrap<SolrDocumentList> searchResultsWrap = new Wrap<SolrDocumentList>().p(this).c(SolrDocumentList.class).var("searchResults").o(searchResults);

	/**	<br/> The entity searchResults
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:searchResults">Find the entity searchResults in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchResults(Wrap<SolrDocumentList> c);

	public SolrDocumentList getSearchResults() {
		return searchResults;
	}

	public void setSearchResults(SolrDocumentList searchResults) {
		this.searchResults = searchResults;
		this.searchResultsWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS searchResultsInit() {
		if(!searchResultsWrap.alreadyInitialized) {
			_searchResults(searchResultsWrap);
			if(searchResults == null)
				setSearchResults(searchResultsWrap.o);
		}
		searchResultsWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	///////
	// w //
	///////

	/**	 The entity w
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected AllWriter w;
	@JsonIgnore
	public Wrap<AllWriter> wWrap = new Wrap<AllWriter>().p(this).c(AllWriter.class).var("w").o(w);

	/**	<br/> The entity w
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:w">Find the entity w in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _w(Wrap<AllWriter> c);

	public AllWriter getW() {
		return w;
	}

	public void setW(AllWriter w) {
		this.w = w;
		this.wWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS wInit() {
		if(!wWrap.alreadyInitialized) {
			_w(wWrap);
			if(w == null)
				setW(wWrap.o);
		}
		if(w != null)
			w.initDeepForClass(siteRequest_);
		wWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	///////////////
	// userVertx //
	///////////////

	/**	 The entity userVertx
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected JsonObject userVertx;
	@JsonIgnore
	public Wrap<JsonObject> userVertxWrap = new Wrap<JsonObject>().p(this).c(JsonObject.class).var("userVertx").o(userVertx);

	/**	<br/> The entity userVertx
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:userVertx">Find the entity userVertx in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userVertx(Wrap<JsonObject> c);

	public JsonObject getUserVertx() {
		return userVertx;
	}

	public void setUserVertx(JsonObject userVertx) {
		this.userVertx = userVertx;
		this.userVertxWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS userVertxInit() {
		if(!userVertxWrap.alreadyInitialized) {
			_userVertx(userVertxWrap);
			if(userVertx == null)
				setUserVertx(userVertxWrap.o);
		}
		userVertxWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	///////////////////
	// jsonPrincipal //
	///////////////////

	/**	 The entity jsonPrincipal
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected JsonObject jsonPrincipal;
	@JsonIgnore
	public Wrap<JsonObject> jsonPrincipalWrap = new Wrap<JsonObject>().p(this).c(JsonObject.class).var("jsonPrincipal").o(jsonPrincipal);

	/**	<br/> The entity jsonPrincipal
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:jsonPrincipal">Find the entity jsonPrincipal in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _jsonPrincipal(Wrap<JsonObject> c);

	public JsonObject getJsonPrincipal() {
		return jsonPrincipal;
	}

	public void setJsonPrincipal(JsonObject jsonPrincipal) {
		this.jsonPrincipal = jsonPrincipal;
		this.jsonPrincipalWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS jsonPrincipalInit() {
		if(!jsonPrincipalWrap.alreadyInitialized) {
			_jsonPrincipal(jsonPrincipalWrap);
			if(jsonPrincipal == null)
				setJsonPrincipal(jsonPrincipalWrap.o);
		}
		jsonPrincipalWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	////////////
	// userId //
	////////////

	/**	 The entity userId
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String userId;
	@JsonIgnore
	public Wrap<String> userIdWrap = new Wrap<String>().p(this).c(String.class).var("userId").o(userId);

	/**	<br/> The entity userId
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:userId">Find the entity userId in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userId(Wrap<String> c);

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		this.userIdWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS userIdInit() {
		if(!userIdWrap.alreadyInitialized) {
			_userId(userIdWrap);
			if(userId == null)
				setUserId(userIdWrap.o);
		}
		userIdWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	public String solrUserId() {
		return userId;
	}

	public String strUserId() {
		return userId == null ? "" : userId;
	}

	public String jsonUserId() {
		return userId == null ? "" : userId;
	}

	public String nomAffichageUserId() {
		return null;
	}

	public String htmTooltipUserId() {
		return null;
	}

	public String htmUserId() {
		return userId == null ? "" : StringEscapeUtils.escapeHtml4(strUserId());
	}

	/////////////
	// userKey //
	/////////////

	/**	 The entity userKey
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long userKey;
	@JsonIgnore
	public Wrap<Long> userKeyWrap = new Wrap<Long>().p(this).c(Long.class).var("userKey").o(userKey);

	/**	<br/> The entity userKey
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:userKey">Find the entity userKey in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userKey(Wrap<Long> c);

	public Long getUserKey() {
		return userKey;
	}

	public void setUserKey(Long userKey) {
		this.userKey = userKey;
		this.userKeyWrap.alreadyInitialized = true;
	}
	public SiteRequestEnUS setUserKey(String o) {
		if(NumberUtils.isParsable(o))
			this.userKey = Long.parseLong(o);
		this.userKeyWrap.alreadyInitialized = true;
		return (SiteRequestEnUS)this;
	}
	protected SiteRequestEnUS userKeyInit() {
		if(!userKeyWrap.alreadyInitialized) {
			_userKey(userKeyWrap);
			if(userKey == null)
				setUserKey(userKeyWrap.o);
		}
		userKeyWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	public Long solrUserKey() {
		return userKey;
	}

	public String strUserKey() {
		return userKey == null ? "" : userKey.toString();
	}

	public String jsonUserKey() {
		return userKey == null ? "" : userKey.toString();
	}

	public String nomAffichageUserKey() {
		return null;
	}

	public String htmTooltipUserKey() {
		return null;
	}

	public String htmUserKey() {
		return userKey == null ? "" : StringEscapeUtils.escapeHtml4(strUserKey());
	}

	///////////////
	// sessionId //
	///////////////

	/**	 The entity sessionId
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String sessionId;
	@JsonIgnore
	public Wrap<String> sessionIdWrap = new Wrap<String>().p(this).c(String.class).var("sessionId").o(sessionId);

	/**	<br/> The entity sessionId
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:sessionId">Find the entity sessionId in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sessionId(Wrap<String> c);

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		this.sessionIdWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS sessionIdInit() {
		if(!sessionIdWrap.alreadyInitialized) {
			_sessionId(sessionIdWrap);
			if(sessionId == null)
				setSessionId(sessionIdWrap.o);
		}
		sessionIdWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	public String solrSessionId() {
		return sessionId;
	}

	public String strSessionId() {
		return sessionId == null ? "" : sessionId;
	}

	public String jsonSessionId() {
		return sessionId == null ? "" : sessionId;
	}

	public String nomAffichageSessionId() {
		return null;
	}

	public String htmTooltipSessionId() {
		return null;
	}

	public String htmSessionId() {
		return sessionId == null ? "" : StringEscapeUtils.escapeHtml4(strSessionId());
	}

	/////////////////////
	// sessionIdBefore //
	/////////////////////

	/**	 The entity sessionIdBefore
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String sessionIdBefore;
	@JsonIgnore
	public Wrap<String> sessionIdBeforeWrap = new Wrap<String>().p(this).c(String.class).var("sessionIdBefore").o(sessionIdBefore);

	/**	<br/> The entity sessionIdBefore
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:sessionIdBefore">Find the entity sessionIdBefore in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sessionIdBefore(Wrap<String> c);

	public String getSessionIdBefore() {
		return sessionIdBefore;
	}

	public void setSessionIdBefore(String sessionIdBefore) {
		this.sessionIdBefore = sessionIdBefore;
		this.sessionIdBeforeWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS sessionIdBeforeInit() {
		if(!sessionIdBeforeWrap.alreadyInitialized) {
			_sessionIdBefore(sessionIdBeforeWrap);
			if(sessionIdBefore == null)
				setSessionIdBefore(sessionIdBeforeWrap.o);
		}
		sessionIdBeforeWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	public String solrSessionIdBefore() {
		return sessionIdBefore;
	}

	public String strSessionIdBefore() {
		return sessionIdBefore == null ? "" : sessionIdBefore;
	}

	public String jsonSessionIdBefore() {
		return sessionIdBefore == null ? "" : sessionIdBefore;
	}

	public String nomAffichageSessionIdBefore() {
		return null;
	}

	public String htmTooltipSessionIdBefore() {
		return null;
	}

	public String htmSessionIdBefore() {
		return sessionIdBefore == null ? "" : StringEscapeUtils.escapeHtml4(strSessionIdBefore());
	}

	//////////////
	// userName //
	//////////////

	/**	 The entity userName
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String userName;
	@JsonIgnore
	public Wrap<String> userNameWrap = new Wrap<String>().p(this).c(String.class).var("userName").o(userName);

	/**	<br/> The entity userName
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:userName">Find the entity userName in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userName(Wrap<String> c);

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		this.userNameWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS userNameInit() {
		if(!userNameWrap.alreadyInitialized) {
			_userName(userNameWrap);
			if(userName == null)
				setUserName(userNameWrap.o);
		}
		userNameWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	public String solrUserName() {
		return userName;
	}

	public String strUserName() {
		return userName == null ? "" : userName;
	}

	public String jsonUserName() {
		return userName == null ? "" : userName;
	}

	public String nomAffichageUserName() {
		return null;
	}

	public String htmTooltipUserName() {
		return null;
	}

	public String htmUserName() {
		return userName == null ? "" : StringEscapeUtils.escapeHtml4(strUserName());
	}

	//////////////////
	// userLastName //
	//////////////////

	/**	 The entity userLastName
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String userLastName;
	@JsonIgnore
	public Wrap<String> userLastNameWrap = new Wrap<String>().p(this).c(String.class).var("userLastName").o(userLastName);

	/**	<br/> The entity userLastName
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:userLastName">Find the entity userLastName in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userLastName(Wrap<String> c);

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
		this.userLastNameWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS userLastNameInit() {
		if(!userLastNameWrap.alreadyInitialized) {
			_userLastName(userLastNameWrap);
			if(userLastName == null)
				setUserLastName(userLastNameWrap.o);
		}
		userLastNameWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	public String solrUserLastName() {
		return userLastName;
	}

	public String strUserLastName() {
		return userLastName == null ? "" : userLastName;
	}

	public String jsonUserLastName() {
		return userLastName == null ? "" : userLastName;
	}

	public String nomAffichageUserLastName() {
		return null;
	}

	public String htmTooltipUserLastName() {
		return null;
	}

	public String htmUserLastName() {
		return userLastName == null ? "" : StringEscapeUtils.escapeHtml4(strUserLastName());
	}

	///////////////////
	// userFirstName //
	///////////////////

	/**	 The entity userFirstName
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String userFirstName;
	@JsonIgnore
	public Wrap<String> userFirstNameWrap = new Wrap<String>().p(this).c(String.class).var("userFirstName").o(userFirstName);

	/**	<br/> The entity userFirstName
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:userFirstName">Find the entity userFirstName in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userFirstName(Wrap<String> c);

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
		this.userFirstNameWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS userFirstNameInit() {
		if(!userFirstNameWrap.alreadyInitialized) {
			_userFirstName(userFirstNameWrap);
			if(userFirstName == null)
				setUserFirstName(userFirstNameWrap.o);
		}
		userFirstNameWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	public String solrUserFirstName() {
		return userFirstName;
	}

	public String strUserFirstName() {
		return userFirstName == null ? "" : userFirstName;
	}

	public String jsonUserFirstName() {
		return userFirstName == null ? "" : userFirstName;
	}

	public String nomAffichageUserFirstName() {
		return null;
	}

	public String htmTooltipUserFirstName() {
		return null;
	}

	public String htmUserFirstName() {
		return userFirstName == null ? "" : StringEscapeUtils.escapeHtml4(strUserFirstName());
	}

	//////////////////
	// userFullName //
	//////////////////

	/**	 The entity userFullName
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String userFullName;
	@JsonIgnore
	public Wrap<String> userFullNameWrap = new Wrap<String>().p(this).c(String.class).var("userFullName").o(userFullName);

	/**	<br/> The entity userFullName
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:userFullName">Find the entity userFullName in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userFullName(Wrap<String> c);

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
		this.userFullNameWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS userFullNameInit() {
		if(!userFullNameWrap.alreadyInitialized) {
			_userFullName(userFullNameWrap);
			if(userFullName == null)
				setUserFullName(userFullNameWrap.o);
		}
		userFullNameWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	public String solrUserFullName() {
		return userFullName;
	}

	public String strUserFullName() {
		return userFullName == null ? "" : userFullName;
	}

	public String jsonUserFullName() {
		return userFullName == null ? "" : userFullName;
	}

	public String nomAffichageUserFullName() {
		return null;
	}

	public String htmTooltipUserFullName() {
		return null;
	}

	public String htmUserFullName() {
		return userFullName == null ? "" : StringEscapeUtils.escapeHtml4(strUserFullName());
	}

	////////////////////
	// userRealmRoles //
	////////////////////

	/**	 The entity userRealmRoles
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	@JsonInclude(Include.NON_NULL)
	protected List<String> userRealmRoles = new ArrayList<String>();
	@JsonIgnore
	public Wrap<List<String>> userRealmRolesWrap = new Wrap<List<String>>().p(this).c(List.class).var("userRealmRoles").o(userRealmRoles);

	/**	<br/> The entity userRealmRoles
	 *  It is constructed before being initialized with the constructor by default List<String>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:userRealmRoles">Find the entity userRealmRoles in Solr</a>
	 * <br/>
	 * @param userRealmRoles is the entity already constructed. 
	 **/
	protected abstract void _userRealmRoles(List<String> o);

	public List<String> getUserRealmRoles() {
		return userRealmRoles;
	}

	public void setUserRealmRoles(List<String> userRealmRoles) {
		this.userRealmRoles = userRealmRoles;
		this.userRealmRolesWrap.alreadyInitialized = true;
	}
	public SiteRequestEnUS addUserRealmRoles(String...objets) {
		for(String o : objets) {
			addUserRealmRoles(o);
		}
		return (SiteRequestEnUS)this;
	}
	public SiteRequestEnUS addUserRealmRoles(String o) {
		if(o != null && !userRealmRoles.contains(o))
			this.userRealmRoles.add(o);
		return (SiteRequestEnUS)this;
	}
	public SiteRequestEnUS setUserRealmRoles(JsonArray objets) {
		userRealmRoles.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addUserRealmRoles(o);
		}
		return (SiteRequestEnUS)this;
	}
	protected SiteRequestEnUS userRealmRolesInit() {
		if(!userRealmRolesWrap.alreadyInitialized) {
			_userRealmRoles(userRealmRoles);
		}
		userRealmRolesWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	public List<String> solrUserRealmRoles() {
		return userRealmRoles;
	}

	public String strUserRealmRoles() {
		return userRealmRoles == null ? "" : userRealmRoles.toString();
	}

	public String jsonUserRealmRoles() {
		return userRealmRoles == null ? "" : userRealmRoles.toString();
	}

	public String nomAffichageUserRealmRoles() {
		return null;
	}

	public String htmTooltipUserRealmRoles() {
		return null;
	}

	public String htmUserRealmRoles() {
		return userRealmRoles == null ? "" : StringEscapeUtils.escapeHtml4(strUserRealmRoles());
	}

	//////////////////
	// userResource //
	//////////////////

	/**	 The entity userResource
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected JsonObject userResource;
	@JsonIgnore
	public Wrap<JsonObject> userResourceWrap = new Wrap<JsonObject>().p(this).c(JsonObject.class).var("userResource").o(userResource);

	/**	<br/> The entity userResource
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:userResource">Find the entity userResource in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _userResource(Wrap<JsonObject> c);

	public JsonObject getUserResource() {
		return userResource;
	}

	public void setUserResource(JsonObject userResource) {
		this.userResource = userResource;
		this.userResourceWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS userResourceInit() {
		if(!userResourceWrap.alreadyInitialized) {
			_userResource(userResourceWrap);
			if(userResource == null)
				setUserResource(userResourceWrap.o);
		}
		userResourceWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	///////////////////////
	// userResourceRoles //
	///////////////////////

	/**	 The entity userResourceRoles
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	@JsonInclude(Include.NON_NULL)
	protected List<String> userResourceRoles = new ArrayList<String>();
	@JsonIgnore
	public Wrap<List<String>> userResourceRolesWrap = new Wrap<List<String>>().p(this).c(List.class).var("userResourceRoles").o(userResourceRoles);

	/**	<br/> The entity userResourceRoles
	 *  It is constructed before being initialized with the constructor by default List<String>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:userResourceRoles">Find the entity userResourceRoles in Solr</a>
	 * <br/>
	 * @param userResourceRoles is the entity already constructed. 
	 **/
	protected abstract void _userResourceRoles(List<String> o);

	public List<String> getUserResourceRoles() {
		return userResourceRoles;
	}

	public void setUserResourceRoles(List<String> userResourceRoles) {
		this.userResourceRoles = userResourceRoles;
		this.userResourceRolesWrap.alreadyInitialized = true;
	}
	public SiteRequestEnUS addUserResourceRoles(String...objets) {
		for(String o : objets) {
			addUserResourceRoles(o);
		}
		return (SiteRequestEnUS)this;
	}
	public SiteRequestEnUS addUserResourceRoles(String o) {
		if(o != null && !userResourceRoles.contains(o))
			this.userResourceRoles.add(o);
		return (SiteRequestEnUS)this;
	}
	public SiteRequestEnUS setUserResourceRoles(JsonArray objets) {
		userResourceRoles.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addUserResourceRoles(o);
		}
		return (SiteRequestEnUS)this;
	}
	protected SiteRequestEnUS userResourceRolesInit() {
		if(!userResourceRolesWrap.alreadyInitialized) {
			_userResourceRoles(userResourceRoles);
		}
		userResourceRolesWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	public List<String> solrUserResourceRoles() {
		return userResourceRoles;
	}

	public String strUserResourceRoles() {
		return userResourceRoles == null ? "" : userResourceRoles.toString();
	}

	public String jsonUserResourceRoles() {
		return userResourceRoles == null ? "" : userResourceRoles.toString();
	}

	public String nomAffichageUserResourceRoles() {
		return null;
	}

	public String htmTooltipUserResourceRoles() {
		return null;
	}

	public String htmUserResourceRoles() {
		return userResourceRoles == null ? "" : StringEscapeUtils.escapeHtml4(strUserResourceRoles());
	}

	//////////////
	// siteUser //
	//////////////

	/**	 The entity siteUser
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected SiteUser siteUser;
	@JsonIgnore
	public Wrap<SiteUser> siteUserWrap = new Wrap<SiteUser>().p(this).c(SiteUser.class).var("siteUser").o(siteUser);

	/**	<br/> The entity siteUser
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:siteUser">Find the entity siteUser in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteUser(Wrap<SiteUser> c);

	public SiteUser getSiteUser() {
		return siteUser;
	}

	public void setSiteUser(SiteUser siteUser) {
		this.siteUser = siteUser;
		this.siteUserWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS siteUserInit() {
		if(!siteUserWrap.alreadyInitialized) {
			_siteUser(siteUserWrap);
			if(siteUser == null)
				setSiteUser(siteUserWrap.o);
		}
		if(siteUser != null)
			siteUser.initDeepForClass(siteRequest_);
		siteUserWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	//////////////
	// xmlStack //
	//////////////

	/**	 The entity xmlStack
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Stack<String>(). 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Stack<String> xmlStack = new Stack<String>();
	@JsonIgnore
	public Wrap<Stack<String>> xmlStackWrap = new Wrap<Stack<String>>().p(this).c(Stack.class).var("xmlStack").o(xmlStack);

	/**	<br/> The entity xmlStack
	 *  It is constructed before being initialized with the constructor by default Stack<String>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:xmlStack">Find the entity xmlStack in Solr</a>
	 * <br/>
	 * @param xmlStack is the entity already constructed. 
	 **/
	protected abstract void _xmlStack(Stack<String> o);

	public Stack<String> getXmlStack() {
		return xmlStack;
	}

	public void setXmlStack(Stack<String> xmlStack) {
		this.xmlStack = xmlStack;
		this.xmlStackWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS xmlStackInit() {
		if(!xmlStackWrap.alreadyInitialized) {
			_xmlStack(xmlStack);
		}
		xmlStackWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	//////////////////
	// solrDocument //
	//////////////////

	/**	 The entity solrDocument
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected SolrDocument solrDocument;
	@JsonIgnore
	public Wrap<SolrDocument> solrDocumentWrap = new Wrap<SolrDocument>().p(this).c(SolrDocument.class).var("solrDocument").o(solrDocument);

	/**	<br/> The entity solrDocument
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:solrDocument">Find the entity solrDocument in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _solrDocument(Wrap<SolrDocument> c);

	public SolrDocument getSolrDocument() {
		return solrDocument;
	}

	public void setSolrDocument(SolrDocument solrDocument) {
		this.solrDocument = solrDocument;
		this.solrDocumentWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS solrDocumentInit() {
		if(!solrDocumentWrap.alreadyInitialized) {
			_solrDocument(solrDocumentWrap);
			if(solrDocument == null)
				setSolrDocument(solrDocumentWrap.o);
		}
		solrDocumentWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	///////////////
	// pageAdmin //
	///////////////

	/**	 The entity pageAdmin
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Boolean pageAdmin;
	@JsonIgnore
	public Wrap<Boolean> pageAdminWrap = new Wrap<Boolean>().p(this).c(Boolean.class).var("pageAdmin").o(pageAdmin);

	/**	<br/> The entity pageAdmin
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageAdmin">Find the entity pageAdmin in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageAdmin(Wrap<Boolean> c);

	public Boolean getPageAdmin() {
		return pageAdmin;
	}

	public void setPageAdmin(Boolean pageAdmin) {
		this.pageAdmin = pageAdmin;
		this.pageAdminWrap.alreadyInitialized = true;
	}
	public SiteRequestEnUS setPageAdmin(String o) {
		this.pageAdmin = Boolean.parseBoolean(o);
		this.pageAdminWrap.alreadyInitialized = true;
		return (SiteRequestEnUS)this;
	}
	protected SiteRequestEnUS pageAdminInit() {
		if(!pageAdminWrap.alreadyInitialized) {
			_pageAdmin(pageAdminWrap);
			if(pageAdmin == null)
				setPageAdmin(pageAdminWrap.o);
		}
		pageAdminWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	public Boolean solrPageAdmin() {
		return pageAdmin;
	}

	public String strPageAdmin() {
		return pageAdmin == null ? "" : pageAdmin.toString();
	}

	public String jsonPageAdmin() {
		return pageAdmin == null ? "" : pageAdmin.toString();
	}

	public String nomAffichagePageAdmin() {
		return null;
	}

	public String htmTooltipPageAdmin() {
		return null;
	}

	public String htmPageAdmin() {
		return pageAdmin == null ? "" : StringEscapeUtils.escapeHtml4(strPageAdmin());
	}

	///////////////
	// requestPk //
	///////////////

	/**	 The entity requestPk
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long requestPk;
	@JsonIgnore
	public Wrap<Long> requestPkWrap = new Wrap<Long>().p(this).c(Long.class).var("requestPk").o(requestPk);

	/**	<br/> The entity requestPk
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:requestPk">Find the entity requestPk in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _requestPk(Wrap<Long> c);

	public Long getRequestPk() {
		return requestPk;
	}

	public void setRequestPk(Long requestPk) {
		this.requestPk = requestPk;
		this.requestPkWrap.alreadyInitialized = true;
	}
	public SiteRequestEnUS setRequestPk(String o) {
		if(NumberUtils.isParsable(o))
			this.requestPk = Long.parseLong(o);
		this.requestPkWrap.alreadyInitialized = true;
		return (SiteRequestEnUS)this;
	}
	protected SiteRequestEnUS requestPkInit() {
		if(!requestPkWrap.alreadyInitialized) {
			_requestPk(requestPkWrap);
			if(requestPk == null)
				setRequestPk(requestPkWrap.o);
		}
		requestPkWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	public Long solrRequestPk() {
		return requestPk;
	}

	public String strRequestPk() {
		return requestPk == null ? "" : requestPk.toString();
	}

	public String jsonRequestPk() {
		return requestPk == null ? "" : requestPk.toString();
	}

	public String nomAffichageRequestPk() {
		return null;
	}

	public String htmTooltipRequestPk() {
		return null;
	}

	public String htmRequestPk() {
		return requestPk == null ? "" : StringEscapeUtils.escapeHtml4(strRequestPk());
	}

	////////////////
	// requestUri //
	////////////////

	/**	 The entity requestUri
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String requestUri;
	@JsonIgnore
	public Wrap<String> requestUriWrap = new Wrap<String>().p(this).c(String.class).var("requestUri").o(requestUri);

	/**	<br/> The entity requestUri
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:requestUri">Find the entity requestUri in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _requestUri(Wrap<String> c);

	public String getRequestUri() {
		return requestUri;
	}

	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
		this.requestUriWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS requestUriInit() {
		if(!requestUriWrap.alreadyInitialized) {
			_requestUri(requestUriWrap);
			if(requestUri == null)
				setRequestUri(requestUriWrap.o);
		}
		requestUriWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	public String solrRequestUri() {
		return requestUri;
	}

	public String strRequestUri() {
		return requestUri == null ? "" : requestUri;
	}

	public String jsonRequestUri() {
		return requestUri == null ? "" : requestUri;
	}

	public String nomAffichageRequestUri() {
		return null;
	}

	public String htmTooltipRequestUri() {
		return null;
	}

	public String htmRequestUri() {
		return requestUri == null ? "" : StringEscapeUtils.escapeHtml4(strRequestUri());
	}

	///////////////////
	// requestMethod //
	///////////////////

	/**	 The entity requestMethod
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String requestMethod;
	@JsonIgnore
	public Wrap<String> requestMethodWrap = new Wrap<String>().p(this).c(String.class).var("requestMethod").o(requestMethod);

	/**	<br/> The entity requestMethod
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:requestMethod">Find the entity requestMethod in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _requestMethod(Wrap<String> c);

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
		this.requestMethodWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS requestMethodInit() {
		if(!requestMethodWrap.alreadyInitialized) {
			_requestMethod(requestMethodWrap);
			if(requestMethod == null)
				setRequestMethod(requestMethodWrap.o);
		}
		requestMethodWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	public String solrRequestMethod() {
		return requestMethod;
	}

	public String strRequestMethod() {
		return requestMethod == null ? "" : requestMethod;
	}

	public String jsonRequestMethod() {
		return requestMethod == null ? "" : requestMethod;
	}

	public String nomAffichageRequestMethod() {
		return null;
	}

	public String htmTooltipRequestMethod() {
		return null;
	}

	public String htmRequestMethod() {
		return requestMethod == null ? "" : StringEscapeUtils.escapeHtml4(strRequestMethod());
	}

	////////
	// tx //
	////////

	/**	 The entity tx
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Transaction tx;
	@JsonIgnore
	public Wrap<Transaction> txWrap = new Wrap<Transaction>().p(this).c(Transaction.class).var("tx").o(tx);

	/**	<br/> The entity tx
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:tx">Find the entity tx in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _tx(Wrap<Transaction> c);

	public Transaction getTx() {
		return tx;
	}

	public void setTx(Transaction tx) {
		this.tx = tx;
		this.txWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS txInit() {
		if(!txWrap.alreadyInitialized) {
			_tx(txWrap);
			if(tx == null)
				setTx(txWrap.o);
		}
		txWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	///////////////////
	// sqlConnection //
	///////////////////

	/**	 The entity sqlConnection
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected SqlConnection sqlConnection;
	@JsonIgnore
	public Wrap<SqlConnection> sqlConnectionWrap = new Wrap<SqlConnection>().p(this).c(SqlConnection.class).var("sqlConnection").o(sqlConnection);

	/**	<br/> The entity sqlConnection
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:sqlConnection">Find the entity sqlConnection in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _sqlConnection(Wrap<SqlConnection> c);

	public SqlConnection getSqlConnection() {
		return sqlConnection;
	}

	public void setSqlConnection(SqlConnection sqlConnection) {
		this.sqlConnection = sqlConnection;
		this.sqlConnectionWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS sqlConnectionInit() {
		if(!sqlConnectionWrap.alreadyInitialized) {
			_sqlConnection(sqlConnectionWrap);
			if(sqlConnection == null)
				setSqlConnection(sqlConnectionWrap.o);
		}
		sqlConnectionWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	////////////////////
	// requestHeaders //
	////////////////////

	/**	 The entity requestHeaders
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected CaseInsensitiveHeaders requestHeaders;
	@JsonIgnore
	public Wrap<CaseInsensitiveHeaders> requestHeadersWrap = new Wrap<CaseInsensitiveHeaders>().p(this).c(CaseInsensitiveHeaders.class).var("requestHeaders").o(requestHeaders);

	/**	<br/> The entity requestHeaders
	 *  is defined as null before being initialized. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:requestHeaders">Find the entity requestHeaders in Solr</a>
	 * <br/>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _requestHeaders(Wrap<CaseInsensitiveHeaders> c);

	public CaseInsensitiveHeaders getRequestHeaders() {
		return requestHeaders;
	}

	public void setRequestHeaders(CaseInsensitiveHeaders requestHeaders) {
		this.requestHeaders = requestHeaders;
		this.requestHeadersWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS requestHeadersInit() {
		if(!requestHeadersWrap.alreadyInitialized) {
			_requestHeaders(requestHeadersWrap);
			if(requestHeaders == null)
				setRequestHeaders(requestHeadersWrap.o);
		}
		requestHeadersWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	/////////////////
	// requestVars //
	/////////////////

	/**	 The entity requestVars
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Map<String, String>(). 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Map<String, String> requestVars = new HashMap<String, String>();
	@JsonIgnore
	public Wrap<Map<String, String>> requestVarsWrap = new Wrap<Map<String, String>>().p(this).c(Map.class).var("requestVars").o(requestVars);

	/**	<br/> The entity requestVars
	 *  It is constructed before being initialized with the constructor by default Map<String, String>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.request.SiteRequestEnUS&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:requestVars">Find the entity requestVars in Solr</a>
	 * <br/>
	 * @param requestVars is the entity already constructed. 
	 **/
	protected abstract void _requestVars(Map<String, String> m);

	public Map<String, String> getRequestVars() {
		return requestVars;
	}

	public void setRequestVars(Map<String, String> requestVars) {
		this.requestVars = requestVars;
		this.requestVarsWrap.alreadyInitialized = true;
	}
	protected SiteRequestEnUS requestVarsInit() {
		if(!requestVarsWrap.alreadyInitialized) {
			_requestVars(requestVars);
		}
		requestVarsWrap.alreadyInitialized(true);
		return (SiteRequestEnUS)this;
	}

	//////////////
	// initDeep //
	//////////////

	protected boolean alreadyInitializedSiteRequestEnUS = false;

	public SiteRequestEnUS initDeepSiteRequestEnUS(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		if(!alreadyInitializedSiteRequestEnUS) {
			alreadyInitializedSiteRequestEnUS = true;
			initDeepSiteRequestEnUS();
		}
		return (SiteRequestEnUS)this;
	}

	public void initDeepSiteRequestEnUS() {
		initSiteRequestEnUS();
	}

	public void initSiteRequestEnUS() {
		siteContext_Init();
		siteConfig_Init();
		siteRequest_Init();
		apiRequest_Init();
		vertxInit();
		jsonObjectInit();
		solrQueryInit();
		operationRequestInit();
		queryResponseInit();
		searchResultsInit();
		wInit();
		userVertxInit();
		jsonPrincipalInit();
		userIdInit();
		userKeyInit();
		sessionIdInit();
		sessionIdBeforeInit();
		userNameInit();
		userLastNameInit();
		userFirstNameInit();
		userFullNameInit();
		userRealmRolesInit();
		userResourceInit();
		userResourceRolesInit();
		siteUserInit();
		xmlStackInit();
		solrDocumentInit();
		pageAdminInit();
		requestPkInit();
		requestUriInit();
		requestMethodInit();
		txInit();
		sqlConnectionInit();
		requestHeadersInit();
		requestVarsInit();
	}

	public void initDeepForClass(SiteRequestEnUS siteRequest_) {
		initDeepSiteRequestEnUS(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSiteRequestEnUS(SiteRequestEnUS siteRequest_) {
		if(w != null)
			w.setSiteRequest_(siteRequest_);
		if(siteUser != null)
			siteUser.setSiteRequest_(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSiteRequestEnUS(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSiteRequestEnUS(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtainForClass(v);
			}
		}
		return o;
	}
	public Object obtainSiteRequestEnUS(String var) {
		SiteRequestEnUS oSiteRequestEnUS = (SiteRequestEnUS)this;
		switch(var) {
			case "siteContext_":
				return oSiteRequestEnUS.siteContext_;
			case "siteConfig_":
				return oSiteRequestEnUS.siteConfig_;
			case "siteRequest_":
				return oSiteRequestEnUS.siteRequest_;
			case "apiRequest_":
				return oSiteRequestEnUS.apiRequest_;
			case "vertx":
				return oSiteRequestEnUS.vertx;
			case "jsonObject":
				return oSiteRequestEnUS.jsonObject;
			case "solrQuery":
				return oSiteRequestEnUS.solrQuery;
			case "operationRequest":
				return oSiteRequestEnUS.operationRequest;
			case "queryResponse":
				return oSiteRequestEnUS.queryResponse;
			case "searchResults":
				return oSiteRequestEnUS.searchResults;
			case "w":
				return oSiteRequestEnUS.w;
			case "userVertx":
				return oSiteRequestEnUS.userVertx;
			case "jsonPrincipal":
				return oSiteRequestEnUS.jsonPrincipal;
			case "userId":
				return oSiteRequestEnUS.userId;
			case "userKey":
				return oSiteRequestEnUS.userKey;
			case "sessionId":
				return oSiteRequestEnUS.sessionId;
			case "sessionIdBefore":
				return oSiteRequestEnUS.sessionIdBefore;
			case "userName":
				return oSiteRequestEnUS.userName;
			case "userLastName":
				return oSiteRequestEnUS.userLastName;
			case "userFirstName":
				return oSiteRequestEnUS.userFirstName;
			case "userFullName":
				return oSiteRequestEnUS.userFullName;
			case "userRealmRoles":
				return oSiteRequestEnUS.userRealmRoles;
			case "userResource":
				return oSiteRequestEnUS.userResource;
			case "userResourceRoles":
				return oSiteRequestEnUS.userResourceRoles;
			case "siteUser":
				return oSiteRequestEnUS.siteUser;
			case "xmlStack":
				return oSiteRequestEnUS.xmlStack;
			case "solrDocument":
				return oSiteRequestEnUS.solrDocument;
			case "pageAdmin":
				return oSiteRequestEnUS.pageAdmin;
			case "requestPk":
				return oSiteRequestEnUS.requestPk;
			case "requestUri":
				return oSiteRequestEnUS.requestUri;
			case "requestMethod":
				return oSiteRequestEnUS.requestMethod;
			case "tx":
				return oSiteRequestEnUS.tx;
			case "sqlConnection":
				return oSiteRequestEnUS.sqlConnection;
			case "requestHeaders":
				return oSiteRequestEnUS.requestHeaders;
			case "requestVars":
				return oSiteRequestEnUS.requestVars;
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
				o = attributeSiteRequestEnUS(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attributeForClass(v, val);
			}
		}
		return o != null;
	}
	public Object attributeSiteRequestEnUS(String var, Object val) {
		SiteRequestEnUS oSiteRequestEnUS = (SiteRequestEnUS)this;
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
					o = defineSiteRequestEnUS(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.defineForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object defineSiteRequestEnUS(String var, String val) {
		switch(var) {
			default:
				return null;
		}
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestSiteRequestEnUS() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(SiteRequestEnUS::getApiRequest_).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof SiteRequestEnUS) {
			SiteRequestEnUS original = (SiteRequestEnUS)o;
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
		if(!(o instanceof SiteRequestEnUS))
			return false;
		SiteRequestEnUS that = (SiteRequestEnUS)o;
		return true;
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("SiteRequestEnUS { ");
		sb.append(" }");
		return sb.toString();
	}
}
