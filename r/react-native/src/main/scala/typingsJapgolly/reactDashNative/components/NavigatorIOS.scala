package typingsJapgolly.reactDashNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNative.reactDashNativeMod.NavigatorIOSProps
import typingsJapgolly.reactDashNative.reactDashNativeMod.Route
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigatorIOS {
  def apply(
    initialRoute: Route,
    barTintColor: String = null,
    interactivePopGestureEnabled: js.UndefOr[Boolean] = js.undefined,
    itemWrapperStyle: StyleProp[ViewStyle] = null,
    navigationBarHidden: js.UndefOr[Boolean] = js.undefined,
    shadowHidden: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    tintColor: String = null,
    titleTextColor: String = null,
    translucent: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    NavigatorIOSProps, 
    typingsJapgolly.reactDashNative.reactDashNativeMod.NavigatorIOS, 
    Unit, 
    NavigatorIOSProps
  ] = {
    val __obj = js.Dynamic.literal(initialRoute = initialRoute.asInstanceOf[js.Any])
  
      if (barTintColor != null) __obj.updateDynamic("barTintColor")(barTintColor.asInstanceOf[js.Any])
    if (!js.isUndefined(interactivePopGestureEnabled)) __obj.updateDynamic("interactivePopGestureEnabled")(interactivePopGestureEnabled.asInstanceOf[js.Any])
    if (itemWrapperStyle != null) __obj.updateDynamic("itemWrapperStyle")(itemWrapperStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationBarHidden)) __obj.updateDynamic("navigationBarHidden")(navigationBarHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowHidden)) __obj.updateDynamic("shadowHidden")(shadowHidden.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (titleTextColor != null) __obj.updateDynamic("titleTextColor")(titleTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNative.reactDashNativeMod.NavigatorIOSProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNative.reactDashNativeMod.NavigatorIOS](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNative.reactDashNativeMod.NavigatorIOSProps])(children: _*)
  }
  @JSImport("react-native", "NavigatorIOS")
  @js.native
  object componentImport extends js.Object
  
}

