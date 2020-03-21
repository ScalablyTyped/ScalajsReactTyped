package typingsJapgolly.rcFieldForm.formContextMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.rcFieldForm.interfaceMod.FieldData
import typingsJapgolly.rcFieldForm.interfaceMod.FormInstance
import typingsJapgolly.rcFieldForm.interfaceMod.Store
import typingsJapgolly.rcFieldForm.interfaceMod.ValidateMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormContextProps extends FormProviderProps {
  def registerForm(name: String, form: FormInstance): Unit
  def triggerFormChange(name: String, changedFields: js.Array[FieldData]): Unit
  def triggerFormFinish(name: String, values: Store): Unit
  def unregisterForm(name: String): Unit
}

object FormContextProps {
  @scala.inline
  def apply(
    registerForm: (String, FormInstance) => Callback,
    triggerFormChange: (String, js.Array[FieldData]) => Callback,
    triggerFormFinish: (String, Store) => Callback,
    unregisterForm: String => Callback,
    onFormChange: (/* name */ String, /* info */ FormChangeInfo) => Callback = null,
    onFormFinish: (/* name */ String, /* info */ FormFinishInfo) => Callback = null,
    validateMessages: ValidateMessages = null
  ): FormContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerForm")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.rcFieldForm.interfaceMod.FormInstance) => registerForm(t0, t1).runNow()))
    __obj.updateDynamic("triggerFormChange")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[typingsJapgolly.rcFieldForm.interfaceMod.FieldData]) => triggerFormChange(t0, t1).runNow()))
    __obj.updateDynamic("triggerFormFinish")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.rcFieldForm.interfaceMod.Store) => triggerFormFinish(t0, t1).runNow()))
    __obj.updateDynamic("unregisterForm")(js.Any.fromFunction1((t0: java.lang.String) => unregisterForm(t0).runNow()))
    if (onFormChange != null) __obj.updateDynamic("onFormChange")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* info */ typingsJapgolly.rcFieldForm.formContextMod.FormChangeInfo) => onFormChange(t0, t1).runNow()))
    if (onFormFinish != null) __obj.updateDynamic("onFormFinish")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* info */ typingsJapgolly.rcFieldForm.formContextMod.FormFinishInfo) => onFormFinish(t0, t1).runNow()))
    if (validateMessages != null) __obj.updateDynamic("validateMessages")(validateMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormContextProps]
  }
}

