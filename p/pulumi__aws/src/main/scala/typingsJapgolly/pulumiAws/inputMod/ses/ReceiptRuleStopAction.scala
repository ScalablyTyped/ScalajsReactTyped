package typingsJapgolly.pulumiAws.inputMod.ses

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleStopAction extends js.Object {
  /**
    * The position of the action in the receipt rule
    */
  var position: Input[Double] = js.native
  /**
    * The scope to apply
    */
  var scope: Input[String] = js.native
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[Input[String]] = js.native
}

object ReceiptRuleStopAction {
  @scala.inline
  def apply(position: Input[Double], scope: Input[String], topicArn: Input[String] = null): ReceiptRuleStopAction = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleStopAction]
  }
}

