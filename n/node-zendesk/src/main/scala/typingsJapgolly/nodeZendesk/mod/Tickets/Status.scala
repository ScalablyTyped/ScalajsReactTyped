package typingsJapgolly.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.`new`
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.open
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.pending
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.hold
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.solved
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.closed
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsJapgolly.nodeZendesk.nodeZendeskStrings.closed = this.cast("closed")
  @scala.inline
  def hold: typingsJapgolly.nodeZendesk.nodeZendeskStrings.hold = this.cast("hold")
  @scala.inline
  def `new`: typingsJapgolly.nodeZendesk.nodeZendeskStrings.`new` = this.cast("new")
  @scala.inline
  def open: typingsJapgolly.nodeZendesk.nodeZendeskStrings.open = this.cast("open")
  @scala.inline
  def pending: typingsJapgolly.nodeZendesk.nodeZendeskStrings.pending = this.cast("pending")
  @scala.inline
  def solved: typingsJapgolly.nodeZendesk.nodeZendeskStrings.solved = this.cast("solved")
}

