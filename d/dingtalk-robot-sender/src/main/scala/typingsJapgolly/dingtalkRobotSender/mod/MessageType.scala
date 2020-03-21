package typingsJapgolly.dingtalkRobotSender.mod

import typingsJapgolly.dingtalkRobotSender.AnonAtMobiles
import typingsJapgolly.dingtalkRobotSender.AnonBtnOrientation
import typingsJapgolly.dingtalkRobotSender.AnonContent
import typingsJapgolly.dingtalkRobotSender.AnonIsAtAll
import typingsJapgolly.dingtalkRobotSender.AnonMessageURL_
import typingsJapgolly.dingtalkRobotSender.AnonMessageUrl
import typingsJapgolly.dingtalkRobotSender.dingtalkRobotSenderStrings.actionCard
import typingsJapgolly.dingtalkRobotSender.dingtalkRobotSenderStrings.feedCard
import typingsJapgolly.dingtalkRobotSender.dingtalkRobotSenderStrings.link
import typingsJapgolly.dingtalkRobotSender.dingtalkRobotSenderStrings.markdown
import typingsJapgolly.dingtalkRobotSender.dingtalkRobotSenderStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dingtalkRobotSender.mod.Message.Text
  - typingsJapgolly.dingtalkRobotSender.mod.Message.Link
  - typingsJapgolly.dingtalkRobotSender.mod.Message.Markdown
  - typingsJapgolly.dingtalkRobotSender.mod.Message.ActionCard
  - typingsJapgolly.dingtalkRobotSender.mod.Message.FeedCardItem
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  def ActionCard(actionCard: AnonBtnOrientation, msgtype: actionCard): MessageType = {
    val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Link(link: AnonMessageUrl, msgtype: link): MessageType = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def FeedCardItem(feedCard: AnonMessageURL_, msgtype: feedCard): MessageType = {
    val __obj = js.Dynamic.literal(feedCard = feedCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Text(msgtype: text, text: AnonContent, at: AnonAtMobiles = null): MessageType = {
    val __obj = js.Dynamic.literal(msgtype = msgtype.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  def Markdown(markdown: AnonIsAtAll, msgtype: markdown): MessageType = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
}

