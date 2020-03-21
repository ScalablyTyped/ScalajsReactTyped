package typingsJapgolly.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.problem
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.incident
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.question
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.task
*/
trait TicketType extends js.Object

object TicketType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incident: typingsJapgolly.nodeZendesk.nodeZendeskStrings.incident = this.cast("incident")
  @scala.inline
  def problem: typingsJapgolly.nodeZendesk.nodeZendeskStrings.problem = this.cast("problem")
  @scala.inline
  def question: typingsJapgolly.nodeZendesk.nodeZendeskStrings.question = this.cast("question")
  @scala.inline
  def task: typingsJapgolly.nodeZendesk.nodeZendeskStrings.task = this.cast("task")
}

