package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSyntheticEventValueString extends StObject {
  
  var event: ReactEventFrom[HTMLTextAreaElement]
  
  var value: String
}
object EventSyntheticEventValueString {
  
  inline def apply(event: ReactEventFrom[HTMLTextAreaElement], value: String): EventSyntheticEventValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEventValueString]
  }
  
  extension [Self <: EventSyntheticEventValueString](x: Self) {
    
    inline def setEvent(value: ReactEventFrom[HTMLTextAreaElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
