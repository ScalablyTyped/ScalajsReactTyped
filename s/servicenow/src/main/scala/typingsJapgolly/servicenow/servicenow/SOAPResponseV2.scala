package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SOAPResponseV2 extends js.Object {
  def getBody(): String
  def getErrorCode(): Double
  def getErrorMessage(): String
  def getHeader(name: String): String
  def getHeaders(): js.Object
  def getStatusCode(): Double
  def haveError(): Boolean
  def waitForResponse(timeoutSecs: Double): Unit
}

object SOAPResponseV2 {
  @scala.inline
  def apply(
    getBody: CallbackTo[String],
    getErrorCode: CallbackTo[Double],
    getErrorMessage: CallbackTo[String],
    getHeader: String => CallbackTo[String],
    getHeaders: CallbackTo[js.Object],
    getStatusCode: CallbackTo[Double],
    haveError: CallbackTo[Boolean],
    waitForResponse: Double => Callback
  ): SOAPResponseV2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBody")(getBody.toJsFn)
    __obj.updateDynamic("getErrorCode")(getErrorCode.toJsFn)
    __obj.updateDynamic("getErrorMessage")(getErrorMessage.toJsFn)
    __obj.updateDynamic("getHeader")(js.Any.fromFunction1((t0: java.lang.String) => getHeader(t0).runNow()))
    __obj.updateDynamic("getHeaders")(getHeaders.toJsFn)
    __obj.updateDynamic("getStatusCode")(getStatusCode.toJsFn)
    __obj.updateDynamic("haveError")(haveError.toJsFn)
    __obj.updateDynamic("waitForResponse")(js.Any.fromFunction1((t0: scala.Double) => waitForResponse(t0).runNow()))
    __obj.asInstanceOf[SOAPResponseV2]
  }
}

