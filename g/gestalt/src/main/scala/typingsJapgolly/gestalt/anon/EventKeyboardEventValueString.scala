package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventKeyboardEventValueString extends StObject {
  
  var event: ReactKeyboardEventFrom[HTMLTextAreaElement]
  
  var value: String
}
object EventKeyboardEventValueString {
  
  inline def apply(event: ReactKeyboardEventFrom[HTMLTextAreaElement], value: String): EventKeyboardEventValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventKeyboardEventValueString]
  }
  
  extension [Self <: EventKeyboardEventValueString](x: Self) {
    
    inline def setEvent(value: ReactKeyboardEventFrom[HTMLTextAreaElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
