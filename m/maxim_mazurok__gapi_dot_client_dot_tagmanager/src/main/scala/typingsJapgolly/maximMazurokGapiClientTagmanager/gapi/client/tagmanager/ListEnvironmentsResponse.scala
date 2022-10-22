package typingsJapgolly.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentsResponse extends StObject {
  
  /** All Environments of a GTM Container. */
  var environment: js.UndefOr[js.Array[Environment]] = js.undefined
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListEnvironmentsResponse {
  
  inline def apply(): ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsResponse]
  }
  
  extension [Self <: ListEnvironmentsResponse](x: Self) {
    
    inline def setEnvironment(value: js.Array[Environment]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setEnvironmentVarargs(value: Environment*): Self = StObject.set(x, "environment", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
