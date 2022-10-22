package typingsJapgolly.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillFontFamily extends StObject {
  
  var fill: String
  
  var fontFamily: String
  
  var textAlign: String
  
  var textBaseline: String
}
object FillFontFamily {
  
  inline def apply(fill: String, fontFamily: String, textAlign: String, textBaseline: String): FillFontFamily = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillFontFamily]
  }
  
  extension [Self <: FillFontFamily](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
  }
}
