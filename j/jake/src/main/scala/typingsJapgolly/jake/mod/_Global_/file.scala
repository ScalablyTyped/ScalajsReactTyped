package typingsJapgolly.jake.mod._Global_

import typingsJapgolly.jake.mod._Global_.jake.FileTask
import typingsJapgolly.jake.mod._Global_.jake.FileTaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("file")
@js.native
object file extends js.Object {
  /**
    * Creates a Jake FileTask.
    * @name name The name of the Task
    * @param prereqs Prerequisites to be run before this task
    * @param action The action to perform for this task
    * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
    */
  def apply(name: String): FileTask = js.native
  def apply(name: String, prereqs: js.Array[String]): FileTask = js.native
  def apply(name: String, prereqs: js.Array[String], action: js.ThisFunction0[/* this */ FileTask, Unit]): FileTask = js.native
  def apply(
    name: String,
    prereqs: js.Array[String],
    action: js.ThisFunction0[/* this */ FileTask, Unit],
    opts: FileTaskOptions
  ): FileTask = js.native
}

