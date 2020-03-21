package typingsJapgolly.orchestrator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.orchestrator.orchestratorStrings.start
  - typingsJapgolly.orchestrator.orchestratorStrings.stop
  - typingsJapgolly.orchestrator.orchestratorStrings.err
  - typingsJapgolly.orchestrator.orchestratorStrings.task_start
  - typingsJapgolly.orchestrator.orchestratorStrings.task_stop
  - typingsJapgolly.orchestrator.orchestratorStrings.task_err
  - typingsJapgolly.orchestrator.orchestratorStrings.task_not_found
  - typingsJapgolly.orchestrator.orchestratorStrings.task_recursion
*/
trait EventNames extends js.Object

object EventNames {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def err: typingsJapgolly.orchestrator.orchestratorStrings.err = this.cast("err")
  @scala.inline
  def start: typingsJapgolly.orchestrator.orchestratorStrings.start = this.cast("start")
  @scala.inline
  def stop: typingsJapgolly.orchestrator.orchestratorStrings.stop = this.cast("stop")
  @scala.inline
  def task_err: typingsJapgolly.orchestrator.orchestratorStrings.task_err = this.cast("task_err")
  @scala.inline
  def task_not_found: typingsJapgolly.orchestrator.orchestratorStrings.task_not_found = this.cast("task_not_found")
  @scala.inline
  def task_recursion: typingsJapgolly.orchestrator.orchestratorStrings.task_recursion = this.cast("task_recursion")
  @scala.inline
  def task_start: typingsJapgolly.orchestrator.orchestratorStrings.task_start = this.cast("task_start")
  @scala.inline
  def task_stop: typingsJapgolly.orchestrator.orchestratorStrings.task_stop = this.cast("task_stop")
}

