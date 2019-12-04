package typingsJapgolly.reactDashNavigationDashStack

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation
import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.Value
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/StackViewCard.Props, 'style' | 'children' | 'scene' | 'navigation' | 'realPosition' | 'animatedStyle' | 'position' | 'transparent'> */
trait PickPropsstylechildrenscenenavigationrealPositiona extends js.Object {
  var animatedStyle: js.Any
  var children: Node
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var position: AnimatedInterpolation
  var realPosition: Value
  var scene: Scene
  var style: StyleProp[ViewStyle]
  var transparent: js.UndefOr[Boolean] = js.undefined
}

object PickPropsstylechildrenscenenavigationrealPositiona {
  @scala.inline
  def apply(
    animatedStyle: js.Any,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: AnimatedInterpolation,
    realPosition: Value,
    scene: Scene,
    children: VdomNode = null,
    style: StyleProp[ViewStyle] = null,
    transparent: js.UndefOr[Boolean] = js.undefined
  ): PickPropsstylechildrenscenenavigationrealPositiona = {
    val __obj = js.Dynamic.literal(animatedStyle = animatedStyle.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], realPosition = realPosition.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropsstylechildrenscenenavigationrealPositiona]
  }
}

