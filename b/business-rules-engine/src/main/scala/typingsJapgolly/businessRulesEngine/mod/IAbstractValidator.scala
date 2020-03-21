package typingsJapgolly.businessRulesEngine.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractValidator[T] extends js.Object {
  var ForList: Boolean
  def CreateAbstractListRule(name: String): IAbstractValidationRule[_]
  def CreateAbstractRule(name: String): IAbstractValidationRule[_]
  def CreateRule(name: String): IAbstractValidationRule[_]
  def RuleFor(prop: String, validator: IPropertyValidator): js.Any
  def Validation(validatorFce: IValidatorFce): js.Any
  def ValidationFor(prop: String, validatorFce: IValidatorFce): js.Any
  def ValidatorFor[K](prop: String, validator: IAbstractValidator[K]): js.Any
}

object IAbstractValidator {
  @scala.inline
  def apply[T](
    CreateAbstractListRule: String => CallbackTo[IAbstractValidationRule[js.Any]],
    CreateAbstractRule: String => CallbackTo[IAbstractValidationRule[js.Any]],
    CreateRule: String => CallbackTo[IAbstractValidationRule[js.Any]],
    ForList: Boolean,
    RuleFor: (String, IPropertyValidator) => CallbackTo[js.Any],
    Validation: IValidatorFce => CallbackTo[js.Any],
    ValidationFor: (String, IValidatorFce) => CallbackTo[js.Any],
    ValidatorFor: (String, IAbstractValidator[js.Any]) => CallbackTo[js.Any]
  ): IAbstractValidator[T] = {
    val __obj = js.Dynamic.literal(ForList = ForList.asInstanceOf[js.Any])
    __obj.updateDynamic("CreateAbstractListRule")(js.Any.fromFunction1((t0: java.lang.String) => CreateAbstractListRule(t0).runNow()))
    __obj.updateDynamic("CreateAbstractRule")(js.Any.fromFunction1((t0: java.lang.String) => CreateAbstractRule(t0).runNow()))
    __obj.updateDynamic("CreateRule")(js.Any.fromFunction1((t0: java.lang.String) => CreateRule(t0).runNow()))
    __obj.updateDynamic("RuleFor")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.businessRulesEngine.mod.IPropertyValidator) => RuleFor(t0, t1).runNow()))
    __obj.updateDynamic("Validation")(js.Any.fromFunction1((t0: typingsJapgolly.businessRulesEngine.mod.IValidatorFce) => Validation(t0).runNow()))
    __obj.updateDynamic("ValidationFor")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.businessRulesEngine.mod.IValidatorFce) => ValidationFor(t0, t1).runNow()))
    __obj.updateDynamic("ValidatorFor")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.businessRulesEngine.mod.IAbstractValidator[js.Any]) => ValidatorFor(t0, t1).runNow()))
    __obj.asInstanceOf[IAbstractValidator[T]]
  }
}

