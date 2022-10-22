package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentHeaders extends StObject {
  
  var content: `9`
}
object ContentHeaders {
  
  inline def apply(content: `9`): ContentHeaders = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentHeaders]
  }
  
  extension [Self <: ContentHeaders](x: Self) {
    
    inline def setContent(value: `9`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
