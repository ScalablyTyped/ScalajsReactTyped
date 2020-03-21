package typingsJapgolly.servicenowLondon.snWs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIResponse extends js.Object {
  def getStreamWriter(): RESTAPIResponseStream
  def setBody(body: js.Any): Unit
  def setContentType(contentType: String): Unit
  def setError(error: js.Any): Unit
  def setHeader(header: String, value: String): Unit
  def setHeaders(headers: js.Any): Unit
  def setLocation(location: String): Unit
  def setStatus(status: Double): Unit
}

object RESTAPIResponse {
  @scala.inline
  def apply(
    getStreamWriter: CallbackTo[RESTAPIResponseStream],
    setBody: js.Any => Callback,
    setContentType: String => Callback,
    setError: js.Any => Callback,
    setHeader: (String, String) => Callback,
    setHeaders: js.Any => Callback,
    setLocation: String => Callback,
    setStatus: Double => Callback
  ): RESTAPIResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStreamWriter")(getStreamWriter.toJsFn)
    __obj.updateDynamic("setBody")(js.Any.fromFunction1((t0: js.Any) => setBody(t0).runNow()))
    __obj.updateDynamic("setContentType")(js.Any.fromFunction1((t0: java.lang.String) => setContentType(t0).runNow()))
    __obj.updateDynamic("setError")(js.Any.fromFunction1((t0: js.Any) => setError(t0).runNow()))
    __obj.updateDynamic("setHeader")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setHeader(t0, t1).runNow()))
    __obj.updateDynamic("setHeaders")(js.Any.fromFunction1((t0: js.Any) => setHeaders(t0).runNow()))
    __obj.updateDynamic("setLocation")(js.Any.fromFunction1((t0: java.lang.String) => setLocation(t0).runNow()))
    __obj.updateDynamic("setStatus")(js.Any.fromFunction1((t0: scala.Double) => setStatus(t0).runNow()))
    __obj.asInstanceOf[RESTAPIResponse]
  }
}

