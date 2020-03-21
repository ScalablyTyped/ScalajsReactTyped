package typingsJapgolly.ejWebAll.ej.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLExport extends js.Object {
  /** This method is used to save the sheet data as Excel ,CSV or PDF document (.xls, .xlsx .csv, .pdf) in Spreadsheet.
    * @param {string} Pass the export type that you want.
    * @param {ej.Spreadsheet.ExportType} Pass the export filename that you want.
    * @returns {void}
    */
  def export(`type`: String, fileName: ExportType): Unit
  /** This method is used to get the export properties in the Spreadsheet.
    * @returns {any}
    */
  def getExportProps(): js.Any
}

object XLExport {
  @scala.inline
  def apply(export: (String, ExportType) => Callback, getExportProps: CallbackTo[js.Any]): XLExport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("export")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.ejWebAll.ej.Spreadsheet.ExportType) => export(t0, t1).runNow()))
    __obj.updateDynamic("getExportProps")(getExportProps.toJsFn)
    __obj.asInstanceOf[XLExport]
  }
}

