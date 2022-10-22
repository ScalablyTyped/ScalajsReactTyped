package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFocusEventValueString extends StObject {
  
  var event: ReactFocusEventFrom[HTMLTextAreaElement]
  
  var value: String
}
object EventFocusEventValueString {
  
  inline def apply(event: ReactFocusEventFrom[HTMLTextAreaElement], value: String): EventFocusEventValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFocusEventValueString]
  }
  
  extension [Self <: EventFocusEventValueString](x: Self) {
    
    inline def setEvent(value: ReactFocusEventFrom[HTMLTextAreaElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
