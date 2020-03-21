package typingsJapgolly.mobxTask.taskGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mobxTask.mobxTaskStrings.state
  - typingsJapgolly.mobxTask.mobxTaskStrings.pending
  - typingsJapgolly.mobxTask.mobxTaskStrings.resolved
  - typingsJapgolly.mobxTask.mobxTaskStrings.rejected
  - typingsJapgolly.mobxTask.mobxTaskStrings.result
  - typingsJapgolly.mobxTask.mobxTaskStrings.error
  - typingsJapgolly.mobxTask.mobxTaskStrings.`match`
*/
trait QueryableMethods extends js.Object

object QueryableMethods {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.mobxTask.mobxTaskStrings.error = this.cast("error")
  @scala.inline
  def `match`: typingsJapgolly.mobxTask.mobxTaskStrings.`match` = this.cast("match")
  @scala.inline
  def pending: typingsJapgolly.mobxTask.mobxTaskStrings.pending = this.cast("pending")
  @scala.inline
  def rejected: typingsJapgolly.mobxTask.mobxTaskStrings.rejected = this.cast("rejected")
  @scala.inline
  def resolved: typingsJapgolly.mobxTask.mobxTaskStrings.resolved = this.cast("resolved")
  @scala.inline
  def result: typingsJapgolly.mobxTask.mobxTaskStrings.result = this.cast("result")
  @scala.inline
  def state: typingsJapgolly.mobxTask.mobxTaskStrings.state = this.cast("state")
}

