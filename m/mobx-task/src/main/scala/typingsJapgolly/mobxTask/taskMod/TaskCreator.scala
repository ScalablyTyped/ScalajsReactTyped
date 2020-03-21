package typingsJapgolly.mobxTask.taskMod

import typingsJapgolly.std.MethodDecorator
import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- js.Function because Already inherited
- typingsJapgolly.std.PropertyDecorator because var conflicts: length. Inlined  */ @js.native
trait TaskCreator[K /* <: String */] extends MethodDecorator {
  def apply(options: Pick[TaskOptions[_, _], K]): MethodDecorator = js.native
  /**
    * Calls the actual task function.
    */
  def apply[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R]): Task_[A, R] = js.native
  def apply[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R], options: Pick[TaskOptions[A, R], K]): Task_[A, R] = js.native
}

