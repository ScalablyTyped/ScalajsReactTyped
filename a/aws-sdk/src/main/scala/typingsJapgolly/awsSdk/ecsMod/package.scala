package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ecsMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.STAGING
    - typingsJapgolly.awsSdk.awsSdkStrings.STAGED
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AgentUpdateStatus = typingsJapgolly.awsSdk.ecsMod._AgentUpdateStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AssignPublicIp = typingsJapgolly.awsSdk.ecsMod._AssignPublicIp | java.lang.String
  type AttachmentDetails = js.Array[typingsJapgolly.awsSdk.ecsMod.KeyValuePair]
  type AttachmentStateChanges = js.Array[typingsJapgolly.awsSdk.ecsMod.AttachmentStateChange]
  type Attachments = js.Array[typingsJapgolly.awsSdk.ecsMod.Attachment]
  type Attributes = js.Array[typingsJapgolly.awsSdk.ecsMod.Attribute]
  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type BoxedInteger = scala.Double
  type CapacityProviderField = typingsJapgolly.awsSdk.awsSdkStrings.TAGS | java.lang.String
  type CapacityProviderFieldList = js.Array[typingsJapgolly.awsSdk.ecsMod.CapacityProviderField]
  type CapacityProviderStatus = typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE | java.lang.String
  type CapacityProviderStrategy = js.Array[typingsJapgolly.awsSdk.ecsMod.CapacityProviderStrategyItem]
  type CapacityProviderStrategyItemBase = scala.Double
  type CapacityProviderStrategyItemWeight = scala.Double
  type CapacityProviders = js.Array[typingsJapgolly.awsSdk.ecsMod.CapacityProvider]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.ecsMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ATTACHMENTS
    - typingsJapgolly.awsSdk.awsSdkStrings.SETTINGS
    - typingsJapgolly.awsSdk.awsSdkStrings.STATISTICS
    - typingsJapgolly.awsSdk.awsSdkStrings.TAGS
    - java.lang.String
  */
  type ClusterField = typingsJapgolly.awsSdk.ecsMod._ClusterField | java.lang.String
  type ClusterFieldList = js.Array[typingsJapgolly.awsSdk.ecsMod.ClusterField]
  type ClusterSettingName = typingsJapgolly.awsSdk.awsSdkStrings.containerInsights | java.lang.String
  type ClusterSettings = js.Array[typingsJapgolly.awsSdk.ecsMod.ClusterSetting]
  type Clusters = js.Array[typingsJapgolly.awsSdk.ecsMod.Cluster]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2
    - typingsJapgolly.awsSdk.awsSdkStrings.FARGATE
    - java.lang.String
  */
  type Compatibility = typingsJapgolly.awsSdk.ecsMod._Compatibility | java.lang.String
  type CompatibilityList = js.Array[typingsJapgolly.awsSdk.ecsMod.Compatibility]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISCONNECTED
    - java.lang.String
  */
  type Connectivity = typingsJapgolly.awsSdk.ecsMod._Connectivity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.START
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
    - java.lang.String
  */
  type ContainerCondition = typingsJapgolly.awsSdk.ecsMod._ContainerCondition | java.lang.String
  type ContainerDefinitions = js.Array[typingsJapgolly.awsSdk.ecsMod.ContainerDefinition]
  type ContainerDependencies = js.Array[typingsJapgolly.awsSdk.ecsMod.ContainerDependency]
  type ContainerInstanceField = typingsJapgolly.awsSdk.awsSdkStrings.TAGS | java.lang.String
  type ContainerInstanceFieldList = js.Array[typingsJapgolly.awsSdk.ecsMod.ContainerInstanceField]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DRAINING
    - typingsJapgolly.awsSdk.awsSdkStrings.REGISTERING
    - typingsJapgolly.awsSdk.awsSdkStrings.DEREGISTERING
    - typingsJapgolly.awsSdk.awsSdkStrings.REGISTRATION_FAILED
    - java.lang.String
  */
  type ContainerInstanceStatus = typingsJapgolly.awsSdk.ecsMod._ContainerInstanceStatus | java.lang.String
  type ContainerInstances = js.Array[typingsJapgolly.awsSdk.ecsMod.ContainerInstance]
  type ContainerOverrides = js.Array[typingsJapgolly.awsSdk.ecsMod.ContainerOverride]
  type ContainerStateChanges = js.Array[typingsJapgolly.awsSdk.ecsMod.ContainerStateChange]
  type Containers = js.Array[typingsJapgolly.awsSdk.ecsMod.Container]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ECS
    - typingsJapgolly.awsSdk.awsSdkStrings.CODE_DEPLOY
    - typingsJapgolly.awsSdk.awsSdkStrings.EXTERNAL
    - java.lang.String
  */
  type DeploymentControllerType = typingsJapgolly.awsSdk.ecsMod._DeploymentControllerType | java.lang.String
  type Deployments = js.Array[typingsJapgolly.awsSdk.ecsMod.Deployment]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type DesiredStatus = typingsJapgolly.awsSdk.ecsMod._DesiredStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.read_
    - typingsJapgolly.awsSdk.awsSdkStrings.write_
    - typingsJapgolly.awsSdk.awsSdkStrings.mknod_
    - java.lang.String
  */
  type DeviceCgroupPermission = typingsJapgolly.awsSdk.ecsMod._DeviceCgroupPermission | java.lang.String
  type DeviceCgroupPermissions = js.Array[typingsJapgolly.awsSdk.ecsMod.DeviceCgroupPermission]
  type DevicesList = js.Array[typingsJapgolly.awsSdk.ecsMod.Device]
  type DockerLabelsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ecsMod.String]
  type Double = scala.Double
  type EnvironmentVariables = js.Array[typingsJapgolly.awsSdk.ecsMod.KeyValuePair]
  type Failures = js.Array[typingsJapgolly.awsSdk.ecsMod.Failure]
  type FirelensConfigurationOptionsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ecsMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.fluentd
    - typingsJapgolly.awsSdk.awsSdkStrings.fluentbit
    - java.lang.String
  */
  type FirelensConfigurationType = typingsJapgolly.awsSdk.ecsMod._FirelensConfigurationType | java.lang.String
  type GpuIds = js.Array[typingsJapgolly.awsSdk.ecsMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type HealthStatus = typingsJapgolly.awsSdk.ecsMod._HealthStatus | java.lang.String
  type HostEntryList = js.Array[typingsJapgolly.awsSdk.ecsMod.HostEntry]
  type InferenceAcceleratorOverrides = js.Array[typingsJapgolly.awsSdk.ecsMod.InferenceAcceleratorOverride]
  type InferenceAccelerators = js.Array[typingsJapgolly.awsSdk.ecsMod.InferenceAccelerator]
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.host_
    - typingsJapgolly.awsSdk.awsSdkStrings.task_
    - typingsJapgolly.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type IpcMode = typingsJapgolly.awsSdk.ecsMod._IpcMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2
    - typingsJapgolly.awsSdk.awsSdkStrings.FARGATE
    - java.lang.String
  */
  type LaunchType = typingsJapgolly.awsSdk.ecsMod._LaunchType | java.lang.String
  type LoadBalancers = js.Array[typingsJapgolly.awsSdk.ecsMod.LoadBalancer]
  type LogConfigurationOptionsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ecsMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`json-file`
    - typingsJapgolly.awsSdk.awsSdkStrings.syslog
    - typingsJapgolly.awsSdk.awsSdkStrings.journald
    - typingsJapgolly.awsSdk.awsSdkStrings.gelf
    - typingsJapgolly.awsSdk.awsSdkStrings.fluentd
    - typingsJapgolly.awsSdk.awsSdkStrings.awslogs
    - typingsJapgolly.awsSdk.awsSdkStrings.splunk
    - typingsJapgolly.awsSdk.awsSdkStrings.awsfirelens
    - java.lang.String
  */
  type LogDriver = typingsJapgolly.awsSdk.ecsMod._LogDriver | java.lang.String
  type Long = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ManagedScalingStatus = typingsJapgolly.awsSdk.ecsMod._ManagedScalingStatus | java.lang.String
  type ManagedScalingStepSize = scala.Double
  type ManagedScalingTargetCapacity = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ManagedTerminationProtection = typingsJapgolly.awsSdk.ecsMod._ManagedTerminationProtection | java.lang.String
  type MountPointList = js.Array[typingsJapgolly.awsSdk.ecsMod.MountPoint]
  type NetworkBindings = js.Array[typingsJapgolly.awsSdk.ecsMod.NetworkBinding]
  type NetworkInterfaces = js.Array[typingsJapgolly.awsSdk.ecsMod.NetworkInterface]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.bridge
    - typingsJapgolly.awsSdk.awsSdkStrings.host_
    - typingsJapgolly.awsSdk.awsSdkStrings.awsvpc_
    - typingsJapgolly.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type NetworkMode = typingsJapgolly.awsSdk.ecsMod._NetworkMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.host_
    - typingsJapgolly.awsSdk.awsSdkStrings.task_
    - java.lang.String
  */
  type PidMode = typingsJapgolly.awsSdk.ecsMod._PidMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.distinctInstance
    - typingsJapgolly.awsSdk.awsSdkStrings.memberOf
    - java.lang.String
  */
  type PlacementConstraintType = typingsJapgolly.awsSdk.ecsMod._PlacementConstraintType | java.lang.String
  type PlacementConstraints = js.Array[typingsJapgolly.awsSdk.ecsMod.PlacementConstraint]
  type PlacementStrategies = js.Array[typingsJapgolly.awsSdk.ecsMod.PlacementStrategy]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.random_
    - typingsJapgolly.awsSdk.awsSdkStrings.spread
    - typingsJapgolly.awsSdk.awsSdkStrings.binpack
    - java.lang.String
  */
  type PlacementStrategyType = typingsJapgolly.awsSdk.ecsMod._PlacementStrategyType | java.lang.String
  type PlatformDeviceType = typingsJapgolly.awsSdk.awsSdkStrings.GPU | java.lang.String
  type PlatformDevices = js.Array[typingsJapgolly.awsSdk.ecsMod.PlatformDevice]
  type PortMappingList = js.Array[typingsJapgolly.awsSdk.ecsMod.PortMapping]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TASK_DEFINITION
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE
    - java.lang.String
  */
  type PropagateTags = typingsJapgolly.awsSdk.ecsMod._PropagateTags | java.lang.String
  type ProxyConfigurationProperties = js.Array[typingsJapgolly.awsSdk.ecsMod.KeyValuePair]
  type ProxyConfigurationType = typingsJapgolly.awsSdk.awsSdkStrings.APPMESH | java.lang.String
  type RequiresAttributes = js.Array[typingsJapgolly.awsSdk.ecsMod.Attribute]
  type ResourceRequirements = js.Array[typingsJapgolly.awsSdk.ecsMod.ResourceRequirement]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GPU
    - typingsJapgolly.awsSdk.awsSdkStrings.InferenceAccelerator
    - java.lang.String
  */
  type ResourceType = typingsJapgolly.awsSdk.ecsMod._ResourceType | java.lang.String
  type Resources = js.Array[typingsJapgolly.awsSdk.ecsMod.Resource]
  type ScaleUnit = typingsJapgolly.awsSdk.awsSdkStrings.PERCENT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.REPLICA
    - typingsJapgolly.awsSdk.awsSdkStrings.DAEMON
    - java.lang.String
  */
  type SchedulingStrategy = typingsJapgolly.awsSdk.ecsMod._SchedulingStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.task_
    - typingsJapgolly.awsSdk.awsSdkStrings.shared__
    - java.lang.String
  */
  type Scope = typingsJapgolly.awsSdk.ecsMod._Scope | java.lang.String
  type SecretList = js.Array[typingsJapgolly.awsSdk.ecsMod.Secret]
  type ServiceEvents = js.Array[typingsJapgolly.awsSdk.ecsMod.ServiceEvent]
  type ServiceField = typingsJapgolly.awsSdk.awsSdkStrings.TAGS | java.lang.String
  type ServiceFieldList = js.Array[typingsJapgolly.awsSdk.ecsMod.ServiceField]
  type ServiceRegistries = js.Array[typingsJapgolly.awsSdk.ecsMod.ServiceRegistry]
  type Services = js.Array[typingsJapgolly.awsSdk.ecsMod.Service]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.serviceLongArnFormat
    - typingsJapgolly.awsSdk.awsSdkStrings.taskLongArnFormat
    - typingsJapgolly.awsSdk.awsSdkStrings.containerInstanceLongArnFormat
    - typingsJapgolly.awsSdk.awsSdkStrings.awsvpcTrunking
    - typingsJapgolly.awsSdk.awsSdkStrings.containerInsights
    - java.lang.String
  */
  type SettingName = typingsJapgolly.awsSdk.ecsMod._SettingName | java.lang.String
  type Settings = js.Array[typingsJapgolly.awsSdk.ecsMod.Setting]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASC
    - typingsJapgolly.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type SortOrder = typingsJapgolly.awsSdk.ecsMod._SortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STEADY_STATE
    - typingsJapgolly.awsSdk.awsSdkStrings.STABILIZING
    - java.lang.String
  */
  type StabilityStatus = typingsJapgolly.awsSdk.ecsMod._StabilityStatus | java.lang.String
  type Statistics = js.Array[typingsJapgolly.awsSdk.ecsMod.KeyValuePair]
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.ecsMod.String]
  type StringMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ecsMod.String]
  type SystemControls = js.Array[typingsJapgolly.awsSdk.ecsMod.SystemControl]
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsJapgolly.awsSdk.ecsMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.ecsMod.Tag]
  type TargetType = typingsJapgolly.awsSdk.awsSdkStrings.`container-instance` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type TaskDefinitionFamilyStatus = typingsJapgolly.awsSdk.ecsMod._TaskDefinitionFamilyStatus | java.lang.String
  type TaskDefinitionField = typingsJapgolly.awsSdk.awsSdkStrings.TAGS | java.lang.String
  type TaskDefinitionFieldList = js.Array[typingsJapgolly.awsSdk.ecsMod.TaskDefinitionField]
  type TaskDefinitionPlacementConstraintType = typingsJapgolly.awsSdk.awsSdkStrings.memberOf | java.lang.String
  type TaskDefinitionPlacementConstraints = js.Array[typingsJapgolly.awsSdk.ecsMod.TaskDefinitionPlacementConstraint]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type TaskDefinitionStatus = typingsJapgolly.awsSdk.ecsMod._TaskDefinitionStatus | java.lang.String
  type TaskField = typingsJapgolly.awsSdk.awsSdkStrings.TAGS | java.lang.String
  type TaskFieldList = js.Array[typingsJapgolly.awsSdk.ecsMod.TaskField]
  type TaskSetField = typingsJapgolly.awsSdk.awsSdkStrings.TAGS | java.lang.String
  type TaskSetFieldList = js.Array[typingsJapgolly.awsSdk.ecsMod.TaskSetField]
  type TaskSets = js.Array[typingsJapgolly.awsSdk.ecsMod.TaskSet]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TaskFailedToStart
    - typingsJapgolly.awsSdk.awsSdkStrings.EssentialContainerExited
    - typingsJapgolly.awsSdk.awsSdkStrings.UserInitiated
    - java.lang.String
  */
  type TaskStopCode = typingsJapgolly.awsSdk.ecsMod._TaskStopCode | java.lang.String
  type Tasks = js.Array[typingsJapgolly.awsSdk.ecsMod.Task]
  type Timestamp = js.Date
  type TmpfsList = js.Array[typingsJapgolly.awsSdk.ecsMod.Tmpfs]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.tcp_
    - typingsJapgolly.awsSdk.awsSdkStrings.udp_
    - java.lang.String
  */
  type TransportProtocol = typingsJapgolly.awsSdk.ecsMod._TransportProtocol | java.lang.String
  type UlimitList = js.Array[typingsJapgolly.awsSdk.ecsMod.Ulimit]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.core__
    - typingsJapgolly.awsSdk.awsSdkStrings.cpu__
    - typingsJapgolly.awsSdk.awsSdkStrings.data_
    - typingsJapgolly.awsSdk.awsSdkStrings.fsize
    - typingsJapgolly.awsSdk.awsSdkStrings.locks
    - typingsJapgolly.awsSdk.awsSdkStrings.memlock
    - typingsJapgolly.awsSdk.awsSdkStrings.msgqueue
    - typingsJapgolly.awsSdk.awsSdkStrings.nice
    - typingsJapgolly.awsSdk.awsSdkStrings.nofile
    - typingsJapgolly.awsSdk.awsSdkStrings.nproc
    - typingsJapgolly.awsSdk.awsSdkStrings.rss
    - typingsJapgolly.awsSdk.awsSdkStrings.rtprio
    - typingsJapgolly.awsSdk.awsSdkStrings.rttime
    - typingsJapgolly.awsSdk.awsSdkStrings.sigpending
    - typingsJapgolly.awsSdk.awsSdkStrings.stack
    - java.lang.String
  */
  type UlimitName = typingsJapgolly.awsSdk.ecsMod._UlimitName | java.lang.String
  type VolumeFromList = js.Array[typingsJapgolly.awsSdk.ecsMod.VolumeFrom]
  type VolumeList = js.Array[typingsJapgolly.awsSdk.ecsMod.Volume]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-11-13`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.ecsMod._apiVersion | java.lang.String
}
