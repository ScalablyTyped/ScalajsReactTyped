package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventKeyboardEvent extends StObject {
  
  var event: ReactKeyboardEventFrom[HTMLInputElement]
  
  var value: String
}
object EventKeyboardEvent {
  
  inline def apply(event: ReactKeyboardEventFrom[HTMLInputElement], value: String): EventKeyboardEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventKeyboardEvent]
  }
  
  extension [Self <: EventKeyboardEvent](x: Self) {
    
    inline def setEvent(value: ReactKeyboardEventFrom[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
