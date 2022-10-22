package typingsJapgolly.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _NavigationAction extends StObject
object _NavigationAction {
  
  inline def Key(): typingsJapgolly.reactNavigation.anon.Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CHILD_ACTION")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.anon.Key]
  }
  
  inline def NavigationBackAction(): typingsJapgolly.reactNavigation.mod.NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/BACK")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationBackAction]
  }
  
  inline def NavigationCloseDrawerAction(): typingsJapgolly.reactNavigation.mod.NavigationCloseDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/CLOSE_DRAWER")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationCloseDrawerAction]
  }
  
  inline def NavigationCompleteTransitionAction(key: String): typingsJapgolly.reactNavigation.mod.NavigationCompleteTransitionAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/COMPLETE_TRANSITION")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationCompleteTransitionAction]
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
  
  inline def NavigationInitAction(): typingsJapgolly.reactNavigation.mod.NavigationInitAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/INIT")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationInitAction]
  }
  
  inline def NavigationNavigateAction(routeName: String): typingsJapgolly.reactNavigation.mod.NavigationNavigateAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/NAVIGATE")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationNavigateAction]
  }
  
  inline def NavigationOpenDrawerAction(): typingsJapgolly.reactNavigation.mod.NavigationOpenDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/OPEN_DRAWER")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationOpenDrawerAction]
  }
  
  inline def NavigationPopAction(): typingsJapgolly.reactNavigation.mod.NavigationPopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/POP")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationPopAction]
  }
  
  inline def NavigationPopToTopAction(): typingsJapgolly.reactNavigation.mod.NavigationPopToTopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/POP_TO_TOP")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationPopToTopAction]
  }
  
  inline def NavigationPushAction(routeName: String): typingsJapgolly.reactNavigation.mod.NavigationPushAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/PUSH")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationPushAction]
  }
  
  inline def NavigationReplaceAction(key: String, routeName: String): typingsJapgolly.reactNavigation.mod.NavigationReplaceAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/REPLACE")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationReplaceAction]
  }
  
  inline def NavigationResetAction(actions: js.Array[NavigationNavigateAction], index: Double): typingsJapgolly.reactNavigation.mod.NavigationResetAction = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/RESET")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationResetAction]
  }
  
  inline def NavigationSetParamsAction(key: String, params: NavigationParams): typingsJapgolly.reactNavigation.mod.NavigationSetParamsAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/SET_PARAMS")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationSetParamsAction]
  }
  
  inline def NavigationToggleDrawerAction(): typingsJapgolly.reactNavigation.mod.NavigationToggleDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/TOGGLE_DRAWER")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationToggleDrawerAction]
  }
}
