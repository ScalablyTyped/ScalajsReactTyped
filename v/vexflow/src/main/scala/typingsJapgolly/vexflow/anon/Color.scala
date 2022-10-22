package typingsJapgolly.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var color: String
  
  var fill: Boolean
  
  var offsetx: Double
  
  var offsety: Double
  
  var opacity: Double
  
  var width: Double
}
object Color {
  
  inline def apply(color: String, fill: Boolean, offsetx: Double, offsety: Double, opacity: Double, width: Double): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], offsetx = offsetx.asInstanceOf[js.Any], offsety = offsety.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setOffsetx(value: Double): Self = StObject.set(x, "offsetx", value.asInstanceOf[js.Any])
    
    inline def setOffsety(value: Double): Self = StObject.set(x, "offsety", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
