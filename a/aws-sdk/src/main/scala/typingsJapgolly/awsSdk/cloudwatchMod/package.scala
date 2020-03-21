package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudwatchMod {
  type ActionPrefix = java.lang.String
  type ActionsEnabled = scala.Boolean
  type AlarmArn = java.lang.String
  type AlarmDescription = java.lang.String
  type AlarmHistoryItems = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.AlarmHistoryItem]
  type AlarmName = java.lang.String
  type AlarmNamePrefix = java.lang.String
  type AlarmNames = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.AlarmName]
  type AmazonResourceName = java.lang.String
  type AnomalyDetectorExcludedTimeRanges = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.Range]
  type AnomalyDetectorMetricTimezone = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_TRAINING
    - typingsJapgolly.awsSdk.awsSdkStrings.TRAINED_INSUFFICIENT_DATA
    - typingsJapgolly.awsSdk.awsSdkStrings.TRAINED
    - java.lang.String
  */
  type AnomalyDetectorStateValue = typingsJapgolly.awsSdk.cloudwatchMod._AnomalyDetectorStateValue | java.lang.String
  type AnomalyDetectors = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.AnomalyDetector]
  type BatchFailures = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.PartialFailure]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.cloudwatchMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
    - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanThreshold
    - typingsJapgolly.awsSdk.awsSdkStrings.LessThanThreshold
    - typingsJapgolly.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
    - typingsJapgolly.awsSdk.awsSdkStrings.LessThanLowerOrGreaterThanUpperThreshold
    - typingsJapgolly.awsSdk.awsSdkStrings.LessThanLowerThreshold
    - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanUpperThreshold
    - java.lang.String
  */
  type ComparisonOperator = typingsJapgolly.awsSdk.cloudwatchMod._ComparisonOperator | java.lang.String
  type Counts = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.DatapointValue]
  type DashboardArn = java.lang.String
  type DashboardBody = java.lang.String
  type DashboardEntries = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.DashboardEntry]
  type DashboardName = java.lang.String
  type DashboardNamePrefix = java.lang.String
  type DashboardNames = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.DashboardName]
  type DashboardValidationMessages = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.DashboardValidationMessage]
  type DataPath = java.lang.String
  type DatapointValue = scala.Double
  type DatapointValueMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cloudwatchMod.DatapointValue]
  type DatapointValues = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.DatapointValue]
  type Datapoints = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.Datapoint]
  type DatapointsToAlarm = scala.Double
  type DimensionFilters = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.DimensionFilter]
  type DimensionName = java.lang.String
  type DimensionValue = java.lang.String
  type Dimensions = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.Dimension]
  type EvaluateLowSampleCountPercentile = java.lang.String
  type EvaluationPeriods = scala.Double
  type ExceptionType = java.lang.String
  type ExtendedStatistic = java.lang.String
  type ExtendedStatistics = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.ExtendedStatistic]
  type FailureCode = java.lang.String
  type FailureDescription = java.lang.String
  type FailureResource = java.lang.String
  type GetMetricDataMaxDatapoints = scala.Double
  type HistoryData = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationUpdate
    - typingsJapgolly.awsSdk.awsSdkStrings.StateUpdate
    - typingsJapgolly.awsSdk.awsSdkStrings.Action_
    - java.lang.String
  */
  type HistoryItemType = typingsJapgolly.awsSdk.cloudwatchMod._HistoryItemType | java.lang.String
  type HistorySummary = java.lang.String
  type InsightRuleAggregationStatistic = java.lang.String
  type InsightRuleContributorDatapoints = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.InsightRuleContributorDatapoint]
  type InsightRuleContributorKey = java.lang.String
  type InsightRuleContributorKeyLabel = java.lang.String
  type InsightRuleContributorKeyLabels = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.InsightRuleContributorKeyLabel]
  type InsightRuleContributorKeys = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.InsightRuleContributorKey]
  type InsightRuleContributors = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.InsightRuleContributor]
  type InsightRuleDefinition = java.lang.String
  type InsightRuleMaxResults = scala.Double
  type InsightRuleMetricDatapoints = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.InsightRuleMetricDatapoint]
  type InsightRuleMetricList = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.InsightRuleMetricName]
  type InsightRuleMetricName = java.lang.String
  type InsightRuleName = java.lang.String
  type InsightRuleNames = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.InsightRuleName]
  type InsightRuleOrderBy = java.lang.String
  type InsightRuleSchema = java.lang.String
  type InsightRuleState = java.lang.String
  type InsightRuleUnboundDouble = scala.Double
  type InsightRuleUnboundInteger = scala.Double
  type InsightRuleUnboundLong = scala.Double
  type InsightRules = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.InsightRule]
  type LastModified = js.Date
  type MaxRecords = scala.Double
  type MaxReturnedResultsCount = scala.Double
  type Message = java.lang.String
  type MessageDataCode = java.lang.String
  type MessageDataValue = java.lang.String
  type MetricAlarms = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.MetricAlarm]
  type MetricData = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.MetricDatum]
  type MetricDataQueries = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.MetricDataQuery]
  type MetricDataResultMessages = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.MessageData]
  type MetricDataResults = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.MetricDataResult]
  type MetricExpression = java.lang.String
  type MetricId = java.lang.String
  type MetricLabel = java.lang.String
  type MetricName = java.lang.String
  type MetricWidget = java.lang.String
  type MetricWidgetImage = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.cloudwatchMod.Blob | java.lang.String
  type Metrics = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.Metric]
  type Namespace = java.lang.String
  type NextToken = java.lang.String
  type OutputFormat = java.lang.String
  type Period = scala.Double
  type ResourceList = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.ResourceName]
  type ResourceName = java.lang.String
  type ReturnData = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TimestampDescending
    - typingsJapgolly.awsSdk.awsSdkStrings.TimestampAscending
    - java.lang.String
  */
  type ScanBy = typingsJapgolly.awsSdk.cloudwatchMod._ScanBy | java.lang.String
  type Size = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Seconds_
    - typingsJapgolly.awsSdk.awsSdkStrings.Microseconds
    - typingsJapgolly.awsSdk.awsSdkStrings.Milliseconds_
    - typingsJapgolly.awsSdk.awsSdkStrings.Bytes_
    - typingsJapgolly.awsSdk.awsSdkStrings.Kilobytes
    - typingsJapgolly.awsSdk.awsSdkStrings.Megabytes
    - typingsJapgolly.awsSdk.awsSdkStrings.Gigabytes
    - typingsJapgolly.awsSdk.awsSdkStrings.Terabytes
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
  type StandardUnit = typingsJapgolly.awsSdk.cloudwatchMod._StandardUnit | java.lang.String
  type Stat = java.lang.String
  type StateReason = java.lang.String
  type StateReasonData = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OK
    - typingsJapgolly.awsSdk.awsSdkStrings.ALARM
    - typingsJapgolly.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
    - java.lang.String
  */
  type StateValue = typingsJapgolly.awsSdk.cloudwatchMod._StateValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SampleCount
    - typingsJapgolly.awsSdk.awsSdkStrings.Average_
    - typingsJapgolly.awsSdk.awsSdkStrings.Sum_
    - typingsJapgolly.awsSdk.awsSdkStrings.Minimum_
    - typingsJapgolly.awsSdk.awsSdkStrings.Maximum_
    - java.lang.String
  */
  type Statistic = typingsJapgolly.awsSdk.cloudwatchMod._Statistic | java.lang.String
  type Statistics = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.Statistic]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
    - typingsJapgolly.awsSdk.awsSdkStrings.InternalError
    - typingsJapgolly.awsSdk.awsSdkStrings.PartialData
    - java.lang.String
  */
  type StatusCode = typingsJapgolly.awsSdk.cloudwatchMod._StatusCode | java.lang.String
  type StorageResolution = scala.Double
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.Tag]
  type TagValue = java.lang.String
  type Threshold = scala.Double
  type Timestamp = js.Date
  type Timestamps = js.Array[js.Date]
  type TreatMissingData = java.lang.String
  type Values = js.Array[typingsJapgolly.awsSdk.cloudwatchMod.DatapointValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2010-08-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.cloudwatchMod._apiVersion | java.lang.String
}
