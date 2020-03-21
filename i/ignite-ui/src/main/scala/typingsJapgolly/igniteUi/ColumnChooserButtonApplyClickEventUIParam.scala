package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnChooserButtonApplyClickEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the Column Chooser element. This is a jQuery object.
  	 */
  var columnChooserElement: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the array of columns identifiers which should be hidden.
  	 */
  var columnsToHide: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets the array of columns identifiers which should be shown.
  	 */
  var columnsToShow: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets a reference to the GridHiding widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnChooserButtonApplyClickEventUIParam {
  @scala.inline
  def apply(
    columnChooserElement: String = null,
    columnsToHide: js.Array[_] = null,
    columnsToShow: js.Array[_] = null,
    owner: js.Any = null
  ): ColumnChooserButtonApplyClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnChooserElement != null) __obj.updateDynamic("columnChooserElement")(columnChooserElement.asInstanceOf[js.Any])
    if (columnsToHide != null) __obj.updateDynamic("columnsToHide")(columnsToHide.asInstanceOf[js.Any])
    if (columnsToShow != null) __obj.updateDynamic("columnsToShow")(columnsToShow.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnChooserButtonApplyClickEventUIParam]
  }
}

