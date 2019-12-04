package typingsJapgolly.reactDashNavigationDashStack

import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.Value
import typingsJapgolly.reactDashNative.reactDashNativeMod.View
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsStackViewCreatePointerEventsContainerMod.PointerEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer.InjectedProps & react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer.InputProps */
@js.native
trait InjectedPropsInputProps extends js.Object {
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams] = js.native
  var pointerEvents: PointerEvents = js.native
  var realPosition: Value = js.native
  var scene: Scene = js.native
  def onComponentRef(): Unit = js.native
  def onComponentRef(ref: View): Unit = js.native
}

