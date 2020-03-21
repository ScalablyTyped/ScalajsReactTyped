package typingsJapgolly.reactJsonschemaForm.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldValidation extends js.Object {
  var __errors: js.Array[FieldError]
  def addError(message: String): Unit
}

object FieldValidation {
  @scala.inline
  def apply(__errors: js.Array[FieldError], addError: String => Callback): FieldValidation = {
    val __obj = js.Dynamic.literal(__errors = __errors.asInstanceOf[js.Any])
    __obj.updateDynamic("addError")(js.Any.fromFunction1((t0: java.lang.String) => addError(t0).runNow()))
    __obj.asInstanceOf[FieldValidation]
  }
}

