package typingsJapgolly.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessKeyIdString = java.lang.String

type AuditContextString = java.lang.String

type AuthorizedSessionTagValueList = js.Array[NameString]

type BatchPermissionsFailureList = js.Array[BatchPermissionsFailureEntry]

type BatchPermissionsRequestEntryList = js.Array[BatchPermissionsRequestEntry]

type BooleanNullable = Boolean

type CatalogIdString = java.lang.String

type ColumnLFTagsList = js.Array[ColumnLFTag]

type ColumnNames = js.Array[NameString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - typingsJapgolly.awsSdk.awsSdkStrings.NE
  - typingsJapgolly.awsSdk.awsSdkStrings.LE
  - typingsJapgolly.awsSdk.awsSdkStrings.LT
  - typingsJapgolly.awsSdk.awsSdkStrings.GE
  - typingsJapgolly.awsSdk.awsSdkStrings.GT
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CONTAINS
  - typingsJapgolly.awsSdk.awsSdkStrings.BEGINS_WITH
  - typingsJapgolly.awsSdk.awsSdkStrings.IN
  - typingsJapgolly.awsSdk.awsSdkStrings.BETWEEN
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | java.lang.String

type CredentialTimeoutDurationSecondInteger = Double

type DataCellsFilterList = js.Array[DataCellsFilter]

type DataLakePrincipalList = js.Array[DataLakePrincipal]

type DataLakePrincipalString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CATALOG
  - typingsJapgolly.awsSdk.awsSdkStrings.DATABASE
  - typingsJapgolly.awsSdk.awsSdkStrings.TABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_LOCATION
  - typingsJapgolly.awsSdk.awsSdkStrings.LF_TAG
  - typingsJapgolly.awsSdk.awsSdkStrings.LF_TAG_POLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.LF_TAG_POLICY_DATABASE
  - typingsJapgolly.awsSdk.awsSdkStrings.LF_TAG_POLICY_TABLE
  - java.lang.String
*/
type DataLakeResourceType = _DataLakeResourceType | java.lang.String

type DatabaseLFTagsList = js.Array[TaggedDatabase]

type DateTime = js.Date

type DescriptionString = java.lang.String

type ETagString = java.lang.String

type ErrorMessageString = java.lang.String

type ExpirationTimestamp = js.Date

type Expression = js.Array[LFTag]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_ARN
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLE_ARN
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_MODIFIED
  - java.lang.String
*/
type FieldNameString = _FieldNameString | java.lang.String

type FilterConditionList = js.Array[FilterCondition]

type GetQueryStateRequestQueryIdString = java.lang.String

type GetQueryStatisticsRequestQueryIdString = java.lang.String

type GetWorkUnitResultsRequestQueryIdString = java.lang.String

type GetWorkUnitResultsRequestWorkUnitIdLong = Double

type GetWorkUnitsRequestQueryIdString = java.lang.String

type IAMRoleArn = java.lang.String

type IAMSAMLProviderArn = java.lang.String

type Identifier = java.lang.String

type Integer = Double

type LFTagErrors = js.Array[LFTagError]

type LFTagKey = java.lang.String

type LFTagValue = java.lang.String

type LFTagsList = js.Array[LFTagPair]

type LastModifiedTimestamp = js.Date

type MessageString = java.lang.String

type NameString = java.lang.String

type NullableBoolean = Boolean

type NumberOfBytes = Double

type NumberOfItems = Double

type NumberOfMilliseconds = Double

type ObjectSize = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.GARBAGE_COLLECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type OptimizerType = _OptimizerType | java.lang.String

type PageSize = Double

type PartitionValueString = java.lang.String

type PartitionValuesList = js.Array[PartitionValueString]

type PartitionedTableObjectsList = js.Array[PartitionObjects]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.SELECT
  - typingsJapgolly.awsSdk.awsSdkStrings.ALTER
  - typingsJapgolly.awsSdk.awsSdkStrings.DROP
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.INSERT
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCRIBE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_DATABASE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_TABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_LOCATION_ACCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_TAG
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATE
  - java.lang.String
*/
type Permission = _Permission | java.lang.String

type PermissionList = js.Array[Permission]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COLUMN_PERMISSION
  - typingsJapgolly.awsSdk.awsSdkStrings.CELL_FILTER_PERMISSION
  - java.lang.String
*/
type PermissionType = _PermissionType | java.lang.String

type PermissionTypeList = js.Array[PermissionType]

type PredicateString = java.lang.String

type PrincipalPermissionsList = js.Array[PrincipalPermissions]

type PrincipalResourcePermissionsList = js.Array[PrincipalResourcePermissions]

type QueryIdString = java.lang.String

type QueryParameterMap = StringDictionary[String]

type QueryPlanningContextDatabaseNameString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.WORKUNITS_AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.FINISHED
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type QueryStateString = _QueryStateString | java.lang.String

type RAMResourceShareArn = java.lang.String

type ResourceArnString = java.lang.String

type ResourceInfoList = js.Array[ResourceInfo]

type ResourceShareList = js.Array[RAMResourceShareArn]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FOREIGN
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type ResourceShareType = _ResourceShareType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DATABASE
  - typingsJapgolly.awsSdk.awsSdkStrings.TABLE
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

type Result = java.lang.String

type ResultStream = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String | Readable

type SAMLAssertionString = java.lang.String

type SecretAccessKeyString = java.lang.String

type SessionTokenString = java.lang.String

type StorageOptimizerConfig = StringDictionary[StorageOptimizerConfigValue]

type StorageOptimizerConfigKey = java.lang.String

type StorageOptimizerConfigMap = StringDictionary[StorageOptimizerConfig]

type StorageOptimizerConfigValue = java.lang.String

type StorageOptimizerList = js.Array[StorageOptimizer]

type String = java.lang.String

type StringValue = java.lang.String

type StringValueList = js.Array[StringValue]

type SyntheticGetWorkUnitResultsRequestWorkUnitTokenString = java.lang.String

type SyntheticStartQueryPlanningRequestQueryString = java.lang.String

type TableLFTagsList = js.Array[TaggedTable]

type TableObjectList = js.Array[TableObject]

type TagValueList = js.Array[LFTagValue]

type Timestamp = js.Date

type Token = java.lang.String

type TokenString = java.lang.String

type TransactionDescriptionList = js.Array[TransactionDescription]

type TransactionIdString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.COMMITTED
  - typingsJapgolly.awsSdk.awsSdkStrings.ABORTED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMMIT_IN_PROGRESS
  - java.lang.String
*/
type TransactionStatus = _TransactionStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.COMMITTED
  - typingsJapgolly.awsSdk.awsSdkStrings.ABORTED
  - java.lang.String
*/
type TransactionStatusFilter = _TransactionStatusFilter | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READ_AND_WRITE
  - typingsJapgolly.awsSdk.awsSdkStrings.READ_ONLY
  - java.lang.String
*/
type TransactionType = _TransactionType | java.lang.String

type TrueFalseString = java.lang.String

type TrustedResourceOwners = js.Array[CatalogIdString]

type URI = java.lang.String

type ValueString = java.lang.String

type ValueStringList = js.Array[ValueString]

type VirtualObjectList = js.Array[VirtualObject]

type WorkUnitIdLong = Double

type WorkUnitRangeList = js.Array[WorkUnitRange]

type WorkUnitTokenString = java.lang.String

type WriteOperationList = js.Array[WriteOperation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-03-31`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
