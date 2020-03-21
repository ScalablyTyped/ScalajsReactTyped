package typingsJapgolly.reactNavigationStack.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigationStack.PickPropsstylechildrensce
import typingsJapgolly.reactNavigationStack.stackViewCardMod.default
import typingsJapgolly.reactNavigationStack.typesMod.NavigationStackProp
import typingsJapgolly.reactNavigationStack.typesMod.Scene
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
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PickPropsstylechildrensce, default, Unit, PickPropsstylechildrensce] = {
    val __obj = js.Dynamic.literal(animatedStyle = animatedStyle.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], realPosition = realPosition.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigationStack.PickPropsstylechildrensce, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigationStack.stackViewCardMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigationStack.PickPropsstylechildrensce])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewCard", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

