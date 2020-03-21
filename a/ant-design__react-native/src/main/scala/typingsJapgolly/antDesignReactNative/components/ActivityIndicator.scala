package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.activityIndicatorMod.ActivityIndicatorNativeProps
import typingsJapgolly.antDesignReactNative.activityIndicatorMod.default
import typingsJapgolly.antDesignReactNative.activityIndicatorStyleMod.ActivityIndicatorStyle
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.large
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActivityIndicator {
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    size: large | small = null,
    styles: ActivityIndicatorStyle = null,
    text: String = null,
    toast: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ActivityIndicatorNativeProps, default, Unit, ActivityIndicatorNativeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(toast)) __obj.updateDynamic("toast")(toast.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.activityIndicatorMod.ActivityIndicatorNativeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.activityIndicatorMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.activityIndicatorMod.ActivityIndicatorNativeProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/activity-indicator", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

