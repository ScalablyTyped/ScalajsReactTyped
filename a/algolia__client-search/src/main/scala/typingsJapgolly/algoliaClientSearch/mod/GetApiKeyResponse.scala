package typingsJapgolly.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApiKeyResponse extends StObject {
  
  /**
    * List of permissions the key contains.
    */
  var acl: js.Array[ApiKeyACLType]
  
  /**
    * Date of creation (Unix timestamp).
    */
  var createdAt: Double
  
  /**
    * Specify a description of the API key. Used for informative purposes only. It has impact on the functionality of the API key.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the list of targeted indices. You can target all indices starting with a prefix or ending with a suffix using the ‘*’ character.
    */
  var indexes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specify the maximum number of hits this API key can retrieve in one call.
    * This parameter can be used to protect you from attempts at retrieving your entire index contents by massively querying the index.
    */
  var maxHitsPerQuery: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify the maximum number of API calls allowed from an IP address per hour. Each time an API call is performed with this key, a check is performed.
    */
  var maxQueriesPerIPPerHour: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify the list of query parameters. You can force the query parameters for a query using the url string format.
    */
  var queryParameters: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the list of referers. You can target all referers starting with a prefix, ending with a suffix using the ‘*’ character.
    */
  var referers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * IPv4 network allowed to use the generated key.
    * This is used for more protection against API key leaking and reuse.
    * Note that you can only provide a single source, but you can specify a range of IPs (e.g., 192.168.1.0/24).
    */
  var restrictSources: js.UndefOr[String] = js.undefined
  
  /**
    * A Unix timestamp used to define the expiration date of the API key.
    */
  var validity: Double
  
  /**
    * The api key value
    */
  var value: String
}
object GetApiKeyResponse {
  
  inline def apply(acl: js.Array[ApiKeyACLType], createdAt: Double, validity: Double, value: String): GetApiKeyResponse = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiKeyResponse]
  }
  
  extension [Self <: GetApiKeyResponse](x: Self) {
    
    inline def setAcl(value: js.Array[ApiKeyACLType]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclVarargs(value: ApiKeyACLType*): Self = StObject.set(x, "acl", js.Array(value*))
    
    inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIndexes(value: js.Array[String]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: String*): Self = StObject.set(x, "indexes", js.Array(value*))
    
    inline def setMaxHitsPerQuery(value: Double): Self = StObject.set(x, "maxHitsPerQuery", value.asInstanceOf[js.Any])
    
    inline def setMaxHitsPerQueryUndefined: Self = StObject.set(x, "maxHitsPerQuery", js.undefined)
    
    inline def setMaxQueriesPerIPPerHour(value: Double): Self = StObject.set(x, "maxQueriesPerIPPerHour", value.asInstanceOf[js.Any])
    
    inline def setMaxQueriesPerIPPerHourUndefined: Self = StObject.set(x, "maxQueriesPerIPPerHour", js.undefined)
    
    inline def setQueryParameters(value: String): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    inline def setReferers(value: js.Array[String]): Self = StObject.set(x, "referers", value.asInstanceOf[js.Any])
    
    inline def setReferersUndefined: Self = StObject.set(x, "referers", js.undefined)
    
    inline def setReferersVarargs(value: String*): Self = StObject.set(x, "referers", js.Array(value*))
    
    inline def setRestrictSources(value: String): Self = StObject.set(x, "restrictSources", value.asInstanceOf[js.Any])
    
    inline def setRestrictSourcesUndefined: Self = StObject.set(x, "restrictSources", js.undefined)
    
    inline def setValidity(value: Double): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
