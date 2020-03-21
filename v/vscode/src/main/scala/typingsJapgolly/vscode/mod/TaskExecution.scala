package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskExecution extends js.Object {
  /**
  		 * The task that got started.
  		 */
  var task: Task
  /**
  		 * Terminates the task execution.
  		 */
  def terminate(): Unit
}

object TaskExecution {
  @scala.inline
  def apply(task: Task, terminate: Callback): TaskExecution = {
    val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any])
    __obj.updateDynamic("terminate")(terminate.toJsFn)
    __obj.asInstanceOf[TaskExecution]
  }
}

