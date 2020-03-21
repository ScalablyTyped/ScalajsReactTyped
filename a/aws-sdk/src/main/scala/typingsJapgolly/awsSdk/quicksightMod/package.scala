package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object quicksightMod {
  type ActionList = js.Array[typingsJapgolly.awsSdk.quicksightMod.String]
  type ActiveIAMPolicyAssignmentList = js.Array[typingsJapgolly.awsSdk.quicksightMod.ActiveIAMPolicyAssignment]
  type AliasName = java.lang.String
  type Arn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DRAFT
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AssignmentStatus = typingsJapgolly.awsSdk.quicksightMod._AssignmentStatus | java.lang.String
  type AwsAccountId = java.lang.String
  type Boolean = scala.Boolean
  type CalculatedColumnList = js.Array[typingsJapgolly.awsSdk.quicksightMod.CalculatedColumn]
  type Catalog = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.quicksightMod.ClientApiVersions
  type ClusterId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STRING
    - typingsJapgolly.awsSdk.awsSdkStrings.INTEGER
    - typingsJapgolly.awsSdk.awsSdkStrings.DECIMAL
    - typingsJapgolly.awsSdk.awsSdkStrings.DATETIME
    - java.lang.String
  */
  type ColumnDataType = typingsJapgolly.awsSdk.quicksightMod._ColumnDataType | java.lang.String
  type ColumnGroupColumnSchemaList = js.Array[typingsJapgolly.awsSdk.quicksightMod.ColumnGroupColumnSchema]
  type ColumnGroupList = js.Array[typingsJapgolly.awsSdk.quicksightMod.ColumnGroup]
  type ColumnGroupName = java.lang.String
  type ColumnGroupSchemaList = js.Array[typingsJapgolly.awsSdk.quicksightMod.ColumnGroupSchema]
  type ColumnId = java.lang.String
  type ColumnList = js.Array[typingsJapgolly.awsSdk.quicksightMod.ColumnName]
  type ColumnName = java.lang.String
  type ColumnSchemaList = js.Array[typingsJapgolly.awsSdk.quicksightMod.ColumnSchema]
  type ColumnTagList = js.Array[typingsJapgolly.awsSdk.quicksightMod.ColumnTag]
  type CustomSqlName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DashboardBehavior = typingsJapgolly.awsSdk.quicksightMod._DashboardBehavior | java.lang.String
  type DashboardErrorList = js.Array[typingsJapgolly.awsSdk.quicksightMod.DashboardError]
  /* Rewritten from type alias, can be one of: 
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
  type DashboardErrorType = typingsJapgolly.awsSdk.quicksightMod._DashboardErrorType | java.lang.String
  type DashboardName = java.lang.String
  type DashboardSummaryList = js.Array[typingsJapgolly.awsSdk.quicksightMod.DashboardSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPANDED
    - typingsJapgolly.awsSdk.awsSdkStrings.COLLAPSED
    - java.lang.String
  */
  type DashboardUIState = typingsJapgolly.awsSdk.quicksightMod._DashboardUIState | java.lang.String
  type DashboardVersionSummaryList = js.Array[typingsJapgolly.awsSdk.quicksightMod.DashboardVersionSummary]
  type DataSetConfigurationList = js.Array[typingsJapgolly.awsSdk.quicksightMod.DataSetConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SPICE
    - typingsJapgolly.awsSdk.awsSdkStrings.DIRECT_QUERY
    - java.lang.String
  */
  type DataSetImportMode = typingsJapgolly.awsSdk.quicksightMod._DataSetImportMode | java.lang.String
  type DataSetName = java.lang.String
  type DataSetReferenceList = js.Array[typingsJapgolly.awsSdk.quicksightMod.DataSetReference]
  type DataSetSummaryList = js.Array[typingsJapgolly.awsSdk.quicksightMod.DataSetSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMEOUT
    - typingsJapgolly.awsSdk.awsSdkStrings.ENGINE_VERSION_NOT_SUPPORTED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN_HOST
    - typingsJapgolly.awsSdk.awsSdkStrings.GENERIC_SQL_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.CONFLICT
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type DataSourceErrorInfoType = typingsJapgolly.awsSdk.quicksightMod._DataSourceErrorInfoType | java.lang.String
  type DataSourceList = js.Array[typingsJapgolly.awsSdk.quicksightMod.DataSource]
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
    - java.lang.String
  */
  type DataSourceType = typingsJapgolly.awsSdk.quicksightMod._DataSourceType | java.lang.String
  type Database = java.lang.String
  type DateTimeParameterList = js.Array[typingsJapgolly.awsSdk.quicksightMod.DateTimeParameter]
  type DecimalParameterList = js.Array[typingsJapgolly.awsSdk.quicksightMod.DecimalParameter]
  type Delimiter = java.lang.String
  type Domain = java.lang.String
  type Double = scala.Double
  type DoubleList = js.Array[typingsJapgolly.awsSdk.quicksightMod.Double]
  type EmbeddingUrl = java.lang.String
  type Expression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CSV
    - typingsJapgolly.awsSdk.awsSdkStrings.TSV
    - typingsJapgolly.awsSdk.awsSdkStrings.CLF
    - typingsJapgolly.awsSdk.awsSdkStrings.ELF
    - typingsJapgolly.awsSdk.awsSdkStrings.XLSX
    - typingsJapgolly.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type FileFormat = typingsJapgolly.awsSdk.quicksightMod._FileFormat | java.lang.String
  type GeoSpatialCountryCode = typingsJapgolly.awsSdk.awsSdkStrings.US | java.lang.String
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
  type GeoSpatialDataRole = typingsJapgolly.awsSdk.quicksightMod._GeoSpatialDataRole | java.lang.String
  type GroupDescription = java.lang.String
  type GroupList = js.Array[typingsJapgolly.awsSdk.quicksightMod.Group]
  type GroupMemberList = js.Array[typingsJapgolly.awsSdk.quicksightMod.GroupMember]
  type GroupMemberName = java.lang.String
  type GroupName = java.lang.String
  type Host = java.lang.String
  type IAMPolicyAssignmentName = java.lang.String
  type IAMPolicyAssignmentSummaryList = js.Array[typingsJapgolly.awsSdk.quicksightMod.IAMPolicyAssignmentSummary]
  type IdentityMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.quicksightMod.IdentityNameList]
  type IdentityName = java.lang.String
  type IdentityNameList = js.Array[typingsJapgolly.awsSdk.quicksightMod.IdentityName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IAM
    - typingsJapgolly.awsSdk.awsSdkStrings.QUICKSIGHT
    - java.lang.String
  */
  type IdentityType = typingsJapgolly.awsSdk.quicksightMod._IdentityType | java.lang.String
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
    - java.lang.String
  */
  type IngestionErrorType = typingsJapgolly.awsSdk.quicksightMod._IngestionErrorType | java.lang.String
  type IngestionId = java.lang.String
  type IngestionMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MANUAL
    - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULED
    - java.lang.String
  */
  type IngestionRequestSource = typingsJapgolly.awsSdk.quicksightMod._IngestionRequestSource | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INITIAL_INGESTION
    - typingsJapgolly.awsSdk.awsSdkStrings.EDIT
    - typingsJapgolly.awsSdk.awsSdkStrings.INCREMENTAL_REFRESH
    - typingsJapgolly.awsSdk.awsSdkStrings.FULL_REFRESH
    - java.lang.String
  */
  type IngestionRequestType = typingsJapgolly.awsSdk.quicksightMod._IngestionRequestType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZED
    - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type IngestionStatus = typingsJapgolly.awsSdk.quicksightMod._IngestionStatus | java.lang.String
  type Ingestions = js.Array[typingsJapgolly.awsSdk.quicksightMod.Ingestion]
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
  type InputColumnDataType = typingsJapgolly.awsSdk.quicksightMod._InputColumnDataType | java.lang.String
  type InputColumnList = js.Array[typingsJapgolly.awsSdk.quicksightMod.InputColumn]
  type InstanceId = java.lang.String
  type IntegerParameterList = js.Array[typingsJapgolly.awsSdk.quicksightMod.IntegerParameter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INNER
    - typingsJapgolly.awsSdk.awsSdkStrings.OUTER
    - typingsJapgolly.awsSdk.awsSdkStrings.LEFT
    - typingsJapgolly.awsSdk.awsSdkStrings.RIGHT
    - java.lang.String
  */
  type JoinType = typingsJapgolly.awsSdk.quicksightMod._JoinType | java.lang.String
  type LogicalTableAlias = java.lang.String
  type LogicalTableId = java.lang.String
  type LogicalTableMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.quicksightMod.LogicalTable]
  type LongList = js.Array[typingsJapgolly.awsSdk.quicksightMod.Long_]
  type Long_ = scala.Double
  type MaxResults = scala.Double
  type Namespace = java.lang.String
  type NonEmptyString = java.lang.String
  type OnClause = java.lang.String
  type OptionalPort = scala.Double
  type OutputColumnList = js.Array[typingsJapgolly.awsSdk.quicksightMod.OutputColumn]
  type Password = java.lang.String
  type PhysicalTableId = java.lang.String
  type PhysicalTableMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.quicksightMod.PhysicalTable]
  type Port = scala.Double
  type PositiveInteger = scala.Double
  type Principal = java.lang.String
  type ProjectedColumnList = js.Array[typingsJapgolly.awsSdk.quicksightMod.String]
  type Query = java.lang.String
  type RelationalTableName = java.lang.String
  type RelationalTableSchema = java.lang.String
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  type ResourcePermissionList = js.Array[typingsJapgolly.awsSdk.quicksightMod.ResourcePermission]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type ResourceStatus = typingsJapgolly.awsSdk.quicksightMod._ResourceStatus | java.lang.String
  type RestrictiveResourceId = java.lang.String
  type RoleSessionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GRANT_ACCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.DENY_ACCESS
    - java.lang.String
  */
  type RowLevelPermissionPolicy = typingsJapgolly.awsSdk.quicksightMod._RowLevelPermissionPolicy | java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type SessionLifetimeInMinutes = scala.Double
  type SiteBaseUrl = java.lang.String
  type SqlQuery = java.lang.String
  type StatusCode = scala.Double
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.quicksightMod.String]
  type StringParameterList = js.Array[typingsJapgolly.awsSdk.quicksightMod.StringParameter]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.quicksightMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.quicksightMod.Tag]
  type TagValue = java.lang.String
  type TemplateAliasList = js.Array[typingsJapgolly.awsSdk.quicksightMod.TemplateAlias]
  type TemplateErrorList = js.Array[typingsJapgolly.awsSdk.quicksightMod.TemplateError]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DATA_SET_NOT_FOUND
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
    - java.lang.String
  */
  type TemplateErrorType = typingsJapgolly.awsSdk.quicksightMod._TemplateErrorType | java.lang.String
  type TemplateName = java.lang.String
  type TemplateSummaryList = js.Array[typingsJapgolly.awsSdk.quicksightMod.TemplateSummary]
  type TemplateVersionSummaryList = js.Array[typingsJapgolly.awsSdk.quicksightMod.TemplateVersionSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DOUBLE_QUOTE
    - typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_QUOTE
    - java.lang.String
  */
  type TextQualifier = typingsJapgolly.awsSdk.quicksightMod._TextQualifier | java.lang.String
  type TimestampList = js.Array[js.Date]
  type Timestamp_ = js.Date
  type TransformOperationList = js.Array[typingsJapgolly.awsSdk.quicksightMod.TransformOperation]
  type TypeCastFormat = java.lang.String
  type UpdateResourcePermissionList = js.Array[typingsJapgolly.awsSdk.quicksightMod.ResourcePermission]
  type UserList = js.Array[typingsJapgolly.awsSdk.quicksightMod.User]
  type UserName_ = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ADMIN
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTHOR
    - typingsJapgolly.awsSdk.awsSdkStrings.READER
    - typingsJapgolly.awsSdk.awsSdkStrings.RESTRICTED_AUTHOR
    - typingsJapgolly.awsSdk.awsSdkStrings.RESTRICTED_READER
    - java.lang.String
  */
  type UserRole = typingsJapgolly.awsSdk.quicksightMod._UserRole | java.lang.String
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
  type apiVersion = typingsJapgolly.awsSdk.quicksightMod._apiVersion | java.lang.String
  type long = scala.Double
  type timestamp = js.Date
}
