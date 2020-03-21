package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.fixed
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.normal
import typingsJapgolly.antDesignReactNative.progressMod.ProgressProps
import typingsJapgolly.antDesignReactNative.progressMod.default
import typingsJapgolly.antDesignReactNative.progressStyleMod.ProgressStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Progress {
  def apply(
    appearTransition: js.UndefOr[Boolean] = js.undefined,
    barStyle: StyleProp[ViewStyle] = null,
    percent: Int | Double = null,
    position: fixed | normal = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[ProgressStyle] = null,
    unfilled: js.UndefOr[Boolean] = js.undefined,
    wrapWidth: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ProgressProps, default, Unit, ProgressProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(appearTransition)) __obj.updateDynamic("appearTransition")(appearTransition.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(unfilled)) __obj.updateDynamic("unfilled")(unfilled.asInstanceOf[js.Any])
    if (wrapWidth != null) __obj.updateDynamic("wrapWidth")(wrapWidth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.progressMod.ProgressProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.progressMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.progressMod.ProgressProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/progress", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

