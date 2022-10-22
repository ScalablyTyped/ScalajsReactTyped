package typingsJapgolly.nodeTelegramBotApi.mod

import typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.chat_administrators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotCommandScopeChatAdministrators
  extends StObject
     with BotCommandScope {
  
  var chat_id: ChatId
  
  var `type`: chat_administrators
}
object BotCommandScopeChatAdministrators {
  
  inline def apply(chat_id: ChatId): BotCommandScopeChatAdministrators = {
    val __obj = js.Dynamic.literal(chat_id = chat_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat_administrators")
    __obj.asInstanceOf[BotCommandScopeChatAdministrators]
  }
  
  extension [Self <: BotCommandScopeChatAdministrators](x: Self) {
    
    inline def setChat_id(value: ChatId): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
    inline def setType(value: chat_administrators): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
