package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCustomrolesTotalcount extends StObject {
  
  var content: ApplicationjsonCustomrolesTotalcount
}
object ContentApplicationjsonCustomrolesTotalcount {
  
  inline def apply(content: ApplicationjsonCustomrolesTotalcount): ContentApplicationjsonCustomrolesTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCustomrolesTotalcount]
  }
  
  extension [Self <: ContentApplicationjsonCustomrolesTotalcount](x: Self) {
    
    inline def setContent(value: ApplicationjsonCustomrolesTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
