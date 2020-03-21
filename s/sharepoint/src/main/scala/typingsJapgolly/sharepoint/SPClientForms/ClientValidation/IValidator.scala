package typingsJapgolly.sharepoint.SPClientForms.ClientValidation

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IValidator extends js.Object {
  def Validate(value: js.Any): ValidationResult
}

object IValidator {
  @scala.inline
  def apply(Validate: js.Any => CallbackTo[ValidationResult]): IValidator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Validate")(js.Any.fromFunction1((t0: js.Any) => Validate(t0).runNow()))
    __obj.asInstanceOf[IValidator]
  }
}

