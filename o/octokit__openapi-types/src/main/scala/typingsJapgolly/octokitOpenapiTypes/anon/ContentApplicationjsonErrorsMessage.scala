package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonErrorsMessage extends StObject {
  
  var content: ApplicationjsonErrorsMessage
}
object ContentApplicationjsonErrorsMessage {
  
  inline def apply(content: ApplicationjsonErrorsMessage): ContentApplicationjsonErrorsMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonErrorsMessage]
  }
  
  extension [Self <: ContentApplicationjsonErrorsMessage](x: Self) {
    
    inline def setContent(value: ApplicationjsonErrorsMessage): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
