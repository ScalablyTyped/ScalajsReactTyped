package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonErrorsArray extends StObject {
  
  var content: ApplicationjsonErrorsArray
}
object ContentApplicationjsonErrorsArray {
  
  inline def apply(content: ApplicationjsonErrorsArray): ContentApplicationjsonErrorsArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonErrorsArray]
  }
  
  extension [Self <: ContentApplicationjsonErrorsArray](x: Self) {
    
    inline def setContent(value: ApplicationjsonErrorsArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
