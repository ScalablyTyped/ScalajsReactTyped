package typingsJapgolly.puppeteer.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  /** Promise which resolves to a buffer with response body. */
  def buffer(): js.Promise[Buffer]
  /** A Frame that initiated this response, or null if navigating to error pages. */
  def frame(): Frame | Null
  /** True if the response was served from either the browser's disk cache or memory cache. */
  def fromCache(): Boolean
  /** True if the response was served by a service worker. */
  def fromServiceWorker(): Boolean
  /** An object with HTTP headers associated with the response. All header names are lower-case. */
  def headers(): Headers
  /**
    * Promise which resolves to a JSON representation of response body.
    * @throws This method will throw if the response body is not parsable via `JSON.parse`.
    */
  def json(): js.Promise[_]
  /** Contains a boolean stating whether the response was successful (status in the range 200-299) or not. */
  def ok(): Boolean
  /** Returns remote connection info */
  def remoteAddress(): RemoteInfo
  /** A matching Request object. */
  def request(): Request
  /** Returns an object with security details associated with the response. */
  def securityDetails(): SecurityDetails | Null
  /** Contains the status code of the response (e.g., 200 for a success). */
  def status(): Double
  /** Contains the status text of the response (e.g. usually an "OK" for a success).  */
  def statusText(): String
  /** Promise which resolves to a text representation of response body. */
  def text(): js.Promise[String]
  /** Contains the URL of the response. */
  def url(): String
}

object Response {
  @scala.inline
  def apply(
    buffer: CallbackTo[js.Promise[Buffer]],
    frame: CallbackTo[Frame | Null],
    fromCache: CallbackTo[Boolean],
    fromServiceWorker: CallbackTo[Boolean],
    headers: CallbackTo[Headers],
    json: CallbackTo[js.Promise[js.Any]],
    ok: CallbackTo[Boolean],
    remoteAddress: CallbackTo[RemoteInfo],
    request: CallbackTo[Request],
    securityDetails: CallbackTo[SecurityDetails | Null],
    status: CallbackTo[Double],
    statusText: CallbackTo[String],
    text: CallbackTo[js.Promise[String]],
    url: CallbackTo[String]
  ): Response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buffer")(buffer.toJsFn)
    __obj.updateDynamic("frame")(frame.toJsFn)
    __obj.updateDynamic("fromCache")(fromCache.toJsFn)
    __obj.updateDynamic("fromServiceWorker")(fromServiceWorker.toJsFn)
    __obj.updateDynamic("headers")(headers.toJsFn)
    __obj.updateDynamic("json")(json.toJsFn)
    __obj.updateDynamic("ok")(ok.toJsFn)
    __obj.updateDynamic("remoteAddress")(remoteAddress.toJsFn)
    __obj.updateDynamic("request")(request.toJsFn)
    __obj.updateDynamic("securityDetails")(securityDetails.toJsFn)
    __obj.updateDynamic("status")(status.toJsFn)
    __obj.updateDynamic("statusText")(statusText.toJsFn)
    __obj.updateDynamic("text")(text.toJsFn)
    __obj.updateDynamic("url")(url.toJsFn)
    __obj.asInstanceOf[Response]
  }
}

