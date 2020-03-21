package typingsJapgolly.mobxTask

import typingsJapgolly.mobxTask.taskMod.TaskFactory
import typingsJapgolly.mobxTask.taskMod.Task_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-task", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Creates a task in the `pending` state.
    */
  val task: TaskFactory = js.native
  def TaskGroup[A /* <: js.Array[_] */, R](tasks: js.Array[Task_[A, R]]): typingsJapgolly.mobxTask.taskGroupMod.TaskGroup[A, R] = js.native
}

