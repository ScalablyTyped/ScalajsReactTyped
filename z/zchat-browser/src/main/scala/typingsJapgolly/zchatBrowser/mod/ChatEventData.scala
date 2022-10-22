package typingsJapgolly.zchatBrowser.mod

import typingsJapgolly.zchatBrowser.mod.StructuredMessage.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.zchatBrowser.mod.ChatMsgChatEventData
  - typingsJapgolly.zchatBrowser.mod.ChatFileChatEventData
  - typingsJapgolly.zchatBrowser.mod.ChatQueuePositionChatEventData
  - typingsJapgolly.zchatBrowser.mod.ChatMemberJoinChatEventData
  - typingsJapgolly.zchatBrowser.mod.ChatMemberLeaveChatEventData
  - typingsJapgolly.zchatBrowser.mod.ChatRequestRatingChatEventData
  - typingsJapgolly.zchatBrowser.mod.ChatCommentChatEventData
  - typingsJapgolly.zchatBrowser.mod.TypingChatEventData
  - typingsJapgolly.zchatBrowser.mod.LastReadChatEventData
*/
trait ChatEventData extends StObject
object ChatEventData {
  
  inline def ChatCommentChatEventData(display_name: String, nick: String, timestamp: Double): typingsJapgolly.zchatBrowser.mod.ChatCommentChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.comment")
    __obj.asInstanceOf[typingsJapgolly.zchatBrowser.mod.ChatCommentChatEventData]
  }
  
  inline def ChatFileChatEventData(attachment: Attachment, deleted: Boolean, display_name: String, nick: String, timestamp: Double): typingsJapgolly.zchatBrowser.mod.ChatFileChatEventData = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.file")
    __obj.asInstanceOf[typingsJapgolly.zchatBrowser.mod.ChatFileChatEventData]
  }
  
  inline def ChatMemberJoinChatEventData(display_name: String, nick: String, timestamp: Double): typingsJapgolly.zchatBrowser.mod.ChatMemberJoinChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.memberjoin")
    __obj.asInstanceOf[typingsJapgolly.zchatBrowser.mod.ChatMemberJoinChatEventData]
  }
  
  inline def ChatMemberLeaveChatEventData(display_name: String, nick: String, timestamp: Double): typingsJapgolly.zchatBrowser.mod.ChatMemberLeaveChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.memberleave")
    __obj.asInstanceOf[typingsJapgolly.zchatBrowser.mod.ChatMemberLeaveChatEventData]
  }
  
  inline def ChatMsgChatEventData(
    display_name: String,
    msg: String,
    nick: String,
    options: js.Array[String],
    structured_msg: Message,
    timestamp: Double
  ): typingsJapgolly.zchatBrowser.mod.ChatMsgChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], structured_msg = structured_msg.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.msg")
    __obj.asInstanceOf[typingsJapgolly.zchatBrowser.mod.ChatMsgChatEventData]
  }
  
  inline def ChatQueuePositionChatEventData(nick: String, queue_position: Double): typingsJapgolly.zchatBrowser.mod.ChatQueuePositionChatEventData = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], queue_position = queue_position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.queue_position")
    __obj.asInstanceOf[typingsJapgolly.zchatBrowser.mod.ChatQueuePositionChatEventData]
  }
  
  inline def ChatRequestRatingChatEventData(display_name: String, nick: String, timestamp: Double): typingsJapgolly.zchatBrowser.mod.ChatRequestRatingChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.request.rating")
    __obj.asInstanceOf[typingsJapgolly.zchatBrowser.mod.ChatRequestRatingChatEventData]
  }
  
  inline def LastReadChatEventData(nick: String, timestamp: Double): typingsJapgolly.zchatBrowser.mod.LastReadChatEventData = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("last_read")
    __obj.asInstanceOf[typingsJapgolly.zchatBrowser.mod.LastReadChatEventData]
  }
  
  inline def TypingChatEventData(nick: String, typing: Boolean): typingsJapgolly.zchatBrowser.mod.TypingChatEventData = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("typing")
    __obj.asInstanceOf[typingsJapgolly.zchatBrowser.mod.TypingChatEventData]
  }
}
