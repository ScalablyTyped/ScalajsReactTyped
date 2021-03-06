package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.servicenow.AnonGet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTResponseV2 extends js.Object {
  def getBody(): String
  def getCookies(): AnonGet
  def getErrorCode(): Double
  def getErrorMessage(): String
  def getHeader(name: String): String
  def getHeaders(): js.Object
  def getQueryString(): String
  def getResponseAttachmentSysid(): String
  def getStatusCode(): Double
  def haveError(): Boolean
  def waitForResponse(timeoutSecs: Double): Unit
}

object RESTResponseV2 {
  @scala.inline
  def apply(
    getBody: CallbackTo[String],
    getCookies: CallbackTo[AnonGet],
    getErrorCode: CallbackTo[Double],
    getErrorMessage: CallbackTo[String],
    getHeader: String => CallbackTo[String],
    getHeaders: CallbackTo[js.Object],
    getQueryString: CallbackTo[String],
    getResponseAttachmentSysid: CallbackTo[String],
    getStatusCode: CallbackTo[Double],
    haveError: CallbackTo[Boolean],
    waitForResponse: Double => Callback
  ): RESTResponseV2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBody")(getBody.toJsFn)
    __obj.updateDynamic("getCookies")(getCookies.toJsFn)
    __obj.updateDynamic("getErrorCode")(getErrorCode.toJsFn)
    __obj.updateDynamic("getErrorMessage")(getErrorMessage.toJsFn)
    __obj.updateDynamic("getHeader")(js.Any.fromFunction1((t0: java.lang.String) => getHeader(t0).runNow()))
    __obj.updateDynamic("getHeaders")(getHeaders.toJsFn)
    __obj.updateDynamic("getQueryString")(getQueryString.toJsFn)
    __obj.updateDynamic("getResponseAttachmentSysid")(getResponseAttachmentSysid.toJsFn)
    __obj.updateDynamic("getStatusCode")(getStatusCode.toJsFn)
    __obj.updateDynamic("haveError")(haveError.toJsFn)
    __obj.updateDynamic("waitForResponse")(js.Any.fromFunction1((t0: scala.Double) => waitForResponse(t0).runNow()))
    __obj.asInstanceOf[RESTResponseV2]
  }
}

