package typingsJapgolly.awsSdk.clientsSwfMod

import typingsJapgolly.awsSdk.awsSdkStrings.ASSUME_ROLE_FAILED
import typingsJapgolly.awsSdk.awsSdkStrings.CHILD_POLICY_APPLIED
import typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
import typingsJapgolly.awsSdk.awsSdkStrings.START_TO_CLOSE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActivityId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.START_TO_CLOSE
  - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULE_TO_START
  - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULE_TO_CLOSE
  - typingsJapgolly.awsSdk.awsSdkStrings.HEARTBEAT
  - java.lang.String
*/
type ActivityTaskTimeoutType = _ActivityTaskTimeoutType | String

type ActivityTypeInfoList = js.Array[ActivityTypeInfo]

type Arn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMER_ID_UNKNOWN
  - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type CancelTimerFailedCause = _CancelTimerFailedCause | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNHANDLED_DECISION
  - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type CancelWorkflowExecutionFailedCause = _CancelWorkflowExecutionFailedCause | String

type Canceled = Boolean

type CauseMessage = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUEST_CANCEL
  - typingsJapgolly.awsSdk.awsSdkStrings.ABANDON
  - java.lang.String
*/
type ChildPolicy = _ChildPolicy | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTINUED_AS_NEW
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
  - java.lang.String
*/
type CloseStatus = _CloseStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNHANDLED_DECISION
  - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type CompleteWorkflowExecutionFailedCause = _CompleteWorkflowExecutionFailedCause | String

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
type ContinueAsNewWorkflowExecutionFailedCause = _ContinueAsNewWorkflowExecutionFailedCause | String

type Count = Double

type Data = String

type DecisionList = js.Array[Decision]

type DecisionTaskTimeoutType = START_TO_CLOSE | String

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
type DecisionType = _DecisionType | String

type Description = String

type DomainInfoList = js.Array[DomainInfo]

type DomainName = String

type DurationInDays = String

type DurationInSeconds = String

type DurationInSecondsOptional = String

type EventId = Double

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
type EventType = _EventType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OPEN
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED
  - java.lang.String
*/
type ExecutionStatus = _ExecutionStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNHANDLED_DECISION
  - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type FailWorkflowExecutionFailedCause = _FailWorkflowExecutionFailedCause | String

type FailureReason = String

type FunctionId = String

type FunctionInput = String

type FunctionName = String

type HistoryEventList = js.Array[HistoryEvent]

type Identity = String

type LambdaFunctionTimeoutType = START_TO_CLOSE | String

type LimitedData = String

type MarkerName = String

type Name = String

type OpenDecisionTasksCount = Double

type PageSize = Double

type PageToken = String

type RecordMarkerFailedCause = OPERATION_NOT_PERMITTED | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REGISTERED
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPRECATED
  - java.lang.String
*/
type RegistrationStatus = _RegistrationStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVITY_ID_UNKNOWN
  - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type RequestCancelActivityTaskFailedCause = _RequestCancelActivityTaskFailedCause | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type RequestCancelExternalWorkflowExecutionFailedCause = _RequestCancelExternalWorkflowExecutionFailedCause | String

type ResourceTagKey = String

type ResourceTagKeyList = js.Array[ResourceTagKey]

type ResourceTagList = js.Array[ResourceTag]

type ResourceTagValue = String

type ReverseOrder = Boolean

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
type ScheduleActivityTaskFailedCause = _ScheduleActivityTaskFailedCause | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ID_ALREADY_IN_USE
  - typingsJapgolly.awsSdk.awsSdkStrings.OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION
  - java.lang.String
*/
type ScheduleLambdaFunctionFailedCause = _ScheduleLambdaFunctionFailedCause | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION
  - typingsJapgolly.awsSdk.awsSdkStrings.SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type SignalExternalWorkflowExecutionFailedCause = _SignalExternalWorkflowExecutionFailedCause | String

type SignalName = String

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
type StartChildWorkflowExecutionFailedCause = _StartChildWorkflowExecutionFailedCause | String

type StartLambdaFunctionFailedCause = ASSUME_ROLE_FAILED | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMER_ID_ALREADY_IN_USE
  - typingsJapgolly.awsSdk.awsSdkStrings.OPEN_TIMERS_LIMIT_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMER_CREATION_RATE_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type StartTimerFailedCause = _StartTimerFailedCause | String

type Tag = String

type TagList = js.Array[Tag]

type TaskPriority = String

type TaskToken = String

type TerminateReason = String

type TimerId = String

type Timestamp = js.Date

type Truncated = Boolean

type Version = String

type VersionOptional = String

type WorkflowExecutionCancelRequestedCause = CHILD_POLICY_APPLIED | String

type WorkflowExecutionInfoList = js.Array[WorkflowExecutionInfo]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CHILD_POLICY_APPLIED
  - typingsJapgolly.awsSdk.awsSdkStrings.EVENT_LIMIT_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.OPERATOR_INITIATED
  - java.lang.String
*/
type WorkflowExecutionTerminatedCause = _WorkflowExecutionTerminatedCause | String

type WorkflowExecutionTimeoutType = START_TO_CLOSE | String

type WorkflowId = String

type WorkflowRunId = String

type WorkflowRunIdOptional = String

type WorkflowTypeInfoList = js.Array[WorkflowTypeInfo]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2012-01-25`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
