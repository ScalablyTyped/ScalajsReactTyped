package typingsJapgolly.recompose.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// setObservableConfig: https://github.com/acdlite/recompose/blob/master/docs/API.md#setObservableConfig
trait ObservableConfig extends js.Object {
  var fromESObservable: js.UndefOr[js.Function1[/* observable */ Subscribable[_], _]] = js.undefined
  var toESObservable: js.UndefOr[js.Function1[/* stream */ js.Any, Subscribable[_]]] = js.undefined
}

object ObservableConfig {
  @scala.inline
  def apply(
    fromESObservable: /* observable */ Subscribable[js.Any] => CallbackTo[js.Any] = null,
    toESObservable: /* stream */ js.Any => CallbackTo[Subscribable[js.Any]] = null
  ): ObservableConfig = {
    val __obj = js.Dynamic.literal()
    if (fromESObservable != null) __obj.updateDynamic("fromESObservable")(js.Any.fromFunction1((t0: /* observable */ typingsJapgolly.recompose.mod.Subscribable[js.Any]) => fromESObservable(t0).runNow()))
    if (toESObservable != null) __obj.updateDynamic("toESObservable")(js.Any.fromFunction1((t0: /* stream */ js.Any) => toESObservable(t0).runNow()))
    __obj.asInstanceOf[ObservableConfig]
  }
}

