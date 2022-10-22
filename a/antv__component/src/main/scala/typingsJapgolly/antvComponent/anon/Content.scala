package typingsJapgolly.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: String
  
  var display: Boolean
  
  var style: FontFamily
}
object Content {
  
  inline def apply(content: String, display: Boolean, style: FontFamily): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: FontFamily): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
