package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAssigneesArray extends StObject {
  
  var content: ApplicationjsonAssigneesArray
}
object ContentApplicationjsonAssigneesArray {
  
  inline def apply(content: ApplicationjsonAssigneesArray): ContentApplicationjsonAssigneesArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAssigneesArray]
  }
  
  extension [Self <: ContentApplicationjsonAssigneesArray](x: Self) {
    
    inline def setContent(value: ApplicationjsonAssigneesArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
