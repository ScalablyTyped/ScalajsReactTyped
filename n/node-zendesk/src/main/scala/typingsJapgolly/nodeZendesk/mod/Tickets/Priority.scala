package typingsJapgolly.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.urgent
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.high
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.normal
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.low
*/
trait Priority extends js.Object

object Priority {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsJapgolly.nodeZendesk.nodeZendeskStrings.high = this.cast("high")
  @scala.inline
  def low: typingsJapgolly.nodeZendesk.nodeZendeskStrings.low = this.cast("low")
  @scala.inline
  def normal: typingsJapgolly.nodeZendesk.nodeZendeskStrings.normal = this.cast("normal")
  @scala.inline
  def urgent: typingsJapgolly.nodeZendesk.nodeZendeskStrings.urgent = this.cast("urgent")
}

