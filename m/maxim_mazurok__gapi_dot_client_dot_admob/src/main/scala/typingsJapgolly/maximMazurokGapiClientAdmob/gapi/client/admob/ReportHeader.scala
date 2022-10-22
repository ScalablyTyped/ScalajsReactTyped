package typingsJapgolly.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportHeader extends StObject {
  
  /** The date range for which the report is generated. This is identical to the range specified in the report request. */
  var dateRange: js.UndefOr[DateRange] = js.undefined
  
  /** Localization settings of the report. This is identical to the settings in the report request. */
  var localizationSettings: js.UndefOr[LocalizationSettings] = js.undefined
  
  /** The report time zone. The value is a time-zone ID as specified by the CLDR project, for example, "America/Los_Angeles". */
  var reportingTimeZone: js.UndefOr[String] = js.undefined
}
object ReportHeader {
  
  inline def apply(): ReportHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportHeader]
  }
  
  extension [Self <: ReportHeader](x: Self) {
    
    inline def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setLocalizationSettings(value: LocalizationSettings): Self = StObject.set(x, "localizationSettings", value.asInstanceOf[js.Any])
    
    inline def setLocalizationSettingsUndefined: Self = StObject.set(x, "localizationSettings", js.undefined)
    
    inline def setReportingTimeZone(value: String): Self = StObject.set(x, "reportingTimeZone", value.asInstanceOf[js.Any])
    
    inline def setReportingTimeZoneUndefined: Self = StObject.set(x, "reportingTimeZone", js.undefined)
  }
}
