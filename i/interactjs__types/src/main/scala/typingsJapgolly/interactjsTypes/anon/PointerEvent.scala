package typingsJapgolly.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerEvent extends StObject {
  
  var pointerEvent: org.scalajs.dom.PointerEvent
}
object PointerEvent {
  
  inline def apply(pointerEvent: org.scalajs.dom.PointerEvent): PointerEvent = {
    val __obj = js.Dynamic.literal(pointerEvent = pointerEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerEvent]
  }
  
  extension [Self <: PointerEvent](x: Self) {
    
    inline def setPointerEvent(value: org.scalajs.dom.PointerEvent): Self = StObject.set(x, "pointerEvent", value.asInstanceOf[js.Any])
  }
}
