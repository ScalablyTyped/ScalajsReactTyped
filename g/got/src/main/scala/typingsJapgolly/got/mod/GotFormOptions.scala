package typingsJapgolly.got.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.got.gotBooleans.`true`
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.httpMod.ClientRequestArgs
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.tlsMod.KeyObject
import typingsJapgolly.node.tlsMod.PxfObject
import typingsJapgolly.node.tlsMod.SecureVersion
import typingsJapgolly.node.urlMod.URLSearchParams
import typingsJapgolly.std.Record
import typingsJapgolly.toughCookie.mod.CookieJar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GotFormOptions[E /* <: String | Null */] extends GotOptions[E] {
  var body: js.UndefOr[Record[String, _]] = js.undefined
  var form: `true`
  var hooks: js.UndefOr[Hooks[GotFormOptions[E], Record[String, _]]] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
}

object GotFormOptions {
  @scala.inline
  def apply[E /* <: String | Null */](
    form: `true`,
    _defaultAgent: Agent = null,
    agent: Agent | Boolean | AgentOptions = null,
    auth: String = null,
    baseUrl: String = null,
    body: Record[String, _] = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cache: Cache = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    cookieJar: CookieJar = null,
    createConnection: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit]) => CallbackTo[Socket] = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    decompress: js.UndefOr[Boolean] = js.undefined,
    defaultPort: Double | String = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    encoding: E = null,
    family: Int | Double = null,
    followRedirect: js.UndefOr[Boolean] = js.undefined,
    headers: OutgoingHttpHeaders = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    hooks: Hooks[GotFormOptions[E], Record[String, _]] = null,
    host: String = null,
    hostname: String = null,
    json: js.UndefOr[Boolean] = js.undefined,
    key: String | Buffer | (js.Array[Buffer | KeyObject]) = null,
    localAddress: String = null,
    maxHeaderSize: Int | Double = null,
    maxVersion: SecureVersion = null,
    method: String = null,
    minVersion: SecureVersion = null,
    passphrase: String = null,
    path: String = null,
    pfx: String | Buffer | (js.Array[String | Buffer | PxfObject]) = null,
    port: Double | String = null,
    privateKeyEngine: String = null,
    privateKeyIdentifier: String = null,
    protocol: String = null,
    query: (Record[String, _]) | URLSearchParams | String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    request: RequestFunction = null,
    retry: Double | RetryOptions = null,
    secureOptions: Int | Double = null,
    secureProtocol: String = null,
    servername: String = null,
    sessionIdContext: String = null,
    setHost: js.UndefOr[Boolean] = js.undefined,
    sigalgs: String = null,
    socketPath: String = null,
    throwHttpErrors: js.UndefOr[Boolean] = js.undefined,
    timeout: Double | TimeoutOptions = null,
    useElectronNet: js.UndefOr[Boolean] = js.undefined
  ): GotFormOptions[E] = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine.asInstanceOf[js.Any])
    if (cookieJar != null) __obj.updateDynamic("cookieJar")(cookieJar.asInstanceOf[js.Any])
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2((t0: /* options */ typingsJapgolly.node.httpMod.ClientRequestArgs, t1: /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ typingsJapgolly.node.netMod.Socket, scala.Unit]) => createConnection(t0, t1).runNow()))
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (!js.isUndefined(decompress)) __obj.updateDynamic("decompress")(decompress.asInstanceOf[js.Any])
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (maxHeaderSize != null) __obj.updateDynamic("maxHeaderSize")(maxHeaderSize.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (privateKeyEngine != null) __obj.updateDynamic("privateKeyEngine")(privateKeyEngine.asInstanceOf[js.Any])
    if (privateKeyIdentifier != null) __obj.updateDynamic("privateKeyIdentifier")(privateKeyIdentifier.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost.asInstanceOf[js.Any])
    if (sigalgs != null) __obj.updateDynamic("sigalgs")(sigalgs.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (!js.isUndefined(throwHttpErrors)) __obj.updateDynamic("throwHttpErrors")(throwHttpErrors.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useElectronNet)) __obj.updateDynamic("useElectronNet")(useElectronNet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotFormOptions[E]]
  }
}

