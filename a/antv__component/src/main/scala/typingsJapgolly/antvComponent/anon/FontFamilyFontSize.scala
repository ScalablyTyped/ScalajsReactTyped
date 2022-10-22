package typingsJapgolly.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamilyFontSize extends StObject {
  
  var fill: String
  
  var fontFamily: String
  
  var fontSize: Double
  
  var textBaseline: String
}
object FontFamilyFontSize {
  
  inline def apply(fill: String, fontFamily: String, fontSize: Double, textBaseline: String): FontFamilyFontSize = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamilyFontSize]
  }
  
  extension [Self <: FontFamilyFontSize](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
  }
}
