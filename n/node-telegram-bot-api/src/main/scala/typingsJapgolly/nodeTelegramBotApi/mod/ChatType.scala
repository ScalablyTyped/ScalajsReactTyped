package typingsJapgolly.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.`private`
  - typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.group
  - typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.supergroup
  - typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.channel
*/
trait ChatType extends js.Object

object ChatType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def channel: typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.channel = this.cast("channel")
  @scala.inline
  def group: typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.group = this.cast("group")
  @scala.inline
  def `private`: typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.`private` = this.cast("private")
  @scala.inline
  def supergroup: typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.supergroup = this.cast("supergroup")
}

