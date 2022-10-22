package typingsJapgolly.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.HIERARCHY
import typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
import typingsJapgolly.awsSdk.awsSdkStrings.PATH_TO_ROOT
import typingsJapgolly.awsSdk.awsSdkStrings.PNG
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = java.lang.String

type AccessPolicySummaries = js.Array[AccessPolicySummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVERAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.COUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.MAXIMUM
  - typingsJapgolly.awsSdk.awsSdkStrings.MINIMUM
  - typingsJapgolly.awsSdk.awsSdkStrings.SUM
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_DEVIATION
  - java.lang.String
*/
type AggregateType = _AggregateType | java.lang.String

type AggregateTypes = js.Array[AggregateType]

type AggregatedDoubleValue = Double

type AggregatedValues = js.Array[AggregatedValue]

type AmazonResourceName = java.lang.String

type AssetCompositeModels = js.Array[AssetCompositeModel]

type AssetErrorCode = INTERNAL_FAILURE | java.lang.String

type AssetErrorMessage = java.lang.String

type AssetHierarchies = js.Array[AssetHierarchy]

type AssetIDs = js.Array[ID]

type AssetModelCompositeModelDefinitions = js.Array[AssetModelCompositeModelDefinition]

type AssetModelCompositeModels = js.Array[AssetModelCompositeModel]

type AssetModelHierarchies = js.Array[AssetModelHierarchy]

type AssetModelHierarchyDefinitions = js.Array[AssetModelHierarchyDefinition]

type AssetModelProperties = js.Array[AssetModelProperty]

type AssetModelPropertyDefinitions = js.Array[AssetModelPropertyDefinition]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.PROPAGATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AssetModelState = _AssetModelState | java.lang.String

type AssetModelSummaries = js.Array[AssetModelSummary]

type AssetProperties = js.Array[AssetProperty]

type AssetPropertyAlias = java.lang.String

type AssetPropertyValueHistory = js.Array[AssetPropertyValue]

type AssetPropertyValues = js.Array[AssetPropertyValue]

type AssetRelationshipSummaries = js.Array[AssetRelationshipSummary]

type AssetRelationshipType = HIERARCHY | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AssetState = _AssetState | java.lang.String

type AssetSummaries = js.Array[AssetSummary]

type AssociatedAssetsSummaries = js.Array[AssociatedAssetsSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM
  - typingsJapgolly.awsSdk.awsSdkStrings.SSO
  - java.lang.String
*/
type AuthMode = _AuthMode | java.lang.String

type BatchAssociateProjectAssetsErrors = js.Array[AssetErrorDetails]

type BatchDisassociateProjectAssetsErrors = js.Array[AssetErrorDetails]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type BatchEntryCompletionStatus = _BatchEntryCompletionStatus | java.lang.String

type BatchGetAssetPropertyAggregatesEntries = js.Array[BatchGetAssetPropertyAggregatesEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotFoundException
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidRequestException
  - typingsJapgolly.awsSdk.awsSdkStrings.AccessDeniedException
  - java.lang.String
*/
type BatchGetAssetPropertyAggregatesErrorCode = _BatchGetAssetPropertyAggregatesErrorCode | java.lang.String

type BatchGetAssetPropertyAggregatesErrorEntries = js.Array[BatchGetAssetPropertyAggregatesErrorEntry]

type BatchGetAssetPropertyAggregatesMaxResults = Double

type BatchGetAssetPropertyAggregatesSkippedEntries = js.Array[BatchGetAssetPropertyAggregatesSkippedEntry]

type BatchGetAssetPropertyAggregatesSuccessEntries = js.Array[BatchGetAssetPropertyAggregatesSuccessEntry]

type BatchGetAssetPropertyValueEntries = js.Array[BatchGetAssetPropertyValueEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotFoundException
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidRequestException
  - typingsJapgolly.awsSdk.awsSdkStrings.AccessDeniedException
  - java.lang.String
*/
type BatchGetAssetPropertyValueErrorCode = _BatchGetAssetPropertyValueErrorCode | java.lang.String

type BatchGetAssetPropertyValueErrorEntries = js.Array[BatchGetAssetPropertyValueErrorEntry]

type BatchGetAssetPropertyValueHistoryEntries = js.Array[BatchGetAssetPropertyValueHistoryEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotFoundException
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidRequestException
  - typingsJapgolly.awsSdk.awsSdkStrings.AccessDeniedException
  - java.lang.String
*/
type BatchGetAssetPropertyValueHistoryErrorCode = _BatchGetAssetPropertyValueHistoryErrorCode | java.lang.String

type BatchGetAssetPropertyValueHistoryErrorEntries = js.Array[BatchGetAssetPropertyValueHistoryErrorEntry]

type BatchGetAssetPropertyValueHistoryMaxResults = Double

type BatchGetAssetPropertyValueHistorySkippedEntries = js.Array[BatchGetAssetPropertyValueHistorySkippedEntry]

type BatchGetAssetPropertyValueHistorySuccessEntries = js.Array[BatchGetAssetPropertyValueHistorySuccessEntry]

type BatchGetAssetPropertyValueSkippedEntries = js.Array[BatchGetAssetPropertyValueSkippedEntry]

type BatchGetAssetPropertyValueSuccessEntries = js.Array[BatchGetAssetPropertyValueSuccessEntry]

type BatchPutAssetPropertyErrorEntries = js.Array[BatchPutAssetPropertyErrorEntry]

type BatchPutAssetPropertyErrors = js.Array[BatchPutAssetPropertyError]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotFoundException
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidRequestException
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalFailureException
  - typingsJapgolly.awsSdk.awsSdkStrings.ServiceUnavailableException
  - typingsJapgolly.awsSdk.awsSdkStrings.ThrottlingException
  - typingsJapgolly.awsSdk.awsSdkStrings.LimitExceededException
  - typingsJapgolly.awsSdk.awsSdkStrings.ConflictingOperationException
  - typingsJapgolly.awsSdk.awsSdkStrings.TimestampOutOfRangeException
  - typingsJapgolly.awsSdk.awsSdkStrings.AccessDeniedException
  - java.lang.String
*/
type BatchPutAssetPropertyValueErrorCode = _BatchPutAssetPropertyValueErrorCode | java.lang.String

type Bucket = java.lang.String

type CapabilityConfiguration = java.lang.String

type CapabilityNamespace = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_SYNC
  - typingsJapgolly.awsSdk.awsSdkStrings.OUT_OF_SYNC
  - typingsJapgolly.awsSdk.awsSdkStrings.SYNC_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type CapabilitySyncStatus = _CapabilitySyncStatus | java.lang.String

type ClientToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALIAS
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSET_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.PROPERTY_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMESTAMP_SECONDS
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMESTAMP_NANO_OFFSET
  - typingsJapgolly.awsSdk.awsSdkStrings.QUALITY
  - typingsJapgolly.awsSdk.awsSdkStrings.VALUE
  - java.lang.String
*/
type ColumnName = _ColumnName | java.lang.String

type ColumnNames = js.Array[ColumnName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EDGE
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOUD
  - java.lang.String
*/
type ComputeLocation = _ComputeLocation | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type ConfigurationState = _ConfigurationState | java.lang.String

type CoreDeviceThingName = java.lang.String

type DashboardDefinition = java.lang.String

type DashboardSummaries = js.Array[DashboardSummary]

type DefaultValue = java.lang.String

type Description = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INCOMPATIBLE_COMPUTE_LOCATION
  - typingsJapgolly.awsSdk.awsSdkStrings.INCOMPATIBLE_FORWARDING_CONFIGURATION
  - java.lang.String
*/
type DetailedErrorCode = _DetailedErrorCode | java.lang.String

type DetailedErrorMessage = java.lang.String

type DetailedErrors = js.Array[DetailedError]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type DisassociatedDataStorageState = _DisassociatedDataStorageState | java.lang.String

type Email = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SITEWISE_DEFAULT_ENCRYPTION
  - typingsJapgolly.awsSdk.awsSdkStrings.KMS_BASED_ENCRYPTION
  - java.lang.String
*/
type EncryptionType = _EncryptionType | java.lang.String

type EntryId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - java.lang.String
*/
type ErrorCode = _ErrorCode | java.lang.String

type ErrorMessage = java.lang.String

type Expression = java.lang.String

type ExpressionVariables = js.Array[ExpressionVariable]

type Files = js.Array[File]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - java.lang.String
*/
type ForwardingConfigState = _ForwardingConfigState | java.lang.String

type GatewayCapabilitySummaries = js.Array[GatewayCapabilitySummary]

type GatewaySummaries = js.Array[GatewaySummary]

type ID = java.lang.String

type IDs = js.Array[ID]

type IdentityId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER
  - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM
  - java.lang.String
*/
type IdentityType = _IdentityType | java.lang.String

type ImageFileData = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type ImageFileType = PNG | java.lang.String

type InterpolatedAssetPropertyValues = js.Array[InterpolatedAssetPropertyValue]

type InterpolationType = java.lang.String

type Interval = java.lang.String

type IntervalInSeconds = Double

type IntervalWindowInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED_WITH_FAILURES
  - java.lang.String
*/
type JobStatus = _JobStatus | java.lang.String

type JobSummaries = js.Array[JobSummary]

type KmsKeyId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.TOP_LEVEL
  - java.lang.String
*/
type ListAssetsFilter = _ListAssetsFilter | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED_WITH_FAILURES
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type ListBulkImportJobsFilter = _ListBulkImportJobsFilter | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISASSOCIATED
  - java.lang.String
*/
type ListTimeSeriesType = _ListTimeSeriesType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INFO
  - typingsJapgolly.awsSdk.awsSdkStrings.OFF
  - java.lang.String
*/
type LoggingLevel = _LoggingLevel | java.lang.String

type Macro = java.lang.String

type MaxInterpolatedResults = Double

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.LIMIT_EXCEEDED
  - java.lang.String
*/
type MonitorErrorCode = _MonitorErrorCode | java.lang.String

type MonitorErrorMessage = java.lang.String

type Name = java.lang.String

type NextToken = java.lang.String

type NumberOfDays = Double

type Offset = java.lang.String

type OffsetInNanos = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ADMINISTRATOR
  - typingsJapgolly.awsSdk.awsSdkStrings.VIEWER
  - java.lang.String
*/
type Permission = _Permission | java.lang.String

type PortalClientId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type PortalState = _PortalState | java.lang.String

type PortalSummaries = js.Array[PortalSummary]

type ProjectSummaries = js.Array[ProjectSummary]

type PropertyAlias = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING
  - typingsJapgolly.awsSdk.awsSdkStrings.INTEGER
  - typingsJapgolly.awsSdk.awsSdkStrings.DOUBLE
  - typingsJapgolly.awsSdk.awsSdkStrings.BOOLEAN
  - typingsJapgolly.awsSdk.awsSdkStrings.STRUCT
  - java.lang.String
*/
type PropertyDataType = _PropertyDataType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type PropertyNotificationState = _PropertyNotificationState | java.lang.String

type PropertyNotificationTopic = java.lang.String

type PropertyUnit = java.lang.String

type PropertyValueBooleanValue = Boolean

type PropertyValueDoubleValue = Double

type PropertyValueIntegerValue = Double

type PropertyValueStringValue = java.lang.String

type PutAssetPropertyValueEntries = js.Array[PutAssetPropertyValueEntry]

type Qualities = js.Array[Quality]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GOOD
  - typingsJapgolly.awsSdk.awsSdkStrings.BAD
  - typingsJapgolly.awsSdk.awsSdkStrings.UNCERTAIN
  - java.lang.String
*/
type Quality = _Quality | java.lang.String

type Resolution = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PORTAL
  - typingsJapgolly.awsSdk.awsSdkStrings.PROJECT
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

type SSOApplicationId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SITEWISE_DEFAULT_STORAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.MULTI_LAYER_STORAGE
  - java.lang.String
*/
type StorageType = _StorageType | java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type TimeInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type TimeOrdering = _TimeOrdering | java.lang.String

type TimeSeriesId = java.lang.String

type TimeSeriesSummaries = js.Array[TimeSeriesSummary]

type Timestamp = js.Date

type Timestamps = js.Array[TimeInNanos]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PARENT
  - typingsJapgolly.awsSdk.awsSdkStrings.CHILD
  - java.lang.String
*/
type TraversalDirection = _TraversalDirection | java.lang.String

type TraversalType = PATH_TO_ROOT | java.lang.String

type Unlimited = Boolean

type Url = java.lang.String

type VariableName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-12-02`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
