package typingsJapgolly.pulumiAws.logSubscriptionFilterMod

import typingsJapgolly.pulumiAws.logGroupMod.LogGroup
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogSubscriptionFilterState extends js.Object {
  /**
    * The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
    */
  val destinationArn: js.UndefOr[Input[String]] = js.native
  /**
    * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are "Random" and "ByLogStream".
    */
  val distribution: js.UndefOr[Input[String]] = js.native
  /**
    * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events.
    */
  val filterPattern: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the log group to associate the subscription filter with
    */
  val logGroup: js.UndefOr[Input[LogGroup]] = js.native
  /**
    * A name for the subscription filter
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws.lambda.Permission` resource for granting access from CloudWatch logs to the destination Lambda function.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}

object LogSubscriptionFilterState {
  @scala.inline
  def apply(
    destinationArn: Input[String] = null,
    distribution: Input[String] = null,
    filterPattern: Input[String] = null,
    logGroup: Input[LogGroup] = null,
    name: Input[String] = null,
    roleArn: Input[String] = null
  ): LogSubscriptionFilterState = {
    val __obj = js.Dynamic.literal()
    if (destinationArn != null) __obj.updateDynamic("destinationArn")(destinationArn.asInstanceOf[js.Any])
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (filterPattern != null) __obj.updateDynamic("filterPattern")(filterPattern.asInstanceOf[js.Any])
    if (logGroup != null) __obj.updateDynamic("logGroup")(logGroup.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogSubscriptionFilterState]
  }
}

