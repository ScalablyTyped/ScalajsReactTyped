package typingsJapgolly.reactNavigation.mod

import typingsJapgolly.reactNavigation.CreateNavigatorConfigNavi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "createSwitchNavigator")
@js.native
object createSwitchNavigator extends js.Object {
  def apply(
    routeConfigMap: NavigationRouteConfigMap[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ): NavigationNavigator[js.Object, NavigationProp[NavigationState]] = js.native
  def apply(
    routeConfigMap: NavigationRouteConfigMap[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ],
    switchConfig: CreateNavigatorConfigNavi
  ): NavigationNavigator[js.Object, NavigationProp[NavigationState]] = js.native
}

