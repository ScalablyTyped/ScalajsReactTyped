package typingsJapgolly.twilioChat.channelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioChat.twilioChatStrings.default
  - typingsJapgolly.twilioChat.twilioChatStrings.muted
*/
trait NotificationLevel extends js.Object

object NotificationLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.twilioChat.twilioChatStrings.default = this.cast("default")
  @scala.inline
  def muted: typingsJapgolly.twilioChat.twilioChatStrings.muted = this.cast("muted")
}

