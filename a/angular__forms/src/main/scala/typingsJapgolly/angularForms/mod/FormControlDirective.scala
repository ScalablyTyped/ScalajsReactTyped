package typingsJapgolly.angularForms.mod

import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.OnChanges
import typingsJapgolly.angularCore.mod.OnDestroy
import typingsJapgolly.angularCore.mod.SimpleChanges
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularForms.angularFormsBooleans.`false`
import typingsJapgolly.angularForms.angularFormsStrings.`[formControl]`
import typingsJapgolly.angularForms.angularFormsStrings.ngForm
import typingsJapgolly.angularForms.anon.Optional
import typingsJapgolly.angularForms.anon.Self
import typingsJapgolly.angularForms.anon.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "FormControlDirective")
@js.native
open class FormControlDirective protected ()
  extends NgControl
     with OnChanges
     with OnDestroy {
  def this(
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn],
    valueAccessors: js.Array[ControlValueAccessor]
  ) = this()
  def this(
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn],
    valueAccessors: js.Array[ControlValueAccessor],
    _ngModelWarningConfig: String
  ) = this()
  
  /* private */ var _isControlChanged: Any = js.native
  
  /* private */ var _ngModelWarningConfig: Any = js.native
  
  /**
    * @description
    * Tracks the `FormControl` instance bound to the directive.
    */
  var form: FormControl[Any] = js.native
  
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
  
  /**
    * Internal reference to the view model value.
    * @nodoc
    */
  var viewModel: Any = js.native
}
/* static members */
object FormControlDirective {
  
  @JSImport("@angular/forms", "FormControlDirective")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "FormControlDirective.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    FormControlDirective, 
    `[formControl]`, 
    js.Array[ngForm], 
    typingsJapgolly.angularForms.anon.Form, 
    Update, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      FormControlDirective, 
      `[formControl]`, 
      js.Array[ngForm], 
      typingsJapgolly.angularForms.anon.Form, 
      Update, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "FormControlDirective.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[FormControlDirective, js.Tuple4[Self, Self, Self, Optional]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[FormControlDirective, js.Tuple4[Self, Self, Self, Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
