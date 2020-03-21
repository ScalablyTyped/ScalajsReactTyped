package typingsJapgolly.reduxTestkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToChangeInState extends js.Object {
  def toChangeInState(expectedChanges: js.Any): Unit
  def toReturnState(expected: js.Any): Unit
  def toStayTheSame(): Unit
}

object AnonToChangeInState {
  @scala.inline
  def apply(toChangeInState: js.Any => Callback, toReturnState: js.Any => Callback, toStayTheSame: Callback): AnonToChangeInState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toChangeInState")(js.Any.fromFunction1((t0: js.Any) => toChangeInState(t0).runNow()))
    __obj.updateDynamic("toReturnState")(js.Any.fromFunction1((t0: js.Any) => toReturnState(t0).runNow()))
    __obj.updateDynamic("toStayTheSame")(toStayTheSame.toJsFn)
    __obj.asInstanceOf[AnonToChangeInState]
  }
}

