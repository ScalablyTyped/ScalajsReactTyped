package typingsJapgolly.bmapgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Points extends StObject {
  
  var points: js.Array[typingsJapgolly.bmapgl.BMapGL.Point]
  
  var status: Double
}
object Points {
  
  inline def apply(points: js.Array[typingsJapgolly.bmapgl.BMapGL.Point], status: Double): Points = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
  
  extension [Self <: Points](x: Self) {
    
    inline def setPoints(value: js.Array[typingsJapgolly.bmapgl.BMapGL.Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: typingsJapgolly.bmapgl.BMapGL.Point*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
