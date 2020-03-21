package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A row in a table. A row consists of a list of table cells. A row is identified by the row index.
  */
trait TableRow extends js.Object {
  def getCell(cellIndex: Integer): TableCell
  def getIndex(): Integer
  def getMinimumHeight(): Double
  def getNumCells(): Integer
  def getParentTable(): Table
  def remove(): Unit
}

object TableRow {
  @scala.inline
  def apply(
    getCell: Integer => CallbackTo[TableCell],
    getIndex: CallbackTo[Integer],
    getMinimumHeight: CallbackTo[Double],
    getNumCells: CallbackTo[Integer],
    getParentTable: CallbackTo[Table],
    remove: Callback
  ): TableRow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCell")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getCell(t0).runNow()))
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.updateDynamic("getMinimumHeight")(getMinimumHeight.toJsFn)
    __obj.updateDynamic("getNumCells")(getNumCells.toJsFn)
    __obj.updateDynamic("getParentTable")(getParentTable.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[TableRow]
  }
}

