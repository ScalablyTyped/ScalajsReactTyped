package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonConditions extends StObject {
  
  var content: ApplicationjsonConditions
}
object ContentApplicationjsonConditions {
  
  inline def apply(content: ApplicationjsonConditions): ContentApplicationjsonConditions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonConditions]
  }
  
  extension [Self <: ContentApplicationjsonConditions](x: Self) {
    
    inline def setContent(value: ApplicationjsonConditions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
