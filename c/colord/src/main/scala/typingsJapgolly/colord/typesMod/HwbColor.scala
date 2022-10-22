package typingsJapgolly.colord.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HwbColor
  extends StObject
     with ObjectColor {
  
  var b: Double
  
  var h: Double
  
  var w: Double
}
object HwbColor {
  
  inline def apply(b: Double, h: Double, w: Double): HwbColor = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[HwbColor]
  }
  
  extension [Self <: HwbColor](x: Self) {
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
