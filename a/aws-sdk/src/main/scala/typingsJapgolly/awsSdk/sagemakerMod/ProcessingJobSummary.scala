package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingJobSummary extends js.Object {
  /**
    * The time at which the processing job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * An optional string, up to one KB in size, that contains metadata from the processing container when the processing job exits.
    */
  var ExitMessage: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.ExitMessage] = js.native
  /**
    * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * A timestamp that indicates the last time the processing job was modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The time at which the processing job completed.
    */
  var ProcessingEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the processing job..
    */
  var ProcessingJobArn: typingsJapgolly.awsSdk.sagemakerMod.ProcessingJobArn = js.native
  /**
    * The name of the processing job.
    */
  var ProcessingJobName: typingsJapgolly.awsSdk.sagemakerMod.ProcessingJobName = js.native
  /**
    * The status of the processing job.
    */
  var ProcessingJobStatus: typingsJapgolly.awsSdk.sagemakerMod.ProcessingJobStatus = js.native
}

object ProcessingJobSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    ProcessingJobArn: ProcessingJobArn,
    ProcessingJobName: ProcessingJobName,
    ProcessingJobStatus: ProcessingJobStatus,
    ExitMessage: ExitMessage = null,
    FailureReason: FailureReason = null,
    LastModifiedTime: js.Date = null,
    ProcessingEndTime: js.Date = null
  ): ProcessingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ProcessingJobArn = ProcessingJobArn.asInstanceOf[js.Any], ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any], ProcessingJobStatus = ProcessingJobStatus.asInstanceOf[js.Any])
    if (ExitMessage != null) __obj.updateDynamic("ExitMessage")(ExitMessage.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (ProcessingEndTime != null) __obj.updateDynamic("ProcessingEndTime")(ProcessingEndTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingJobSummary]
  }
}

