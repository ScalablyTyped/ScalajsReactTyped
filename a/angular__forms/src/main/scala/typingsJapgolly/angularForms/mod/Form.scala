package typingsJapgolly.angularForms.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Form extends StObject {
  
  /**
    * @description
    * Add a control to this form.
    *
    * @param dir The control directive to add to the form.
    */
  def addControl(dir: NgControl): Unit
  
  /**
    * @description
    * Add a group of controls to this form.
    *
    * @param dir: The control group directive to add.
    */
  def addFormGroup(dir: AbstractFormGroupDirective): Unit
  
  /**
    * @description
    * The control directive from which to get the `FormControl`.
    *
    * @param dir: The control directive.
    */
  def getControl(dir: NgControl): FormControl[Any]
  
  /**
    * @description
    * The `FormGroup` associated with a particular `AbstractFormGroupDirective`.
    *
    * @param dir: The form group directive from which to get the `FormGroup`.
    */
  def getFormGroup(dir: AbstractFormGroupDirective): FormGroup[Any]
  
  /**
    * @description
    * Remove a control from this form.
    *
    * @param dir: The control directive to remove from the form.
    */
  def removeControl(dir: NgControl): Unit
  
  /**
    * @description
    * Remove a group of controls to this form.
    *
    * @param dir: The control group directive to remove.
    */
  def removeFormGroup(dir: AbstractFormGroupDirective): Unit
  
  /**
    * @description
    * Update the model for a particular control with a new value.
    *
    * @param dir: The control directive to update.
    * @param value: The new value for the control.
    */
  def updateModel(dir: NgControl, value: Any): Unit
}
object Form {
  
  inline def apply(
    addControl: NgControl => Callback,
    addFormGroup: AbstractFormGroupDirective => Callback,
    getControl: NgControl => FormControl[Any],
    getFormGroup: AbstractFormGroupDirective => FormGroup[Any],
    removeControl: NgControl => Callback,
    removeFormGroup: AbstractFormGroupDirective => Callback,
    updateModel: (NgControl, Any) => Callback
  ): Form = {
    val __obj = js.Dynamic.literal(addControl = js.Any.fromFunction1((t0: NgControl) => addControl(t0).runNow()), addFormGroup = js.Any.fromFunction1((t0: AbstractFormGroupDirective) => addFormGroup(t0).runNow()), getControl = js.Any.fromFunction1(getControl), getFormGroup = js.Any.fromFunction1(getFormGroup), removeControl = js.Any.fromFunction1((t0: NgControl) => removeControl(t0).runNow()), removeFormGroup = js.Any.fromFunction1((t0: AbstractFormGroupDirective) => removeFormGroup(t0).runNow()), updateModel = js.Any.fromFunction2((t0: NgControl, t1: Any) => (updateModel(t0, t1)).runNow()))
    __obj.asInstanceOf[Form]
  }
  
  extension [Self <: Form](x: Self) {
    
    inline def setAddControl(value: NgControl => Callback): Self = StObject.set(x, "addControl", js.Any.fromFunction1((t0: NgControl) => value(t0).runNow()))
    
    inline def setAddFormGroup(value: AbstractFormGroupDirective => Callback): Self = StObject.set(x, "addFormGroup", js.Any.fromFunction1((t0: AbstractFormGroupDirective) => value(t0).runNow()))
    
    inline def setGetControl(value: NgControl => FormControl[Any]): Self = StObject.set(x, "getControl", js.Any.fromFunction1(value))
    
    inline def setGetFormGroup(value: AbstractFormGroupDirective => FormGroup[Any]): Self = StObject.set(x, "getFormGroup", js.Any.fromFunction1(value))
    
    inline def setRemoveControl(value: NgControl => Callback): Self = StObject.set(x, "removeControl", js.Any.fromFunction1((t0: NgControl) => value(t0).runNow()))
    
    inline def setRemoveFormGroup(value: AbstractFormGroupDirective => Callback): Self = StObject.set(x, "removeFormGroup", js.Any.fromFunction1((t0: AbstractFormGroupDirective) => value(t0).runNow()))
    
    inline def setUpdateModel(value: (NgControl, Any) => Callback): Self = StObject.set(x, "updateModel", js.Any.fromFunction2((t0: NgControl, t1: Any) => (value(t0, t1)).runNow()))
  }
}
