package typingsJapgolly.angularForms.anon

import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularForms.angularFormsBooleans.`false`
import typingsJapgolly.angularForms.angularFormsStrings.`[formArrayName]`
import typingsJapgolly.angularForms.mod.AsyncValidator
import typingsJapgolly.angularForms.mod.AsyncValidatorFn
import typingsJapgolly.angularForms.mod.ControlContainer
import typingsJapgolly.angularForms.mod.FormArrayName
import typingsJapgolly.angularForms.mod.Validator
import typingsJapgolly.angularForms.mod.ValidatorFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFormArrayName
  extends StObject
     with Instantiable3[
      /* parent */ ControlContainer, 
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      FormArrayName
    ] {
  
  var ɵdir: ɵɵDirectiveDeclaration[
    FormArrayName, 
    `[formArrayName]`, 
    scala.Nothing, 
    Name, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  
  var ɵfac: ɵɵFactoryDeclaration[FormArrayName, js.Tuple3[Host, Self, Self]] = js.native
}
