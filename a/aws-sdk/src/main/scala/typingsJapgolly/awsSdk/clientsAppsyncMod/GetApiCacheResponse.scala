package typingsJapgolly.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApiCacheResponse extends StObject {
  
  /**
    * The ApiCache object.
    */
  var apiCache: js.UndefOr[ApiCache] = js.undefined
}
object GetApiCacheResponse {
  
  inline def apply(): GetApiCacheResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApiCacheResponse]
  }
  
  extension [Self <: GetApiCacheResponse](x: Self) {
    
    inline def setApiCache(value: ApiCache): Self = StObject.set(x, "apiCache", value.asInstanceOf[js.Any])
    
    inline def setApiCacheUndefined: Self = StObject.set(x, "apiCache", js.undefined)
  }
}
