package typingsJapgolly.camundaExternalTaskClientJs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  def error(text: String): Unit
  def success(text: String): Unit
}

object AnonError {
  @scala.inline
  def apply(error: String => Callback, success: String => Callback): AnonError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: java.lang.String) => error(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: java.lang.String) => success(t0).runNow()))
    __obj.asInstanceOf[AnonError]
  }
}

