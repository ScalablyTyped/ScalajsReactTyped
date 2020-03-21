package typingsJapgolly.betterQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.betterQueue.betterQueueStrings.accept
  - typingsJapgolly.betterQueue.betterQueueStrings.queued
  - typingsJapgolly.betterQueue.betterQueueStrings.started
  - typingsJapgolly.betterQueue.betterQueueStrings.progress
  - typingsJapgolly.betterQueue.betterQueueStrings.finish
  - typingsJapgolly.betterQueue.betterQueueStrings.failed
  - typingsJapgolly.betterQueue.betterQueueStrings.error
*/
trait TicketEvent extends js.Object

object TicketEvent {
  @scala.inline
  def accept: typingsJapgolly.betterQueue.betterQueueStrings.accept = this.cast("accept")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.betterQueue.betterQueueStrings.error = this.cast("error")
  @scala.inline
  def failed: typingsJapgolly.betterQueue.betterQueueStrings.failed = this.cast("failed")
  @scala.inline
  def finish: typingsJapgolly.betterQueue.betterQueueStrings.finish = this.cast("finish")
  @scala.inline
  def progress: typingsJapgolly.betterQueue.betterQueueStrings.progress = this.cast("progress")
  @scala.inline
  def queued: typingsJapgolly.betterQueue.betterQueueStrings.queued = this.cast("queued")
  @scala.inline
  def started: typingsJapgolly.betterQueue.betterQueueStrings.started = this.cast("started")
}

