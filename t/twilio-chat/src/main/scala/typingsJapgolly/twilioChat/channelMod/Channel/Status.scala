package typingsJapgolly.twilioChat.channelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioChat.twilioChatStrings.unknown
  - typingsJapgolly.twilioChat.twilioChatStrings.known
  - typingsJapgolly.twilioChat.twilioChatStrings.invited
  - typingsJapgolly.twilioChat.twilioChatStrings.joined
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invited: typingsJapgolly.twilioChat.twilioChatStrings.invited = this.cast("invited")
  @scala.inline
  def joined: typingsJapgolly.twilioChat.twilioChatStrings.joined = this.cast("joined")
  @scala.inline
  def known: typingsJapgolly.twilioChat.twilioChatStrings.known = this.cast("known")
  @scala.inline
  def unknown: typingsJapgolly.twilioChat.twilioChatStrings.unknown = this.cast("unknown")
}

