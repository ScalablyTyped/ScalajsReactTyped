package typingsJapgolly.angularForms.mod

import typingsJapgolly.angularCore.mod.OnDestroy
import typingsJapgolly.angularCore.mod.OnInit
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularForms.angularFormsBooleans.`false`
import typingsJapgolly.angularForms.angularFormsStrings.`[formArrayName]`
import typingsJapgolly.angularForms.anon.Host
import typingsJapgolly.angularForms.anon.Name
import typingsJapgolly.angularForms.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "FormArrayName")
@js.native
open class FormArrayName protected ()
  extends ControlContainer
     with OnInit
     with OnDestroy {
  def this(
    parent: ControlContainer,
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn]
  ) = this()
  
  /* private */ var _checkParentType: Any = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked the directive's
    * data-bound properties for the first time,
    * and before any of the view or content children have been checked.
    * It is invoked only once when the directive is instantiated.
    */
  /* CompleteClass */
  override def ngOnInit(): Unit = js.native
}
/* static members */
object FormArrayName {
  
  @JSImport("@angular/forms", "FormArrayName")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "FormArrayName.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    FormArrayName, 
    `[formArrayName]`, 
    scala.Nothing, 
    Name, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      FormArrayName, 
      `[formArrayName]`, 
      scala.Nothing, 
      Name, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "FormArrayName.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[FormArrayName, js.Tuple3[Host, Self, Self]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[FormArrayName, js.Tuple3[Host, Self, Self]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
