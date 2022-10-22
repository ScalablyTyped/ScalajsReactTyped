package typingsJapgolly.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.filling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AdditionalDatasets = js.Array[AdditionalDataset]

type Arn = java.lang.String

type ArnList = js.Array[Arn]

type AttributeConfigs = js.Array[AttributeConfig]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.string__
  - typingsJapgolly.awsSdk.awsSdkStrings.integer__
  - typingsJapgolly.awsSdk.awsSdkStrings.float_
  - typingsJapgolly.awsSdk.awsSdkStrings.timestamp_
  - typingsJapgolly.awsSdk.awsSdkStrings.geolocation
  - java.lang.String
*/
type AttributeType = _AttributeType | java.lang.String

type AttributeValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LatencyOptimized
  - typingsJapgolly.awsSdk.awsSdkStrings.AccuracyOptimized
  - java.lang.String
*/
type AutoMLOverrideStrategy = _AutoMLOverrideStrategy | java.lang.String

type BaselineMetrics = js.Array[BaselineMetric]

type Boolean = scala.Boolean

type CategoricalParameterRanges = js.Array[CategoricalParameterRange]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EQUALS
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EQUALS
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
  - java.lang.String
*/
type Condition = _Condition | java.lang.String

type Configuration = StringDictionary[Values]

type ContinuousParameterRanges = js.Array[ContinuousParameterRange]

type DatasetGroups = js.Array[DatasetGroupSummary]

type DatasetImportJobs = js.Array[DatasetImportJobSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TARGET_TIME_SERIES
  - typingsJapgolly.awsSdk.awsSdkStrings.RELATED_TIME_SERIES
  - typingsJapgolly.awsSdk.awsSdkStrings.ITEM_METADATA
  - java.lang.String
*/
type DatasetType = _DatasetType | java.lang.String

type Datasets = js.Array[DatasetSummary]

type DayOfMonth = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MONDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.TUESDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.WEDNESDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.THURSDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.FRIDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.SATURDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.SUNDAY
  - java.lang.String
*/
type DayOfWeek = _DayOfWeek | java.lang.String

type Detail = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RETAIL
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
  - typingsJapgolly.awsSdk.awsSdkStrings.INVENTORY_PLANNING
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2_CAPACITY
  - typingsJapgolly.awsSdk.awsSdkStrings.WORK_FORCE
  - typingsJapgolly.awsSdk.awsSdkStrings.WEB_TRAFFIC
  - typingsJapgolly.awsSdk.awsSdkStrings.METRICS
  - java.lang.String
*/
type Domain = _Domain | java.lang.String

type Double = scala.Double

type ErrorMessage = java.lang.String

type ErrorMetrics = js.Array[ErrorMetric]

type EvaluationState = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUMMARY
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPUTED
  - java.lang.String
*/
type EvaluationType = _EvaluationType | java.lang.String

type Explainabilities = js.Array[ExplainabilitySummary]

type ExplainabilityExports = js.Array[ExplainabilityExportSummary]

type FeaturizationMethodName = filling | java.lang.String

type FeaturizationMethodParameters = StringDictionary[ParameterValue]

type FeaturizationPipeline = js.Array[FeaturizationMethod]

type Featurizations = js.Array[Featurization]

type FieldStatistics = StringDictionary[Statistics]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IS
  - typingsJapgolly.awsSdk.awsSdkStrings.IS_NOT
  - java.lang.String
*/
type FilterConditionString = _FilterConditionString | java.lang.String

type Filters = js.Array[Filter]

type ForecastDimensions = js.Array[Name]

type ForecastExportJobs = js.Array[ForecastExportJobSummary]

type ForecastType = java.lang.String

type ForecastTypes = js.Array[ForecastType]

type Forecasts = js.Array[ForecastSummary]

type Format = java.lang.String

type Frequency = java.lang.String

type GeolocationFormat = java.lang.String

type Hour = scala.Double

type Integer = scala.Double

type IntegerParameterRanges = js.Array[IntegerParameterRange]

type KMSKeyArn = java.lang.String

type LocalDateTime = java.lang.String

type Long = scala.Double

type LongArn = java.lang.String

type LongArnList = js.Array[LongArn]

type MaxResults = scala.Double

type Message = java.lang.String

type MetricName = java.lang.String

type MetricResults = js.Array[MetricResult]

type Monitors = js.Array[MonitorSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JANUARY
  - typingsJapgolly.awsSdk.awsSdkStrings.FEBRUARY
  - typingsJapgolly.awsSdk.awsSdkStrings.MARCH
  - typingsJapgolly.awsSdk.awsSdkStrings.APRIL
  - typingsJapgolly.awsSdk.awsSdkStrings.MAY
  - typingsJapgolly.awsSdk.awsSdkStrings.JUNE
  - typingsJapgolly.awsSdk.awsSdkStrings.JULY
  - typingsJapgolly.awsSdk.awsSdkStrings.AUGUST
  - typingsJapgolly.awsSdk.awsSdkStrings.SEPTEMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.OCTOBER
  - typingsJapgolly.awsSdk.awsSdkStrings.NOVEMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.DECEMBER
  - java.lang.String
*/
type Month = _Month | java.lang.String

type Name = java.lang.String

type NextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ADD
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBTRACT
  - typingsJapgolly.awsSdk.awsSdkStrings.MULTIPLY
  - typingsJapgolly.awsSdk.awsSdkStrings.DIVIDE
  - java.lang.String
*/
type Operation = _Operation | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WAPE
  - typingsJapgolly.awsSdk.awsSdkStrings.RMSE
  - typingsJapgolly.awsSdk.awsSdkStrings.AverageWeightedQuantileLoss
  - typingsJapgolly.awsSdk.awsSdkStrings.MASE
  - typingsJapgolly.awsSdk.awsSdkStrings.MAPE
  - java.lang.String
*/
type OptimizationMetric = _OptimizationMetric | java.lang.String

type ParameterKey = java.lang.String

type ParameterValue = java.lang.String

type PredictorBacktestExportJobs = js.Array[PredictorBacktestExportJobSummary]

type PredictorEvaluationResults = js.Array[EvaluationResult]

type PredictorExecutions = js.Array[PredictorExecution]

type PredictorMonitorEvaluations = js.Array[PredictorMonitorEvaluation]

type Predictors = js.Array[PredictorSummary]

type S3Path = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Auto_
  - typingsJapgolly.awsSdk.awsSdkStrings.Linear_
  - typingsJapgolly.awsSdk.awsSdkStrings.Logarithmic
  - typingsJapgolly.awsSdk.awsSdkStrings.ReverseLogarithmic
  - java.lang.String
*/
type ScalingType = _ScalingType | java.lang.String

type SchemaAttributes = js.Array[SchemaAttribute]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
  - java.lang.String
*/
type State = _State | java.lang.String

type Status = java.lang.String

type String = java.lang.String

type SupplementaryFeatures = js.Array[SupplementaryFeature]

type TagKey = java.lang.String

type TagKeys = js.Array[TagKey]

type TagValue = java.lang.String

type Tags = js.Array[Tag]

type TestWindowDetails = js.Array[TestWindowSummary]

type TestWindows = js.Array[WindowSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.SPECIFIC
  - java.lang.String
*/
type TimePointGranularity = _TimePointGranularity | java.lang.String

type TimeSeriesConditions = js.Array[TimeSeriesCondition]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.SPECIFIC
  - java.lang.String
*/
type TimeSeriesGranularity = _TimeSeriesGranularity | java.lang.String

type TimeSeriesTransformations = js.Array[TimeSeriesTransformation]

type TimeZone = java.lang.String

type Timestamp = js.Date

type TimestampFormat = java.lang.String

type TrainingParameters = StringDictionary[ParameterValue]

type Transformations = StringDictionary[Value]

type UseGeolocationForTimeZone = scala.Boolean

type Value = java.lang.String

type Values = js.Array[Value]

type WeightedQuantileLosses = js.Array[WeightedQuantileLoss]

type WhatIfAnalyses = js.Array[WhatIfAnalysisSummary]

type WhatIfForecastArnListForExport = js.Array[LongArn]

type WhatIfForecastExports = js.Array[WhatIfForecastExportSummary]

type WhatIfForecasts = js.Array[WhatIfForecastSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-06-26`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
