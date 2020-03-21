package typingsJapgolly.formData.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.formData.formDataStrings.httpColon
import typingsJapgolly.formData.formDataStrings.httpsColon
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.httpMod.ClientRequestArgs
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitOptions extends ClientRequestArgs {
  @JSName("protocol")
  var protocol_SubmitOptions: js.UndefOr[httpsColon | httpColon] = js.undefined
}

object SubmitOptions {
  @scala.inline
  def apply(
    _defaultAgent: Agent = null,
    agent: Agent | Boolean = null,
    auth: String = null,
    createConnection: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit]) => CallbackTo[Socket] = null,
    defaultPort: Double | String = null,
    family: Int | Double = null,
    headers: OutgoingHttpHeaders = null,
    host: String = null,
    hostname: String = null,
    localAddress: String = null,
    maxHeaderSize: Int | Double = null,
    method: String = null,
    path: String = null,
    port: Double | String = null,
    protocol: httpsColon | httpColon = null,
    setHost: js.UndefOr[Boolean] = js.undefined,
    socketPath: String = null,
    timeout: Int | Double = null
  ): SubmitOptions = {
    val __obj = js.Dynamic.literal()
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2((t0: /* options */ typingsJapgolly.node.httpMod.ClientRequestArgs, t1: /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ typingsJapgolly.node.netMod.Socket, scala.Unit]) => createConnection(t0, t1).runNow()))
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (maxHeaderSize != null) __obj.updateDynamic("maxHeaderSize")(maxHeaderSize.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitOptions]
  }
}

