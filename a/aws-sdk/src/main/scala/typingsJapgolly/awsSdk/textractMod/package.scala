package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object textractMod {
  type BlockList = js.Array[typingsJapgolly.awsSdk.textractMod.Block]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.KEY_VALUE_SET
    - typingsJapgolly.awsSdk.awsSdkStrings.PAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.LINE
    - typingsJapgolly.awsSdk.awsSdkStrings.WORD
    - typingsJapgolly.awsSdk.awsSdkStrings.TABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.CELL
    - typingsJapgolly.awsSdk.awsSdkStrings.SELECTION_ELEMENT
    - java.lang.String
  */
  type BlockType = typingsJapgolly.awsSdk.textractMod._BlockType | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.textractMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typingsJapgolly.awsSdk.awsSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = typingsJapgolly.awsSdk.textractMod._ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[typingsJapgolly.awsSdk.textractMod.ContentClassifier]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.KEY
    - typingsJapgolly.awsSdk.awsSdkStrings.VALUE
    - java.lang.String
  */
  type EntityType = typingsJapgolly.awsSdk.textractMod._EntityType | java.lang.String
  type EntityTypes = js.Array[typingsJapgolly.awsSdk.textractMod.EntityType]
  type ErrorCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TABLES
    - typingsJapgolly.awsSdk.awsSdkStrings.FORMS
    - java.lang.String
  */
  type FeatureType = typingsJapgolly.awsSdk.textractMod._FeatureType | java.lang.String
  type FeatureTypes = js.Array[typingsJapgolly.awsSdk.textractMod.FeatureType]
  type Float = scala.Double
  type FlowDefinitionArn = java.lang.String
  type HumanLoopActivationConditionsEvaluationResults = java.lang.String
  type HumanLoopActivationReason = java.lang.String
  type HumanLoopActivationReasons = js.Array[typingsJapgolly.awsSdk.textractMod.HumanLoopActivationReason]
  type HumanLoopArn = java.lang.String
  type HumanLoopName = java.lang.String
  type IdList = js.Array[typingsJapgolly.awsSdk.textractMod.NonEmptyString]
  type ImageBlob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.textractMod.Blob | java.lang.String
  type JobId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
    - java.lang.String
  */
  type JobStatus = typingsJapgolly.awsSdk.textractMod._JobStatus | java.lang.String
  type JobTag = java.lang.String
  type MaxResults = scala.Double
  type NonEmptyString = java.lang.String
  type Pages = js.Array[typingsJapgolly.awsSdk.textractMod.UInteger]
  type PaginationToken = java.lang.String
  type Percent = scala.Double
  type Polygon = js.Array[typingsJapgolly.awsSdk.textractMod.Point]
  type RelationshipList = js.Array[typingsJapgolly.awsSdk.textractMod.Relationship]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.VALUE
    - typingsJapgolly.awsSdk.awsSdkStrings.CHILD
    - java.lang.String
  */
  type RelationshipType = typingsJapgolly.awsSdk.textractMod._RelationshipType | java.lang.String
  type RoleArn = java.lang.String
  type S3Bucket = java.lang.String
  type S3ObjectName = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SNSTopicArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SELECTED
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_SELECTED
    - java.lang.String
  */
  type SelectionStatus = typingsJapgolly.awsSdk.textractMod._SelectionStatus | java.lang.String
  type StatusMessage = java.lang.String
  type String = java.lang.String
  type UInteger = scala.Double
  type Warnings = js.Array[typingsJapgolly.awsSdk.textractMod.Warning]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-06-27`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.textractMod._apiVersion | java.lang.String
}
