package typingsJapgolly.antDesignReactNative.agreeItemMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antDesignReactNative.checkboxPropsTypeMod.CheckboxPropsType
import typingsJapgolly.antDesignReactNative.checkboxPropsTypeMod.OnChangeParams
import typingsJapgolly.antDesignReactNative.checkboxStyleMod.CheckboxStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgreeItemProps
  extends CheckboxPropsType
     with WithThemeStyles[CheckboxStyle] {
  var checkboxStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object AgreeItemProps {
  @scala.inline
  def apply(
    checkboxStyle: StyleProp[ImageStyle] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* params */ OnChangeParams => Callback = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[CheckboxStyle] = null
  ): AgreeItemProps = {
    val __obj = js.Dynamic.literal()
    if (checkboxStyle != null) __obj.updateDynamic("checkboxStyle")(checkboxStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.antDesignReactNative.checkboxPropsTypeMod.OnChangeParams) => onChange(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgreeItemProps]
  }
}

