package typingsJapgolly.reactBigCalendar.anon

import typingsJapgolly.reactBigCalendar.mod.stringOrDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllDay extends StObject {
  
  var allDay: Boolean
  
  var end: stringOrDate
  
  var start: stringOrDate
}
object AllDay {
  
  inline def apply(allDay: Boolean, end: stringOrDate, start: stringOrDate): AllDay = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDay]
  }
  
  extension [Self <: AllDay](x: Self) {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: stringOrDate): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: stringOrDate): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
