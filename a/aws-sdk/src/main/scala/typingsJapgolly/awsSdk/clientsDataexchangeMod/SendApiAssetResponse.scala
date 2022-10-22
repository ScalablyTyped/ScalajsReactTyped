package typingsJapgolly.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendApiAssetResponse extends StObject {
  
  /**
    * The response body from the underlying API tracked by the API asset.
    */
  var Body: js.UndefOr[string] = js.undefined
  
  /**
    * The response headers from the underlying API tracked by the API asset.
    */
  var ResponseHeaders: js.UndefOr[MapOfString] = js.undefined
}
object SendApiAssetResponse {
  
  inline def apply(): SendApiAssetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendApiAssetResponse]
  }
  
  extension [Self <: SendApiAssetResponse](x: Self) {
    
    inline def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setResponseHeaders(value: MapOfString): Self = StObject.set(x, "ResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersUndefined: Self = StObject.set(x, "ResponseHeaders", js.undefined)
  }
}
