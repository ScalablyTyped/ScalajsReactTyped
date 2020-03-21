package typingsJapgolly.knockoutDeferredUpdates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutDeferredTasks extends js.Object {
  def makeProcessedCallback(evaluator: js.Function): Unit = js.native
  def processDelayed(evaluator: js.Function): Boolean = js.native
  def processDelayed(evaluator: js.Function, distinct: Boolean): Boolean = js.native
  def processDelayed(evaluator: js.Function, distinct: Boolean, options: js.Array[_]): Boolean = js.native
  def processImmediate(evaluator: js.Function): js.Any = js.native
  def processImmediate(evaluator: js.Function, `object`: js.Any): js.Any = js.native
  def processImmediate(evaluator: js.Function, `object`: js.Any, args: js.Array[_]): js.Any = js.native
}

