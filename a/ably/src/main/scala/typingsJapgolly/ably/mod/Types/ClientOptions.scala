package typingsJapgolly.ably.mod.Types

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interfaces
trait ClientOptions extends AuthOptions {
  /**
  		 * When true will automatically connect to Ably when library is instanced. This is true by default
  		 */
  var autoConnect: js.UndefOr[Boolean] = js.undefined
  var closeOnUnload: js.UndefOr[Boolean] = js.undefined
  var defaultTokenParams: js.UndefOr[TokenParams] = js.undefined
  var disconnectedRetryTimeout: js.UndefOr[Double] = js.undefined
  /**
  		 * When true, messages published on channels by this client will be echoed back to this client.
  		 * This is true by default
  		 */
  var echoMessages: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Use this only if you have been provided a dedicated environment by Ably
  		 */
  var environment: js.UndefOr[String] = js.undefined
  var fallbackHosts: js.UndefOr[js.Array[String]] = js.undefined
  var fallbackHostsUseDefault: js.UndefOr[Boolean] = js.undefined
  var idempotentRestPublishing: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Logger configuration
  		 */
  var log: js.UndefOr[LogInfo] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  /**
  		 * When true, messages will be queued whilst the connection is disconnected. True by default.
  		 */
  var queueMessages: js.UndefOr[Boolean] = js.undefined
  var realtimeHost: js.UndefOr[String] = js.undefined
  /**
  		 * Can be used to explicitly recover a connection.
  		 * See https://www.ably.io/documentation/realtime/connection#connection-state-recovery
  		 */
  var recover: js.UndefOr[standardCallback | String] = js.undefined
  var restHost: js.UndefOr[String] = js.undefined
  var suspendedRetryTimeout: js.UndefOr[Double] = js.undefined
  /**
  		 * Use a non-secure connection connection. By default, a TLS connection is used to connect to Ably
  		 */
  var tls: js.UndefOr[Boolean] = js.undefined
  var tlsPort: js.UndefOr[Double] = js.undefined
  var transportParams: js.UndefOr[StringDictionary[String]] = js.undefined
  var transports: js.UndefOr[js.Array[Transport]] = js.undefined
  /**
  		 * When true, the more efficient MsgPack binary encoding is used.
  		 * When false, JSON text encoding is used.
  		 */
  var useBinaryProtocol: js.UndefOr[Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    authCallback: (/* data */ TokenParams, /* callback */ js.Function2[
      /* error */ ErrorInfo | String, 
      /* tokenRequestOrDetails */ TokenDetails | TokenRequest | String, 
      Unit
    ]) => Callback = null,
    authHeaders: StringDictionary[String] = null,
    authMethod: HTTPMethods = null,
    authParams: StringDictionary[String] = null,
    authUrl: String = null,
    autoConnect: js.UndefOr[Boolean] = js.undefined,
    clientId: String = null,
    closeOnUnload: js.UndefOr[Boolean] = js.undefined,
    defaultTokenParams: TokenParams = null,
    disconnectedRetryTimeout: Int | Double = null,
    echoMessages: js.UndefOr[Boolean] = js.undefined,
    environment: String = null,
    fallbackHosts: js.Array[String] = null,
    fallbackHostsUseDefault: js.UndefOr[Boolean] = js.undefined,
    idempotentRestPublishing: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    log: LogInfo = null,
    port: Int | Double = null,
    queryTime: js.UndefOr[Boolean] = js.undefined,
    queueMessages: js.UndefOr[Boolean] = js.undefined,
    realtimeHost: String = null,
    recover: standardCallback | String = null,
    restHost: String = null,
    suspendedRetryTimeout: Int | Double = null,
    tls: js.UndefOr[Boolean] = js.undefined,
    tlsPort: Int | Double = null,
    token: TokenDetails | String = null,
    tokenDetails: TokenDetails = null,
    transportParams: StringDictionary[String] = null,
    transports: js.Array[Transport] = null,
    useBinaryProtocol: js.UndefOr[Boolean] = js.undefined,
    useTokenAuth: js.UndefOr[Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (authCallback != null) __obj.updateDynamic("authCallback")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.ably.mod.Types.TokenParams, t1: /* callback */ js.Function2[
  /* error */ typingsJapgolly.ably.mod.Types.ErrorInfo | java.lang.String, 
  /* tokenRequestOrDetails */ typingsJapgolly.ably.mod.Types.TokenDetails | typingsJapgolly.ably.mod.Types.TokenRequest | java.lang.String, 
  scala.Unit]) => authCallback(t0, t1).runNow()))
    if (authHeaders != null) __obj.updateDynamic("authHeaders")(authHeaders.asInstanceOf[js.Any])
    if (authMethod != null) __obj.updateDynamic("authMethod")(authMethod.asInstanceOf[js.Any])
    if (authParams != null) __obj.updateDynamic("authParams")(authParams.asInstanceOf[js.Any])
    if (authUrl != null) __obj.updateDynamic("authUrl")(authUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(autoConnect)) __obj.updateDynamic("autoConnect")(autoConnect.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnUnload)) __obj.updateDynamic("closeOnUnload")(closeOnUnload.asInstanceOf[js.Any])
    if (defaultTokenParams != null) __obj.updateDynamic("defaultTokenParams")(defaultTokenParams.asInstanceOf[js.Any])
    if (disconnectedRetryTimeout != null) __obj.updateDynamic("disconnectedRetryTimeout")(disconnectedRetryTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(echoMessages)) __obj.updateDynamic("echoMessages")(echoMessages.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (fallbackHosts != null) __obj.updateDynamic("fallbackHosts")(fallbackHosts.asInstanceOf[js.Any])
    if (!js.isUndefined(fallbackHostsUseDefault)) __obj.updateDynamic("fallbackHostsUseDefault")(fallbackHostsUseDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(idempotentRestPublishing)) __obj.updateDynamic("idempotentRestPublishing")(idempotentRestPublishing.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(queryTime)) __obj.updateDynamic("queryTime")(queryTime.asInstanceOf[js.Any])
    if (!js.isUndefined(queueMessages)) __obj.updateDynamic("queueMessages")(queueMessages.asInstanceOf[js.Any])
    if (realtimeHost != null) __obj.updateDynamic("realtimeHost")(realtimeHost.asInstanceOf[js.Any])
    if (recover != null) __obj.updateDynamic("recover")(recover.asInstanceOf[js.Any])
    if (restHost != null) __obj.updateDynamic("restHost")(restHost.asInstanceOf[js.Any])
    if (suspendedRetryTimeout != null) __obj.updateDynamic("suspendedRetryTimeout")(suspendedRetryTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (tlsPort != null) __obj.updateDynamic("tlsPort")(tlsPort.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (tokenDetails != null) __obj.updateDynamic("tokenDetails")(tokenDetails.asInstanceOf[js.Any])
    if (transportParams != null) __obj.updateDynamic("transportParams")(transportParams.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    if (!js.isUndefined(useBinaryProtocol)) __obj.updateDynamic("useBinaryProtocol")(useBinaryProtocol.asInstanceOf[js.Any])
    if (!js.isUndefined(useTokenAuth)) __obj.updateDynamic("useTokenAuth")(useTokenAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

