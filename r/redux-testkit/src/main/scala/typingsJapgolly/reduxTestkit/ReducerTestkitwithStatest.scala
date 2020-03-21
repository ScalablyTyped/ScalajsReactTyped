package typingsJapgolly.reduxTestkit

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxTestkit.mod.ReducerTestkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined redux-testkit.redux-testkit.ReducerTestkit & {withState (state : any): redux-testkit.redux-testkit.ReducerTestkit} */
trait ReducerTestkitwithStatest extends js.Object {
  def execute(action: Action[_]): js.Any
  def expect(action: Action[_]): AnonToChangeInState
  def withState(state: js.Any): ReducerTestkit
}

object ReducerTestkitwithStatest {
  @scala.inline
  def apply(
    execute: Action[js.Any] => CallbackTo[js.Any],
    expect: Action[js.Any] => CallbackTo[AnonToChangeInState],
    withState: js.Any => CallbackTo[ReducerTestkit]
  ): ReducerTestkitwithStatest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction1((t0: typingsJapgolly.redux.mod.Action[js.Any]) => execute(t0).runNow()))
    __obj.updateDynamic("expect")(js.Any.fromFunction1((t0: typingsJapgolly.redux.mod.Action[js.Any]) => expect(t0).runNow()))
    __obj.updateDynamic("withState")(js.Any.fromFunction1((t0: js.Any) => withState(t0).runNow()))
    __obj.asInstanceOf[ReducerTestkitwithStatest]
  }
}

