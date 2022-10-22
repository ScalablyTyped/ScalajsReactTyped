package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonObject extends StObject {
  
  var content: ApplicationjsonObject
}
object ContentApplicationjsonObject {
  
  inline def apply(content: ApplicationjsonObject): ContentApplicationjsonObject = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonObject]
  }
  
  extension [Self <: ContentApplicationjsonObject](x: Self) {
    
    inline def setContent(value: ApplicationjsonObject): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
