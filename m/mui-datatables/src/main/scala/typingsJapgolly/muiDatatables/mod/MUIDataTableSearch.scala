package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableSearch extends js.Object {
  var classes: js.UndefOr[js.Object] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
}

object MUIDataTableSearch {
  @scala.inline
  def apply(
    classes: js.Object = null,
    onHide: /* args */ js.Any => CallbackTo[js.Any] = null,
    onSearch: /* args */ js.Any => CallbackTo[js.Any] = null,
    options: js.Object = null
  ): MUIDataTableSearch = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1((t0: /* args */ js.Any) => onHide(t0).runNow()))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1((t0: /* args */ js.Any) => onSearch(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableSearch]
  }
}

