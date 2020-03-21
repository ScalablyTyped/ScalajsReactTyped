package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringExecutionSummary extends js.Object {
  /**
    * The time at which the monitoring job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The name of teh endpoint used to run the monitoring job.
    */
  var EndpointName: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.EndpointName] = js.native
  /**
    * Contains the reason a monitoring job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * A timestamp that indicates the last time the monitoring job was modified.
    */
  var LastModifiedTime: js.Date = js.native
  /**
    * The status of the monitoring job.
    */
  var MonitoringExecutionStatus: ExecutionStatus = js.native
  /**
    * The name of the monitoring schedule.
    */
  var MonitoringScheduleName: typingsJapgolly.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
  /**
    * The Amazon Resource Name (ARN) of the monitoring job.
    */
  var ProcessingJobArn: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.ProcessingJobArn] = js.native
  /**
    * The time the monitoring job was scheduled.
    */
  var ScheduledTime: js.Date = js.native
}

object MonitoringExecutionSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    MonitoringExecutionStatus: ExecutionStatus,
    MonitoringScheduleName: MonitoringScheduleName,
    ScheduledTime: js.Date,
    EndpointName: EndpointName = null,
    FailureReason: FailureReason = null,
    ProcessingJobArn: ProcessingJobArn = null
  ): MonitoringExecutionSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], MonitoringExecutionStatus = MonitoringExecutionStatus.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any], ScheduledTime = ScheduledTime.asInstanceOf[js.Any])
    if (EndpointName != null) __obj.updateDynamic("EndpointName")(EndpointName.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (ProcessingJobArn != null) __obj.updateDynamic("ProcessingJobArn")(ProcessingJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringExecutionSummary]
  }
}

