package typingsJapgolly.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateObject extends StObject {
  
  var dateString: String
  
  var day: Double
  
  var month: Double
  
  var timestamp: Double
  
  var year: Double
}
object DateObject {
  
  inline def apply(dateString: String, day: Double, month: Double, timestamp: Double, year: Double): DateObject = {
    val __obj = js.Dynamic.literal(dateString = dateString.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObject]
  }
  
  extension [Self <: DateObject](x: Self) {
    
    inline def setDateString(value: String): Self = StObject.set(x, "dateString", value.asInstanceOf[js.Any])
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
