package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAppsurl extends StObject {
  
  var content: ApplicationjsonAppsurl
}
object ContentApplicationjsonAppsurl {
  
  inline def apply(content: ApplicationjsonAppsurl): ContentApplicationjsonAppsurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAppsurl]
  }
  
  extension [Self <: ContentApplicationjsonAppsurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonAppsurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
