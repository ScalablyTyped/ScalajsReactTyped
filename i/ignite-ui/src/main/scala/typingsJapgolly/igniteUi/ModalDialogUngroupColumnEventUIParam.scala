package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDialogUngroupColumnEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the current groupedColumns.
  	 */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets the key of the column to be grouped.
  	 */
  var key: js.UndefOr[String] = js.undefined
  /**
  	 * Get a reference to the current layout object, if any.
  	 */
  var layout: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets access the GroupBy widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ModalDialogUngroupColumnEventUIParam {
  @scala.inline
  def apply(
    groupedColumns: js.Array[_] = null,
    key: String = null,
    layout: js.Any = null,
    owner: js.Any = null
  ): ModalDialogUngroupColumnEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (groupedColumns != null) __obj.updateDynamic("groupedColumns")(groupedColumns.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalDialogUngroupColumnEventUIParam]
  }
}

