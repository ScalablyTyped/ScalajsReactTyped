package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyUrl extends StObject {
  
  /** The type of interaction needs to be tracked by the tracking URL */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Tracking URL used to track the interaction. Provide a URL with optional path or query string, beginning with `https:`. For example, https://www.example.com/path */
  var url: js.UndefOr[String] = js.undefined
}
object ThirdPartyUrl {
  
  inline def apply(): ThirdPartyUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyUrl]
  }
  
  extension [Self <: ThirdPartyUrl](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
