package typingsJapgolly.angularForms.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validator extends js.Object {
  /**
    * @description
    * Registers a callback function to call when the validator inputs change.
    *
    * @param fn The callback function
    */
  var registerOnValidatorChange: js.UndefOr[js.Function1[/* fn */ js.Function0[Unit], Unit]] = js.undefined
  /**
    * @description
    * Method that performs synchronous validation against the provided control.
    *
    * @param control The control to validate against.
    *
    * @returns A map of validation errors if validation fails,
    * otherwise null.
    */
  def validate(control: AbstractControl): ValidationErrors | Null
}

object Validator {
  @scala.inline
  def apply(
    validate: AbstractControl => CallbackTo[ValidationErrors | Null],
    registerOnValidatorChange: /* fn */ js.Function0[Unit] => Callback = null
  ): Validator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: typingsJapgolly.angularForms.mod.AbstractControl) => validate(t0).runNow()))
    if (registerOnValidatorChange != null) __obj.updateDynamic("registerOnValidatorChange")(js.Any.fromFunction1((t0: /* fn */ js.Function0[scala.Unit]) => registerOnValidatorChange(t0).runNow()))
    __obj.asInstanceOf[Validator]
  }
}

