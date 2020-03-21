package typingsJapgolly.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowHoverEventArgs extends js.Object {
  /** Returns the hovered row cell
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Returns the hovered row.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns the hovered record details
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the hovered row index.
    */
  var rowIndex: js.UndefOr[js.Any] = js.undefined
}

object RowHoverEventArgs {
  @scala.inline
  def apply(cell: js.Any = null, row: js.Any = null, rowData: js.Any = null, rowIndex: js.Any = null): RowHoverEventArgs = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowHoverEventArgs]
  }
}

