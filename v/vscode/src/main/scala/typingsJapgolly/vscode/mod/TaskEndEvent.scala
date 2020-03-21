package typingsJapgolly.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An event signaling the end of an executed task.
	 *
	 * This interface is not intended to be implemented.
	 */
trait TaskEndEvent extends js.Object {
  /**
  		 * The task item representing the task that finished.
  		 */
  val execution: TaskExecution
}

object TaskEndEvent {
  @scala.inline
  def apply(execution: TaskExecution): TaskEndEvent = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskEndEvent]
  }
}

