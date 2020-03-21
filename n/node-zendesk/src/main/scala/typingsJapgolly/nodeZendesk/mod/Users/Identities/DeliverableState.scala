package typingsJapgolly.nodeZendesk.mod.Users.Identities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.deliverable
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.undeliverable
*/
trait DeliverableState extends js.Object

object DeliverableState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deliverable: typingsJapgolly.nodeZendesk.nodeZendeskStrings.deliverable = this.cast("deliverable")
  @scala.inline
  def undeliverable: typingsJapgolly.nodeZendesk.nodeZendeskStrings.undeliverable = this.cast("undeliverable")
}

