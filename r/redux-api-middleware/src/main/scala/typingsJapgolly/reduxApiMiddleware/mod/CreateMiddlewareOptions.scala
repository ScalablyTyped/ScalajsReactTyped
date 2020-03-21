package typingsJapgolly.reduxApiMiddleware.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Response
import typingsJapgolly.reduxApiMiddleware.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMiddlewareOptions extends js.Object {
  var fetch: js.UndefOr[FnCall] = js.undefined
  var ok: js.UndefOr[js.Function1[/* res */ Response, Boolean]] = js.undefined
}

object CreateMiddlewareOptions {
  @scala.inline
  def apply(fetch: FnCall = null, ok: /* res */ Response => CallbackTo[Boolean] = null): CreateMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(js.Any.fromFunction1((t0: /* res */ org.scalajs.dom.experimental.Response) => ok(t0).runNow()))
    __obj.asInstanceOf[CreateMiddlewareOptions]
  }
}

