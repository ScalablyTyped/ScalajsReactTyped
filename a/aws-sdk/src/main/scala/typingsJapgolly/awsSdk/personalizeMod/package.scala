package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object personalizeMod {
  type AccountId = java.lang.String
  type Arn = java.lang.String
  type ArnList = js.Array[typingsJapgolly.awsSdk.personalizeMod.Arn]
  type AvroSchema = java.lang.String
  type BatchInferenceJobs = js.Array[typingsJapgolly.awsSdk.personalizeMod.BatchInferenceJobSummary]
  type Boolean = scala.Boolean
  type Campaigns = js.Array[typingsJapgolly.awsSdk.personalizeMod.CampaignSummary]
  type CategoricalHyperParameterRanges = js.Array[typingsJapgolly.awsSdk.personalizeMod.CategoricalHyperParameterRange]
  type CategoricalValue = java.lang.String
  type CategoricalValues = js.Array[typingsJapgolly.awsSdk.personalizeMod.CategoricalValue]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.personalizeMod.ClientApiVersions
  type ContinuousHyperParameterRanges = js.Array[typingsJapgolly.awsSdk.personalizeMod.ContinuousHyperParameterRange]
  type ContinuousMaxValue = scala.Double
  type ContinuousMinValue = scala.Double
  type DatasetGroups = js.Array[typingsJapgolly.awsSdk.personalizeMod.DatasetGroupSummary]
  type DatasetImportJobs = js.Array[typingsJapgolly.awsSdk.personalizeMod.DatasetImportJobSummary]
  type DatasetType = java.lang.String
  type Datasets = js.Array[typingsJapgolly.awsSdk.personalizeMod.DatasetSummary]
  type Date = js.Date
  type DefaultCategoricalHyperParameterRanges = js.Array[typingsJapgolly.awsSdk.personalizeMod.DefaultCategoricalHyperParameterRange]
  type DefaultContinuousHyperParameterRanges = js.Array[typingsJapgolly.awsSdk.personalizeMod.DefaultContinuousHyperParameterRange]
  type DefaultIntegerHyperParameterRanges = js.Array[typingsJapgolly.awsSdk.personalizeMod.DefaultIntegerHyperParameterRange]
  type Description = java.lang.String
  type DockerURI = java.lang.String
  type EventTrackers = js.Array[typingsJapgolly.awsSdk.personalizeMod.EventTrackerSummary]
  type EventType = java.lang.String
  type EventValueThreshold = java.lang.String
  type FailureReason = java.lang.String
  type FeatureTransformationParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.personalizeMod.ParameterValue]
  type FeaturizationParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.personalizeMod.ParameterValue]
  type HPOObjectiveType = java.lang.String
  type HPOResource = java.lang.String
  type HyperParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.personalizeMod.ParameterValue]
  type IntegerHyperParameterRanges = js.Array[typingsJapgolly.awsSdk.personalizeMod.IntegerHyperParameterRange]
  type IntegerMaxValue = scala.Double
  type IntegerMinValue = scala.Double
  type KmsKeyArn = java.lang.String
  type MaxResults = scala.Double
  type MetricName = java.lang.String
  type MetricRegex = java.lang.String
  type MetricValue = scala.Double
  type Metrics = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.personalizeMod.MetricValue]
  type Name = java.lang.String
  type NextToken = java.lang.String
  type NumBatchResults = scala.Double
  type ParameterName = java.lang.String
  type ParameterValue = java.lang.String
  type PerformAutoML = scala.Boolean
  type PerformHPO = scala.Boolean
  type RecipeProvider = typingsJapgolly.awsSdk.awsSdkStrings.SERVICE | java.lang.String
  type RecipeType = java.lang.String
  type Recipes = js.Array[typingsJapgolly.awsSdk.personalizeMod.RecipeSummary]
  type ResourceConfig = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.personalizeMod.ParameterValue]
  type RoleArn = java.lang.String
  type S3Location = java.lang.String
  type Schemas = js.Array[typingsJapgolly.awsSdk.personalizeMod.DatasetSchemaSummary]
  type SolutionVersions = js.Array[typingsJapgolly.awsSdk.personalizeMod.SolutionVersionSummary]
  type Solutions = js.Array[typingsJapgolly.awsSdk.personalizeMod.SolutionSummary]
  type Status = java.lang.String
  type TrackingId = java.lang.String
  type TrainingHours = scala.Double
  type TrainingInputMode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FULL
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE
    - java.lang.String
  */
  type TrainingMode = typingsJapgolly.awsSdk.personalizeMod._TrainingMode | java.lang.String
  type TransactionsPerSecond = scala.Double
  type Tunable = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-05-22`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.personalizeMod._apiVersion | java.lang.String
}
