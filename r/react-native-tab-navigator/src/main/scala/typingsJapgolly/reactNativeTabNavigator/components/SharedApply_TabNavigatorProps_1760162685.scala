package typingsJapgolly.reactNativeTabNavigator.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTabNavigator.mod.TabNavigatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TabNavigatorProps_1760162685[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    hidesTabTouch: js.UndefOr[Boolean] = js.undefined,
    sceneStyle: ViewStyle = null,
    tabBarShadowStyle: ViewStyle = null,
    tabBarStyle: ViewStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TabNavigatorProps, ComponentRef, Unit, TabNavigatorProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(hidesTabTouch)) __obj.updateDynamic("hidesTabTouch")(hidesTabTouch.asInstanceOf[js.Any])
    if (sceneStyle != null) __obj.updateDynamic("sceneStyle")(sceneStyle.asInstanceOf[js.Any])
    if (tabBarShadowStyle != null) __obj.updateDynamic("tabBarShadowStyle")(tabBarShadowStyle.asInstanceOf[js.Any])
    if (tabBarStyle != null) __obj.updateDynamic("tabBarStyle")(tabBarStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeTabNavigator.mod.TabNavigatorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeTabNavigator.mod.TabNavigatorProps])(children: _*)
  }
}

