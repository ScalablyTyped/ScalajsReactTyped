package typingsJapgolly.angularForms.mod

import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularForms.angularFormsBooleans.`false`
import typingsJapgolly.angularForms.angularFormsStrings.`[formGroupName]`
import typingsJapgolly.angularForms.anon.Host
import typingsJapgolly.angularForms.anon.Self
import typingsJapgolly.angularForms.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "FormGroupName")
@js.native
open class FormGroupName protected () extends AbstractFormGroupDirective {
  def this(
    parent: ControlContainer,
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn]
  ) = this()
}
/* static members */
object FormGroupName {
  
  @JSImport("@angular/forms", "FormGroupName")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "FormGroupName.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    FormGroupName, 
    `[formGroupName]`, 
    scala.Nothing, 
    `2`, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      FormGroupName, 
      `[formGroupName]`, 
      scala.Nothing, 
      `2`, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "FormGroupName.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[FormGroupName, js.Tuple3[Host, Self, Self]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[FormGroupName, js.Tuple3[Host, Self, Self]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
