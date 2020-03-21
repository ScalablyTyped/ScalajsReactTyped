package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object autoscalingplansMod {
  type ApplicationSources = js.Array[typingsJapgolly.awsSdk.autoscalingplansMod.ApplicationSource]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.autoscalingplansMod.ClientApiVersions
  type Cooldown = scala.Double
  type Datapoints = js.Array[typingsJapgolly.awsSdk.autoscalingplansMod.Datapoint]
  type DisableDynamicScaling = scala.Boolean
  type DisableScaleIn = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CapacityForecast
    - typingsJapgolly.awsSdk.awsSdkStrings.LoadForecast
    - typingsJapgolly.awsSdk.awsSdkStrings.ScheduledActionMinCapacity
    - typingsJapgolly.awsSdk.awsSdkStrings.ScheduledActionMaxCapacity
    - java.lang.String
  */
  type ForecastDataType = typingsJapgolly.awsSdk.autoscalingplansMod._ForecastDataType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASGTotalCPUUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.ASGTotalNetworkIn
    - typingsJapgolly.awsSdk.awsSdkStrings.ASGTotalNetworkOut
    - typingsJapgolly.awsSdk.awsSdkStrings.ALBTargetGroupRequestCount
    - java.lang.String
  */
  type LoadMetricType = typingsJapgolly.awsSdk.autoscalingplansMod._LoadMetricType | java.lang.String
  type MaxResults = scala.Double
  type MetricDimensionName = java.lang.String
  type MetricDimensionValue = java.lang.String
  type MetricDimensions = js.Array[typingsJapgolly.awsSdk.autoscalingplansMod.MetricDimension]
  type MetricName = java.lang.String
  type MetricNamespace = java.lang.String
  type MetricScale = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Average_
    - typingsJapgolly.awsSdk.awsSdkStrings.Minimum_
    - typingsJapgolly.awsSdk.awsSdkStrings.Maximum_
    - typingsJapgolly.awsSdk.awsSdkStrings.SampleCount
    - typingsJapgolly.awsSdk.awsSdkStrings.Sum_
    - java.lang.String
  */
  type MetricStatistic = typingsJapgolly.awsSdk.autoscalingplansMod._MetricStatistic | java.lang.String
  type MetricUnit = java.lang.String
  type NextToken = java.lang.String
  type PolicyName = java.lang.String
  type PolicyType = typingsJapgolly.awsSdk.awsSdkStrings.TargetTrackingScaling | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SetForecastCapacityToMaxCapacity
    - typingsJapgolly.awsSdk.awsSdkStrings.SetMaxCapacityToForecastCapacity
    - typingsJapgolly.awsSdk.awsSdkStrings.SetMaxCapacityAboveForecastCapacity
    - java.lang.String
  */
  type PredictiveScalingMaxCapacityBehavior = typingsJapgolly.awsSdk.autoscalingplansMod._PredictiveScalingMaxCapacityBehavior | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ForecastAndScale
    - typingsJapgolly.awsSdk.awsSdkStrings.ForecastOnly
    - java.lang.String
  */
  type PredictiveScalingMode = typingsJapgolly.awsSdk.autoscalingplansMod._PredictiveScalingMode | java.lang.String
  type ResourceCapacity = scala.Double
  type ResourceIdMaxLen1600 = java.lang.String
  type ResourceLabel = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.autoscalingColonautoScalingGroupColonDesiredCapacity
    - typingsJapgolly.awsSdk.awsSdkStrings.ecsColonserviceColonDesiredCount
    - typingsJapgolly.awsSdk.awsSdkStrings.`ec2Colonspot-fleet-requestColonTargetCapacity`
    - typingsJapgolly.awsSdk.awsSdkStrings.rdsColonclusterColonReadReplicaCount
    - typingsJapgolly.awsSdk.awsSdkStrings.dynamodbColontableColonReadCapacityUnits
    - typingsJapgolly.awsSdk.awsSdkStrings.dynamodbColontableColonWriteCapacityUnits
    - typingsJapgolly.awsSdk.awsSdkStrings.dynamodbColonindexColonReadCapacityUnits
    - typingsJapgolly.awsSdk.awsSdkStrings.dynamodbColonindexColonWriteCapacityUnits
    - java.lang.String
  */
  type ScalableDimension = typingsJapgolly.awsSdk.autoscalingplansMod._ScalableDimension | java.lang.String
  type ScalingInstructions = js.Array[typingsJapgolly.awsSdk.autoscalingplansMod.ScalingInstruction]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASGAverageCPUUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.ASGAverageNetworkIn
    - typingsJapgolly.awsSdk.awsSdkStrings.ASGAverageNetworkOut
    - typingsJapgolly.awsSdk.awsSdkStrings.DynamoDBReadCapacityUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.DynamoDBWriteCapacityUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.ECSServiceAverageCPUUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.ECSServiceAverageMemoryUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.ALBRequestCountPerTarget
    - typingsJapgolly.awsSdk.awsSdkStrings.RDSReaderAverageCPUUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.RDSReaderAverageDatabaseConnections
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageCPUUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageNetworkIn
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageNetworkOut
    - java.lang.String
  */
  type ScalingMetricType = typingsJapgolly.awsSdk.autoscalingplansMod._ScalingMetricType | java.lang.String
  type ScalingPlanName = java.lang.String
  type ScalingPlanNames = js.Array[typingsJapgolly.awsSdk.autoscalingplansMod.ScalingPlanName]
  type ScalingPlanResources = js.Array[typingsJapgolly.awsSdk.autoscalingplansMod.ScalingPlanResource]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.ActiveWithProblems
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationInProgress
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.DeletionInProgress
    - typingsJapgolly.awsSdk.awsSdkStrings.DeletionFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.UpdateInProgress
    - typingsJapgolly.awsSdk.awsSdkStrings.UpdateFailed
    - java.lang.String
  */
  type ScalingPlanStatusCode = typingsJapgolly.awsSdk.autoscalingplansMod._ScalingPlanStatusCode | java.lang.String
  type ScalingPlanVersion = scala.Double
  type ScalingPlans = js.Array[typingsJapgolly.awsSdk.autoscalingplansMod.ScalingPlan]
  type ScalingPolicies = js.Array[typingsJapgolly.awsSdk.autoscalingplansMod.ScalingPolicy]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.KeepExternalPolicies
    - typingsJapgolly.awsSdk.awsSdkStrings.ReplaceExternalPolicies
    - java.lang.String
  */
  type ScalingPolicyUpdateBehavior = typingsJapgolly.awsSdk.autoscalingplansMod._ScalingPolicyUpdateBehavior | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
    - typingsJapgolly.awsSdk.awsSdkStrings.PartiallyActive
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - java.lang.String
  */
  type ScalingStatusCode = typingsJapgolly.awsSdk.autoscalingplansMod._ScalingStatusCode | java.lang.String
  type ScheduledActionBufferTime = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.autoscaling
    - typingsJapgolly.awsSdk.awsSdkStrings.ecs_
    - typingsJapgolly.awsSdk.awsSdkStrings.ec2_
    - typingsJapgolly.awsSdk.awsSdkStrings.rds_
    - typingsJapgolly.awsSdk.awsSdkStrings.dynamodb
    - java.lang.String
  */
  type ServiceNamespace = typingsJapgolly.awsSdk.autoscalingplansMod._ServiceNamespace | java.lang.String
  type TagFilters = js.Array[typingsJapgolly.awsSdk.autoscalingplansMod.TagFilter]
  type TagValues = js.Array[typingsJapgolly.awsSdk.autoscalingplansMod.XmlStringMaxLen256]
  type TargetTrackingConfigurations = js.Array[typingsJapgolly.awsSdk.autoscalingplansMod.TargetTrackingConfiguration]
  type TimestampType = js.Date
  type XmlString = java.lang.String
  type XmlStringMaxLen128 = java.lang.String
  type XmlStringMaxLen256 = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-01-06`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.autoscalingplansMod._apiVersion | java.lang.String
}
