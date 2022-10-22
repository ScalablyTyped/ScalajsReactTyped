package typingsJapgolly.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFirebaseAppsResponse extends StObject {
  
  /** One page of results from a call to `SearchFirebaseApps`. */
  var apps: js.UndefOr[js.Array[FirebaseAppInfo]] = js.undefined
  
  /**
    * If the result list is too large to fit in a single response, then a token is returned. This token can be used in a subsequent calls to `SearchFirebaseApps` to find the next group of
    * Apps. Page tokens are short-lived and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SearchFirebaseAppsResponse {
  
  inline def apply(): SearchFirebaseAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFirebaseAppsResponse]
  }
  
  extension [Self <: SearchFirebaseAppsResponse](x: Self) {
    
    inline def setApps(value: js.Array[FirebaseAppInfo]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: FirebaseAppInfo*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
