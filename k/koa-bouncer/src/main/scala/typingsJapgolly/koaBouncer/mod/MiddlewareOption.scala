package typingsJapgolly.koaBouncer.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOption extends js.Object {
  var getBody: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.undefined
  var getParams: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.undefined
  var getQuery: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.undefined
}

object MiddlewareOption {
  @scala.inline
  def apply(
    getBody: /* ctx */ Context => CallbackTo[js.Any] = null,
    getParams: /* ctx */ Context => CallbackTo[js.Any] = null,
    getQuery: /* ctx */ Context => CallbackTo[js.Any] = null
  ): MiddlewareOption = {
    val __obj = js.Dynamic.literal()
    if (getBody != null) __obj.updateDynamic("getBody")(js.Any.fromFunction1((t0: /* ctx */ typingsJapgolly.koa.mod.Context) => getBody(t0).runNow()))
    if (getParams != null) __obj.updateDynamic("getParams")(js.Any.fromFunction1((t0: /* ctx */ typingsJapgolly.koa.mod.Context) => getParams(t0).runNow()))
    if (getQuery != null) __obj.updateDynamic("getQuery")(js.Any.fromFunction1((t0: /* ctx */ typingsJapgolly.koa.mod.Context) => getQuery(t0).runNow()))
    __obj.asInstanceOf[MiddlewareOption]
  }
}

