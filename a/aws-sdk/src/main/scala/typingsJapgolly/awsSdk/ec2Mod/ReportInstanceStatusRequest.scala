package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportInstanceStatusRequest extends js.Object {
  /**
    * Descriptive text about the health state of your instance.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The time at which the reported instance health state ended.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The instances.
    */
  var Instances: InstanceIdStringList = js.native
  /**
    * The reason codes that describe the health state of your instance.    instance-stuck-in-state: My instance is stuck in a state.    unresponsive: My instance is unresponsive.    not-accepting-credentials: My instance is not accepting my credentials.    password-not-available: A password is not available for my instance.    performance-network: My instance is experiencing performance problems that I believe are network related.    performance-instance-store: My instance is experiencing performance problems that I believe are related to the instance stores.    performance-ebs-volume: My instance is experiencing performance problems that I believe are related to an EBS volume.    performance-other: My instance is experiencing performance problems.    other: [explain using the description parameter]  
    */
  var ReasonCodes: ReasonCodesList = js.native
  /**
    * The time at which the reported instance health state began.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of all instances listed.
    */
  var Status: ReportStatusType = js.native
}

object ReportInstanceStatusRequest {
  @scala.inline
  def apply(
    Instances: InstanceIdStringList,
    ReasonCodes: ReasonCodesList,
    Status: ReportStatusType,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    EndTime: js.Date = null,
    StartTime: js.Date = null
  ): ReportInstanceStatusRequest = {
    val __obj = js.Dynamic.literal(Instances = Instances.asInstanceOf[js.Any], ReasonCodes = ReasonCodes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportInstanceStatusRequest]
  }
}

