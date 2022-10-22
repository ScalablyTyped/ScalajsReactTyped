package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.dataReceived
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.eventSourceMessageReceived
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.loadingFailed
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.loadingFinished
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.reportingApiEndpointsChangedForOrigin
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.reportingApiReportAdded
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.reportingApiReportUpdated
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.requestIntercepted
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.requestServedFromCache
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.requestWillBeSent
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.requestWillBeSentExtraInfo
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.resourceChangedPriority
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.responseReceived
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.responseReceivedExtraInfo
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.signedExchangeReceived
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.subresourceWebBundleInnerResponseError
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.subresourceWebBundleInnerResponseParsed
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.subresourceWebBundleMetadataError
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.subresourceWebBundleMetadataReceived
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.trustTokenOperationDone
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.webSocketClosed
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.webSocketCreated
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.webSocketFrameError
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.webSocketFrameReceived
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.webSocketFrameSent
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.webSocketHandshakeResponseReceived
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.webSocketWillSendHandshakeRequest
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.webTransportClosed
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.webTransportConnectionEstablished
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.webTransportCreated
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.CanClearBrowserCacheResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.CanClearBrowserCookiesResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.CanEmulateNetworkConditionsResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.ContinueInterceptedRequestRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.DataReceivedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.DeleteCookiesRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.EmulateNetworkConditionsRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.EnableReportingApiRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.EnableRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.EventSourceMessageReceivedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.GetAllCookiesResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.GetCertificateRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.GetCertificateResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.GetCookiesRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.GetCookiesResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.GetRequestPostDataRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.GetRequestPostDataResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.GetResponseBodyForInterceptionRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.GetResponseBodyForInterceptionResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.GetResponseBodyRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.GetResponseBodyResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.GetSecurityIsolationStatusRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.GetSecurityIsolationStatusResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.LoadNetworkResourceRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.LoadNetworkResourceResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.LoadingFailedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.LoadingFinishedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.ReplayXHRRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.ReportingApiEndpointsChangedForOriginEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.ReportingApiReportAddedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.ReportingApiReportUpdatedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.RequestInterceptedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.RequestServedFromCacheEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentExtraInfoEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.ResourceChangedPriorityEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedExtraInfoEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SearchInResponseBodyRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SearchInResponseBodyResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SetAcceptedEncodingsRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SetAttachDebugStackRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SetBlockedURLsRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SetBypassServiceWorkerRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SetCacheDisabledRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SetCookieRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SetCookieResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SetCookiesRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SetExtraHTTPHeadersRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SetRequestInterceptionRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SetUserAgentOverrideRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SignedExchangeReceivedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SubresourceWebBundleInnerResponseErrorEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SubresourceWebBundleInnerResponseParsedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SubresourceWebBundleMetadataErrorEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SubresourceWebBundleMetadataReceivedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.TakeResponseBodyForInterceptionAsStreamRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.TakeResponseBodyForInterceptionAsStreamResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.TrustTokenOperationDoneEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.WebSocketClosedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.WebSocketCreatedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.WebSocketFrameErrorEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.WebSocketFrameReceivedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.WebSocketFrameSentEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.WebSocketHandshakeResponseReceivedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.WebSocketWillSendHandshakeRequestEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.WebTransportClosedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.WebTransportConnectionEstablishedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.WebTransportCreatedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkApi extends StObject {
  
  /**
    * Tells whether clearing browser cache is supported.
    */
  def canClearBrowserCache(): js.Promise[CanClearBrowserCacheResponse] = js.native
  
  /**
    * Tells whether clearing browser cookies is supported.
    */
  def canClearBrowserCookies(): js.Promise[CanClearBrowserCookiesResponse] = js.native
  
  /**
    * Tells whether emulation of network conditions is supported.
    */
  def canEmulateNetworkConditions(): js.Promise[CanEmulateNetworkConditionsResponse] = js.native
  
  /**
    * Clears accepted encodings set by setAcceptedEncodings
    */
  def clearAcceptedEncodingsOverride(): js.Promise[Unit] = js.native
  
  /**
    * Clears browser cache.
    */
  def clearBrowserCache(): js.Promise[Unit] = js.native
  
  /**
    * Clears browser cookies.
    */
  def clearBrowserCookies(): js.Promise[Unit] = js.native
  
  /**
    * Response to Network.requestIntercepted which either modifies the request to continue with any
    * modifications, or blocks it, or completes it with the provided response bytes. If a network
    * fetch occurs as a result which encounters a redirect an additional Network.requestIntercepted
    * event will be sent with the same InterceptionId.
    * Deprecated, use Fetch.continueRequest, Fetch.fulfillRequest and Fetch.failRequest instead.
    */
  def continueInterceptedRequest(params: ContinueInterceptedRequestRequest): js.Promise[Unit] = js.native
  
  /**
    * Deletes browser cookies with matching name and url or domain/path pair.
    */
  def deleteCookies(params: DeleteCookiesRequest): js.Promise[Unit] = js.native
  
  /**
    * Disables network tracking, prevents network events from being sent to the client.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Activates emulation of network conditions.
    */
  def emulateNetworkConditions(params: EmulateNetworkConditionsRequest): js.Promise[Unit] = js.native
  
  /**
    * Enables network tracking, network events will now be delivered to the client.
    */
  def enable(params: EnableRequest): js.Promise[Unit] = js.native
  
  /**
    * Enables tracking for the Reporting API, events generated by the Reporting API will now be delivered to the client.
    * Enabling triggers 'reportingApiReportAdded' for all existing reports.
    */
  def enableReportingApi(params: EnableReportingApiRequest): js.Promise[Unit] = js.native
  
  /**
    * Returns all browser cookies. Depending on the backend support, will return detailed cookie
    * information in the `cookies` field.
    */
  def getAllCookies(): js.Promise[GetAllCookiesResponse] = js.native
  
  /**
    * Returns the DER-encoded certificate.
    */
  def getCertificate(params: GetCertificateRequest): js.Promise[GetCertificateResponse] = js.native
  
  /**
    * Returns all browser cookies for the current URL. Depending on the backend support, will return
    * detailed cookie information in the `cookies` field.
    */
  def getCookies(params: GetCookiesRequest): js.Promise[GetCookiesResponse] = js.native
  
  /**
    * Returns post data sent with the request. Returns an error when no data was sent with the request.
    */
  def getRequestPostData(params: GetRequestPostDataRequest): js.Promise[GetRequestPostDataResponse] = js.native
  
  /**
    * Returns content served for the given request.
    */
  def getResponseBody(params: GetResponseBodyRequest): js.Promise[GetResponseBodyResponse] = js.native
  
  /**
    * Returns content served for the given currently intercepted request.
    */
  def getResponseBodyForInterception(params: GetResponseBodyForInterceptionRequest): js.Promise[GetResponseBodyForInterceptionResponse] = js.native
  
  /**
    * Returns information about the COEP/COOP isolation status.
    */
  def getSecurityIsolationStatus(params: GetSecurityIsolationStatusRequest): js.Promise[GetSecurityIsolationStatusResponse] = js.native
  
  /**
    * Fetches the resource and returns the content.
    */
  def loadNetworkResource(params: LoadNetworkResourceRequest): js.Promise[LoadNetworkResourceResponse] = js.native
  
  /**
    * Fired when data chunk was received over the network.
    */
  @JSName("on")
  def on_dataReceived(event: dataReceived, listener: js.Function1[/* params */ DataReceivedEvent, Unit]): Unit = js.native
  /**
    * Fired when EventSource message is received.
    */
  @JSName("on")
  def on_eventSourceMessageReceived(
    event: eventSourceMessageReceived,
    listener: js.Function1[/* params */ EventSourceMessageReceivedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when HTTP request has failed to load.
    */
  @JSName("on")
  def on_loadingFailed(event: loadingFailed, listener: js.Function1[/* params */ LoadingFailedEvent, Unit]): Unit = js.native
  /**
    * Fired when HTTP request has finished loading.
    */
  @JSName("on")
  def on_loadingFinished(event: loadingFinished, listener: js.Function1[/* params */ LoadingFinishedEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_reportingApiEndpointsChangedForOrigin(
    event: reportingApiEndpointsChangedForOrigin,
    listener: js.Function1[/* params */ ReportingApiEndpointsChangedForOriginEvent, Unit]
  ): Unit = js.native
  /**
    * Is sent whenever a new report is added.
    * And after 'enableReportingApi' for all existing reports.
    */
  @JSName("on")
  def on_reportingApiReportAdded(
    event: reportingApiReportAdded,
    listener: js.Function1[/* params */ ReportingApiReportAddedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_reportingApiReportUpdated(
    event: reportingApiReportUpdated,
    listener: js.Function1[/* params */ ReportingApiReportUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * Details of an intercepted HTTP request, which must be either allowed, blocked, modified or
    * mocked.
    * Deprecated, use Fetch.requestPaused instead.
    */
  @JSName("on")
  def on_requestIntercepted(event: requestIntercepted, listener: js.Function1[/* params */ RequestInterceptedEvent, Unit]): Unit = js.native
  /**
    * Fired if request ended up loading from cache.
    */
  @JSName("on")
  def on_requestServedFromCache(
    event: requestServedFromCache,
    listener: js.Function1[/* params */ RequestServedFromCacheEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when page is about to send HTTP request.
    */
  @JSName("on")
  def on_requestWillBeSent(event: requestWillBeSent, listener: js.Function1[/* params */ RequestWillBeSentEvent, Unit]): Unit = js.native
  /**
    * Fired when additional information about a requestWillBeSent event is available from the
    * network stack. Not every requestWillBeSent event will have an additional
    * requestWillBeSentExtraInfo fired for it, and there is no guarantee whether requestWillBeSent
    * or requestWillBeSentExtraInfo will be fired first for the same request.
    */
  @JSName("on")
  def on_requestWillBeSentExtraInfo(
    event: requestWillBeSentExtraInfo,
    listener: js.Function1[/* params */ RequestWillBeSentExtraInfoEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when resource loading priority is changed
    */
  @JSName("on")
  def on_resourceChangedPriority(
    event: resourceChangedPriority,
    listener: js.Function1[/* params */ ResourceChangedPriorityEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when HTTP response is available.
    */
  @JSName("on")
  def on_responseReceived(event: responseReceived, listener: js.Function1[/* params */ ResponseReceivedEvent, Unit]): Unit = js.native
  /**
    * Fired when additional information about a responseReceived event is available from the network
    * stack. Not every responseReceived event will have an additional responseReceivedExtraInfo for
    * it, and responseReceivedExtraInfo may be fired before or after responseReceived.
    */
  @JSName("on")
  def on_responseReceivedExtraInfo(
    event: responseReceivedExtraInfo,
    listener: js.Function1[/* params */ ResponseReceivedExtraInfoEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when a signed exchange was received over the network
    */
  @JSName("on")
  def on_signedExchangeReceived(
    event: signedExchangeReceived,
    listener: js.Function1[/* params */ SignedExchangeReceivedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when request for resources within a .wbn file failed.
    */
  @JSName("on")
  def on_subresourceWebBundleInnerResponseError(
    event: subresourceWebBundleInnerResponseError,
    listener: js.Function1[/* params */ SubresourceWebBundleInnerResponseErrorEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when handling requests for resources within a .wbn file.
    * Note: this will only be fired for resources that are requested by the webpage.
    */
  @JSName("on")
  def on_subresourceWebBundleInnerResponseParsed(
    event: subresourceWebBundleInnerResponseParsed,
    listener: js.Function1[/* params */ SubresourceWebBundleInnerResponseParsedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired once when parsing the .wbn file has failed.
    */
  @JSName("on")
  def on_subresourceWebBundleMetadataError(
    event: subresourceWebBundleMetadataError,
    listener: js.Function1[/* params */ SubresourceWebBundleMetadataErrorEvent, Unit]
  ): Unit = js.native
  /**
    * Fired once when parsing the .wbn file has succeeded.
    * The event contains the information about the web bundle contents.
    */
  @JSName("on")
  def on_subresourceWebBundleMetadataReceived(
    event: subresourceWebBundleMetadataReceived,
    listener: js.Function1[/* params */ SubresourceWebBundleMetadataReceivedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired exactly once for each Trust Token operation. Depending on
    * the type of the operation and whether the operation succeeded or
    * failed, the event is fired before the corresponding request was sent
    * or after the response was received.
    */
  @JSName("on")
  def on_trustTokenOperationDone(
    event: trustTokenOperationDone,
    listener: js.Function1[/* params */ TrustTokenOperationDoneEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when WebSocket is closed.
    */
  @JSName("on")
  def on_webSocketClosed(event: webSocketClosed, listener: js.Function1[/* params */ WebSocketClosedEvent, Unit]): Unit = js.native
  /**
    * Fired upon WebSocket creation.
    */
  @JSName("on")
  def on_webSocketCreated(event: webSocketCreated, listener: js.Function1[/* params */ WebSocketCreatedEvent, Unit]): Unit = js.native
  /**
    * Fired when WebSocket message error occurs.
    */
  @JSName("on")
  def on_webSocketFrameError(event: webSocketFrameError, listener: js.Function1[/* params */ WebSocketFrameErrorEvent, Unit]): Unit = js.native
  /**
    * Fired when WebSocket message is received.
    */
  @JSName("on")
  def on_webSocketFrameReceived(
    event: webSocketFrameReceived,
    listener: js.Function1[/* params */ WebSocketFrameReceivedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when WebSocket message is sent.
    */
  @JSName("on")
  def on_webSocketFrameSent(event: webSocketFrameSent, listener: js.Function1[/* params */ WebSocketFrameSentEvent, Unit]): Unit = js.native
  /**
    * Fired when WebSocket handshake response becomes available.
    */
  @JSName("on")
  def on_webSocketHandshakeResponseReceived(
    event: webSocketHandshakeResponseReceived,
    listener: js.Function1[/* params */ WebSocketHandshakeResponseReceivedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when WebSocket is about to initiate handshake.
    */
  @JSName("on")
  def on_webSocketWillSendHandshakeRequest(
    event: webSocketWillSendHandshakeRequest,
    listener: js.Function1[/* params */ WebSocketWillSendHandshakeRequestEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when WebTransport is disposed.
    */
  @JSName("on")
  def on_webTransportClosed(event: webTransportClosed, listener: js.Function1[/* params */ WebTransportClosedEvent, Unit]): Unit = js.native
  /**
    * Fired when WebTransport handshake is finished.
    */
  @JSName("on")
  def on_webTransportConnectionEstablished(
    event: webTransportConnectionEstablished,
    listener: js.Function1[/* params */ WebTransportConnectionEstablishedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired upon WebTransport creation.
    */
  @JSName("on")
  def on_webTransportCreated(event: webTransportCreated, listener: js.Function1[/* params */ WebTransportCreatedEvent, Unit]): Unit = js.native
  
  /**
    * This method sends a new XMLHttpRequest which is identical to the original one. The following
    * parameters should be identical: method, url, async, request body, extra headers, withCredentials
    * attribute, user, password.
    */
  def replayXHR(params: ReplayXHRRequest): js.Promise[Unit] = js.native
  
  /**
    * Searches for given string in response content.
    */
  def searchInResponseBody(params: SearchInResponseBodyRequest): js.Promise[SearchInResponseBodyResponse] = js.native
  
  /**
    * Sets a list of content encodings that will be accepted. Empty list means no encoding is accepted.
    */
  def setAcceptedEncodings(params: SetAcceptedEncodingsRequest): js.Promise[Unit] = js.native
  
  /**
    * Specifies whether to attach a page script stack id in requests
    */
  def setAttachDebugStack(params: SetAttachDebugStackRequest): js.Promise[Unit] = js.native
  
  /**
    * Blocks URLs from loading.
    */
  def setBlockedURLs(params: SetBlockedURLsRequest): js.Promise[Unit] = js.native
  
  /**
    * Toggles ignoring of service worker for each request.
    */
  def setBypassServiceWorker(params: SetBypassServiceWorkerRequest): js.Promise[Unit] = js.native
  
  /**
    * Toggles ignoring cache for each request. If `true`, cache will not be used.
    */
  def setCacheDisabled(params: SetCacheDisabledRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
    */
  def setCookie(params: SetCookieRequest): js.Promise[SetCookieResponse] = js.native
  
  /**
    * Sets given cookies.
    */
  def setCookies(params: SetCookiesRequest): js.Promise[Unit] = js.native
  
  /**
    * Specifies whether to always send extra HTTP headers with the requests from this page.
    */
  def setExtraHTTPHeaders(params: SetExtraHTTPHeadersRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets the requests to intercept that match the provided patterns and optionally resource types.
    * Deprecated, please use Fetch.enable instead.
    */
  def setRequestInterception(params: SetRequestInterceptionRequest): js.Promise[Unit] = js.native
  
  /**
    * Allows overriding user agent with the given string.
    */
  def setUserAgentOverride(params: SetUserAgentOverrideRequest): js.Promise[Unit] = js.native
  
  /**
    * Returns a handle to the stream representing the response body. Note that after this command,
    * the intercepted request can't be continued as is -- you either need to cancel it or to provide
    * the response body. The stream only supports sequential read, IO.read will fail if the position
    * is specified.
    */
  def takeResponseBodyForInterceptionAsStream(params: TakeResponseBodyForInterceptionAsStreamRequest): js.Promise[TakeResponseBodyForInterceptionAsStreamResponse] = js.native
}
