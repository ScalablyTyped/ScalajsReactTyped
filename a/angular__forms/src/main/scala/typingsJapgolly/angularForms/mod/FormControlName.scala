package typingsJapgolly.angularForms.mod

import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.OnChanges
import typingsJapgolly.angularCore.mod.OnDestroy
import typingsJapgolly.angularCore.mod.SimpleChanges
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularForms.angularFormsBooleans.`false`
import typingsJapgolly.angularForms.angularFormsStrings.`[formControlName]`
import typingsJapgolly.angularForms.anon.Host
import typingsJapgolly.angularForms.anon.IsDisabled
import typingsJapgolly.angularForms.anon.Optional
import typingsJapgolly.angularForms.anon.Self
import typingsJapgolly.angularForms.anon.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "FormControlName")
@js.native
open class FormControlName protected ()
  extends NgControl
     with OnChanges
     with OnDestroy {
  def this(
    parent: ControlContainer,
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn],
    valueAccessors: js.Array[ControlValueAccessor]
  ) = this()
  def this(
    parent: ControlContainer,
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn],
    valueAccessors: js.Array[ControlValueAccessor],
    _ngModelWarningConfig: String
  ) = this()
  
  /* private */ var _added: Any = js.native
  
  /* private */ var _checkParentType: Any = js.native
  
  /* private */ var _ngModelWarningConfig: Any = js.native
  
  /* private */ var _setUpControl: Any = js.native
  
  /**
    * @description
    * Tracks the `FormControl` instance bound to the directive.
    */
  @JSName("control")
  val control_FFormControlName: FormControl[Any] = js.native
  
  /**
    * @description
    * The top-level directive for this group if present, otherwise null.
    */
  def formDirective: Any = js.native
  
  /**
    * @description
    * Triggers a warning in dev mode that this input should not be used with reactive forms.
    */
  def isDisabled_=(isDisabled: Boolean): Unit = js.native
  
  /** @deprecated as of v6 */
  var model: Any = js.native
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /** @deprecated as of v6 */
  var update: EventEmitter[Any] = js.native
}
/* static members */
object FormControlName {
  
  @JSImport("@angular/forms", "FormControlName")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "FormControlName.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    FormControlName, 
    `[formControlName]`, 
    scala.Nothing, 
    IsDisabled, 
    Update, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      FormControlName, 
      `[formControlName]`, 
      scala.Nothing, 
      IsDisabled, 
      Update, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "FormControlName.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[FormControlName, js.Tuple5[Host, Self, Self, Self, Optional]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[FormControlName, js.Tuple5[Host, Self, Self, Self, Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
