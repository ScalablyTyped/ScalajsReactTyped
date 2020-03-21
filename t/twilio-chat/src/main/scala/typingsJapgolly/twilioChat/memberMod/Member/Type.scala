package typingsJapgolly.twilioChat.memberMod.Member

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioChat.twilioChatStrings.chat
  - typingsJapgolly.twilioChat.twilioChatStrings.sms
  - typingsJapgolly.twilioChat.twilioChatStrings.whatsapp
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chat: typingsJapgolly.twilioChat.twilioChatStrings.chat = this.cast("chat")
  @scala.inline
  def sms: typingsJapgolly.twilioChat.twilioChatStrings.sms = this.cast("sms")
  @scala.inline
  def whatsapp: typingsJapgolly.twilioChat.twilioChatStrings.whatsapp = this.cast("whatsapp")
}

