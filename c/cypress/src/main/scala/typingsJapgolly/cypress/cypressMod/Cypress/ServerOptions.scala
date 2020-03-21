package typingsJapgolly.cypress.cypressMod.Cypress

import japgolly.scalajs.react.Callback
import org.scalajs.dom.experimental.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Setting default options for cy.server()
  * @see https://on.cypress.io/server
  */
trait ServerOptions extends js.Object {
  var delay: Double
  var enable: Boolean
  var force404: Boolean
  var headers: js.Object
  var method: HttpMethod
  var response: js.Any
  var status: Double
  var urlMatchingOptions: js.Object
  def onAbort(args: js.Any*): Unit
  def onAnyAbort(route: RouteOptions, proxy: js.Any): Unit
  def onAnyRequest(route: RouteOptions, proxy: js.Any): Unit
  def onAnyResponse(route: RouteOptions, proxy: js.Any): Unit
  def onRequest(args: js.Any*): Unit
  def onResponse(args: js.Any*): Unit
  def whitelist(xhr: Request): Unit
}

object ServerOptions {
  @scala.inline
  def apply(
    delay: Double,
    enable: Boolean,
    force404: Boolean,
    headers: js.Object,
    method: HttpMethod,
    onAbort: /* repeated */ js.Any => Callback,
    onAnyAbort: (RouteOptions, js.Any) => Callback,
    onAnyRequest: (RouteOptions, js.Any) => Callback,
    onAnyResponse: (RouteOptions, js.Any) => Callback,
    onRequest: /* repeated */ js.Any => Callback,
    onResponse: /* repeated */ js.Any => Callback,
    response: js.Any,
    status: Double,
    urlMatchingOptions: js.Object,
    whitelist: Request => Callback
  ): ServerOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], force404 = force404.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], urlMatchingOptions = urlMatchingOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onAbort(t0).runNow()))
    __obj.updateDynamic("onAnyAbort")(js.Any.fromFunction2((t0: typingsJapgolly.cypress.cypressMod.Cypress.RouteOptions, t1: js.Any) => onAnyAbort(t0, t1).runNow()))
    __obj.updateDynamic("onAnyRequest")(js.Any.fromFunction2((t0: typingsJapgolly.cypress.cypressMod.Cypress.RouteOptions, t1: js.Any) => onAnyRequest(t0, t1).runNow()))
    __obj.updateDynamic("onAnyResponse")(js.Any.fromFunction2((t0: typingsJapgolly.cypress.cypressMod.Cypress.RouteOptions, t1: js.Any) => onAnyResponse(t0, t1).runNow()))
    __obj.updateDynamic("onRequest")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onRequest(t0).runNow()))
    __obj.updateDynamic("onResponse")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onResponse(t0).runNow()))
    __obj.updateDynamic("whitelist")(js.Any.fromFunction1((t0: org.scalajs.dom.experimental.Request) => whitelist(t0).runNow()))
    __obj.asInstanceOf[ServerOptions]
  }
}

