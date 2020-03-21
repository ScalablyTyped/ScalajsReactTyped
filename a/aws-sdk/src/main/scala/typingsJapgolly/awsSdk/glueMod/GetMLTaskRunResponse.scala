package typingsJapgolly.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMLTaskRunResponse extends js.Object {
  /**
    * The date and time when this task run was completed.
    */
  var CompletedOn: js.UndefOr[js.Date] = js.native
  /**
    * The error strings that are associated with the task run.
    */
  var ErrorString: js.UndefOr[GenericString] = js.native
  /**
    * The amount of time (in seconds) that the task run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typingsJapgolly.awsSdk.glueMod.ExecutionTime] = js.native
  /**
    * The date and time when this task run was last modified.
    */
  var LastModifiedOn: js.UndefOr[js.Date] = js.native
  /**
    * The names of the log groups that are associated with the task run.
    */
  var LogGroupName: js.UndefOr[GenericString] = js.native
  /**
    * The list of properties that are associated with the task run.
    */
  var Properties: js.UndefOr[TaskRunProperties] = js.native
  /**
    * The date and time when this task run started.
    */
  var StartedOn: js.UndefOr[js.Date] = js.native
  /**
    * The status for this task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.native
  /**
    * The unique run identifier associated with this run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
  /**
    * The unique identifier of the task run.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}

object GetMLTaskRunResponse {
  @scala.inline
  def apply(
    CompletedOn: js.Date = null,
    ErrorString: GenericString = null,
    ExecutionTime: Int | Double = null,
    LastModifiedOn: js.Date = null,
    LogGroupName: GenericString = null,
    Properties: TaskRunProperties = null,
    StartedOn: js.Date = null,
    Status: TaskStatusType = null,
    TaskRunId: HashString = null,
    TransformId: HashString = null
  ): GetMLTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    if (CompletedOn != null) __obj.updateDynamic("CompletedOn")(CompletedOn.asInstanceOf[js.Any])
    if (ErrorString != null) __obj.updateDynamic("ErrorString")(ErrorString.asInstanceOf[js.Any])
    if (ExecutionTime != null) __obj.updateDynamic("ExecutionTime")(ExecutionTime.asInstanceOf[js.Any])
    if (LastModifiedOn != null) __obj.updateDynamic("LastModifiedOn")(LastModifiedOn.asInstanceOf[js.Any])
    if (LogGroupName != null) __obj.updateDynamic("LogGroupName")(LogGroupName.asInstanceOf[js.Any])
    if (Properties != null) __obj.updateDynamic("Properties")(Properties.asInstanceOf[js.Any])
    if (StartedOn != null) __obj.updateDynamic("StartedOn")(StartedOn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskRunId != null) __obj.updateDynamic("TaskRunId")(TaskRunId.asInstanceOf[js.Any])
    if (TransformId != null) __obj.updateDynamic("TransformId")(TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTaskRunResponse]
  }
}

