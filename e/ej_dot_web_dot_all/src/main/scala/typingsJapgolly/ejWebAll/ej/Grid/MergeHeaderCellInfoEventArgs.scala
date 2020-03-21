package typingsJapgolly.ejWebAll.ej.Grid

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeHeaderCellInfoEventArgs extends js.Object {
  /** Returns the column headers.
    */
  var columnHeaders: js.UndefOr[js.Any] = js.undefined
  /** Method to merge the header cells.
    */
  var headerCellMerge: js.UndefOr[js.Function2[/* startIndex */ Double, /* count */ Double, Unit]] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
}

object MergeHeaderCellInfoEventArgs {
  @scala.inline
  def apply(
    columnHeaders: js.Any = null,
    headerCellMerge: (/* startIndex */ Double, /* count */ Double) => Callback = null,
    model: js.Any = null
  ): MergeHeaderCellInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders.asInstanceOf[js.Any])
    if (headerCellMerge != null) __obj.updateDynamic("headerCellMerge")(js.Any.fromFunction2((t0: /* startIndex */ scala.Double, t1: /* count */ scala.Double) => headerCellMerge(t0, t1).runNow()))
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeHeaderCellInfoEventArgs]
  }
}

