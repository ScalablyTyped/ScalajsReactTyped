package typingsJapgolly.uiRouterExtras.mod.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFutureStateProvider extends js.Object {
  /**
    * Adds a resolve function.
    * `$futureStateProvider` won't reject any state transitions or routes until all resolveFunction promises have been resolved.
    * Resolves may be used to defer routing until the states have been loaded via $http, for instance.
    */
  def addResolve(resolveFn: IResolveFunction): Unit
  /**
    * Registers a `FutureState` object as a placeholder for a full UI-Router `state` or `state` tree.
    */
  def futureState(state: IFutureState): Unit
  /**
    * Registers a `StateFactory` function for `FutureState` of type `type`.
    */
  def stateFactory(`type`: String, stateFactory: IFutureStateFactory): Unit
}

object IFutureStateProvider {
  @scala.inline
  def apply(
    addResolve: IResolveFunction => Callback,
    futureState: IFutureState => Callback,
    stateFactory: (String, IFutureStateFactory) => Callback
  ): IFutureStateProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addResolve")(js.Any.fromFunction1((t0: typingsJapgolly.uiRouterExtras.mod.ui.IResolveFunction) => addResolve(t0).runNow()))
    __obj.updateDynamic("futureState")(js.Any.fromFunction1((t0: typingsJapgolly.uiRouterExtras.mod.ui.IFutureState) => futureState(t0).runNow()))
    __obj.updateDynamic("stateFactory")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.uiRouterExtras.mod.ui.IFutureStateFactory) => stateFactory(t0, t1).runNow()))
    __obj.asInstanceOf[IFutureStateProvider]
  }
}

