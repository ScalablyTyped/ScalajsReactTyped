package typingsJapgolly.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActivityList = js.Array[ActivityListItem]

type Arn = String

type BilledDuration = Double

type BilledMemoryUsed = Double

type ConnectorParameters = String

type Definition = String

type Enabled = Boolean

type EventId = Double

type ExecutionList = js.Array[ExecutionListItem]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
  - typingsJapgolly.awsSdk.awsSdkStrings.ABORTED
  - java.lang.String
*/
type ExecutionStatus = _ExecutionStatus | String

type HistoryEventList = js.Array[HistoryEvent]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ActivityFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.ActivityScheduled
  - typingsJapgolly.awsSdk.awsSdkStrings.ActivityScheduleFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.ActivityStarted
  - typingsJapgolly.awsSdk.awsSdkStrings.ActivitySucceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.ActivityTimedOut
  - typingsJapgolly.awsSdk.awsSdkStrings.ChoiceStateEntered
  - typingsJapgolly.awsSdk.awsSdkStrings.ChoiceStateExited
  - typingsJapgolly.awsSdk.awsSdkStrings.ExecutionAborted
  - typingsJapgolly.awsSdk.awsSdkStrings.ExecutionFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.ExecutionStarted
  - typingsJapgolly.awsSdk.awsSdkStrings.ExecutionSucceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.ExecutionTimedOut
  - typingsJapgolly.awsSdk.awsSdkStrings.FailStateEntered
  - typingsJapgolly.awsSdk.awsSdkStrings.LambdaFunctionFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.LambdaFunctionScheduled
  - typingsJapgolly.awsSdk.awsSdkStrings.LambdaFunctionScheduleFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.LambdaFunctionStarted
  - typingsJapgolly.awsSdk.awsSdkStrings.LambdaFunctionStartFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.LambdaFunctionSucceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.LambdaFunctionTimedOut
  - typingsJapgolly.awsSdk.awsSdkStrings.MapIterationAborted
  - typingsJapgolly.awsSdk.awsSdkStrings.MapIterationFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.MapIterationStarted
  - typingsJapgolly.awsSdk.awsSdkStrings.MapIterationSucceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.MapStateAborted
  - typingsJapgolly.awsSdk.awsSdkStrings.MapStateEntered
  - typingsJapgolly.awsSdk.awsSdkStrings.MapStateExited
  - typingsJapgolly.awsSdk.awsSdkStrings.MapStateFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.MapStateStarted
  - typingsJapgolly.awsSdk.awsSdkStrings.MapStateSucceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.ParallelStateAborted
  - typingsJapgolly.awsSdk.awsSdkStrings.ParallelStateEntered
  - typingsJapgolly.awsSdk.awsSdkStrings.ParallelStateExited
  - typingsJapgolly.awsSdk.awsSdkStrings.ParallelStateFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.ParallelStateStarted
  - typingsJapgolly.awsSdk.awsSdkStrings.ParallelStateSucceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.PassStateEntered
  - typingsJapgolly.awsSdk.awsSdkStrings.PassStateExited
  - typingsJapgolly.awsSdk.awsSdkStrings.SucceedStateEntered
  - typingsJapgolly.awsSdk.awsSdkStrings.SucceedStateExited
  - typingsJapgolly.awsSdk.awsSdkStrings.TaskFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.TaskScheduled
  - typingsJapgolly.awsSdk.awsSdkStrings.TaskStarted
  - typingsJapgolly.awsSdk.awsSdkStrings.TaskStartFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.TaskStateAborted
  - typingsJapgolly.awsSdk.awsSdkStrings.TaskStateEntered
  - typingsJapgolly.awsSdk.awsSdkStrings.TaskStateExited
  - typingsJapgolly.awsSdk.awsSdkStrings.TaskSubmitFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.TaskSubmitted
  - typingsJapgolly.awsSdk.awsSdkStrings.TaskSucceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.TaskTimedOut
  - typingsJapgolly.awsSdk.awsSdkStrings.WaitStateAborted
  - typingsJapgolly.awsSdk.awsSdkStrings.WaitStateEntered
  - typingsJapgolly.awsSdk.awsSdkStrings.WaitStateExited
  - java.lang.String
*/
type HistoryEventType = _HistoryEventType | String

type Identity = String

type IncludeExecutionData = Boolean

type IncludeExecutionDataGetExecutionHistory = Boolean

type ListExecutionsPageToken = String

type LogDestinationList = js.Array[LogDestination]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.FATAL
  - typingsJapgolly.awsSdk.awsSdkStrings.OFF
  - java.lang.String
*/
type LogLevel = _LogLevel | String

type Name = String

type PageSize = Double

type PageToken = String

type ReverseOrder = Boolean

type SensitiveCause = String

type SensitiveData = String

type SensitiveDataJobInput = String

type SensitiveError = String

type StateMachineList = js.Array[StateMachineListItem]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type StateMachineStatus = _StateMachineStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPRESS
  - java.lang.String
*/
type StateMachineType = _StateMachineType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
  - java.lang.String
*/
type SyncExecutionStatus = _SyncExecutionStatus | String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TaskToken = String

type TimeoutInSeconds = Double

type Timestamp = js.Date

type TraceHeader = String

type UnsignedInteger = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-11-23`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type includedDetails = Boolean

type truncated = Boolean
