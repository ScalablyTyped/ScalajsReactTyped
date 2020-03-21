package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.foundationSites.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/abide.html#javascript-reference
trait Abide extends js.Object {
  def addErrorClasses(element: JQuery): Unit
  def destroy(): Unit
  def findFormError(element: JQuery): JQuery
  def findLabel(element: JQuery): Boolean
  def matchValidation(element: JQuery, validators: String, required: Boolean): Boolean
  def removeErrorClasses(element: JQuery): Unit
  def removeRadioErrorClasses(groupName: String): Unit
  def requiredChecked(element: JQuery): Boolean
  def resetForm(): Unit
  def validateForm(): Boolean
  def validateInput(element: JQuery): Boolean
  def validateRadio(groupName: String): Boolean
  def validateText(element: JQuery, pattern: String): Boolean
}

object Abide {
  @scala.inline
  def apply(
    addErrorClasses: JQuery => Callback,
    destroy: Callback,
    findFormError: JQuery => CallbackTo[JQuery],
    findLabel: JQuery => CallbackTo[Boolean],
    matchValidation: (JQuery, String, Boolean) => CallbackTo[Boolean],
    removeErrorClasses: JQuery => Callback,
    removeRadioErrorClasses: String => Callback,
    requiredChecked: JQuery => CallbackTo[Boolean],
    resetForm: Callback,
    validateForm: CallbackTo[Boolean],
    validateInput: JQuery => CallbackTo[Boolean],
    validateRadio: String => CallbackTo[Boolean],
    validateText: (JQuery, String) => CallbackTo[Boolean]
  ): Abide = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addErrorClasses")(js.Any.fromFunction1((t0: typingsJapgolly.foundationSites.JQuery) => addErrorClasses(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("findFormError")(js.Any.fromFunction1((t0: typingsJapgolly.foundationSites.JQuery) => findFormError(t0).runNow()))
    __obj.updateDynamic("findLabel")(js.Any.fromFunction1((t0: typingsJapgolly.foundationSites.JQuery) => findLabel(t0).runNow()))
    __obj.updateDynamic("matchValidation")(js.Any.fromFunction3((t0: typingsJapgolly.foundationSites.JQuery, t1: java.lang.String, t2: scala.Boolean) => matchValidation(t0, t1, t2).runNow()))
    __obj.updateDynamic("removeErrorClasses")(js.Any.fromFunction1((t0: typingsJapgolly.foundationSites.JQuery) => removeErrorClasses(t0).runNow()))
    __obj.updateDynamic("removeRadioErrorClasses")(js.Any.fromFunction1((t0: java.lang.String) => removeRadioErrorClasses(t0).runNow()))
    __obj.updateDynamic("requiredChecked")(js.Any.fromFunction1((t0: typingsJapgolly.foundationSites.JQuery) => requiredChecked(t0).runNow()))
    __obj.updateDynamic("resetForm")(resetForm.toJsFn)
    __obj.updateDynamic("validateForm")(validateForm.toJsFn)
    __obj.updateDynamic("validateInput")(js.Any.fromFunction1((t0: typingsJapgolly.foundationSites.JQuery) => validateInput(t0).runNow()))
    __obj.updateDynamic("validateRadio")(js.Any.fromFunction1((t0: java.lang.String) => validateRadio(t0).runNow()))
    __obj.updateDynamic("validateText")(js.Any.fromFunction2((t0: typingsJapgolly.foundationSites.JQuery, t1: java.lang.String) => validateText(t0, t1).runNow()))
    __obj.asInstanceOf[Abide]
  }
}

