package typingsJapgolly.ejWebAll.ej.Spreadsheet

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLFreeze extends js.Object {
  /** This method is used to freeze columns upto the specified column index in the Spreadsheet.
    * @param {number} Index of the column to be freeze.
    * @returns {void}
    */
  def freezeColumns(colIdx: Double): Unit
  /** This method is used to freeze the first column in the Spreadsheet.
    * @returns {void}
    */
  def freezeLeftColumn(): Unit
  /** This method is used to freeze rows and columns before the specified cell in the Spreadsheet.
    * @param {number} Index of the row to be freeze.
    * @param {number} Index of the column to be freeze.
    * @returns {void}
    */
  def freezePanes(rowIdx: Double, colIdx: Double): Unit
  /** This method is used to freeze rows upto the specified row index in the Spreadsheet.
    * @param {number} Index of the row to be freeze.
    * @returns {void}
    */
  def freezeRows(rowIdx: Double): Unit
  /** This method is used to freeze the top row in the Spreadsheet.
    * @returns {void}
    */
  def freezeTopRow(): Unit
  /** This method is used to unfreeze the frozen rows and columns in the Spreadsheet.
    * @returns {void}
    */
  def unfreezePanes(): Unit
}

object XLFreeze {
  @scala.inline
  def apply(
    freezeColumns: Double => Callback,
    freezeLeftColumn: Callback,
    freezePanes: (Double, Double) => Callback,
    freezeRows: Double => Callback,
    freezeTopRow: Callback,
    unfreezePanes: Callback
  ): XLFreeze = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("freezeColumns")(js.Any.fromFunction1((t0: scala.Double) => freezeColumns(t0).runNow()))
    __obj.updateDynamic("freezeLeftColumn")(freezeLeftColumn.toJsFn)
    __obj.updateDynamic("freezePanes")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => freezePanes(t0, t1).runNow()))
    __obj.updateDynamic("freezeRows")(js.Any.fromFunction1((t0: scala.Double) => freezeRows(t0).runNow()))
    __obj.updateDynamic("freezeTopRow")(freezeTopRow.toJsFn)
    __obj.updateDynamic("unfreezePanes")(unfreezePanes.toJsFn)
    __obj.asInstanceOf[XLFreeze]
  }
}

