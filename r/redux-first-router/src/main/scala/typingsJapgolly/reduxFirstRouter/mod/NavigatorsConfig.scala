package typingsJapgolly.reduxFirstRouter.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.reduxFirstRouter.AnonAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorsConfig[TKeys, TState] extends js.Object {
  var navigators: Navigators[TState]
  def actionToNavigation(
    navigators: Navigators[TState],
     // TODO check this
  action: js.Object,
    navigationAction: Nullable[NavigationAction],
    route: Nullable[Route[TKeys, TState]]
  ): js.Object
  def navigationToAction(
    navigators: Navigators[TState],
    store: Store[TState, AnyAction],
    routesMap: RoutesMap[TKeys, TState],
    action: js.Object
  ): AnonAction
  def patchNavigators(navigators: Navigators[TState]): Unit
}

object NavigatorsConfig {
  @scala.inline
  def apply[TKeys, TState](
    actionToNavigation: (Navigators[TState], js.Object, Nullable[NavigationAction], Nullable[Route[TKeys, TState]]) => CallbackTo[js.Object],
    navigationToAction: (Navigators[TState], Store[TState, AnyAction], RoutesMap[TKeys, TState], js.Object) => CallbackTo[AnonAction],
    navigators: Navigators[TState],
    patchNavigators: Navigators[TState] => Callback
  ): NavigatorsConfig[TKeys, TState] = {
    val __obj = js.Dynamic.literal(navigators = navigators.asInstanceOf[js.Any])
    __obj.updateDynamic("actionToNavigation")(js.Any.fromFunction4((t0: typingsJapgolly.reduxFirstRouter.mod.Navigators[TState], t1: js.Object, t2: typingsJapgolly.reduxFirstRouter.mod.Nullable[typingsJapgolly.reduxFirstRouter.mod.NavigationAction], t3: typingsJapgolly.reduxFirstRouter.mod.Nullable[typingsJapgolly.reduxFirstRouter.mod.Route[TKeys, TState]]) => actionToNavigation(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("navigationToAction")(js.Any.fromFunction4((t0: typingsJapgolly.reduxFirstRouter.mod.Navigators[TState], t1: typingsJapgolly.redux.mod.Store[TState, typingsJapgolly.redux.mod.AnyAction], t2: typingsJapgolly.reduxFirstRouter.mod.RoutesMap[TKeys, TState], t3: js.Object) => navigationToAction(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("patchNavigators")(js.Any.fromFunction1((t0: typingsJapgolly.reduxFirstRouter.mod.Navigators[TState]) => patchNavigators(t0).runNow()))
    __obj.asInstanceOf[NavigatorsConfig[TKeys, TState]]
  }
}

