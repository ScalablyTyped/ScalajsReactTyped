package typingsJapgolly.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeDefault
  - typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeAllPrivateChats
  - typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeAllGroupChats
  - typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeAllChatAdministrators
  - typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeChat
  - typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeChatAdministrators
  - typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeChatMember
*/
trait BotCommandScope extends StObject
object BotCommandScope {
  
  inline def BotCommandScopeAllChatAdministrators(): typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeAllChatAdministrators = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("all_chat_administrators")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeAllChatAdministrators]
  }
  
  inline def BotCommandScopeAllGroupChats(): typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeAllGroupChats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("all_group_chats")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeAllGroupChats]
  }
  
  inline def BotCommandScopeAllPrivateChats(): typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeAllPrivateChats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("all_private_chats")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeAllPrivateChats]
  }
  
  inline def BotCommandScopeChat(chat_id: ChatId): typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeChat = {
    val __obj = js.Dynamic.literal(chat_id = chat_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeChat]
  }
  
  inline def BotCommandScopeChatAdministrators(chat_id: ChatId): typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeChatAdministrators = {
    val __obj = js.Dynamic.literal(chat_id = chat_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat_administrators")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeChatAdministrators]
  }
  
  inline def BotCommandScopeChatMember(chat_id: ChatId, user_id: Double): typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeChatMember = {
    val __obj = js.Dynamic.literal(chat_id = chat_id.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat_member")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeChatMember]
  }
  
  inline def BotCommandScopeDefault(): typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("default")
    __obj.asInstanceOf[typingsJapgolly.nodeTelegramBotApi.mod.BotCommandScopeDefault]
  }
}
