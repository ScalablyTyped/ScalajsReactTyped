package typingsJapgolly.mobxTask.taskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mobxTask.mobxTaskStrings.pending
  - typingsJapgolly.mobxTask.mobxTaskStrings.resolved
  - typingsJapgolly.mobxTask.mobxTaskStrings.rejected
*/
trait TaskStatus extends js.Object

object TaskStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typingsJapgolly.mobxTask.mobxTaskStrings.pending = this.cast("pending")
  @scala.inline
  def rejected: typingsJapgolly.mobxTask.mobxTaskStrings.rejected = this.cast("rejected")
  @scala.inline
  def resolved: typingsJapgolly.mobxTask.mobxTaskStrings.resolved = this.cast("resolved")
}

