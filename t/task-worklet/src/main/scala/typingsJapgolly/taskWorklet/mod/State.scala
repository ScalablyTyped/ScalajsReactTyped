package typingsJapgolly.taskWorklet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.taskWorklet.taskWorkletStrings.cancelled
  - typingsJapgolly.taskWorklet.taskWorkletStrings.completed
  - typingsJapgolly.taskWorklet.taskWorkletStrings.fulfilled
  - typingsJapgolly.taskWorklet.taskWorkletStrings.pending
  - typingsJapgolly.taskWorklet.taskWorkletStrings.scheduled
*/
trait State extends js.Object

object State {
  @scala.inline
  def cancelled: typingsJapgolly.taskWorklet.taskWorkletStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typingsJapgolly.taskWorklet.taskWorkletStrings.completed = this.cast("completed")
  @scala.inline
  def fulfilled: typingsJapgolly.taskWorklet.taskWorkletStrings.fulfilled = this.cast("fulfilled")
  @scala.inline
  def pending: typingsJapgolly.taskWorklet.taskWorkletStrings.pending = this.cast("pending")
  @scala.inline
  def scheduled: typingsJapgolly.taskWorklet.taskWorkletStrings.scheduled = this.cast("scheduled")
}

