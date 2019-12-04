package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.libCheckboxGroupMod.CheckboxOptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: Boolean
  var value: js.Any
  def toggleOption(option: CheckboxOptionType): Unit
}

object Anon_Disabled {
  @scala.inline
  def apply(disabled: Boolean, toggleOption: CheckboxOptionType => Callback, value: js.Any): Anon_Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("toggleOption")(js.Any.fromFunction1((t0: typingsJapgolly.antd.libCheckboxGroupMod.CheckboxOptionType) => toggleOption(t0).runNow()))
    __obj.asInstanceOf[Anon_Disabled]
  }
}

