package typingsJapgolly.reactDashNavigation.reactDashNavigationMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.reactMod.ComponentClass
import typingsJapgolly.react.reactMod.ComponentState
import typingsJapgolly.react.reactMod.ComponentType
import typingsJapgolly.reactDashNavigation.Anon_OnRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "withNavigation")
@js.native
object withNavigation extends js.Object {
  def apply[P /* <: NavigationInjectedProps[NavigationParams] */](Component: ComponentType[P]): ComponentType[Omit[P, String]] = js.native
  def apply[P /* <: NavigationInjectedProps[NavigationParams] */, T /* <: ComponentClassP[P with js.Object] */](Component: T with (ComponentClass[P, ComponentState])): ComponentType[(Omit[P, String]) with Anon_OnRef[T]] = js.native
}

