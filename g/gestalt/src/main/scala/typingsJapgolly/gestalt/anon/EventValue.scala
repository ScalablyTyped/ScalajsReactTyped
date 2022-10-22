package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventValue extends StObject {
  
  var event: ReactFocusEventFrom[HTMLInputElement] | ReactEventFrom[HTMLInputElement]
  
  var value: String
}
object EventValue {
  
  inline def apply(event: ReactFocusEventFrom[HTMLInputElement] | ReactEventFrom[HTMLInputElement], value: String): EventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventValue]
  }
  
  extension [Self <: EventValue](x: Self) {
    
    inline def setEvent(value: ReactFocusEventFrom[HTMLInputElement] | ReactEventFrom[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
