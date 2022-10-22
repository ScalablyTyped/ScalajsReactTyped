package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAssetsurl extends StObject {
  
  var content: ApplicationjsonAssetsurl
  
  var headers: Location
}
object ContentApplicationjsonAssetsurl {
  
  inline def apply(content: ApplicationjsonAssetsurl, headers: Location): ContentApplicationjsonAssetsurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAssetsurl]
  }
  
  extension [Self <: ContentApplicationjsonAssetsurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonAssetsurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
