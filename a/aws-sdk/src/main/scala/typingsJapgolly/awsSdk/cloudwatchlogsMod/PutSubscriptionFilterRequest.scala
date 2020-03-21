package typingsJapgolly.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSubscriptionFilterRequest extends js.Object {
  /**
    * The ARN of the destination to deliver matching log events to. Currently, the supported destinations are:   An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.   A logical destination (specified using an ARN) belonging to a different account, for cross-account delivery.   An Amazon Kinesis Firehose delivery stream belonging to the same account as the subscription filter, for same-account delivery.   An AWS Lambda function belonging to the same account as the subscription filter, for same-account delivery.  
    */
  var destinationArn: DestinationArn = js.native
  /**
    * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. 
    */
  var distribution: js.UndefOr[Distribution] = js.native
  /**
    * A name for the subscription filter. If you are updating an existing filter, you must specify the correct name in filterName. Otherwise, the call fails because you cannot associate a second filter with a log group. To find the name of the filter currently associated with a log group, use DescribeSubscriptionFilters.
    */
  var filterName: FilterName = js.native
  /**
    * A filter pattern for subscribing to a filtered stream of log events.
    */
  var filterPattern: FilterPattern = js.native
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
  /**
    * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events to the destination stream. You don't need to provide the ARN when you are working with a logical destination for cross-account delivery.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object PutSubscriptionFilterRequest {
  @scala.inline
  def apply(
    destinationArn: DestinationArn,
    filterName: FilterName,
    filterPattern: FilterPattern,
    logGroupName: LogGroupName,
    distribution: Distribution = null,
    roleArn: RoleArn = null
  ): PutSubscriptionFilterRequest = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], filterName = filterName.asInstanceOf[js.Any], filterPattern = filterPattern.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any])
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSubscriptionFilterRequest]
  }
}

