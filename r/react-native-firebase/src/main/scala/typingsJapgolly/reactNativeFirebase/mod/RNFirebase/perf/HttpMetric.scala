package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.perf

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseBooleans.`false`
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpMetric extends js.Object {
  /**
    * Return an attribute by name, or null if it does not exist.
    */
  def getAttribute(attribute: String): js.Promise[String | Null]
  /**
    * Return an object of key-value attributes.
    */
  def getAttributes(): js.Promise[js.Object]
  /**
    * Set an attribute. Returns true if it was set, false if it was not.
    */
  def putAttribute(attribute: String, value: String): js.Promise[`true` | `false`]
  /**
    * Remove an attribute by name.
    */
  def removeAttribute(attribute: String): js.Promise[Null]
  /**
    * Set the request HTTP response code.
    */
  def setHttpResponseCode(code: Double): js.Promise[Null]
  /**
    * Set the request payload size, in bytes.
    */
  def setRequestPayloadSize(bytes: Double): js.Promise[Null]
  /**
    * Set the response content type.
    */
  def setResponseContentType(`type`: String): js.Promise[Null]
  /**
    * Set the response payload size, in bytes.
    */
  def setResponsePayloadSize(bytes: Double): js.Promise[Null]
  /**
    * Start a HttpMetric instance.
    */
  def start(): js.Promise[Null]
  /**
    * Stop a HttpMetric instance.
    */
  def stop(): js.Promise[Null]
}

object HttpMetric {
  @scala.inline
  def apply(
    getAttribute: String => CallbackTo[js.Promise[String | Null]],
    getAttributes: CallbackTo[js.Promise[js.Object]],
    putAttribute: (String, String) => CallbackTo[js.Promise[`true` | `false`]],
    removeAttribute: String => CallbackTo[js.Promise[Null]],
    setHttpResponseCode: Double => CallbackTo[js.Promise[Null]],
    setRequestPayloadSize: Double => CallbackTo[js.Promise[Null]],
    setResponseContentType: String => CallbackTo[js.Promise[Null]],
    setResponsePayloadSize: Double => CallbackTo[js.Promise[Null]],
    start: CallbackTo[js.Promise[Null]],
    stop: CallbackTo[js.Promise[Null]]
  ): HttpMetric = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAttribute")(js.Any.fromFunction1((t0: java.lang.String) => getAttribute(t0).runNow()))
    __obj.updateDynamic("getAttributes")(getAttributes.toJsFn)
    __obj.updateDynamic("putAttribute")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => putAttribute(t0, t1).runNow()))
    __obj.updateDynamic("removeAttribute")(js.Any.fromFunction1((t0: java.lang.String) => removeAttribute(t0).runNow()))
    __obj.updateDynamic("setHttpResponseCode")(js.Any.fromFunction1((t0: scala.Double) => setHttpResponseCode(t0).runNow()))
    __obj.updateDynamic("setRequestPayloadSize")(js.Any.fromFunction1((t0: scala.Double) => setRequestPayloadSize(t0).runNow()))
    __obj.updateDynamic("setResponseContentType")(js.Any.fromFunction1((t0: java.lang.String) => setResponseContentType(t0).runNow()))
    __obj.updateDynamic("setResponsePayloadSize")(js.Any.fromFunction1((t0: scala.Double) => setResponsePayloadSize(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[HttpMetric]
  }
}

