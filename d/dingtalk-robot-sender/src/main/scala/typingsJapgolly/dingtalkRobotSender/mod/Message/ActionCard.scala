package typingsJapgolly.dingtalkRobotSender.mod.Message

import typingsJapgolly.dingtalkRobotSender.AnonBtnOrientation
import typingsJapgolly.dingtalkRobotSender.dingtalkRobotSenderStrings.actionCard
import typingsJapgolly.dingtalkRobotSender.mod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCard extends MessageType {
  var actionCard: AnonBtnOrientation
  var msgtype: actionCard
}

object ActionCard {
  @scala.inline
  def apply(actionCard: AnonBtnOrientation, msgtype: actionCard): ActionCard = {
    val __obj = js.Dynamic.literal(actionCard = actionCard.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionCard]
  }
}

