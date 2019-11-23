package typingsJapgolly.reactDashNativeDashGestureDashHandler.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.NativeViewGestureHandlerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object ScrollView {
  def apply(
    props: NativeViewGestureHandlerProperties with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DrawerLayoutAndroidProperties */ js.Any) with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    NativeViewGestureHandlerProperties with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DrawerLayoutAndroidProperties */ js.Any) with js.Object, 
    typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ScrollView, 
    Unit, 
    NativeViewGestureHandlerProperties with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DrawerLayoutAndroidProperties */ js.Any) with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.NativeViewGestureHandlerProperties with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DrawerLayoutAndroidProperties */ js.Any) with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ScrollView](js.constructorOf[typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ScrollView])
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.NativeViewGestureHandlerProperties with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DrawerLayoutAndroidProperties */ js.Any) with js.Object])(children: _*)
  }
}

