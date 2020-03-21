package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kendraMod {
  type AdditionalResultAttributeList = js.Array[typingsJapgolly.awsSdk.kendraMod.AdditionalResultAttribute]
  type AdditionalResultAttributeValueType = typingsJapgolly.awsSdk.awsSdkStrings.TEXT_WITH_HIGHLIGHTS_VALUE | java.lang.String
  type AttributeFilterList = js.Array[typingsJapgolly.awsSdk.kendraMod.AttributeFilter]
  type BatchDeleteDocumentResponseFailedDocuments = js.Array[typingsJapgolly.awsSdk.kendraMod.BatchDeleteDocumentResponseFailedDocument]
  type BatchPutDocumentResponseFailedDocuments = js.Array[typingsJapgolly.awsSdk.kendraMod.BatchPutDocumentResponseFailedDocument]
  type Boolean = scala.Boolean
  type ChangeDetectingColumns = js.Array[typingsJapgolly.awsSdk.kendraMod.ColumnName]
  type ClickFeedbackList = js.Array[typingsJapgolly.awsSdk.kendraMod.ClickFeedback]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.kendraMod.ClientApiVersions
  type ColumnName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PDF
    - typingsJapgolly.awsSdk.awsSdkStrings.HTML
    - typingsJapgolly.awsSdk.awsSdkStrings.MS_WORD
    - typingsJapgolly.awsSdk.awsSdkStrings.PLAIN_TEXT
    - typingsJapgolly.awsSdk.awsSdkStrings.PPT
    - java.lang.String
  */
  type ContentType = typingsJapgolly.awsSdk.kendraMod._ContentType | java.lang.String
  type DataSourceDateFieldFormat = java.lang.String
  type DataSourceFieldName = java.lang.String
  type DataSourceId = java.lang.String
  type DataSourceInclusionsExclusionsStrings = js.Array[typingsJapgolly.awsSdk.kendraMod.DataSourceInclusionsExclusionsStringsMember]
  type DataSourceInclusionsExclusionsStringsMember = java.lang.String
  type DataSourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type DataSourceStatus = typingsJapgolly.awsSdk.kendraMod._DataSourceStatus | java.lang.String
  type DataSourceSummaryList = js.Array[typingsJapgolly.awsSdk.kendraMod.DataSourceSummary]
  type DataSourceSyncJobHistoryList = js.Array[typingsJapgolly.awsSdk.kendraMod.DataSourceSyncJob]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.SYNCING
    - typingsJapgolly.awsSdk.awsSdkStrings.INCOMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.ABORTED
    - java.lang.String
  */
  type DataSourceSyncJobStatus = typingsJapgolly.awsSdk.kendraMod._DataSourceSyncJobStatus | java.lang.String
  type DataSourceToIndexFieldMappingList = js.Array[typingsJapgolly.awsSdk.kendraMod.DataSourceToIndexFieldMapping]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.S3
    - typingsJapgolly.awsSdk.awsSdkStrings.SHAREPOINT
    - typingsJapgolly.awsSdk.awsSdkStrings.DATABASE
    - java.lang.String
  */
  type DataSourceType = typingsJapgolly.awsSdk.kendraMod._DataSourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RDS_AURORA_MYSQL
    - typingsJapgolly.awsSdk.awsSdkStrings.RDS_AURORA_POSTGRESQL
    - typingsJapgolly.awsSdk.awsSdkStrings.RDS_MYSQL
    - typingsJapgolly.awsSdk.awsSdkStrings.RDS_POSTGRESQL
    - java.lang.String
  */
  type DatabaseEngineType = typingsJapgolly.awsSdk.kendraMod._DatabaseEngineType | java.lang.String
  type DatabaseHost = java.lang.String
  type DatabaseName = java.lang.String
  type DatabasePort = scala.Double
  type Description = java.lang.String
  type DocumentAttributeKey = java.lang.String
  type DocumentAttributeKeyList = js.Array[typingsJapgolly.awsSdk.kendraMod.DocumentAttributeKey]
  type DocumentAttributeList = js.Array[typingsJapgolly.awsSdk.kendraMod.DocumentAttribute]
  type DocumentAttributeStringListValue = js.Array[typingsJapgolly.awsSdk.kendraMod.String]
  type DocumentAttributeStringValue = java.lang.String
  type DocumentAttributeValueCountPairList = js.Array[typingsJapgolly.awsSdk.kendraMod.DocumentAttributeValueCountPair]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STRING_VALUE
    - typingsJapgolly.awsSdk.awsSdkStrings.STRING_LIST_VALUE
    - typingsJapgolly.awsSdk.awsSdkStrings.LONG_VALUE
    - typingsJapgolly.awsSdk.awsSdkStrings.DATE_VALUE
    - java.lang.String
  */
  type DocumentAttributeValueType = typingsJapgolly.awsSdk.kendraMod._DocumentAttributeValueType | java.lang.String
  type DocumentId = java.lang.String
  type DocumentIdList = js.Array[typingsJapgolly.awsSdk.kendraMod.DocumentId]
  type DocumentList = js.Array[typingsJapgolly.awsSdk.kendraMod.Document]
  type DocumentMetadataBoolean = scala.Boolean
  type DocumentMetadataConfigurationList = js.Array[typingsJapgolly.awsSdk.kendraMod.DocumentMetadataConfiguration]
  type DocumentMetadataConfigurationName = java.lang.String
  type Duration = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InternalError
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidRequest
    - java.lang.String
  */
  type ErrorCode = typingsJapgolly.awsSdk.kendraMod._ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type FacetList = js.Array[typingsJapgolly.awsSdk.kendraMod.Facet]
  type FacetResultList = js.Array[typingsJapgolly.awsSdk.kendraMod.FacetResult]
  type FaqId = java.lang.String
  type FaqName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type FaqStatus = typingsJapgolly.awsSdk.kendraMod._FaqStatus | java.lang.String
  type FaqSummaryItems = js.Array[typingsJapgolly.awsSdk.kendraMod.FaqSummary]
  type HighlightList = js.Array[typingsJapgolly.awsSdk.kendraMod.Highlight]
  type Importance = scala.Double
  type IndexConfigurationSummaryList = js.Array[typingsJapgolly.awsSdk.kendraMod.IndexConfigurationSummary]
  type IndexFieldName = java.lang.String
  type IndexId = java.lang.String
  type IndexName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM_UPDATING
    - java.lang.String
  */
  type IndexStatus = typingsJapgolly.awsSdk.kendraMod._IndexStatus | java.lang.String
  type IndexedQuestionAnswersCount = scala.Double
  type IndexedTextDocumentsCount = scala.Double
  type Integer = scala.Double
  type KmsKeyId = java.lang.String
  type Long = scala.Double
  type MaxResultsIntegerForListDataSourceSyncJobsRequest = scala.Double
  type MaxResultsIntegerForListDataSourcesRequest = scala.Double
  type MaxResultsIntegerForListFaqsRequest = scala.Double
  type MaxResultsIntegerForListIndicesRequest = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type Order = typingsJapgolly.awsSdk.kendraMod._Order | java.lang.String
  type PrincipalList = js.Array[typingsJapgolly.awsSdk.kendraMod.Principal]
  type PrincipalName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USER
    - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
    - java.lang.String
  */
  type PrincipalType = typingsJapgolly.awsSdk.kendraMod._PrincipalType | java.lang.String
  type QueryId = java.lang.String
  type QueryResultItemList = js.Array[typingsJapgolly.awsSdk.kendraMod.QueryResultItem]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT
    - typingsJapgolly.awsSdk.awsSdkStrings.QUESTION_ANSWER
    - typingsJapgolly.awsSdk.awsSdkStrings.ANSWER
    - java.lang.String
  */
  type QueryResultType = typingsJapgolly.awsSdk.kendraMod._QueryResultType | java.lang.String
  type QueryText = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW
    - typingsJapgolly.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type ReadAccessType = typingsJapgolly.awsSdk.kendraMod._ReadAccessType | java.lang.String
  type RelevanceFeedbackList = js.Array[typingsJapgolly.awsSdk.kendraMod.RelevanceFeedback]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RELEVANT
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_RELEVANT
    - java.lang.String
  */
  type RelevanceType = typingsJapgolly.awsSdk.kendraMod._RelevanceType | java.lang.String
  type ResultId = java.lang.String
  type RoleArn = java.lang.String
  type S3BucketName = java.lang.String
  type S3ObjectKey = java.lang.String
  type ScanSchedule = java.lang.String
  type SecretArn = java.lang.String
  type SecurityGroupIdList = js.Array[typingsJapgolly.awsSdk.kendraMod.VpcSecurityGroupId]
  type SharePointUrlList = js.Array[typingsJapgolly.awsSdk.kendraMod.Url]
  type SharePointVersion = typingsJapgolly.awsSdk.awsSdkStrings.SHAREPOINT_ONLINE | java.lang.String
  type String = java.lang.String
  type SubnetId = java.lang.String
  type SubnetIdList = js.Array[typingsJapgolly.awsSdk.kendraMod.SubnetId]
  type TableName = java.lang.String
  type Timestamp = js.Date
  type Title = java.lang.String
  type Url = java.lang.String
  type ValueImportanceMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.kendraMod.Importance]
  type ValueImportanceMapKey = java.lang.String
  type VpcSecurityGroupId = java.lang.String
  type _Blob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.kendraMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-02-03`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.kendraMod._apiVersion | java.lang.String
}
