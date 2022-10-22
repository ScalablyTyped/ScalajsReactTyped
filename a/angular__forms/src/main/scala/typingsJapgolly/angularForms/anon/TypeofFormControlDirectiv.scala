package typingsJapgolly.angularForms.anon

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularForms.angularFormsBooleans.`false`
import typingsJapgolly.angularForms.angularFormsStrings.`[formControl]`
import typingsJapgolly.angularForms.angularFormsStrings.ngForm
import typingsJapgolly.angularForms.mod.AsyncValidator
import typingsJapgolly.angularForms.mod.AsyncValidatorFn
import typingsJapgolly.angularForms.mod.ControlValueAccessor
import typingsJapgolly.angularForms.mod.FormControlDirective
import typingsJapgolly.angularForms.mod.Validator
import typingsJapgolly.angularForms.mod.ValidatorFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFormControlDirectiv
  extends StObject
     with Instantiable3[
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      /* valueAccessors */ js.Array[ControlValueAccessor], 
      FormControlDirective
    ]
     with Instantiable4[
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      /* valueAccessors */ js.Array[ControlValueAccessor], 
      /* _ngModelWarningConfig */ String, 
      FormControlDirective
    ] {
  
  var ɵdir: ɵɵDirectiveDeclaration[
    FormControlDirective, 
    `[formControl]`, 
    js.Array[ngForm], 
    Form, 
    Update, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  
  var ɵfac: ɵɵFactoryDeclaration[FormControlDirective, js.Tuple4[Self, Self, Self, Optional]] = js.native
}
