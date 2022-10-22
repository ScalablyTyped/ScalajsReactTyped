package typingsJapgolly.awsSdk.clientsApplicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ChangeInCapacity
  - typingsJapgolly.awsSdk.awsSdkStrings.PercentChangeInCapacity
  - typingsJapgolly.awsSdk.awsSdkStrings.ExactCapacity
  - java.lang.String
*/
type AdjustmentType = _AdjustmentType | String

type Alarms = js.Array[Alarm]

type Cooldown = Double

type DisableScaleIn = Boolean

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Average_
  - typingsJapgolly.awsSdk.awsSdkStrings.Minimum_
  - typingsJapgolly.awsSdk.awsSdkStrings.Maximum_
  - java.lang.String
*/
type MetricAggregationType = _MetricAggregationType | String

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
  - typingsJapgolly.awsSdk.awsSdkStrings.CassandraReadCapacityUtilization
  - typingsJapgolly.awsSdk.awsSdkStrings.CassandraWriteCapacityUtilization
  - typingsJapgolly.awsSdk.awsSdkStrings.KafkaBrokerStorageUtilization
  - typingsJapgolly.awsSdk.awsSdkStrings.ElastiCachePrimaryEngineCPUUtilization
  - typingsJapgolly.awsSdk.awsSdkStrings.ElastiCacheReplicaEngineCPUUtilization
  - typingsJapgolly.awsSdk.awsSdkStrings.ElastiCacheDatabaseMemoryUsageCountedForEvictPercentage
  - typingsJapgolly.awsSdk.awsSdkStrings.NeptuneReaderAverageCPUUtilization
  - java.lang.String
*/
type MetricType = _MetricType | String

type MetricUnit = String

type MinAdjustmentMagnitude = Double

type PolicyName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.StepScaling
  - typingsJapgolly.awsSdk.awsSdkStrings.TargetTrackingScaling
  - java.lang.String
*/
type PolicyType = _PolicyType | String

type ResourceCapacity = Double

type ResourceId = String

type ResourceIdMaxLen1600 = String

type ResourceIdsMaxLen1600 = js.Array[ResourceIdMaxLen1600]

type ResourceLabel = String

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
  - / * comprehend:document-classifier-endpoint:DesiredInferenceUnits * / java.lang.String
  - typingsJapgolly.awsSdk.awsSdkStrings.`comprehendColonentity-recognizer-endpointColonDesiredInferenceUnits`
  - typingsJapgolly.awsSdk.awsSdkStrings.lambdaColonfunctionColonProvisionedConcurrency
  - typingsJapgolly.awsSdk.awsSdkStrings.cassandraColontableColonReadCapacityUnits
  - typingsJapgolly.awsSdk.awsSdkStrings.cassandraColontableColonWriteCapacityUnits
  - typingsJapgolly.awsSdk.awsSdkStrings.`kafkaColonbroker-storageColonVolumeSize`
  - typingsJapgolly.awsSdk.awsSdkStrings.`elasticacheColonreplication-groupColonNodeGroups`
  - typingsJapgolly.awsSdk.awsSdkStrings.`elasticacheColonreplication-groupColonReplicas`
  - typingsJapgolly.awsSdk.awsSdkStrings.neptuneColonclusterColonReadReplicaCount
*/
type ScalableDimension = _ScalableDimension | (/* comprehend:document-classifier-endpoint:DesiredInferenceUnits */ String)

type ScalableTargets = js.Array[ScalableTarget]

type ScalingActivities = js.Array[ScalingActivity]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Successful_
  - typingsJapgolly.awsSdk.awsSdkStrings.Overridden_
  - typingsJapgolly.awsSdk.awsSdkStrings.Unfulfilled
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type ScalingActivityStatusCode = _ScalingActivityStatusCode | String

type ScalingAdjustment = Double

type ScalingPolicies = js.Array[ScalingPolicy]

type ScalingSuspended = Boolean

type ScheduledActionName = String

type ScheduledActions = js.Array[ScheduledAction]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ecs_
  - typingsJapgolly.awsSdk.awsSdkStrings.elasticmapreduce
  - typingsJapgolly.awsSdk.awsSdkStrings.ec2_
  - typingsJapgolly.awsSdk.awsSdkStrings.appstream_
  - typingsJapgolly.awsSdk.awsSdkStrings.dynamodb
  - typingsJapgolly.awsSdk.awsSdkStrings.rds_
  - typingsJapgolly.awsSdk.awsSdkStrings.sagemaker__
  - typingsJapgolly.awsSdk.awsSdkStrings.`custom-resource`
  - typingsJapgolly.awsSdk.awsSdkStrings.comprehend
  - typingsJapgolly.awsSdk.awsSdkStrings.lambda__
  - typingsJapgolly.awsSdk.awsSdkStrings.cassandra
  - typingsJapgolly.awsSdk.awsSdkStrings.kafka_
  - typingsJapgolly.awsSdk.awsSdkStrings.elasticache
  - typingsJapgolly.awsSdk.awsSdkStrings.neptune
  - java.lang.String
*/
type ServiceNamespace = _ServiceNamespace | String

type StepAdjustments = js.Array[StepAdjustment]

type TimestampType = js.Date

type XmlString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-02-06`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
