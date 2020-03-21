package typingsJapgolly.antDesignReactNative.switchPropsTypeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchPropsType extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* checked */ js.UndefOr[Boolean], Unit]] = js.undefined
}

object SwitchPropsType {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* checked */ Boolean => Callback = null,
    onPress: /* checked */ js.UndefOr[Boolean] => Callback = null
  ): SwitchPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* checked */ scala.Boolean) => onChange(t0).runNow()))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: /* checked */ js.UndefOr[scala.Boolean]) => onPress(t0).runNow()))
    __obj.asInstanceOf[SwitchPropsType]
  }
}

