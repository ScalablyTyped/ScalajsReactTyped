package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableFilterList extends js.Object {
  var classes: js.UndefOr[js.Object] = js.undefined
  var filterList: js.Array[js.Array[String]]
  var onFilterUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
}

object MUIDataTableFilterList {
  @scala.inline
  def apply(
    filterList: js.Array[js.Array[String]],
    classes: js.Object = null,
    onFilterUpdate: /* args */ js.Any => CallbackTo[js.Any] = null
  ): MUIDataTableFilterList = {
    val __obj = js.Dynamic.literal(filterList = filterList.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (onFilterUpdate != null) __obj.updateDynamic("onFilterUpdate")(js.Any.fromFunction1((t0: /* args */ js.Any) => onFilterUpdate(t0).runNow()))
    __obj.asInstanceOf[MUIDataTableFilterList]
  }
}

