package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonContextsArray extends StObject {
  
  var content: ApplicationjsonContextsArray
}
object ContentApplicationjsonContextsArray {
  
  inline def apply(content: ApplicationjsonContextsArray): ContentApplicationjsonContextsArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonContextsArray]
  }
  
  extension [Self <: ContentApplicationjsonContextsArray](x: Self) {
    
    inline def setContent(value: ApplicationjsonContextsArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
