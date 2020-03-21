package typingsJapgolly.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds new cells after the last row with data in a sheet, inserting new rows
  * into the sheet if necessary.
  */
@js.native
trait SchemaAppendCellsRequest extends js.Object {
  /**
    * The fields of CellData that should be updated. At least one field must be
    * specified. The root is the CellData; &#39;row.values.&#39; should not be
    * specified. A single `&quot;*&quot;` can be used as short-hand for listing
    * every field.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The data to append.
    */
  var rows: js.UndefOr[js.Array[SchemaRowData]] = js.native
  /**
    * The sheet ID to append the data to.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object SchemaAppendCellsRequest {
  @scala.inline
  def apply(fields: String = null, rows: js.Array[SchemaRowData] = null, sheetId: Int | Double = null): SchemaAppendCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAppendCellsRequest]
  }
}

