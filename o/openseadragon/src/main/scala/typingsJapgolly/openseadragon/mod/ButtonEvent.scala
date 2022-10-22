package typingsJapgolly.openseadragon.mod

import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonEvent
  extends StObject
     with OSDEvent[Button] {
  
  var originalEvent: Event
}
object ButtonEvent {
  
  inline def apply(eventSource: Button, originalEvent: Event, userData: Any): ButtonEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonEvent]
  }
  
  extension [Self <: ButtonEvent](x: Self) {
    
    inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
