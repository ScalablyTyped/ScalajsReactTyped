package typingsJapgolly.reactNavigationDrawer.drawerActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashOPEN_DRAWER
  - typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashCLOSE_DRAWER
  - typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashTOGGLE_DRAWER
*/
trait DrawerActionType extends js.Object

object DrawerActionType {
  @scala.inline
  def NavigationSlashCLOSE_DRAWER: typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashCLOSE_DRAWER = this.cast("Navigation/CLOSE_DRAWER")
  @scala.inline
  def NavigationSlashOPEN_DRAWER: typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashOPEN_DRAWER = this.cast("Navigation/OPEN_DRAWER")
  @scala.inline
  def NavigationSlashTOGGLE_DRAWER: typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashTOGGLE_DRAWER = this.cast("Navigation/TOGGLE_DRAWER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

