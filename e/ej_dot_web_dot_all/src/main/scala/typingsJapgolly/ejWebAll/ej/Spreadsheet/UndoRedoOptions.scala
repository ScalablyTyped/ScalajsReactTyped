package typingsJapgolly.ejWebAll.ej.Spreadsheet

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndoRedoOptions extends js.Object {
  /** Pass the action to update undo and redo collection
    */
  var action: js.UndefOr[String] = js.undefined
  /** Pass the cell to update undo and redo collection
    */
  var cell: js.UndefOr[HTMLElement] = js.undefined
  /** Pass the sheet index to update undo and redo collection
    */
  var sheetIndex: js.UndefOr[Double] = js.undefined
}

object UndoRedoOptions {
  @scala.inline
  def apply(action: String = null, cell: HTMLElement = null, sheetIndex: Int | Double = null): UndoRedoOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (sheetIndex != null) __obj.updateDynamic("sheetIndex")(sheetIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndoRedoOptions]
  }
}

