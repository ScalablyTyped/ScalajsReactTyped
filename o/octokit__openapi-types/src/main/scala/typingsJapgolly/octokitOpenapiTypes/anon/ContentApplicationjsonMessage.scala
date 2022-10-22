package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMessage extends StObject {
  
  var content: ApplicationjsonMessage
}
object ContentApplicationjsonMessage {
  
  inline def apply(content: ApplicationjsonMessage): ContentApplicationjsonMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMessage]
  }
  
  extension [Self <: ContentApplicationjsonMessage](x: Self) {
    
    inline def setContent(value: ApplicationjsonMessage): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
