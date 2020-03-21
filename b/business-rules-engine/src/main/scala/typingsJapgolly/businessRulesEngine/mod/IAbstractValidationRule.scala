package typingsJapgolly.businessRulesEngine.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractValidationRule[T] extends js.Object {
  var Children: StringDictionary[IAbstractValidationRule[_]]
  var Rules: StringDictionary[IPropertyValidationRule[T]]
  var ValidationResult: IValidationResult
  var Validators: StringDictionary[IValidator]
  def Validate(context: T): IValidationResult
  def ValidateAll(context: T): Promise[IValidationResult]
  def ValidateAsync(context: T): Promise[IValidationResult]
  def ValidateProperty(context: T, propName: String): Unit
}

object IAbstractValidationRule {
  @scala.inline
  def apply[T](
    Children: StringDictionary[IAbstractValidationRule[_]],
    Rules: StringDictionary[IPropertyValidationRule[T]],
    Validate: T => CallbackTo[IValidationResult],
    ValidateAll: T => CallbackTo[Promise[IValidationResult]],
    ValidateAsync: T => CallbackTo[Promise[IValidationResult]],
    ValidateProperty: (T, String) => Callback,
    ValidationResult: IValidationResult,
    Validators: StringDictionary[IValidator]
  ): IAbstractValidationRule[T] = {
    val __obj = js.Dynamic.literal(Children = Children.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any], ValidationResult = ValidationResult.asInstanceOf[js.Any], Validators = Validators.asInstanceOf[js.Any])
    __obj.updateDynamic("Validate")(js.Any.fromFunction1((t0: T) => Validate(t0).runNow()))
    __obj.updateDynamic("ValidateAll")(js.Any.fromFunction1((t0: T) => ValidateAll(t0).runNow()))
    __obj.updateDynamic("ValidateAsync")(js.Any.fromFunction1((t0: T) => ValidateAsync(t0).runNow()))
    __obj.updateDynamic("ValidateProperty")(js.Any.fromFunction2((t0: T, t1: java.lang.String) => ValidateProperty(t0, t1).runNow()))
    __obj.asInstanceOf[IAbstractValidationRule[T]]
  }
}

