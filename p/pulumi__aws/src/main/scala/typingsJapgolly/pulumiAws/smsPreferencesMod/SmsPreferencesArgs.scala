package typingsJapgolly.pulumiAws.smsPreferencesMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmsPreferencesArgs extends js.Object {
  /**
    * A string, such as your business brand, that is displayed as the sender on the receiving device.
    */
  val defaultSenderId: js.UndefOr[Input[String]] = js.native
  /**
    * The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
    */
  val defaultSmsType: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
    */
  val deliveryStatusIamRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
    */
  val deliveryStatusSuccessSamplingRate: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum amount in USD that you are willing to spend each month to send SMS messages.
    */
  val monthlySpendLimit: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
    */
  val usageReportS3Bucket: js.UndefOr[Input[String]] = js.native
}

object SmsPreferencesArgs {
  @scala.inline
  def apply(
    defaultSenderId: Input[String] = null,
    defaultSmsType: Input[String] = null,
    deliveryStatusIamRoleArn: Input[String] = null,
    deliveryStatusSuccessSamplingRate: Input[String] = null,
    monthlySpendLimit: Input[String] = null,
    usageReportS3Bucket: Input[String] = null
  ): SmsPreferencesArgs = {
    val __obj = js.Dynamic.literal()
    if (defaultSenderId != null) __obj.updateDynamic("defaultSenderId")(defaultSenderId.asInstanceOf[js.Any])
    if (defaultSmsType != null) __obj.updateDynamic("defaultSmsType")(defaultSmsType.asInstanceOf[js.Any])
    if (deliveryStatusIamRoleArn != null) __obj.updateDynamic("deliveryStatusIamRoleArn")(deliveryStatusIamRoleArn.asInstanceOf[js.Any])
    if (deliveryStatusSuccessSamplingRate != null) __obj.updateDynamic("deliveryStatusSuccessSamplingRate")(deliveryStatusSuccessSamplingRate.asInstanceOf[js.Any])
    if (monthlySpendLimit != null) __obj.updateDynamic("monthlySpendLimit")(monthlySpendLimit.asInstanceOf[js.Any])
    if (usageReportS3Bucket != null) __obj.updateDynamic("usageReportS3Bucket")(usageReportS3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsPreferencesArgs]
  }
}

