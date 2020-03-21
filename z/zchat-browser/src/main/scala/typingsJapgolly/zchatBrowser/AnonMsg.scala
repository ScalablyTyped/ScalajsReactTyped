package typingsJapgolly.zchatBrowser

import typingsJapgolly.zchatBrowser.mod.ChatEvent.Button
import typingsJapgolly.zchatBrowser.mod.ChatEvent.StructuredMessage
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.QUICK_REPLIES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMsg extends StructuredMessage {
  var msg: String
  var quick_replies: js.Array[Button]
  var `type`: QUICK_REPLIES
}

object AnonMsg {
  @scala.inline
  def apply(msg: String, quick_replies: js.Array[Button], `type`: QUICK_REPLIES): AnonMsg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], quick_replies = quick_replies.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMsg]
  }
}

