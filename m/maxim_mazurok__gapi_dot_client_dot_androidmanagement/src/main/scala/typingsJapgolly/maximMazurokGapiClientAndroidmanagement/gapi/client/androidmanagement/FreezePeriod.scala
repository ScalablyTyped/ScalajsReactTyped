package typingsJapgolly.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreezePeriod extends StObject {
  
  /**
    * The end date (inclusive) of the freeze period. Must be no later than 90 days from the start date. If the end date is earlier than the start date, the freeze period is considered
    * wrapping year-end. Note: year must not be set. For example, {"month": 1,"date": 30}.
    */
  var endDate: js.UndefOr[Date] = js.undefined
  
  /** The start date (inclusive) of the freeze period. Note: year must not be set. For example, {"month": 1,"date": 30}. */
  var startDate: js.UndefOr[Date] = js.undefined
}
object FreezePeriod {
  
  inline def apply(): FreezePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreezePeriod]
  }
  
  extension [Self <: FreezePeriod](x: Self) {
    
    inline def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
