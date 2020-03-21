package typingsJapgolly.scopedHttpClient.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.httpMod.ClientRequestArgs
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends ClientRequestArgs {
  var encoding: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var httpAgent: js.UndefOr[Agent | Boolean] = js.undefined
  var httpsAgent: js.UndefOr[Agent | Boolean] = js.undefined
  var pathname: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[js.Any] = js.undefined
  var slashes: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    _defaultAgent: Agent = null,
    agent: Agent | Boolean = null,
    auth: String = null,
    createConnection: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit]) => CallbackTo[Socket] = null,
    defaultPort: Double | String = null,
    encoding: String = null,
    family: Int | Double = null,
    hash: String = null,
    headers: OutgoingHttpHeaders = null,
    host: String = null,
    hostname: String = null,
    httpAgent: Agent | Boolean = null,
    httpsAgent: Agent | Boolean = null,
    localAddress: String = null,
    maxHeaderSize: Int | Double = null,
    method: String = null,
    path: String = null,
    pathname: String = null,
    port: Double | String = null,
    protocol: String = null,
    query: js.Any = null,
    setHost: js.UndefOr[Boolean] = js.undefined,
    slashes: js.Any = null,
    socketPath: String = null,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2((t0: /* options */ typingsJapgolly.node.httpMod.ClientRequestArgs, t1: /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ typingsJapgolly.node.netMod.Socket, scala.Unit]) => createConnection(t0, t1).runNow()))
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (httpAgent != null) __obj.updateDynamic("httpAgent")(httpAgent.asInstanceOf[js.Any])
    if (httpsAgent != null) __obj.updateDynamic("httpsAgent")(httpsAgent.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (maxHeaderSize != null) __obj.updateDynamic("maxHeaderSize")(maxHeaderSize.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost.asInstanceOf[js.Any])
    if (slashes != null) __obj.updateDynamic("slashes")(slashes.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

