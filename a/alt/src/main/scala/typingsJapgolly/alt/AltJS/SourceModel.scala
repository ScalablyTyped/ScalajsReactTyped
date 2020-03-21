package typingsJapgolly.alt.AltJS

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceModel[S] extends js.Object {
  var interceptResponse: js.UndefOr[
    js.Function3[/* response */ js.Any, /* action */ Action[_], /* repeated */ js.Any, _]
  ] = js.undefined
  var loading: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.undefined
  var local: js.UndefOr[js.Function2[/* state */ js.Any, /* repeated */ js.Any, _]] = js.undefined
  var shouldFetch: js.UndefOr[js.Function1[/* fetchFn */ js.Function1[/* repeated */ js.Any, Boolean], Unit]] = js.undefined
  def error(args: js.Any): Unit
  def remote(state: js.Any, args: js.Any*): js.Promise[S]
  def success(state: S): Unit
}

object SourceModel {
  @scala.inline
  def apply[S](
    error: js.Any => Callback,
    remote: (js.Any, /* repeated */ js.Any) => CallbackTo[js.Promise[S]],
    success: S => Callback,
    interceptResponse: (/* response */ js.Any, /* action */ Action[js.Any], /* repeated */ js.Any) => CallbackTo[js.Any] = null,
    loading: /* args */ js.Any => Callback = null,
    local: (/* state */ js.Any, /* repeated */ js.Any) => CallbackTo[js.Any] = null,
    shouldFetch: /* fetchFn */ js.Function1[/* repeated */ js.Any, Boolean] => Callback = null
  ): SourceModel[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    __obj.updateDynamic("remote")(js.Any.fromFunction2((t0: js.Any, t1: /* repeated */ js.Any) => remote(t0, t1).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: S) => success(t0).runNow()))
    if (interceptResponse != null) __obj.updateDynamic("interceptResponse")(js.Any.fromFunction3((t0: /* response */ js.Any, t1: /* action */ typingsJapgolly.alt.AltJS.Action[js.Any], t2: /* repeated */ js.Any) => interceptResponse(t0, t1, t2).runNow()))
    if (loading != null) __obj.updateDynamic("loading")(js.Any.fromFunction1((t0: /* args */ js.Any) => loading(t0).runNow()))
    if (local != null) __obj.updateDynamic("local")(js.Any.fromFunction2((t0: /* state */ js.Any, t1: /* repeated */ js.Any) => local(t0, t1).runNow()))
    if (shouldFetch != null) __obj.updateDynamic("shouldFetch")(js.Any.fromFunction1((t0: /* fetchFn */ js.Function1[/* repeated */ js.Any, scala.Boolean]) => shouldFetch(t0).runNow()))
    __obj.asInstanceOf[SourceModel[S]]
  }
}

