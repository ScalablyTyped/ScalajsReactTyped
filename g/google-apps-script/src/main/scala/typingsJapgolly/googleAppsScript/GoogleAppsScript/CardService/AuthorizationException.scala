package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error that can be returned to trigger an authorization card to be shown to the user.
  *
  *     CardService.newAuthorizationException()
  *       .setAuthorizationUrl("http://auth.com/")
  *       .setResourceDisplayName("Example Resource")
  *       .throwException();
  */
trait AuthorizationException extends js.Object {
  def printJson(): String
  def setAuthorizationUrl(authUrl: String): AuthorizationException
  def setCustomUiCallback(callback: String): AuthorizationException
  def setResourceDisplayName(name: String): AuthorizationException
  def throwException(): Unit
}

object AuthorizationException {
  @scala.inline
  def apply(
    printJson: CallbackTo[String],
    setAuthorizationUrl: String => CallbackTo[AuthorizationException],
    setCustomUiCallback: String => CallbackTo[AuthorizationException],
    setResourceDisplayName: String => CallbackTo[AuthorizationException],
    throwException: Callback
  ): AuthorizationException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("printJson")(printJson.toJsFn)
    __obj.updateDynamic("setAuthorizationUrl")(js.Any.fromFunction1((t0: java.lang.String) => setAuthorizationUrl(t0).runNow()))
    __obj.updateDynamic("setCustomUiCallback")(js.Any.fromFunction1((t0: java.lang.String) => setCustomUiCallback(t0).runNow()))
    __obj.updateDynamic("setResourceDisplayName")(js.Any.fromFunction1((t0: java.lang.String) => setResourceDisplayName(t0).runNow()))
    __obj.updateDynamic("throwException")(throwException.toJsFn)
    __obj.asInstanceOf[AuthorizationException]
  }
}

