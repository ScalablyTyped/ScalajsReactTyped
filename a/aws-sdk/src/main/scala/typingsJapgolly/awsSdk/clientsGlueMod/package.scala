package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.EQUALS
import typingsJapgolly.awsSdk.awsSdkStrings.FIND_MATCHES
import typingsJapgolly.awsSdk.awsSdkStrings.SYNTAX_DIFF
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type ActionList = js.Array[Action]

type AdditionalOptions = StringDictionary[EnclosedInStringProperty]

type AdditionalPlanOptionsMap = StringDictionary[GenericString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.avg_
  - typingsJapgolly.awsSdk.awsSdkStrings.countDistinct
  - typingsJapgolly.awsSdk.awsSdkStrings.count__
  - typingsJapgolly.awsSdk.awsSdkStrings.first_
  - typingsJapgolly.awsSdk.awsSdkStrings.last_
  - typingsJapgolly.awsSdk.awsSdkStrings.kurtosis
  - typingsJapgolly.awsSdk.awsSdkStrings.max_
  - typingsJapgolly.awsSdk.awsSdkStrings.min
  - typingsJapgolly.awsSdk.awsSdkStrings.skewness
  - typingsJapgolly.awsSdk.awsSdkStrings.stddev_samp
  - typingsJapgolly.awsSdk.awsSdkStrings.stddev_pop
  - typingsJapgolly.awsSdk.awsSdkStrings.sum__
  - typingsJapgolly.awsSdk.awsSdkStrings.sumDistinct
  - typingsJapgolly.awsSdk.awsSdkStrings.var_samp
  - typingsJapgolly.awsSdk.awsSdkStrings.var_pop
  - java.lang.String
*/
type AggFunction = _AggFunction | String

type AggregateOperations = js.Array[AggregateOperation]

type AttemptCount = scala.Double

type AuditColumnNamesList = js.Array[ColumnNameString]

type AuditContextString = String

type AuthTokenString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENCRYPTED_PARTITION_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_PARTITION_TYPE_DATA_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSING_PARTITION_VALUE_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.UNSUPPORTED_PARTITION_CHARACTER_ERROR
  - java.lang.String
*/
type BackfillErrorCode = _BackfillErrorCode | String

type BackfillErroredPartitionsList = js.Array[PartitionValueList]

type BackfillErrors = js.Array[BackfillError]

type BatchDeletePartitionValueList = js.Array[PartitionValueList]

type BatchDeleteTableNameList = js.Array[NameString]

type BatchDeleteTableVersionList = js.Array[VersionString]

type BatchGetBlueprintNames = js.Array[OrchestrationNameString]

type BatchGetPartitionValueList = js.Array[PartitionValueList]

type BatchSize = scala.Double

type BatchStopJobRunErrorList = js.Array[BatchStopJobRunError]

type BatchStopJobRunJobRunIdList = js.Array[IdString]

type BatchStopJobRunSuccessfulSubmissionList = js.Array[BatchStopJobRunSuccessfulSubmission]

type BatchUpdatePartitionFailureList = js.Array[BatchUpdatePartitionFailureEntry]

type BatchUpdatePartitionRequestEntryList = js.Array[BatchUpdatePartitionRequestEntry]

type BatchWindow = scala.Double

type BlueprintNames = js.Array[OrchestrationNameString]

type BlueprintParameterSpec = String

type BlueprintParameters = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLING_BACK
  - java.lang.String
*/
type BlueprintRunState = _BlueprintRunState | String

type BlueprintRuns = js.Array[BlueprintRun]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type BlueprintStatus = _BlueprintStatus | String

type Blueprints = js.Array[Blueprint]

type Boolean = scala.Boolean

type BooleanNullable = scala.Boolean

type BooleanValue = scala.Boolean

type BoundedPartitionValueList = js.Array[ValueString]

type BoxedBoolean = scala.Boolean

type BoxedDoubleFraction = scala.Double

type BoxedLong = scala.Double

type BoxedNonNegativeInt = scala.Double

type BoxedNonNegativeLong = scala.Double

type BoxedPositiveInt = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.`SSE-KMS`
  - java.lang.String
*/
type CatalogEncryptionMode = _CatalogEncryptionMode | String

type CatalogEntries = js.Array[CatalogEntry]

type CatalogGetterPageSize = scala.Double

type CatalogIdString = String

type CatalogTablesList = js.Array[NameString]

type CatalogTargetList = js.Array[CatalogTarget]

type Classification = String

type ClassifierList = js.Array[Classifier]

type ClassifierNameList = js.Array[NameString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.`SSE-KMS`
  - java.lang.String
*/
type CloudWatchEncryptionMode = _CloudWatchEncryptionMode | String

type CodeGenArgName = String

type CodeGenArgValue = String

type CodeGenConfigurationNodes = StringDictionary[CodeGenConfigurationNode]

type CodeGenIdentifier = String

type CodeGenNodeArgs = js.Array[CodeGenNodeArg]

type CodeGenNodeType = String

type ColumnErrors = js.Array[ColumnError]

type ColumnImportanceList = js.Array[ColumnImportance]

type ColumnList = js.Array[Column]

type ColumnNameString = String

type ColumnRowFilterList = js.Array[ColumnRowFilter]

type ColumnStatisticsErrors = js.Array[ColumnStatisticsError]

type ColumnStatisticsList = js.Array[ColumnStatistics]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BOOLEAN
  - typingsJapgolly.awsSdk.awsSdkStrings.DATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DECIMAL
  - typingsJapgolly.awsSdk.awsSdkStrings.DOUBLE
  - typingsJapgolly.awsSdk.awsSdkStrings.LONG
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING
  - typingsJapgolly.awsSdk.awsSdkStrings.BINARY
  - java.lang.String
*/
type ColumnStatisticsType = _ColumnStatisticsType | String

type ColumnTypeString = String

type ColumnValueStringList = js.Array[ColumnValuesString]

type ColumnValuesString = String

type CommentString = String

type CommitIdString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EQUALS
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN_EQUALS
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN_EQUALS
  - java.lang.String
*/
type Comparator = _Comparator | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKWARD
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKWARD_ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.FORWARD
  - typingsJapgolly.awsSdk.awsSdkStrings.FORWARD_ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL_ALL
  - java.lang.String
*/
type Compatibility = _Compatibility | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.gzip__
  - typingsJapgolly.awsSdk.awsSdkStrings.bzip2_
  - java.lang.String
*/
type CompressionType = _CompressionType | String

type ConditionList = js.Array[Condition]

type ConnectionList = js.Array[Connection]

type ConnectionName = String

type ConnectionProperties = StringDictionary[ValueString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HOST
  - typingsJapgolly.awsSdk.awsSdkStrings.PORT
  - typingsJapgolly.awsSdk.awsSdkStrings.USERNAME
  - typingsJapgolly.awsSdk.awsSdkStrings.PASSWORD
  - typingsJapgolly.awsSdk.awsSdkStrings.ENCRYPTED_PASSWORD
  - typingsJapgolly.awsSdk.awsSdkStrings.JDBC_DRIVER_JAR_URI
  - typingsJapgolly.awsSdk.awsSdkStrings.JDBC_DRIVER_CLASS_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.JDBC_ENGINE
  - typingsJapgolly.awsSdk.awsSdkStrings.JDBC_ENGINE_VERSION
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIG_FILES
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.JDBC_CONNECTION_URL
  - typingsJapgolly.awsSdk.awsSdkStrings.JDBC_ENFORCE_SSL
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_JDBC_CERT
  - typingsJapgolly.awsSdk.awsSdkStrings.SKIP_CUSTOM_JDBC_CERT_VALIDATION
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_JDBC_CERT_STRING
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTION_URL
  - typingsJapgolly.awsSdk.awsSdkStrings.KAFKA_BOOTSTRAP_SERVERS
  - typingsJapgolly.awsSdk.awsSdkStrings.KAFKA_SSL_ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.KAFKA_CUSTOM_CERT
  - typingsJapgolly.awsSdk.awsSdkStrings.KAFKA_SKIP_CUSTOM_CERT_VALIDATION
  - typingsJapgolly.awsSdk.awsSdkStrings.KAFKA_CLIENT_KEYSTORE
  - typingsJapgolly.awsSdk.awsSdkStrings.KAFKA_CLIENT_KEYSTORE_PASSWORD
  - typingsJapgolly.awsSdk.awsSdkStrings.KAFKA_CLIENT_KEY_PASSWORD
  - typingsJapgolly.awsSdk.awsSdkStrings.ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD
  - typingsJapgolly.awsSdk.awsSdkStrings.ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD
  - typingsJapgolly.awsSdk.awsSdkStrings.SECRET_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTOR_URL
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTOR_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTOR_CLASS_NAME
  - java.lang.String
*/
type ConnectionPropertyKey = _ConnectionPropertyKey | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JDBC
  - typingsJapgolly.awsSdk.awsSdkStrings.SFTP
  - typingsJapgolly.awsSdk.awsSdkStrings.MONGODB
  - typingsJapgolly.awsSdk.awsSdkStrings.KAFKA
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK
  - typingsJapgolly.awsSdk.awsSdkStrings.MARKETPLACE
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type ConnectionType = _ConnectionType | String

type ContextWords = js.Array[NameString]

type CrawlId = String

type CrawlList = js.Array[Crawl]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLING
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type CrawlState = _CrawlState | String

type CrawlerConfiguration = String

type CrawlerHistoryList = js.Array[CrawlerHistory]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type CrawlerHistoryState = _CrawlerHistoryState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE
  - java.lang.String
*/
type CrawlerLineageSettings = _CrawlerLineageSettings | String

type CrawlerList = js.Array[Crawler]

type CrawlerMetricsList = js.Array[CrawlerMetrics]

type CrawlerNameList = js.Array[NameString]

type CrawlerSecurityConfiguration = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - java.lang.String
*/
type CrawlerState = _CrawlerState | String

type CrawlsFilterList = js.Array[CrawlsFilter]

type CreatedTimestamp = String

type CronExpression = String

type CsvColumnDelimiter = String

type CsvHeader = js.Array[NameString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - typingsJapgolly.awsSdk.awsSdkStrings.PRESENT
  - typingsJapgolly.awsSdk.awsSdkStrings.ABSENT
  - java.lang.String
*/
type CsvHeaderOption = _CsvHeaderOption | String

type CsvQuoteSymbol = String

type CustomEntityTypeNames = js.Array[NameString]

type CustomEntityTypes = js.Array[CustomEntityType]

type CustomPatterns = String

type DagEdges = js.Array[CodeGenEdge]

type DagNodes = js.Array[CodeGenNode]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVRO
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - typingsJapgolly.awsSdk.awsSdkStrings.PROTOBUF
  - java.lang.String
*/
type DataFormat = _DataFormat | String

type DataLakePrincipalString = String

type DatabaseList = js.Array[Database]

type DatabaseName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LOG
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FROM_DATABASE
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPRECATE_IN_DATABASE
  - java.lang.String
*/
type DeleteBehavior = _DeleteBehavior | String

type DeleteConnectionNameList = js.Array[NameString]

type DeltaTargetList = js.Array[DeltaTarget]

type DescriptionString = String

type DescriptionStringRemovable = String

type DevEndpointList = js.Array[DevEndpoint]

type DevEndpointNameList = js.Array[NameString]

type DevEndpointNames = js.Array[GenericString]

type Double = scala.Double

type DoubleValue = scala.Double

type DynamoDBTargetList = js.Array[DynamoDBTarget]

type EdgeList = js.Array[Edge]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TRUE
  - typingsJapgolly.awsSdk.awsSdkStrings.FALSE
  - java.lang.String
*/
type EnableHybridValues = _EnableHybridValues | String

type EnclosedInStringProperties = js.Array[EnclosedInStringProperty]

type EnclosedInStringPropertiesMinOne = js.Array[EnclosedInStringProperty]

type EnclosedInStringProperty = String

type EnclosedInStringPropertyWithQuote = String

type ErrorByName = StringDictionary[ErrorDetail]

type ErrorCodeString = String

type ErrorMessageString = String

type ErrorString = String

type EventQueueArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FLEX
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - java.lang.String
*/
type ExecutionClass = _ExecutionClass | String

type ExecutionTime = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MUST_EXIST
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EXIST
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ExistCondition = _ExistCondition | String

type ExtendedString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRAWL_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.STATE
  - typingsJapgolly.awsSdk.awsSdkStrings.START_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.END_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.DPU_HOUR
  - java.lang.String
*/
type FieldName = _FieldName | String

type FieldType = String

type FilterExpressions = js.Array[FilterExpression]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AND
  - typingsJapgolly.awsSdk.awsSdkStrings.OR
  - java.lang.String
*/
type FilterLogicalOperator = _FilterLogicalOperator | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - typingsJapgolly.awsSdk.awsSdkStrings.LT
  - typingsJapgolly.awsSdk.awsSdkStrings.GT
  - typingsJapgolly.awsSdk.awsSdkStrings.LTE
  - typingsJapgolly.awsSdk.awsSdkStrings.GTE
  - typingsJapgolly.awsSdk.awsSdkStrings.REGEX
  - typingsJapgolly.awsSdk.awsSdkStrings.ISNULL
  - java.lang.String
*/
type FilterOperation = _FilterOperation | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GT
  - typingsJapgolly.awsSdk.awsSdkStrings.GE
  - typingsJapgolly.awsSdk.awsSdkStrings.LT
  - typingsJapgolly.awsSdk.awsSdkStrings.LE
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - typingsJapgolly.awsSdk.awsSdkStrings.NE
  - java.lang.String
*/
type FilterOperator = _FilterOperator | String

type FilterString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COLUMNEXTRACTED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONSTANT
  - java.lang.String
*/
type FilterValueType = _FilterValueType | String

type FilterValues = js.Array[FilterValue]

type FormatString = String

type Generic512CharString = String

type GenericBoundedDouble = scala.Double

type GenericLimitedString = String

type GenericMap = StringDictionary[GenericString]

type GenericString = String

type GetColumnNamesList = js.Array[NameString]

type GetResourcePoliciesResponseList = js.Array[GluePolicy]

type GetTableVersionsList = js.Array[TableVersion]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DATE
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMESTAMP
  - typingsJapgolly.awsSdk.awsSdkStrings.INT
  - typingsJapgolly.awsSdk.awsSdkStrings.FLOAT
  - typingsJapgolly.awsSdk.awsSdkStrings.LONG
  - typingsJapgolly.awsSdk.awsSdkStrings.BIGDECIMAL
  - typingsJapgolly.awsSdk.awsSdkStrings.BYTE
  - typingsJapgolly.awsSdk.awsSdkStrings.SHORT
  - typingsJapgolly.awsSdk.awsSdkStrings.DOUBLE
  - java.lang.String
*/
type GlueRecordType = _GlueRecordType | String

type GlueResourceArn = String

type GlueSchemas = js.Array[GlueSchema]

type GlueStudioColumnNameString = String

type GlueStudioPathList = js.Array[EnclosedInStringProperties]

type GlueStudioSchemaColumnList = js.Array[GlueStudioSchemaColumn]

type GlueTables = js.Array[GlueTable]

type GlueVersionString = String

type GrokPattern = String

type HashString = String

type IdString = String

type Integer = scala.Double

type IntegerFlag = scala.Double

type IntegerValue = scala.Double

type IsVersionValid = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ARRAY
  - typingsJapgolly.awsSdk.awsSdkStrings.BIGINT
  - typingsJapgolly.awsSdk.awsSdkStrings.BINARY
  - typingsJapgolly.awsSdk.awsSdkStrings.BIT
  - typingsJapgolly.awsSdk.awsSdkStrings.BLOB
  - typingsJapgolly.awsSdk.awsSdkStrings.BOOLEAN
  - typingsJapgolly.awsSdk.awsSdkStrings.CHAR
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOB
  - typingsJapgolly.awsSdk.awsSdkStrings.DATALINK
  - typingsJapgolly.awsSdk.awsSdkStrings.DATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DECIMAL
  - typingsJapgolly.awsSdk.awsSdkStrings.DISTINCT
  - typingsJapgolly.awsSdk.awsSdkStrings.DOUBLE
  - typingsJapgolly.awsSdk.awsSdkStrings.FLOAT
  - typingsJapgolly.awsSdk.awsSdkStrings.INTEGER
  - typingsJapgolly.awsSdk.awsSdkStrings.JAVA_OBJECT
  - typingsJapgolly.awsSdk.awsSdkStrings.LONGNVARCHAR
  - typingsJapgolly.awsSdk.awsSdkStrings.LONGVARBINARY
  - typingsJapgolly.awsSdk.awsSdkStrings.LONGVARCHAR
  - typingsJapgolly.awsSdk.awsSdkStrings.NCHAR
  - typingsJapgolly.awsSdk.awsSdkStrings.NCLOB
  - typingsJapgolly.awsSdk.awsSdkStrings.NULL
  - typingsJapgolly.awsSdk.awsSdkStrings.NUMERIC
  - typingsJapgolly.awsSdk.awsSdkStrings.NVARCHAR
  - typingsJapgolly.awsSdk.awsSdkStrings.OTHER
  - typingsJapgolly.awsSdk.awsSdkStrings.REAL
  - typingsJapgolly.awsSdk.awsSdkStrings.REF
  - typingsJapgolly.awsSdk.awsSdkStrings.REF_CURSOR
  - typingsJapgolly.awsSdk.awsSdkStrings.ROWID
  - typingsJapgolly.awsSdk.awsSdkStrings.SMALLINT
  - typingsJapgolly.awsSdk.awsSdkStrings.SQLXML
  - typingsJapgolly.awsSdk.awsSdkStrings.STRUCT
  - typingsJapgolly.awsSdk.awsSdkStrings.TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.TIME_WITH_TIMEZONE
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMESTAMP
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMESTAMP_WITH_TIMEZONE
  - typingsJapgolly.awsSdk.awsSdkStrings.TINYINT
  - typingsJapgolly.awsSdk.awsSdkStrings.VARBINARY
  - typingsJapgolly.awsSdk.awsSdkStrings.VARCHAR
  - java.lang.String
*/
type JDBCDataType = _JDBCDataType | String

type JDBCDataTypeMapping = StringDictionary[GlueRecordType]

type JdbcTargetList = js.Array[JdbcTarget]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.`CSE-KMS`
  - java.lang.String
*/
type JobBookmarksEncryptionMode = _JobBookmarksEncryptionMode | String

type JobList = js.Array[Job]

type JobName = String

type JobNameList = js.Array[NameString]

type JobRunList = js.Array[JobRun]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMEOUT
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.WAITING
  - java.lang.String
*/
type JobRunState = _JobRunState | String

type JoinColumns = js.Array[JoinColumn]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.equijoin
  - typingsJapgolly.awsSdk.awsSdkStrings.left_
  - typingsJapgolly.awsSdk.awsSdkStrings.right_
  - typingsJapgolly.awsSdk.awsSdkStrings.outer_
  - typingsJapgolly.awsSdk.awsSdkStrings.leftsemi
  - typingsJapgolly.awsSdk.awsSdkStrings.leftanti
  - java.lang.String
*/
type JoinType = _JoinType | String

type JsonPath = String

type JsonValue = String

type KeyList = js.Array[NameString]

type KeySchemaElementList = js.Array[KeySchemaElement]

type KeyString = String

type KmsKeyArn = String

type LabelCount = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PYTHON
  - typingsJapgolly.awsSdk.awsSdkStrings.SCALA
  - java.lang.String
*/
type Language = _Language | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type LastCrawlStatus = _LastCrawlStatus | String

type LatestSchemaVersionBoolean = scala.Boolean

type LimitedPathList = js.Array[LimitedStringList]

type LimitedStringList = js.Array[GenericLimitedString]

type LocationMap = StringDictionary[ColumnValuesString]

type LocationString = String

type LocationStringList = js.Array[LocationString]

type LogGroup = String

type LogStream = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AND
  - typingsJapgolly.awsSdk.awsSdkStrings.ANY
  - java.lang.String
*/
type Logical = _Logical | String

type LogicalOperator = EQUALS | String

type Long = scala.Double

type LongValue = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.`SSE-KMS`
  - java.lang.String
*/
type MLUserDataEncryptionModeString = _MLUserDataEncryptionModeString | String

type ManyInputs = js.Array[NodeId]

type MapValue = StringDictionary[GenericString]

type MappingList = js.Array[MappingEntry]

type Mappings = js.Array[Mapping]

type MaskValue = String

type MatchCriteria = js.Array[NameString]

type MaxConcurrentRuns = scala.Double

type MaxResultsNumber = scala.Double

type MaxRetries = scala.Double

type MessagePrefix = String

type MessageString = String

type MetadataInfoMap = StringDictionary[MetadataInfo]

type MetadataKeyString = String

type MetadataList = js.Array[MetadataKeyValuePair]

type MetadataValueString = String

type MillisecondsCount = scala.Double

type MongoDBTargetList = js.Array[MongoDBTarget]

type NameString = String

type NameStringList = js.Array[NameString]

type NodeId = String

type NodeIdList = js.Array[NameString]

type NodeList = js.Array[Node]

type NodeName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRAWLER
  - typingsJapgolly.awsSdk.awsSdkStrings.JOB
  - typingsJapgolly.awsSdk.awsSdkStrings.TRIGGER
  - java.lang.String
*/
type NodeType = _NodeType | String

type NonNegativeDouble = scala.Double

type NonNegativeInt = scala.Double

type NonNegativeInteger = scala.Double

type NonNegativeLong = scala.Double

type NotifyDelayAfter = scala.Double

type NullValueFields = js.Array[NullValueField]

type NullableBoolean = scala.Boolean

type NullableDouble = scala.Double

type NullableInteger = scala.Double

type OneInput = js.Array[NodeId]

type OrchestrationArgumentsMap = StringDictionary[OrchestrationArgumentsValue]

type OrchestrationArgumentsValue = String

type OrchestrationIAMRoleArn = String

type OrchestrationNameString = String

type OrchestrationRoleArn = String

type OrchestrationS3Location = String

type OrchestrationStatementCodeString = String

type OrchestrationStringList = js.Array[GenericString]

type OrchestrationToken = String

type OrderList = js.Array[Order]

type OtherMetadataValueList = js.Array[OtherMetadataValueListItem]

type PageSize = scala.Double

type PaginationToken = String

type ParametersMap = StringDictionary[ParametersMapValue]

type ParametersMapValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.snappy__
  - typingsJapgolly.awsSdk.awsSdkStrings.lzo_
  - typingsJapgolly.awsSdk.awsSdkStrings.gzip__
  - typingsJapgolly.awsSdk.awsSdkStrings.uncompressed_
  - typingsJapgolly.awsSdk.awsSdkStrings.none__
  - java.lang.String
*/
type ParquetCompressionType = _ParquetCompressionType | String

type PartitionErrors = js.Array[PartitionError]

type PartitionIndexDescriptorList = js.Array[PartitionIndexDescriptor]

type PartitionIndexList = js.Array[PartitionIndex]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type PartitionIndexStatus = _PartitionIndexStatus | String

type PartitionInputList = js.Array[PartitionInput]

type PartitionList = js.Array[Partition]

type Path = String

type PathList = js.Array[Path]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.SELECT
  - typingsJapgolly.awsSdk.awsSdkStrings.ALTER
  - typingsJapgolly.awsSdk.awsSdkStrings.DROP
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.INSERT
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_DATABASE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_TABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_LOCATION_ACCESS
  - java.lang.String
*/
type Permission = _Permission | String

type PermissionList = js.Array[Permission]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COLUMN_PERMISSION
  - typingsJapgolly.awsSdk.awsSdkStrings.CELL_FILTER_PERMISSION
  - java.lang.String
*/
type PermissionType = _PermissionType | String

type PermissionTypeList = js.Array[PermissionType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RowAudit
  - typingsJapgolly.awsSdk.awsSdkStrings.RowMasking
  - typingsJapgolly.awsSdk.awsSdkStrings.ColumnAudit
  - typingsJapgolly.awsSdk.awsSdkStrings.ColumnMasking
  - java.lang.String
*/
type PiiType = _PiiType | String

type PolicyJsonString = String

type PollingTime = scala.Double

type PositiveLong = scala.Double

type PredecessorList = js.Array[Predecessor]

type PredicateString = String

type PrincipalPermissionsList = js.Array[PrincipalPermissions]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLE
  - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
type PrincipalType = _PrincipalType | String

type Prob = scala.Double

type PublicKeysList = js.Array[GenericString]

type PythonScript = String

type PythonVersionString = String

type QuerySchemaVersionMetadataMaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.quote
  - typingsJapgolly.awsSdk.awsSdkStrings.quillemet
  - typingsJapgolly.awsSdk.awsSdkStrings.single_quote_
  - typingsJapgolly.awsSdk.awsSdkStrings.disabled__
  - java.lang.String
*/
type QuoteChar = _QuoteChar | String

type RecordsCount = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRAWL_EVERYTHING
  - typingsJapgolly.awsSdk.awsSdkStrings.CRAWL_NEW_FOLDERS_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.CRAWL_EVENT_MODE
  - java.lang.String
*/
type RecrawlBehavior = _RecrawlBehavior | String

type RegistryListDefinition = js.Array[RegistryListItem]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type RegistryStatus = _RegistryStatus | String

type ReplaceBoolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FOREIGN
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type ResourceShareType = _ResourceShareType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JAR
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE
  - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVE
  - java.lang.String
*/
type ResourceType = _ResourceType | String

type ResourceUriList = js.Array[ResourceUri]

type Role = String

type RoleArn = String

type RoleString = String

type RowTag = String

type RunId = String

type S3EncryptionList = js.Array[S3Encryption]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.`SSE-KMS`
  - typingsJapgolly.awsSdk.awsSdkStrings.`SSE-S3`
  - java.lang.String
*/
type S3EncryptionMode = _S3EncryptionMode | String

type S3TargetList = js.Array[S3Target]

type ScalaCode = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULED
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_SCHEDULED
  - typingsJapgolly.awsSdk.awsSdkStrings.TRANSITIONING
  - java.lang.String
*/
type ScheduleState = _ScheduleState | String

type SchemaCheckpointNumber = scala.Double

type SchemaDefinitionDiff = String

type SchemaDefinitionString = String

type SchemaDiffType = SYNTAX_DIFF | String

type SchemaListDefinition = js.Array[SchemaListItem]

type SchemaPathString = String

type SchemaRegistryNameString = String

type SchemaRegistryTokenString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type SchemaStatus = _SchemaStatus | String

type SchemaValidationError = String

type SchemaVersionErrorList = js.Array[SchemaVersionErrorItem]

type SchemaVersionIdString = String

type SchemaVersionList = js.Array[SchemaVersionListItem]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type SchemaVersionStatus = _SchemaVersionStatus | String

type ScriptLocationString = String

type SearchPropertyPredicates = js.Array[PropertyPredicate]

type SecurityConfigurationList = js.Array[SecurityConfiguration]

type SecurityGroupIdList = js.Array[NameString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.comma
  - typingsJapgolly.awsSdk.awsSdkStrings.ctrla
  - typingsJapgolly.awsSdk.awsSdkStrings.pipe_
  - typingsJapgolly.awsSdk.awsSdkStrings.semicolon
  - typingsJapgolly.awsSdk.awsSdkStrings.tab
  - java.lang.String
*/
type Separator = _Separator | String

type SessionIdList = js.Array[NameString]

type SessionList = js.Array[Session]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONING
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMEOUT
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type SessionStatus = _SessionStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASC
  - typingsJapgolly.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type Sort = _Sort | String

type SortCriteria = js.Array[SortCriterion]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - java.lang.String
*/
type SortDirectionType = _SortDirectionType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PERSONAL_ACCESS_TOKEN
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_SECRETS_MANAGER
  - java.lang.String
*/
type SourceControlAuthStrategy = _SourceControlAuthStrategy | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GITHUB
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_CODE_COMMIT
  - java.lang.String
*/
type SourceControlProvider = _SourceControlProvider | String

type SqlAliases = js.Array[SqlAlias]

type SqlQuery = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - typingsJapgolly.awsSdk.awsSdkStrings.trim_horizon_
  - typingsJapgolly.awsSdk.awsSdkStrings.earliest_
  - java.lang.String
*/
type StartingPosition = _StartingPosition | String

type StatementList = js.Array[Statement]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WAITING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLING
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type StatementState = _StatementState | String

type StringList = js.Array[GenericString]

type TableErrors = js.Array[TableError]

type TableList = js.Array[Table]

type TableName = String

type TablePrefix = String

type TableTypeString = String

type TableVersionErrors = js.Array[TableVersionError]

type TagKey = String

type TagKeysList = js.Array[TagKey]

type TagValue = String

type TagsMap = StringDictionary[TagValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.json__
  - typingsJapgolly.awsSdk.awsSdkStrings.csv__
  - typingsJapgolly.awsSdk.awsSdkStrings.avro_
  - typingsJapgolly.awsSdk.awsSdkStrings.orc_
  - typingsJapgolly.awsSdk.awsSdkStrings.parquet__
  - java.lang.String
*/
type TargetFormat = _TargetFormat | String

type TaskRunList = js.Array[TaskRun]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TASK_RUN_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.STATUS
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTED
  - java.lang.String
*/
type TaskRunSortColumnType = _TaskRunSortColumnType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMEOUT
  - java.lang.String
*/
type TaskStatusType = _TaskStatusType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EVALUATION
  - typingsJapgolly.awsSdk.awsSdkStrings.LABELING_SET_GENERATION
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_LABELS
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPORT_LABELS
  - typingsJapgolly.awsSdk.awsSdkStrings.FIND_MATCHES
  - java.lang.String
*/
type TaskType = _TaskType | String

type Timeout = scala.Double

type Timestamp = js.Date

type TimestampValue = js.Date

type Token = String

type Topk = scala.Double

type TotalSegmentsInteger = scala.Double

type TransactionIdString = String

type TransformIdList = js.Array[HashString]

type TransformList = js.Array[MLTransform]

type TransformSchema = js.Array[SchemaColumn]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.TRANSFORM_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.STATUS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_MODIFIED
  - java.lang.String
*/
type TransformSortColumnType = _TransformSortColumnType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_READY
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type TransformStatusType = _TransformStatusType | String

type TransformType = FIND_MATCHES | String

type TriggerList = js.Array[Trigger]

type TriggerNameList = js.Array[NameString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATED
  - typingsJapgolly.awsSdk.awsSdkStrings.DEACTIVATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DEACTIVATED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type TriggerState = _TriggerState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONDITIONAL
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND
  - typingsJapgolly.awsSdk.awsSdkStrings.EVENT
  - java.lang.String
*/
type TriggerType = _TriggerType | String

type TwoInputs = js.Array[NodeId]

type TypeString = String

type URI = String

type UnfilteredPartitionList = js.Array[UnfilteredPartition]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.DISTINCT
  - java.lang.String
*/
type UnionType = _UnionType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LOG
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_DATABASE
  - java.lang.String
*/
type UpdateBehavior = _UpdateBehavior | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_DATABASE
  - typingsJapgolly.awsSdk.awsSdkStrings.LOG
  - java.lang.String
*/
type UpdateCatalogBehavior = _UpdateCatalogBehavior | String

type UpdateColumnStatisticsList = js.Array[ColumnStatistics]

type UpdatedTimestamp = String

type UriString = String

type UserDefinedFunctionList = js.Array[UserDefinedFunction]

type ValueString = String

type ValueStringList = js.Array[ValueString]

type VersionId = scala.Double

type VersionLongNumber = scala.Double

type VersionString = String

type VersionsString = String

type ViewTextString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Standard_
  - typingsJapgolly.awsSdk.awsSdkStrings.GDot1X
  - typingsJapgolly.awsSdk.awsSdkStrings.GDot2X
  - typingsJapgolly.awsSdk.awsSdkStrings.GDot025X
  - java.lang.String
*/
type WorkerType = _WorkerType | String

type WorkflowNames = js.Array[NameString]

type WorkflowRunProperties = StringDictionary[GenericString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type WorkflowRunStatus = _WorkflowRunStatus | String

type WorkflowRuns = js.Array[WorkflowRun]

type Workflows = js.Array[Workflow]

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-03-31`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
