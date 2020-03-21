package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swfMod {
  type ActivityId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.START_TO_CLOSE
    - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULE_TO_START
    - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULE_TO_CLOSE
    - typingsJapgolly.awsSdk.awsSdkStrings.HEARTBEAT
    - java.lang.String
  */
  type ActivityTaskTimeoutType = typingsJapgolly.awsSdk.swfMod._ActivityTaskTimeoutType | java.lang.String
  type ActivityTypeInfoList = js.Array[typingsJapgolly.awsSdk.swfMod.ActivityTypeInfo]
  type Arn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMER_ID_UNKNOWN
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CancelTimerFailedCause = typingsJapgolly.awsSdk.swfMod._CancelTimerFailedCause | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHANDLED_DECISION
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CancelWorkflowExecutionFailedCause = typingsJapgolly.awsSdk.swfMod._CancelWorkflowExecutionFailedCause | java.lang.String
  type Canceled = scala.Boolean
  type CauseMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE
    - typingsJapgolly.awsSdk.awsSdkStrings.REQUEST_CANCEL
    - typingsJapgolly.awsSdk.awsSdkStrings.ABANDON
    - java.lang.String
  */
  type ChildPolicy = typingsJapgolly.awsSdk.swfMod._ChildPolicy | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.swfMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTINUED_AS_NEW
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
    - java.lang.String
  */
  type CloseStatus = typingsJapgolly.awsSdk.swfMod._CloseStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHANDLED_DECISION
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CompleteWorkflowExecutionFailedCause = typingsJapgolly.awsSdk.swfMod._CompleteWorkflowExecutionFailedCause | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHANDLED_DECISION
    - typingsJapgolly.awsSdk.awsSdkStrings.WORKFLOW_TYPE_DEPRECATED
    - typingsJapgolly.awsSdk.awsSdkStrings.WORKFLOW_TYPE_DOES_NOT_EXIST
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_TASK_LIST_UNDEFINED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_CHILD_POLICY_UNDEFINED
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type ContinueAsNewWorkflowExecutionFailedCause = typingsJapgolly.awsSdk.swfMod._ContinueAsNewWorkflowExecutionFailedCause | java.lang.String
  type Count = scala.Double
  type Data = java.lang.String
  type DecisionList = js.Array[typingsJapgolly.awsSdk.swfMod.Decision]
  type DecisionTaskTimeoutType = typingsJapgolly.awsSdk.awsSdkStrings.START_TO_CLOSE | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ScheduleActivityTask
    - typingsJapgolly.awsSdk.awsSdkStrings.RequestCancelActivityTask
    - typingsJapgolly.awsSdk.awsSdkStrings.CompleteWorkflowExecution
    - typingsJapgolly.awsSdk.awsSdkStrings.FailWorkflowExecution
    - typingsJapgolly.awsSdk.awsSdkStrings.CancelWorkflowExecution
    - typingsJapgolly.awsSdk.awsSdkStrings.ContinueAsNewWorkflowExecution
    - typingsJapgolly.awsSdk.awsSdkStrings.RecordMarker
    - typingsJapgolly.awsSdk.awsSdkStrings.StartTimer
    - typingsJapgolly.awsSdk.awsSdkStrings.CancelTimer
    - typingsJapgolly.awsSdk.awsSdkStrings.SignalExternalWorkflowExecution
    - typingsJapgolly.awsSdk.awsSdkStrings.RequestCancelExternalWorkflowExecution
    - typingsJapgolly.awsSdk.awsSdkStrings.StartChildWorkflowExecution
    - typingsJapgolly.awsSdk.awsSdkStrings.ScheduleLambdaFunction
    - java.lang.String
  */
  type DecisionType = typingsJapgolly.awsSdk.swfMod._DecisionType | java.lang.String
  type Description = java.lang.String
  type DomainInfoList = js.Array[typingsJapgolly.awsSdk.swfMod.DomainInfo]
  type DomainName = java.lang.String
  type DurationInDays = java.lang.String
  type DurationInSeconds = java.lang.String
  type DurationInSecondsOptional = java.lang.String
  type EventId = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WorkflowExecutionStarted
    - typingsJapgolly.awsSdk.awsSdkStrings.WorkflowExecutionCancelRequested
    - typingsJapgolly.awsSdk.awsSdkStrings.WorkflowExecutionCompleted
    - typingsJapgolly.awsSdk.awsSdkStrings.CompleteWorkflowExecutionFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.WorkflowExecutionFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.FailWorkflowExecutionFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.WorkflowExecutionTimedOut
    - typingsJapgolly.awsSdk.awsSdkStrings.WorkflowExecutionCanceled
    - typingsJapgolly.awsSdk.awsSdkStrings.CancelWorkflowExecutionFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.WorkflowExecutionContinuedAsNew
    - typingsJapgolly.awsSdk.awsSdkStrings.ContinueAsNewWorkflowExecutionFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.WorkflowExecutionTerminated
    - typingsJapgolly.awsSdk.awsSdkStrings.DecisionTaskScheduled
    - typingsJapgolly.awsSdk.awsSdkStrings.DecisionTaskStarted
    - typingsJapgolly.awsSdk.awsSdkStrings.DecisionTaskCompleted
    - typingsJapgolly.awsSdk.awsSdkStrings.DecisionTaskTimedOut
    - typingsJapgolly.awsSdk.awsSdkStrings.ActivityTaskScheduled
    - typingsJapgolly.awsSdk.awsSdkStrings.ScheduleActivityTaskFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.ActivityTaskStarted
    - typingsJapgolly.awsSdk.awsSdkStrings.ActivityTaskCompleted
    - typingsJapgolly.awsSdk.awsSdkStrings.ActivityTaskFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.ActivityTaskTimedOut
    - typingsJapgolly.awsSdk.awsSdkStrings.ActivityTaskCanceled
    - typingsJapgolly.awsSdk.awsSdkStrings.ActivityTaskCancelRequested
    - typingsJapgolly.awsSdk.awsSdkStrings.RequestCancelActivityTaskFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.WorkflowExecutionSignaled
    - typingsJapgolly.awsSdk.awsSdkStrings.MarkerRecorded
    - typingsJapgolly.awsSdk.awsSdkStrings.RecordMarkerFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.TimerStarted
    - typingsJapgolly.awsSdk.awsSdkStrings.StartTimerFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.TimerFired
    - typingsJapgolly.awsSdk.awsSdkStrings.TimerCanceled
    - typingsJapgolly.awsSdk.awsSdkStrings.CancelTimerFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.StartChildWorkflowExecutionInitiated
    - typingsJapgolly.awsSdk.awsSdkStrings.StartChildWorkflowExecutionFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.ChildWorkflowExecutionStarted
    - typingsJapgolly.awsSdk.awsSdkStrings.ChildWorkflowExecutionCompleted
    - typingsJapgolly.awsSdk.awsSdkStrings.ChildWorkflowExecutionFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.ChildWorkflowExecutionTimedOut
    - typingsJapgolly.awsSdk.awsSdkStrings.ChildWorkflowExecutionCanceled
    - typingsJapgolly.awsSdk.awsSdkStrings.ChildWorkflowExecutionTerminated
    - typingsJapgolly.awsSdk.awsSdkStrings.SignalExternalWorkflowExecutionInitiated
    - typingsJapgolly.awsSdk.awsSdkStrings.SignalExternalWorkflowExecutionFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.ExternalWorkflowExecutionSignaled
    - typingsJapgolly.awsSdk.awsSdkStrings.RequestCancelExternalWorkflowExecutionInitiated
    - typingsJapgolly.awsSdk.awsSdkStrings.RequestCancelExternalWorkflowExecutionFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.ExternalWorkflowExecutionCancelRequested
    - typingsJapgolly.awsSdk.awsSdkStrings.LambdaFunctionScheduled
    - typingsJapgolly.awsSdk.awsSdkStrings.LambdaFunctionStarted
    - typingsJapgolly.awsSdk.awsSdkStrings.LambdaFunctionCompleted
    - typingsJapgolly.awsSdk.awsSdkStrings.LambdaFunctionFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.LambdaFunctionTimedOut
    - typingsJapgolly.awsSdk.awsSdkStrings.ScheduleLambdaFunctionFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.StartLambdaFunctionFailed
    - java.lang.String
  */
  type EventType = typingsJapgolly.awsSdk.swfMod._EventType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OPEN
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type ExecutionStatus = typingsJapgolly.awsSdk.swfMod._ExecutionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHANDLED_DECISION
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type FailWorkflowExecutionFailedCause = typingsJapgolly.awsSdk.swfMod._FailWorkflowExecutionFailedCause | java.lang.String
  type FailureReason = java.lang.String
  type FunctionId = java.lang.String
  type FunctionInput = java.lang.String
  type FunctionName = java.lang.String
  type HistoryEventList = js.Array[typingsJapgolly.awsSdk.swfMod.HistoryEvent]
  type Identity = java.lang.String
  type LambdaFunctionTimeoutType = typingsJapgolly.awsSdk.awsSdkStrings.START_TO_CLOSE | java.lang.String
  type LimitedData = java.lang.String
  type MarkerName = java.lang.String
  type Name = java.lang.String
  type OpenDecisionTasksCount = scala.Double
  type PageSize = scala.Double
  type PageToken = java.lang.String
  type RecordMarkerFailedCause = typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.REGISTERED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPRECATED
    - java.lang.String
  */
  type RegistrationStatus = typingsJapgolly.awsSdk.swfMod._RegistrationStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVITY_ID_UNKNOWN
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type RequestCancelActivityTaskFailedCause = typingsJapgolly.awsSdk.swfMod._RequestCancelActivityTaskFailedCause | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION
    - typingsJapgolly.awsSdk.awsSdkStrings.REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type RequestCancelExternalWorkflowExecutionFailedCause = typingsJapgolly.awsSdk.swfMod._RequestCancelExternalWorkflowExecutionFailedCause | java.lang.String
  type ResourceTagKey = java.lang.String
  type ResourceTagKeyList = js.Array[typingsJapgolly.awsSdk.swfMod.ResourceTagKey]
  type ResourceTagList = js.Array[typingsJapgolly.awsSdk.swfMod.ResourceTag]
  type ResourceTagValue = java.lang.String
  type ReverseOrder = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVITY_TYPE_DEPRECATED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVITY_TYPE_DOES_NOT_EXIST
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVITY_ID_ALREADY_IN_USE
    - typingsJapgolly.awsSdk.awsSdkStrings.OPEN_ACTIVITIES_LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVITY_CREATION_RATE_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_TASK_LIST_UNDEFINED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type ScheduleActivityTaskFailedCause = typingsJapgolly.awsSdk.swfMod._ScheduleActivityTaskFailedCause | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ID_ALREADY_IN_USE
    - typingsJapgolly.awsSdk.awsSdkStrings.OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION
    - java.lang.String
  */
  type ScheduleLambdaFunctionFailedCause = typingsJapgolly.awsSdk.swfMod._ScheduleLambdaFunctionFailedCause | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION
    - typingsJapgolly.awsSdk.awsSdkStrings.SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type SignalExternalWorkflowExecutionFailedCause = typingsJapgolly.awsSdk.swfMod._SignalExternalWorkflowExecutionFailedCause | java.lang.String
  type SignalName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WORKFLOW_TYPE_DOES_NOT_EXIST
    - typingsJapgolly.awsSdk.awsSdkStrings.WORKFLOW_TYPE_DEPRECATED
    - typingsJapgolly.awsSdk.awsSdkStrings.OPEN_CHILDREN_LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.OPEN_WORKFLOWS_LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.CHILD_CREATION_RATE_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.WORKFLOW_ALREADY_RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_TASK_LIST_UNDEFINED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_CHILD_POLICY_UNDEFINED
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type StartChildWorkflowExecutionFailedCause = typingsJapgolly.awsSdk.swfMod._StartChildWorkflowExecutionFailedCause | java.lang.String
  type StartLambdaFunctionFailedCause = typingsJapgolly.awsSdk.awsSdkStrings.ASSUME_ROLE_FAILED | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMER_ID_ALREADY_IN_USE
    - typingsJapgolly.awsSdk.awsSdkStrings.OPEN_TIMERS_LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMER_CREATION_RATE_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type StartTimerFailedCause = typingsJapgolly.awsSdk.swfMod._StartTimerFailedCause | java.lang.String
  type Tag = java.lang.String
  type TagList = js.Array[typingsJapgolly.awsSdk.swfMod.Tag]
  type TaskPriority = java.lang.String
  type TaskToken = java.lang.String
  type TerminateReason = java.lang.String
  type TimerId = java.lang.String
  type Timestamp = js.Date
  type Truncated = scala.Boolean
  type Version = java.lang.String
  type VersionOptional = java.lang.String
  type WorkflowExecutionCancelRequestedCause = typingsJapgolly.awsSdk.awsSdkStrings.CHILD_POLICY_APPLIED | java.lang.String
  type WorkflowExecutionInfoList = js.Array[typingsJapgolly.awsSdk.swfMod.WorkflowExecutionInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CHILD_POLICY_APPLIED
    - typingsJapgolly.awsSdk.awsSdkStrings.EVENT_LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATOR_INITIATED
    - java.lang.String
  */
  type WorkflowExecutionTerminatedCause = typingsJapgolly.awsSdk.swfMod._WorkflowExecutionTerminatedCause | java.lang.String
  type WorkflowExecutionTimeoutType = typingsJapgolly.awsSdk.awsSdkStrings.START_TO_CLOSE | java.lang.String
  type WorkflowId = java.lang.String
  type WorkflowRunId = java.lang.String
  type WorkflowRunIdOptional = java.lang.String
  type WorkflowTypeInfoList = js.Array[typingsJapgolly.awsSdk.swfMod.WorkflowTypeInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2012-01-25`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.swfMod._apiVersion | java.lang.String
}
