package typingsJapgolly.reactNavigationMaterialBottomTabs

import typingsJapgolly.reactNavigation.mod.CreateNavigatorConfig
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigation.mod.NavigationRouteConfigMap
import typingsJapgolly.reactNavigation.mod.NavigationTabRouterConfig
import typingsJapgolly.reactNavigationMaterialBottomTabs.typesMod.NavigationMaterialBottomTabConfig
import typingsJapgolly.reactNavigationMaterialBottomTabs.typesMod.NavigationMaterialBottomTabOptions
import typingsJapgolly.reactNavigationMaterialBottomTabs.typesMod.NavigationTabProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-material-bottom-tabs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createMaterialBottomTabNavigator(
    routes: NavigationRouteConfigMap[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _], 
      _
    ]
  ): js.Any = js.native
  def createMaterialBottomTabNavigator(
    routes: NavigationRouteConfigMap[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _], 
      _
    ],
    config: CreateNavigatorConfig[
      NavigationMaterialBottomTabConfig, 
      NavigationTabRouterConfig, 
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _]
    ]
  ): js.Any = js.native
}

