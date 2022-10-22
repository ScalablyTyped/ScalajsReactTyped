package typingsJapgolly.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Point extends StObject {
  
  var code: String
  
  var point: Double
  
  var x_shift: Double
  
  var y_shift: Double
}
object Point {
  
  inline def apply(code: String, point: Double, x_shift: Double, y_shift: Double): Point = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  
  extension [Self <: Point](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Double): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setX_shift(value: Double): Self = StObject.set(x, "x_shift", value.asInstanceOf[js.Any])
    
    inline def setY_shift(value: Double): Self = StObject.set(x, "y_shift", value.asInstanceOf[js.Any])
  }
}
