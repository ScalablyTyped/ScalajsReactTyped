package typingsJapgolly.zchatBrowser

import typingsJapgolly.zchatBrowser.mod.ChatEvent.ChatEventData
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.chatDotmemberleave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type  :'chat.memberleave'} */
trait BaseChatEventDatatypechatNick extends ChatEventData {
  var display_name: String
  var nick: String
  var time_stamp: Double
  var `type`: chatDotmemberleave
}

object BaseChatEventDatatypechatNick {
  @scala.inline
  def apply(display_name: String, nick: String, time_stamp: Double, `type`: chatDotmemberleave): BaseChatEventDatatypechatNick = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechatNick]
  }
}

