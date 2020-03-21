package typingsJapgolly.reactNavigationMaterialBottomTabs.createMaterialBottomTabNavigatorMod

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

@JSImport("react-navigation-material-bottom-tabs/lib/typescript/src/navigators/createMaterialBottomTabNavigator", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(
    routes: NavigationRouteConfigMap[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _], 
      _
    ]
  ): js.Any = js.native
  def apply(
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

