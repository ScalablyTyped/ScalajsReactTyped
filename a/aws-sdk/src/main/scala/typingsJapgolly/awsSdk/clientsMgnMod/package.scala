package typingsJapgolly.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.STRING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LEGACY_BIOS
  - typingsJapgolly.awsSdk.awsSdkStrings.UEFI
  - java.lang.String
*/
type BootMode = _BootMode | String

type BoundedString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_TEST
  - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_CUTOVER
  - typingsJapgolly.awsSdk.awsSdkStrings.CUTOVER
  - java.lang.String
*/
type ChangeServerLifeCycleStateSourceServerLifecycleState = _ChangeServerLifeCycleStateSourceServerLifecycleState | String

type CloudWatchLogGroupName = String

type Cpus = js.Array[CPU]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENT_NOT_SEEN
  - typingsJapgolly.awsSdk.awsSdkStrings.SNAPSHOTS_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CONVERGING
  - typingsJapgolly.awsSdk.awsSdkStrings.UNSTABLE_NETWORK
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_CREATE_SECURITY_GROUP
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_LAUNCH_REPLICATION_SERVER
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_BOOT_REPLICATION_SERVER
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_AUTHENTICATE_WITH_SERVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_CREATE_STAGING_DISKS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_ATTACH_STAGING_DISKS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_PAIR_REPLICATION_SERVER_WITH_AGENT
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_CONNECT_AGENT_TO_REPLICATION_SERVER
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_START_DATA_TRANSFER
  - typingsJapgolly.awsSdk.awsSdkStrings.UNSUPPORTED_VM_CONFIGURATION
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_SNAPSHOT_JOB_FAILED
  - java.lang.String
*/
type DataReplicationErrorString = _DataReplicationErrorString | String

type DataReplicationInfoReplicatedDisks = js.Array[DataReplicationInfoReplicatedDisk]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WAIT
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_SECURITY_GROUP
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_REPLICATION_SERVER
  - typingsJapgolly.awsSdk.awsSdkStrings.BOOT_REPLICATION_SERVER
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTHENTICATE_WITH_SERVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.DOWNLOAD_REPLICATION_SOFTWARE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_STAGING_DISKS
  - typingsJapgolly.awsSdk.awsSdkStrings.ATTACH_STAGING_DISKS
  - typingsJapgolly.awsSdk.awsSdkStrings.PAIR_REPLICATION_SERVER_WITH_AGENT
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECT_AGENT_TO_REPLICATION_SERVER
  - typingsJapgolly.awsSdk.awsSdkStrings.START_DATA_TRANSFER
  - java.lang.String
*/
type DataReplicationInitiationStepName = _DataReplicationInitiationStepName | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SKIPPED
  - java.lang.String
*/
type DataReplicationInitiationStepStatus = _DataReplicationInitiationStepStatus | String

type DataReplicationInitiationSteps = js.Array[DataReplicationInitiationStep]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.INITIATING
  - typingsJapgolly.awsSdk.awsSdkStrings.INITIAL_SYNC
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKLOG
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING_SNAPSHOT
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTINUOUS
  - typingsJapgolly.awsSdk.awsSdkStrings.PAUSED
  - typingsJapgolly.awsSdk.awsSdkStrings.RESCAN
  - typingsJapgolly.awsSdk.awsSdkStrings.STALLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISCONNECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_SNAPSHOT_SHIPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.SHIPPING_SNAPSHOT
  - java.lang.String
*/
type DataReplicationState = _DataReplicationState | String

type DescribeJobsRequestFiltersJobIDs = js.Array[JobID]

type DescribeSourceServersRequestFiltersIDs = js.Array[SourceServerID]

type Disks = js.Array[Disk]

type EC2InstanceID = String

type EC2InstanceType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WAITING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type FirstBoot = _FirstBoot | String

type IPsList = js.Array[BoundedString]

type ISO8601DatetimeString = String

type ISO8601DurationString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.START_TEST
  - typingsJapgolly.awsSdk.awsSdkStrings.START_CUTOVER
  - typingsJapgolly.awsSdk.awsSdkStrings.DIAGNOSTIC
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE
  - java.lang.String
*/
type InitiatedBy = _InitiatedBy | String

type JobID = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JOB_START
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_SKIPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.CLEANUP_START
  - typingsJapgolly.awsSdk.awsSdkStrings.CLEANUP_END
  - typingsJapgolly.awsSdk.awsSdkStrings.CLEANUP_FAIL
  - typingsJapgolly.awsSdk.awsSdkStrings.SNAPSHOT_START
  - typingsJapgolly.awsSdk.awsSdkStrings.SNAPSHOT_END
  - typingsJapgolly.awsSdk.awsSdkStrings.SNAPSHOT_FAIL
  - typingsJapgolly.awsSdk.awsSdkStrings.USING_PREVIOUS_SNAPSHOT
  - typingsJapgolly.awsSdk.awsSdkStrings.CONVERSION_START
  - typingsJapgolly.awsSdk.awsSdkStrings.CONVERSION_END
  - typingsJapgolly.awsSdk.awsSdkStrings.CONVERSION_FAIL
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_START
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.JOB_CANCEL
  - typingsJapgolly.awsSdk.awsSdkStrings.JOB_END
  - java.lang.String
*/
type JobLogEvent = _JobLogEvent | String

type JobLogs = js.Array[JobLog]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type JobStatus = _JobStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE
  - java.lang.String
*/
type JobType = _JobType | String

type JobsList = js.Array[Job]

type LargeBoundedString = String

type LaunchConfigurationTemplateID = String

type LaunchConfigurationTemplateIDs = js.Array[LaunchConfigurationTemplateID]

type LaunchConfigurationTemplates = js.Array[LaunchConfigurationTemplate]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTED
  - java.lang.String
*/
type LaunchDisposition = _LaunchDisposition | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCHED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
  - java.lang.String
*/
type LaunchStatus = _LaunchStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_READY
  - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_TEST
  - typingsJapgolly.awsSdk.awsSdkStrings.TESTING
  - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_CUTOVER
  - typingsJapgolly.awsSdk.awsSdkStrings.CUTTING_OVER
  - typingsJapgolly.awsSdk.awsSdkStrings.CUTOVER
  - typingsJapgolly.awsSdk.awsSdkStrings.DISCONNECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISCOVERED
  - java.lang.String
*/
type LifeCycleState = _LifeCycleState | String

type LifeCycleStates = js.Array[LifeCycleState]

type NetworkInterfaces = js.Array[NetworkInterface]

type PaginationToken = String

type ParticipatingServers = js.Array[ParticipatingServer]

type PositiveInteger = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type PostLaunchActionExecutionStatus = _PostLaunchActionExecutionStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TEST_AND_CUTOVER
  - typingsJapgolly.awsSdk.awsSdkStrings.CUTOVER_ONLY
  - java.lang.String
*/
type PostLaunchActionsDeploymentType = _PostLaunchActionsDeploymentType | String

type PostLaunchActionsLaunchStatusList = js.Array[JobPostLaunchActionsLaunchStatus]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE_IP
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC_IP
  - java.lang.String
*/
type ReplicationConfigurationDataPlaneRouting = _ReplicationConfigurationDataPlaneRouting | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GP2
  - typingsJapgolly.awsSdk.awsSdkStrings.ST1
  - typingsJapgolly.awsSdk.awsSdkStrings.GP3
  - java.lang.String
*/
type ReplicationConfigurationDefaultLargeStagingDiskType = _ReplicationConfigurationDefaultLargeStagingDiskType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type ReplicationConfigurationEbsEncryption = _ReplicationConfigurationEbsEncryption | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTO
  - typingsJapgolly.awsSdk.awsSdkStrings.GP2
  - typingsJapgolly.awsSdk.awsSdkStrings.IO1
  - typingsJapgolly.awsSdk.awsSdkStrings.SC1
  - typingsJapgolly.awsSdk.awsSdkStrings.ST1
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - typingsJapgolly.awsSdk.awsSdkStrings.GP3
  - typingsJapgolly.awsSdk.awsSdkStrings.IO2
  - java.lang.String
*/
type ReplicationConfigurationReplicatedDiskStagingDiskType = _ReplicationConfigurationReplicatedDiskStagingDiskType | String

type ReplicationConfigurationReplicatedDisks = js.Array[ReplicationConfigurationReplicatedDisk]

type ReplicationConfigurationTemplateID = String

type ReplicationConfigurationTemplateIDs = js.Array[ReplicationConfigurationTemplateID]

type ReplicationConfigurationTemplates = js.Array[ReplicationConfigurationTemplate]

type ReplicationServersSecurityGroupsIDs = js.Array[SecurityGroupID]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENT_BASED
  - typingsJapgolly.awsSdk.awsSdkStrings.SNAPSHOT_SHIPPING
  - java.lang.String
*/
type ReplicationType = _ReplicationType | String

type ReplicationTypes = js.Array[ReplicationType]

type S3LogBucketName = String

type SecurityGroupID = String

type SmallBoundedString = String

type SourceServerID = String

type SourceServersList = js.Array[SourceServer]

type SsmDocumentName = String

type SsmDocumentParameterName = String

type SsmDocumentParameters = StringDictionary[SsmParameterStoreParameters]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATION
  - typingsJapgolly.awsSdk.awsSdkStrings.COMMAND
  - java.lang.String
*/
type SsmDocumentType = _SsmDocumentType | String

type SsmDocuments = js.Array[SsmDocument]

type SsmParameterStoreParameterName = String

type SsmParameterStoreParameterType = STRING | String

type SsmParameterStoreParameters = js.Array[SsmParameterStoreParameter]

type StartCutoverRequestSourceServerIDs = js.Array[SourceServerID]

type StartTestRequestSourceServerIDs = js.Array[SourceServerID]

type StrictlyPositiveInteger = Double

type SubnetID = String

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type TagsMap = StringDictionary[TagValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.BASIC
  - java.lang.String
*/
type TargetInstanceTypeRightSizingMethod = _TargetInstanceTypeRightSizingMethod | String

type TerminateTargetInstancesRequestSourceServerIDs = js.Array[SourceServerID]

type VcenterClientID = String

type VcenterClientList = js.Array[VcenterClient]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-02-26`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
