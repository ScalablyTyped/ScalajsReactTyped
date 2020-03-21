package typingsJapgolly.reactTable

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-table.react-table.TableToggleAllRowsSelectedProps> */
trait PartialTableToggleAllRows extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[AnonCursor] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PartialTableToggleAllRows {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    onChange: js.UndefOr[Callback] = js.undefined,
    style: AnonCursor = null,
    title: String = null
  ): PartialTableToggleAllRows = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    onChange.foreach(p => __obj.updateDynamic("onChange")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTableToggleAllRows]
  }
}

