package typingsJapgolly.angularForms.anon

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularForms.angularFormsBooleans.`false`
import typingsJapgolly.angularForms.angularFormsStrings.ngModel
import typingsJapgolly.angularForms.mod.AsyncValidator
import typingsJapgolly.angularForms.mod.AsyncValidatorFn
import typingsJapgolly.angularForms.mod.ControlContainer
import typingsJapgolly.angularForms.mod.ControlValueAccessor
import typingsJapgolly.angularForms.mod.NgModel
import typingsJapgolly.angularForms.mod.Validator
import typingsJapgolly.angularForms.mod.ValidatorFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNgModel
  extends StObject
     with Instantiable4[
      /* parent */ ControlContainer, 
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      /* valueAccessors */ js.Array[ControlValueAccessor], 
      NgModel
    ]
     with Instantiable5[
      /* parent */ ControlContainer, 
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      /* valueAccessors */ js.Array[ControlValueAccessor], 
      /* _changeDetectorRef */ ChangeDetectorRef, 
      NgModel
    ] {
  
  /** @nodoc */
  var ngAcceptInputType_isDisabled: Boolean | String = js.native
  
  var ɵdir: ɵɵDirectiveDeclaration[
    NgModel, 
    /* [ngModel]:not([formControlName]):not([formControl]) */ String, 
    js.Array[ngModel], 
    Model, 
    Update, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  
  var ɵfac: ɵɵFactoryDeclaration[NgModel, js.Tuple5[HostOptional, Self, Self, Self, Optional]] = js.native
}
