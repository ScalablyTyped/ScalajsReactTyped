package typingsJapgolly.antd.esCheckboxGroupMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.esCheckboxCheckboxMod.CheckboxChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxOptionType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: Node
  var onChange: js.UndefOr[js.Function1[/* e */ CheckboxChangeEvent, Unit]] = js.undefined
  var value: CheckboxValueType
}

object CheckboxOptionType {
  @scala.inline
  def apply(
    label: VdomNode,
    value: CheckboxValueType,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* e */ CheckboxChangeEvent => Callback = null
  ): CheckboxOptionType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.antd.esCheckboxCheckboxMod.CheckboxChangeEvent) => onChange(t0).runNow()))
    __obj.asInstanceOf[CheckboxOptionType]
  }
}

