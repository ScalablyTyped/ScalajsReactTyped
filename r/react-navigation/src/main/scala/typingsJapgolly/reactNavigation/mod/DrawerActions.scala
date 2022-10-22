package typingsJapgolly.reactNavigation.mod

import typingsJapgolly.reactNavigation.reactNavigationStrings.NavigationSlashCLOSE_DRAWER
import typingsJapgolly.reactNavigation.reactNavigationStrings.NavigationSlashOPEN_DRAWER
import typingsJapgolly.reactNavigation.reactNavigationStrings.NavigationSlashTOGGLE_DRAWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawerActions {
  
  @JSImport("react-navigation", "DrawerActions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-navigation", "DrawerActions.CLOSE_DRAWER")
  @js.native
  val CLOSE_DRAWER: NavigationSlashCLOSE_DRAWER = js.native
  
  @JSImport("react-navigation", "DrawerActions.OPEN_DRAWER")
  @js.native
  val OPEN_DRAWER: NavigationSlashOPEN_DRAWER = js.native
  
  @JSImport("react-navigation", "DrawerActions.TOGGLE_DRAWER")
  @js.native
  val TOGGLE_DRAWER: NavigationSlashTOGGLE_DRAWER = js.native
  
  inline def closeDrawer(): NavigationCloseDrawerAction = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDrawer")().asInstanceOf[NavigationCloseDrawerAction]
  
  inline def openDrawer(): NavigationOpenDrawerAction = ^.asInstanceOf[js.Dynamic].applyDynamic("openDrawer")().asInstanceOf[NavigationOpenDrawerAction]
  
  inline def toggleDrawer(): NavigationToggleDrawerAction = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDrawer")().asInstanceOf[NavigationToggleDrawerAction]
}
