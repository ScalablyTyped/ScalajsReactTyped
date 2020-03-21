package typingsJapgolly.twilioChat.channelsMod.Channels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioChat.twilioChatStrings.sync
  - typingsJapgolly.twilioChat.twilioChatStrings.chat
  - typingsJapgolly.twilioChat.twilioChatStrings.synclist
*/
trait DataSource extends js.Object

object DataSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chat: typingsJapgolly.twilioChat.twilioChatStrings.chat = this.cast("chat")
  @scala.inline
  def sync: typingsJapgolly.twilioChat.twilioChatStrings.sync = this.cast("sync")
  @scala.inline
  def synclist: typingsJapgolly.twilioChat.twilioChatStrings.synclist = this.cast("synclist")
}

