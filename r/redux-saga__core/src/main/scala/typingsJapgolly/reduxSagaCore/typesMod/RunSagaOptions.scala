package typingsJapgolly.reduxSagaCore.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunSagaOptions[A, S] extends js.Object {
  /**
    * See docs for `channel`
    */
  var channel: js.UndefOr[PredicateTakeableChannel[A]] = js.undefined
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var context: js.UndefOr[js.Object] = js.undefined
  /**
    * Used to fulfill `put` effects.
    *
    * @param output argument provided by the Saga to the `put` Effect
    */
  var dispatch: js.UndefOr[js.Function1[/* output */ A, _]] = js.undefined
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var effectMiddlewares: js.UndefOr[js.Array[EffectMiddleware]] = js.undefined
  /**
    * Used to fulfill `select` and `getState` effects
    */
  var getState: js.UndefOr[js.Function0[S]] = js.undefined
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.undefined
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var sagaMonitor: js.UndefOr[SagaMonitor] = js.undefined
}

object RunSagaOptions {
  @scala.inline
  def apply[A, S](
    channel: PredicateTakeableChannel[A] = null,
    context: js.Object = null,
    dispatch: /* output */ A => CallbackTo[js.Any] = null,
    effectMiddlewares: js.Array[EffectMiddleware] = null,
    getState: js.UndefOr[CallbackTo[S]] = js.undefined,
    onError: (/* error */ js.Error, /* errorInfo */ ErrorInfo) => Callback = null,
    sagaMonitor: SagaMonitor = null
  ): RunSagaOptions[A, S] = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dispatch != null) __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: /* output */ A) => dispatch(t0).runNow()))
    if (effectMiddlewares != null) __obj.updateDynamic("effectMiddlewares")(effectMiddlewares.asInstanceOf[js.Any])
    getState.foreach(p => __obj.updateDynamic("getState")(p.toJsFn))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* errorInfo */ typingsJapgolly.reduxSagaCore.typesMod.ErrorInfo) => onError(t0, t1).runNow()))
    if (sagaMonitor != null) __obj.updateDynamic("sagaMonitor")(sagaMonitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunSagaOptions[A, S]]
  }
}

