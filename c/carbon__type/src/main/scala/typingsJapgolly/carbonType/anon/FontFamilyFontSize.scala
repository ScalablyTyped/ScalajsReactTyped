package typingsJapgolly.carbonType.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamilyFontSize extends StObject {
  
  var fontFamily: String
  
  var fontSize: String
  
  var fontWeight: Double
  
  var letterSpacing: Double
}
object FontFamilyFontSize {
  
  inline def apply(fontFamily: String, fontSize: String, fontWeight: Double, letterSpacing: Double): FontFamilyFontSize = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamilyFontSize]
  }
  
  extension [Self <: FontFamilyFontSize](x: Self) {
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
  }
}
