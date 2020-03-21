package typingsJapgolly.businessRulesEngine.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValidationRule[T] extends js.Object {
  var Validators: StringDictionary[js.Any]
  def Validate(context: IValidationContext[T]): js.Array[IValidationFailure]
  def ValidateAsync(context: IValidationContext[T]): Promise[js.Array[IValidationFailure]]
}

object IPropertyValidationRule {
  @scala.inline
  def apply[T](
    Validate: IValidationContext[T] => CallbackTo[js.Array[IValidationFailure]],
    ValidateAsync: IValidationContext[T] => CallbackTo[Promise[js.Array[IValidationFailure]]],
    Validators: StringDictionary[js.Any]
  ): IPropertyValidationRule[T] = {
    val __obj = js.Dynamic.literal(Validators = Validators.asInstanceOf[js.Any])
    __obj.updateDynamic("Validate")(js.Any.fromFunction1((t0: typingsJapgolly.businessRulesEngine.mod.IValidationContext[T]) => Validate(t0).runNow()))
    __obj.updateDynamic("ValidateAsync")(js.Any.fromFunction1((t0: typingsJapgolly.businessRulesEngine.mod.IValidationContext[T]) => ValidateAsync(t0).runNow()))
    __obj.asInstanceOf[IPropertyValidationRule[T]]
  }
}

