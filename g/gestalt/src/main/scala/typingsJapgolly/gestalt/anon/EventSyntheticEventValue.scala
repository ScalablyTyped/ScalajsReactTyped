package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSyntheticEventValue extends StObject {
  
  var event: ReactEventFrom[HTMLInputElement]
  
  var value: js.UndefOr[Double] = js.undefined
}
object EventSyntheticEventValue {
  
  inline def apply(event: ReactEventFrom[HTMLInputElement]): EventSyntheticEventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEventValue]
  }
  
  extension [Self <: EventSyntheticEventValue](x: Self) {
    
    inline def setEvent(value: ReactEventFrom[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
