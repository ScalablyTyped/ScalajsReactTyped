package typingsJapgolly.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNavigation.mod.NavigationDrawerOpenedAction
  - typingsJapgolly.reactNavigation.mod.NavigationDrawerClosedAction
  - typingsJapgolly.reactNavigation.mod.NavigationOpenDrawerAction
  - typingsJapgolly.reactNavigation.mod.NavigationCloseDrawerAction
  - typingsJapgolly.reactNavigation.mod.NavigationToggleDrawerAction
*/
trait NavigationDrawerAction
  extends StObject
     with _NavigationAction
object NavigationDrawerAction {
  
  inline def NavigationCloseDrawerAction(): typingsJapgolly.reactNavigation.mod.NavigationCloseDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/CLOSE_DRAWER")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationCloseDrawerAction]
  }
  
  inline def NavigationDrawerClosedAction(): typingsJapgolly.reactNavigation.mod.NavigationDrawerClosedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/DRAWER_CLOSED")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationDrawerClosedAction]
  }
  
  inline def NavigationDrawerOpenedAction(): typingsJapgolly.reactNavigation.mod.NavigationDrawerOpenedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/DRAWER_OPENED")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationDrawerOpenedAction]
  }
  
  inline def NavigationOpenDrawerAction(): typingsJapgolly.reactNavigation.mod.NavigationOpenDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/OPEN_DRAWER")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationOpenDrawerAction]
  }
  
  inline def NavigationToggleDrawerAction(): typingsJapgolly.reactNavigation.mod.NavigationToggleDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/TOGGLE_DRAWER")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationToggleDrawerAction]
  }
}
