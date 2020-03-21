package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object glueMod {
  type ActionList = js.Array[typingsJapgolly.awsSdk.glueMod.Action]
  type AttemptCount = scala.Double
  type BatchDeletePartitionValueList = js.Array[typingsJapgolly.awsSdk.glueMod.PartitionValueList]
  type BatchDeleteTableNameList = js.Array[typingsJapgolly.awsSdk.glueMod.NameString]
  type BatchDeleteTableVersionList = js.Array[typingsJapgolly.awsSdk.glueMod.VersionString]
  type BatchGetPartitionValueList = js.Array[typingsJapgolly.awsSdk.glueMod.PartitionValueList]
  type BatchStopJobRunErrorList = js.Array[typingsJapgolly.awsSdk.glueMod.BatchStopJobRunError]
  type BatchStopJobRunJobRunIdList = js.Array[typingsJapgolly.awsSdk.glueMod.IdString]
  type BatchStopJobRunSuccessfulSubmissionList = js.Array[typingsJapgolly.awsSdk.glueMod.BatchStopJobRunSuccessfulSubmission]
  type Boolean = scala.Boolean
  type BooleanNullable = scala.Boolean
  type BooleanValue = scala.Boolean
  type BoundedPartitionValueList = js.Array[typingsJapgolly.awsSdk.glueMod.ValueString]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.`SSE-KMS`
    - java.lang.String
  */
  type CatalogEncryptionMode = typingsJapgolly.awsSdk.glueMod._CatalogEncryptionMode | java.lang.String
  type CatalogEntries = js.Array[typingsJapgolly.awsSdk.glueMod.CatalogEntry]
  type CatalogIdString = java.lang.String
  type CatalogTablesList = js.Array[typingsJapgolly.awsSdk.glueMod.NameString]
  type CatalogTargetList = js.Array[typingsJapgolly.awsSdk.glueMod.CatalogTarget]
  type Classification = java.lang.String
  type ClassifierList = js.Array[typingsJapgolly.awsSdk.glueMod.Classifier]
  type ClassifierNameList = js.Array[typingsJapgolly.awsSdk.glueMod.NameString]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.glueMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.`SSE-KMS`
    - java.lang.String
  */
  type CloudWatchEncryptionMode = typingsJapgolly.awsSdk.glueMod._CloudWatchEncryptionMode | java.lang.String
  type CodeGenArgName = java.lang.String
  type CodeGenArgValue = java.lang.String
  type CodeGenIdentifier = java.lang.String
  type CodeGenNodeArgs = js.Array[typingsJapgolly.awsSdk.glueMod.CodeGenNodeArg]
  type CodeGenNodeType = java.lang.String
  type ColumnList = js.Array[typingsJapgolly.awsSdk.glueMod.Column]
  type ColumnNameString = java.lang.String
  type ColumnTypeString = java.lang.String
  type ColumnValueStringList = js.Array[typingsJapgolly.awsSdk.glueMod.ColumnValuesString]
  type ColumnValuesString = java.lang.String
  type CommentString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EQUALS
    - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
    - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
    - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN_EQUALS
    - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN_EQUALS
    - java.lang.String
  */
  type Comparator = typingsJapgolly.awsSdk.glueMod._Comparator | java.lang.String
  type ConditionList = js.Array[typingsJapgolly.awsSdk.glueMod.Condition]
  type ConnectionList = js.Array[typingsJapgolly.awsSdk.glueMod.Connection]
  type ConnectionName = java.lang.String
  type ConnectionProperties = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.glueMod.ValueString]
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
    - java.lang.String
  */
  type ConnectionPropertyKey = typingsJapgolly.awsSdk.glueMod._ConnectionPropertyKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.JDBC
    - typingsJapgolly.awsSdk.awsSdkStrings.SFTP
    - java.lang.String
  */
  type ConnectionType = typingsJapgolly.awsSdk.glueMod._ConnectionType | java.lang.String
  type CrawlList = js.Array[typingsJapgolly.awsSdk.glueMod.Crawl]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CrawlState = typingsJapgolly.awsSdk.glueMod._CrawlState | java.lang.String
  type CrawlerConfiguration = java.lang.String
  type CrawlerList = js.Array[typingsJapgolly.awsSdk.glueMod.Crawler]
  type CrawlerMetricsList = js.Array[typingsJapgolly.awsSdk.glueMod.CrawlerMetrics]
  type CrawlerNameList = js.Array[typingsJapgolly.awsSdk.glueMod.NameString]
  type CrawlerSecurityConfiguration = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
    - java.lang.String
  */
  type CrawlerState = typingsJapgolly.awsSdk.glueMod._CrawlerState | java.lang.String
  type CronExpression = java.lang.String
  type CsvColumnDelimiter = java.lang.String
  type CsvHeader = js.Array[typingsJapgolly.awsSdk.glueMod.NameString]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - typingsJapgolly.awsSdk.awsSdkStrings.PRESENT
    - typingsJapgolly.awsSdk.awsSdkStrings.ABSENT
    - java.lang.String
  */
  type CsvHeaderOption = typingsJapgolly.awsSdk.glueMod._CsvHeaderOption | java.lang.String
  type CsvQuoteSymbol = java.lang.String
  type CustomPatterns = java.lang.String
  type DagEdges = js.Array[typingsJapgolly.awsSdk.glueMod.CodeGenEdge]
  type DagNodes = js.Array[typingsJapgolly.awsSdk.glueMod.CodeGenNode]
  type DataLakePrincipalString = java.lang.String
  type DatabaseList = js.Array[typingsJapgolly.awsSdk.glueMod.Database]
  type DatabaseName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LOG
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FROM_DATABASE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPRECATE_IN_DATABASE
    - java.lang.String
  */
  type DeleteBehavior = typingsJapgolly.awsSdk.glueMod._DeleteBehavior | java.lang.String
  type DeleteConnectionNameList = js.Array[typingsJapgolly.awsSdk.glueMod.NameString]
  type DescriptionString = java.lang.String
  type DescriptionStringRemovable = java.lang.String
  type DevEndpointList = js.Array[typingsJapgolly.awsSdk.glueMod.DevEndpoint]
  type DevEndpointNameList = js.Array[typingsJapgolly.awsSdk.glueMod.NameString]
  type DevEndpointNames = js.Array[typingsJapgolly.awsSdk.glueMod.GenericString]
  type DynamoDBTargetList = js.Array[typingsJapgolly.awsSdk.glueMod.DynamoDBTarget]
  type EdgeList = js.Array[typingsJapgolly.awsSdk.glueMod.Edge]
  type ErrorByName = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.glueMod.ErrorDetail]
  type ErrorString = java.lang.String
  type ExecutionTime = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MUST_EXIST
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EXIST
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ExistCondition = typingsJapgolly.awsSdk.glueMod._ExistCondition | java.lang.String
  type FieldType = java.lang.String
  type FilterString = java.lang.String
  type FormatString = java.lang.String
  type GenericBoundedDouble = scala.Double
  type GenericMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.glueMod.GenericString]
  type GenericString = java.lang.String
  type GetTableVersionsList = js.Array[typingsJapgolly.awsSdk.glueMod.TableVersion]
  type GlueResourceArn = java.lang.String
  type GlueTables = js.Array[typingsJapgolly.awsSdk.glueMod.GlueTable]
  type GlueVersionString = java.lang.String
  type GrokPattern = java.lang.String
  type HashString = java.lang.String
  type IdString = java.lang.String
  type Integer = scala.Double
  type IntegerFlag = scala.Double
  type IntegerValue = scala.Double
  type JdbcTargetList = js.Array[typingsJapgolly.awsSdk.glueMod.JdbcTarget]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.`CSE-KMS`
    - java.lang.String
  */
  type JobBookmarksEncryptionMode = typingsJapgolly.awsSdk.glueMod._JobBookmarksEncryptionMode | java.lang.String
  type JobList = js.Array[typingsJapgolly.awsSdk.glueMod.Job]
  type JobName = java.lang.String
  type JobNameList = js.Array[typingsJapgolly.awsSdk.glueMod.NameString]
  type JobRunList = js.Array[typingsJapgolly.awsSdk.glueMod.JobRun]
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
  type JobRunState = typingsJapgolly.awsSdk.glueMod._JobRunState | java.lang.String
  type JsonPath = java.lang.String
  type JsonValue = java.lang.String
  type KeyString = java.lang.String
  type KmsKeyArn = java.lang.String
  type LabelCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PYTHON
    - typingsJapgolly.awsSdk.awsSdkStrings.SCALA
    - java.lang.String
  */
  type Language = typingsJapgolly.awsSdk.glueMod._Language | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type LastCrawlStatus = typingsJapgolly.awsSdk.glueMod._LastCrawlStatus | java.lang.String
  type LocationMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.glueMod.ColumnValuesString]
  type LocationString = java.lang.String
  type LogGroup = java.lang.String
  type LogStream = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AND
    - typingsJapgolly.awsSdk.awsSdkStrings.ANY
    - java.lang.String
  */
  type Logical = typingsJapgolly.awsSdk.glueMod._Logical | java.lang.String
  type LogicalOperator = typingsJapgolly.awsSdk.awsSdkStrings.EQUALS | java.lang.String
  type MapValue = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.glueMod.GenericString]
  type MappingList = js.Array[typingsJapgolly.awsSdk.glueMod.MappingEntry]
  type MatchCriteria = js.Array[typingsJapgolly.awsSdk.glueMod.NameString]
  type MaxConcurrentRuns = scala.Double
  type MaxRetries = scala.Double
  type MessagePrefix = java.lang.String
  type MillisecondsCount = scala.Double
  type NameString = java.lang.String
  type NameStringList = js.Array[typingsJapgolly.awsSdk.glueMod.NameString]
  type NodeList = js.Array[typingsJapgolly.awsSdk.glueMod.Node]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CRAWLER
    - typingsJapgolly.awsSdk.awsSdkStrings.JOB
    - typingsJapgolly.awsSdk.awsSdkStrings.TRIGGER
    - java.lang.String
  */
  type NodeType = typingsJapgolly.awsSdk.glueMod._NodeType | java.lang.String
  type NonNegativeDouble = scala.Double
  type NonNegativeInteger = scala.Double
  type NotifyDelayAfter = scala.Double
  type NullableBoolean = scala.Boolean
  type NullableDouble = scala.Double
  type NullableInteger = scala.Double
  type OrchestrationStringList = js.Array[typingsJapgolly.awsSdk.glueMod.GenericString]
  type OrderList = js.Array[typingsJapgolly.awsSdk.glueMod.Order]
  type PageSize = scala.Double
  type PaginationToken = java.lang.String
  type ParametersMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.glueMod.ParametersMapValue]
  type ParametersMapValue = java.lang.String
  type PartitionErrors = js.Array[typingsJapgolly.awsSdk.glueMod.PartitionError]
  type PartitionInputList = js.Array[typingsJapgolly.awsSdk.glueMod.PartitionInput]
  type PartitionList = js.Array[typingsJapgolly.awsSdk.glueMod.Partition]
  type Path = java.lang.String
  type PathList = js.Array[typingsJapgolly.awsSdk.glueMod.Path]
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
  type Permission = typingsJapgolly.awsSdk.glueMod._Permission | java.lang.String
  type PermissionList = js.Array[typingsJapgolly.awsSdk.glueMod.Permission]
  type PolicyJsonString = java.lang.String
  type PredecessorList = js.Array[typingsJapgolly.awsSdk.glueMod.Predecessor]
  type PredicateString = java.lang.String
  type PrincipalPermissionsList = js.Array[typingsJapgolly.awsSdk.glueMod.PrincipalPermissions]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USER
    - typingsJapgolly.awsSdk.awsSdkStrings.ROLE
    - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
    - java.lang.String
  */
  type PrincipalType = typingsJapgolly.awsSdk.glueMod._PrincipalType | java.lang.String
  type PublicKeysList = js.Array[typingsJapgolly.awsSdk.glueMod.GenericString]
  type PythonScript = java.lang.String
  type PythonVersionString = java.lang.String
  type RecordsCount = scala.Double
  type ReplaceBoolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.JAR
    - typingsJapgolly.awsSdk.awsSdkStrings.FILE
    - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVE
    - java.lang.String
  */
  type ResourceType = typingsJapgolly.awsSdk.glueMod._ResourceType | java.lang.String
  type ResourceUriList = js.Array[typingsJapgolly.awsSdk.glueMod.ResourceUri]
  type Role = java.lang.String
  type RoleArn = java.lang.String
  type RoleString = java.lang.String
  type RowTag = java.lang.String
  type RunId = java.lang.String
  type S3EncryptionList = js.Array[typingsJapgolly.awsSdk.glueMod.S3Encryption]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.`SSE-KMS`
    - typingsJapgolly.awsSdk.awsSdkStrings.`SSE-S3`
    - java.lang.String
  */
  type S3EncryptionMode = typingsJapgolly.awsSdk.glueMod._S3EncryptionMode | java.lang.String
  type S3TargetList = js.Array[typingsJapgolly.awsSdk.glueMod.S3Target]
  type ScalaCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULED
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_SCHEDULED
    - typingsJapgolly.awsSdk.awsSdkStrings.TRANSITIONING
    - java.lang.String
  */
  type ScheduleState = typingsJapgolly.awsSdk.glueMod._ScheduleState | java.lang.String
  type SchemaPathString = java.lang.String
  type ScriptLocationString = java.lang.String
  type SearchPropertyPredicates = js.Array[typingsJapgolly.awsSdk.glueMod.PropertyPredicate]
  type SecurityConfigurationList = js.Array[typingsJapgolly.awsSdk.glueMod.SecurityConfiguration]
  type SecurityGroupIdList = js.Array[typingsJapgolly.awsSdk.glueMod.NameString]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASC
    - typingsJapgolly.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type Sort = typingsJapgolly.awsSdk.glueMod._Sort | java.lang.String
  type SortCriteria = js.Array[typingsJapgolly.awsSdk.glueMod.SortCriterion]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
    - java.lang.String
  */
  type SortDirectionType = typingsJapgolly.awsSdk.glueMod._SortDirectionType | java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.glueMod.GenericString]
  type TableErrors = js.Array[typingsJapgolly.awsSdk.glueMod.TableError]
  type TableList = js.Array[typingsJapgolly.awsSdk.glueMod.Table]
  type TableName = java.lang.String
  type TablePrefix = java.lang.String
  type TableTypeString = java.lang.String
  type TableVersionErrors = js.Array[typingsJapgolly.awsSdk.glueMod.TableVersionError]
  type TagKey = java.lang.String
  type TagKeysList = js.Array[typingsJapgolly.awsSdk.glueMod.TagKey]
  type TagValue = java.lang.String
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.glueMod.TagValue]
  type TaskRunList = js.Array[typingsJapgolly.awsSdk.glueMod.TaskRun]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TASK_RUN_TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.STATUS
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTED
    - java.lang.String
  */
  type TaskRunSortColumnType = typingsJapgolly.awsSdk.glueMod._TaskRunSortColumnType | java.lang.String
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
  type TaskStatusType = typingsJapgolly.awsSdk.glueMod._TaskStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EVALUATION
    - typingsJapgolly.awsSdk.awsSdkStrings.LABELING_SET_GENERATION
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_LABELS
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPORT_LABELS
    - typingsJapgolly.awsSdk.awsSdkStrings.FIND_MATCHES
    - java.lang.String
  */
  type TaskType = typingsJapgolly.awsSdk.glueMod._TaskType | java.lang.String
  type Timeout = scala.Double
  type Timestamp = js.Date
  type TimestampValue = js.Date
  type Token = java.lang.String
  type TotalSegmentsInteger = scala.Double
  type TransformList = js.Array[typingsJapgolly.awsSdk.glueMod.MLTransform]
  type TransformSchema = js.Array[typingsJapgolly.awsSdk.glueMod.SchemaColumn]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.TRANSFORM_TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.STATUS
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
    - typingsJapgolly.awsSdk.awsSdkStrings.LAST_MODIFIED
    - java.lang.String
  */
  type TransformSortColumnType = typingsJapgolly.awsSdk.glueMod._TransformSortColumnType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_READY
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type TransformStatusType = typingsJapgolly.awsSdk.glueMod._TransformStatusType | java.lang.String
  type TransformType = typingsJapgolly.awsSdk.awsSdkStrings.FIND_MATCHES | java.lang.String
  type TriggerList = js.Array[typingsJapgolly.awsSdk.glueMod.Trigger]
  type TriggerNameList = js.Array[typingsJapgolly.awsSdk.glueMod.NameString]
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
  type TriggerState = typingsJapgolly.awsSdk.glueMod._TriggerState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULED
    - typingsJapgolly.awsSdk.awsSdkStrings.CONDITIONAL
    - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type TriggerType = typingsJapgolly.awsSdk.glueMod._TriggerType | java.lang.String
  type URI = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LOG
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_DATABASE
    - java.lang.String
  */
  type UpdateBehavior = typingsJapgolly.awsSdk.glueMod._UpdateBehavior | java.lang.String
  type UriString = java.lang.String
  type UserDefinedFunctionList = js.Array[typingsJapgolly.awsSdk.glueMod.UserDefinedFunction]
  type ValueString = java.lang.String
  type ValueStringList = js.Array[typingsJapgolly.awsSdk.glueMod.ValueString]
  type VersionId = scala.Double
  type VersionString = java.lang.String
  type ViewTextString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Standard_
    - typingsJapgolly.awsSdk.awsSdkStrings.GDot1X
    - typingsJapgolly.awsSdk.awsSdkStrings.GDot2X
    - java.lang.String
  */
  type WorkerType = typingsJapgolly.awsSdk.glueMod._WorkerType | java.lang.String
  type WorkflowNames = js.Array[typingsJapgolly.awsSdk.glueMod.NameString]
  type WorkflowRunProperties = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.glueMod.GenericString]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type WorkflowRunStatus = typingsJapgolly.awsSdk.glueMod._WorkflowRunStatus | java.lang.String
  type WorkflowRuns = js.Array[typingsJapgolly.awsSdk.glueMod.WorkflowRun]
  type Workflows = js.Array[typingsJapgolly.awsSdk.glueMod.Workflow]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-03-31`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.glueMod._apiVersion | java.lang.String
}
