package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Reports
trait AdWordsReport extends StObject {
  
  def exportToSheet(sheet: Sheet): Unit
  
  def getColumnHeader(awqlColumnName: String): AdWordsReportColumnHeader
  
  def rows(): AdWordsReportRowIterator
}
object AdWordsReport {
  
  inline def apply(
    exportToSheet: Sheet => Callback,
    getColumnHeader: String => AdWordsReportColumnHeader,
    rows: CallbackTo[AdWordsReportRowIterator]
  ): AdWordsReport = {
    val __obj = js.Dynamic.literal(exportToSheet = js.Any.fromFunction1((t0: Sheet) => exportToSheet(t0).runNow()), getColumnHeader = js.Any.fromFunction1(getColumnHeader), rows = rows.toJsFn)
    __obj.asInstanceOf[AdWordsReport]
  }
  
  extension [Self <: AdWordsReport](x: Self) {
    
    inline def setExportToSheet(value: Sheet => Callback): Self = StObject.set(x, "exportToSheet", js.Any.fromFunction1((t0: Sheet) => value(t0).runNow()))
    
    inline def setGetColumnHeader(value: String => AdWordsReportColumnHeader): Self = StObject.set(x, "getColumnHeader", js.Any.fromFunction1(value))
    
    inline def setRows(value: CallbackTo[AdWordsReportRowIterator]): Self = StObject.set(x, "rows", value.toJsFn)
  }
}
