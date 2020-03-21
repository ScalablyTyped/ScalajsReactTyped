package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error that is shown to users of the connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *
  *     cc.newUserError()
  *       .setText("This is the debug error text.")
  *       .setDebugText("This text is only shown to admins.")
  *       .throwException();
  */
trait UserError extends js.Object {
  def printJson(): String
  def setDebugText(text: String): UserError
  def setText(text: String): UserError
  def throwException(): Unit
}

object UserError {
  @scala.inline
  def apply(
    printJson: CallbackTo[String],
    setDebugText: String => CallbackTo[UserError],
    setText: String => CallbackTo[UserError],
    throwException: Callback
  ): UserError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("printJson")(printJson.toJsFn)
    __obj.updateDynamic("setDebugText")(js.Any.fromFunction1((t0: java.lang.String) => setDebugText(t0).runNow()))
    __obj.updateDynamic("setText")(js.Any.fromFunction1((t0: java.lang.String) => setText(t0).runNow()))
    __obj.updateDynamic("throwException")(throwException.toJsFn)
    __obj.asInstanceOf[UserError]
  }
}

