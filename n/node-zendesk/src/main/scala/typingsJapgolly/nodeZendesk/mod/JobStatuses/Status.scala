package typingsJapgolly.nodeZendesk.mod.JobStatuses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.queued
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.working
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.failed
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.completed
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.killed
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typingsJapgolly.nodeZendesk.nodeZendeskStrings.completed = this.cast("completed")
  @scala.inline
  def failed: typingsJapgolly.nodeZendesk.nodeZendeskStrings.failed = this.cast("failed")
  @scala.inline
  def killed: typingsJapgolly.nodeZendesk.nodeZendeskStrings.killed = this.cast("killed")
  @scala.inline
  def queued: typingsJapgolly.nodeZendesk.nodeZendeskStrings.queued = this.cast("queued")
  @scala.inline
  def working: typingsJapgolly.nodeZendesk.nodeZendeskStrings.working = this.cast("working")
}

