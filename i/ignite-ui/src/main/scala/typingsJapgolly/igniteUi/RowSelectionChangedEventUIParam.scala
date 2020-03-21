package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowSelectionChangedEventUIParam extends js.Object {
  /**
  	 * Gets reference to GridSelection.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to the row object.
  	 */
  var row: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to rows object array.
  	 */
  var selectedRows: js.UndefOr[js.Array[_]] = js.undefined
}

object RowSelectionChangedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, row: js.Any = null, selectedRows: js.Array[_] = null): RowSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (selectedRows != null) __obj.updateDynamic("selectedRows")(selectedRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionChangedEventUIParam]
  }
}

