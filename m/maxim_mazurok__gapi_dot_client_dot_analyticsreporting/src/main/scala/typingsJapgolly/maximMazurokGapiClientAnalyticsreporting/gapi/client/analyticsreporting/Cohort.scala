package typingsJapgolly.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cohort extends StObject {
  
  /**
    * This is used for `FIRST_VISIT_DATE` cohort, the cohort selects users whose first visit date is between start date and end date defined in the DateRange. The date ranges should be
    * aligned for cohort requests. If the request contains `ga:cohortNthDay` it should be exactly one day long, if `ga:cohortNthWeek` it should be aligned to the week boundary (starting
    * at Sunday and ending Saturday), and for `ga:cohortNthMonth` the date range should be aligned to the month (starting at the first and ending on the last day of the month). For LTV
    * requests there are no such restrictions. You do not need to supply a date range for the `reportsRequest.dateRanges` field.
    */
  var dateRange: js.UndefOr[DateRange] = js.undefined
  
  /** A unique name for the cohort. If not defined name will be auto-generated with values cohort_[1234...]. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Type of the cohort. The only supported type as of now is `FIRST_VISIT_DATE`. If this field is unspecified the cohort is treated as `FIRST_VISIT_DATE` type cohort. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Cohort {
  
  inline def apply(): Cohort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cohort]
  }
  
  extension [Self <: Cohort](x: Self) {
    
    inline def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
