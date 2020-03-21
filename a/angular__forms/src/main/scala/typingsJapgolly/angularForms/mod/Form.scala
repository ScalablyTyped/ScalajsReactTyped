package typingsJapgolly.angularForms.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Form extends js.Object {
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
  def getControl(dir: NgControl): FormControl
  /**
    * @description
    * The `FormGroup` associated with a particular `AbstractFormGroupDirective`.
    *
    * @param dir: The form group directive from which to get the `FormGroup`.
    */
  def getFormGroup(dir: AbstractFormGroupDirective): FormGroup
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
  def updateModel(dir: NgControl, value: js.Any): Unit
}

object Form {
  @scala.inline
  def apply(
    addControl: NgControl => Callback,
    addFormGroup: AbstractFormGroupDirective => Callback,
    getControl: NgControl => CallbackTo[FormControl],
    getFormGroup: AbstractFormGroupDirective => CallbackTo[FormGroup],
    removeControl: NgControl => Callback,
    removeFormGroup: AbstractFormGroupDirective => Callback,
    updateModel: (NgControl, js.Any) => Callback
  ): Form = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addControl")(js.Any.fromFunction1((t0: typingsJapgolly.angularForms.mod.NgControl) => addControl(t0).runNow()))
    __obj.updateDynamic("addFormGroup")(js.Any.fromFunction1((t0: typingsJapgolly.angularForms.mod.AbstractFormGroupDirective) => addFormGroup(t0).runNow()))
    __obj.updateDynamic("getControl")(js.Any.fromFunction1((t0: typingsJapgolly.angularForms.mod.NgControl) => getControl(t0).runNow()))
    __obj.updateDynamic("getFormGroup")(js.Any.fromFunction1((t0: typingsJapgolly.angularForms.mod.AbstractFormGroupDirective) => getFormGroup(t0).runNow()))
    __obj.updateDynamic("removeControl")(js.Any.fromFunction1((t0: typingsJapgolly.angularForms.mod.NgControl) => removeControl(t0).runNow()))
    __obj.updateDynamic("removeFormGroup")(js.Any.fromFunction1((t0: typingsJapgolly.angularForms.mod.AbstractFormGroupDirective) => removeFormGroup(t0).runNow()))
    __obj.updateDynamic("updateModel")(js.Any.fromFunction2((t0: typingsJapgolly.angularForms.mod.NgControl, t1: js.Any) => updateModel(t0, t1).runNow()))
    __obj.asInstanceOf[Form]
  }
}

