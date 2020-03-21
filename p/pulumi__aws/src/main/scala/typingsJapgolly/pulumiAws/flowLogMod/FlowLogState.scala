package typingsJapgolly.pulumiAws.flowLogMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowLogState extends js.Object {
  /**
    * Elastic Network Interface ID to attach to
    */
  val eniId: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
    */
  val iamRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the logging destination.
    */
  val logDestination: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
    */
  val logDestinationType: js.UndefOr[Input[String]] = js.native
  /**
    * The fields to include in the flow log record, in the order in which they should appear.
    */
  val logFormat: js.UndefOr[Input[String]] = js.native
  /**
    * *Deprecated:* Use `logDestination` instead. The name of the CloudWatch log group.
    */
  val logGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * Subnet ID to attach to
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
    */
  val trafficType: js.UndefOr[Input[String]] = js.native
  /**
    * VPC ID to attach to
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object FlowLogState {
  @scala.inline
  def apply(
    eniId: Input[String] = null,
    iamRoleArn: Input[String] = null,
    logDestination: Input[String] = null,
    logDestinationType: Input[String] = null,
    logFormat: Input[String] = null,
    logGroupName: Input[String] = null,
    subnetId: Input[String] = null,
    trafficType: Input[String] = null,
    vpcId: Input[String] = null
  ): FlowLogState = {
    val __obj = js.Dynamic.literal()
    if (eniId != null) __obj.updateDynamic("eniId")(eniId.asInstanceOf[js.Any])
    if (iamRoleArn != null) __obj.updateDynamic("iamRoleArn")(iamRoleArn.asInstanceOf[js.Any])
    if (logDestination != null) __obj.updateDynamic("logDestination")(logDestination.asInstanceOf[js.Any])
    if (logDestinationType != null) __obj.updateDynamic("logDestinationType")(logDestinationType.asInstanceOf[js.Any])
    if (logFormat != null) __obj.updateDynamic("logFormat")(logFormat.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (trafficType != null) __obj.updateDynamic("trafficType")(trafficType.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLogState]
  }
}

