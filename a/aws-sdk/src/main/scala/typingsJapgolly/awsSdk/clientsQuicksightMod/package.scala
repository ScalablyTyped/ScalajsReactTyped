package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.GROUP_NAME
import typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
import typingsJapgolly.awsSdk.awsSdkStrings.PARENT_FOLDER_ARN
import typingsJapgolly.awsSdk.awsSdkStrings.QUICKSIGHT
import typingsJapgolly.awsSdk.awsSdkStrings.QUICKSIGHT_USER
import typingsJapgolly.awsSdk.awsSdkStrings.SHARED
import typingsJapgolly.awsSdk.awsSdkStrings.StartsWith
import typingsJapgolly.awsSdk.awsSdkStrings.StringEquals_
import typingsJapgolly.awsSdk.awsSdkStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActionList = js.Array[String]

type ActiveIAMPolicyAssignmentList = js.Array[ActiveIAMPolicyAssignment]

type AdditionalDashboardIdList = js.Array[RestrictiveResourceId]

type AliasName = java.lang.String

type AnalysisErrorList = js.Array[AnalysisError]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.SOURCE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_SET_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.PARAMETER_VALUE_INCOMPATIBLE
  - typingsJapgolly.awsSdk.awsSdkStrings.PARAMETER_TYPE_INVALID
  - typingsJapgolly.awsSdk.awsSdkStrings.PARAMETER_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.COLUMN_TYPE_MISMATCH
  - typingsJapgolly.awsSdk.awsSdkStrings.COLUMN_GEOGRAPHIC_ROLE_MISMATCH
  - typingsJapgolly.awsSdk.awsSdkStrings.COLUMN_REPLACEMENT_MISSING
  - java.lang.String
*/
type AnalysisErrorType = _AnalysisErrorType | java.lang.String

type AnalysisFilterAttribute = QUICKSIGHT_USER | java.lang.String

type AnalysisName = java.lang.String

type AnalysisSearchFilterList = js.Array[AnalysisSearchFilter]

type AnalysisSummaryList = js.Array[AnalysisSummary]

type Arn = java.lang.String

type ArnList = js.Array[Arn]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DRAFT
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AssignmentStatus = _AssignmentStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_AND_QUICKSIGHT
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE_DIRECTORY
  - java.lang.String
*/
type AuthenticationMethodOption = _AuthenticationMethodOption | java.lang.String

type AwsAccountId = java.lang.String

type AwsAndAccountId = java.lang.String

type Boolean = scala.Boolean

type CIDR = java.lang.String

type CalculatedColumnList = js.Array[CalculatedColumn]

type Catalog = java.lang.String

type ClusterId = java.lang.String

type ColorList = js.Array[HexColor]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING
  - typingsJapgolly.awsSdk.awsSdkStrings.INTEGER
  - typingsJapgolly.awsSdk.awsSdkStrings.DECIMAL
  - typingsJapgolly.awsSdk.awsSdkStrings.DATETIME
  - java.lang.String
*/
type ColumnDataType = _ColumnDataType | java.lang.String

type ColumnDescriptiveText = java.lang.String

type ColumnGroupColumnSchemaList = js.Array[ColumnGroupColumnSchema]

type ColumnGroupList = js.Array[ColumnGroup]

type ColumnGroupName = java.lang.String

type ColumnGroupSchemaList = js.Array[ColumnGroupSchema]

type ColumnId = java.lang.String

type ColumnLevelPermissionRuleList = js.Array[ColumnLevelPermissionRule]

type ColumnList = js.Array[ColumnName]

type ColumnName = java.lang.String

type ColumnNameList = js.Array[String]

type ColumnSchemaList = js.Array[ColumnSchema]

type ColumnTagList = js.Array[ColumnTag]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COLUMN_GEOGRAPHIC_ROLE
  - typingsJapgolly.awsSdk.awsSdkStrings.COLUMN_DESCRIPTION
  - java.lang.String
*/
type ColumnTagName = _ColumnTagName | java.lang.String

type ColumnTagNames = js.Array[ColumnTagName]

type CopySourceArn = java.lang.String

type CustomSqlName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type DashboardBehavior = _DashboardBehavior | java.lang.String

type DashboardErrorList = js.Array[DashboardError]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.SOURCE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_SET_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.PARAMETER_VALUE_INCOMPATIBLE
  - typingsJapgolly.awsSdk.awsSdkStrings.PARAMETER_TYPE_INVALID
  - typingsJapgolly.awsSdk.awsSdkStrings.PARAMETER_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.COLUMN_TYPE_MISMATCH
  - typingsJapgolly.awsSdk.awsSdkStrings.COLUMN_GEOGRAPHIC_ROLE_MISMATCH
  - typingsJapgolly.awsSdk.awsSdkStrings.COLUMN_REPLACEMENT_MISSING
  - java.lang.String
*/
type DashboardErrorType = _DashboardErrorType | java.lang.String

type DashboardFilterAttribute = QUICKSIGHT_USER | java.lang.String

type DashboardName = java.lang.String

type DashboardSearchFilterList = js.Array[DashboardSearchFilter]

type DashboardSummaryList = js.Array[DashboardSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPANDED
  - typingsJapgolly.awsSdk.awsSdkStrings.COLLAPSED
  - java.lang.String
*/
type DashboardUIState = _DashboardUIState | java.lang.String

type DashboardVersionSummaryList = js.Array[DashboardVersionSummary]

type DataSetArnsList = js.Array[Arn]

type DataSetConfigurationList = js.Array[DataSetConfiguration]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SPICE
  - typingsJapgolly.awsSdk.awsSdkStrings.DIRECT_QUERY
  - java.lang.String
*/
type DataSetImportMode = _DataSetImportMode | java.lang.String

type DataSetName = java.lang.String

type DataSetReferenceList = js.Array[DataSetReference]

type DataSetSummaryList = js.Array[DataSetSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.COPY_SOURCE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMEOUT
  - typingsJapgolly.awsSdk.awsSdkStrings.ENGINE_VERSION_NOT_SUPPORTED
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN_HOST
  - typingsJapgolly.awsSdk.awsSdkStrings.GENERIC_SQL_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFLICT
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type DataSourceErrorInfoType = _DataSourceErrorInfoType | java.lang.String

type DataSourceList = js.Array[DataSource]

type DataSourceParametersList = js.Array[DataSourceParameters]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ADOBE_ANALYTICS
  - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_ELASTICSEARCH
  - typingsJapgolly.awsSdk.awsSdkStrings.ATHENA
  - typingsJapgolly.awsSdk.awsSdkStrings.AURORA
  - typingsJapgolly.awsSdk.awsSdkStrings.AURORA_POSTGRESQL
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_IOT_ANALYTICS
  - typingsJapgolly.awsSdk.awsSdkStrings.GITHUB
  - typingsJapgolly.awsSdk.awsSdkStrings.JIRA
  - typingsJapgolly.awsSdk.awsSdkStrings.MARIADB
  - typingsJapgolly.awsSdk.awsSdkStrings.MYSQL
  - typingsJapgolly.awsSdk.awsSdkStrings.ORACLE
  - typingsJapgolly.awsSdk.awsSdkStrings.POSTGRESQL
  - typingsJapgolly.awsSdk.awsSdkStrings.PRESTO
  - typingsJapgolly.awsSdk.awsSdkStrings.REDSHIFT
  - typingsJapgolly.awsSdk.awsSdkStrings.S3
  - typingsJapgolly.awsSdk.awsSdkStrings.SALESFORCE
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICENOW
  - typingsJapgolly.awsSdk.awsSdkStrings.SNOWFLAKE
  - typingsJapgolly.awsSdk.awsSdkStrings.SPARK
  - typingsJapgolly.awsSdk.awsSdkStrings.SQLSERVER
  - typingsJapgolly.awsSdk.awsSdkStrings.TERADATA
  - typingsJapgolly.awsSdk.awsSdkStrings.TWITTER
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMESTREAM
  - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_OPENSEARCH
  - typingsJapgolly.awsSdk.awsSdkStrings.EXASOL
  - java.lang.String
*/
type DataSourceType = _DataSourceType | java.lang.String

type Database = java.lang.String

type DateTimeParameterList = js.Array[DateTimeParameter]

type DecimalParameterList = js.Array[DecimalParameter]

type Delimiter = java.lang.String

type Domain = java.lang.String

type Double = scala.Double

type DoubleList = js.Array[Double]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - typingsJapgolly.awsSdk.awsSdkStrings.ENTERPRISE
  - typingsJapgolly.awsSdk.awsSdkStrings.ENTERPRISE_AND_Q
  - java.lang.String
*/
type Edition = _Edition | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM
  - typingsJapgolly.awsSdk.awsSdkStrings.QUICKSIGHT
  - typingsJapgolly.awsSdk.awsSdkStrings.ANONYMOUS
  - java.lang.String
*/
type EmbeddingIdentityType = _EmbeddingIdentityType | java.lang.String

type EmbeddingUrl = java.lang.String

type EntryPath = java.lang.String

type EntryPoint = java.lang.String

type Expression = java.lang.String

type FieldFolderDescription = java.lang.String

type FieldFolderMap = StringDictionary[FieldFolder]

type FieldFolderPath = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CSV
  - typingsJapgolly.awsSdk.awsSdkStrings.TSV
  - typingsJapgolly.awsSdk.awsSdkStrings.CLF
  - typingsJapgolly.awsSdk.awsSdkStrings.ELF
  - typingsJapgolly.awsSdk.awsSdkStrings.XLSX
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type FileFormat = _FileFormat | java.lang.String

type FilterOperator = StringEquals_ | java.lang.String

type FolderColumnList = js.Array[String]

type FolderFilterAttribute = PARENT_FOLDER_ARN | java.lang.String

type FolderMemberList = js.Array[MemberIdArnPair]

type FolderName = java.lang.String

type FolderSearchFilterList = js.Array[FolderSearchFilter]

type FolderSummaryList = js.Array[FolderSummary]

type FolderType = SHARED | java.lang.String

type GeoSpatialCountryCode = US | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COUNTRY
  - typingsJapgolly.awsSdk.awsSdkStrings.STATE
  - typingsJapgolly.awsSdk.awsSdkStrings.COUNTY
  - typingsJapgolly.awsSdk.awsSdkStrings.CITY
  - typingsJapgolly.awsSdk.awsSdkStrings.POSTCODE
  - typingsJapgolly.awsSdk.awsSdkStrings.LONGITUDE
  - typingsJapgolly.awsSdk.awsSdkStrings.LATITUDE
  - java.lang.String
*/
type GeoSpatialDataRole = _GeoSpatialDataRole | java.lang.String

type GroupDescription = java.lang.String

type GroupFilterAttribute = GROUP_NAME | java.lang.String

type GroupFilterOperator = StartsWith | java.lang.String

type GroupList = js.Array[Group]

type GroupMemberList = js.Array[GroupMember]

type GroupMemberName = java.lang.String

type GroupName = java.lang.String

type GroupSearchFilterList = js.Array[GroupSearchFilter]

type GroupsList = js.Array[String]

type HexColor = java.lang.String

type Host = java.lang.String

type IAMPolicyAssignmentName = java.lang.String

type IAMPolicyAssignmentSummaryList = js.Array[IAMPolicyAssignmentSummary]

type IdentityMap = StringDictionary[IdentityNameList]

type IdentityName = java.lang.String

type IdentityNameList = js.Array[IdentityName]

type IdentityStore = QUICKSIGHT | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM
  - typingsJapgolly.awsSdk.awsSdkStrings.QUICKSIGHT
  - java.lang.String
*/
type IdentityType = _IdentityType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILURE_TO_ASSUME_ROLE
  - typingsJapgolly.awsSdk.awsSdkStrings.INGESTION_SUPERSEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.INGESTION_CANCELED
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_SET_DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_SET_NOT_SPICE
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_UPLOADED_FILE_DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_MANIFEST_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_TOLERANCE_EXCEPTION
  - typingsJapgolly.awsSdk.awsSdkStrings.SPICE_TABLE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_SET_SIZE_LIMIT_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.ROW_SIZE_LIMIT_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_CAPACITY_LIMIT_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_SOURCE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_ROLE_NOT_AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTION_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.SQL_TABLE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.PERMISSION_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.SSL_CERTIFICATE_VALIDATION_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.OAUTH_TOKEN_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.SOURCE_API_LIMIT_EXCEEDED_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.PASSWORD_AUTHENTICATION_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.SQL_SCHEMA_MISMATCH_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_DATE_FORMAT
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_DATAPREP_SYNTAX
  - typingsJapgolly.awsSdk.awsSdkStrings.SOURCE_RESOURCE_LIMIT_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.SQL_INVALID_PARAMETER_VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.QUERY_TIMEOUT
  - typingsJapgolly.awsSdk.awsSdkStrings.SQL_NUMERIC_OVERFLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.UNRESOLVABLE_HOST
  - typingsJapgolly.awsSdk.awsSdkStrings.UNROUTABLE_HOST
  - typingsJapgolly.awsSdk.awsSdkStrings.SQL_EXCEPTION
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_FILE_INACCESSIBLE
  - typingsJapgolly.awsSdk.awsSdkStrings.IOT_FILE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.IOT_DATA_SET_FILE_EMPTY
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_DATA_SOURCE_CONFIG
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_SOURCE_AUTH_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_SOURCE_CONNECTION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILURE_TO_PROCESS_JSON_FILE
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.REFRESH_SUPPRESSED_BY_EDIT
  - typingsJapgolly.awsSdk.awsSdkStrings.PERMISSION_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.ELASTICSEARCH_CURSOR_NOT_ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.CURSOR_NOT_ENABLED
  - java.lang.String
*/
type IngestionErrorType = _IngestionErrorType | java.lang.String

type IngestionId = java.lang.String

type IngestionMaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MANUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULED
  - java.lang.String
*/
type IngestionRequestSource = _IngestionRequestSource | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INITIAL_INGESTION
  - typingsJapgolly.awsSdk.awsSdkStrings.EDIT
  - typingsJapgolly.awsSdk.awsSdkStrings.INCREMENTAL_REFRESH
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL_REFRESH
  - java.lang.String
*/
type IngestionRequestType = _IngestionRequestType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZED
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type IngestionStatus = _IngestionStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INCREMENTAL_REFRESH
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL_REFRESH
  - java.lang.String
*/
type IngestionType = _IngestionType | java.lang.String

type Ingestions = js.Array[Ingestion]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING
  - typingsJapgolly.awsSdk.awsSdkStrings.INTEGER
  - typingsJapgolly.awsSdk.awsSdkStrings.DECIMAL
  - typingsJapgolly.awsSdk.awsSdkStrings.DATETIME
  - typingsJapgolly.awsSdk.awsSdkStrings.BIT
  - typingsJapgolly.awsSdk.awsSdkStrings.BOOLEAN
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type InputColumnDataType = _InputColumnDataType | java.lang.String

type InputColumnList = js.Array[InputColumn]

type InstanceId = java.lang.String

type IntegerParameterList = js.Array[IntegerParameter]

type IpRestrictionRuleDescription = java.lang.String

type IpRestrictionRuleMap = StringDictionary[IpRestrictionRuleDescription]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INNER
  - typingsJapgolly.awsSdk.awsSdkStrings.OUTER
  - typingsJapgolly.awsSdk.awsSdkStrings.LEFT
  - typingsJapgolly.awsSdk.awsSdkStrings.RIGHT
  - java.lang.String
*/
type JoinType = _JoinType | java.lang.String

type LogicalTableAlias = java.lang.String

type LogicalTableId = java.lang.String

type LogicalTableMap = StringDictionary[LogicalTable]

type Long = scala.Double

type LongList = js.Array[Long]

type MaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DASHBOARD
  - typingsJapgolly.awsSdk.awsSdkStrings.ANALYSIS
  - typingsJapgolly.awsSdk.awsSdkStrings.DATASET
  - java.lang.String
*/
type MemberType = _MemberType | java.lang.String

type Namespace = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PERMISSION_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
  - java.lang.String
*/
type NamespaceErrorType = _NamespaceErrorType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.RETRYABLE_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.NON_RETRYABLE_FAILURE
  - java.lang.String
*/
type NamespaceStatus = _NamespaceStatus | java.lang.String

type Namespaces = js.Array[NamespaceInfoV2]

type NonEmptyString = java.lang.String

type NullableBoolean = scala.Boolean

type OnClause = java.lang.String

type OptionalPort = scala.Double

type OutputColumnList = js.Array[OutputColumn]

type Password = java.lang.String

type Path = js.Array[Arn]

type PhysicalTableId = java.lang.String

type PhysicalTableMap = StringDictionary[PhysicalTable]

type Port = scala.Double

type PositiveInteger = scala.Double

type Principal = java.lang.String

type PrincipalList = js.Array[String]

type ProjectedColumnList = js.Array[String]

type Query = java.lang.String

type RecoveryWindowInDays = scala.Double

type RelationalTableCatalog = java.lang.String

type RelationalTableName = java.lang.String

type RelationalTableSchema = java.lang.String

type ResourceId = java.lang.String

type ResourceName = java.lang.String

type ResourcePermissionList = js.Array[ResourcePermission]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_SUCCESSFUL
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type ResourceStatus = _ResourceStatus | java.lang.String

type RestrictiveResourceId = java.lang.String

type RoleName = java.lang.String

type RoleSessionName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VERSION_1
  - typingsJapgolly.awsSdk.awsSdkStrings.VERSION_2
  - java.lang.String
*/
type RowLevelPermissionFormatVersion = _RowLevelPermissionFormatVersion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GRANT_ACCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DENY_ACCESS
  - java.lang.String
*/
type RowLevelPermissionPolicy = _RowLevelPermissionPolicy | java.lang.String

type RowLevelPermissionTagDelimiter = java.lang.String

type RowLevelPermissionTagRuleList = js.Array[RowLevelPermissionTagRule]

type S3Bucket = java.lang.String

type S3Key = java.lang.String

type SecretArn = java.lang.String

type SessionLifetimeInMinutes = scala.Double

type SessionTagKey = java.lang.String

type SessionTagList = js.Array[SessionTag]

type SessionTagValue = java.lang.String

type SheetList = js.Array[Sheet]

type SiteBaseUrl = java.lang.String

type SqlQuery = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type Status = _Status | java.lang.String

type StatusCode = scala.Double

type String = java.lang.String

type StringList = js.Array[String]

type StringParameterList = js.Array[StringParameter]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TemplateAliasList = js.Array[TemplateAlias]

type TemplateErrorList = js.Array[TemplateError]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SOURCE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_SET_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - java.lang.String
*/
type TemplateErrorType = _TemplateErrorType | java.lang.String

type TemplateName = java.lang.String

type TemplateSummaryList = js.Array[TemplateSummary]

type TemplateVersionSummaryList = js.Array[TemplateVersionSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DOUBLE_QUOTE
  - typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_QUOTE
  - java.lang.String
*/
type TextQualifier = _TextQualifier | java.lang.String

type ThemeAliasList = js.Array[ThemeAlias]

type ThemeErrorList = js.Array[ThemeError]

type ThemeErrorType = INTERNAL_FAILURE | java.lang.String

type ThemeName = java.lang.String

type ThemeSummaryList = js.Array[ThemeSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.QUICKSIGHT
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type ThemeType = _ThemeType | java.lang.String

type ThemeVersionSummaryList = js.Array[ThemeVersionSummary]

type Timestamp = js.Date

type TimestampList = js.Array[js.Date]

type TransformOperationList = js.Array[TransformOperation]

type TypeCastFormat = java.lang.String

type UpdateLinkPermissionList = js.Array[ResourcePermission]

type UpdateResourcePermissionList = js.Array[ResourcePermission]

type UserList = js.Array[User]

type UserName_ = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ADMIN
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTHOR
  - typingsJapgolly.awsSdk.awsSdkStrings.READER
  - typingsJapgolly.awsSdk.awsSdkStrings.RESTRICTED_AUTHOR
  - typingsJapgolly.awsSdk.awsSdkStrings.RESTRICTED_READER
  - java.lang.String
*/
type UserRole = _UserRole | java.lang.String

type Username = java.lang.String

type VersionDescription = java.lang.String

type VersionNumber = scala.Double

type Warehouse = java.lang.String

type WorkGroup = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-04-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
