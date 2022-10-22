package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  var date: Any
  
  var event: org.scalajs.dom.Event
}
object Date {
  
  inline def apply(date: Any, event: org.scalajs.dom.Event): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: org.scalajs.dom.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
