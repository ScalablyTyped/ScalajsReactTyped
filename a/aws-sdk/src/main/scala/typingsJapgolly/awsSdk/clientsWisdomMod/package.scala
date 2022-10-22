package typingsJapgolly.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.AGENT
import typingsJapgolly.awsSdk.awsSdkStrings.EQUALS
import typingsJapgolly.awsSdk.awsSdkStrings.KNOWLEDGE_BASE
import typingsJapgolly.awsSdk.awsSdkStrings.KNOWLEDGE_CONTENT
import typingsJapgolly.awsSdk.awsSdkStrings.NAME
import typingsJapgolly.awsSdk.awsSdkStrings.QUERY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = java.lang.String

type AssistantAssociationSummaryList = js.Array[AssistantAssociationSummary]

type AssistantList = js.Array[AssistantSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type AssistantStatus = _AssistantStatus | java.lang.String

type AssistantType = AGENT | java.lang.String

type AssociationType = KNOWLEDGE_BASE | java.lang.String

type Boolean = scala.Boolean

type ClientToken = java.lang.String

type ContentMetadata = StringDictionary[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type ContentStatus = _ContentStatus | java.lang.String

type ContentSummaryList = js.Array[ContentSummary]

type ContentTitle = java.lang.String

type ContentType = java.lang.String

type Description = java.lang.String

type FilterField = NAME | java.lang.String

type FilterList = js.Array[Filter]

type FilterOperator = EQUALS | java.lang.String

type GenericArn = java.lang.String

type Headers = StringDictionary[NonEmptyString]

type HighlightOffset = Double

type Highlights = js.Array[Highlight]

type KnowledgeBaseList = js.Array[KnowledgeBaseSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type KnowledgeBaseStatus = _KnowledgeBaseStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EXTERNAL
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type KnowledgeBaseType = _KnowledgeBaseType | java.lang.String

type MaxResults = Double

type Name = java.lang.String

type NextToken = java.lang.String

type NonEmptyString = java.lang.String

type NotifyRecommendationsReceivedErrorList = js.Array[NotifyRecommendationsReceivedError]

type NotifyRecommendationsReceivedErrorMessage = java.lang.String

type ObjectFieldsList = js.Array[NonEmptyString]

type QueryResultsList = js.Array[ResultData]

type QueryText = java.lang.String

type RecommendationIdList = js.Array[String]

type RecommendationList = js.Array[RecommendationData]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ISSUE_DETECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.RULE_EVALUATION
  - typingsJapgolly.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
type RecommendationSourceType = _RecommendationSourceType | java.lang.String

type RecommendationTriggerList = js.Array[RecommendationTrigger]

type RecommendationTriggerType = QUERY | java.lang.String

type RecommendationType = KNOWLEDGE_CONTENT | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
  - typingsJapgolly.awsSdk.awsSdkStrings.LOW
  - java.lang.String
*/
type RelevanceLevel = _RelevanceLevel | java.lang.String

type RelevanceScore = Double

type SensitiveString = java.lang.String

type SessionSummaries = js.Array[SessionSummary]

type String = java.lang.String

type SyntheticTimestampEpochSeconds = js.Date

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagValue = java.lang.String

type Tags = StringDictionary[TagValue]

type Uri = java.lang.String

type Url = java.lang.String

type Uuid = java.lang.String

type UuidOrArn = java.lang.String

type WaitTimeSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-10-19`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
