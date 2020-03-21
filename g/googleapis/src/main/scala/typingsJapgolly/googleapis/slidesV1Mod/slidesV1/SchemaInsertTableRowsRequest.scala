package typingsJapgolly.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts rows into a table.
  */
@js.native
trait SchemaInsertTableRowsRequest extends js.Object {
  /**
    * The reference table cell location from which rows will be inserted.  A
    * new row will be inserted above (or below) the row where the reference
    * cell is. If the reference cell is a merged cell, a new row will be
    * inserted above (or below) the merged cell.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
  /**
    * Whether to insert new rows below the reference cell location.  - `True`:
    * insert below the cell. - `False`: insert above the cell.
    */
  var insertBelow: js.UndefOr[Boolean] = js.native
  /**
    * The number of rows to be inserted. Maximum 20 per request.
    */
  var number: js.UndefOr[Double] = js.native
  /**
    * The table to insert rows into.
    */
  var tableObjectId: js.UndefOr[String] = js.native
}

object SchemaInsertTableRowsRequest {
  @scala.inline
  def apply(
    cellLocation: SchemaTableCellLocation = null,
    insertBelow: js.UndefOr[Boolean] = js.undefined,
    number: Int | Double = null,
    tableObjectId: String = null
  ): SchemaInsertTableRowsRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(insertBelow)) __obj.updateDynamic("insertBelow")(insertBelow.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (tableObjectId != null) __obj.updateDynamic("tableObjectId")(tableObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInsertTableRowsRequest]
  }
}

