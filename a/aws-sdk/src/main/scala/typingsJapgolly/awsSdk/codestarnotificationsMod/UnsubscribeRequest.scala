package typingsJapgolly.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsubscribeRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: NotificationRuleArn = js.native
  /**
    * The ARN of the SNS topic to unsubscribe from the notification rule.
    */
  var TargetAddress: typingsJapgolly.awsSdk.codestarnotificationsMod.TargetAddress = js.native
}

object UnsubscribeRequest {
  @scala.inline
  def apply(Arn: NotificationRuleArn, TargetAddress: TargetAddress): UnsubscribeRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], TargetAddress = TargetAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnsubscribeRequest]
  }
}

