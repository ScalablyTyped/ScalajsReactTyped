package typingsJapgolly.chrome.global.chrome

import typingsJapgolly.chrome.chrome.webRequest.WebAuthenticationChallengeEvent
import typingsJapgolly.chrome.chrome.webRequest.WebRedirectionResponseEvent
import typingsJapgolly.chrome.chrome.webRequest.WebRequestBodyEvent
import typingsJapgolly.chrome.chrome.webRequest.WebRequestHeadersEvent
import typingsJapgolly.chrome.chrome.webRequest.WebRequestHeadersSynchronousEvent
import typingsJapgolly.chrome.chrome.webRequest.WebResponseCacheEvent
import typingsJapgolly.chrome.chrome.webRequest.WebResponseErrorEvent
import typingsJapgolly.chrome.chrome.webRequest.WebResponseHeadersEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Web Request
////////////////////
/**
  * Use the chrome.webRequest API to observe and analyze traffic and to intercept, block, or modify requests in-flight.
  * Permissions:  "webRequest", host permissions
  * @since Chrome 17.
  */
object webRequest {
  
  @JSGlobal("chrome.webRequest")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.webRequest.MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES")
  @js.native
  def MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Double = js.native
  inline def MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES")(x.asInstanceOf[js.Any])
  
  inline def handlerBehaviorChanged(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handlerBehaviorChanged")().asInstanceOf[Unit]
  inline def handlerBehaviorChanged(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handlerBehaviorChanged")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("chrome.webRequest.onAuthRequired")
  @js.native
  def onAuthRequired: WebAuthenticationChallengeEvent = js.native
  inline def onAuthRequired_=(x: WebAuthenticationChallengeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAuthRequired")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onBeforeRedirect")
  @js.native
  def onBeforeRedirect: WebRedirectionResponseEvent = js.native
  inline def onBeforeRedirect_=(x: WebRedirectionResponseEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRedirect")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onBeforeRequest")
  @js.native
  def onBeforeRequest: WebRequestBodyEvent = js.native
  inline def onBeforeRequest_=(x: WebRequestBodyEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRequest")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onBeforeSendHeaders")
  @js.native
  def onBeforeSendHeaders: WebRequestHeadersSynchronousEvent = js.native
  inline def onBeforeSendHeaders_=(x: WebRequestHeadersSynchronousEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeSendHeaders")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onCompleted")
  @js.native
  def onCompleted: WebResponseCacheEvent = js.native
  inline def onCompleted_=(x: WebResponseCacheEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onErrorOccurred")
  @js.native
  def onErrorOccurred: WebResponseErrorEvent = js.native
  inline def onErrorOccurred_=(x: WebResponseErrorEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onErrorOccurred")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onHeadersReceived")
  @js.native
  def onHeadersReceived: WebResponseHeadersEvent = js.native
  inline def onHeadersReceived_=(x: WebResponseHeadersEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHeadersReceived")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onResponseStarted")
  @js.native
  def onResponseStarted: WebResponseCacheEvent = js.native
  inline def onResponseStarted_=(x: WebResponseCacheEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponseStarted")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onSendHeaders")
  @js.native
  def onSendHeaders: WebRequestHeadersEvent = js.native
  inline def onSendHeaders_=(x: WebRequestHeadersEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSendHeaders")(x.asInstanceOf[js.Any])
}
