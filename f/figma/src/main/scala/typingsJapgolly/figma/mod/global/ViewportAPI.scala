package typingsJapgolly.figma.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewportAPI extends StObject {
  
  val bounds: Rect
  
  var center: Vector
  
  def scrollAndZoomIntoView(nodes: js.Array[BaseNode]): Unit
  
  var zoom: Double
}
object ViewportAPI {
  
  inline def apply(bounds: Rect, center: Vector, scrollAndZoomIntoView: js.Array[BaseNode] => Callback, zoom: Double): ViewportAPI = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], scrollAndZoomIntoView = js.Any.fromFunction1((t0: js.Array[BaseNode]) => scrollAndZoomIntoView(t0).runNow()), zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportAPI]
  }
  
  extension [Self <: ViewportAPI](x: Self) {
    
    inline def setBounds(value: Rect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: Vector): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setScrollAndZoomIntoView(value: js.Array[BaseNode] => Callback): Self = StObject.set(x, "scrollAndZoomIntoView", js.Any.fromFunction1((t0: js.Array[BaseNode]) => value(t0).runNow()))
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
