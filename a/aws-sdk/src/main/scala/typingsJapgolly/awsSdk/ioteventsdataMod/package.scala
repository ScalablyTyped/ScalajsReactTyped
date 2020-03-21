package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ioteventsdataMod {
  type BatchPutMessageErrorEntries = js.Array[typingsJapgolly.awsSdk.ioteventsdataMod.BatchPutMessageErrorEntry]
  type BatchUpdateDetectorErrorEntries = js.Array[typingsJapgolly.awsSdk.ioteventsdataMod.BatchUpdateDetectorErrorEntry]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.ioteventsdataMod.ClientApiVersions
  type DetectorModelName = java.lang.String
  type DetectorModelVersion = java.lang.String
  type DetectorSummaries = js.Array[typingsJapgolly.awsSdk.ioteventsdataMod.DetectorSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotFoundException
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidRequestException
    - typingsJapgolly.awsSdk.awsSdkStrings.InternalFailureException
    - typingsJapgolly.awsSdk.awsSdkStrings.ServiceUnavailableException
    - typingsJapgolly.awsSdk.awsSdkStrings.ThrottlingException
    - java.lang.String
  */
  type ErrorCode = typingsJapgolly.awsSdk.ioteventsdataMod._ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type InputName = java.lang.String
  type KeyValue = java.lang.String
  type MaxResults = scala.Double
  type MessageId = java.lang.String
  type Messages = js.Array[typingsJapgolly.awsSdk.ioteventsdataMod.Message]
  type NextToken = java.lang.String
  type Payload = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.ioteventsdataMod.Blob | java.lang.String
  type Seconds = scala.Double
  type StateName = java.lang.String
  type TimerDefinitions = js.Array[typingsJapgolly.awsSdk.ioteventsdataMod.TimerDefinition]
  type TimerName = java.lang.String
  type Timers = js.Array[typingsJapgolly.awsSdk.ioteventsdataMod.Timer]
  type Timestamp = js.Date
  type UpdateDetectorRequests = js.Array[typingsJapgolly.awsSdk.ioteventsdataMod.UpdateDetectorRequest]
  type VariableDefinitions = js.Array[typingsJapgolly.awsSdk.ioteventsdataMod.VariableDefinition]
  type VariableName = java.lang.String
  type VariableValue = java.lang.String
  type Variables = js.Array[typingsJapgolly.awsSdk.ioteventsdataMod.Variable]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-10-23`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.ioteventsdataMod._apiVersion | java.lang.String
}
