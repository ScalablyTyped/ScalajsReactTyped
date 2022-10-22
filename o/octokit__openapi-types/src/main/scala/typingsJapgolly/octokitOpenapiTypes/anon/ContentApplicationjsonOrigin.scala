package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonOrigin extends StObject {
  
  var content: ApplicationjsonOrigin
}
object ContentApplicationjsonOrigin {
  
  inline def apply(content: ApplicationjsonOrigin): ContentApplicationjsonOrigin = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonOrigin]
  }
  
  extension [Self <: ContentApplicationjsonOrigin](x: Self) {
    
    inline def setContent(value: ApplicationjsonOrigin): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
