package typingsJapgolly.twilioSync.executorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobExecutor extends js.Object {
  def add(task: Task, context: js.Any, arg: js.Any, errorHandler: js.Any): js.Any
}

object JobExecutor {
  @scala.inline
  def apply(add: (Task, js.Any, js.Any, js.Any) => CallbackTo[js.Any]): JobExecutor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction4((t0: typingsJapgolly.twilioSync.executorMod.Task, t1: js.Any, t2: js.Any, t3: js.Any) => add(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[JobExecutor]
  }
}

