package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRunnersTotalcount extends StObject {
  
  var content: ApplicationjsonRunnersTotalcount
}
object ContentApplicationjsonRunnersTotalcount {
  
  inline def apply(content: ApplicationjsonRunnersTotalcount): ContentApplicationjsonRunnersTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRunnersTotalcount]
  }
  
  extension [Self <: ContentApplicationjsonRunnersTotalcount](x: Self) {
    
    inline def setContent(value: ApplicationjsonRunnersTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
