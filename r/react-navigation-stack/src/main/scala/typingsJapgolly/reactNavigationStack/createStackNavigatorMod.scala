package typingsJapgolly.reactNavigationStack

import typingsJapgolly.reactNavigation.mod.CreateNavigatorConfig
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigation.mod.NavigationRouteConfigMap
import typingsJapgolly.reactNavigation.mod.NavigationStackRouterConfig
import typingsJapgolly.reactNavigationStack.typesMod.NavigationStackConfig
import typingsJapgolly.reactNavigationStack.typesMod.NavigationStackOptions
import typingsJapgolly.reactNavigationStack.typesMod.NavigationStackProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/navigators/createStackNavigator", JSImport.Namespace)
@js.native
object createStackNavigatorMod extends js.Object {
  def default(
    routeConfigMap: NavigationRouteConfigMap[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _], _]
  ): js.Any = js.native
  def default(
    routeConfigMap: NavigationRouteConfigMap[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _], _],
    stackConfig: CreateNavigatorConfig[
      NavigationStackConfig, 
      NavigationStackRouterConfig, 
      NavigationStackOptions, 
      NavigationStackProp[NavigationRoute[NavigationParams], _]
    ]
  ): js.Any = js.native
}

