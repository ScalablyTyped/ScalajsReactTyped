package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodyEvent extends StObject {
  
  var content: ApplicationjsonBodyEvent
}
object ContentApplicationjsonBodyEvent {
  
  inline def apply(content: ApplicationjsonBodyEvent): ContentApplicationjsonBodyEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodyEvent]
  }
  
  extension [Self <: ContentApplicationjsonBodyEvent](x: Self) {
    
    inline def setContent(value: ApplicationjsonBodyEvent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
