package typingsJapgolly.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTableColumnRequest extends js.Object {
  /**
    * The reference table cell location from which a column will be deleted.
    *
    * The column this cell spans will be deleted. If this is a merged cell,
    * multiple columns will be deleted. If no columns remain in the table after
    * this deletion, the whole table is deleted.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  /** The table to delete columns from. */
  var tableObjectId: js.UndefOr[String] = js.undefined
}

object DeleteTableColumnRequest {
  @scala.inline
  def apply(cellLocation: TableCellLocation = null, tableObjectId: String = null): DeleteTableColumnRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (tableObjectId != null) __obj.updateDynamic("tableObjectId")(tableObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTableColumnRequest]
  }
}

