package typingsJapgolly.antDesignReactNative.tagMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.antDesignReactNative.tagPropsTypeMod.TagPropsType
import typingsJapgolly.antDesignReactNative.tagStyleMod.TagStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagNativeProps
  extends TagPropsType
     with WithThemeStyles[TagStyle] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object TagNativeProps {
  @scala.inline
  def apply(
    afterClose: js.UndefOr[Callback] = js.undefined,
    closable: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* selected */ Boolean => Callback = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onLongPress: js.UndefOr[Callback] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[TagStyle] = null
  ): TagNativeProps = {
    val __obj = js.Dynamic.literal()
    afterClose.foreach(p => __obj.updateDynamic("afterClose")(p.toJsFn))
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* selected */ scala.Boolean) => onChange(t0).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onLongPress.foreach(p => __obj.updateDynamic("onLongPress")(p.toJsFn))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagNativeProps]
  }
}

