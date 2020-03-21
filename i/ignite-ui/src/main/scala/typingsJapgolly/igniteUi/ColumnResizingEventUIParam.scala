package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResizingEventUIParam extends js.Object {
  /**
  	 * Gets the resized column index.
  	 */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the resized column key.
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the desired width(before min/max coercion) for the resized column.
  	 */
  var desiredWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets a reference to the GridResizing widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnResizingEventUIParam {
  @scala.inline
  def apply(
    columnIndex: Int | Double = null,
    columnKey: String = null,
    desiredWidth: Int | Double = null,
    owner: js.Any = null
  ): ColumnResizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (desiredWidth != null) __obj.updateDynamic("desiredWidth")(desiredWidth.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnResizingEventUIParam]
  }
}

