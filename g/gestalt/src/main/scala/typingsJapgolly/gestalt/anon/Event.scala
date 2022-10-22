package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event[T /* <: ReactEventFrom[HTMLElement] | org.scalajs.dom.Event */] extends StObject {
  
  val event: T
}
object Event {
  
  inline def apply[T /* <: ReactEventFrom[HTMLElement] | org.scalajs.dom.Event */](event: T): Event[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[T]]
  }
  
  extension [Self <: Event[?], T /* <: ReactEventFrom[HTMLElement] | org.scalajs.dom.Event */](x: Self & Event[T]) {
    
    inline def setEvent(value: T): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
