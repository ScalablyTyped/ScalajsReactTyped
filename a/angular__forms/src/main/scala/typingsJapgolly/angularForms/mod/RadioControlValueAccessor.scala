package typingsJapgolly.angularForms.mod

import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.OnDestroy
import typingsJapgolly.angularCore.mod.OnInit
import typingsJapgolly.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "RadioControlValueAccessor")
@js.native
class RadioControlValueAccessor protected ()
  extends ControlValueAccessor
     with OnDestroy
     with OnInit {
  def this(
    _renderer: Renderer2,
    _elementRef: ElementRef[_],
    _registry: ɵangularPackagesFormsFormsO,
    _injector: Injector
  ) = this()
  var _checkName: js.Any = js.native
  var _elementRef: js.Any = js.native
  var _injector: js.Any = js.native
  var _registry: js.Any = js.native
  var _renderer: js.Any = js.native
  var _throwNameError: js.Any = js.native
  /**
    * @description
    * Tracks the name of the `FormControl` bound to the directive. The name corresponds
    * to a key in the parent `FormGroup` or `FormArray`.
    */
  var formControlName: String = js.native
  /**
    * @description
    * Tracks the name of the radio input element.
    */
  var name: String = js.native
  /**
    * @description
    * Tracks the value of the radio input element
    */
  var value: js.Any = js.native
  /**
    * Sets the "value" on the radio input element and unchecks it.
    *
    * @param value
    */
  def fireUncheck(value: js.Any): Unit = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
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
  /**
    * @description
    * The registered callback function called when a change event occurs on the input element.
    */
  def onChange(): Unit = js.native
  /**
    * @description
    * The registered callback function called when a blur event occurs on the input element.
    */
  def onTouched(): Unit = js.native
  /**
    * @description
    * Registers a callback function that is called when the control's value
    * changes in the UI.
    *
    * This method is called by the forms API on initialization to update the form
    * model when values propagate from the view to the model.
    *
    * When implementing the `registerOnChange` method in your own value accessor,
    * save the given function so your class calls it at the appropriate time.
    *
    * @usageNotes
    * ### Store the change function
    *
    * The following example stores the provided function as an internal method.
    *
    * ```ts
    * registerOnChange(fn: (_: any) => void): void {
    *   this._onChange = fn;
    * }
    * ```
    *
    * When the value changes in the UI, call the registered
    * function to allow the forms API to update itself:
    *
    * ```ts
    * host: {
    *    '(change)': '_onChange($event.target.value)'
    * }
    * ```
    *
    * @param fn The callback function to register
    */
  /* CompleteClass */
  override def registerOnChange(fn: js.Any): Unit = js.native
  /**
    * @description
    * Registers a function called when the control value changes.
    *
    * @param fn The callback function
    */
  def registerOnChange(fn: js.Function1[/* _ */ js.Any, js.Object]): Unit = js.native
  /**
    * @description
    * Registers a callback function is called by the forms API on initialization
    * to update the form model on blur.
    *
    * When implementing `registerOnTouched` in your own value accessor, save the given
    * function so your class calls it when the control should be considered
    * blurred or "touched".
    *
    * @usageNotes
    * ### Store the callback function
    *
    * The following example stores the provided function as an internal method.
    *
    * ```ts
    * registerOnTouched(fn: any): void {
    *   this._onTouched = fn;
    * }
    * ```
    *
    * On blur (or equivalent), your class should call the registered function to allow
    * the forms API to update itself:
    *
    * ```ts
    * host: {
    *    '(blur)': '_onTouched()'
    * }
    * ```
    *
    * @param fn The callback function to register
    */
  /* CompleteClass */
  override def registerOnTouched(fn: js.Any): Unit = js.native
  /**
    * @description
    * Registers a function called when the control is touched.
    *
    * @param fn The callback function
    */
  def registerOnTouched(fn: js.Function0[js.Object]): Unit = js.native
  /**
    * Sets the "disabled" property on the input element.
    *
    * @param isDisabled The disabled value
    */
  @JSName("setDisabledState")
  def setDisabledState_MRadioControlValueAccessor(isDisabled: Boolean): Unit = js.native
  /**
    * @description
    * Writes a new value to the element.
    *
    * This method is called by the forms API to write to the view when programmatic
    * changes from model to view are requested.
    *
    * @usageNotes
    * ### Write a value to the element
    *
    * The following example writes a value to the native DOM element.
    *
    * ```ts
    * writeValue(value: any): void {
    *   this._renderer.setProperty(this._elementRef.nativeElement, 'value', value);
    * }
    * ```
    *
    * @param obj The new value for the element
    */
  /* CompleteClass */
  override def writeValue(obj: js.Any): Unit = js.native
}

