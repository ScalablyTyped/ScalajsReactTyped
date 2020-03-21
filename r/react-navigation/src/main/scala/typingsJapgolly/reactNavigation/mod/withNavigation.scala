package typingsJapgolly.reactNavigation.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNavigation.AnonOnRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "withNavigation")
@js.native
object withNavigation extends js.Object {
  def apply[P /* <: NavigationInjectedProps[NavigationParams] */](Component: ComponentType[P]): ComponentType[Omit[P, String]] = js.native
  def apply[P /* <: NavigationInjectedProps[NavigationParams] */, T /* <: ComponentClassP[P with js.Object] */](Component: T with (ComponentClass[P, ComponentState])): ComponentType[(Omit[P, String]) with AnonOnRef[T]] = js.native
}

