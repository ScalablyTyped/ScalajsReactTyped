package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCheckouturi extends StObject {
  
  var content: ApplicationjsonCheckouturi
}
object ContentApplicationjsonCheckouturi {
  
  inline def apply(content: ApplicationjsonCheckouturi): ContentApplicationjsonCheckouturi = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCheckouturi]
  }
  
  extension [Self <: ContentApplicationjsonCheckouturi](x: Self) {
    
    inline def setContent(value: ApplicationjsonCheckouturi): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
