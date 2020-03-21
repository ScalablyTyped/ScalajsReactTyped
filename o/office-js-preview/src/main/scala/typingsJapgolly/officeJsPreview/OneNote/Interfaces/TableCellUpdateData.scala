package typingsJapgolly.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableCell object, for use in "tableCell.set({ ... })". */
trait TableCellUpdateData extends js.Object {
  /**
    *
    * Gets and sets the shading color of the cell
    *
    * [Api set: OneNoteApi 1.1]
    */
  var shadingColor: js.UndefOr[String] = js.undefined
}

object TableCellUpdateData {
  @scala.inline
  def apply(shadingColor: String = null): TableCellUpdateData = {
    val __obj = js.Dynamic.literal()
    if (shadingColor != null) __obj.updateDynamic("shadingColor")(shadingColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellUpdateData]
  }
}

