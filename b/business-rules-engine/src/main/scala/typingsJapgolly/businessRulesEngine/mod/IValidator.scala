package typingsJapgolly.businessRulesEngine.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidator extends js.Object {
  var Error: IError
  def Validate(context: js.Any): IValidationFailure
  def ValidateAsync(context: js.Any): Promise[IValidationFailure]
}

object IValidator {
  @scala.inline
  def apply(
    Error: IError,
    Validate: js.Any => CallbackTo[IValidationFailure],
    ValidateAsync: js.Any => CallbackTo[Promise[IValidationFailure]]
  ): IValidator = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any])
    __obj.updateDynamic("Validate")(js.Any.fromFunction1((t0: js.Any) => Validate(t0).runNow()))
    __obj.updateDynamic("ValidateAsync")(js.Any.fromFunction1((t0: js.Any) => ValidateAsync(t0).runNow()))
    __obj.asInstanceOf[IValidator]
  }
}

