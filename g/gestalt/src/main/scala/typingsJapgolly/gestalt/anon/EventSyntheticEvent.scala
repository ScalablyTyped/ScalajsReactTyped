package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSyntheticEvent extends StObject {
  
  var event: ReactEventFrom[ReactMouseEventFrom[HTMLDivElement] & Element]
}
object EventSyntheticEvent {
  
  inline def apply(event: ReactEventFrom[ReactMouseEventFrom[HTMLDivElement] & Element]): EventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEvent]
  }
  
  extension [Self <: EventSyntheticEvent](x: Self) {
    
    inline def setEvent(value: ReactEventFrom[ReactMouseEventFrom[HTMLDivElement] & Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
