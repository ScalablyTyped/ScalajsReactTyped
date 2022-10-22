package typingsJapgolly.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.APPMESH
import typingsJapgolly.awsSdk.awsSdkStrings.CONTAINER_RUNTIME
import typingsJapgolly.awsSdk.awsSdkStrings.ExecuteCommandAgent
import typingsJapgolly.awsSdk.awsSdkStrings.GPU
import typingsJapgolly.awsSdk.awsSdkStrings.PERCENT
import typingsJapgolly.awsSdk.awsSdkStrings.TAGS
import typingsJapgolly.awsSdk.awsSdkStrings.`container-instance`
import typingsJapgolly.awsSdk.awsSdkStrings.containerInsights
import typingsJapgolly.awsSdk.awsSdkStrings.memberOf
import typingsJapgolly.awsSdk.awsSdkStrings.s3_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.STAGING
  - typingsJapgolly.awsSdk.awsSdkStrings.STAGED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AgentUpdateStatus = _AgentUpdateStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AssignPublicIp = _AssignPublicIp | java.lang.String

type AttachmentDetails = js.Array[KeyValuePair]

type AttachmentStateChanges = js.Array[AttachmentStateChange]

type Attachments = js.Array[Attachment]

type Attributes = js.Array[Attribute]

type Boolean = scala.Boolean

type BoxedBoolean = scala.Boolean

type BoxedInteger = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.X86_64
  - typingsJapgolly.awsSdk.awsSdkStrings.ARM64
  - java.lang.String
*/
type CPUArchitecture = _CPUArchitecture | java.lang.String

type CapacityProviderField = TAGS | java.lang.String

type CapacityProviderFieldList = js.Array[CapacityProviderField]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type CapacityProviderStatus = _CapacityProviderStatus | java.lang.String

type CapacityProviderStrategy = js.Array[CapacityProviderStrategyItem]

type CapacityProviderStrategyItemBase = scala.Double

type CapacityProviderStrategyItemWeight = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type CapacityProviderUpdateStatus = _CapacityProviderUpdateStatus | java.lang.String

type CapacityProviders = js.Array[CapacityProvider]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ATTACHMENTS
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURATIONS
  - typingsJapgolly.awsSdk.awsSdkStrings.SETTINGS
  - typingsJapgolly.awsSdk.awsSdkStrings.STATISTICS
  - typingsJapgolly.awsSdk.awsSdkStrings.TAGS
  - java.lang.String
*/
type ClusterField = _ClusterField | java.lang.String

type ClusterFieldList = js.Array[ClusterField]

type ClusterSettingName = containerInsights | java.lang.String

type ClusterSettings = js.Array[ClusterSetting]

type Clusters = js.Array[Cluster]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2
  - typingsJapgolly.awsSdk.awsSdkStrings.FARGATE
  - typingsJapgolly.awsSdk.awsSdkStrings.EXTERNAL
  - java.lang.String
*/
type Compatibility = _Compatibility | java.lang.String

type CompatibilityList = js.Array[Compatibility]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISCONNECTED
  - java.lang.String
*/
type Connectivity = _Connectivity | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.START
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
  - java.lang.String
*/
type ContainerCondition = _ContainerCondition | java.lang.String

type ContainerDefinitions = js.Array[ContainerDefinition]

type ContainerDependencies = js.Array[ContainerDependency]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TAGS
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINER_INSTANCE_HEALTH
  - java.lang.String
*/
type ContainerInstanceField = _ContainerInstanceField | java.lang.String

type ContainerInstanceFieldList = js.Array[ContainerInstanceField]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DRAINING
  - typingsJapgolly.awsSdk.awsSdkStrings.REGISTERING
  - typingsJapgolly.awsSdk.awsSdkStrings.DEREGISTERING
  - typingsJapgolly.awsSdk.awsSdkStrings.REGISTRATION_FAILED
  - java.lang.String
*/
type ContainerInstanceStatus = _ContainerInstanceStatus | java.lang.String

type ContainerInstances = js.Array[ContainerInstance]

type ContainerOverrides = js.Array[ContainerOverride]

type ContainerStateChanges = js.Array[ContainerStateChange]

type Containers = js.Array[Container]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ECS
  - typingsJapgolly.awsSdk.awsSdkStrings.CODE_DEPLOY
  - typingsJapgolly.awsSdk.awsSdkStrings.EXTERNAL
  - java.lang.String
*/
type DeploymentControllerType = _DeploymentControllerType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - java.lang.String
*/
type DeploymentRolloutState = _DeploymentRolloutState | java.lang.String

type Deployments = js.Array[Deployment]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type DesiredStatus = _DesiredStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.read_
  - typingsJapgolly.awsSdk.awsSdkStrings.write_
  - typingsJapgolly.awsSdk.awsSdkStrings.mknod_
  - java.lang.String
*/
type DeviceCgroupPermission = _DeviceCgroupPermission | java.lang.String

type DeviceCgroupPermissions = js.Array[DeviceCgroupPermission]

type DevicesList = js.Array[Device]

type DockerLabelsMap = StringDictionary[String]

type Double = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type EFSAuthorizationConfigIAM = _EFSAuthorizationConfigIAM | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type EFSTransitEncryption = _EFSTransitEncryption | java.lang.String

type EnvironmentFileType = s3_ | java.lang.String

type EnvironmentFiles = js.Array[EnvironmentFile]

type EnvironmentVariables = js.Array[KeyValuePair]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.OVERRIDE
  - java.lang.String
*/
type ExecuteCommandLogging = _ExecuteCommandLogging | java.lang.String

type Failures = js.Array[Failure]

type FirelensConfigurationOptionsMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.fluentd
  - typingsJapgolly.awsSdk.awsSdkStrings.fluentbit
  - java.lang.String
*/
type FirelensConfigurationType = _FirelensConfigurationType | java.lang.String

type GpuIds = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
  - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type HealthStatus = _HealthStatus | java.lang.String

type HostEntryList = js.Array[HostEntry]

type InferenceAcceleratorOverrides = js.Array[InferenceAcceleratorOverride]

type InferenceAccelerators = js.Array[InferenceAccelerator]

type InstanceHealthCheckResultList = js.Array[InstanceHealthCheckResult]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OK
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPAIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
  - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZING
  - java.lang.String
*/
type InstanceHealthCheckState = _InstanceHealthCheckState | java.lang.String

type InstanceHealthCheckType = CONTAINER_RUNTIME | java.lang.String

type Integer = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.host__
  - typingsJapgolly.awsSdk.awsSdkStrings.task__
  - typingsJapgolly.awsSdk.awsSdkStrings.none__
  - java.lang.String
*/
type IpcMode = _IpcMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2
  - typingsJapgolly.awsSdk.awsSdkStrings.FARGATE
  - typingsJapgolly.awsSdk.awsSdkStrings.EXTERNAL
  - java.lang.String
*/
type LaunchType = _LaunchType | java.lang.String

type LoadBalancers = js.Array[LoadBalancer]

type LogConfigurationOptionsMap = StringDictionary[String]

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
type LogDriver = _LogDriver | java.lang.String

type Long = scala.Double

type ManagedAgentName = ExecuteCommandAgent | java.lang.String

type ManagedAgentStateChanges = js.Array[ManagedAgentStateChange]

type ManagedAgents = js.Array[ManagedAgent]

type ManagedScalingInstanceWarmupPeriod = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ManagedScalingStatus = _ManagedScalingStatus | java.lang.String

type ManagedScalingStepSize = scala.Double

type ManagedScalingTargetCapacity = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ManagedTerminationProtection = _ManagedTerminationProtection | java.lang.String

type MountPointList = js.Array[MountPoint]

type NetworkBindings = js.Array[NetworkBinding]

type NetworkInterfaces = js.Array[NetworkInterface]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.bridge
  - typingsJapgolly.awsSdk.awsSdkStrings.host__
  - typingsJapgolly.awsSdk.awsSdkStrings.awsvpc_
  - typingsJapgolly.awsSdk.awsSdkStrings.none__
  - java.lang.String
*/
type NetworkMode = _NetworkMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_SERVER_2019_FULL
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_SERVER_2019_CORE
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_SERVER_2016_FULL
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_SERVER_2004_CORE
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_SERVER_2022_CORE
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_SERVER_2022_FULL
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_SERVER_20H2_CORE
  - typingsJapgolly.awsSdk.awsSdkStrings.LINUX
  - java.lang.String
*/
type OSFamily = _OSFamily | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.host__
  - typingsJapgolly.awsSdk.awsSdkStrings.task__
  - java.lang.String
*/
type PidMode = _PidMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.distinctInstance
  - typingsJapgolly.awsSdk.awsSdkStrings.memberOf
  - java.lang.String
*/
type PlacementConstraintType = _PlacementConstraintType | java.lang.String

type PlacementConstraints = js.Array[PlacementConstraint]

type PlacementStrategies = js.Array[PlacementStrategy]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.random__
  - typingsJapgolly.awsSdk.awsSdkStrings.spread_
  - typingsJapgolly.awsSdk.awsSdkStrings.binpack
  - java.lang.String
*/
type PlacementStrategyType = _PlacementStrategyType | java.lang.String

type PlatformDeviceType = GPU | java.lang.String

type PlatformDevices = js.Array[PlatformDevice]

type PortMappingList = js.Array[PortMapping]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TASK_DEFINITION
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type PropagateTags = _PropagateTags | java.lang.String

type ProxyConfigurationProperties = js.Array[KeyValuePair]

type ProxyConfigurationType = APPMESH | java.lang.String

type RequiresAttributes = js.Array[Attribute]

type ResourceRequirements = js.Array[ResourceRequirement]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GPU
  - typingsJapgolly.awsSdk.awsSdkStrings.InferenceAccelerator
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

type Resources = js.Array[Resource]

type ScaleUnit = PERCENT | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLICA
  - typingsJapgolly.awsSdk.awsSdkStrings.DAEMON
  - java.lang.String
*/
type SchedulingStrategy = _SchedulingStrategy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.task__
  - typingsJapgolly.awsSdk.awsSdkStrings.shared__
  - java.lang.String
*/
type Scope = _Scope | java.lang.String

type SecretList = js.Array[Secret]

type SensitiveString = java.lang.String

type ServiceEvents = js.Array[ServiceEvent]

type ServiceField = TAGS | java.lang.String

type ServiceFieldList = js.Array[ServiceField]

type ServiceRegistries = js.Array[ServiceRegistry]

type Services = js.Array[Service]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.serviceLongArnFormat
  - typingsJapgolly.awsSdk.awsSdkStrings.taskLongArnFormat
  - typingsJapgolly.awsSdk.awsSdkStrings.containerInstanceLongArnFormat
  - typingsJapgolly.awsSdk.awsSdkStrings.awsvpcTrunking
  - typingsJapgolly.awsSdk.awsSdkStrings.containerInsights
  - java.lang.String
*/
type SettingName = _SettingName | java.lang.String

type Settings = js.Array[Setting]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASC
  - typingsJapgolly.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STEADY_STATE
  - typingsJapgolly.awsSdk.awsSdkStrings.STABILIZING
  - java.lang.String
*/
type StabilityStatus = _StabilityStatus | java.lang.String

type Statistics = js.Array[KeyValuePair]

type String = java.lang.String

type StringList = js.Array[String]

type StringMap = StringDictionary[String]

type SystemControls = js.Array[SystemControl]

type TagKey = java.lang.String

type TagKeys = js.Array[TagKey]

type TagValue = java.lang.String

type Tags = js.Array[Tag]

type TargetType = `container-instance` | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type TaskDefinitionFamilyStatus = _TaskDefinitionFamilyStatus | java.lang.String

type TaskDefinitionField = TAGS | java.lang.String

type TaskDefinitionFieldList = js.Array[TaskDefinitionField]

type TaskDefinitionPlacementConstraintType = memberOf | java.lang.String

type TaskDefinitionPlacementConstraints = js.Array[TaskDefinitionPlacementConstraint]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type TaskDefinitionStatus = _TaskDefinitionStatus | java.lang.String

type TaskField = TAGS | java.lang.String

type TaskFieldList = js.Array[TaskField]

type TaskSetField = TAGS | java.lang.String

type TaskSetFieldList = js.Array[TaskSetField]

type TaskSets = js.Array[TaskSet]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TaskFailedToStart
  - typingsJapgolly.awsSdk.awsSdkStrings.EssentialContainerExited
  - typingsJapgolly.awsSdk.awsSdkStrings.UserInitiated
  - java.lang.String
*/
type TaskStopCode = _TaskStopCode | java.lang.String

type Tasks = js.Array[Task]

type Timestamp = js.Date

type TmpfsList = js.Array[Tmpfs]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.tcp_
  - typingsJapgolly.awsSdk.awsSdkStrings.udp_
  - java.lang.String
*/
type TransportProtocol = _TransportProtocol | java.lang.String

type UlimitList = js.Array[Ulimit]

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
type UlimitName = _UlimitName | java.lang.String

type VolumeFromList = js.Array[VolumeFrom]

type VolumeList = js.Array[Volume]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2014-11-13`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
