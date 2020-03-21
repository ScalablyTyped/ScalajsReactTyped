package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A column in a table. A column consists of a list of table cells. A column is identified by the
  * column index.
  */
trait TableColumn extends js.Object {
  def getCell(cellIndex: Integer): TableCell
  def getIndex(): Integer
  def getNumCells(): Integer
  def getParentTable(): Table
  def getWidth(): Double
  def remove(): Unit
}

object TableColumn {
  @scala.inline
  def apply(
    getCell: Integer => CallbackTo[TableCell],
    getIndex: CallbackTo[Integer],
    getNumCells: CallbackTo[Integer],
    getParentTable: CallbackTo[Table],
    getWidth: CallbackTo[Double],
    remove: Callback
  ): TableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCell")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getCell(t0).runNow()))
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.updateDynamic("getNumCells")(getNumCells.toJsFn)
    __obj.updateDynamic("getParentTable")(getParentTable.toJsFn)
    __obj.updateDynamic("getWidth")(getWidth.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[TableColumn]
  }
}

