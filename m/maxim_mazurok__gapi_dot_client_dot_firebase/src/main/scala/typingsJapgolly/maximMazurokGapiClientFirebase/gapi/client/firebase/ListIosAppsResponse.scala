package typingsJapgolly.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIosAppsResponse extends StObject {
  
  /** List of each `IosApp` associated with the specified `FirebaseProject`. */
  var apps: js.UndefOr[js.Array[IosApp]] = js.undefined
  
  /**
    * If the result list is too large to fit in a single response, then a token is returned. If the string is empty, then this response is the last page of results. This token can be used
    * in a subsequent call to `ListIosApps` to find the next group of Apps. Page tokens are short-lived and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListIosAppsResponse {
  
  inline def apply(): ListIosAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIosAppsResponse]
  }
  
  extension [Self <: ListIosAppsResponse](x: Self) {
    
    inline def setApps(value: js.Array[IosApp]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: IosApp*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
