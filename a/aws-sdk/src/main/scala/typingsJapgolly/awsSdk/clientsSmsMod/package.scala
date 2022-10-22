package typingsJapgolly.awsSdk.clientsSmsMod

import typingsJapgolly.awsSdk.awsSdkStrings.SSM
import typingsJapgolly.awsSdk.awsSdkStrings.USERDATA
import typingsJapgolly.awsSdk.awsSdkStrings.VIRTUAL_MACHINE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmiId = String

type AppDescription = String

type AppId = String

type AppIdWithValidation = String

type AppIds = js.Array[AppId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CONFIGURED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURED
  - java.lang.String
*/
type AppLaunchConfigurationStatus = _AppLaunchConfigurationStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_CONFIGURATION
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURATION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURATION_INVALID
  - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_LAUNCH
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCHED
  - typingsJapgolly.awsSdk.awsSdkStrings.PARTIALLY_LAUNCHED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELTA_LAUNCH_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELTA_LAUNCH_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
  - java.lang.String
*/
type AppLaunchStatus = _AppLaunchStatus | String

type AppLaunchStatusMessage = String

type AppName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CONFIGURED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURED
  - java.lang.String
*/
type AppReplicationConfigurationStatus = _AppReplicationConfigurationStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_CONFIGURATION
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURATION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURATION_INVALID
  - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_REPLICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATION_PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATED
  - typingsJapgolly.awsSdk.awsSdkStrings.PARTIALLY_REPLICATED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELTA_REPLICATION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELTA_REPLICATED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELTA_REPLICATION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATION_STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATION_STOP_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATION_STOPPED
  - java.lang.String
*/
type AppReplicationStatus = _AppReplicationStatus | String

type AppReplicationStatusMessage = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type AppStatus = _AppStatus | String

type AppStatusMessage = String

type AppValidationConfigurations = js.Array[AppValidationConfiguration]

type AppValidationStrategy = SSM | String

type Apps = js.Array[AppSummary]

type AssociatePublicIpAddress = Boolean

type AutoLaunch = Boolean

type BucketName = String

type ClientToken = String

type Command = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VSPHERE
  - typingsJapgolly.awsSdk.awsSdkStrings.SCVMM
  - typingsJapgolly.awsSdk.awsSdkStrings.`HYPERV-MANAGER`
  - typingsJapgolly.awsSdk.awsSdkStrings.SNAPSHOT_BATCHING
  - typingsJapgolly.awsSdk.awsSdkStrings.SMS_OPTIMIZED
  - java.lang.String
*/
type ConnectorCapability = _ConnectorCapability | String

type ConnectorCapabilityList = js.Array[ConnectorCapability]

type ConnectorId = String

type ConnectorList = js.Array[Connector]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
  - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
  - java.lang.String
*/
type ConnectorStatus = _ConnectorStatus | String

type ConnectorVersion = String

type Description = String

type EC2KeyName = String

type Encrypted = Boolean

type ExecutionTimeoutSeconds = Double

type ForceStopAppReplication = Boolean

type ForceTerminateApp = Boolean

type Frequency = Double

type ImportedAppId = String

type InstanceId = String

type InstanceType = String

type IpAddress = String

type KmsKeyId = String

type LaunchOrder = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS
  - typingsJapgolly.awsSdk.awsSdkStrings.BYOL
  - java.lang.String
*/
type LicenseType = _LicenseType | String

type LogicalId = String

type MacAddress = String

type MaxResults = Double

type NextToken = String

type NonEmptyStringWithMaxLen255 = String

type NumberOfRecentAmisToKeep = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - typingsJapgolly.awsSdk.awsSdkStrings.YAML
  - java.lang.String
*/
type OutputFormat = _OutputFormat | String

type ReplicationJobId = String

type ReplicationJobList = js.Array[ReplicationJob]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.PAUSED_ON_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILING
  - java.lang.String
*/
type ReplicationJobState = _ReplicationJobState | String

type ReplicationJobStatusMessage = String

type ReplicationJobTerminated = Boolean

type ReplicationRunId = String

type ReplicationRunList = js.Array[ReplicationRun]

type ReplicationRunStage = String

type ReplicationRunStageProgress = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type ReplicationRunState = _ReplicationRunState | String

type ReplicationRunStatusMessage = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATIC
  - java.lang.String
*/
type ReplicationRunType = _ReplicationRunType | String

type RoleName = String

type RunOnce = Boolean

type S3BucketName = String

type S3KeyName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SHELL_SCRIPT
  - typingsJapgolly.awsSdk.awsSdkStrings.POWERSHELL_SCRIPT
  - java.lang.String
*/
type ScriptType = _ScriptType | String

type SecurityGroup = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_IMPORTED
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORTING
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type ServerCatalogStatus = _ServerCatalogStatus | String

type ServerGroupId = String

type ServerGroupLaunchConfigurations = js.Array[ServerGroupLaunchConfiguration]

type ServerGroupName = String

type ServerGroupReplicationConfigurations = js.Array[ServerGroupReplicationConfiguration]

type ServerGroupValidationConfigurations = js.Array[ServerGroupValidationConfiguration]

type ServerGroups = js.Array[ServerGroup]

type ServerId = String

type ServerLaunchConfigurations = js.Array[ServerLaunchConfiguration]

type ServerList = js.Array[Server]

type ServerReplicationConfigurations = js.Array[ServerReplicationConfiguration]

type ServerType = VIRTUAL_MACHINE | String

type ServerValidationConfigurations = js.Array[ServerValidationConfiguration]

type ServerValidationStrategy = USERDATA | String

type StackId = String

type StackName = String

type Subnet = String

type TagKey = String

type TagValue = String

type Tags = js.Array[Tag]

type Timestamp = js.Date

type TotalServerGroups = Double

type TotalServers = Double

type VPC = String

type ValidationId = String

type ValidationOutputList = js.Array[ValidationOutput]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_VALIDATION
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ValidationStatus = _ValidationStatus | String

type ValidationStatusMessage = String

type VmId = String

type VmManagerId = String

type VmManagerName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VSPHERE
  - typingsJapgolly.awsSdk.awsSdkStrings.SCVMM
  - typingsJapgolly.awsSdk.awsSdkStrings.`HYPERV-MANAGER`
  - java.lang.String
*/
type VmManagerType = _VmManagerType | String

type VmName = String

type VmPath = String

type VmServerAddressList = js.Array[VmServerAddress]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-10-24`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
