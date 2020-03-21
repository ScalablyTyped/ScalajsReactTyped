package typingsJapgolly.datatablesNetFixedcolumns.DataTables

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedColumnsMethods extends Api {
  /*
    * @Deprecated(use dt.cell(this).index())
    * Get the cell index of a cell in a fixed column
    */
  def cellIndex(): CellIndex
  /*
    * Redraw the fixed columns based on new table size
    */
  def relayout(): Api
  /*
    * @Deprecated(use dt.row(this).index())
    * Get the row index of a row in a fixed column
    */
  def rowIndex(): Double
  /*
    * Update the data shown in the FixedColumns
    */
  def update(): Api
}

object FixedColumnsMethods {
  @scala.inline
  def apply(
    cellIndex: CallbackTo[CellIndex],
    fixedColumns: CallbackTo[FixedColumnsMethods],
    relayout: CallbackTo[Api],
    rowIndex: CallbackTo[Double],
    update: CallbackTo[Api]
  ): FixedColumnsMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cellIndex")(cellIndex.toJsFn)
    __obj.updateDynamic("fixedColumns")(fixedColumns.toJsFn)
    __obj.updateDynamic("relayout")(relayout.toJsFn)
    __obj.updateDynamic("rowIndex")(rowIndex.toJsFn)
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[FixedColumnsMethods]
  }
}

