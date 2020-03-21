package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stepfunctionsMod {
  type ActivityList = js.Array[typingsJapgolly.awsSdk.stepfunctionsMod.ActivityListItem]
  type Arn = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.stepfunctionsMod.ClientApiVersions
  type ConnectorParameters = java.lang.String
  type Definition = java.lang.String
  type EventId = scala.Double
  type ExecutionList = js.Array[typingsJapgolly.awsSdk.stepfunctionsMod.ExecutionListItem]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
    - typingsJapgolly.awsSdk.awsSdkStrings.ABORTED
    - java.lang.String
  */
  type ExecutionStatus = typingsJapgolly.awsSdk.stepfunctionsMod._ExecutionStatus | java.lang.String
  type HistoryEventList = js.Array[typingsJapgolly.awsSdk.stepfunctionsMod.HistoryEvent]
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
  type HistoryEventType = typingsJapgolly.awsSdk.stepfunctionsMod._HistoryEventType | java.lang.String
  type Identity = java.lang.String
  type IncludeExecutionData = scala.Boolean
  type ListExecutionsPageToken = java.lang.String
  type LogDestinationList = js.Array[typingsJapgolly.awsSdk.stepfunctionsMod.LogDestination]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.FATAL
    - typingsJapgolly.awsSdk.awsSdkStrings.OFF
    - java.lang.String
  */
  type LogLevel = typingsJapgolly.awsSdk.stepfunctionsMod._LogLevel | java.lang.String
  type Name = java.lang.String
  type PageSize = scala.Double
  type PageToken = java.lang.String
  type ReverseOrder = scala.Boolean
  type SensitiveCause = java.lang.String
  type SensitiveData = java.lang.String
  type SensitiveDataJobInput = java.lang.String
  type SensitiveError = java.lang.String
  type StateMachineList = js.Array[typingsJapgolly.awsSdk.stepfunctionsMod.StateMachineListItem]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type StateMachineStatus = typingsJapgolly.awsSdk.stepfunctionsMod._StateMachineStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPRESS
    - java.lang.String
  */
  type StateMachineType = typingsJapgolly.awsSdk.stepfunctionsMod._StateMachineType | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.stepfunctionsMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.stepfunctionsMod.Tag]
  type TagValue = java.lang.String
  type TaskToken = java.lang.String
  type TimeoutInSeconds = scala.Double
  type Timestamp = js.Date
  type UnsignedInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-11-23`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.stepfunctionsMod._apiVersion | java.lang.String
}
