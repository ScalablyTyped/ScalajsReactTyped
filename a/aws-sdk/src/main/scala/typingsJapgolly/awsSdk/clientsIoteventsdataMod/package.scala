package typingsJapgolly.awsSdk.clientsIoteventsdataMod

import typingsJapgolly.awsSdk.awsSdkStrings.SNOOZE_TIMEOUT
import typingsJapgolly.awsSdk.awsSdkStrings.STATE_CHANGE
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AcknowledgeAlarmActionRequests = js.Array[AcknowledgeAlarmActionRequest]

type AlarmModelName = String

type AlarmModelVersion = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.NORMAL
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.ACKNOWLEDGED
  - typingsJapgolly.awsSdk.awsSdkStrings.SNOOZE_DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.LATCHED
  - java.lang.String
*/
type AlarmStateName = _AlarmStateName | String

type AlarmSummaries = js.Array[AlarmSummary]

type BatchAlarmActionErrorEntries = js.Array[BatchAlarmActionErrorEntry]

type BatchDeleteDetectorErrorEntries = js.Array[BatchDeleteDetectorErrorEntry]

type BatchPutMessageErrorEntries = js.Array[BatchPutMessageErrorEntry]

type BatchUpdateDetectorErrorEntries = js.Array[BatchUpdateDetectorErrorEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_OR_EQUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_OR_EQUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.EQUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EQUAL
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SNOOZE
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.ACKNOWLEDGE
  - typingsJapgolly.awsSdk.awsSdkStrings.RESET
  - java.lang.String
*/
type CustomerActionName = _CustomerActionName | String

type DeleteDetectorRequests = js.Array[DeleteDetectorRequest]

type DetectorModelName = String

type DetectorModelVersion = String

type DetectorSummaries = js.Array[DetectorSummary]

type DisableAlarmActionRequests = js.Array[DisableAlarmActionRequest]

type EnableAlarmActionRequests = js.Array[EnableAlarmActionRequest]

type EphemeralInputName = String

type EpochMilliTimestamp = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotFoundException
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidRequestException
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalFailureException
  - typingsJapgolly.awsSdk.awsSdkStrings.ServiceUnavailableException
  - typingsJapgolly.awsSdk.awsSdkStrings.ThrottlingException
  - java.lang.String
*/
type ErrorCode = _ErrorCode | String

type ErrorMessage = String

type EventType = STATE_CHANGE | String

type InputPropertyValue = String

type KeyValue = String

type MaxResults = Double

type MessageId = String

type Messages = js.Array[Message]

type NextToken = String

type Note = String

type Payload = Buffer | js.typedarray.Uint8Array | Blob | String

type RequestId = String

type ResetAlarmActionRequests = js.Array[ResetAlarmActionRequest]

type Seconds = Double

type Severity = Double

type SnoozeAlarmActionRequests = js.Array[SnoozeAlarmActionRequest]

type SnoozeDuration = Double

type StateName = String

type ThresholdValue = String

type TimerDefinitions = js.Array[TimerDefinition]

type TimerName = String

type Timers = js.Array[Timer]

type Timestamp = js.Date

type TriggerType = SNOOZE_TIMEOUT | String

type UpdateDetectorRequests = js.Array[UpdateDetectorRequest]

type VariableDefinitions = js.Array[VariableDefinition]

type VariableName = String

type VariableValue = String

type Variables = js.Array[Variable]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-10-23`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
