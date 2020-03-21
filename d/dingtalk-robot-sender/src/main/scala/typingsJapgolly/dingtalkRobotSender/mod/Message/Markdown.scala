package typingsJapgolly.dingtalkRobotSender.mod.Message

import typingsJapgolly.dingtalkRobotSender.AnonIsAtAll
import typingsJapgolly.dingtalkRobotSender.dingtalkRobotSenderStrings.markdown
import typingsJapgolly.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Markdown extends MessageType {
  var markdown: AnonIsAtAll
  var msgtype: markdown
}

object Markdown {
  @scala.inline
  def apply(markdown: AnonIsAtAll, msgtype: markdown): Markdown = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Markdown]
  }
}

