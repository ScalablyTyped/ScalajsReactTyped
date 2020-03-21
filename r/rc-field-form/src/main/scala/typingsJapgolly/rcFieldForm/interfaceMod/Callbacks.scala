package typingsJapgolly.rcFieldForm.interfaceMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callbacks extends js.Object {
  var onFieldsChange: js.UndefOr[
    js.Function2[/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData], Unit]
  ] = js.undefined
  var onFinish: js.UndefOr[js.Function1[/* values */ Store, Unit]] = js.undefined
  var onFinishFailed: js.UndefOr[js.Function1[/* errorInfo */ ValidateErrorEntity, Unit]] = js.undefined
  var onValuesChange: js.UndefOr[js.Function2[/* changedValues */ Store, /* values */ Store, Unit]] = js.undefined
}

object Callbacks {
  @scala.inline
  def apply(
    onFieldsChange: (/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData]) => Callback = null,
    onFinish: /* values */ Store => Callback = null,
    onFinishFailed: /* errorInfo */ ValidateErrorEntity => Callback = null,
    onValuesChange: (/* changedValues */ Store, /* values */ Store) => Callback = null
  ): Callbacks = {
    val __obj = js.Dynamic.literal()
    if (onFieldsChange != null) __obj.updateDynamic("onFieldsChange")(js.Any.fromFunction2((t0: /* changedFields */ js.Array[typingsJapgolly.rcFieldForm.interfaceMod.FieldData], t1: /* allFields */ js.Array[typingsJapgolly.rcFieldForm.interfaceMod.FieldData]) => onFieldsChange(t0, t1).runNow()))
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction1((t0: /* values */ typingsJapgolly.rcFieldForm.interfaceMod.Store) => onFinish(t0).runNow()))
    if (onFinishFailed != null) __obj.updateDynamic("onFinishFailed")(js.Any.fromFunction1((t0: /* errorInfo */ typingsJapgolly.rcFieldForm.interfaceMod.ValidateErrorEntity) => onFinishFailed(t0).runNow()))
    if (onValuesChange != null) __obj.updateDynamic("onValuesChange")(js.Any.fromFunction2((t0: /* changedValues */ typingsJapgolly.rcFieldForm.interfaceMod.Store, t1: /* values */ typingsJapgolly.rcFieldForm.interfaceMod.Store) => onValuesChange(t0, t1).runNow()))
    __obj.asInstanceOf[Callbacks]
  }
}

