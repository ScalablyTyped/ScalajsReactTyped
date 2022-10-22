package typingsJapgolly.reduxFirstRouter.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorsConfig[TKeys, TState] extends StObject {
  
  def actionToNavigation(
    navigators: Navigators[TState],
    action: js.Object,
    // TODO check this
  navigationAction: Nullable[NavigationAction],
    route: Nullable[Route[TKeys, TState]]
  ): js.Object
  
  def navigationToAction(
    navigators: Navigators[TState],
    store: Store[TState, AnyAction],
    routesMap: RoutesMap[TKeys, TState],
    action: js.Object
  ): typingsJapgolly.reduxFirstRouter.anon.Action
  
  var navigators: Navigators[TState]
  
  def patchNavigators(navigators: Navigators[TState]): Unit
}
object NavigatorsConfig {
  
  inline def apply[TKeys, TState](
    actionToNavigation: (Navigators[TState], js.Object, Nullable[NavigationAction], Nullable[Route[TKeys, TState]]) => js.Object,
    navigationToAction: (Navigators[TState], Store[TState, AnyAction], RoutesMap[TKeys, TState], js.Object) => typingsJapgolly.reduxFirstRouter.anon.Action,
    navigators: Navigators[TState],
    patchNavigators: Navigators[TState] => Callback
  ): NavigatorsConfig[TKeys, TState] = {
    val __obj = js.Dynamic.literal(actionToNavigation = js.Any.fromFunction4(actionToNavigation), navigationToAction = js.Any.fromFunction4(navigationToAction), navigators = navigators.asInstanceOf[js.Any], patchNavigators = js.Any.fromFunction1((t0: Navigators[TState]) => patchNavigators(t0).runNow()))
    __obj.asInstanceOf[NavigatorsConfig[TKeys, TState]]
  }
  
  extension [Self <: NavigatorsConfig[?, ?], TKeys, TState](x: Self & (NavigatorsConfig[TKeys, TState])) {
    
    inline def setActionToNavigation(
      value: (Navigators[TState], js.Object, Nullable[NavigationAction], Nullable[Route[TKeys, TState]]) => js.Object
    ): Self = StObject.set(x, "actionToNavigation", js.Any.fromFunction4(value))
    
    inline def setNavigationToAction(
      value: (Navigators[TState], Store[TState, AnyAction], RoutesMap[TKeys, TState], js.Object) => typingsJapgolly.reduxFirstRouter.anon.Action
    ): Self = StObject.set(x, "navigationToAction", js.Any.fromFunction4(value))
    
    inline def setNavigators(value: Navigators[TState]): Self = StObject.set(x, "navigators", value.asInstanceOf[js.Any])
    
    inline def setPatchNavigators(value: Navigators[TState] => Callback): Self = StObject.set(x, "patchNavigators", js.Any.fromFunction1((t0: Navigators[TState]) => value(t0).runNow()))
  }
}
