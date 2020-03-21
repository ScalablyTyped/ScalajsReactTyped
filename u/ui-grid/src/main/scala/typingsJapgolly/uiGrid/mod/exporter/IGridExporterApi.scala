package typingsJapgolly.uiGrid.mod.exporter

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridExporterApi extends js.Object {
  /**
    * Exports rows from the grid in csv format, the data exported is selected based on the provided options
    * @param {string} rowTypes which rows to export, valid values are uiGridExporterConstants.ALL,
    * uiGridExporterConstants.VISIBLE, uiGridExporterConstants.SELECTED
    * @param {string} colTypes which columns to export, valid values are uiGridExporterConstants.ALL,
    * uiGridExporterConstants.VISIBLE
    */
  def csvExport(rowTypes: String, colTypes: String): Unit
  /**
    * Exports rows from the grid in pdf format, the data exported is selected based on the provided options
    * Note that this function has a dependency on pdfMake, all going well this has been installed for you. The
    * resulting pdf opens in a new browser window.
    * @param {string} rowTypes which rows to export, valid values are uiGridExporterConstants.ALL,
    * uiGridExporterConstants.VISIBLE, uiGridExporterConstants.SELECTED
    * @param {string} colTypes which columns to export, valid values are uiGridExporterConstants.ALL,
    * uiGridExporterConstants.VISIBLE
    */
  def pdfExport(rowTypes: String, colTypes: String): Unit
}

object IGridExporterApi {
  @scala.inline
  def apply(csvExport: (String, String) => Callback, pdfExport: (String, String) => Callback): IGridExporterApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("csvExport")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => csvExport(t0, t1).runNow()))
    __obj.updateDynamic("pdfExport")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => pdfExport(t0, t1).runNow()))
    __obj.asInstanceOf[IGridExporterApi]
  }
}

