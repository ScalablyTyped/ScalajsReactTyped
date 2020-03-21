package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideServletResponse extends js.Object {
  def setContentType(`type`: String): Unit
  def setHeader(name: String, value: String): Unit
  def setStatus(value: Double): Unit
}

object GlideServletResponse {
  @scala.inline
  def apply(
    setContentType: String => Callback,
    setHeader: (String, String) => Callback,
    setStatus: Double => Callback
  ): GlideServletResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setContentType")(js.Any.fromFunction1((t0: java.lang.String) => setContentType(t0).runNow()))
    __obj.updateDynamic("setHeader")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setHeader(t0, t1).runNow()))
    __obj.updateDynamic("setStatus")(js.Any.fromFunction1((t0: scala.Double) => setStatus(t0).runNow()))
    __obj.asInstanceOf[GlideServletResponse]
  }
}

