package typingsJapgolly.gapiCalendar.anon

import typingsJapgolly.gapiCalendar.gapi.client.calendar.date
import typingsJapgolly.gapiCalendar.gapi.client.calendar.datetime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZone extends StObject {
  
  var date: typingsJapgolly.gapiCalendar.gapi.client.calendar.date
  
  var dateTime: datetime
  
  var timeZone: js.UndefOr[String] = js.undefined
}
object TimeZone {
  
  inline def apply(date: date, dateTime: datetime): TimeZone = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZone]
  }
  
  extension [Self <: TimeZone](x: Self) {
    
    inline def setDate(value: date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateTime(value: datetime): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
