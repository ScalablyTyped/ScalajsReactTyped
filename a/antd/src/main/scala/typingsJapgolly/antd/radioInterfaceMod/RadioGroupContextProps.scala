package typingsJapgolly.antd.radioInterfaceMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupContextProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var value: js.Any
  def onChange(e: RadioChangeEvent): Unit
}

object RadioGroupContextProps {
  @scala.inline
  def apply(
    onChange: RadioChangeEvent => Callback,
    value: js.Any,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): RadioGroupContextProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.antd.radioInterfaceMod.RadioChangeEvent) => onChange(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupContextProps]
  }
}

