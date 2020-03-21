package typingsJapgolly.antDesignReactNative.androidContainerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antDesignReactNative.actionSheetStyleMod.ActionSheetStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.reactNative.mod.ActionSheetIOSOptions
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetNativeProps extends WithThemeStyles[ActionSheetStyle] {
  var callback: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var config: ActionSheetIOSOptions
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ActionSheetNativeProps {
  @scala.inline
  def apply(
    config: ActionSheetIOSOptions,
    callback: /* index */ Double => Callback = null,
    onAnimationEnd: /* visible */ Boolean => Callback = null,
    styles: Partial[ActionSheetStyle] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ActionSheetNativeProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* index */ scala.Double) => callback(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onAnimationEnd(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetNativeProps]
  }
}

