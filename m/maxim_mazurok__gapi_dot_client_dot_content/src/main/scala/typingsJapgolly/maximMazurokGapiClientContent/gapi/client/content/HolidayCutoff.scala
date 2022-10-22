package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HolidayCutoff extends StObject {
  
  /** Date of the order deadline, in ISO 8601 format. For example, "2016-11-29" for 29th November 2016. Required. */
  var deadlineDate: js.UndefOr[String] = js.undefined
  
  /**
    * Hour of the day on the deadline date until which the order has to be placed to qualify for the delivery guarantee. Possible values are: 0 (midnight), 1, ..., 12 (noon), 13, ..., 23.
    * Required.
    */
  var deadlineHour: js.UndefOr[Double] = js.undefined
  
  /** Timezone identifier for the deadline hour (for example, "Europe/Zurich"). List of identifiers. Required. */
  var deadlineTimezone: js.UndefOr[String] = js.undefined
  
  /** Unique identifier for the holiday. Required. */
  var holidayId: js.UndefOr[String] = js.undefined
  
  /** Date on which the deadline will become visible to consumers in ISO 8601 format. For example, "2016-10-31" for 31st October 2016. Required. */
  var visibleFromDate: js.UndefOr[String] = js.undefined
}
object HolidayCutoff {
  
  inline def apply(): HolidayCutoff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HolidayCutoff]
  }
  
  extension [Self <: HolidayCutoff](x: Self) {
    
    inline def setDeadlineDate(value: String): Self = StObject.set(x, "deadlineDate", value.asInstanceOf[js.Any])
    
    inline def setDeadlineDateUndefined: Self = StObject.set(x, "deadlineDate", js.undefined)
    
    inline def setDeadlineHour(value: Double): Self = StObject.set(x, "deadlineHour", value.asInstanceOf[js.Any])
    
    inline def setDeadlineHourUndefined: Self = StObject.set(x, "deadlineHour", js.undefined)
    
    inline def setDeadlineTimezone(value: String): Self = StObject.set(x, "deadlineTimezone", value.asInstanceOf[js.Any])
    
    inline def setDeadlineTimezoneUndefined: Self = StObject.set(x, "deadlineTimezone", js.undefined)
    
    inline def setHolidayId(value: String): Self = StObject.set(x, "holidayId", value.asInstanceOf[js.Any])
    
    inline def setHolidayIdUndefined: Self = StObject.set(x, "holidayId", js.undefined)
    
    inline def setVisibleFromDate(value: String): Self = StObject.set(x, "visibleFromDate", value.asInstanceOf[js.Any])
    
    inline def setVisibleFromDateUndefined: Self = StObject.set(x, "visibleFromDate", js.undefined)
  }
}
