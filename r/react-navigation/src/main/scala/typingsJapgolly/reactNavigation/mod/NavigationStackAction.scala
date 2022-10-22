package typingsJapgolly.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNavigation.mod.NavigationInitAction
  - typingsJapgolly.reactNavigation.mod.NavigationNavigateAction
  - typingsJapgolly.reactNavigation.mod.NavigationBackAction
  - typingsJapgolly.reactNavigation.mod.NavigationSetParamsAction
  - typingsJapgolly.reactNavigation.mod.NavigationResetAction
  - typingsJapgolly.reactNavigation.mod.NavigationReplaceAction
  - typingsJapgolly.reactNavigation.mod.NavigationPopAction
  - typingsJapgolly.reactNavigation.mod.NavigationPushAction
  - typingsJapgolly.reactNavigation.mod.NavigationPopToTopAction
  - typingsJapgolly.reactNavigation.mod.NavigationCompleteTransitionAction
*/
trait NavigationStackAction
  extends StObject
     with _NavigationAction
object NavigationStackAction {
  
  inline def NavigationBackAction(): typingsJapgolly.reactNavigation.mod.NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/BACK")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationBackAction]
  }
  
  inline def NavigationCompleteTransitionAction(key: String): typingsJapgolly.reactNavigation.mod.NavigationCompleteTransitionAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/COMPLETE_TRANSITION")
    __obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.NavigationCompleteTransitionAction]
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
}
