package typingsJapgolly.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAlign extends StObject {
  
  var fill: String
  
  var fontFamily: String
  
  var fontSize: Double
  
  var textAlign: String
  
  var textBaseline: String
}
object TextAlign {
  
  inline def apply(fill: String, fontFamily: String, fontSize: Double, textAlign: String, textBaseline: String): TextAlign = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAlign]
  }
  
  extension [Self <: TextAlign](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
  }
}
