package typingsJapgolly.awsSdk.clientsTextractMod

import typingsJapgolly.awsSdk.awsSdkStrings.DATE
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BlockList = js.Array[Block]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.KEY_VALUE_SET
  - typingsJapgolly.awsSdk.awsSdkStrings.PAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.LINE
  - typingsJapgolly.awsSdk.awsSdkStrings.WORD
  - typingsJapgolly.awsSdk.awsSdkStrings.TABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.CELL
  - typingsJapgolly.awsSdk.awsSdkStrings.SELECTION_ELEMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.MERGED_CELL
  - typingsJapgolly.awsSdk.awsSdkStrings.TITLE
  - typingsJapgolly.awsSdk.awsSdkStrings.QUERY
  - typingsJapgolly.awsSdk.awsSdkStrings.QUERY_RESULT
  - java.lang.String
*/
type BlockType = _BlockType | java.lang.String

type ClientRequestToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
  - typingsJapgolly.awsSdk.awsSdkStrings.FreeOfAdultContent
  - java.lang.String
*/
type ContentClassifier = _ContentClassifier | java.lang.String

type ContentClassifiers = js.Array[ContentClassifier]

type DocumentPages = js.Array[Document]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.KEY
  - typingsJapgolly.awsSdk.awsSdkStrings.VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.COLUMN_HEADER
  - java.lang.String
*/
type EntityType = _EntityType | java.lang.String

type EntityTypes = js.Array[EntityType]

type ErrorCode = java.lang.String

type ExpenseDocumentList = js.Array[ExpenseDocument]

type ExpenseFieldList = js.Array[ExpenseField]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TABLES
  - typingsJapgolly.awsSdk.awsSdkStrings.FORMS
  - typingsJapgolly.awsSdk.awsSdkStrings.QUERIES
  - java.lang.String
*/
type FeatureType = _FeatureType | java.lang.String

type FeatureTypes = js.Array[FeatureType]

type Float = Double

type FlowDefinitionArn = java.lang.String

type HumanLoopActivationConditionsEvaluationResults = java.lang.String

type HumanLoopActivationReason = java.lang.String

type HumanLoopActivationReasons = js.Array[HumanLoopActivationReason]

type HumanLoopArn = java.lang.String

type HumanLoopName = java.lang.String

type IdList = js.Array[NonEmptyString]

type IdentityDocumentFieldList = js.Array[IdentityDocumentField]

type IdentityDocumentList = js.Array[IdentityDocument]

type ImageBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type JobId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
  - java.lang.String
*/
type JobStatus = _JobStatus | java.lang.String

type JobTag = java.lang.String

type KMSKeyId = java.lang.String

type LineItemGroupList = js.Array[LineItemGroup]

type LineItemList = js.Array[LineItemFields]

type MaxResults = Double

type NonEmptyString = java.lang.String

type Pages = js.Array[UInteger]

type PaginationToken = java.lang.String

type Percent = Double

type Polygon = js.Array[Point]

type Queries = js.Array[Query]

type QueryInput = java.lang.String

type QueryPage = java.lang.String

type QueryPages = js.Array[QueryPage]

type RelationshipList = js.Array[Relationship]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.CHILD
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLEX_FEATURES
  - typingsJapgolly.awsSdk.awsSdkStrings.MERGED_CELL
  - typingsJapgolly.awsSdk.awsSdkStrings.TITLE
  - typingsJapgolly.awsSdk.awsSdkStrings.ANSWER
  - java.lang.String
*/
type RelationshipType = _RelationshipType | java.lang.String

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
type SelectionStatus = _SelectionStatus | java.lang.String

type StatusMessage = java.lang.String

type String = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HANDWRITING
  - typingsJapgolly.awsSdk.awsSdkStrings.PRINTED
  - java.lang.String
*/
type TextType = _TextType | java.lang.String

type UInteger = Double

type ValueType = DATE | java.lang.String

type Warnings = js.Array[Warning]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-06-27`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
