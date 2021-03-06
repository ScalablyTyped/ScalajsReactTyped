package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.actionSheetStyleMod.ActionSheetStyle
import typingsJapgolly.antDesignReactNative.androidContainerMod.ActionSheetNativeProps
import typingsJapgolly.antDesignReactNative.androidContainerMod.default
import typingsJapgolly.reactNative.mod.ActionSheetIOSOptions
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AndroidContainer {
  def apply(
    config: ActionSheetIOSOptions,
    callback: /* index */ Double => Callback = null,
    onAnimationEnd: /* visible */ Boolean => Callback = null,
    styles: Partial[ActionSheetStyle] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ActionSheetNativeProps, default, Unit, ActionSheetNativeProps] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
  
      if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* index */ scala.Double) => callback(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onAnimationEnd(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.androidContainerMod.ActionSheetNativeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.androidContainerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.androidContainerMod.ActionSheetNativeProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/action-sheet/AndroidContainer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

