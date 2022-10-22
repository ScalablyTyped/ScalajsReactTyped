package typingsJapgolly.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessPolicy = String

type Arn = String

type Days = Double

type DefaultValue = Double

type Descending = Boolean

type DescribeLimit = Double

type DescribeQueriesMaxResults = Double

type DestinationArn = String

type DestinationName = String

type Destinations = js.Array[Destination]

type Dimensions = StringDictionary[DimensionsValue]

type DimensionsKey = String

type DimensionsValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Random_
  - typingsJapgolly.awsSdk.awsSdkStrings.ByLogStream
  - java.lang.String
*/
type Distribution = _Distribution | String

type EventId = String

type EventMessage = String

type EventNumber = Double

type EventsLimit = Double

type ExportDestinationBucket = String

type ExportDestinationPrefix = String

type ExportTaskId = String

type ExportTaskName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_CANCEL
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - java.lang.String
*/
type ExportTaskStatusCode = _ExportTaskStatusCode | String

type ExportTaskStatusMessage = String

type ExportTasks = js.Array[ExportTask]

type ExtractedValues = StringDictionary[Value]

type Field = String

type FilterCount = Double

type FilterName = String

type FilterPattern = String

type FilteredLogEvents = js.Array[FilteredLogEvent]

type ForceUpdate = Boolean

type InputLogEvents = js.Array[InputLogEvent]

type InputLogStreamNames = js.Array[LogStreamName]

type Interleaved = Boolean

type KmsKeyId = String

type LogEventIndex = Double

type LogGroupFieldList = js.Array[LogGroupField]

type LogGroupName = String

type LogGroupNames = js.Array[LogGroupName]

type LogGroups = js.Array[LogGroup]

type LogRecord = StringDictionary[Value]

type LogRecordPointer = String

type LogStreamName = String

type LogStreamSearchedCompletely = Boolean

type LogStreams = js.Array[LogStream]

type MetricFilterMatches = js.Array[MetricFilterMatchRecord]

type MetricFilters = js.Array[MetricFilter]

type MetricName = String

type MetricNamespace = String

type MetricTransformations = js.Array[MetricTransformation]

type MetricValue = String

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LogStreamName
  - typingsJapgolly.awsSdk.awsSdkStrings.LastEventTime
  - java.lang.String
*/
type OrderBy = _OrderBy | String

type OutputLogEvents = js.Array[OutputLogEvent]

type Percentage = Double

type PolicyDocument = String

type PolicyName = String

type QueryDefinitionList = js.Array[QueryDefinition]

type QueryDefinitionName = String

type QueryDefinitionString = String

type QueryId = String

type QueryInfoList = js.Array[QueryInfo]

type QueryListMaxResults = Double

type QueryResults = js.Array[ResultRows]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Scheduled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Running_
  - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Timeout_
  - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
  - java.lang.String
*/
type QueryStatus = _QueryStatus | String

type QueryString = String

type ResourcePolicies = js.Array[ResourcePolicy]

type ResultRows = js.Array[ResultField]

type RoleArn = String

type SearchedLogStreams = js.Array[SearchedLogStream]

type SequenceToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Seconds_
  - typingsJapgolly.awsSdk.awsSdkStrings.Microseconds_
  - typingsJapgolly.awsSdk.awsSdkStrings.Milliseconds_
  - typingsJapgolly.awsSdk.awsSdkStrings.Bytes_
  - typingsJapgolly.awsSdk.awsSdkStrings.Kilobytes
  - typingsJapgolly.awsSdk.awsSdkStrings.Megabytes
  - typingsJapgolly.awsSdk.awsSdkStrings.Gigabytes
  - typingsJapgolly.awsSdk.awsSdkStrings.Terabytes_
  - typingsJapgolly.awsSdk.awsSdkStrings.Bits_
  - typingsJapgolly.awsSdk.awsSdkStrings.Kilobits
  - typingsJapgolly.awsSdk.awsSdkStrings.Megabits
  - typingsJapgolly.awsSdk.awsSdkStrings.Gigabits
  - typingsJapgolly.awsSdk.awsSdkStrings.Terabits
  - typingsJapgolly.awsSdk.awsSdkStrings.Percent_
  - typingsJapgolly.awsSdk.awsSdkStrings.Count_
  - typingsJapgolly.awsSdk.awsSdkStrings.BytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.KilobytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.MegabytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.GigabytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.TerabytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.BitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.KilobitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.MegabitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.GigabitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.TerabitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.CountSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - java.lang.String
*/
type StandardUnit = _StandardUnit | String

type StartFromHead = Boolean

type StatsValue = Double

type StoredBytes = Double

type SubscriptionFilters = js.Array[SubscriptionFilter]

type Success = Boolean

type TagKey = String

type TagList = js.Array[TagKey]

type TagValue = String

type Tags = StringDictionary[TagValue]

type TargetArn = String

type TestEventMessages = js.Array[EventMessage]

type Timestamp = Double

type Token = String

type Value = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2014-03-28`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
