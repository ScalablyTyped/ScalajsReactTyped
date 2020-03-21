package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.switchMod.SwitchProps
import typingsJapgolly.antdMobile.switchMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Switch {
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
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SwitchProps, default, Unit, SwitchProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.switchMod.SwitchProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.switchMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.switchMod.SwitchProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/switch", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

