package typingsJapgolly.reactNavigation.mod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNavigation.reactNavigationStrings.isLandscape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "withOrientation")
@js.native
object withOrientation extends js.Object {
  def apply[P /* <: NavigationOrientationInjectedProps */](Component: ComponentType[P]): ComponentType[Omit[P, isLandscape]] = js.native
}

