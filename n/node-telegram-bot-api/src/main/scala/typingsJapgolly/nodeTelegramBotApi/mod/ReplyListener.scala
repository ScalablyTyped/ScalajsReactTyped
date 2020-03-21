package typingsJapgolly.nodeTelegramBotApi.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplyListener extends js.Object {
  var chatId: Double | String
  var id: Double
  var messageId: Double | String
  def callback(msg: Message): Unit
}

object ReplyListener {
  @scala.inline
  def apply(callback: Message => Callback, chatId: Double | String, id: Double, messageId: Double | String): ReplyListener = {
    val __obj = js.Dynamic.literal(chatId = chatId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: typingsJapgolly.nodeTelegramBotApi.mod.Message) => callback(t0).runNow()))
    __obj.asInstanceOf[ReplyListener]
  }
}

