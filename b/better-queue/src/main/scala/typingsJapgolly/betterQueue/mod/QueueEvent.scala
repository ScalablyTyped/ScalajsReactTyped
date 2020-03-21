package typingsJapgolly.betterQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.betterQueue.betterQueueStrings.task_queued
  - typingsJapgolly.betterQueue.betterQueueStrings.task_accepted
  - typingsJapgolly.betterQueue.betterQueueStrings.task_started
  - typingsJapgolly.betterQueue.betterQueueStrings.task_finish
  - typingsJapgolly.betterQueue.betterQueueStrings.task_failed
  - typingsJapgolly.betterQueue.betterQueueStrings.task_progress
  - typingsJapgolly.betterQueue.betterQueueStrings.batch_finish
  - typingsJapgolly.betterQueue.betterQueueStrings.batch_failed
  - typingsJapgolly.betterQueue.betterQueueStrings.batch_progress
  - typingsJapgolly.betterQueue.betterQueueStrings.drain
  - typingsJapgolly.betterQueue.betterQueueStrings.empty
  - typingsJapgolly.betterQueue.betterQueueStrings.error
*/
trait QueueEvent extends js.Object

object QueueEvent {
  @scala.inline
  def batch_failed: typingsJapgolly.betterQueue.betterQueueStrings.batch_failed = this.cast("batch_failed")
  @scala.inline
  def batch_finish: typingsJapgolly.betterQueue.betterQueueStrings.batch_finish = this.cast("batch_finish")
  @scala.inline
  def batch_progress: typingsJapgolly.betterQueue.betterQueueStrings.batch_progress = this.cast("batch_progress")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def drain: typingsJapgolly.betterQueue.betterQueueStrings.drain = this.cast("drain")
  @scala.inline
  def empty: typingsJapgolly.betterQueue.betterQueueStrings.empty = this.cast("empty")
  @scala.inline
  def error: typingsJapgolly.betterQueue.betterQueueStrings.error = this.cast("error")
  @scala.inline
  def task_accepted: typingsJapgolly.betterQueue.betterQueueStrings.task_accepted = this.cast("task_accepted")
  @scala.inline
  def task_failed: typingsJapgolly.betterQueue.betterQueueStrings.task_failed = this.cast("task_failed")
  @scala.inline
  def task_finish: typingsJapgolly.betterQueue.betterQueueStrings.task_finish = this.cast("task_finish")
  @scala.inline
  def task_progress: typingsJapgolly.betterQueue.betterQueueStrings.task_progress = this.cast("task_progress")
  @scala.inline
  def task_queued: typingsJapgolly.betterQueue.betterQueueStrings.task_queued = this.cast("task_queued")
  @scala.inline
  def task_started: typingsJapgolly.betterQueue.betterQueueStrings.task_started = this.cast("task_started")
}

