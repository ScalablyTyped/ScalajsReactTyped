package typingsJapgolly.chrome

import typingsJapgolly.chrome.chrome.webRequest.WebAuthenticationChallengeEvent
import typingsJapgolly.chrome.chrome.webRequest.WebRedirectionResponseEvent
import typingsJapgolly.chrome.chrome.webRequest.WebRequestBodyEvent
import typingsJapgolly.chrome.chrome.webRequest.WebRequestHeadersEvent
import typingsJapgolly.chrome.chrome.webRequest.WebRequestHeadersSynchronousEvent
import typingsJapgolly.chrome.chrome.webRequest.WebResponseCacheEvent
import typingsJapgolly.chrome.chrome.webRequest.WebResponseErrorEvent
import typingsJapgolly.chrome.chrome.webRequest.WebResponseHeadersEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofwebRequest extends js.Object {
  var MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Double = js.native
  var onAuthRequired: WebAuthenticationChallengeEvent = js.native
  var onBeforeRedirect: WebRedirectionResponseEvent = js.native
  var onBeforeRequest: WebRequestBodyEvent = js.native
  var onBeforeSendHeaders: WebRequestHeadersSynchronousEvent = js.native
  var onCompleted: WebResponseCacheEvent = js.native
  var onErrorOccurred: WebResponseErrorEvent = js.native
  var onHeadersReceived: WebResponseHeadersEvent = js.native
  var onResponseStarted: WebResponseCacheEvent = js.native
  var onSendHeaders: WebRequestHeadersEvent = js.native
  def handlerBehaviorChanged(): Unit = js.native
  def handlerBehaviorChanged(callback: js.Function): Unit = js.native
}

