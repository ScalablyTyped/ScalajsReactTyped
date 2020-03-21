package typingsJapgolly.zchatBrowser.mod.ChatEvent

import typingsJapgolly.zchatBrowser.mod.Attachment
import typingsJapgolly.zchatBrowser.mod.EventData
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.chatDotcomment
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.chatDotfile
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.chatDotmemberjoin
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.chatDotmemberleave
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.chatDotmsg
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.chatDotrating
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.chatDotrequestDotrating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.zchatBrowser.BaseChatEventDatatypechat
  - typingsJapgolly.zchatBrowser.BaseChatEventDatatypechatAttachment
  - typingsJapgolly.zchatBrowser.BaseChatEventDatatypechatDisplayname
  - typingsJapgolly.zchatBrowser.BaseChatEventDatatypechatNick
  - typingsJapgolly.zchatBrowser.BaseChatEventDatatypechatTimestamp
  - typingsJapgolly.zchatBrowser.BaseChatEventDatatypechatNewrating
  - typingsJapgolly.zchatBrowser.BaseChatEventDatatypechatComment
*/
trait ChatEventData extends EventData

object ChatEventData {
  @scala.inline
  def BaseChatEventDatatypechatDisplayname(display_name: String, nick: String, time_stamp: Double, `type`: chatDotmemberjoin): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechat(
    display_name: String,
    msg: String,
    nick: String,
    options: js.Array[String],
    structured_msg: StructuredMessage,
    time_stamp: Double,
    `type`: chatDotmsg
  ): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], structured_msg = structured_msg.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatTimestamp(display_name: String, nick: String, time_stamp: Double, `type`: chatDotrequestDotrating): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatNick(display_name: String, nick: String, time_stamp: Double, `type`: chatDotmemberleave): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatAttachment(
    attachment: Attachment,
    deleted: Boolean,
    display_name: String,
    nick: String,
    time_stamp: Double,
    `type`: chatDotfile
  ): ChatEventData = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatComment(
    display_name: String,
    nick: String,
    time_stamp: Double,
    `type`: chatDotcomment,
    comment: String = null,
    new_comment: String = null
  ): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (new_comment != null) __obj.updateDynamic("new_comment")(new_comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatNewrating(
    display_name: String,
    nick: String,
    time_stamp: Double,
    `type`: chatDotrating,
    new_rating: String = null,
    rating: String = null
  ): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (new_rating != null) __obj.updateDynamic("new_rating")(new_rating.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
}

