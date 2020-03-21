package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableBodyRow extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[js.Object] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var options: js.Object
  var rowSelected: js.UndefOr[Boolean] = js.undefined
}

object MUIDataTableBodyRow {
  @scala.inline
  def apply(
    options: js.Object,
    className: String = null,
    classes: js.Object = null,
    onClick: /* args */ js.Any => CallbackTo[js.Any] = null,
    rowSelected: js.UndefOr[Boolean] = js.undefined
  ): MUIDataTableBodyRow = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* args */ js.Any) => onClick(t0).runNow()))
    if (!js.isUndefined(rowSelected)) __obj.updateDynamic("rowSelected")(rowSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableBodyRow]
  }
}

