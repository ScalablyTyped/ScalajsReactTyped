package typingsJapgolly.reduxSagaTester.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.ReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SagaTesterOptions[StateType] extends js.Object {
  var combineReducers: js.UndefOr[
    js.Function1[/* map */ ReducersMapObject[_, Action[_]], Reducer[StateType, AnyAction]]
  ] = js.undefined
  var ignoreReduxActions: js.UndefOr[Boolean] = js.undefined
  var initialState: js.UndefOr[StateType] = js.undefined
  var middlewares: js.UndefOr[js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var reducers: js.UndefOr[(ReducersMapObject[_, Action[_]]) | (Reducer[StateType, AnyAction])] = js.undefined
}

object SagaTesterOptions {
  @scala.inline
  def apply[StateType](
    combineReducers: /* map */ ReducersMapObject[js.Any, Action[js.Any]] => CallbackTo[Reducer[StateType, AnyAction]] = null,
    ignoreReduxActions: js.UndefOr[Boolean] = js.undefined,
    initialState: StateType = null,
    middlewares: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]] = null,
    options: js.Object = null,
    reducers: (ReducersMapObject[_, Action[_]]) | (Reducer[StateType, AnyAction]) = null
  ): SagaTesterOptions[StateType] = {
    val __obj = js.Dynamic.literal()
    if (combineReducers != null) __obj.updateDynamic("combineReducers")(js.Any.fromFunction1((t0: /* map */ typingsJapgolly.redux.mod.ReducersMapObject[js.Any, typingsJapgolly.redux.mod.Action[js.Any]]) => combineReducers(t0).runNow()))
    if (!js.isUndefined(ignoreReduxActions)) __obj.updateDynamic("ignoreReduxActions")(ignoreReduxActions.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (middlewares != null) __obj.updateDynamic("middlewares")(middlewares.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (reducers != null) __obj.updateDynamic("reducers")(reducers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SagaTesterOptions[StateType]]
  }
}

