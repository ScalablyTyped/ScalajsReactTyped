package typingsJapgolly.angularForms.mod

import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularForms.angularFormsBooleans.`false`
import typingsJapgolly.angularForms.anon.CompareWith
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.angularForms.mod.ControlValueAccessor because var conflicts: setDisabledState. Inlined writeValue */ @JSImport("@angular/forms", "SelectControlValueAccessor")
@js.native
open class SelectControlValueAccessor ()
  extends StObject
     with BaseControlValueAccessor {
  
  /* private */ var _compareWith: Any = js.native
  
  /* private */ /* CompleteClass */
  var _elementRef: Any = js.native
  
  /* private */ /* CompleteClass */
  var _renderer: Any = js.native
  
  /**
    * @description
    * Tracks the option comparison algorithm for tracking identities when
    * checking for changes.
    */
  def compareWith_=(fn: js.Function2[/* o1 */ Any, /* o2 */ Any, Boolean]): Unit = js.native
  
  /**
    * The registered callback function called when a change or input event occurs on the input
    * element.
    * @nodoc
    */
  /* CompleteClass */
  override def onChange(_underscore: Any): Unit = js.native
  
  /**
    * The registered callback function called when a blur event occurs on the input element.
    * @nodoc
    */
  /* CompleteClass */
  override def onTouched(): Unit = js.native
  
  /**
    * Registers a function called when the control value changes.
    * @nodoc
    */
  /* CompleteClass */
  override def registerOnChange(fn: js.Function1[/* _ */ Any, js.Object]): Unit = js.native
  
  /**
    * Registers a function called when the control is touched.
    * @nodoc
    */
  /* CompleteClass */
  override def registerOnTouched(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Sets the "disabled" property on the range input element.
    * @nodoc
    */
  /* CompleteClass */
  override def setDisabledState(isDisabled: Boolean): Unit = js.native
  
  /**
    * Helper method that sets a property on a target element using the current Renderer
    * implementation.
    * @nodoc
    */
  /* protected */ /* CompleteClass */
  override def setProperty(key: String, value: Any): Unit = js.native
  
  /** @nodoc */
  var value: Any = js.native
  
  /**
    * Sets the "value" property on the select element.
    * @nodoc
    */
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
  def writeValue(value: Any): Unit = js.native
}
/* static members */
object SelectControlValueAccessor {
  
  @JSImport("@angular/forms", "SelectControlValueAccessor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "SelectControlValueAccessor.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    SelectControlValueAccessor, 
    /* select:not([multiple])[formControlName],select:not([multiple])[formControl],select:not([multiple])[ngModel] */ String, 
    scala.Nothing, 
    CompareWith, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      SelectControlValueAccessor, 
      /* select:not([multiple])[formControlName],select:not([multiple])[formControl],select:not([multiple])[ngModel] */ String, 
      scala.Nothing, 
      CompareWith, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "SelectControlValueAccessor.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[SelectControlValueAccessor, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[SelectControlValueAccessor, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
