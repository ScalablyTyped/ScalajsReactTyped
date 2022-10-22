package typingsJapgolly.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.HOME
import typingsJapgolly.awsSdk.awsSdkStrings.QUERY_LANGUAGE_INVALID_SYNTAX
import typingsJapgolly.awsSdk.awsSdkStrings.TEXT_WITH_HIGHLIGHTS_VALUE
import typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessControlConfigurationId = java.lang.String

type AccessControlConfigurationName = java.lang.String

type AccessControlConfigurationSummaryList = js.Array[AccessControlConfigurationSummary]

type AdditionalResultAttributeList = js.Array[AdditionalResultAttribute]

type AdditionalResultAttributeValueType = TEXT_WITH_HIGHLIGHTS_VALUE | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.wiki
  - typingsJapgolly.awsSdk.awsSdkStrings.blog
  - typingsJapgolly.awsSdk.awsSdkStrings.documentLibrary
  - java.lang.String
*/
type AlfrescoEntity = _AlfrescoEntity | java.lang.String

type AmazonResourceName = java.lang.String

type AssociateEntitiesToExperienceFailedEntityList = js.Array[FailedEntity]

type AssociateEntityList = js.Array[EntityConfiguration]

type AttributeFilterList = js.Array[AttributeFilter]

type BasicAuthenticationConfigurationList = js.Array[BasicAuthenticationConfiguration]

type BatchDeleteDocumentResponseFailedDocuments = js.Array[BatchDeleteDocumentResponseFailedDocument]

type BatchGetDocumentStatusResponseErrors = js.Array[BatchGetDocumentStatusResponseError]

type BatchPutDocumentResponseFailedDocuments = js.Array[BatchPutDocumentResponseFailedDocument]

type Boolean = scala.Boolean

type ChangeDetectingColumns = js.Array[ColumnName]

type ClaimRegex = java.lang.String

type ClickFeedbackList = js.Array[ClickFeedback]

type ClientTokenName = java.lang.String

type ColumnName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThan
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanOrEquals
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThan
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThanOrEquals
  - typingsJapgolly.awsSdk.awsSdkStrings.Equals_
  - typingsJapgolly.awsSdk.awsSdkStrings.NotEquals
  - typingsJapgolly.awsSdk.awsSdkStrings.Contains_
  - typingsJapgolly.awsSdk.awsSdkStrings.NotContains
  - typingsJapgolly.awsSdk.awsSdkStrings.Exists
  - typingsJapgolly.awsSdk.awsSdkStrings.NotExists
  - typingsJapgolly.awsSdk.awsSdkStrings.BeginsWith
  - java.lang.String
*/
type ConditionOperator = _ConditionOperator | java.lang.String

type ConfluenceAttachmentFieldMappingsList = js.Array[ConfluenceAttachmentToIndexFieldMapping]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTHOR
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTENT_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED_DATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISPLAY_URL
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE_SIZE
  - typingsJapgolly.awsSdk.awsSdkStrings.ITEM_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.PARENT_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.SPACE_KEY
  - typingsJapgolly.awsSdk.awsSdkStrings.SPACE_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.URL
  - typingsJapgolly.awsSdk.awsSdkStrings.VERSION
  - java.lang.String
*/
type ConfluenceAttachmentFieldName = _ConfluenceAttachmentFieldName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTP_BASIC
  - typingsJapgolly.awsSdk.awsSdkStrings.PAT
  - java.lang.String
*/
type ConfluenceAuthenticationType = _ConfluenceAuthenticationType | java.lang.String

type ConfluenceBlogFieldMappingsList = js.Array[ConfluenceBlogToIndexFieldMapping]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTHOR
  - typingsJapgolly.awsSdk.awsSdkStrings.DISPLAY_URL
  - typingsJapgolly.awsSdk.awsSdkStrings.ITEM_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.LABELS
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLISH_DATE
  - typingsJapgolly.awsSdk.awsSdkStrings.SPACE_KEY
  - typingsJapgolly.awsSdk.awsSdkStrings.SPACE_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.URL
  - typingsJapgolly.awsSdk.awsSdkStrings.VERSION
  - java.lang.String
*/
type ConfluenceBlogFieldName = _ConfluenceBlogFieldName | java.lang.String

type ConfluencePageFieldMappingsList = js.Array[ConfluencePageToIndexFieldMapping]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTHOR
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTENT_STATUS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED_DATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISPLAY_URL
  - typingsJapgolly.awsSdk.awsSdkStrings.ITEM_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.LABELS
  - typingsJapgolly.awsSdk.awsSdkStrings.MODIFIED_DATE
  - typingsJapgolly.awsSdk.awsSdkStrings.PARENT_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.SPACE_KEY
  - typingsJapgolly.awsSdk.awsSdkStrings.SPACE_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.URL
  - typingsJapgolly.awsSdk.awsSdkStrings.VERSION
  - java.lang.String
*/
type ConfluencePageFieldName = _ConfluencePageFieldName | java.lang.String

type ConfluenceSpaceFieldMappingsList = js.Array[ConfluenceSpaceToIndexFieldMapping]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISPLAY_URL
  - typingsJapgolly.awsSdk.awsSdkStrings.ITEM_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.SPACE_KEY
  - typingsJapgolly.awsSdk.awsSdkStrings.URL
  - java.lang.String
*/
type ConfluenceSpaceFieldName = _ConfluenceSpaceFieldName | java.lang.String

type ConfluenceSpaceIdentifier = java.lang.String

type ConfluenceSpaceList = js.Array[ConfluenceSpaceIdentifier]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOUD
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVER
  - java.lang.String
*/
type ConfluenceVersion = _ConfluenceVersion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PDF
  - typingsJapgolly.awsSdk.awsSdkStrings.HTML
  - typingsJapgolly.awsSdk.awsSdkStrings.MS_WORD
  - typingsJapgolly.awsSdk.awsSdkStrings.PLAIN_TEXT
  - typingsJapgolly.awsSdk.awsSdkStrings.PPT
  - java.lang.String
*/
type ContentType = _ContentType | java.lang.String

type CorrectionList = js.Array[Correction]

type CrawlDepth = Double

type DataSourceDateFieldFormat = java.lang.String

type DataSourceFieldName = java.lang.String

type DataSourceGroups = js.Array[DataSourceGroup]

type DataSourceId = java.lang.String

type DataSourceIdList = js.Array[DataSourceId]

type DataSourceInclusionsExclusionsStrings = js.Array[DataSourceInclusionsExclusionsStringsMember]

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
type DataSourceStatus = _DataSourceStatus | java.lang.String

type DataSourceSummaryList = js.Array[DataSourceSummary]

type DataSourceSyncJobHistoryList = js.Array[DataSourceSyncJob]

type DataSourceSyncJobId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.SYNCING
  - typingsJapgolly.awsSdk.awsSdkStrings.INCOMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.ABORTED
  - typingsJapgolly.awsSdk.awsSdkStrings.SYNCING_INDEXING
  - java.lang.String
*/
type DataSourceSyncJobStatus = _DataSourceSyncJobStatus | java.lang.String

type DataSourceToIndexFieldMappingList = js.Array[DataSourceToIndexFieldMapping]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.S3
  - typingsJapgolly.awsSdk.awsSdkStrings.SHAREPOINT
  - typingsJapgolly.awsSdk.awsSdkStrings.DATABASE
  - typingsJapgolly.awsSdk.awsSdkStrings.SALESFORCE
  - typingsJapgolly.awsSdk.awsSdkStrings.ONEDRIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICENOW
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFLUENCE
  - typingsJapgolly.awsSdk.awsSdkStrings.GOOGLEDRIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.WEBCRAWLER
  - typingsJapgolly.awsSdk.awsSdkStrings.WORKDOCS
  - typingsJapgolly.awsSdk.awsSdkStrings.FSX
  - typingsJapgolly.awsSdk.awsSdkStrings.SLACK
  - typingsJapgolly.awsSdk.awsSdkStrings.BOX
  - typingsJapgolly.awsSdk.awsSdkStrings.QUIP
  - typingsJapgolly.awsSdk.awsSdkStrings.JIRA
  - typingsJapgolly.awsSdk.awsSdkStrings.GITHUB
  - typingsJapgolly.awsSdk.awsSdkStrings.ALFRESCO
  - typingsJapgolly.awsSdk.awsSdkStrings.TEMPLATE
  - java.lang.String
*/
type DataSourceType = _DataSourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RDS_AURORA_MYSQL
  - typingsJapgolly.awsSdk.awsSdkStrings.RDS_AURORA_POSTGRESQL
  - typingsJapgolly.awsSdk.awsSdkStrings.RDS_MYSQL
  - typingsJapgolly.awsSdk.awsSdkStrings.RDS_POSTGRESQL
  - java.lang.String
*/
type DatabaseEngineType = _DatabaseEngineType | java.lang.String

type DatabaseHost = java.lang.String

type DatabaseName = java.lang.String

type DatabasePort = Double

type Description = java.lang.String

type DisassociateEntityList = js.Array[EntityConfiguration]

type DocumentAttributeKey = java.lang.String

type DocumentAttributeKeyList = js.Array[DocumentAttributeKey]

type DocumentAttributeList = js.Array[DocumentAttribute]

type DocumentAttributeStringListValue = js.Array[String]

type DocumentAttributeStringValue = java.lang.String

type DocumentAttributeValueCountPairList = js.Array[DocumentAttributeValueCountPair]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING_VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING_LIST_VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.LONG_VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.DATE_VALUE
  - java.lang.String
*/
type DocumentAttributeValueType = _DocumentAttributeValueType | java.lang.String

type DocumentId = java.lang.String

type DocumentIdList = js.Array[DocumentId]

type DocumentInfoList = js.Array[DocumentInfo]

type DocumentList = js.Array[Document]

type DocumentMetadataBoolean = scala.Boolean

type DocumentMetadataConfigurationList = js.Array[DocumentMetadataConfiguration]

type DocumentMetadataConfigurationName = java.lang.String

type DocumentRelevanceOverrideConfigurationList = js.Array[DocumentRelevanceConfiguration]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.PROCESSING
  - typingsJapgolly.awsSdk.awsSdkStrings.INDEXED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type DocumentStatus = _DocumentStatus | java.lang.String

type DocumentStatusList = js.Array[Status]

type Domain = java.lang.String

type Duration = java.lang.String

type Endpoint = java.lang.String

type EndpointType = HOME | java.lang.String

type EnterpriseId = java.lang.String

type EntityFilter = js.Array[AlfrescoEntity]

type EntityId = java.lang.String

type EntityIdsList = js.Array[EntityId]

type EntityPersonaConfigurationList = js.Array[EntityPersonaConfiguration]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER
  - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
type EntityType = _EntityType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalError
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidRequest
  - java.lang.String
*/
type ErrorCode = _ErrorCode | java.lang.String

type ErrorMessage = java.lang.String

type ExcludeMimeTypesList = js.Array[MimeType]

type ExcludeSharedDrivesList = js.Array[SharedDriveId]

type ExcludeUserAccountsList = js.Array[UserAccount]

type ExperienceEndpoints = js.Array[ExperienceEndpoint]

type ExperienceEntitiesSummaryList = js.Array[ExperienceEntitiesSummary]

type ExperienceId = java.lang.String

type ExperienceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ExperienceStatus = _ExperienceStatus | java.lang.String

type ExperiencesSummaryList = js.Array[ExperiencesSummary]

type FacetList = js.Array[Facet]

type FacetResultList = js.Array[FacetResult]

type FailedEntityList = js.Array[FailedEntity]

type FailureReason = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CSV
  - typingsJapgolly.awsSdk.awsSdkStrings.CSV_WITH_HEADER
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type FaqFileFormat = _FaqFileFormat | java.lang.String

type FaqId = java.lang.String

type FaqIdsList = js.Array[FaqId]

type FaqName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type FaqStatus = _FaqStatus | java.lang.String

type FaqSummaryItems = js.Array[FaqSummary]

type FeedbackToken = java.lang.String

type FileSystemId = java.lang.String

type FolderId = java.lang.String

type FolderIdList = js.Array[FolderId]

type FsxFileSystemType = WINDOWS | java.lang.String

type GroupAttributeField = java.lang.String

type GroupId = java.lang.String

type GroupOrderingIdSummaries = js.Array[GroupOrderingIdSummary]

type Groups = js.Array[PrincipalName]

type HierarchicalPrincipalList = js.Array[HierarchicalPrincipal]

type HighlightList = js.Array[Highlight]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - typingsJapgolly.awsSdk.awsSdkStrings.THESAURUS_SYNONYM
  - java.lang.String
*/
type HighlightType = _HighlightType | java.lang.String

type Host = java.lang.String

type IdentityAttributeName = java.lang.String

type Importance = Double

type IndexConfigurationSummaryList = js.Array[IndexConfigurationSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEVELOPER_EDITION
  - typingsJapgolly.awsSdk.awsSdkStrings.ENTERPRISE_EDITION
  - java.lang.String
*/
type IndexEdition = _IndexEdition | java.lang.String

type IndexFieldName = java.lang.String

type IndexId = java.lang.String

type IndexName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM_UPDATING
  - java.lang.String
*/
type IndexStatus = _IndexStatus | java.lang.String

type IndexedQuestionAnswersCount = Double

type IndexedTextBytes = Double

type IndexedTextDocumentsCount = Double

type InlineCustomDocumentEnrichmentConfigurationList = js.Array[InlineCustomDocumentEnrichmentConfiguration]

type Integer = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.THIS_MONTH
  - typingsJapgolly.awsSdk.awsSdkStrings.THIS_WEEK
  - typingsJapgolly.awsSdk.awsSdkStrings.ONE_WEEK_AGO
  - typingsJapgolly.awsSdk.awsSdkStrings.TWO_WEEKS_AGO
  - typingsJapgolly.awsSdk.awsSdkStrings.ONE_MONTH_AGO
  - typingsJapgolly.awsSdk.awsSdkStrings.TWO_MONTHS_AGO
  - java.lang.String
*/
type Interval = _Interval | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMMENTS
  - typingsJapgolly.awsSdk.awsSdkStrings.ATTACHMENTS
  - typingsJapgolly.awsSdk.awsSdkStrings.WORKLOGS
  - java.lang.String
*/
type IssueSubEntity = _IssueSubEntity | java.lang.String

type IssueSubEntityFilter = js.Array[IssueSubEntity]

type IssueType = js.Array[String]

type Issuer = java.lang.String

type JiraAccountUrl = java.lang.String

type JiraStatus = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.URL
  - typingsJapgolly.awsSdk.awsSdkStrings.SECRET_MANAGER
  - java.lang.String
*/
type KeyLocation = _KeyLocation | java.lang.String

type KmsKeyId = java.lang.String

type LambdaArn = java.lang.String

type LanguageCode = java.lang.String

type ListOfGroupSummaries = js.Array[GroupSummary]

type Long = Double

type LookBackPeriod = Double

type MaxContentSizePerPageInMegaBytes = Double

type MaxLinksPerPage = Double

type MaxResultsIntegerForListAccessControlConfigurationsRequest = Double

type MaxResultsIntegerForListDataSourceSyncJobsRequest = Double

type MaxResultsIntegerForListDataSourcesRequest = Double

type MaxResultsIntegerForListEntityPersonasRequest = Double

type MaxResultsIntegerForListExperiencesRequest = Double

type MaxResultsIntegerForListFaqsRequest = Double

type MaxResultsIntegerForListIndicesRequest = Double

type MaxResultsIntegerForListPrincipalsRequest = Double

type MaxResultsIntegerForListQuerySuggestionsBlockLists = Double

type MaxResultsIntegerForListThesauriRequest = Double

type MaxUrlsPerMinuteCrawlRate = Double

type MemberGroups = js.Array[MemberGroup]

type MemberUsers = js.Array[MemberUser]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.QUERIES_BY_COUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.QUERIES_BY_ZERO_CLICK_RATE
  - typingsJapgolly.awsSdk.awsSdkStrings.QUERIES_BY_ZERO_RESULT_RATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DOCS_BY_CLICK_COUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.AGG_QUERY_DOC_METRICS
  - typingsJapgolly.awsSdk.awsSdkStrings.TREND_QUERY_DOC_METRICS
  - java.lang.String
*/
type MetricType = _MetricType | java.lang.String

type MetricValue = java.lang.String

type MimeType = java.lang.String

type MinimumNumberOfQueryingUsers = Double

type MinimumQueryCount = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.LEARN_ONLY
  - java.lang.String
*/
type Mode = _Mode | java.lang.String

type NameType = java.lang.String

type NextToken = java.lang.String

type ObjectBoolean = scala.Boolean

type OneDriveUser = java.lang.String

type OneDriveUserList = js.Array[OneDriveUser]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type Order = _Order | java.lang.String

type OrganizationId = java.lang.String

type OrganizationName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OWNER
  - typingsJapgolly.awsSdk.awsSdkStrings.VIEWER
  - java.lang.String
*/
type Persona = _Persona | java.lang.String

type PersonasSummaryList = js.Array[PersonasSummary]

type Port = Double

type PrincipalList = js.Array[Principal]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.PROCESSING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type PrincipalMappingStatus = _PrincipalMappingStatus | java.lang.String

type PrincipalName = java.lang.String

type PrincipalOrderingId = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER
  - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
type PrincipalType = _PrincipalType | java.lang.String

type PrivateChannelFilter = js.Array[String]

type Project = js.Array[String]

type PublicChannelFilter = js.Array[String]

type QueryCapacityUnit = Double

type QueryId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DOUBLE_QUOTES
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type QueryIdentifiersEnclosingOption = _QueryIdentifiersEnclosingOption | java.lang.String

type QueryResultItemList = js.Array[QueryResultItem]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.QUESTION_ANSWER
  - typingsJapgolly.awsSdk.awsSdkStrings.ANSWER
  - java.lang.String
*/
type QueryResultType = _QueryResultType | java.lang.String

type QuerySuggestionsBlockListId = java.lang.String

type QuerySuggestionsBlockListName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE_BUT_UPDATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type QuerySuggestionsBlockListStatus = _QuerySuggestionsBlockListStatus | java.lang.String

type QuerySuggestionsBlockListSummaryItems = js.Array[QuerySuggestionsBlockListSummary]

type QuerySuggestionsId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type QuerySuggestionsStatus = _QuerySuggestionsStatus | java.lang.String

type QueryText = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.DENY
  - java.lang.String
*/
type ReadAccessType = _ReadAccessType | java.lang.String

type RelevanceFeedbackList = js.Array[RelevanceFeedback]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RELEVANT
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_RELEVANT
  - java.lang.String
*/
type RelevanceType = _RelevanceType | java.lang.String

type RepositoryName = java.lang.String

type RepositoryNames = js.Array[RepositoryName]

type ResultId = java.lang.String

type RoleArn = java.lang.String

type S3BucketName = java.lang.String

type S3ObjectKey = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE_USER
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_USER
  - java.lang.String
*/
type SalesforceChatterFeedIncludeFilterType = _SalesforceChatterFeedIncludeFilterType | java.lang.String

type SalesforceChatterFeedIncludeFilterTypes = js.Array[SalesforceChatterFeedIncludeFilterType]

type SalesforceCustomKnowledgeArticleTypeConfigurationList = js.Array[SalesforceCustomKnowledgeArticleTypeConfiguration]

type SalesforceCustomKnowledgeArticleTypeName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DRAFT
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLISHED
  - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVED
  - java.lang.String
*/
type SalesforceKnowledgeArticleState = _SalesforceKnowledgeArticleState | java.lang.String

type SalesforceKnowledgeArticleStateList = js.Array[SalesforceKnowledgeArticleState]

type SalesforceStandardObjectConfigurationList = js.Array[SalesforceStandardObjectConfiguration]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.CAMPAIGN
  - typingsJapgolly.awsSdk.awsSdkStrings.CASE
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACT
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTRACT
  - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
  - typingsJapgolly.awsSdk.awsSdkStrings.IDEA
  - typingsJapgolly.awsSdk.awsSdkStrings.LEAD
  - typingsJapgolly.awsSdk.awsSdkStrings.OPPORTUNITY
  - typingsJapgolly.awsSdk.awsSdkStrings.PARTNER
  - typingsJapgolly.awsSdk.awsSdkStrings.PRICEBOOK
  - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCT
  - typingsJapgolly.awsSdk.awsSdkStrings.PROFILE
  - typingsJapgolly.awsSdk.awsSdkStrings.SOLUTION
  - typingsJapgolly.awsSdk.awsSdkStrings.TASK
  - typingsJapgolly.awsSdk.awsSdkStrings.USER
  - java.lang.String
*/
type SalesforceStandardObjectName = _SalesforceStandardObjectName | java.lang.String

type ScanSchedule = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VERY_HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
  - typingsJapgolly.awsSdk.awsSdkStrings.LOW
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_AVAILABLE
  - java.lang.String
*/
type ScoreConfidence = _ScoreConfidence | java.lang.String

type SecretArn = java.lang.String

type SecurityGroupIdList = js.Array[VpcSecurityGroupId]

type SeedUrl = java.lang.String

type SeedUrlList = js.Array[SeedUrl]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTP_BASIC
  - typingsJapgolly.awsSdk.awsSdkStrings.OAUTH2
  - java.lang.String
*/
type ServiceNowAuthenticationType = _ServiceNowAuthenticationType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LONDON
  - typingsJapgolly.awsSdk.awsSdkStrings.OTHERS
  - java.lang.String
*/
type ServiceNowBuildVersionType = _ServiceNowBuildVersionType | java.lang.String

type ServiceNowHostUrl = java.lang.String

type ServiceNowKnowledgeArticleFilterQuery = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTP_BASIC
  - typingsJapgolly.awsSdk.awsSdkStrings.OAUTH2
  - java.lang.String
*/
type SharePointOnlineAuthenticationType = _SharePointOnlineAuthenticationType | java.lang.String

type SharePointUrlList = js.Array[Url]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SHAREPOINT_2013
  - typingsJapgolly.awsSdk.awsSdkStrings.SHAREPOINT_2016
  - typingsJapgolly.awsSdk.awsSdkStrings.SHAREPOINT_ONLINE
  - typingsJapgolly.awsSdk.awsSdkStrings.SHAREPOINT_2019
  - java.lang.String
*/
type SharePointVersion = _SharePointVersion | java.lang.String

type SharedDriveId = java.lang.String

type SinceCrawlDate = java.lang.String

type SiteId = java.lang.String

type SiteMap = java.lang.String

type SiteMapsList = js.Array[SiteMap]

type SiteUrl = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC_CHANNEL
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE_CHANNEL
  - typingsJapgolly.awsSdk.awsSdkStrings.GROUP_MESSAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.DIRECT_MESSAGE
  - java.lang.String
*/
type SlackEntity = _SlackEntity | java.lang.String

type SlackEntityList = js.Array[SlackEntity]

type SnapshotsDataHeaderFields = js.Array[String]

type SnapshotsDataRecord = js.Array[String]

type SnapshotsDataRecords = js.Array[SnapshotsDataRecord]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DESC
  - typingsJapgolly.awsSdk.awsSdkStrings.ASC
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type SpellCorrectedQueryList = js.Array[SpellCorrectedQuery]

type StorageCapacityUnit = Double

type String = java.lang.String

type StringList = js.Array[String]

type SubnetId = java.lang.String

type SubnetIdList = js.Array[SubnetId]

type SuggestedQueryText = java.lang.String

type SuggestionHighlightList = js.Array[SuggestionHighlight]

type SuggestionList = js.Array[Suggestion]

type SuggestionQueryText = java.lang.String

type TableName = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TeamId = java.lang.String

type TenantDomain = java.lang.String

type ThesaurusId = java.lang.String

type ThesaurusName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE_BUT_UPDATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ThesaurusStatus = _ThesaurusStatus | java.lang.String

type ThesaurusSummaryItems = js.Array[ThesaurusSummary]

type Timestamp = js.Date

type Title = java.lang.String

type Token = java.lang.String

type TopDocumentAttributeValueCountPairsSize = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SAAS
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_PREMISE
  - java.lang.String
*/
type Type = _Type | java.lang.String

type Url = java.lang.String

type UserAccount = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ATTRIBUTE_FILTER
  - typingsJapgolly.awsSdk.awsSdkStrings.USER_TOKEN
  - java.lang.String
*/
type UserContextPolicy = _UserContextPolicy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_SSO
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type UserGroupResolutionMode = _UserGroupResolutionMode | java.lang.String

type UserId = java.lang.String

type UserNameAttributeField = java.lang.String

type UserTokenConfigurationList = js.Array[UserTokenConfiguration]

type ValueImportanceMap = StringDictionary[Importance]

type ValueImportanceMapKey = java.lang.String

type VisitorId = java.lang.String

type VpcSecurityGroupId = java.lang.String

type WarningCode = QUERY_LANGUAGE_INVALID_SYNTAX | java.lang.String

type WarningList = js.Array[Warning]

type WarningMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HOST_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBDOMAINS
  - typingsJapgolly.awsSdk.awsSdkStrings.EVERYTHING
  - java.lang.String
*/
type WebCrawlerMode = _WebCrawlerMode | java.lang.String

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-02-03`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
