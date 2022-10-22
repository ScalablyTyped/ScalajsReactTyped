package typingsJapgolly.openseadragon.mod

import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasContextMenuEvent
  extends StObject
     with CanvasEvent {
  
  var preventDefault: Boolean
}
object CanvasContextMenuEvent {
  
  inline def apply(
    eventSource: Viewer,
    originalEvent: Event,
    position: Point,
    preventDefault: Boolean,
    tracker: MouseTracker,
    userData: Any
  ): CanvasContextMenuEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasContextMenuEvent]
  }
  
  extension [Self <: CanvasContextMenuEvent](x: Self) {
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
  }
}
