package typingsJapgolly.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Baseline extends StObject {
  
  var has_baseline: Boolean
  
  var x0: Double
  
  var x1: Double
  
  var y0: Double
  
  var y1: Double
}
object Baseline {
  
  inline def apply(has_baseline: Boolean, x0: Double, x1: Double, y0: Double, y1: Double): Baseline = {
    val __obj = js.Dynamic.literal(has_baseline = has_baseline.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Baseline]
  }
  
  extension [Self <: Baseline](x: Self) {
    
    inline def setHas_baseline(value: Boolean): Self = StObject.set(x, "has_baseline", value.asInstanceOf[js.Any])
    
    inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
  }
}
