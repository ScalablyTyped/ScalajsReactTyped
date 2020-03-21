package typingsJapgolly.antdMobileRn.checkboxItemNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobileRn.checkboxPropsTypeMod.CheckboxItemPropsType
import typingsJapgolly.antdMobileRn.checkboxPropsTypeMod.OnChangeParams
import typingsJapgolly.antdMobileRn.checkboxStyleIndexNativeMod.ICheckboxStyle
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckboxItemNativeProps extends CheckboxItemPropsType {
  var checkboxStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[ICheckboxStyle] = js.undefined
}

object ICheckboxItemNativeProps {
  @scala.inline
  def apply(
    checkboxStyle: StyleProp[ImageStyle] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    extra: VdomNode = null,
    onChange: /* params */ OnChangeParams => Callback = null,
    onClick: /* e */ js.UndefOr[js.Any] => Callback = null,
    prefixCls: String = null,
    style: StyleProp[ViewStyle] = null,
    styles: ICheckboxStyle = null
  ): ICheckboxItemNativeProps = {
    val __obj = js.Dynamic.literal()
    if (checkboxStyle != null) __obj.updateDynamic("checkboxStyle")(checkboxStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.antdMobileRn.checkboxPropsTypeMod.OnChangeParams) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[js.Any]) => onClick(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxItemNativeProps]
  }
}

