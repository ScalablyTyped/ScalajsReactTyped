package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideServletRequest extends js.Object {
  def getContentType(): String
  def getHeader(name: String): String
  def getParameter(name: String): String
  def writeOutput(mimeType: String, output: String): Unit
}

object GlideServletRequest {
  @scala.inline
  def apply(
    getContentType: CallbackTo[String],
    getHeader: String => CallbackTo[String],
    getParameter: String => CallbackTo[String],
    writeOutput: (String, String) => Callback
  ): GlideServletRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContentType")(getContentType.toJsFn)
    __obj.updateDynamic("getHeader")(js.Any.fromFunction1((t0: java.lang.String) => getHeader(t0).runNow()))
    __obj.updateDynamic("getParameter")(js.Any.fromFunction1((t0: java.lang.String) => getParameter(t0).runNow()))
    __obj.updateDynamic("writeOutput")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => writeOutput(t0, t1).runNow()))
    __obj.asInstanceOf[GlideServletRequest]
  }
}

