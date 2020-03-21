package typingsJapgolly.reactSelect.stateManagerMod

import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import typingsJapgolly.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  var defaultInputValue: String
  var defaultMenuIsOpen: Boolean
  var defaultValue: ValueType[OptionType]
}

object DefaultProps {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](defaultInputValue: String, defaultMenuIsOpen: Boolean, defaultValue: ValueType[OptionType] = null): DefaultProps[OptionType] = {
    val __obj = js.Dynamic.literal(defaultInputValue = defaultInputValue.asInstanceOf[js.Any], defaultMenuIsOpen = defaultMenuIsOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps[OptionType]]
  }
}

