package typingsJapgolly.reactDashNativeDashGestureDashHandler.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNative.reactDashNativeMod.DrawerLayoutAndroidProperties
import typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.NativeViewGestureHandlerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object DrawerLayoutAndroid {
  def apply(
    props: NativeViewGestureHandlerProperties with DrawerLayoutAndroidProperties with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    NativeViewGestureHandlerProperties with DrawerLayoutAndroidProperties with js.Object, 
    typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.DrawerLayoutAndroid, 
    Unit, 
    NativeViewGestureHandlerProperties with DrawerLayoutAndroidProperties with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.NativeViewGestureHandlerProperties with typingsJapgolly.reactDashNative.reactDashNativeMod.DrawerLayoutAndroidProperties with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.DrawerLayoutAndroid](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.NativeViewGestureHandlerProperties with typingsJapgolly.reactDashNative.reactDashNativeMod.DrawerLayoutAndroidProperties with js.Object])(children: _*)
  }
  @JSImport("react-native-gesture-handler", "DrawerLayoutAndroid")
  @js.native
  object componentImport extends js.Object
  
}

