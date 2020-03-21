package typingsJapgolly.reduxTestkit.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxTestkit.AnonToChangeInState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReducerTestkit extends js.Object {
  def execute(action: Action[_]): js.Any
  def expect(action: Action[_]): AnonToChangeInState
}

object ReducerTestkit {
  @scala.inline
  def apply(
    execute: Action[js.Any] => CallbackTo[js.Any],
    expect: Action[js.Any] => CallbackTo[AnonToChangeInState]
  ): ReducerTestkit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction1((t0: typingsJapgolly.redux.mod.Action[js.Any]) => execute(t0).runNow()))
    __obj.updateDynamic("expect")(js.Any.fromFunction1((t0: typingsJapgolly.redux.mod.Action[js.Any]) => expect(t0).runNow()))
    __obj.asInstanceOf[ReducerTestkit]
  }
}

