package typingsJapgolly.nodeZendesk.mod.Users.Identities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.agent_forwarding
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.email
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.facebook
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.google
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.phone_number
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.sdk
*/
trait IdentityType extends js.Object

object IdentityType {
  @scala.inline
  def agent_forwarding: typingsJapgolly.nodeZendesk.nodeZendeskStrings.agent_forwarding = this.cast("agent_forwarding")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typingsJapgolly.nodeZendesk.nodeZendeskStrings.email = this.cast("email")
  @scala.inline
  def facebook: typingsJapgolly.nodeZendesk.nodeZendeskStrings.facebook = this.cast("facebook")
  @scala.inline
  def google: typingsJapgolly.nodeZendesk.nodeZendeskStrings.google = this.cast("google")
  @scala.inline
  def phone_number: typingsJapgolly.nodeZendesk.nodeZendeskStrings.phone_number = this.cast("phone_number")
  @scala.inline
  def sdk: typingsJapgolly.nodeZendesk.nodeZendeskStrings.sdk = this.cast("sdk")
}

