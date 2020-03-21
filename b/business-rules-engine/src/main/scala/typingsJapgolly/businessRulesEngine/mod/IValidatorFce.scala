package typingsJapgolly.businessRulesEngine.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidatorFce extends js.Object {
  var AsyncValidationFce: js.UndefOr[IAsyncValidate] = js.undefined
  var Name: String
  var ValidationFce: js.UndefOr[IValidate] = js.undefined
}

object IValidatorFce {
  @scala.inline
  def apply(
    Name: String,
    AsyncValidationFce: /* args */ IError => CallbackTo[Promise[js.Any]] = null,
    ValidationFce: /* args */ IError => Callback = null
  ): IValidatorFce = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (AsyncValidationFce != null) __obj.updateDynamic("AsyncValidationFce")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.businessRulesEngine.mod.IError) => AsyncValidationFce(t0).runNow()))
    if (ValidationFce != null) __obj.updateDynamic("ValidationFce")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.businessRulesEngine.mod.IError) => ValidationFce(t0).runNow()))
    __obj.asInstanceOf[IValidatorFce]
  }
}

