package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An authorization action that will send the user to the AuthorizationUrl when clicked.
  *
  *     CardService.newAuthorizationAction()
  *       .setAuthorizationUrl("http://google.com/");
  */
trait AuthorizationAction extends js.Object {
  def setAuthorizationUrl(authorizationUrl: String): AuthorizationAction
}

object AuthorizationAction {
  @scala.inline
  def apply(setAuthorizationUrl: String => CallbackTo[AuthorizationAction]): AuthorizationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAuthorizationUrl")(js.Any.fromFunction1((t0: java.lang.String) => setAuthorizationUrl(t0).runNow()))
    __obj.asInstanceOf[AuthorizationAction]
  }
}

