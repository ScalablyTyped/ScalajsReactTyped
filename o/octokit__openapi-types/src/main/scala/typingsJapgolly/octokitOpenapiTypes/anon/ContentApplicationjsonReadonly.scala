package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonReadonly extends StObject {
  
  var content: ApplicationjsonReadonly
}
object ContentApplicationjsonReadonly {
  
  inline def apply(content: ApplicationjsonReadonly): ContentApplicationjsonReadonly = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonReadonly]
  }
  
  extension [Self <: ContentApplicationjsonReadonly](x: Self) {
    
    inline def setContent(value: ApplicationjsonReadonly): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
