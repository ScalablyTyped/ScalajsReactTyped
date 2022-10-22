package typingsJapgolly.awsSdk.clientsAutoscalingMod

import typingsJapgolly.awsSdk.awsSdkStrings.PendingDelete
import typingsJapgolly.awsSdk.awsSdkStrings.Rolling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.nvidia_
  - typingsJapgolly.awsSdk.awsSdkStrings.amd
  - typingsJapgolly.awsSdk.awsSdkStrings.`amazon-web-services`
  - typingsJapgolly.awsSdk.awsSdkStrings.xilinx
  - java.lang.String
*/
type AcceleratorManufacturer = _AcceleratorManufacturer | String

type AcceleratorManufacturers = js.Array[AcceleratorManufacturer]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.a100
  - typingsJapgolly.awsSdk.awsSdkStrings.v100
  - typingsJapgolly.awsSdk.awsSdkStrings.k80
  - typingsJapgolly.awsSdk.awsSdkStrings.t4
  - typingsJapgolly.awsSdk.awsSdkStrings.m60
  - typingsJapgolly.awsSdk.awsSdkStrings.`radeon-pro-v520`
  - typingsJapgolly.awsSdk.awsSdkStrings.vu9p
  - java.lang.String
*/
type AcceleratorName = _AcceleratorName | String

type AcceleratorNames = js.Array[AcceleratorName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.gpu_
  - typingsJapgolly.awsSdk.awsSdkStrings.fpga
  - typingsJapgolly.awsSdk.awsSdkStrings.inference
  - java.lang.String
*/
type AcceleratorType = _AcceleratorType | String

type AcceleratorTypes = js.Array[AcceleratorType]

type Activities = js.Array[Activity]

type ActivityIds = js.Array[XmlString]

type AdjustmentTypes = js.Array[AdjustmentType]

type Alarms = js.Array[Alarm]

type AsciiStringMaxLen255 = String

type AssociatePublicIpAddress = Boolean

type AutoScalingGroupDesiredCapacity = Double

type AutoScalingGroupMaxSize = Double

type AutoScalingGroupMinSize = Double

type AutoScalingGroupNames = js.Array[XmlStringMaxLen255]

type AutoScalingGroupPredictedCapacity = Double

type AutoScalingGroupState = String

type AutoScalingGroups = js.Array[AutoScalingGroup]

type AutoScalingInstances = js.Array[AutoScalingInstanceDetails]

type AutoScalingNotificationTypes = js.Array[XmlStringMaxLen255]

type AvailabilityZones = js.Array[XmlStringMaxLen255]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.included
  - typingsJapgolly.awsSdk.awsSdkStrings.excluded
  - typingsJapgolly.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type BareMetal = _BareMetal | String

type BlockDeviceEbsDeleteOnTermination = Boolean

type BlockDeviceEbsEncrypted = Boolean

type BlockDeviceEbsIops = Double

type BlockDeviceEbsThroughput = Double

type BlockDeviceEbsVolumeSize = Double

type BlockDeviceEbsVolumeType = String

type BlockDeviceMappings = js.Array[BlockDeviceMapping]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.included
  - typingsJapgolly.awsSdk.awsSdkStrings.excluded
  - typingsJapgolly.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type BurstablePerformance = _BurstablePerformance | String

type CapacityRebalanceEnabled = Boolean

type CheckpointDelay = Double

type CheckpointPercentages = js.Array[NonZeroIntPercent]

type ClassicLinkVPCSecurityGroups = js.Array[XmlStringMaxLen255]

type Context = String

type Cooldown = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.intel
  - typingsJapgolly.awsSdk.awsSdkStrings.amd
  - typingsJapgolly.awsSdk.awsSdkStrings.`amazon-web-services`
  - java.lang.String
*/
type CpuManufacturer = _CpuManufacturer | String

type CpuManufacturers = js.Array[CpuManufacturer]

type DefaultInstanceWarmup = Double

type DisableScaleIn = Boolean

type EbsOptimized = Boolean

type EnabledMetrics = js.Array[EnabledMetric]

type EstimatedInstanceWarmup = Double

type ExcludedInstance = String

type ExcludedInstanceTypes = js.Array[ExcludedInstance]

type FailedScheduledUpdateGroupActionRequests = js.Array[FailedScheduledUpdateGroupActionRequest]

type Filters = js.Array[Filter]

type ForceDelete = Boolean

type GlobalTimeout = Double

type HealthCheckGracePeriod = Double

type HeartbeatTimeout = Double

type HonorCooldown = Boolean

type IncludeDeletedGroups = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.current__
  - typingsJapgolly.awsSdk.awsSdkStrings.previous_
  - java.lang.String
*/
type InstanceGeneration = _InstanceGeneration | String

type InstanceGenerations = js.Array[InstanceGeneration]

type InstanceIds = js.Array[XmlStringMaxLen19]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.disabled__
  - typingsJapgolly.awsSdk.awsSdkStrings.enabled__
  - java.lang.String
*/
type InstanceMetadataEndpointState = _InstanceMetadataEndpointState | String

type InstanceMetadataHttpPutResponseHopLimit = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.optional__
  - typingsJapgolly.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type InstanceMetadataHttpTokensState = _InstanceMetadataHttpTokensState | String

type InstanceProtected = Boolean

type InstanceRefreshIds = js.Array[XmlStringMaxLen255]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Successful_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelling_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - java.lang.String
*/
type InstanceRefreshStatus = _InstanceRefreshStatus | String

type InstanceRefreshes = js.Array[InstanceRefresh]

type Instances = js.Array[Instance]

type InstancesToUpdate = Double

type IntPercent = Double

type LaunchConfigurationNames = js.Array[XmlStringMaxLen255]

type LaunchConfigurations = js.Array[LaunchConfiguration]

type LaunchTemplateName = String

type LifecycleActionResult = String

type LifecycleActionToken = String

type LifecycleHookNames = js.Array[AsciiStringMaxLen255]

type LifecycleHookSpecifications = js.Array[LifecycleHookSpecification]

type LifecycleHooks = js.Array[LifecycleHook]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingColonWait
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingColonProceed
  - typingsJapgolly.awsSdk.awsSdkStrings.Quarantined
  - typingsJapgolly.awsSdk.awsSdkStrings.InService
  - typingsJapgolly.awsSdk.awsSdkStrings.Terminating_
  - typingsJapgolly.awsSdk.awsSdkStrings.TerminatingColonWait
  - typingsJapgolly.awsSdk.awsSdkStrings.TerminatingColonProceed
  - typingsJapgolly.awsSdk.awsSdkStrings.Terminated_
  - typingsJapgolly.awsSdk.awsSdkStrings.Detaching_
  - typingsJapgolly.awsSdk.awsSdkStrings.Detached_
  - typingsJapgolly.awsSdk.awsSdkStrings.EnteringStandby
  - typingsJapgolly.awsSdk.awsSdkStrings.Standby_
  - typingsJapgolly.awsSdk.awsSdkStrings.WarmedColonPending
  - typingsJapgolly.awsSdk.awsSdkStrings.WarmedColonPendingColonWait
  - typingsJapgolly.awsSdk.awsSdkStrings.WarmedColonPendingColonProceed
  - typingsJapgolly.awsSdk.awsSdkStrings.WarmedColonTerminating
  - typingsJapgolly.awsSdk.awsSdkStrings.WarmedColonTerminatingColonWait
  - typingsJapgolly.awsSdk.awsSdkStrings.WarmedColonTerminatingColonProceed
  - typingsJapgolly.awsSdk.awsSdkStrings.WarmedColonTerminated
  - typingsJapgolly.awsSdk.awsSdkStrings.WarmedColonStopped
  - typingsJapgolly.awsSdk.awsSdkStrings.WarmedColonRunning
  - typingsJapgolly.awsSdk.awsSdkStrings.WarmedColonHibernated
  - java.lang.String
*/
type LifecycleState = _LifecycleState | String

type LifecycleTransition = String

type LoadBalancerNames = js.Array[XmlStringMaxLen255]

type LoadBalancerStates = js.Array[LoadBalancerState]

type LoadBalancerTargetGroupStates = js.Array[LoadBalancerTargetGroupState]

type LoadForecasts = js.Array[LoadForecast]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.included
  - typingsJapgolly.awsSdk.awsSdkStrings.excluded
  - typingsJapgolly.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type LocalStorage = _LocalStorage | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.hdd_
  - typingsJapgolly.awsSdk.awsSdkStrings.ssd_
  - java.lang.String
*/
type LocalStorageType = _LocalStorageType | String

type LocalStorageTypes = js.Array[LocalStorageType]

type MaxGroupPreparedCapacity = Double

type MaxInstanceLifetime = Double

type MaxNumberOfAutoScalingGroups = Double

type MaxNumberOfLaunchConfigurations = Double

type MaxRecords = Double

type MetricCollectionTypes = js.Array[MetricCollectionType]

type MetricDataQueries = js.Array[MetricDataQuery]

type MetricDimensionName = String

type MetricDimensionValue = String

type MetricDimensions = js.Array[MetricDimension]

type MetricGranularityTypes = js.Array[MetricGranularityType]

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
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGAverageCPUUtilization
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGAverageNetworkIn
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGAverageNetworkOut
  - typingsJapgolly.awsSdk.awsSdkStrings.ALBRequestCountPerTarget
  - java.lang.String
*/
type MetricType = _MetricType | String

type MetricUnit = String

type Metrics = js.Array[XmlStringMaxLen255]

type MinAdjustmentMagnitude = Double

type MinAdjustmentStep = Double

type MixedInstanceSpotPrice = String

type MonitoringEnabled = Boolean

type NoDevice = Boolean

type NonZeroIntPercent = Double

type NotificationConfigurations = js.Array[NotificationConfiguration]

type NotificationTargetResourceName = String

type NullableBoolean = Boolean

type NullablePositiveDouble = Double

type NullablePositiveInteger = Double

type NumberOfAutoScalingGroups = Double

type NumberOfLaunchConfigurations = Double

type OnDemandBaseCapacity = Double

type OnDemandPercentageAboveBaseCapacity = Double

type Overrides = js.Array[LaunchTemplateOverrides]

type PolicyIncrement = Double

type PolicyNames = js.Array[ResourceName]

type PolicyTypes = js.Array[XmlStringMaxLen64]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGTotalCPUUtilization
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGTotalNetworkIn
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGTotalNetworkOut
  - typingsJapgolly.awsSdk.awsSdkStrings.ALBTargetGroupRequestCount
  - java.lang.String
*/
type PredefinedLoadMetricType = _PredefinedLoadMetricType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGCPUUtilization
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGNetworkIn
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGNetworkOut
  - typingsJapgolly.awsSdk.awsSdkStrings.ALBRequestCount
  - java.lang.String
*/
type PredefinedMetricPairType = _PredefinedMetricPairType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGAverageCPUUtilization
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGAverageNetworkIn
  - typingsJapgolly.awsSdk.awsSdkStrings.ASGAverageNetworkOut
  - typingsJapgolly.awsSdk.awsSdkStrings.ALBRequestCountPerTarget
  - java.lang.String
*/
type PredefinedScalingMetricType = _PredefinedScalingMetricType | String

type PredictiveScalingForecastTimestamps = js.Array[js.Date]

type PredictiveScalingForecastValues = js.Array[MetricScale]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HonorMaxCapacity
  - typingsJapgolly.awsSdk.awsSdkStrings.IncreaseMaxCapacity
  - java.lang.String
*/
type PredictiveScalingMaxCapacityBreachBehavior = _PredictiveScalingMaxCapacityBreachBehavior | String

type PredictiveScalingMaxCapacityBuffer = Double

type PredictiveScalingMetricSpecifications = js.Array[PredictiveScalingMetricSpecification]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ForecastAndScale
  - typingsJapgolly.awsSdk.awsSdkStrings.ForecastOnly
  - java.lang.String
*/
type PredictiveScalingMode = _PredictiveScalingMode | String

type PredictiveScalingSchedulingBufferTime = Double

type ProcessNames = js.Array[XmlStringMaxLen255]

type Processes = js.Array[ProcessType]

type Progress = Double

type PropagateAtLaunch = Boolean

type ProtectedFromScaleIn = Boolean

type RefreshInstanceWarmup = Double

type RefreshStrategy = Rolling | String

type ResourceName = String

type ReturnData = Boolean

type ReuseOnScaleIn = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingSpotBidPlacement
  - typingsJapgolly.awsSdk.awsSdkStrings.WaitingForSpotInstanceRequestId
  - typingsJapgolly.awsSdk.awsSdkStrings.WaitingForSpotInstanceId
  - typingsJapgolly.awsSdk.awsSdkStrings.WaitingForInstanceId
  - typingsJapgolly.awsSdk.awsSdkStrings.PreInService
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.WaitingForELBConnectionDraining
  - typingsJapgolly.awsSdk.awsSdkStrings.MidLifecycleAction
  - typingsJapgolly.awsSdk.awsSdkStrings.WaitingForInstanceWarmup
  - typingsJapgolly.awsSdk.awsSdkStrings.Successful_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - java.lang.String
*/
type ScalingActivityStatusCode = _ScalingActivityStatusCode | String

type ScalingPolicies = js.Array[ScalingPolicy]

type ScalingPolicyEnabled = Boolean

type ScheduledActionNames = js.Array[XmlStringMaxLen255]

type ScheduledUpdateGroupActionRequests = js.Array[ScheduledUpdateGroupActionRequest]

type ScheduledUpdateGroupActions = js.Array[ScheduledUpdateGroupAction]

type SecurityGroups = js.Array[XmlString]

type ShouldDecrementDesiredCapacity = Boolean

type ShouldRespectGracePeriod = Boolean

type SkipMatching = Boolean

type SpotInstancePools = Double

type SpotPrice = String

type StepAdjustments = js.Array[StepAdjustment]

type SuspendedProcesses = js.Array[SuspendedProcess]

type TagDescriptionList = js.Array[TagDescription]

type TagKey = String

type TagValue = String

type Tags = js.Array[Tag]

type TargetGroupARNs = js.Array[XmlStringMaxLen511]

type TerminationPolicies = js.Array[XmlStringMaxLen1600]

type TimestampType = js.Date

type Values = js.Array[XmlString]

type WarmPoolMinSize = Double

type WarmPoolSize = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Running_
  - typingsJapgolly.awsSdk.awsSdkStrings.Hibernated
  - java.lang.String
*/
type WarmPoolState = _WarmPoolState | String

type WarmPoolStatus = PendingDelete | String

type XmlString = String

type XmlStringMaxLen1023 = String

type XmlStringMaxLen1600 = String

type XmlStringMaxLen19 = String

type XmlStringMaxLen2047 = String

type XmlStringMaxLen255 = String

type XmlStringMaxLen32 = String

type XmlStringMaxLen511 = String

type XmlStringMaxLen64 = String

type XmlStringMetricLabel = String

type XmlStringMetricStat = String

type XmlStringUserData = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2011-01-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
