package typingsJapgolly.cypress.cypressMod.Cypress

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends RouteOptions {
  var enable: Boolean
  def whitelist(xhr: js.Any): Boolean
}

object Server {
  @scala.inline
  def apply(
    delay: Double,
    enable: Boolean,
    force404: Boolean,
    method: HttpMethod,
    onAbort: /* repeated */ js.Any => Callback,
    onRequest: /* repeated */ js.Any => Callback,
    onResponse: /* repeated */ js.Any => Callback,
    response: js.Any,
    status: Double,
    url: String | js.RegExp,
    whitelist: js.Any => CallbackTo[Boolean],
    headers: js.Object = null
  ): Server = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], force404 = force404.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onAbort(t0).runNow()))
    __obj.updateDynamic("onRequest")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onRequest(t0).runNow()))
    __obj.updateDynamic("onResponse")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onResponse(t0).runNow()))
    __obj.updateDynamic("whitelist")(js.Any.fromFunction1((t0: js.Any) => whitelist(t0).runNow()))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
}

