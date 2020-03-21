package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: String
  var theme: js.UndefOr[String] = js.undefined
  var value: String | Double
  def onSelect(value: String): Unit
}

object RadioButtonProps {
  @scala.inline
  def apply(
    label: String,
    onSelect: String => Callback,
    value: String | Double,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
  ): RadioButtonProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: java.lang.String) => onSelect(t0).runNow()))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonProps]
  }
}

