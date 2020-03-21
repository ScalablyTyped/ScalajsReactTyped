package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error that is only visible to admins of the connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *
  *     cc.newDebugError()
  *       .setText("This is the debug error text.")
  *       .throwException();
  */
trait DebugError extends js.Object {
  def printJson(): String
  def setText(text: String): DebugError
  def throwException(): Unit
}

object DebugError {
  @scala.inline
  def apply(printJson: CallbackTo[String], setText: String => CallbackTo[DebugError], throwException: Callback): DebugError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("printJson")(printJson.toJsFn)
    __obj.updateDynamic("setText")(js.Any.fromFunction1((t0: java.lang.String) => setText(t0).runNow()))
    __obj.updateDynamic("throwException")(throwException.toJsFn)
    __obj.asInstanceOf[DebugError]
  }
}

