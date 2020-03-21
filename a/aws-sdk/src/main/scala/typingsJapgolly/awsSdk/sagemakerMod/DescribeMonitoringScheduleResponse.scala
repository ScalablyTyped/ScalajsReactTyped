package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMonitoringScheduleResponse extends js.Object {
  /**
    * The time at which the monitoring job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    *  The name of the endpoint for the monitoring job.
    */
  var EndpointName: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.EndpointName] = js.native
  /**
    * A string, up to one KB in size, that contains the reason a monitoring job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The time at which the monitoring job was last modified.
    */
  var LastModifiedTime: js.Date = js.native
  /**
    * Describes metadata on the last execution to run, if there was one.
    */
  var LastMonitoringExecutionSummary: js.UndefOr[MonitoringExecutionSummary] = js.native
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: typingsJapgolly.awsSdk.sagemakerMod.MonitoringScheduleArn = js.native
  /**
    * The configuration object that specifies the monitoring schedule and defines the monitoring job.
    */
  var MonitoringScheduleConfig: typingsJapgolly.awsSdk.sagemakerMod.MonitoringScheduleConfig = js.native
  /**
    * Name of the monitoring schedule.
    */
  var MonitoringScheduleName: typingsJapgolly.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
  /**
    * The status of an monitoring job.
    */
  var MonitoringScheduleStatus: ScheduleStatus = js.native
}

object DescribeMonitoringScheduleResponse {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    MonitoringScheduleArn: MonitoringScheduleArn,
    MonitoringScheduleConfig: MonitoringScheduleConfig,
    MonitoringScheduleName: MonitoringScheduleName,
    MonitoringScheduleStatus: ScheduleStatus,
    EndpointName: EndpointName = null,
    FailureReason: FailureReason = null,
    LastMonitoringExecutionSummary: MonitoringExecutionSummary = null
  ): DescribeMonitoringScheduleResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any], MonitoringScheduleConfig = MonitoringScheduleConfig.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any], MonitoringScheduleStatus = MonitoringScheduleStatus.asInstanceOf[js.Any])
    if (EndpointName != null) __obj.updateDynamic("EndpointName")(EndpointName.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LastMonitoringExecutionSummary != null) __obj.updateDynamic("LastMonitoringExecutionSummary")(LastMonitoringExecutionSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMonitoringScheduleResponse]
  }
}

