package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideSession extends js.Object {
  def getClientData(paramName: String): String
  def getClientIP(): String
  def getCurrentApplicationId(): String
  def getLanguage(): String
  def getSessionToken(): String
  def getTimeZoneName(): String
  def getUrlOnStack(): String
  def isInteractive(): Boolean
  def isLoggedIn(): Boolean
  def putClientData(paramName: String, paramValue: String): Unit
}

object GlideSession {
  @scala.inline
  def apply(
    getClientData: String => CallbackTo[String],
    getClientIP: CallbackTo[String],
    getCurrentApplicationId: CallbackTo[String],
    getLanguage: CallbackTo[String],
    getSessionToken: CallbackTo[String],
    getTimeZoneName: CallbackTo[String],
    getUrlOnStack: CallbackTo[String],
    isInteractive: CallbackTo[Boolean],
    isLoggedIn: CallbackTo[Boolean],
    putClientData: (String, String) => Callback
  ): GlideSession = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getClientData")(js.Any.fromFunction1((t0: java.lang.String) => getClientData(t0).runNow()))
    __obj.updateDynamic("getClientIP")(getClientIP.toJsFn)
    __obj.updateDynamic("getCurrentApplicationId")(getCurrentApplicationId.toJsFn)
    __obj.updateDynamic("getLanguage")(getLanguage.toJsFn)
    __obj.updateDynamic("getSessionToken")(getSessionToken.toJsFn)
    __obj.updateDynamic("getTimeZoneName")(getTimeZoneName.toJsFn)
    __obj.updateDynamic("getUrlOnStack")(getUrlOnStack.toJsFn)
    __obj.updateDynamic("isInteractive")(isInteractive.toJsFn)
    __obj.updateDynamic("isLoggedIn")(isLoggedIn.toJsFn)
    __obj.updateDynamic("putClientData")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => putClientData(t0, t1).runNow()))
    __obj.asInstanceOf[GlideSession]
  }
}

