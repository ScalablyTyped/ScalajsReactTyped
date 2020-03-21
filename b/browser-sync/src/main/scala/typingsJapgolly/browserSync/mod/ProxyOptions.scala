package typingsJapgolly.browserSync.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
  var error: js.UndefOr[
    js.Function3[/* err */ ErrnoException, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]
  ] = js.undefined
  var middleware: js.UndefOr[MiddlewareHandler] = js.undefined
  var proxyReq: js.UndefOr[
    (js.Array[js.Function1[/* res */ IncomingMessage, Unit]]) | (js.Function1[/* res */ IncomingMessage, Unit])
  ] = js.undefined
  var proxyRes: js.UndefOr[ProxyResponseMiddleware | js.Array[ProxyResponseMiddleware]] = js.undefined
  var reqHeaders: js.UndefOr[js.Function1[/* config */ js.Object, Hash[js.Object]]] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var ws: js.UndefOr[Boolean] = js.undefined
}

object ProxyOptions {
  @scala.inline
  def apply(
    error: (/* err */ ErrnoException, /* req */ IncomingMessage, /* res */ ServerResponse) => Callback = null,
    middleware: (/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ js.Function0[Unit]) => CallbackTo[js.Any] = null,
    proxyReq: (js.Array[js.Function1[/* res */ IncomingMessage, Unit]]) | (js.Function1[/* res */ IncomingMessage, Unit]) = null,
    proxyRes: ProxyResponseMiddleware | js.Array[ProxyResponseMiddleware] = null,
    reqHeaders: /* config */ js.Object => CallbackTo[Hash[js.Object]] = null,
    target: String = null,
    ws: js.UndefOr[Boolean] = js.undefined
  ): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3((t0: /* err */ typingsJapgolly.node.NodeJS.ErrnoException, t1: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t2: /* res */ typingsJapgolly.node.httpMod.ServerResponse) => error(t0, t1, t2).runNow()))
    if (middleware != null) __obj.updateDynamic("middleware")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t1: /* res */ typingsJapgolly.node.httpMod.ServerResponse, t2: /* next */ js.Function0[scala.Unit]) => middleware(t0, t1, t2).runNow()))
    if (proxyReq != null) __obj.updateDynamic("proxyReq")(proxyReq.asInstanceOf[js.Any])
    if (proxyRes != null) __obj.updateDynamic("proxyRes")(proxyRes.asInstanceOf[js.Any])
    if (reqHeaders != null) __obj.updateDynamic("reqHeaders")(js.Any.fromFunction1((t0: /* config */ js.Object) => reqHeaders(t0).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(ws)) __obj.updateDynamic("ws")(ws.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyOptions]
  }
}

