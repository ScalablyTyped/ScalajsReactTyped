package typingsJapgolly.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterWorkflowTypeInput extends js.Object {
  /**
    * If set, specifies the default policy to use for the child workflow executions when a workflow execution of this type is terminated, by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. This default can be overridden when starting a workflow execution using the StartWorkflowExecution action or the StartChildWorkflowExecution Decision. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var defaultChildPolicy: js.UndefOr[ChildPolicy] = js.native
  /**
    * If set, specifies the default maximum duration for executions of this workflow type. You can override this default when starting an execution through the StartWorkflowExecution Action or StartChildWorkflowExecution Decision. The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other timeout parameters in Amazon SWF, you cannot specify a value of "NONE" for defaultExecutionStartToCloseTimeout; there is a one-year max limit on the time that a workflow execution can run. Exceeding this limit always causes the workflow execution to time out.
    */
  var defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The default IAM role attached to this workflow type.  Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't specify an IAM role when you start this workflow type, the default Lambda role is attached to the execution. For more information, see https://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html in the Amazon SWF Developer Guide. 
    */
  var defaultLambdaRole: js.UndefOr[Arn] = js.native
  /**
    * If set, specifies the default task list to use for scheduling decision tasks for executions of this workflow type. This default is used only if a task list isn't provided when starting the execution through the StartWorkflowExecution Action or StartChildWorkflowExecution Decision.
    */
  var defaultTaskList: js.UndefOr[TaskList] = js.native
  /**
    * The default task priority to assign to the workflow type. If not assigned, then 0 is used. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var defaultTaskPriority: js.UndefOr[TaskPriority] = js.native
  /**
    * If set, specifies the default maximum duration of decision tasks for this workflow type. This default can be overridden when starting a workflow execution using the StartWorkflowExecution action or the StartChildWorkflowExecution Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * Textual description of the workflow type.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The name of the domain in which to register the workflow type.
    */
  var domain: DomainName = js.native
  /**
    * The name of the workflow type. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not be the literal string arn.
    */
  var name: Name = js.native
  /**
    * The version of the workflow type.  The workflow type consists of the name and version, the combination of which must be unique within the domain. To get a list of all currently registered workflow types, use the ListWorkflowTypes action.  The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not be the literal string arn.
    */
  var version: Version = js.native
}

object RegisterWorkflowTypeInput {
  @scala.inline
  def apply(
    domain: DomainName,
    name: Name,
    version: Version,
    defaultChildPolicy: ChildPolicy = null,
    defaultExecutionStartToCloseTimeout: DurationInSecondsOptional = null,
    defaultLambdaRole: Arn = null,
    defaultTaskList: TaskList = null,
    defaultTaskPriority: TaskPriority = null,
    defaultTaskStartToCloseTimeout: DurationInSecondsOptional = null,
    description: Description = null
  ): RegisterWorkflowTypeInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (defaultChildPolicy != null) __obj.updateDynamic("defaultChildPolicy")(defaultChildPolicy.asInstanceOf[js.Any])
    if (defaultExecutionStartToCloseTimeout != null) __obj.updateDynamic("defaultExecutionStartToCloseTimeout")(defaultExecutionStartToCloseTimeout.asInstanceOf[js.Any])
    if (defaultLambdaRole != null) __obj.updateDynamic("defaultLambdaRole")(defaultLambdaRole.asInstanceOf[js.Any])
    if (defaultTaskList != null) __obj.updateDynamic("defaultTaskList")(defaultTaskList.asInstanceOf[js.Any])
    if (defaultTaskPriority != null) __obj.updateDynamic("defaultTaskPriority")(defaultTaskPriority.asInstanceOf[js.Any])
    if (defaultTaskStartToCloseTimeout != null) __obj.updateDynamic("defaultTaskStartToCloseTimeout")(defaultTaskStartToCloseTimeout.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterWorkflowTypeInput]
  }
}

