package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateEvent[T] extends StObject {
  
  var date: T
  
  var event: org.scalajs.dom.Event
}
object DateEvent {
  
  inline def apply[T](date: T, event: org.scalajs.dom.Event): DateEvent[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateEvent[T]]
  }
  
  extension [Self <: DateEvent[?], T](x: Self & DateEvent[T]) {
    
    inline def setDate(value: T): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: org.scalajs.dom.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
