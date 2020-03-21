package typingsJapgolly.pulumiAws.inputMod.ses

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleS3Action extends js.Object {
  /**
    * The name of the S3 bucket
    */
  var bucketName: Input[String] = js.native
  /**
    * The ARN of the KMS key
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * The key prefix of the S3 bucket
    */
  var objectKeyPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The position of the action in the receipt rule
    */
  var position: Input[Double] = js.native
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[Input[String]] = js.native
}

object ReceiptRuleS3Action {
  @scala.inline
  def apply(
    bucketName: Input[String],
    position: Input[Double],
    kmsKeyArn: Input[String] = null,
    objectKeyPrefix: Input[String] = null,
    topicArn: Input[String] = null
  ): ReceiptRuleS3Action = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (objectKeyPrefix != null) __obj.updateDynamic("objectKeyPrefix")(objectKeyPrefix.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleS3Action]
  }
}

