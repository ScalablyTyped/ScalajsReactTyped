package typingsJapgolly.twilioChat.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioChat.twilioChatStrings.lastMessage
  - typingsJapgolly.twilioChat.twilioChatStrings.friendlyName
  - typingsJapgolly.twilioChat.twilioChatStrings.uniqueName
*/
trait ChannelSortingCriteria extends js.Object

object ChannelSortingCriteria {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def friendlyName: typingsJapgolly.twilioChat.twilioChatStrings.friendlyName = this.cast("friendlyName")
  @scala.inline
  def lastMessage: typingsJapgolly.twilioChat.twilioChatStrings.lastMessage = this.cast("lastMessage")
  @scala.inline
  def uniqueName: typingsJapgolly.twilioChat.twilioChatStrings.uniqueName = this.cast("uniqueName")
}

