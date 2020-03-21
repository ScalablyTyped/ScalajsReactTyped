package typingsJapgolly.angularForms.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncValidator extends Validator

object AsyncValidator {
  @scala.inline
  def apply(
    validate: AbstractControl => CallbackTo[ValidationErrors | Null],
    registerOnValidatorChange: /* fn */ js.Function0[Unit] => Callback = null
  ): AsyncValidator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: typingsJapgolly.angularForms.mod.AbstractControl) => validate(t0).runNow()))
    if (registerOnValidatorChange != null) __obj.updateDynamic("registerOnValidatorChange")(js.Any.fromFunction1((t0: /* fn */ js.Function0[scala.Unit]) => registerOnValidatorChange(t0).runNow()))
    __obj.asInstanceOf[AsyncValidator]
  }
}

