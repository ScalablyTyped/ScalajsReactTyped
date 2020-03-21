package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.gestalt.AnonChecked
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: String
  var name: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[sm | md] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def onChange(args: AnonChecked): Unit
}

object RadioButtonProps {
  @scala.inline
  def apply(
    id: String,
    onChange: AnonChecked => Callback,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    size: sm | md = null,
    value: String = null
  ): RadioButtonProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.gestalt.AnonChecked) => onChange(t0).runNow()))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonProps]
  }
}

