package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFocusEventValue extends StObject {
  
  var event: ReactFocusEventFrom[HTMLInputElement]
  
  var value: js.UndefOr[Double] = js.undefined
}
object EventFocusEventValue {
  
  inline def apply(event: ReactFocusEventFrom[HTMLInputElement]): EventFocusEventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFocusEventValue]
  }
  
  extension [Self <: EventFocusEventValue](x: Self) {
    
    inline def setEvent(value: ReactFocusEventFrom[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
