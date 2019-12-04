package typingsJapgolly.reactDashNavigationDashStack.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation
import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.Value
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigationDashStack.PickPropsstylechildrenscenenavigationrealPositiona
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsStackViewStackViewCardMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StackViewCard {
  def apply(
    animatedStyle: js.Any,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: AnimatedInterpolation,
    realPosition: Value,
    scene: Scene,
    style: StyleProp[ViewStyle] = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PickPropsstylechildrenscenenavigationrealPositiona, 
    default, 
    Unit, 
    PickPropsstylechildrenscenenavigationrealPositiona
  ] = {
    val __obj = js.Dynamic.literal(animatedStyle = animatedStyle.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], realPosition = realPosition.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNavigationDashStack.PickPropsstylechildrenscenenavigationrealPositiona, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsStackViewStackViewCardMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigationDashStack.PickPropsstylechildrenscenenavigationrealPositiona])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewCard", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

