package typingsJapgolly.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.CHECK_ALL
import typingsJapgolly.awsSdk.awsSdkStrings.LAST_MODIFIED_DATE
import typingsJapgolly.awsSdk.awsSdkStrings.NEW_TABLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type ActionId = Double

type AllowedStatisticList = js.Array[AllowedStatistics]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE
  - java.lang.String
*/
type AnalyticsMode = _AnalyticsMode | String

type Arn = String

type AssumeControl = Boolean

type Attempt = Double

type Bucket = String

type BucketOwner = String

type CatalogId = String

type ClientSessionId = String

type ColumnName = String

type ColumnNameList = js.Array[ColumnName]

type ColumnRange = Double

type ColumnSelectorList = js.Array[ColumnSelector]

type ColumnStatisticsConfigurationList = js.Array[ColumnStatisticsConfiguration]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GZIP
  - typingsJapgolly.awsSdk.awsSdkStrings.LZ4
  - typingsJapgolly.awsSdk.awsSdkStrings.SNAPPY
  - typingsJapgolly.awsSdk.awsSdkStrings.BZIP2
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFLATE
  - typingsJapgolly.awsSdk.awsSdkStrings.LZO
  - typingsJapgolly.awsSdk.awsSdkStrings.BROTLI
  - typingsJapgolly.awsSdk.awsSdkStrings.ZSTD
  - typingsJapgolly.awsSdk.awsSdkStrings.ZLIB
  - java.lang.String
*/
type CompressionFormat = _CompressionFormat | String

type Condition = String

type ConditionExpressionList = js.Array[ConditionExpression]

type ConditionValue = String

type CreateColumn = Boolean

type CreatedBy = String

type CronExpression = String

type DataCatalogOutputList = js.Array[DataCatalogOutput]

type DatabaseName = String

type DatabaseOutputList = js.Array[DatabaseOutput]

type DatabaseOutputMode = NEW_TABLE | String

type DatabaseTableName = String

type DatasetList = js.Array[Dataset]

type DatasetName = String

type Date = js.Date

type DatetimeFormat = String

type Delimiter = String

type Disabled = Boolean

type EncryptionKeyArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`SSE-KMS`
  - typingsJapgolly.awsSdk.awsSdkStrings.`SSE-S3`
  - java.lang.String
*/
type EncryptionMode = _EncryptionMode | String

type EntityType = String

type EntityTypeList = js.Array[EntityType]

type ErrorCode = String

type ExecutionTime = Double

type Expression = String

type GlueConnectionName = String

type HeaderRow = Boolean

type HiddenColumnList = js.Array[ColumnName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CSV
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - typingsJapgolly.awsSdk.awsSdkStrings.PARQUET
  - typingsJapgolly.awsSdk.awsSdkStrings.EXCEL
  - typingsJapgolly.awsSdk.awsSdkStrings.ORC
  - java.lang.String
*/
type InputFormat = _InputFormat | String

type JobList = js.Array[Job]

type JobName = String

type JobNameList = js.Array[JobName]

type JobRunErrorMessage = String

type JobRunId = String

type JobRunList = js.Array[JobRun]

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
type JobRunState = _JobRunState | String

type JobSize = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PROFILE
  - typingsJapgolly.awsSdk.awsSdkStrings.RECIPE
  - java.lang.String
*/
type JobType = _JobType | String

type Key = String

type LastModifiedBy = String

type LocaleCode = String

type LogGroupName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE
  - java.lang.String
*/
type LogSubscription = _LogSubscription | String

type MaxCapacity = Double

type MaxFiles = Double

type MaxOutputFiles = Double

type MaxResults100 = Double

type MaxRetries = Double

type MultiLine = Boolean

type NextToken = String

type OpenedBy = String

type Operation = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - java.lang.String
*/
type Order = _Order | String

type OrderedBy = LAST_MODIFIED_DATE | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CSV
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - typingsJapgolly.awsSdk.awsSdkStrings.PARQUET
  - typingsJapgolly.awsSdk.awsSdkStrings.GLUEPARQUET
  - typingsJapgolly.awsSdk.awsSdkStrings.AVRO
  - typingsJapgolly.awsSdk.awsSdkStrings.ORC
  - typingsJapgolly.awsSdk.awsSdkStrings.XML
  - typingsJapgolly.awsSdk.awsSdkStrings.TABLEAUHYPER
  - java.lang.String
*/
type OutputFormat = _OutputFormat | String

type OutputList = js.Array[Output]

type OverwriteOutput = Boolean

type ParameterMap = StringDictionary[ParameterValue]

type ParameterName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Datetime__
  - typingsJapgolly.awsSdk.awsSdkStrings.Number_
  - typingsJapgolly.awsSdk.awsSdkStrings.String_
  - java.lang.String
*/
type ParameterType = _ParameterType | String

type ParameterValue = String

type PathParameterName = String

type PathParametersMap = StringDictionary[DatasetParameter]

type Preview = Boolean

type ProjectList = js.Array[Project]

type ProjectName = String

type PublishedBy = String

type QueryString = String

type RecipeDescription = String

type RecipeErrorList = js.Array[RecipeVersionErrorDetail]

type RecipeErrorMessage = String

type RecipeList = js.Array[Recipe]

type RecipeName = String

type RecipeStepList = js.Array[RecipeStep]

type RecipeVersion = String

type RecipeVersionList = js.Array[RecipeVersion]

type Result = String

type RowRange = Double

type RuleCount = Double

type RuleList = js.Array[Rule]

type RuleName = String

type RulesetDescription = String

type RulesetItemList = js.Array[RulesetItem]

type RulesetName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL_DATASET
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_ROWS
  - java.lang.String
*/
type SampleMode = _SampleMode | String

type SampleSize = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FIRST_N
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_N
  - typingsJapgolly.awsSdk.awsSdkStrings.RANDOM
  - java.lang.String
*/
type SampleType = _SampleType | String

type ScheduleList = js.Array[Schedule]

type ScheduleName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSIGNED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZING
  - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONING
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.RECYCLING
  - typingsJapgolly.awsSdk.awsSdkStrings.ROTATING
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type SessionStatus = _SessionStatus | String

type SheetIndex = Double

type SheetIndexList = js.Array[SheetIndex]

type SheetName = String

type SheetNameList = js.Array[SheetName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.S3
  - typingsJapgolly.awsSdk.awsSdkStrings.`DATA-CATALOG`
  - typingsJapgolly.awsSdk.awsSdkStrings.DATABASE
  - java.lang.String
*/
type Source = _Source | String

type StartColumnIndex = Double

type StartRowIndex = Double

type StartedBy = String

type Statistic = String

type StatisticList = js.Array[Statistic]

type StatisticOverrideList = js.Array[StatisticOverride]

type StepIndex = Double

type TableName = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TargetColumn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
  - java.lang.String
*/
type ThresholdType = _ThresholdType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.PERCENTAGE
  - java.lang.String
*/
type ThresholdUnit = _ThresholdUnit | String

type ThresholdValue = Double

type Timeout = Double

type TimezoneOffset = String

type ValidationConfigurationList = js.Array[ValidationConfiguration]

type ValidationMode = CHECK_ALL | String

type ValueReference = String

type ValuesMap = StringDictionary[ConditionValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-07-25`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
