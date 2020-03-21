package typingsJapgolly.atmosphereJs.Atmosphere_

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var attachHeadersAsQueryString: js.UndefOr[Boolean] = js.undefined
  var callback: js.UndefOr[js.Function] = js.undefined
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  var connectTimeout: js.UndefOr[Double] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var disableDisconnect: js.UndefOr[Boolean] = js.undefined
  var disconnect: js.UndefOr[js.Function0[Unit]] = js.undefined
  var dispatchUrl: js.UndefOr[String] = js.undefined
  var dropHeaders: js.UndefOr[Boolean] = js.undefined
  var enableProtocol: js.UndefOr[Boolean] = js.undefined
  var enableXDR: js.UndefOr[Boolean] = js.undefined
  var execute: js.UndefOr[js.Function0[Unit]] = js.undefined
  var executeCallbackBeforeReconnect: js.UndefOr[Boolean] = js.undefined
  var fallbackMethod: js.UndefOr[String] = js.undefined
  var fallbackTransport: js.UndefOr[String] = js.undefined
  var getUUID: js.UndefOr[js.Function0[Unit]] = js.undefined
  var getUrl: js.UndefOr[js.Function0[String]] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var lastIndex: js.UndefOr[Double] = js.undefined
  var lastTimestamp: js.UndefOr[Double] = js.undefined
  var logLevel: js.UndefOr[String] = js.undefined
  var maxReconnectOnClose: js.UndefOr[Double] = js.undefined
  var maxRequest: js.UndefOr[Double] = js.undefined
  var maxStreamingLength: js.UndefOr[Double] = js.undefined
  var messageDelimiter: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var onClientTimeout: js.UndefOr[js.Function1[/* request */ js.UndefOr[Request], Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.undefined
  var onFailureToReconnect: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], Unit]
  ] = js.undefined
  var onLocalMessage: js.UndefOr[js.Function1[/* request */ js.UndefOr[Request], Unit]] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* response */ Response, Unit]] = js.undefined
  var onMessagePublished: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.undefined
  var onReconnect: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], Unit]
  ] = js.undefined
  var onReopen: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], Unit]
  ] = js.undefined
  var onTransportFailure: js.UndefOr[
    js.Function2[/* reason */ js.UndefOr[String], /* response */ js.UndefOr[Response], Unit]
  ] = js.undefined
  var pollingInterval: js.UndefOr[Double] = js.undefined
  var push: js.UndefOr[js.Function2[/* message */ String, /* dispatchUrl */ js.UndefOr[String], Unit]] = js.undefined
  var pushLocal: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  var readResponsesHeaders: js.UndefOr[Boolean] = js.undefined
  var readyState: js.UndefOr[Double] = js.undefined
  var reconnect: js.UndefOr[Boolean] = js.undefined
  var reconnectInterval: js.UndefOr[Double] = js.undefined
  var requestCount: js.UndefOr[Double] = js.undefined
  var rewriteURL: js.UndefOr[Boolean] = js.undefined
  var shared: js.UndefOr[Boolean] = js.undefined
  var subscribe: js.UndefOr[js.Function1[/* options */ Request, Unit]] = js.undefined
  var suspend: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var trackMessageLength: js.UndefOr[Boolean] = js.undefined
  var transport: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
  var webSocketBinaryType: js.UndefOr[js.Any] = js.undefined
  var webSocketImpl: js.UndefOr[js.Any] = js.undefined
  var webSocketPathDelimiter: js.UndefOr[String] = js.undefined
  var webSocketUrl: js.UndefOr[String] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    attachHeadersAsQueryString: js.UndefOr[Boolean] = js.undefined,
    callback: js.Function = null,
    close: js.UndefOr[Callback] = js.undefined,
    connectTimeout: Int | Double = null,
    contentType: String = null,
    data: String = null,
    disableDisconnect: js.UndefOr[Boolean] = js.undefined,
    disconnect: js.UndefOr[Callback] = js.undefined,
    dispatchUrl: String = null,
    dropHeaders: js.UndefOr[Boolean] = js.undefined,
    enableProtocol: js.UndefOr[Boolean] = js.undefined,
    enableXDR: js.UndefOr[Boolean] = js.undefined,
    execute: js.UndefOr[Callback] = js.undefined,
    executeCallbackBeforeReconnect: js.UndefOr[Boolean] = js.undefined,
    fallbackMethod: String = null,
    fallbackTransport: String = null,
    getUUID: js.UndefOr[Callback] = js.undefined,
    getUrl: js.UndefOr[CallbackTo[String]] = js.undefined,
    headers: js.Any = null,
    lastIndex: Int | Double = null,
    lastTimestamp: Int | Double = null,
    logLevel: String = null,
    maxReconnectOnClose: Int | Double = null,
    maxRequest: Int | Double = null,
    maxStreamingLength: Int | Double = null,
    messageDelimiter: String = null,
    method: String = null,
    onClientTimeout: /* request */ js.UndefOr[Request] => Callback = null,
    onClose: /* response */ js.UndefOr[Response] => Callback = null,
    onError: /* response */ js.UndefOr[Response] => Callback = null,
    onFailureToReconnect: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Callback = null,
    onLocalMessage: /* request */ js.UndefOr[Request] => Callback = null,
    onMessage: /* response */ Response => Callback = null,
    onMessagePublished: /* response */ js.UndefOr[Response] => Callback = null,
    onOpen: /* response */ js.UndefOr[Response] => Callback = null,
    onReconnect: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Callback = null,
    onReopen: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Callback = null,
    onTransportFailure: (/* reason */ js.UndefOr[String], /* response */ js.UndefOr[Response]) => Callback = null,
    pollingInterval: Int | Double = null,
    push: (/* message */ String, /* dispatchUrl */ js.UndefOr[String]) => Callback = null,
    pushLocal: /* message */ String => Callback = null,
    readResponsesHeaders: js.UndefOr[Boolean] = js.undefined,
    readyState: Int | Double = null,
    reconnect: js.UndefOr[Boolean] = js.undefined,
    reconnectInterval: Int | Double = null,
    requestCount: Int | Double = null,
    rewriteURL: js.UndefOr[Boolean] = js.undefined,
    shared: js.UndefOr[Boolean] = js.undefined,
    subscribe: /* options */ Request => Callback = null,
    suspend: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    trackMessageLength: js.UndefOr[Boolean] = js.undefined,
    transport: String = null,
    url: String = null,
    uuid: String = null,
    webSocketBinaryType: js.Any = null,
    webSocketImpl: js.Any = null,
    webSocketPathDelimiter: String = null,
    webSocketUrl: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Request = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(attachHeadersAsQueryString)) __obj.updateDynamic("attachHeadersAsQueryString")(attachHeadersAsQueryString.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    close.foreach(p => __obj.updateDynamic("close")(p.toJsFn))
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDisconnect)) __obj.updateDynamic("disableDisconnect")(disableDisconnect.asInstanceOf[js.Any])
    disconnect.foreach(p => __obj.updateDynamic("disconnect")(p.toJsFn))
    if (dispatchUrl != null) __obj.updateDynamic("dispatchUrl")(dispatchUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(dropHeaders)) __obj.updateDynamic("dropHeaders")(dropHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(enableProtocol)) __obj.updateDynamic("enableProtocol")(enableProtocol.asInstanceOf[js.Any])
    if (!js.isUndefined(enableXDR)) __obj.updateDynamic("enableXDR")(enableXDR.asInstanceOf[js.Any])
    execute.foreach(p => __obj.updateDynamic("execute")(p.toJsFn))
    if (!js.isUndefined(executeCallbackBeforeReconnect)) __obj.updateDynamic("executeCallbackBeforeReconnect")(executeCallbackBeforeReconnect.asInstanceOf[js.Any])
    if (fallbackMethod != null) __obj.updateDynamic("fallbackMethod")(fallbackMethod.asInstanceOf[js.Any])
    if (fallbackTransport != null) __obj.updateDynamic("fallbackTransport")(fallbackTransport.asInstanceOf[js.Any])
    getUUID.foreach(p => __obj.updateDynamic("getUUID")(p.toJsFn))
    getUrl.foreach(p => __obj.updateDynamic("getUrl")(p.toJsFn))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (lastIndex != null) __obj.updateDynamic("lastIndex")(lastIndex.asInstanceOf[js.Any])
    if (lastTimestamp != null) __obj.updateDynamic("lastTimestamp")(lastTimestamp.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (maxReconnectOnClose != null) __obj.updateDynamic("maxReconnectOnClose")(maxReconnectOnClose.asInstanceOf[js.Any])
    if (maxRequest != null) __obj.updateDynamic("maxRequest")(maxRequest.asInstanceOf[js.Any])
    if (maxStreamingLength != null) __obj.updateDynamic("maxStreamingLength")(maxStreamingLength.asInstanceOf[js.Any])
    if (messageDelimiter != null) __obj.updateDynamic("messageDelimiter")(messageDelimiter.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onClientTimeout != null) __obj.updateDynamic("onClientTimeout")(js.Any.fromFunction1((t0: /* request */ js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.Request]) => onClientTimeout(t0).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* response */ js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.Response]) => onClose(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* response */ js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.Response]) => onError(t0).runNow()))
    if (onFailureToReconnect != null) __obj.updateDynamic("onFailureToReconnect")(js.Any.fromFunction2((t0: /* request */ js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.Request], t1: /* response */ js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.Response]) => onFailureToReconnect(t0, t1).runNow()))
    if (onLocalMessage != null) __obj.updateDynamic("onLocalMessage")(js.Any.fromFunction1((t0: /* request */ js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.Request]) => onLocalMessage(t0).runNow()))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.atmosphereJs.Atmosphere_.Response) => onMessage(t0).runNow()))
    if (onMessagePublished != null) __obj.updateDynamic("onMessagePublished")(js.Any.fromFunction1((t0: /* response */ js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.Response]) => onMessagePublished(t0).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* response */ js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.Response]) => onOpen(t0).runNow()))
    if (onReconnect != null) __obj.updateDynamic("onReconnect")(js.Any.fromFunction2((t0: /* request */ js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.Request], t1: /* response */ js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.Response]) => onReconnect(t0, t1).runNow()))
    if (onReopen != null) __obj.updateDynamic("onReopen")(js.Any.fromFunction2((t0: /* request */ js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.Request], t1: /* response */ js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.Response]) => onReopen(t0, t1).runNow()))
    if (onTransportFailure != null) __obj.updateDynamic("onTransportFailure")(js.Any.fromFunction2((t0: /* reason */ js.UndefOr[java.lang.String], t1: /* response */ js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.Response]) => onTransportFailure(t0, t1).runNow()))
    if (pollingInterval != null) __obj.updateDynamic("pollingInterval")(pollingInterval.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* dispatchUrl */ js.UndefOr[java.lang.String]) => push(t0, t1).runNow()))
    if (pushLocal != null) __obj.updateDynamic("pushLocal")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => pushLocal(t0).runNow()))
    if (!js.isUndefined(readResponsesHeaders)) __obj.updateDynamic("readResponsesHeaders")(readResponsesHeaders.asInstanceOf[js.Any])
    if (readyState != null) __obj.updateDynamic("readyState")(readyState.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect.asInstanceOf[js.Any])
    if (reconnectInterval != null) __obj.updateDynamic("reconnectInterval")(reconnectInterval.asInstanceOf[js.Any])
    if (requestCount != null) __obj.updateDynamic("requestCount")(requestCount.asInstanceOf[js.Any])
    if (!js.isUndefined(rewriteURL)) __obj.updateDynamic("rewriteURL")(rewriteURL.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.atmosphereJs.Atmosphere_.Request) => subscribe(t0).runNow()))
    if (!js.isUndefined(suspend)) __obj.updateDynamic("suspend")(suspend.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(trackMessageLength)) __obj.updateDynamic("trackMessageLength")(trackMessageLength.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    if (webSocketBinaryType != null) __obj.updateDynamic("webSocketBinaryType")(webSocketBinaryType.asInstanceOf[js.Any])
    if (webSocketImpl != null) __obj.updateDynamic("webSocketImpl")(webSocketImpl.asInstanceOf[js.Any])
    if (webSocketPathDelimiter != null) __obj.updateDynamic("webSocketPathDelimiter")(webSocketPathDelimiter.asInstanceOf[js.Any])
    if (webSocketUrl != null) __obj.updateDynamic("webSocketUrl")(webSocketUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

