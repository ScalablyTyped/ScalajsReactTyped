package typingsJapgolly.nodeTelegramBotApi.mod

import typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.all_chat_administrators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotCommandScopeAllChatAdministrators
  extends StObject
     with BotCommandScope {
  
  var `type`: all_chat_administrators
}
object BotCommandScopeAllChatAdministrators {
  
  inline def apply(): BotCommandScopeAllChatAdministrators = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("all_chat_administrators")
    __obj.asInstanceOf[BotCommandScopeAllChatAdministrators]
  }
  
  extension [Self <: BotCommandScopeAllChatAdministrators](x: Self) {
    
    inline def setType(value: all_chat_administrators): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
