package typingsJapgolly.carlo.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.carlo.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequest extends js.Object {
  /**
    * Aborts request.
    * If request is a navigation request, navigation is aborted as well.
    */
  def abort(): js.Promise[Unit]
  /**
    * Proceeds with the default behavior for this request.
    * Either serves it from the filesystem or defers to the browser.
    */
  def continue(): js.Promise[Unit]
  /**
    * Marks the request as failed.
    * If request is a navigation request, navigation is still committed, but to a location that fails to be fetched.
    */
  def fail(): js.Promise[Unit]
  /**
    * Fulfills the network request with the given data. 'Content-Length' header is generated in case it is not listed in the headers.
    */
  def fulfill(options: AnonBody): js.Promise[Unit]
  /**
    * Network request headers
    */
  def headers(): js.Object
  /**
    * HTTP method of this network request (GET, POST, etc.)
    */
  def method(): String
  /**
    * Network request URL
    */
  def url(): String
}

object HttpRequest {
  @scala.inline
  def apply(
    abort: CallbackTo[js.Promise[Unit]],
    continue: CallbackTo[js.Promise[Unit]],
    fail: CallbackTo[js.Promise[Unit]],
    fulfill: AnonBody => CallbackTo[js.Promise[Unit]],
    headers: CallbackTo[js.Object],
    method: CallbackTo[String],
    url: CallbackTo[String]
  ): HttpRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("continue")(continue.toJsFn)
    __obj.updateDynamic("fail")(fail.toJsFn)
    __obj.updateDynamic("fulfill")(js.Any.fromFunction1((t0: typingsJapgolly.carlo.AnonBody) => fulfill(t0).runNow()))
    __obj.updateDynamic("headers")(headers.toJsFn)
    __obj.updateDynamic("method")(method.toJsFn)
    __obj.updateDynamic("url")(url.toJsFn)
    __obj.asInstanceOf[HttpRequest]
  }
}

