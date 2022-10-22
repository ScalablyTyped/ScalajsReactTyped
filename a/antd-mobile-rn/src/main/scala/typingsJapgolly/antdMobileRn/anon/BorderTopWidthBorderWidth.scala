package typingsJapgolly.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderTopWidthBorderWidth extends StObject {
  
  var borderColor: String
  
  var borderTopWidth: Double
  
  var borderWidth: Double
}
object BorderTopWidthBorderWidth {
  
  inline def apply(borderColor: String, borderTopWidth: Double, borderWidth: Double): BorderTopWidthBorderWidth = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderTopWidthBorderWidth]
  }
  
  extension [Self <: BorderTopWidthBorderWidth](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderTopWidth(value: Double): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
  }
}
