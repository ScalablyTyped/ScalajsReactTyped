package typingsJapgolly.angularForms.anon

import typingsJapgolly.angularForms.angularFormsBooleans.`true`
import typingsJapgolly.angularForms.angularFormsStrings.blur
import typingsJapgolly.angularForms.angularFormsStrings.change
import typingsJapgolly.angularForms.angularFormsStrings.submit
import typingsJapgolly.angularForms.mod.AbstractControl
import typingsJapgolly.angularForms.mod.AsyncValidatorFn
import typingsJapgolly.angularForms.mod.ValidationErrors
import typingsJapgolly.angularForms.mod.ValidatorFn
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/forms.@angular/forms.FormControlOptions & {  nonNullable :true} */
trait FormControlOptionsnonNull extends StObject {
  
  /**
    * @description
    * The list of async validators applied to control.
    */
  var asyncValidators: js.UndefOr[AsyncValidatorFn | js.Array[AsyncValidatorFn] | Null] = js.undefined
  
  /**
    * @deprecated Use `nonNullable` instead.
    */
  var initialValueIsDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description
    * Whether to use the initial value used to construct the `FormControl` as its default value
    * as well. If this option is false or not provided, the default value of a FormControl is `null`.
    * When a FormControl is reset without an explicit value, its value reverts to
    * its default value.
    */
  var nonNullable: js.UndefOr[Boolean] & `true`
  
  /**
    * @description
    * The event name for control to update upon.
    */
  var updateOn: js.UndefOr[change | blur | submit] = js.undefined
  
  /**
    * @description
    * The list of validators applied to a control.
    */
  var validators: js.UndefOr[ValidatorFn | js.Array[ValidatorFn] | Null] = js.undefined
}
object FormControlOptionsnonNull {
  
  inline def apply(nonNullable: js.UndefOr[Boolean] & `true`): FormControlOptionsnonNull = {
    val __obj = js.Dynamic.literal(nonNullable = nonNullable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlOptionsnonNull]
  }
  
  extension [Self <: FormControlOptionsnonNull](x: Self) {
    
    inline def setAsyncValidators(value: AsyncValidatorFn | js.Array[AsyncValidatorFn]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
    
    inline def setAsyncValidatorsFunction1(
      value: /* control */ AbstractControl[Any, Any] => (js.Promise[ValidationErrors | Null]) | (Observable_[ValidationErrors | Null])
    ): Self = StObject.set(x, "asyncValidators", js.Any.fromFunction1(value))
    
    inline def setAsyncValidatorsNull: Self = StObject.set(x, "asyncValidators", null)
    
    inline def setAsyncValidatorsUndefined: Self = StObject.set(x, "asyncValidators", js.undefined)
    
    inline def setAsyncValidatorsVarargs(value: AsyncValidatorFn*): Self = StObject.set(x, "asyncValidators", js.Array(value*))
    
    inline def setInitialValueIsDefault(value: Boolean): Self = StObject.set(x, "initialValueIsDefault", value.asInstanceOf[js.Any])
    
    inline def setInitialValueIsDefaultUndefined: Self = StObject.set(x, "initialValueIsDefault", js.undefined)
    
    inline def setNonNullable(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "nonNullable", value.asInstanceOf[js.Any])
    
    inline def setUpdateOn(value: change | blur | submit): Self = StObject.set(x, "updateOn", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnUndefined: Self = StObject.set(x, "updateOn", js.undefined)
    
    inline def setValidators(value: ValidatorFn | js.Array[ValidatorFn]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsFunction1(value: /* control */ AbstractControl[Any, Any] => ValidationErrors | Null): Self = StObject.set(x, "validators", js.Any.fromFunction1(value))
    
    inline def setValidatorsNull: Self = StObject.set(x, "validators", null)
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    inline def setValidatorsVarargs(value: ValidatorFn*): Self = StObject.set(x, "validators", js.Array(value*))
  }
}
