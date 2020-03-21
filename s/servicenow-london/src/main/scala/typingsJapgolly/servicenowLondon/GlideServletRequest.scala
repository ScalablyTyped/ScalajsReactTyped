package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideServletRequest extends js.Object {
  def getContentType(): String
  def getHeader(name: String): String
  def getHeaderNames(): String
  def getHeaders(name: String): String
  def getParameter(name: String): String
  def getParameterNames(): String
  def getQueryString(): String
  def writeOutput(mimeType: String, output: String): Unit
}

object GlideServletRequest {
  @scala.inline
  def apply(
    getContentType: CallbackTo[String],
    getHeader: String => CallbackTo[String],
    getHeaderNames: CallbackTo[String],
    getHeaders: String => CallbackTo[String],
    getParameter: String => CallbackTo[String],
    getParameterNames: CallbackTo[String],
    getQueryString: CallbackTo[String],
    writeOutput: (String, String) => Callback
  ): GlideServletRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContentType")(getContentType.toJsFn)
    __obj.updateDynamic("getHeader")(js.Any.fromFunction1((t0: java.lang.String) => getHeader(t0).runNow()))
    __obj.updateDynamic("getHeaderNames")(getHeaderNames.toJsFn)
    __obj.updateDynamic("getHeaders")(js.Any.fromFunction1((t0: java.lang.String) => getHeaders(t0).runNow()))
    __obj.updateDynamic("getParameter")(js.Any.fromFunction1((t0: java.lang.String) => getParameter(t0).runNow()))
    __obj.updateDynamic("getParameterNames")(getParameterNames.toJsFn)
    __obj.updateDynamic("getQueryString")(getQueryString.toJsFn)
    __obj.updateDynamic("writeOutput")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => writeOutput(t0, t1).runNow()))
    __obj.asInstanceOf[GlideServletRequest]
  }
}

