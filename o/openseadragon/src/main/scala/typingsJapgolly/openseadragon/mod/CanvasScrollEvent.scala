package typingsJapgolly.openseadragon.mod

import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasScrollEvent
  extends StObject
     with CanvasEvent {
  
  var preventDefault: Boolean
  
  var preventDefaultAction: Boolean
  
  var scroll: Double
  
  var shift: Boolean
}
object CanvasScrollEvent {
  
  inline def apply(
    eventSource: Viewer,
    originalEvent: Event,
    position: Point,
    preventDefault: Boolean,
    preventDefaultAction: Boolean,
    scroll: Double,
    shift: Boolean,
    tracker: MouseTracker,
    userData: Any
  ): CanvasScrollEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], preventDefaultAction = preventDefaultAction.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasScrollEvent]
  }
  
  extension [Self <: CanvasScrollEvent](x: Self) {
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultAction(value: Boolean): Self = StObject.set(x, "preventDefaultAction", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: Double): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
  }
}
