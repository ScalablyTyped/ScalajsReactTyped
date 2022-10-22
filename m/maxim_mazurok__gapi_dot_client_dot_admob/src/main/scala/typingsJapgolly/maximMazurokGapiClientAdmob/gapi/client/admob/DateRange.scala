package typingsJapgolly.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateRange extends StObject {
  
  /** End date of the date range, inclusive. Must be greater than or equal to the start date. */
  var endDate: js.UndefOr[Date] = js.undefined
  
  /** Start date of the date range, inclusive. Must be less than or equal to the end date. */
  var startDate: js.UndefOr[Date] = js.undefined
}
object DateRange {
  
  inline def apply(): DateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRange]
  }
  
  extension [Self <: DateRange](x: Self) {
    
    inline def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
