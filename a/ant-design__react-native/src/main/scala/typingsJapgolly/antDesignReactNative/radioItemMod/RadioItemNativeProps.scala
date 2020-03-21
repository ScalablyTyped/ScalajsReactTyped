package typingsJapgolly.antDesignReactNative.radioItemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antDesignReactNative.AnonTarget
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.antDesignReactNative.radioPropsTypeMod.RadioItemPropsType
import typingsJapgolly.antDesignReactNative.radioStyleMod.RadioStyle
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioItemNativeProps
  extends RadioItemPropsType
     with WithThemeStyles[RadioStyle] {
  var radioStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object RadioItemNativeProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* e */ AnonTarget => Callback = null,
    onPress: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    radioProps: js.Object = null,
    radioStyle: StyleProp[ImageStyle] = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[RadioStyle] = null,
    wrapLabel: js.UndefOr[Boolean] = js.undefined
  ): RadioItemNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.antDesignReactNative.AnonTarget) => onChange(t0).runNow()))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (radioProps != null) __obj.updateDynamic("radioProps")(radioProps.asInstanceOf[js.Any])
    if (radioStyle != null) __obj.updateDynamic("radioStyle")(radioStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapLabel)) __obj.updateDynamic("wrapLabel")(wrapLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioItemNativeProps]
  }
}

