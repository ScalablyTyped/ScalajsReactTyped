package typingsJapgolly.reduxFirstRouter.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reduxFirstRouter.AnonParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router[TState] extends js.Object {
  def getActionForPathAndParams(path: String): Nullable[js.Object]
  def getPathAndParamsForState(state: TState): AnonParams
  def getStateForAction(action: js.Object, state: Nullable[TState]): Nullable[TState]
  def getStateForActionOriginal(action: js.Object, state: Nullable[TState]): Nullable[TState]
}

object Router {
  @scala.inline
  def apply[TState](
    getActionForPathAndParams: String => CallbackTo[Nullable[js.Object]],
    getPathAndParamsForState: TState => CallbackTo[AnonParams],
    getStateForAction: (js.Object, Nullable[TState]) => CallbackTo[Nullable[TState]],
    getStateForActionOriginal: (js.Object, Nullable[TState]) => CallbackTo[Nullable[TState]]
  ): Router[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getActionForPathAndParams")(js.Any.fromFunction1((t0: java.lang.String) => getActionForPathAndParams(t0).runNow()))
    __obj.updateDynamic("getPathAndParamsForState")(js.Any.fromFunction1((t0: TState) => getPathAndParamsForState(t0).runNow()))
    __obj.updateDynamic("getStateForAction")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.reduxFirstRouter.mod.Nullable[TState]) => getStateForAction(t0, t1).runNow()))
    __obj.updateDynamic("getStateForActionOriginal")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.reduxFirstRouter.mod.Nullable[TState]) => getStateForActionOriginal(t0, t1).runNow()))
    __obj.asInstanceOf[Router[TState]]
  }
}

