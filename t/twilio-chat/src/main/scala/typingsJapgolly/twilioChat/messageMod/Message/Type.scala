package typingsJapgolly.twilioChat.messageMod.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioChat.twilioChatStrings.text
  - typingsJapgolly.twilioChat.twilioChatStrings.media
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def media: typingsJapgolly.twilioChat.twilioChatStrings.media = this.cast("media")
  @scala.inline
  def text: typingsJapgolly.twilioChat.twilioChatStrings.text = this.cast("text")
}

