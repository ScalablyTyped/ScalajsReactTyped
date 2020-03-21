package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of one or more TableCell instances.
  */
trait TableCellRange extends js.Object {
  def getTableCells(): js.Array[TableCell]
}

object TableCellRange {
  @scala.inline
  def apply(getTableCells: CallbackTo[js.Array[TableCell]]): TableCellRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTableCells")(getTableCells.toJsFn)
    __obj.asInstanceOf[TableCellRange]
  }
}

