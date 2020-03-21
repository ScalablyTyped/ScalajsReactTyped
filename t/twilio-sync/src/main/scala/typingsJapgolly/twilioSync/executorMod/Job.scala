package typingsJapgolly.twilioSync.executorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  var arg: js.Any
  var context: js.Any
  var task: Task
  def handle(arg: js.Any): js.Any
  def reject(arg: js.Any): js.Any
  def resolve(arg: js.Any): js.Any
}

object Job {
  @scala.inline
  def apply(
    arg: js.Any,
    context: js.Any,
    handle: js.Any => CallbackTo[js.Any],
    reject: js.Any => CallbackTo[js.Any],
    resolve: js.Any => CallbackTo[js.Any],
    task: Task
  ): Job = {
    val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.updateDynamic("handle")(js.Any.fromFunction1((t0: js.Any) => handle(t0).runNow()))
    __obj.updateDynamic("reject")(js.Any.fromFunction1((t0: js.Any) => reject(t0).runNow()))
    __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: js.Any) => resolve(t0).runNow()))
    __obj.asInstanceOf[Job]
  }
}

