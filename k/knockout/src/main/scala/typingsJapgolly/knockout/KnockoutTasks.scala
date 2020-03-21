package typingsJapgolly.knockout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////
// tasks.js
//////////////////////////////////
trait KnockoutTasks extends js.Object {
  def cancel(handle: Double): Unit
  def runEarly(): Unit
  def schedule(task: js.Function): Double
  def scheduler(callback: js.Function): js.Any
}

object KnockoutTasks {
  @scala.inline
  def apply(
    cancel: Double => Callback,
    runEarly: Callback,
    schedule: js.Function => CallbackTo[Double],
    scheduler: js.Function => CallbackTo[js.Any]
  ): KnockoutTasks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: scala.Double) => cancel(t0).runNow()))
    __obj.updateDynamic("runEarly")(runEarly.toJsFn)
    __obj.updateDynamic("schedule")(js.Any.fromFunction1((t0: js.Function) => schedule(t0).runNow()))
    __obj.updateDynamic("scheduler")(js.Any.fromFunction1((t0: js.Function) => scheduler(t0).runNow()))
    __obj.asInstanceOf[KnockoutTasks]
  }
}

