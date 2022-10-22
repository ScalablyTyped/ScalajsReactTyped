package typingsJapgolly.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisRestApi.mod.CircularArc
  - typingsJapgolly.arcgisRestApi.mod.Arc
  - typingsJapgolly.arcgisRestApi.mod.OldCircularArc
  - typingsJapgolly.arcgisRestApi.mod.BezierCurve
*/
trait JsonCurve extends StObject
object JsonCurve {
  
  inline def Arc(
    a: js.Tuple7[
      Position, 
      // End point: x, y, <z>, <m>
  Position2D, 
      // Center point: center_x, center_y
  Double, 
      // minor
  Double, 
      // clockwise
  Double, 
      // rotation
  Double, 
      // axis
  Double
    ]
  ): typingsJapgolly.arcgisRestApi.mod.Arc = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.arcgisRestApi.mod.Arc]
  }
  
  inline def BezierCurve(b: js.Tuple3[Position, Position2D, Position2D]): typingsJapgolly.arcgisRestApi.mod.BezierCurve = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.arcgisRestApi.mod.BezierCurve]
  }
  
  inline def CircularArc(c: js.Tuple2[Position, Position2D]): typingsJapgolly.arcgisRestApi.mod.CircularArc = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.arcgisRestApi.mod.CircularArc]
  }
  
  inline def OldCircularArc(
    a: js.Tuple4[
      Position, 
      // End point: x, y, <z>, <m>
  Position2D, 
      // Center point: center_x, center_y
  Double, 
      // minor
  Double
    ]
  ): typingsJapgolly.arcgisRestApi.mod.OldCircularArc = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.arcgisRestApi.mod.OldCircularArc]
  }
}
