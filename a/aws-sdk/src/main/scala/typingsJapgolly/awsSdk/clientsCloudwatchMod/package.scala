package typingsJapgolly.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.PT3H
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type ActionPrefix = String

type ActionsEnabled = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WaitPeriod
  - typingsJapgolly.awsSdk.awsSdkStrings.ExtensionPeriod
  - typingsJapgolly.awsSdk.awsSdkStrings.Alarm_
  - java.lang.String
*/
type ActionsSuppressedBy = _ActionsSuppressedBy | String

type ActionsSuppressedReason = String

type AlarmArn = String

type AlarmDescription = String

type AlarmHistoryItems = js.Array[AlarmHistoryItem]

type AlarmName = String

type AlarmNamePrefix = String

type AlarmNames = js.Array[AlarmName]

type AlarmRule = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CompositeAlarm
  - typingsJapgolly.awsSdk.awsSdkStrings.MetricAlarm
  - java.lang.String
*/
type AlarmType = _AlarmType | String

type AlarmTypes = js.Array[AlarmType]

type AmazonResourceName = String

type AnomalyDetectorExcludedTimeRanges = js.Array[Range]

type AnomalyDetectorMetricStat = String

type AnomalyDetectorMetricTimezone = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_TRAINING
  - typingsJapgolly.awsSdk.awsSdkStrings.TRAINED_INSUFFICIENT_DATA
  - typingsJapgolly.awsSdk.awsSdkStrings.TRAINED
  - java.lang.String
*/
type AnomalyDetectorStateValue = _AnomalyDetectorStateValue | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_METRIC
  - typingsJapgolly.awsSdk.awsSdkStrings.METRIC_MATH
  - java.lang.String
*/
type AnomalyDetectorType = _AnomalyDetectorType | String

type AnomalyDetectorTypes = js.Array[AnomalyDetectorType]

type AnomalyDetectors = js.Array[AnomalyDetector]

type BatchFailures = js.Array[PartialFailure]

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
type ComparisonOperator = _ComparisonOperator | String

type CompositeAlarms = js.Array[CompositeAlarm]

type Counts = js.Array[DatapointValue]

type DashboardArn = String

type DashboardBody = String

type DashboardEntries = js.Array[DashboardEntry]

type DashboardName = String

type DashboardNamePrefix = String

type DashboardNames = js.Array[DashboardName]

type DashboardValidationMessages = js.Array[DashboardValidationMessage]

type DataPath = String

type DatapointValue = Double

type DatapointValueMap = StringDictionary[DatapointValue]

type DatapointValues = js.Array[DatapointValue]

type Datapoints = js.Array[Datapoint]

type DatapointsToAlarm = Double

type DimensionFilters = js.Array[DimensionFilter]

type DimensionName = String

type DimensionValue = String

type Dimensions = js.Array[Dimension]

type EvaluateLowSampleCountPercentile = String

type EvaluationPeriods = Double

type ExceptionType = String

type ExtendedStatistic = String

type ExtendedStatistics = js.Array[ExtendedStatistic]

type FailureCode = String

type FailureDescription = String

type FailureResource = String

type GetMetricDataLabelTimezone = String

type GetMetricDataMaxDatapoints = Double

type HistoryData = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationUpdate
  - typingsJapgolly.awsSdk.awsSdkStrings.StateUpdate
  - typingsJapgolly.awsSdk.awsSdkStrings.Action_
  - java.lang.String
*/
type HistoryItemType = _HistoryItemType | String

type HistorySummary = String

type InsightRuleAggregationStatistic = String

type InsightRuleContributorDatapoints = js.Array[InsightRuleContributorDatapoint]

type InsightRuleContributorKey = String

type InsightRuleContributorKeyLabel = String

type InsightRuleContributorKeyLabels = js.Array[InsightRuleContributorKeyLabel]

type InsightRuleContributorKeys = js.Array[InsightRuleContributorKey]

type InsightRuleContributors = js.Array[InsightRuleContributor]

type InsightRuleDefinition = String

type InsightRuleIsManaged = Boolean

type InsightRuleMaxResults = Double

type InsightRuleMetricDatapoints = js.Array[InsightRuleMetricDatapoint]

type InsightRuleMetricList = js.Array[InsightRuleMetricName]

type InsightRuleMetricName = String

type InsightRuleName = String

type InsightRuleNames = js.Array[InsightRuleName]

type InsightRuleOrderBy = String

type InsightRuleSchema = String

type InsightRuleState = String

type InsightRuleUnboundDouble = Double

type InsightRuleUnboundInteger = Double

type InsightRuleUnboundLong = Double

type InsightRules = js.Array[InsightRule]

type LastModified = js.Date

type ListMetricStreamsMaxResults = Double

type ManagedRuleDescriptions = js.Array[ManagedRuleDescription]

type ManagedRules = js.Array[ManagedRule]

type MaxRecords = Double

type MaxReturnedResultsCount = Double

type Message = String

type MessageDataCode = String

type MessageDataValue = String

type MetricAlarms = js.Array[MetricAlarm]

type MetricData = js.Array[MetricDatum]

type MetricDataQueries = js.Array[MetricDataQuery]

type MetricDataResultMessages = js.Array[MessageData]

type MetricDataResults = js.Array[MetricDataResult]

type MetricExpression = String

type MetricId = String

type MetricLabel = String

type MetricName = String

type MetricStreamEntries = js.Array[MetricStreamEntry]

type MetricStreamFilters = js.Array[MetricStreamFilter]

type MetricStreamName = String

type MetricStreamNames = js.Array[MetricStreamName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.json__
  - typingsJapgolly.awsSdk.awsSdkStrings.opentelemetry0Dot7
  - java.lang.String
*/
type MetricStreamOutputFormat = _MetricStreamOutputFormat | String

type MetricStreamState = String

type MetricStreamStatistic = String

type MetricStreamStatisticsAdditionalStatistics = js.Array[MetricStreamStatistic]

type MetricStreamStatisticsConfigurations = js.Array[MetricStreamStatisticsConfiguration]

type MetricStreamStatisticsIncludeMetrics = js.Array[MetricStreamStatisticsMetric]

type MetricWidget = String

type MetricWidgetImage = Buffer | js.typedarray.Uint8Array | Blob | String

type Metrics = js.Array[Metric]

type Namespace = String

type NextToken = String

type OutputFormat = String

type Period = Double

type RecentlyActive = PT3H | String

type ResourceList = js.Array[ResourceName]

type ResourceName = String

type ReturnData = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TimestampDescending
  - typingsJapgolly.awsSdk.awsSdkStrings.TimestampAscending
  - java.lang.String
*/
type ScanBy = _ScanBy | String

type Size = Double

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

type Stat = String

type StateReason = String

type StateReasonData = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OK
  - typingsJapgolly.awsSdk.awsSdkStrings.ALARM
  - typingsJapgolly.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
  - java.lang.String
*/
type StateValue = _StateValue | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SampleCount
  - typingsJapgolly.awsSdk.awsSdkStrings.Average_
  - typingsJapgolly.awsSdk.awsSdkStrings.Sum_
  - typingsJapgolly.awsSdk.awsSdkStrings.Minimum_
  - typingsJapgolly.awsSdk.awsSdkStrings.Maximum_
  - java.lang.String
*/
type Statistic = _Statistic | String

type Statistics = js.Array[Statistic]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalError
  - typingsJapgolly.awsSdk.awsSdkStrings.PartialData
  - java.lang.String
*/
type StatusCode = _StatusCode | String

type StorageResolution = Double

type SuppressorPeriod = Double

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TemplateName = String

type Threshold = Double

type Timestamp = js.Date

type Timestamps = js.Array[js.Date]

type TreatMissingData = String

type Values = js.Array[DatapointValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2010-08-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
