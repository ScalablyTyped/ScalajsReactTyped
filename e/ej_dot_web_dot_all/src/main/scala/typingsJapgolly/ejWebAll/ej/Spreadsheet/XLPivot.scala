package typingsJapgolly.ejWebAll.ej.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLPivot extends js.Object {
  /** This property is used to clear the pivot table list in Spreadsheet.
    * @param {string} Pass the name of the pivot table.
    * @returns {void}
    */
  def clearPivotFieldList(pivotName: String): Unit
  /** This method is used to create pivot table.
    * @param {string} It specifies the range for which the pivot table is created.
    * @param {string} It specifies the location in which the pivot table is created.
    * @param {string} It specifies the name of the pivot table.
    * @param {Spreadsheet.PivotOptions} Pass Object PivotOptions.
    * @param {any} Pass the pivot range, sheet index, address and data source .
    * @returns {string}
    */
  def createPivotTable(range: String, location: String, name: String, settings: PivotOptions, pvt: js.Any): String
  /** This method is used to delete the pivot table which is selected.
    * @param {string} Pass the name of the pivot table.
    * @returns {void}
    */
  def deletePivotTable(pivotName: String): Unit
  /** This method is used to refresh data in pivot table.
    * @param {string} Optional. Pass the name of the pivot table.
    * @param {number} Optional. Pass the index of the sheet.
    * @returns {void}
    */
  def refreshDataSource(name: String, sheetIdx: Double): Unit
}

object XLPivot {
  @scala.inline
  def apply(
    clearPivotFieldList: String => Callback,
    createPivotTable: (String, String, String, PivotOptions, js.Any) => CallbackTo[String],
    deletePivotTable: String => Callback,
    refreshDataSource: (String, Double) => Callback
  ): XLPivot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearPivotFieldList")(js.Any.fromFunction1((t0: java.lang.String) => clearPivotFieldList(t0).runNow()))
    __obj.updateDynamic("createPivotTable")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: typingsJapgolly.ejWebAll.ej.Spreadsheet.PivotOptions, t4: js.Any) => createPivotTable(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("deletePivotTable")(js.Any.fromFunction1((t0: java.lang.String) => deletePivotTable(t0).runNow()))
    __obj.updateDynamic("refreshDataSource")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => refreshDataSource(t0, t1).runNow()))
    __obj.asInstanceOf[XLPivot]
  }
}

