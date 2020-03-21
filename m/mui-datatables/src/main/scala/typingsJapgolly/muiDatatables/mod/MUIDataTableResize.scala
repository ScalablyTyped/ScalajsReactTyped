package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableResize extends js.Object {
  var classes: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var rowSelected: js.UndefOr[Boolean] = js.undefined
  var setResizeable: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var updateDividers: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
}

object MUIDataTableResize {
  @scala.inline
  def apply(
    classes: js.Object = null,
    options: js.Object = null,
    rowSelected: js.UndefOr[Boolean] = js.undefined,
    setResizeable: /* args */ js.Any => CallbackTo[js.Any] = null,
    updateDividers: /* args */ js.Any => CallbackTo[js.Any] = null
  ): MUIDataTableResize = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSelected)) __obj.updateDynamic("rowSelected")(rowSelected.asInstanceOf[js.Any])
    if (setResizeable != null) __obj.updateDynamic("setResizeable")(js.Any.fromFunction1((t0: /* args */ js.Any) => setResizeable(t0).runNow()))
    if (updateDividers != null) __obj.updateDynamic("updateDividers")(js.Any.fromFunction1((t0: /* args */ js.Any) => updateDividers(t0).runNow()))
    __obj.asInstanceOf[MUIDataTableResize]
  }
}

