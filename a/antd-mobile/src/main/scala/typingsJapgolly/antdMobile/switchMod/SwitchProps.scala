package typingsJapgolly.antdMobile.switchMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobile.switchPropsTypeMod.SwitchPropsType
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends SwitchPropsType {
  var className: js.UndefOr[String] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* checked */ Boolean => Callback = null,
    onClick: /* checked */ js.UndefOr[Boolean] => Callback = null,
    platform: String = null,
    prefixCls: String = null,
    style: CSSProperties = null
  ): SwitchProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* checked */ scala.Boolean) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* checked */ js.UndefOr[scala.Boolean]) => onClick(t0).runNow()))
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchProps]
  }
}

