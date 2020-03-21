package typingsJapgolly.nodeZendesk.mod.Users

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.assigned
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.groups
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.organization
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.requested
*/
trait TicketRestriction extends js.Object

object TicketRestriction {
  @scala.inline
  def assigned: typingsJapgolly.nodeZendesk.nodeZendeskStrings.assigned = this.cast("assigned")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def groups: typingsJapgolly.nodeZendesk.nodeZendeskStrings.groups = this.cast("groups")
  @scala.inline
  def organization: typingsJapgolly.nodeZendesk.nodeZendeskStrings.organization = this.cast("organization")
  @scala.inline
  def requested: typingsJapgolly.nodeZendesk.nodeZendeskStrings.requested = this.cast("requested")
}

