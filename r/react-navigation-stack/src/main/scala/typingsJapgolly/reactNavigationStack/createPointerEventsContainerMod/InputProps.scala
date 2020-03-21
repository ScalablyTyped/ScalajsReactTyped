package typingsJapgolly.reactNavigationStack.createPointerEventsContainerMod

import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigationStack.typesMod.NavigationStackProp
import typingsJapgolly.reactNavigationStack.typesMod.Scene
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

