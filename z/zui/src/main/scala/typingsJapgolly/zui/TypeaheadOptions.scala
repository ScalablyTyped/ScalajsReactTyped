package typingsJapgolly.zui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeaheadOptions extends js.Object {
  var highlighter: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.undefined
  var items: js.UndefOr[Double] = js.undefined
  var matcher: js.UndefOr[js.Function1[/* item */ js.Any, Boolean]] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var sorter: js.UndefOr[js.Function1[/* items */ js.Array[_], js.Array[_]]] = js.undefined
  var source: js.UndefOr[js.Any] = js.undefined
  var updater: js.UndefOr[js.Function1[/* item */ js.Any, _]] = js.undefined
}

object TypeaheadOptions {
  @scala.inline
  def apply(
    highlighter: /* item */ js.Any => CallbackTo[String] = null,
    items: Int | Double = null,
    matcher: /* item */ js.Any => CallbackTo[Boolean] = null,
    minLength: Int | Double = null,
    sorter: /* items */ js.Array[js.Any] => CallbackTo[js.Array[js.Any]] = null,
    source: js.Any = null,
    updater: /* item */ js.Any => CallbackTo[js.Any] = null
  ): TypeaheadOptions = {
    val __obj = js.Dynamic.literal()
    if (highlighter != null) __obj.updateDynamic("highlighter")(js.Any.fromFunction1((t0: /* item */ js.Any) => highlighter(t0).runNow()))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction1((t0: /* item */ js.Any) => matcher(t0).runNow()))
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(js.Any.fromFunction1((t0: /* items */ js.Array[js.Any]) => sorter(t0).runNow()))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction1((t0: /* item */ js.Any) => updater(t0).runNow()))
    __obj.asInstanceOf[TypeaheadOptions]
  }
}

