package typingsJapgolly.reactDashNavigationDashDrawer

import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationBackAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationCloseDrawerAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationCompleteTransitionAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationComponent
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationDrawerClosedAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationDrawerOpenedAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationInitAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationJumpToAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationNavigateAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationOpenDrawerAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationPopAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationPopToTopAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationPushAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationReplaceAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationResetAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationScreenOptionsGetter
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationSetParamsAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationToggleDrawerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Action extends js.Object {
  var getScreenOptions: NavigationScreenOptionsGetter[_] = js.native
  def getActionCreators(route: NavigationRoute[NavigationParams], navStateKey: String): Anon_CloseDrawer = js.native
  def getActionForPathAndParams(path: String): NavigationInitAction | NavigationNavigateAction | NavigationBackAction | NavigationSetParamsAction | NavigationResetAction | NavigationReplaceAction | NavigationPopAction | NavigationPushAction | NavigationPopToTopAction | NavigationCompleteTransitionAction | NavigationDrawerOpenedAction | NavigationDrawerClosedAction | NavigationOpenDrawerAction | NavigationCloseDrawerAction | NavigationToggleDrawerAction | NavigationJumpToAction | Anon_CHILDACTION | Null = js.native
  def getActionForPathAndParams(path: String, params: NavigationParams): NavigationInitAction | NavigationNavigateAction | NavigationBackAction | NavigationSetParamsAction | NavigationResetAction | NavigationReplaceAction | NavigationPopAction | NavigationPushAction | NavigationPopToTopAction | NavigationCompleteTransitionAction | NavigationDrawerOpenedAction | NavigationDrawerClosedAction | NavigationOpenDrawerAction | NavigationCloseDrawerAction | NavigationToggleDrawerAction | NavigationJumpToAction | Anon_CHILDACTION | Null = js.native
  def getComponentForRouteName(routeName: String): NavigationComponent[
    js.Object, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ] = js.native
  def getComponentForState(state: js.Any): NavigationComponent[
    js.Object, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ] = js.native
  def getPathAndParamsForState(state: js.Any): Anon_Params = js.native
  def getStateForAction(action: NavigationAction): js.Any = js.native
  def getStateForAction(action: NavigationAction, state: NavigationLeafRouteNavigationParamsNavigationState): js.Any = js.native
  def getStateForAction(action: NavigationAction, state: NavigationLeafRouteNavigationParamsisDrawerOpenany): js.Any = js.native
}

