package typingsJapgolly.meteor.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLS extends js.Object {
  def enrollAccount(token: String): String
  def resetPassword(token: String): String
  def verifyEmail(token: String): String
}

object URLS {
  @scala.inline
  def apply(
    enrollAccount: String => CallbackTo[String],
    resetPassword: String => CallbackTo[String],
    verifyEmail: String => CallbackTo[String]
  ): URLS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enrollAccount")(js.Any.fromFunction1((t0: java.lang.String) => enrollAccount(t0).runNow()))
    __obj.updateDynamic("resetPassword")(js.Any.fromFunction1((t0: java.lang.String) => resetPassword(t0).runNow()))
    __obj.updateDynamic("verifyEmail")(js.Any.fromFunction1((t0: java.lang.String) => verifyEmail(t0).runNow()))
    __obj.asInstanceOf[URLS]
  }
}

