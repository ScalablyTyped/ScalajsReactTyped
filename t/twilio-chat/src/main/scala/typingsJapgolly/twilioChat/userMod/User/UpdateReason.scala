package typingsJapgolly.twilioChat.userMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioChat.twilioChatStrings.friendlyName
  - typingsJapgolly.twilioChat.twilioChatStrings.attributes
  - typingsJapgolly.twilioChat.twilioChatStrings.online
  - typingsJapgolly.twilioChat.twilioChatStrings.notifiable
*/
trait UpdateReason extends js.Object

object UpdateReason {
  @scala.inline
  def attributes: typingsJapgolly.twilioChat.twilioChatStrings.attributes = this.cast("attributes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def friendlyName: typingsJapgolly.twilioChat.twilioChatStrings.friendlyName = this.cast("friendlyName")
  @scala.inline
  def notifiable: typingsJapgolly.twilioChat.twilioChatStrings.notifiable = this.cast("notifiable")
  @scala.inline
  def online: typingsJapgolly.twilioChat.twilioChatStrings.online = this.cast("online")
}

