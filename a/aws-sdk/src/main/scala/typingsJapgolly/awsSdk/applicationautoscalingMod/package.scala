package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object applicationautoscalingMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ChangeInCapacity
    - typingsJapgolly.awsSdk.awsSdkStrings.PercentChangeInCapacity
    - typingsJapgolly.awsSdk.awsSdkStrings.ExactCapacity
    - java.lang.String
  */
  type AdjustmentType = typingsJapgolly.awsSdk.applicationautoscalingMod._AdjustmentType | java.lang.String
  type Alarms = js.Array[typingsJapgolly.awsSdk.applicationautoscalingMod.Alarm]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.applicationautoscalingMod.ClientApiVersions
  type Cooldown = scala.Double
  type DisableScaleIn = scala.Boolean
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Average_
    - typingsJapgolly.awsSdk.awsSdkStrings.Minimum_
    - typingsJapgolly.awsSdk.awsSdkStrings.Maximum_
    - java.lang.String
  */
  type MetricAggregationType = typingsJapgolly.awsSdk.applicationautoscalingMod._MetricAggregationType | java.lang.String
  type MetricDimensionName = java.lang.String
  type MetricDimensionValue = java.lang.String
  type MetricDimensions = js.Array[typingsJapgolly.awsSdk.applicationautoscalingMod.MetricDimension]
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
  type MetricStatistic = typingsJapgolly.awsSdk.applicationautoscalingMod._MetricStatistic | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DynamoDBReadCapacityUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.DynamoDBWriteCapacityUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.ALBRequestCountPerTarget
    - typingsJapgolly.awsSdk.awsSdkStrings.RDSReaderAverageCPUUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.RDSReaderAverageDatabaseConnections
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageCPUUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageNetworkIn
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageNetworkOut
    - typingsJapgolly.awsSdk.awsSdkStrings.SageMakerVariantInvocationsPerInstance
    - typingsJapgolly.awsSdk.awsSdkStrings.ECSServiceAverageCPUUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.ECSServiceAverageMemoryUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.AppStreamAverageCapacityUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.ComprehendInferenceUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.LambdaProvisionedConcurrencyUtilization
    - java.lang.String
  */
  type MetricType = typingsJapgolly.awsSdk.applicationautoscalingMod._MetricType | java.lang.String
  type MetricUnit = java.lang.String
  type MinAdjustmentMagnitude = scala.Double
  type PolicyName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.StepScaling
    - typingsJapgolly.awsSdk.awsSdkStrings.TargetTrackingScaling
    - java.lang.String
  */
  type PolicyType = typingsJapgolly.awsSdk.applicationautoscalingMod._PolicyType | java.lang.String
  type ResourceCapacity = scala.Double
  type ResourceId = java.lang.String
  type ResourceIdMaxLen1600 = java.lang.String
  type ResourceIdsMaxLen1600 = js.Array[typingsJapgolly.awsSdk.applicationautoscalingMod.ResourceIdMaxLen1600]
  type ResourceLabel = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ecsColonserviceColonDesiredCount
    - typingsJapgolly.awsSdk.awsSdkStrings.`ec2Colonspot-fleet-requestColonTargetCapacity`
    - typingsJapgolly.awsSdk.awsSdkStrings.elasticmapreduceColoninstancegroupColonInstanceCount
    - typingsJapgolly.awsSdk.awsSdkStrings.appstreamColonfleetColonDesiredCapacity
    - typingsJapgolly.awsSdk.awsSdkStrings.dynamodbColontableColonReadCapacityUnits
    - typingsJapgolly.awsSdk.awsSdkStrings.dynamodbColontableColonWriteCapacityUnits
    - typingsJapgolly.awsSdk.awsSdkStrings.dynamodbColonindexColonReadCapacityUnits
    - typingsJapgolly.awsSdk.awsSdkStrings.dynamodbColonindexColonWriteCapacityUnits
    - typingsJapgolly.awsSdk.awsSdkStrings.rdsColonclusterColonReadReplicaCount
    - typingsJapgolly.awsSdk.awsSdkStrings.sagemakerColonvariantColonDesiredInstanceCount
    - typingsJapgolly.awsSdk.awsSdkStrings.`custom-resourceColonResourceTypeColonProperty`
    - typingsJapgolly.awsSdk.awsSdkStrings.`comprehendColondocument-classifier-endpointColonDesiredInferenceUnits`
    - typingsJapgolly.awsSdk.awsSdkStrings.lambdaColonfunctionColonProvisionedConcurrency
    - java.lang.String
  */
  type ScalableDimension = typingsJapgolly.awsSdk.applicationautoscalingMod._ScalableDimension | java.lang.String
  type ScalableTargets = js.Array[typingsJapgolly.awsSdk.applicationautoscalingMod.ScalableTarget]
  type ScalingActivities = js.Array[typingsJapgolly.awsSdk.applicationautoscalingMod.ScalingActivity]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Successful_
    - typingsJapgolly.awsSdk.awsSdkStrings.Overridden_
    - typingsJapgolly.awsSdk.awsSdkStrings.Unfulfilled
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type ScalingActivityStatusCode = typingsJapgolly.awsSdk.applicationautoscalingMod._ScalingActivityStatusCode | java.lang.String
  type ScalingAdjustment = scala.Double
  type ScalingPolicies = js.Array[typingsJapgolly.awsSdk.applicationautoscalingMod.ScalingPolicy]
  type ScalingSuspended = scala.Boolean
  type ScheduledActionName = java.lang.String
  type ScheduledActions = js.Array[typingsJapgolly.awsSdk.applicationautoscalingMod.ScheduledAction]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ecs_
    - typingsJapgolly.awsSdk.awsSdkStrings.elasticmapreduce
    - typingsJapgolly.awsSdk.awsSdkStrings.ec2_
    - typingsJapgolly.awsSdk.awsSdkStrings.appstream
    - typingsJapgolly.awsSdk.awsSdkStrings.dynamodb
    - typingsJapgolly.awsSdk.awsSdkStrings.rds_
    - typingsJapgolly.awsSdk.awsSdkStrings.sagemaker_
    - typingsJapgolly.awsSdk.awsSdkStrings.`custom-resource`
    - typingsJapgolly.awsSdk.awsSdkStrings.comprehend
    - typingsJapgolly.awsSdk.awsSdkStrings.lambda__
    - java.lang.String
  */
  type ServiceNamespace = typingsJapgolly.awsSdk.applicationautoscalingMod._ServiceNamespace | java.lang.String
  type StepAdjustments = js.Array[typingsJapgolly.awsSdk.applicationautoscalingMod.StepAdjustment]
  type TimestampType = js.Date
  type XmlString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-02-06`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.applicationautoscalingMod._apiVersion | java.lang.String
}
