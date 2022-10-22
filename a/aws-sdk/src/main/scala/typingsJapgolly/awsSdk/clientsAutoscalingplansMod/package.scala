package typingsJapgolly.awsSdk.clientsAutoscalingplansMod

import typingsJapgolly.awsSdk.awsSdkStrings.TargetTrackingScaling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApplicationSources = js.Array[ApplicationSource]

type Cooldown = Double

type Datapoints = js.Array[Datapoint]

type DisableDynamicScaling = Boolean

type DisableScaleIn = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CapacityForecast
  - typingsJapgolly.awsSdk.awsSdkStrings.LoadForecast
  - typingsJapgolly.awsSdk.awsSdkStrings.ScheduledActionMinCapacity
  - typingsJapgolly.awsSdk.awsSdkStrings.ScheduledActionMaxCapacity
  - java.lang.String
*/
type ForecastDataType = _ForecastDataType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGTotalCPUUtilization
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGTotalNetworkIn
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGTotalNetworkOut
  - typingsJapgolly.awsSdk.awsSdkStrings.ALBTargetGroupRequestCount
  - java.lang.String
*/
type LoadMetricType = _LoadMetricType | String

type MaxResults = Double

type MetricDimensionName = String

type MetricDimensionValue = String

type MetricDimensions = js.Array[MetricDimension]

type MetricName = String

type MetricNamespace = String

type MetricScale = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Average_
  - typingsJapgolly.awsSdk.awsSdkStrings.Minimum_
  - typingsJapgolly.awsSdk.awsSdkStrings.Maximum_
  - typingsJapgolly.awsSdk.awsSdkStrings.SampleCount
  - typingsJapgolly.awsSdk.awsSdkStrings.Sum_
  - java.lang.String
*/
type MetricStatistic = _MetricStatistic | String

type MetricUnit = String

type NextToken = String

type PolicyName = String

type PolicyType = TargetTrackingScaling | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SetForecastCapacityToMaxCapacity
  - typingsJapgolly.awsSdk.awsSdkStrings.SetMaxCapacityToForecastCapacity
  - typingsJapgolly.awsSdk.awsSdkStrings.SetMaxCapacityAboveForecastCapacity
  - java.lang.String
*/
type PredictiveScalingMaxCapacityBehavior = _PredictiveScalingMaxCapacityBehavior | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ForecastAndScale
  - typingsJapgolly.awsSdk.awsSdkStrings.ForecastOnly
  - java.lang.String
*/
type PredictiveScalingMode = _PredictiveScalingMode | String

type ResourceCapacity = Double

type ResourceIdMaxLen1600 = String

type ResourceLabel = String

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
type ScalableDimension = _ScalableDimension | String

type ScalingInstructions = js.Array[ScalingInstruction]

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
type ScalingMetricType = _ScalingMetricType | String

type ScalingPlanName = String

type ScalingPlanNames = js.Array[ScalingPlanName]

type ScalingPlanResources = js.Array[ScalingPlanResource]

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
type ScalingPlanStatusCode = _ScalingPlanStatusCode | String

type ScalingPlanVersion = Double

type ScalingPlans = js.Array[ScalingPlan]

type ScalingPolicies = js.Array[ScalingPolicy]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.KeepExternalPolicies
  - typingsJapgolly.awsSdk.awsSdkStrings.ReplaceExternalPolicies
  - java.lang.String
*/
type ScalingPolicyUpdateBehavior = _ScalingPolicyUpdateBehavior | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
  - typingsJapgolly.awsSdk.awsSdkStrings.PartiallyActive
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - java.lang.String
*/
type ScalingStatusCode = _ScalingStatusCode | String

type ScheduledActionBufferTime = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.autoscaling_
  - typingsJapgolly.awsSdk.awsSdkStrings.ecs_
  - typingsJapgolly.awsSdk.awsSdkStrings.ec2_
  - typingsJapgolly.awsSdk.awsSdkStrings.rds_
  - typingsJapgolly.awsSdk.awsSdkStrings.dynamodb
  - java.lang.String
*/
type ServiceNamespace = _ServiceNamespace | String

type TagFilters = js.Array[TagFilter]

type TagValues = js.Array[XmlStringMaxLen256]

type TargetTrackingConfigurations = js.Array[TargetTrackingConfiguration]

type TimestampType = js.Date

type XmlString = String

type XmlStringMaxLen128 = String

type XmlStringMaxLen256 = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-01-06`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
