package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.Cartesian3
import typingsJapgolly.cesium.mod.Quaternion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimesArray extends StObject {
  
  var points: js.Array[Cartesian3 | Double | Quaternion]
  
  var times: js.Array[Double]
}
object TimesArray {
  
  inline def apply(points: js.Array[Cartesian3 | Double | Quaternion], times: js.Array[Double]): TimesArray = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimesArray]
  }
  
  extension [Self <: TimesArray](x: Self) {
    
    inline def setPoints(value: js.Array[Cartesian3 | Double | Quaternion]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: (Cartesian3 | Double | Quaternion)*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setTimes(value: js.Array[Double]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesVarargs(value: Double*): Self = StObject.set(x, "times", js.Array(value*))
  }
}
