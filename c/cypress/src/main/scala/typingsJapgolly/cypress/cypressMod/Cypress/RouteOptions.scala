package typingsJapgolly.cypress.cypressMod.Cypress

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  var delay: Double
  var force404: Boolean
  var headers: js.Object | Null
  var method: HttpMethod
  var response: js.Any
  var status: Double
  var url: String | js.RegExp
  def onAbort(args: js.Any*): Unit
  def onRequest(args: js.Any*): Unit
  def onResponse(args: js.Any*): Unit
}

object RouteOptions {
  @scala.inline
  def apply(
    delay: Double,
    force404: Boolean,
    method: HttpMethod,
    onAbort: /* repeated */ js.Any => Callback,
    onRequest: /* repeated */ js.Any => Callback,
    onResponse: /* repeated */ js.Any => Callback,
    response: js.Any,
    status: Double,
    url: String | js.RegExp,
    headers: js.Object = null
  ): RouteOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], force404 = force404.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onAbort(t0).runNow()))
    __obj.updateDynamic("onRequest")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onRequest(t0).runNow()))
    __obj.updateDynamic("onResponse")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onResponse(t0).runNow()))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptions]
  }
}

