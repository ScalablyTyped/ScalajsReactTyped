package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCancelurl extends StObject {
  
  var content: ApplicationjsonCancelurl
}
object ContentApplicationjsonCancelurl {
  
  inline def apply(content: ApplicationjsonCancelurl): ContentApplicationjsonCancelurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCancelurl]
  }
  
  extension [Self <: ContentApplicationjsonCancelurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonCancelurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
