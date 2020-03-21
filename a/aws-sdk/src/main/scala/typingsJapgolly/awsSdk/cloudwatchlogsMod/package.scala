package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudwatchlogsMod {
  type AccessPolicy = java.lang.String
  type Arn = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.cloudwatchlogsMod.ClientApiVersions
  type Days = scala.Double
  type DefaultValue = scala.Double
  type Descending = scala.Boolean
  type DescribeLimit = scala.Double
  type DescribeQueriesMaxResults = scala.Double
  type DestinationArn = java.lang.String
  type DestinationName = java.lang.String
  type Destinations = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.Destination]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Random
    - typingsJapgolly.awsSdk.awsSdkStrings.ByLogStream
    - java.lang.String
  */
  type Distribution = typingsJapgolly.awsSdk.cloudwatchlogsMod._Distribution | java.lang.String
  type EventId = java.lang.String
  type EventMessage = java.lang.String
  type EventNumber = scala.Double
  type EventsLimit = scala.Double
  type ExportDestinationBucket = java.lang.String
  type ExportDestinationPrefix = java.lang.String
  type ExportTaskId = java.lang.String
  type ExportTaskName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_CANCEL
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - java.lang.String
  */
  type ExportTaskStatusCode = typingsJapgolly.awsSdk.cloudwatchlogsMod._ExportTaskStatusCode | java.lang.String
  type ExportTaskStatusMessage = java.lang.String
  type ExportTasks = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.ExportTask]
  type ExtractedValues = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cloudwatchlogsMod.Value]
  type Field = java.lang.String
  type FilterCount = scala.Double
  type FilterName = java.lang.String
  type FilterPattern = java.lang.String
  type FilteredLogEvents = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.FilteredLogEvent]
  type InputLogEvents = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.InputLogEvent]
  type InputLogStreamNames = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.LogStreamName]
  type Interleaved = scala.Boolean
  type KmsKeyId = java.lang.String
  type LogEventIndex = scala.Double
  type LogGroupFieldList = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.LogGroupField]
  type LogGroupName = java.lang.String
  type LogGroupNames = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.LogGroupName]
  type LogGroups = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.LogGroup]
  type LogRecord = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cloudwatchlogsMod.Value]
  type LogRecordPointer = java.lang.String
  type LogStreamName = java.lang.String
  type LogStreamSearchedCompletely = scala.Boolean
  type LogStreams = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.LogStream]
  type MetricFilterMatches = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.MetricFilterMatchRecord]
  type MetricFilters = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.MetricFilter]
  type MetricName = java.lang.String
  type MetricNamespace = java.lang.String
  type MetricTransformations = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.MetricTransformation]
  type MetricValue = java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LogStreamName
    - typingsJapgolly.awsSdk.awsSdkStrings.LastEventTime
    - java.lang.String
  */
  type OrderBy = typingsJapgolly.awsSdk.cloudwatchlogsMod._OrderBy | java.lang.String
  type OutputLogEvents = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.OutputLogEvent]
  type Percentage = scala.Double
  type PolicyDocument = java.lang.String
  type PolicyName = java.lang.String
  type QueryId = java.lang.String
  type QueryInfoList = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.QueryInfo]
  type QueryResults = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.ResultRows]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Scheduled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Running_
    - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
    - java.lang.String
  */
  type QueryStatus = typingsJapgolly.awsSdk.cloudwatchlogsMod._QueryStatus | java.lang.String
  type QueryString = java.lang.String
  type ResourcePolicies = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.ResourcePolicy]
  type ResultRows = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.ResultField]
  type RoleArn = java.lang.String
  type SearchedLogStreams = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.SearchedLogStream]
  type SequenceToken = java.lang.String
  type StartFromHead = scala.Boolean
  type StatsValue = scala.Double
  type StoredBytes = scala.Double
  type SubscriptionFilters = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.SubscriptionFilter]
  type Success = scala.Boolean
  type TagKey = java.lang.String
  type TagList = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cloudwatchlogsMod.TagValue]
  type TargetArn = java.lang.String
  type TestEventMessages = js.Array[typingsJapgolly.awsSdk.cloudwatchlogsMod.EventMessage]
  type Timestamp = scala.Double
  type Token = java.lang.String
  type Value = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-03-28`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.cloudwatchlogsMod._apiVersion | java.lang.String
}
