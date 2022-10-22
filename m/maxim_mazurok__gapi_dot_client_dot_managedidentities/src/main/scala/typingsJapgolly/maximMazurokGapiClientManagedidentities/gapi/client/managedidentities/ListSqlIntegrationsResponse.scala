package typingsJapgolly.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSqlIntegrationsResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of SQLIntegrations of a domain. */
  var sqlIntegrations: js.UndefOr[js.Array[SqlIntegration]] = js.undefined
  
  /** A list of locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListSqlIntegrationsResponse {
  
  inline def apply(): ListSqlIntegrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSqlIntegrationsResponse]
  }
  
  extension [Self <: ListSqlIntegrationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSqlIntegrations(value: js.Array[SqlIntegration]): Self = StObject.set(x, "sqlIntegrations", value.asInstanceOf[js.Any])
    
    inline def setSqlIntegrationsUndefined: Self = StObject.set(x, "sqlIntegrations", js.undefined)
    
    inline def setSqlIntegrationsVarargs(value: SqlIntegration*): Self = StObject.set(x, "sqlIntegrations", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
