package typingsJapgolly.businessRulesEngine.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAbstractValidationRule[T] extends StObject {
  
  var Children: StringDictionary[IAbstractValidationRule[Any]]
  
  var Rules: StringDictionary[IPropertyValidationRule[T]]
  
  def Validate(context: T): IValidationResult
  
  def ValidateAll(context: T): Promise[IValidationResult]
  
  def ValidateAsync(context: T): Promise[IValidationResult]
  
  def ValidateProperty(context: T, propName: String): Unit
  
  var ValidationResult: IValidationResult
  
  var Validators: StringDictionary[IValidator]
}
object IAbstractValidationRule {
  
  inline def apply[T](
    Children: StringDictionary[IAbstractValidationRule[Any]],
    Rules: StringDictionary[IPropertyValidationRule[T]],
    Validate: T => IValidationResult,
    ValidateAll: T => Promise[IValidationResult],
    ValidateAsync: T => Promise[IValidationResult],
    ValidateProperty: (T, String) => Callback,
    ValidationResult: IValidationResult,
    Validators: StringDictionary[IValidator]
  ): IAbstractValidationRule[T] = {
    val __obj = js.Dynamic.literal(Children = Children.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any], Validate = js.Any.fromFunction1(Validate), ValidateAll = js.Any.fromFunction1(ValidateAll), ValidateAsync = js.Any.fromFunction1(ValidateAsync), ValidateProperty = js.Any.fromFunction2((t0: T, t1: String) => (ValidateProperty(t0, t1)).runNow()), ValidationResult = ValidationResult.asInstanceOf[js.Any], Validators = Validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstractValidationRule[T]]
  }
  
  extension [Self <: IAbstractValidationRule[?], T](x: Self & IAbstractValidationRule[T]) {
    
    inline def setChildren(value: StringDictionary[IAbstractValidationRule[Any]]): Self = StObject.set(x, "Children", value.asInstanceOf[js.Any])
    
    inline def setRules(value: StringDictionary[IPropertyValidationRule[T]]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: T => IValidationResult): Self = StObject.set(x, "Validate", js.Any.fromFunction1(value))
    
    inline def setValidateAll(value: T => Promise[IValidationResult]): Self = StObject.set(x, "ValidateAll", js.Any.fromFunction1(value))
    
    inline def setValidateAsync(value: T => Promise[IValidationResult]): Self = StObject.set(x, "ValidateAsync", js.Any.fromFunction1(value))
    
    inline def setValidateProperty(value: (T, String) => Callback): Self = StObject.set(x, "ValidateProperty", js.Any.fromFunction2((t0: T, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setValidationResult(value: IValidationResult): Self = StObject.set(x, "ValidationResult", value.asInstanceOf[js.Any])
    
    inline def setValidators(value: StringDictionary[IValidator]): Self = StObject.set(x, "Validators", value.asInstanceOf[js.Any])
  }
}
