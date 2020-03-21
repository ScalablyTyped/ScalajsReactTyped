package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ioteventsMod {
  type Actions = js.Array[typingsJapgolly.awsSdk.ioteventsMod.Action]
  type AmazonResourceName = java.lang.String
  type AttributeJsonPath = java.lang.String
  type Attributes = js.Array[typingsJapgolly.awsSdk.ioteventsMod.Attribute]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.ioteventsMod.ClientApiVersions
  type Condition = java.lang.String
  type DeliveryStreamName = java.lang.String
  type DetectorDebugOptions = js.Array[typingsJapgolly.awsSdk.ioteventsMod.DetectorDebugOption]
  type DetectorModelArn = java.lang.String
  type DetectorModelDescription = java.lang.String
  type DetectorModelName = java.lang.String
  type DetectorModelSummaries = js.Array[typingsJapgolly.awsSdk.ioteventsMod.DetectorModelSummary]
  type DetectorModelVersion = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATING
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPRECATED
    - typingsJapgolly.awsSdk.awsSdkStrings.DRAFT
    - typingsJapgolly.awsSdk.awsSdkStrings.PAUSED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DetectorModelVersionStatus = typingsJapgolly.awsSdk.ioteventsMod._DetectorModelVersionStatus | java.lang.String
  type DetectorModelVersionSummaries = js.Array[typingsJapgolly.awsSdk.ioteventsMod.DetectorModelVersionSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BATCH
    - typingsJapgolly.awsSdk.awsSdkStrings.SERIAL
    - java.lang.String
  */
  type EvaluationMethod = typingsJapgolly.awsSdk.ioteventsMod._EvaluationMethod | java.lang.String
  type EventName = java.lang.String
  type Events = js.Array[typingsJapgolly.awsSdk.ioteventsMod.Event]
  type FirehoseSeparator = java.lang.String
  type InputArn = java.lang.String
  type InputDescription = java.lang.String
  type InputName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type InputStatus = typingsJapgolly.awsSdk.ioteventsMod._InputStatus | java.lang.String
  type InputSummaries = js.Array[typingsJapgolly.awsSdk.ioteventsMod.InputSummary]
  type KeyValue = java.lang.String
  type LoggingEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.INFO
    - typingsJapgolly.awsSdk.awsSdkStrings.DEBUG
    - java.lang.String
  */
  type LoggingLevel = typingsJapgolly.awsSdk.ioteventsMod._LoggingLevel | java.lang.String
  type MQTTTopic = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type QueueUrl = java.lang.String
  type Seconds = scala.Double
  type StateName = java.lang.String
  type States = js.Array[typingsJapgolly.awsSdk.ioteventsMod.State]
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsJapgolly.awsSdk.ioteventsMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.ioteventsMod.Tag]
  type TimerName = java.lang.String
  type Timestamp = js.Date
  type TransitionEvents = js.Array[typingsJapgolly.awsSdk.ioteventsMod.TransitionEvent]
  type UseBase64 = scala.Boolean
  type VariableName = java.lang.String
  type VariableValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-07-27`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.ioteventsMod._apiVersion | java.lang.String
}
