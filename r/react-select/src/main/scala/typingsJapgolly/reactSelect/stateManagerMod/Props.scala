package typingsJapgolly.reactSelect.stateManagerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactSelect.typesMod.ActionMeta
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import typingsJapgolly.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[OptionType /* <: OptionTypeBase */] extends js.Object {
  var defaultInputValue: js.UndefOr[String] = js.undefined
  var defaultMenuIsOpen: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[ValueType[OptionType]] = js.undefined
  var inputValue: js.UndefOr[String] = js.undefined
  var menuIsOpen: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* value */ ValueType[OptionType], /* actionMeta */ ActionMeta, Unit]
  ] = js.undefined
  var value: js.UndefOr[ValueType[OptionType]] = js.undefined
}

object Props {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](
    defaultInputValue: String = null,
    defaultMenuIsOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: ValueType[OptionType] = null,
    inputValue: String = null,
    menuIsOpen: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* value */ ValueType[OptionType], /* actionMeta */ ActionMeta) => Callback = null,
    value: ValueType[OptionType] = null
  ): Props[OptionType] = {
    val __obj = js.Dynamic.literal()
    if (defaultInputValue != null) __obj.updateDynamic("defaultInputValue")(defaultInputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMenuIsOpen)) __obj.updateDynamic("defaultMenuIsOpen")(defaultMenuIsOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIsOpen)) __obj.updateDynamic("menuIsOpen")(menuIsOpen.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* value */ typingsJapgolly.reactSelect.typesMod.ValueType[OptionType], t1: /* actionMeta */ typingsJapgolly.reactSelect.typesMod.ActionMeta) => onChange(t0, t1).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[OptionType]]
  }
}

