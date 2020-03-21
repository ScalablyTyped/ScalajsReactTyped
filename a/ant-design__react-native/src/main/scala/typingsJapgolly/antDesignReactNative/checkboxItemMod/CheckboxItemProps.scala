package typingsJapgolly.antDesignReactNative.checkboxItemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.checkboxPropsTypeMod.CheckboxItemPropsType
import typingsJapgolly.antDesignReactNative.checkboxPropsTypeMod.OnChangeParams
import typingsJapgolly.antDesignReactNative.checkboxStyleMod.CheckboxStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxItemProps
  extends CheckboxItemPropsType
     with WithThemeStyles[CheckboxStyle] {
  var checkboxStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object CheckboxItemProps {
  @scala.inline
  def apply(
    checkboxStyle: StyleProp[TextStyle] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    extra: VdomNode = null,
    onChange: /* params */ OnChangeParams => Callback = null,
    onPress: /* e */ js.UndefOr[js.Any] => Callback = null,
    prefixCls: String = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[CheckboxStyle] = null
  ): CheckboxItemProps = {
    val __obj = js.Dynamic.literal()
    if (checkboxStyle != null) __obj.updateDynamic("checkboxStyle")(checkboxStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.antDesignReactNative.checkboxPropsTypeMod.OnChangeParams) => onChange(t0).runNow()))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[js.Any]) => onPress(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxItemProps]
  }
}

