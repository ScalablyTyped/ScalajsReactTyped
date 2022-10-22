package typingsJapgolly.reactNavigationDrawer.anon

import typingsJapgolly.reactNavigation.mod.NavigationAction
import typingsJapgolly.reactNavigation.mod.NavigationBackAction
import typingsJapgolly.reactNavigation.mod.NavigationCloseDrawerAction
import typingsJapgolly.reactNavigation.mod.NavigationCompleteTransitionAction
import typingsJapgolly.reactNavigation.mod.NavigationComponent
import typingsJapgolly.reactNavigation.mod.NavigationDrawerClosedAction
import typingsJapgolly.reactNavigation.mod.NavigationDrawerOpenedAction
import typingsJapgolly.reactNavigation.mod.NavigationInitAction
import typingsJapgolly.reactNavigation.mod.NavigationJumpToAction
import typingsJapgolly.reactNavigation.mod.NavigationNavigateAction
import typingsJapgolly.reactNavigation.mod.NavigationOpenDrawerAction
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationPopAction
import typingsJapgolly.reactNavigation.mod.NavigationPopToTopAction
import typingsJapgolly.reactNavigation.mod.NavigationPushAction
import typingsJapgolly.reactNavigation.mod.NavigationReplaceAction
import typingsJapgolly.reactNavigation.mod.NavigationResetAction
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigation.mod.NavigationScreenOptionsGetter
import typingsJapgolly.reactNavigation.mod.NavigationScreenProp
import typingsJapgolly.reactNavigation.mod.NavigationSetParamsAction
import typingsJapgolly.reactNavigation.mod.NavigationToggleDrawerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetActionCreators extends StObject {
  
  def getActionCreators(route: NavigationRoute[NavigationParams], navStateKey: String): CloseDrawer = js.native
  
  def getActionForPathAndParams(path: String): NavigationInitAction | NavigationNavigateAction | NavigationBackAction | NavigationSetParamsAction | NavigationResetAction | NavigationReplaceAction | NavigationPopAction | NavigationPushAction | NavigationPopToTopAction | NavigationCompleteTransitionAction | NavigationDrawerOpenedAction | NavigationDrawerClosedAction | NavigationOpenDrawerAction | NavigationCloseDrawerAction | NavigationToggleDrawerAction | NavigationJumpToAction | Key | Null = js.native
  def getActionForPathAndParams(path: String, params: NavigationParams): NavigationInitAction | NavigationNavigateAction | NavigationBackAction | NavigationSetParamsAction | NavigationResetAction | NavigationReplaceAction | NavigationPopAction | NavigationPushAction | NavigationPopToTopAction | NavigationCompleteTransitionAction | NavigationDrawerOpenedAction | NavigationDrawerClosedAction | NavigationOpenDrawerAction | NavigationCloseDrawerAction | NavigationToggleDrawerAction | NavigationJumpToAction | Key | Null = js.native
  
  def getComponentForRouteName(routeName: String): NavigationComponent[
    js.Object, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ] = js.native
  
  def getComponentForState(state: Any): NavigationComponent[
    js.Object, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ] = js.native
  
  def getPathAndParamsForState(state: Any): Params = js.native
  
  var getScreenOptions: NavigationScreenOptionsGetter[Any] = js.native
  
  def getStateForAction(action: NavigationAction): Any = js.native
  def getStateForAction(action: NavigationAction, state: NavigationLeafRouteNaviga): Any = js.native
  def getStateForAction(action: NavigationAction, state: NavigationLeafRouteNavigaIndex): Any = js.native
}
