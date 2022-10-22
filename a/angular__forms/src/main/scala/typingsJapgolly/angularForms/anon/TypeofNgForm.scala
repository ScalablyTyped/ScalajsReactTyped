package typingsJapgolly.angularForms.anon

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularForms.angularFormsBooleans.`false`
import typingsJapgolly.angularForms.angularFormsStrings.ngForm
import typingsJapgolly.angularForms.mod.AsyncValidator
import typingsJapgolly.angularForms.mod.AsyncValidatorFn
import typingsJapgolly.angularForms.mod.NgForm
import typingsJapgolly.angularForms.mod.Validator
import typingsJapgolly.angularForms.mod.ValidatorFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNgForm
  extends StObject
     with Instantiable2[
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      NgForm
    ] {
  
  var ɵdir: ɵɵDirectiveDeclaration[
    NgForm, 
    /* form:not([ngNoForm]):not([formGroup]),ng-form,[ngForm] */ String, 
    js.Array[ngForm], 
    Options, 
    NgSubmit, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  
  var ɵfac: ɵɵFactoryDeclaration[NgForm, js.Tuple2[Self, Self]] = js.native
}
