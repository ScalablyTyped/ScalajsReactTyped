package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`0`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`10`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`11`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`12`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`1`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`2`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`3`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`4`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`5`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`6`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`7`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`8`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeType extends StObject {
  
  var calendarDate: js.UndefOr[String] = js.undefined
  
  var dayOfWeek: js.UndefOr[`3` | `2` | `4` | `0` | `5` | `6` | `1`] = js.undefined
  
  var timeOfDay: js.UndefOr[String] = js.undefined
  
  var timeZone: js.UndefOr[`3` | `2` | `4` | `0` | `7` | `5` | `12` | `11` | `6` | `10` | `9` | `8` | `1`] = js.undefined
}
object DateTimeType {
  
  inline def apply(): DateTimeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeType]
  }
  
  extension [Self <: DateTimeType](x: Self) {
    
    inline def setCalendarDate(value: String): Self = StObject.set(x, "calendarDate", value.asInstanceOf[js.Any])
    
    inline def setCalendarDateUndefined: Self = StObject.set(x, "calendarDate", js.undefined)
    
    inline def setDayOfWeek(value: `3` | `2` | `4` | `0` | `5` | `6` | `1`): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setTimeOfDay(value: String): Self = StObject.set(x, "timeOfDay", value.asInstanceOf[js.Any])
    
    inline def setTimeOfDayUndefined: Self = StObject.set(x, "timeOfDay", js.undefined)
    
    inline def setTimeZone(value: `3` | `2` | `4` | `0` | `7` | `5` | `12` | `11` | `6` | `10` | `9` | `8` | `1`): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
