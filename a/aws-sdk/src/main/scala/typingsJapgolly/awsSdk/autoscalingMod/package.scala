package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object autoscalingMod {
  type Activities = js.Array[typingsJapgolly.awsSdk.autoscalingMod.Activity]
  type ActivityIds = js.Array[typingsJapgolly.awsSdk.autoscalingMod.XmlString]
  type AdjustmentTypes = js.Array[typingsJapgolly.awsSdk.autoscalingMod.AdjustmentType]
  type Alarms = js.Array[typingsJapgolly.awsSdk.autoscalingMod.Alarm]
  type AsciiStringMaxLen255 = java.lang.String
  type AssociatePublicIpAddress = scala.Boolean
  type AutoScalingGroupDesiredCapacity = scala.Double
  type AutoScalingGroupMaxSize = scala.Double
  type AutoScalingGroupMinSize = scala.Double
  type AutoScalingGroupNames = js.Array[typingsJapgolly.awsSdk.autoscalingMod.ResourceName]
  type AutoScalingGroups = js.Array[typingsJapgolly.awsSdk.autoscalingMod.AutoScalingGroup]
  type AutoScalingInstances = js.Array[typingsJapgolly.awsSdk.autoscalingMod.AutoScalingInstanceDetails]
  type AutoScalingNotificationTypes = js.Array[typingsJapgolly.awsSdk.autoscalingMod.XmlStringMaxLen255]
  type AvailabilityZones = js.Array[typingsJapgolly.awsSdk.autoscalingMod.XmlStringMaxLen255]
  type BlockDeviceEbsDeleteOnTermination = scala.Boolean
  type BlockDeviceEbsEncrypted = scala.Boolean
  type BlockDeviceEbsIops = scala.Double
  type BlockDeviceEbsVolumeSize = scala.Double
  type BlockDeviceEbsVolumeType = java.lang.String
  type BlockDeviceMappings = js.Array[typingsJapgolly.awsSdk.autoscalingMod.BlockDeviceMapping]
  type ClassicLinkVPCSecurityGroups = js.Array[typingsJapgolly.awsSdk.autoscalingMod.XmlStringMaxLen255]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.autoscalingMod.ClientApiVersions
  type Cooldown = scala.Double
  type DisableScaleIn = scala.Boolean
  type EbsOptimized = scala.Boolean
  type EnabledMetrics = js.Array[typingsJapgolly.awsSdk.autoscalingMod.EnabledMetric]
  type EstimatedInstanceWarmup = scala.Double
  type FailedScheduledUpdateGroupActionRequests = js.Array[typingsJapgolly.awsSdk.autoscalingMod.FailedScheduledUpdateGroupActionRequest]
  type Filters = js.Array[typingsJapgolly.awsSdk.autoscalingMod.Filter]
  type ForceDelete = scala.Boolean
  type GlobalTimeout = scala.Double
  type HealthCheckGracePeriod = scala.Double
  type HeartbeatTimeout = scala.Double
  type HonorCooldown = scala.Boolean
  type InstanceIds = js.Array[typingsJapgolly.awsSdk.autoscalingMod.XmlStringMaxLen19]
  type InstanceProtected = scala.Boolean
  type Instances = js.Array[typingsJapgolly.awsSdk.autoscalingMod.Instance]
  type LaunchConfigurationNames = js.Array[typingsJapgolly.awsSdk.autoscalingMod.ResourceName]
  type LaunchConfigurations = js.Array[typingsJapgolly.awsSdk.autoscalingMod.LaunchConfiguration]
  type LaunchTemplateName = java.lang.String
  type LifecycleActionResult = java.lang.String
  type LifecycleActionToken = java.lang.String
  type LifecycleHookNames = js.Array[typingsJapgolly.awsSdk.autoscalingMod.AsciiStringMaxLen255]
  type LifecycleHookSpecifications = js.Array[typingsJapgolly.awsSdk.autoscalingMod.LifecycleHookSpecification]
  type LifecycleHooks = js.Array[typingsJapgolly.awsSdk.autoscalingMod.LifecycleHook]
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
    - java.lang.String
  */
  type LifecycleState = typingsJapgolly.awsSdk.autoscalingMod._LifecycleState | java.lang.String
  type LifecycleTransition = java.lang.String
  type LoadBalancerNames = js.Array[typingsJapgolly.awsSdk.autoscalingMod.XmlStringMaxLen255]
  type LoadBalancerStates = js.Array[typingsJapgolly.awsSdk.autoscalingMod.LoadBalancerState]
  type LoadBalancerTargetGroupStates = js.Array[typingsJapgolly.awsSdk.autoscalingMod.LoadBalancerTargetGroupState]
  type MaxInstanceLifetime = scala.Double
  type MaxNumberOfAutoScalingGroups = scala.Double
  type MaxNumberOfLaunchConfigurations = scala.Double
  type MaxRecords = scala.Double
  type MetricCollectionTypes = js.Array[typingsJapgolly.awsSdk.autoscalingMod.MetricCollectionType]
  type MetricDimensionName = java.lang.String
  type MetricDimensionValue = java.lang.String
  type MetricDimensions = js.Array[typingsJapgolly.awsSdk.autoscalingMod.MetricDimension]
  type MetricGranularityTypes = js.Array[typingsJapgolly.awsSdk.autoscalingMod.MetricGranularityType]
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
  type MetricStatistic = typingsJapgolly.awsSdk.autoscalingMod._MetricStatistic | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASGAverageCPUUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.ASGAverageNetworkIn
    - typingsJapgolly.awsSdk.awsSdkStrings.ASGAverageNetworkOut
    - typingsJapgolly.awsSdk.awsSdkStrings.ALBRequestCountPerTarget
    - java.lang.String
  */
  type MetricType = typingsJapgolly.awsSdk.autoscalingMod._MetricType | java.lang.String
  type MetricUnit = java.lang.String
  type Metrics = js.Array[typingsJapgolly.awsSdk.autoscalingMod.XmlStringMaxLen255]
  type MinAdjustmentMagnitude = scala.Double
  type MinAdjustmentStep = scala.Double
  type MixedInstanceSpotPrice = java.lang.String
  type MonitoringEnabled = scala.Boolean
  type NoDevice = scala.Boolean
  type NotificationConfigurations = js.Array[typingsJapgolly.awsSdk.autoscalingMod.NotificationConfiguration]
  type NotificationTargetResourceName = java.lang.String
  type NumberOfAutoScalingGroups = scala.Double
  type NumberOfLaunchConfigurations = scala.Double
  type OnDemandBaseCapacity = scala.Double
  type OnDemandPercentageAboveBaseCapacity = scala.Double
  type Overrides = js.Array[typingsJapgolly.awsSdk.autoscalingMod.LaunchTemplateOverrides]
  type PolicyIncrement = scala.Double
  type PolicyNames = js.Array[typingsJapgolly.awsSdk.autoscalingMod.ResourceName]
  type PolicyTypes = js.Array[typingsJapgolly.awsSdk.autoscalingMod.XmlStringMaxLen64]
  type ProcessNames = js.Array[typingsJapgolly.awsSdk.autoscalingMod.XmlStringMaxLen255]
  type Processes = js.Array[typingsJapgolly.awsSdk.autoscalingMod.ProcessType]
  type Progress = scala.Double
  type PropagateAtLaunch = scala.Boolean
  type ProtectedFromScaleIn = scala.Boolean
  type ResourceName = java.lang.String
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
  type ScalingActivityStatusCode = typingsJapgolly.awsSdk.autoscalingMod._ScalingActivityStatusCode | java.lang.String
  type ScalingPolicies = js.Array[typingsJapgolly.awsSdk.autoscalingMod.ScalingPolicy]
  type ScheduledActionNames = js.Array[typingsJapgolly.awsSdk.autoscalingMod.ResourceName]
  type ScheduledUpdateGroupActionRequests = js.Array[typingsJapgolly.awsSdk.autoscalingMod.ScheduledUpdateGroupActionRequest]
  type ScheduledUpdateGroupActions = js.Array[typingsJapgolly.awsSdk.autoscalingMod.ScheduledUpdateGroupAction]
  type SecurityGroups = js.Array[typingsJapgolly.awsSdk.autoscalingMod.XmlString]
  type ShouldDecrementDesiredCapacity = scala.Boolean
  type ShouldRespectGracePeriod = scala.Boolean
  type SpotInstancePools = scala.Double
  type SpotPrice = java.lang.String
  type StepAdjustments = js.Array[typingsJapgolly.awsSdk.autoscalingMod.StepAdjustment]
  type SuspendedProcesses = js.Array[typingsJapgolly.awsSdk.autoscalingMod.SuspendedProcess]
  type TagDescriptionList = js.Array[typingsJapgolly.awsSdk.autoscalingMod.TagDescription]
  type TagKey = java.lang.String
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.autoscalingMod.Tag]
  type TargetGroupARNs = js.Array[typingsJapgolly.awsSdk.autoscalingMod.XmlStringMaxLen511]
  type TerminationPolicies = js.Array[typingsJapgolly.awsSdk.autoscalingMod.XmlStringMaxLen1600]
  type TimestampType = js.Date
  type Values = js.Array[typingsJapgolly.awsSdk.autoscalingMod.XmlString]
  type XmlString = java.lang.String
  type XmlStringMaxLen1023 = java.lang.String
  type XmlStringMaxLen1600 = java.lang.String
  type XmlStringMaxLen19 = java.lang.String
  type XmlStringMaxLen2047 = java.lang.String
  type XmlStringMaxLen255 = java.lang.String
  type XmlStringMaxLen32 = java.lang.String
  type XmlStringMaxLen511 = java.lang.String
  type XmlStringMaxLen64 = java.lang.String
  type XmlStringUserData = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2011-01-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.autoscalingMod._apiVersion | java.lang.String
}
