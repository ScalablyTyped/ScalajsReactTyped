package typingsJapgolly.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = String

type AccountID = String

type AccountIDs = js.Array[AccountID]

type Accounts = js.Array[Account]

type Boolean = scala.Boolean

type BoundedString = String

type ConversionMap = StringDictionary[ebsSnapshot]

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
  - java.lang.String
*/
type DataReplicationState = _DataReplicationState | String

type DescribeJobsRequestFiltersJobIDs = js.Array[JobID]

type DescribeRecoveryInstancesItems = js.Array[RecoveryInstance]

type DescribeSourceServersRequestFiltersIDs = js.Array[SourceServerID]

type Disks = js.Array[Disk]

type EC2InstanceID = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.`SHUTTING-DOWN`
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_FOUND
  - java.lang.String
*/
type EC2InstanceState = _EC2InstanceState | String

type EC2InstanceType = String

type EbsSnapshotsList = js.Array[ebsSnapshot]

type EbsVolumeID = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EXTENDED
  - typingsJapgolly.awsSdk.awsSdkStrings.EXTENSION_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EXTENDED
  - java.lang.String
*/
type ExtensionStatus = _ExtensionStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENT_NOT_SEEN
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILBACK_CLIENT_NOT_SEEN
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CONVERGING
  - typingsJapgolly.awsSdk.awsSdkStrings.UNSTABLE_NETWORK
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_CONFIGURE_REPLICATION_SOFTWARE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_PAIR_AGENT_WITH_REPLICATION_SOFTWARE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION
  - java.lang.String
*/
type FailbackReplicationError = _FailbackReplicationError | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILBACK_NOT_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILBACK_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILBACK_READY_FOR_LAUNCH
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILBACK_COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILBACK_ERROR
  - java.lang.String
*/
type FailbackState = _FailbackState | String

type IPsList = js.Array[BoundedString]

type ISO8601DatetimeString = String

type ISO8601DurationString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.START_RECOVERY
  - typingsJapgolly.awsSdk.awsSdkStrings.START_DRILL
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILBACK
  - typingsJapgolly.awsSdk.awsSdkStrings.DIAGNOSTIC
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE_RECOVERY_INSTANCES
  - typingsJapgolly.awsSdk.awsSdkStrings.TARGET_ACCOUNT
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
  - typingsJapgolly.awsSdk.awsSdkStrings.USING_PREVIOUS_SNAPSHOT_FAILED
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
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_CONVERTED_SNAPSHOT
  - java.lang.String
*/
type JobType = _JobType | String

type JobsList = js.Array[Job]

type LargeBoundedString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type LastLaunchResult = _LastLaunchResult | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RECOVERY
  - typingsJapgolly.awsSdk.awsSdkStrings.DRILL
  - java.lang.String
*/
type LastLaunchType = _LastLaunchType | String

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

type ListStagingAccountsRequestMaxResultsInteger = Double

type MaxResultsReplicatingSourceServers = Double

type NetworkInterfaces = js.Array[NetworkInterface]

type PITPolicy = js.Array[PITPolicyRule]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MINUTE
  - typingsJapgolly.awsSdk.awsSdkStrings.HOUR
  - typingsJapgolly.awsSdk.awsSdkStrings.DAY
  - java.lang.String
*/
type PITPolicyRuleUnits = _PITPolicyRuleUnits | String

type PaginationToken = String

type ParticipatingServers = js.Array[ParticipatingServer]

type PositiveInteger = Double

type RecoveryInstanceDataReplicationInfoReplicatedDisks = js.Array[RecoveryInstanceDataReplicationInfoReplicatedDisk]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LINK_FAILBACK_CLIENT_WITH_RECOVERY_INSTANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE_VOLUME_MAPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURE_REPLICATION_SOFTWARE
  - typingsJapgolly.awsSdk.awsSdkStrings.PAIR_AGENT_WITH_REPLICATION_SOFTWARE
  - typingsJapgolly.awsSdk.awsSdkStrings.ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION
  - java.lang.String
*/
type RecoveryInstanceDataReplicationInitiationStepName = _RecoveryInstanceDataReplicationInitiationStepName | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SKIPPED
  - java.lang.String
*/
type RecoveryInstanceDataReplicationInitiationStepStatus = _RecoveryInstanceDataReplicationInitiationStepStatus | String

type RecoveryInstanceDataReplicationInitiationSteps = js.Array[RecoveryInstanceDataReplicationInitiationStep]

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
  - java.lang.String
*/
type RecoveryInstanceDataReplicationState = _RecoveryInstanceDataReplicationState | String

type RecoveryInstanceDisks = js.Array[RecoveryInstanceDisk]

type RecoveryInstanceID = String

type RecoveryInstanceIDs = js.Array[RecoveryInstanceID]

type RecoveryInstancesForTerminationRequest = js.Array[RecoveryInstanceID]

type RecoverySnapshotID = String

type RecoverySnapshotsList = js.Array[RecoverySnapshot]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASC
  - typingsJapgolly.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type RecoverySnapshotsOrder = _RecoverySnapshotsOrder | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE_IP
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC_IP
  - java.lang.String
*/
type ReplicationConfigurationDataPlaneRouting = _ReplicationConfigurationDataPlaneRouting | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GP2
  - typingsJapgolly.awsSdk.awsSdkStrings.GP3
  - typingsJapgolly.awsSdk.awsSdkStrings.ST1
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTO
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
  - typingsJapgolly.awsSdk.awsSdkStrings.GP3
  - typingsJapgolly.awsSdk.awsSdkStrings.IO1
  - typingsJapgolly.awsSdk.awsSdkStrings.SC1
  - typingsJapgolly.awsSdk.awsSdkStrings.ST1
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - java.lang.String
*/
type ReplicationConfigurationReplicatedDiskStagingDiskType = _ReplicationConfigurationReplicatedDiskStagingDiskType | String

type ReplicationConfigurationReplicatedDisks = js.Array[ReplicationConfigurationReplicatedDisk]

type ReplicationConfigurationTemplateID = String

type ReplicationConfigurationTemplateIDs = js.Array[ReplicationConfigurationTemplateID]

type ReplicationConfigurationTemplates = js.Array[ReplicationConfigurationTemplate]

type ReplicationServersSecurityGroupsIDs = js.Array[SecurityGroupID]

type SecurityGroupID = String

type SmallBoundedString = String

type SourceServerARN = String

type SourceServerID = String

type SourceServerIDs = js.Array[SourceServerID]

type SourceServersList = js.Array[SourceServer]

type StagingSourceServersList = js.Array[StagingSourceServer]

type StartFailbackRequestRecoveryInstanceIDs = js.Array[RecoveryInstanceID]

type StartRecoveryRequestSourceServers = js.Array[StartRecoveryRequestSourceServer]

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

type VolumeToConversionMap = StringDictionary[ConversionMap]

type VolumeToSizeMap = StringDictionary[PositiveInteger]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-02-26`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type ebsSnapshot = String
