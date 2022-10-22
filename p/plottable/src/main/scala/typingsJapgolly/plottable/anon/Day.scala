package typingsJapgolly.plottable.anon

import typingsJapgolly.plottable.plottableStrings.day
import typingsJapgolly.plottable.plottableStrings.hour
import typingsJapgolly.plottable.plottableStrings.minute
import typingsJapgolly.plottable.plottableStrings.month
import typingsJapgolly.plottable.plottableStrings.second
import typingsJapgolly.plottable.plottableStrings.week
import typingsJapgolly.plottable.plottableStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Day extends StObject {
  
  var day: typingsJapgolly.plottable.plottableStrings.day
  
  var hour: typingsJapgolly.plottable.plottableStrings.hour
  
  var minute: typingsJapgolly.plottable.plottableStrings.minute
  
  var month: typingsJapgolly.plottable.plottableStrings.month
  
  var second: typingsJapgolly.plottable.plottableStrings.second
  
  var week: typingsJapgolly.plottable.plottableStrings.week
  
  var year: typingsJapgolly.plottable.plottableStrings.year
}
object Day {
  
  inline def apply(): Day = {
    val __obj = js.Dynamic.literal(day = "day", hour = "hour", minute = "minute", month = "month", second = "second", week = "week", year = "year")
    __obj.asInstanceOf[Day]
  }
  
  extension [Self <: Day](x: Self) {
    
    inline def setDay(value: day): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setHour(value: hour): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: minute): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: month): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: second): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setWeek(value: week): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    inline def setYear(value: year): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
