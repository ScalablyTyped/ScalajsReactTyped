package typingsJapgolly.mobxTask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object taskMod {
  type TaskFunc[A /* <: js.Array[_] */, R] = js.Function1[/* args */ A, js.Promise[R]]
  type Task_[A /* <: js.Array[_] */, R] = (typingsJapgolly.mobxTask.taskMod.TaskFunc[A, typingsJapgolly.mobxTask.taskMod.WithoutPromise[R]]) with (typingsJapgolly.mobxTask.taskMod.TaskState[A, R]) with (typingsJapgolly.mobxTask.taskMod.TaskMethods[A, R])
  type WithoutPromise[T] = T
}
