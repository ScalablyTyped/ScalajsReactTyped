package typingsJapgolly.nodeTelegramBotApi.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplyListener extends StObject {
  
  def callback(msg: Message): Unit
  
  var chatId: ChatId
  
  var id: Double
  
  var messageId: Double | String
}
object ReplyListener {
  
  inline def apply(callback: Message => Callback, chatId: ChatId, id: Double, messageId: Double | String): ReplyListener = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: Message) => callback(t0).runNow()), chatId = chatId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyListener]
  }
  
  extension [Self <: ReplyListener](x: Self) {
    
    inline def setCallback(value: Message => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: Message) => value(t0).runNow()))
    
    inline def setChatId(value: ChatId): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: Double | String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
  }
}
