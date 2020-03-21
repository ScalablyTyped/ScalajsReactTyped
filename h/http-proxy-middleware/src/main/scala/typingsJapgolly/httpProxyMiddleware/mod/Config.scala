package typingsJapgolly.httpProxyMiddleware.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.httpProxy.mod.ServerOptions
import typingsJapgolly.httpProxyMiddleware.httpProxyMiddlewareBooleans.`false`
import typingsJapgolly.httpProxyMiddleware.httpProxyMiddlewareStrings.debug
import typingsJapgolly.httpProxyMiddleware.httpProxyMiddlewareStrings.error
import typingsJapgolly.httpProxyMiddleware.httpProxyMiddlewareStrings.info
import typingsJapgolly.httpProxyMiddleware.httpProxyMiddlewareStrings.silent
import typingsJapgolly.httpProxyMiddleware.httpProxyMiddlewareStrings.warn
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.httpMod.ClientRequest
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var agent: js.UndefOr[Agent] = js.undefined
  var auth: js.UndefOr[String] = js.undefined
  var autoRewrite: js.UndefOr[Boolean] = js.undefined
  var buffer: js.UndefOr[Readable] = js.undefined
  var changeOrigin: js.UndefOr[Boolean] = js.undefined
  var cookieDomainRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.undefined
  var cookiePathRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.undefined
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  var forward: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var hostRewrite: js.UndefOr[String] = js.undefined
  var ignorePath: js.UndefOr[Boolean] = js.undefined
  var localAddress: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[debug | info | warn | error | silent] = js.undefined
  var logProvider: js.UndefOr[js.Function1[/* provider */ LogProvider, LogProvider]] = js.undefined
  var onClose: js.UndefOr[
    js.Function3[/* res */ IncomingMessage, /* socket */ Socket, /* head */ js.Any, Unit]
  ] = js.undefined
  var onError: js.UndefOr[
    js.Function3[/* err */ js.Error, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]
  ] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* proxySocket */ Socket, Unit]] = js.undefined
  var onProxyReq: js.UndefOr[
    js.Function3[
      /* proxyReq */ ClientRequest, 
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      Unit
    ]
  ] = js.undefined
  var onProxyReqWs: js.UndefOr[
    js.Function5[
      /* proxyReq */ ClientRequest, 
      /* req */ IncomingMessage, 
      /* socket */ Socket, 
      /* options */ ServerOptions, 
      /* head */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var onProxyRes: js.UndefOr[
    js.Function3[
      /* proxyRes */ IncomingMessage, 
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      Unit
    ]
  ] = js.undefined
  var pathRewrite: js.UndefOr[
    StringDictionary[String] | (js.Function2[/* path */ String, /* req */ IncomingMessage, String])
  ] = js.undefined
  var prependPath: js.UndefOr[Boolean] = js.undefined
  var preserveHeaderKeyCase: js.UndefOr[Boolean] = js.undefined
  var protocolRewrite: js.UndefOr[String] = js.undefined
  /**
    * @deprecated
    */
  var proxyHost: js.UndefOr[js.Any] = js.undefined
  /**
    * @deprecated
    */
  var proxyTable: js.UndefOr[js.Any] = js.undefined
  var proxyTimeout: js.UndefOr[Double] = js.undefined
  var router: js.UndefOr[StringDictionary[String] | (js.Function1[/* req */ IncomingMessage, String])] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var selfHandleResponse: js.UndefOr[Boolean] = js.undefined
  var ssl: js.UndefOr[TlsOptions] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var toProxy: js.UndefOr[Boolean] = js.undefined
  var ws: js.UndefOr[Boolean] = js.undefined
  var xfwd: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    agent: Agent = null,
    auth: String = null,
    autoRewrite: js.UndefOr[Boolean] = js.undefined,
    buffer: Readable = null,
    changeOrigin: js.UndefOr[Boolean] = js.undefined,
    cookieDomainRewrite: `false` | String | StringDictionary[String] = null,
    cookiePathRewrite: `false` | String | StringDictionary[String] = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    forward: String = null,
    headers: StringDictionary[String] = null,
    hostRewrite: String = null,
    ignorePath: js.UndefOr[Boolean] = js.undefined,
    localAddress: String = null,
    logLevel: debug | info | warn | error | silent = null,
    logProvider: /* provider */ LogProvider => CallbackTo[LogProvider] = null,
    onClose: (/* res */ IncomingMessage, /* socket */ Socket, /* head */ js.Any) => Callback = null,
    onError: (/* err */ js.Error, /* req */ IncomingMessage, /* res */ ServerResponse) => Callback = null,
    onOpen: /* proxySocket */ Socket => Callback = null,
    onProxyReq: (/* proxyReq */ ClientRequest, /* req */ IncomingMessage, /* res */ ServerResponse) => Callback = null,
    onProxyReqWs: (/* proxyReq */ ClientRequest, /* req */ IncomingMessage, /* socket */ Socket, /* options */ ServerOptions, /* head */ js.Any) => Callback = null,
    onProxyRes: (/* proxyRes */ IncomingMessage, /* req */ IncomingMessage, /* res */ ServerResponse) => Callback = null,
    pathRewrite: StringDictionary[String] | (js.Function2[/* path */ String, /* req */ IncomingMessage, String]) = null,
    prependPath: js.UndefOr[Boolean] = js.undefined,
    preserveHeaderKeyCase: js.UndefOr[Boolean] = js.undefined,
    protocolRewrite: String = null,
    proxyHost: js.Any = null,
    proxyTable: js.Any = null,
    proxyTimeout: Int | Double = null,
    router: StringDictionary[String] | (js.Function1[/* req */ IncomingMessage, String]) = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    selfHandleResponse: js.UndefOr[Boolean] = js.undefined,
    ssl: TlsOptions = null,
    target: String = null,
    timeout: Int | Double = null,
    toProxy: js.UndefOr[Boolean] = js.undefined,
    ws: js.UndefOr[Boolean] = js.undefined,
    xfwd: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRewrite)) __obj.updateDynamic("autoRewrite")(autoRewrite.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(changeOrigin)) __obj.updateDynamic("changeOrigin")(changeOrigin.asInstanceOf[js.Any])
    if (cookieDomainRewrite != null) __obj.updateDynamic("cookieDomainRewrite")(cookieDomainRewrite.asInstanceOf[js.Any])
    if (cookiePathRewrite != null) __obj.updateDynamic("cookiePathRewrite")(cookiePathRewrite.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.asInstanceOf[js.Any])
    if (forward != null) __obj.updateDynamic("forward")(forward.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hostRewrite != null) __obj.updateDynamic("hostRewrite")(hostRewrite.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePath)) __obj.updateDynamic("ignorePath")(ignorePath.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logProvider != null) __obj.updateDynamic("logProvider")(js.Any.fromFunction1((t0: /* provider */ typingsJapgolly.httpProxyMiddleware.mod.LogProvider) => logProvider(t0).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction3((t0: /* res */ typingsJapgolly.node.httpMod.IncomingMessage, t1: /* socket */ typingsJapgolly.node.netMod.Socket, t2: /* head */ js.Any) => onClose(t0, t1, t2).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction3((t0: /* err */ js.Error, t1: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t2: /* res */ typingsJapgolly.node.httpMod.ServerResponse) => onError(t0, t1, t2).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* proxySocket */ typingsJapgolly.node.netMod.Socket) => onOpen(t0).runNow()))
    if (onProxyReq != null) __obj.updateDynamic("onProxyReq")(js.Any.fromFunction3((t0: /* proxyReq */ typingsJapgolly.node.httpMod.ClientRequest, t1: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t2: /* res */ typingsJapgolly.node.httpMod.ServerResponse) => onProxyReq(t0, t1, t2).runNow()))
    if (onProxyReqWs != null) __obj.updateDynamic("onProxyReqWs")(js.Any.fromFunction5((t0: /* proxyReq */ typingsJapgolly.node.httpMod.ClientRequest, t1: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t2: /* socket */ typingsJapgolly.node.netMod.Socket, t3: /* options */ typingsJapgolly.httpProxy.mod.ServerOptions, t4: /* head */ js.Any) => onProxyReqWs(t0, t1, t2, t3, t4).runNow()))
    if (onProxyRes != null) __obj.updateDynamic("onProxyRes")(js.Any.fromFunction3((t0: /* proxyRes */ typingsJapgolly.node.httpMod.IncomingMessage, t1: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t2: /* res */ typingsJapgolly.node.httpMod.ServerResponse) => onProxyRes(t0, t1, t2).runNow()))
    if (pathRewrite != null) __obj.updateDynamic("pathRewrite")(pathRewrite.asInstanceOf[js.Any])
    if (!js.isUndefined(prependPath)) __obj.updateDynamic("prependPath")(prependPath.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveHeaderKeyCase)) __obj.updateDynamic("preserveHeaderKeyCase")(preserveHeaderKeyCase.asInstanceOf[js.Any])
    if (protocolRewrite != null) __obj.updateDynamic("protocolRewrite")(protocolRewrite.asInstanceOf[js.Any])
    if (proxyHost != null) __obj.updateDynamic("proxyHost")(proxyHost.asInstanceOf[js.Any])
    if (proxyTable != null) __obj.updateDynamic("proxyTable")(proxyTable.asInstanceOf[js.Any])
    if (proxyTimeout != null) __obj.updateDynamic("proxyTimeout")(proxyTimeout.asInstanceOf[js.Any])
    if (router != null) __obj.updateDynamic("router")(router.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (!js.isUndefined(selfHandleResponse)) __obj.updateDynamic("selfHandleResponse")(selfHandleResponse.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(toProxy)) __obj.updateDynamic("toProxy")(toProxy.asInstanceOf[js.Any])
    if (!js.isUndefined(ws)) __obj.updateDynamic("ws")(ws.asInstanceOf[js.Any])
    if (!js.isUndefined(xfwd)) __obj.updateDynamic("xfwd")(xfwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

