package typingsJapgolly.reactMapGl.mod

import typingsJapgolly.reactMapGl.anon.X
import typingsJapgolly.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerEvent
  extends StObject
     with MouseEvent {
  
  // backward compatibility: v3 interface
  var features: js.Array[Any] = js.native
  
  var lngLat: js.Tuple2[Double, Double] = js.native
  
  var offsetCenter: X = js.native
  
  var point: js.Tuple2[Double, Double] = js.native
  
  var srcEvent: Any = js.native
}
