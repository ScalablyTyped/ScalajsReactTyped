package typingsJapgolly.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.creator
  - typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.administrator
  - typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.member
  - typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.restricted
  - typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.left
  - typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.kicked
*/
trait ChatMemberStatus extends js.Object

object ChatMemberStatus {
  @scala.inline
  def administrator: typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.administrator = this.cast("administrator")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def creator: typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.creator = this.cast("creator")
  @scala.inline
  def kicked: typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.kicked = this.cast("kicked")
  @scala.inline
  def left: typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.left = this.cast("left")
  @scala.inline
  def member: typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.member = this.cast("member")
  @scala.inline
  def restricted: typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.restricted = this.cast("restricted")
}

