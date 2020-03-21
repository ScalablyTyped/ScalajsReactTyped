package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object forecastserviceMod {
  type Arn = java.lang.String
  type ArnList = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.Arn]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.string__
    - typingsJapgolly.awsSdk.awsSdkStrings.integer__
    - typingsJapgolly.awsSdk.awsSdkStrings.float_
    - typingsJapgolly.awsSdk.awsSdkStrings.timestamp_
    - java.lang.String
  */
  type AttributeType = typingsJapgolly.awsSdk.forecastserviceMod._AttributeType | java.lang.String
  type Boolean = scala.Boolean
  type CategoricalParameterRanges = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.CategoricalParameterRange]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.forecastserviceMod.ClientApiVersions
  type ContinuousParameterRanges = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.ContinuousParameterRange]
  type DatasetGroups = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.DatasetGroupSummary]
  type DatasetImportJobs = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.DatasetImportJobSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TARGET_TIME_SERIES
    - typingsJapgolly.awsSdk.awsSdkStrings.RELATED_TIME_SERIES
    - typingsJapgolly.awsSdk.awsSdkStrings.ITEM_METADATA
    - java.lang.String
  */
  type DatasetType = typingsJapgolly.awsSdk.forecastserviceMod._DatasetType | java.lang.String
  type Datasets = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.DatasetSummary]
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
  type Domain = typingsJapgolly.awsSdk.forecastserviceMod._Domain | java.lang.String
  type Double = scala.Double
  type ErrorMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUMMARY
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPUTED
    - java.lang.String
  */
  type EvaluationType = typingsJapgolly.awsSdk.forecastserviceMod._EvaluationType | java.lang.String
  type FeaturizationMethodName = typingsJapgolly.awsSdk.awsSdkStrings.filling | java.lang.String
  type FeaturizationMethodParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.forecastserviceMod.ParameterValue]
  type FeaturizationPipeline = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.FeaturizationMethod]
  type Featurizations = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.Featurization]
  type FieldStatistics = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.forecastserviceMod.Statistics]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IS
    - typingsJapgolly.awsSdk.awsSdkStrings.IS_NOT
    - java.lang.String
  */
  type FilterConditionString = typingsJapgolly.awsSdk.forecastserviceMod._FilterConditionString | java.lang.String
  type Filters = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.Filter]
  type ForecastDimensions = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.Name]
  type ForecastExportJobs = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.ForecastExportJobSummary]
  type ForecastType = java.lang.String
  type ForecastTypes = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.ForecastType]
  type Forecasts = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.ForecastSummary]
  type Frequency = java.lang.String
  type Integer = scala.Double
  type IntegerParameterRanges = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.IntegerParameterRange]
  type KMSKeyArn = java.lang.String
  type MaxResults = scala.Double
  type Message = java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterValue = java.lang.String
  type PredictorEvaluationResults = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.EvaluationResult]
  type PredictorExecutions = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.PredictorExecution]
  type Predictors = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.PredictorSummary]
  type S3Path = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Auto_
    - typingsJapgolly.awsSdk.awsSdkStrings.Linear_
    - typingsJapgolly.awsSdk.awsSdkStrings.Logarithmic
    - typingsJapgolly.awsSdk.awsSdkStrings.ReverseLogarithmic
    - java.lang.String
  */
  type ScalingType = typingsJapgolly.awsSdk.forecastserviceMod._ScalingType | java.lang.String
  type SchemaAttributes = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.SchemaAttribute]
  type Status = java.lang.String
  type String = java.lang.String
  type SupplementaryFeatures = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.SupplementaryFeature]
  type TestWindowDetails = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.TestWindowSummary]
  type TestWindows = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.WindowSummary]
  type Timestamp = js.Date
  type TimestampFormat = java.lang.String
  type TrainingParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.forecastserviceMod.ParameterValue]
  type Value = java.lang.String
  type Values = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.Value]
  type WeightedQuantileLosses = js.Array[typingsJapgolly.awsSdk.forecastserviceMod.WeightedQuantileLoss]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-06-26`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.forecastserviceMod._apiVersion | java.lang.String
}
