package typingsJapgolly.dva.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.ReducersMapObject
import typingsJapgolly.redux.mod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  var extraEnhancers: js.UndefOr[js.Array[StoreEnhancer[_, js.Object]]] = js.undefined
  var extraReducers: js.UndefOr[ReducersMapObject[_, Action[_]]] = js.undefined
  var onAction: js.UndefOr[onActionFunc | js.Array[onActionFunc]] = js.undefined
  var onEffect: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function2[/* e */ js.Error, /* dispatch */ Dispatch[_], Unit]] = js.undefined
  var onHmr: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onReducer: js.UndefOr[ReducerEnhancer] = js.undefined
  var onStateChange: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Hooks {
  @scala.inline
  def apply(
    extraEnhancers: js.Array[StoreEnhancer[_, js.Object]] = null,
    extraReducers: ReducersMapObject[_, Action[_]] = null,
    onAction: onActionFunc | js.Array[onActionFunc] = null,
    onEffect: js.UndefOr[Callback] = js.undefined,
    onError: (/* e */ js.Error, /* dispatch */ Dispatch[js.Any]) => Callback = null,
    onHmr: js.UndefOr[Callback] = js.undefined,
    onReducer: /* reducer */ Reducer[js.Any, AnyAction] => Callback = null,
    onStateChange: js.UndefOr[Callback] = js.undefined
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (extraEnhancers != null) __obj.updateDynamic("extraEnhancers")(extraEnhancers.asInstanceOf[js.Any])
    if (extraReducers != null) __obj.updateDynamic("extraReducers")(extraReducers.asInstanceOf[js.Any])
    if (onAction != null) __obj.updateDynamic("onAction")(onAction.asInstanceOf[js.Any])
    onEffect.foreach(p => __obj.updateDynamic("onEffect")(p.toJsFn))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction2((t0: /* e */ js.Error, t1: /* dispatch */ typingsJapgolly.redux.mod.Dispatch[js.Any]) => onError(t0, t1).runNow()))
    onHmr.foreach(p => __obj.updateDynamic("onHmr")(p.toJsFn))
    if (onReducer != null) __obj.updateDynamic("onReducer")(js.Any.fromFunction1((t0: /* reducer */ typingsJapgolly.redux.mod.Reducer[js.Any, typingsJapgolly.redux.mod.AnyAction]) => onReducer(t0).runNow()))
    onStateChange.foreach(p => __obj.updateDynamic("onStateChange")(p.toJsFn))
    __obj.asInstanceOf[Hooks]
  }
}

