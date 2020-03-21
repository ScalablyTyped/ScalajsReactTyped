package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.groupMod.CheckboxOptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  var disabled: Boolean
  var value: js.Any
  def toggleOption(option: CheckboxOptionType): Unit
}

object AnonDisabled {
  @scala.inline
  def apply(disabled: Boolean, toggleOption: CheckboxOptionType => Callback, value: js.Any): AnonDisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("toggleOption")(js.Any.fromFunction1((t0: typingsJapgolly.antd.groupMod.CheckboxOptionType) => toggleOption(t0).runNow()))
    __obj.asInstanceOf[AnonDisabled]
  }
}

