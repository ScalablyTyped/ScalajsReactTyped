package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A cell in a table.
  */
trait TableCell extends js.Object {
  def getColumnIndex(): Integer
  def getColumnSpan(): Integer
  def getContentAlignment(): ContentAlignment
  def getFill(): Fill
  def getHeadCell(): TableCell
  def getMergeState(): CellMergeState
  def getParentColumn(): TableColumn
  def getParentRow(): TableRow
  def getParentTable(): Table
  def getRowIndex(): Integer
  def getRowSpan(): Integer
  def getText(): TextRange
  def setContentAlignment(contentAlignment: ContentAlignment): TableCell
}

object TableCell {
  @scala.inline
  def apply(
    getColumnIndex: CallbackTo[Integer],
    getColumnSpan: CallbackTo[Integer],
    getContentAlignment: CallbackTo[ContentAlignment],
    getFill: CallbackTo[Fill],
    getHeadCell: CallbackTo[TableCell],
    getMergeState: CallbackTo[CellMergeState],
    getParentColumn: CallbackTo[TableColumn],
    getParentRow: CallbackTo[TableRow],
    getParentTable: CallbackTo[Table],
    getRowIndex: CallbackTo[Integer],
    getRowSpan: CallbackTo[Integer],
    getText: CallbackTo[TextRange],
    setContentAlignment: ContentAlignment => CallbackTo[TableCell]
  ): TableCell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getColumnIndex")(getColumnIndex.toJsFn)
    __obj.updateDynamic("getColumnSpan")(getColumnSpan.toJsFn)
    __obj.updateDynamic("getContentAlignment")(getContentAlignment.toJsFn)
    __obj.updateDynamic("getFill")(getFill.toJsFn)
    __obj.updateDynamic("getHeadCell")(getHeadCell.toJsFn)
    __obj.updateDynamic("getMergeState")(getMergeState.toJsFn)
    __obj.updateDynamic("getParentColumn")(getParentColumn.toJsFn)
    __obj.updateDynamic("getParentRow")(getParentRow.toJsFn)
    __obj.updateDynamic("getParentTable")(getParentTable.toJsFn)
    __obj.updateDynamic("getRowIndex")(getRowIndex.toJsFn)
    __obj.updateDynamic("getRowSpan")(getRowSpan.toJsFn)
    __obj.updateDynamic("getText")(getText.toJsFn)
    __obj.updateDynamic("setContentAlignment")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment) => setContentAlignment(t0).runNow()))
    __obj.asInstanceOf[TableCell]
  }
}

