package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableToolbarSelect extends js.Object {
  var classes: js.UndefOr[js.Object] = js.undefined
  var displayData: js.UndefOr[js.Any] = js.undefined
  var onRowsDelete: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var options: js.Object
  var rowSelected: js.UndefOr[Boolean] = js.undefined
  var selectRowUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
}

object MUIDataTableToolbarSelect {
  @scala.inline
  def apply(
    options: js.Object,
    classes: js.Object = null,
    displayData: js.Any = null,
    onRowsDelete: /* args */ js.Any => CallbackTo[js.Any] = null,
    rowSelected: js.UndefOr[Boolean] = js.undefined,
    selectRowUpdate: /* args */ js.Any => CallbackTo[js.Any] = null
  ): MUIDataTableToolbarSelect = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (displayData != null) __obj.updateDynamic("displayData")(displayData.asInstanceOf[js.Any])
    if (onRowsDelete != null) __obj.updateDynamic("onRowsDelete")(js.Any.fromFunction1((t0: /* args */ js.Any) => onRowsDelete(t0).runNow()))
    if (!js.isUndefined(rowSelected)) __obj.updateDynamic("rowSelected")(rowSelected.asInstanceOf[js.Any])
    if (selectRowUpdate != null) __obj.updateDynamic("selectRowUpdate")(js.Any.fromFunction1((t0: /* args */ js.Any) => selectRowUpdate(t0).runNow()))
    __obj.asInstanceOf[MUIDataTableToolbarSelect]
  }
}

