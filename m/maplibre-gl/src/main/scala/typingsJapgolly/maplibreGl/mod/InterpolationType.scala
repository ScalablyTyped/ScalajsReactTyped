package typingsJapgolly.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.maplibreGl.anon.Name
  - typingsJapgolly.maplibreGl.anon.Base
  - typingsJapgolly.maplibreGl.anon.ControlPoints
*/
trait InterpolationType extends StObject
object InterpolationType {
  
  inline def Base(base: Double): typingsJapgolly.maplibreGl.anon.Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], name = "exponential")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.Base]
  }
  
  inline def ControlPoints(controlPoints: js.Tuple4[Double, Double, Double, Double]): typingsJapgolly.maplibreGl.anon.ControlPoints = {
    val __obj = js.Dynamic.literal(controlPoints = controlPoints.asInstanceOf[js.Any], name = "cubic-bezier")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.ControlPoints]
  }
  
  inline def Name(): typingsJapgolly.maplibreGl.anon.Name = {
    val __obj = js.Dynamic.literal(name = "linear")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.Name]
  }
}
