package typingsJapgolly.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionConfiguration extends js.Object {
  /**
    * The policy to use for the child workflow executions if this workflow execution is terminated, by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy = js.native
  /**
    * The total duration for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var executionStartToCloseTimeout: DurationInSeconds = js.native
  /**
    * The IAM role attached to the child workflow execution.
    */
  var lambdaRole: js.UndefOr[Arn] = js.native
  /**
    * The task list used for the decision tasks generated for this workflow execution.
    */
  var taskList: TaskList = js.native
  /**
    * The priority assigned to decision tasks for this workflow execution. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.native
  /**
    * The maximum duration allowed for decision tasks for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var taskStartToCloseTimeout: DurationInSeconds = js.native
}

object WorkflowExecutionConfiguration {
  @scala.inline
  def apply(
    childPolicy: ChildPolicy,
    executionStartToCloseTimeout: DurationInSeconds,
    taskList: TaskList,
    taskStartToCloseTimeout: DurationInSeconds,
    lambdaRole: Arn = null,
    taskPriority: TaskPriority = null
  ): WorkflowExecutionConfiguration = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], executionStartToCloseTimeout = executionStartToCloseTimeout.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any], taskStartToCloseTimeout = taskStartToCloseTimeout.asInstanceOf[js.Any])
    if (lambdaRole != null) __obj.updateDynamic("lambdaRole")(lambdaRole.asInstanceOf[js.Any])
    if (taskPriority != null) __obj.updateDynamic("taskPriority")(taskPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionConfiguration]
  }
}

