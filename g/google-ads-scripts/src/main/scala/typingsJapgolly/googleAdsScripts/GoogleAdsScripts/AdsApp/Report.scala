package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Ads report.
  */
trait Report extends StObject {
  
  /**
    * Exports the content of the report into a SpreadsheetApp.Sheet.
    *
    * Typical usage:
    *
    *      var spreadsheet = SpreadsheetApp.create("Report output");
    *      var report = AdsApp.report("SELECT Clicks, Impressions, AverageCpc, HourOfDay " +
    *          "FROM ACCOUNT_PERFORMANCE_REPORT " +
    *          "DURING LAST_MONTH");
    *      report.exportToSheet(spreadsheet.getActiveSheet());
    *      Logger.log("Report available at " + spreadsheet.getUrl());
    *
    * Returns nothing.
    */
  def exportToSheet(sheet: Sheet): Unit
  
  /**
    * Returns the column header of the report matching the given AWQL column name.
    *
    * AWQL names are the names of the selected columns as they appear in the generated report.
    * For a full list of AWQL column names, and the display column names they correspond to, please see the Name and Display Name column in all types of reports.
    *
    *      var report = AdsApp.report("SELECT Clicks, Impressions, AverageCpc, HourOfDay " +
    *          "FROM ACCOUNT_PERFORMANCE_REPORT " +
    *          "DURING LAST_MONTH");
    *      var columnHeader1 = report.getColumnHeader("HourOfDay");
    *      // AWQL name: "HourOfDay"
    *      Logger.log(columnHeader1.getReportColumnName());
    *      // display name: "Hour of day"
    *      Logger.log(columnHeader1.getBulkUploadColumnName());
    *      var columnHeader2 = report.getColumnHeader("AverageCpc");
    *      // AWQL name: "AverageCpc"
    *      Logger.log(columnHeader2.getReportColumnName());
    *      // display name: "Avg. CPC"
    *      Logger.log(columnHeader2.getBulkUploadColumnName());
    */
  def getColumnHeader(awqlColumnName: String): ReportColumnHeader
  
  /** Returns an iterator over the rows of the report. */
  def rows(): ReportRowIterator
}
object Report {
  
  inline def apply(
    exportToSheet: Sheet => Callback,
    getColumnHeader: String => ReportColumnHeader,
    rows: CallbackTo[ReportRowIterator]
  ): Report = {
    val __obj = js.Dynamic.literal(exportToSheet = js.Any.fromFunction1((t0: Sheet) => exportToSheet(t0).runNow()), getColumnHeader = js.Any.fromFunction1(getColumnHeader), rows = rows.toJsFn)
    __obj.asInstanceOf[Report]
  }
  
  extension [Self <: Report](x: Self) {
    
    inline def setExportToSheet(value: Sheet => Callback): Self = StObject.set(x, "exportToSheet", js.Any.fromFunction1((t0: Sheet) => value(t0).runNow()))
    
    inline def setGetColumnHeader(value: String => ReportColumnHeader): Self = StObject.set(x, "getColumnHeader", js.Any.fromFunction1(value))
    
    inline def setRows(value: CallbackTo[ReportRowIterator]): Self = StObject.set(x, "rows", value.toJsFn)
  }
}
