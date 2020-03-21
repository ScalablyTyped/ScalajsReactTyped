package typingsJapgolly.jupyterlabServices

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsJapgolly.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services/lib/serverconnection.ServerConnection.ISettings> */
trait PartialISettings extends js.Object {
  var Headers: js.UndefOr[AnonInstantiable] = js.undefined
  var Request: js.UndefOr[AnonInstantiableRequest] = js.undefined
  var WebSocket: js.UndefOr[AnonCLOSED] = js.undefined
  var appUrl: js.UndefOr[String] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var fetch: js.UndefOr[
    js.Function2[/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
  ] = js.undefined
  var init: js.UndefOr[RequestInit] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var wsUrl: js.UndefOr[String] = js.undefined
}

object PartialISettings {
  @scala.inline
  def apply(
    Headers: AnonInstantiable = null,
    Request: AnonInstantiableRequest = null,
    WebSocket: AnonCLOSED = null,
    appUrl: String = null,
    baseUrl: String = null,
    fetch: (/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit]) => CallbackTo[js.Promise[Response]] = null,
    init: RequestInit = null,
    token: String = null,
    wsUrl: String = null
  ): PartialISettings = {
    val __obj = js.Dynamic.literal()
    if (Headers != null) __obj.updateDynamic("Headers")(Headers.asInstanceOf[js.Any])
    if (Request != null) __obj.updateDynamic("Request")(Request.asInstanceOf[js.Any])
    if (WebSocket != null) __obj.updateDynamic("WebSocket")(WebSocket.asInstanceOf[js.Any])
    if (appUrl != null) __obj.updateDynamic("appUrl")(appUrl.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: /* input */ typingsJapgolly.std.RequestInfo, t1: /* init */ js.UndefOr[org.scalajs.dom.experimental.RequestInit]) => fetch(t0, t1).runNow()))
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (wsUrl != null) __obj.updateDynamic("wsUrl")(wsUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialISettings]
  }
}

