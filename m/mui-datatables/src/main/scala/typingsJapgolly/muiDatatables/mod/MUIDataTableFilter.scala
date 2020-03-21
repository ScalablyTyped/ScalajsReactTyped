package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableFilter extends js.Object {
  var classes: js.UndefOr[js.Object] = js.undefined
  var filterData: js.Array[_]
  var filterList: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  var onFilterRest: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var onFilterUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var options: js.Object
}

object MUIDataTableFilter {
  @scala.inline
  def apply(
    filterData: js.Array[_],
    options: js.Object,
    classes: js.Object = null,
    filterList: js.Array[js.Array[String]] = null,
    onFilterRest: /* args */ js.Any => CallbackTo[js.Any] = null,
    onFilterUpdate: /* args */ js.Any => CallbackTo[js.Any] = null
  ): MUIDataTableFilter = {
    val __obj = js.Dynamic.literal(filterData = filterData.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (filterList != null) __obj.updateDynamic("filterList")(filterList.asInstanceOf[js.Any])
    if (onFilterRest != null) __obj.updateDynamic("onFilterRest")(js.Any.fromFunction1((t0: /* args */ js.Any) => onFilterRest(t0).runNow()))
    if (onFilterUpdate != null) __obj.updateDynamic("onFilterUpdate")(js.Any.fromFunction1((t0: /* args */ js.Any) => onFilterUpdate(t0).runNow()))
    __obj.asInstanceOf[MUIDataTableFilter]
  }
}

