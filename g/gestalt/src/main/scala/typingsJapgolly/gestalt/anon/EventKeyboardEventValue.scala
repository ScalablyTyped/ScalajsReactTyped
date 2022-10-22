package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventKeyboardEventValue extends StObject {
  
  var event: ReactKeyboardEventFrom[HTMLInputElement]
  
  var value: js.UndefOr[Double] = js.undefined
}
object EventKeyboardEventValue {
  
  inline def apply(event: ReactKeyboardEventFrom[HTMLInputElement]): EventKeyboardEventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventKeyboardEventValue]
  }
  
  extension [Self <: EventKeyboardEventValue](x: Self) {
    
    inline def setEvent(value: ReactKeyboardEventFrom[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
