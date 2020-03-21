package typingsJapgolly.reduxSagaCore.typesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxSagaCore.AnonArgs
import typingsJapgolly.reduxSagaCore.AnonEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SagaMonitor extends js.Object {
  /**
    * @param action The dispatched Redux action. If the action was dispatched by
    * a Saga then the action will have a property `SAGA_ACTION` set to true
    * (`SAGA_ACTION` can be imported from `@redux-saga/symbols`).
    */
  var actionDispatched: js.UndefOr[js.Function1[/* action */ Action[_], Unit]] = js.undefined
  /**
    * @param effectId The ID of the yielded effect
    */
  var effectCancelled: js.UndefOr[js.Function1[/* effectId */ Double, Unit]] = js.undefined
  /**
    * @param effectId The ID of the yielded effect
    * @param error Error raised with the rejection of the effect
    */
  var effectRejected: js.UndefOr[js.Function2[/* effectId */ Double, /* error */ js.Any, Unit]] = js.undefined
  /**
    * @param effectId The ID of the yielded effect
    * @param result The result of the successful resolution of the effect. In
    *   case of `fork` or `spawn` effects, the result will be a `Task` object.
    */
  var effectResolved: js.UndefOr[js.Function2[/* effectId */ Double, /* result */ js.Any, Unit]] = js.undefined
  /**
    * @param effectId Unique ID assigned to the yielded effect
    * @param parentEffectId ID of the parent Effect. In the case of a `race` or
    *   `parallel` effect, all effects yielded inside will have the direct
    *   race/parallel effect as a parent. In case of a top-level effect, the
    *   parent will be the containing Saga
    * @param label In case of a `race`/`all` effect, all child effects will be
    *   assigned as label the corresponding keys of the object passed to
    *   `race`/`all`
    * @param effect The yielded effect itself
    */
  var effectTriggered: js.UndefOr[js.Function1[/* options */ AnonEffect, Unit]] = js.undefined
  /**
    * @param effectId Unique ID assigned to this root saga execution
    * @param saga The generator function that starts to run
    * @param args The arguments passed to the generator function
    */
  var rootSagaStarted: js.UndefOr[js.Function1[/* options */ AnonArgs, Unit]] = js.undefined
}

object SagaMonitor {
  @scala.inline
  def apply(
    actionDispatched: /* action */ Action[js.Any] => Callback = null,
    effectCancelled: /* effectId */ Double => Callback = null,
    effectRejected: (/* effectId */ Double, /* error */ js.Any) => Callback = null,
    effectResolved: (/* effectId */ Double, /* result */ js.Any) => Callback = null,
    effectTriggered: /* options */ AnonEffect => Callback = null,
    rootSagaStarted: /* options */ AnonArgs => Callback = null
  ): SagaMonitor = {
    val __obj = js.Dynamic.literal()
    if (actionDispatched != null) __obj.updateDynamic("actionDispatched")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.redux.mod.Action[js.Any]) => actionDispatched(t0).runNow()))
    if (effectCancelled != null) __obj.updateDynamic("effectCancelled")(js.Any.fromFunction1((t0: /* effectId */ scala.Double) => effectCancelled(t0).runNow()))
    if (effectRejected != null) __obj.updateDynamic("effectRejected")(js.Any.fromFunction2((t0: /* effectId */ scala.Double, t1: /* error */ js.Any) => effectRejected(t0, t1).runNow()))
    if (effectResolved != null) __obj.updateDynamic("effectResolved")(js.Any.fromFunction2((t0: /* effectId */ scala.Double, t1: /* result */ js.Any) => effectResolved(t0, t1).runNow()))
    if (effectTriggered != null) __obj.updateDynamic("effectTriggered")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.reduxSagaCore.AnonEffect) => effectTriggered(t0).runNow()))
    if (rootSagaStarted != null) __obj.updateDynamic("rootSagaStarted")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.reduxSagaCore.AnonArgs) => rootSagaStarted(t0).runNow()))
    __obj.asInstanceOf[SagaMonitor]
  }
}

