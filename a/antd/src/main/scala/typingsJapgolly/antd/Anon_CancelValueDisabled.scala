package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.libCheckboxGroupMod.CheckboxOptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelValueDisabled extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var value: js.Array[String | Double | Boolean]
  def cancelValue(value: String): Unit
  def registerValue(value: String): Unit
  def toggleOption(option: CheckboxOptionType): Unit
}

object Anon_CancelValueDisabled {
  @scala.inline
  def apply(
    cancelValue: String => Callback,
    registerValue: String => Callback,
    toggleOption: CheckboxOptionType => Callback,
    value: js.Array[String | Double | Boolean],
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): Anon_CancelValueDisabled = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("cancelValue")(js.Any.fromFunction1((t0: java.lang.String) => cancelValue(t0).runNow()))
    __obj.updateDynamic("registerValue")(js.Any.fromFunction1((t0: java.lang.String) => registerValue(t0).runNow()))
    __obj.updateDynamic("toggleOption")(js.Any.fromFunction1((t0: typingsJapgolly.antd.libCheckboxGroupMod.CheckboxOptionType) => toggleOption(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CancelValueDisabled]
  }
}

