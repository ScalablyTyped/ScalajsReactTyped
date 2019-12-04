package typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsStackViewCreatePointerEventsContainerMod

import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.Value
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps extends js.Object {
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var realPosition: Value
  var scene: Scene
}

object InputProps {
  @scala.inline
  def apply(
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    realPosition: Value,
    scene: Scene
  ): InputProps = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], realPosition = realPosition.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputProps]
  }
}

