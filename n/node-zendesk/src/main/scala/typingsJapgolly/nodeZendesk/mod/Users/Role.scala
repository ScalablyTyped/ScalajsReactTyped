package typingsJapgolly.nodeZendesk.mod.Users

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.admin
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.agent
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.`end-user`
*/
trait Role extends js.Object

object Role {
  @scala.inline
  def admin: typingsJapgolly.nodeZendesk.nodeZendeskStrings.admin = this.cast("admin")
  @scala.inline
  def agent: typingsJapgolly.nodeZendesk.nodeZendeskStrings.agent = this.cast("agent")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `end-user`: typingsJapgolly.nodeZendesk.nodeZendeskStrings.`end-user` = this.cast("end-user")
}

