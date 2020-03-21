package typingsJapgolly.angularScenario.angularScenario

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  def check(): js.Any
  def enter(value: js.Any): js.Any
  def select(radioButtonValue: js.Any): js.Any
  def `val`(): Future
}

object Input {
  @scala.inline
  def apply(
    check: CallbackTo[js.Any],
    enter: js.Any => CallbackTo[js.Any],
    select: js.Any => CallbackTo[js.Any],
    `val`: CallbackTo[Future]
  ): Input = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check")(check.toJsFn)
    __obj.updateDynamic("enter")(js.Any.fromFunction1((t0: js.Any) => enter(t0).runNow()))
    __obj.updateDynamic("select")(js.Any.fromFunction1((t0: js.Any) => select(t0).runNow()))
    __obj.updateDynamic("val")(`val`.toJsFn)
    __obj.asInstanceOf[Input]
  }
}

