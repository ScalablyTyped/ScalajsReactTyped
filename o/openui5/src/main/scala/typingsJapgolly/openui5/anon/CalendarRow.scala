package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapMPlanningCalendarRowMod.PlanningCalendarRow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarRow extends StObject {
  
  /**
    * The row of the appointment.
    */
  var calendarRow: js.UndefOr[PlanningCalendarRow] = js.undefined
  
  /**
    * End date of the created appointment, as a JavaScript date object.
    */
  var endDate: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Start date of the created appointment, as a JavaScript date object.
    */
  var startDate: js.UndefOr[js.Object] = js.undefined
}
object CalendarRow {
  
  inline def apply(): CalendarRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarRow]
  }
  
  extension [Self <: CalendarRow](x: Self) {
    
    inline def setCalendarRow(value: PlanningCalendarRow): Self = StObject.set(x, "calendarRow", value.asInstanceOf[js.Any])
    
    inline def setCalendarRowUndefined: Self = StObject.set(x, "calendarRow", js.undefined)
    
    inline def setEndDate(value: js.Object): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: js.Object): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
