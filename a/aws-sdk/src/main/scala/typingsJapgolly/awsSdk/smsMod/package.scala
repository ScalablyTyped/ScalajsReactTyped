package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object smsMod {
  type AmiId = java.lang.String
  type AppDescription = java.lang.String
  type AppId = java.lang.String
  type AppIds = js.Array[typingsJapgolly.awsSdk.smsMod.AppId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_CONFIGURATION
    - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURATION_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURATION_INVALID
    - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_LAUNCH
    - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCHED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELTA_LAUNCH_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.DELTA_LAUNCH_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
    - java.lang.String
  */
  type AppLaunchStatus = typingsJapgolly.awsSdk.smsMod._AppLaunchStatus | java.lang.String
  type AppLaunchStatusMessage = java.lang.String
  type AppName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_CONFIGURATION
    - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURATION_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURATION_INVALID
    - typingsJapgolly.awsSdk.awsSdkStrings.READY_FOR_REPLICATION
    - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATION_PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATION_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELTA_REPLICATION_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.DELTA_REPLICATED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELTA_REPLICATION_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATION_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATION_STOPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATION_STOP_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATION_STOPPED
    - java.lang.String
  */
  type AppReplicationStatus = typingsJapgolly.awsSdk.smsMod._AppReplicationStatus | java.lang.String
  type AppReplicationStatusMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type AppStatus = typingsJapgolly.awsSdk.smsMod._AppStatus | java.lang.String
  type AppStatusMessage = java.lang.String
  type Apps = js.Array[typingsJapgolly.awsSdk.smsMod.AppSummary]
  type AssociatePublicIpAddress = scala.Boolean
  type BucketName = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.smsMod.ClientApiVersions
  type ClientToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.VSPHERE
    - typingsJapgolly.awsSdk.awsSdkStrings.SCVMM
    - typingsJapgolly.awsSdk.awsSdkStrings.`HYPERV-MANAGER`
    - typingsJapgolly.awsSdk.awsSdkStrings.SNAPSHOT_BATCHING
    - java.lang.String
  */
  type ConnectorCapability = typingsJapgolly.awsSdk.smsMod._ConnectorCapability | java.lang.String
  type ConnectorCapabilityList = js.Array[typingsJapgolly.awsSdk.smsMod.ConnectorCapability]
  type ConnectorId = java.lang.String
  type ConnectorList = js.Array[typingsJapgolly.awsSdk.smsMod.Connector]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
    - java.lang.String
  */
  type ConnectorStatus = typingsJapgolly.awsSdk.smsMod._ConnectorStatus | java.lang.String
  type ConnectorVersion = java.lang.String
  type Description = java.lang.String
  type EC2KeyName = java.lang.String
  type Encrypted = scala.Boolean
  type ForceStopAppReplication = scala.Boolean
  type ForceTerminateApp = scala.Boolean
  type Frequency = scala.Double
  type InstanceType = java.lang.String
  type IpAddress = java.lang.String
  type KeyName = java.lang.String
  type KmsKeyId = java.lang.String
  type LaunchOrder = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS
    - typingsJapgolly.awsSdk.awsSdkStrings.BYOL
    - java.lang.String
  */
  type LicenseType = typingsJapgolly.awsSdk.smsMod._LicenseType | java.lang.String
  type LogicalId = java.lang.String
  type MacAddress = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type NumberOfRecentAmisToKeep = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.JSON
    - typingsJapgolly.awsSdk.awsSdkStrings.YAML
    - java.lang.String
  */
  type OutputFormat = typingsJapgolly.awsSdk.smsMod._OutputFormat | java.lang.String
  type ReplicationJobId = java.lang.String
  type ReplicationJobList = js.Array[typingsJapgolly.awsSdk.smsMod.ReplicationJob]
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
  type ReplicationJobState = typingsJapgolly.awsSdk.smsMod._ReplicationJobState | java.lang.String
  type ReplicationJobStatusMessage = java.lang.String
  type ReplicationJobTerminated = scala.Boolean
  type ReplicationRunId = java.lang.String
  type ReplicationRunList = js.Array[typingsJapgolly.awsSdk.smsMod.ReplicationRun]
  type ReplicationRunStage = java.lang.String
  type ReplicationRunStageProgress = java.lang.String
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
  type ReplicationRunState = typingsJapgolly.awsSdk.smsMod._ReplicationRunState | java.lang.String
  type ReplicationRunStatusMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATIC
    - java.lang.String
  */
  type ReplicationRunType = typingsJapgolly.awsSdk.smsMod._ReplicationRunType | java.lang.String
  type RoleName = java.lang.String
  type RunOnce = scala.Boolean
  type SecurityGroup = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_IMPORTED
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORTING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type ServerCatalogStatus = typingsJapgolly.awsSdk.smsMod._ServerCatalogStatus | java.lang.String
  type ServerGroupId = java.lang.String
  type ServerGroupLaunchConfigurations = js.Array[typingsJapgolly.awsSdk.smsMod.ServerGroupLaunchConfiguration]
  type ServerGroupName = java.lang.String
  type ServerGroupReplicationConfigurations = js.Array[typingsJapgolly.awsSdk.smsMod.ServerGroupReplicationConfiguration]
  type ServerGroups = js.Array[typingsJapgolly.awsSdk.smsMod.ServerGroup]
  type ServerId = java.lang.String
  type ServerLaunchConfigurations = js.Array[typingsJapgolly.awsSdk.smsMod.ServerLaunchConfiguration]
  type ServerList = js.Array[typingsJapgolly.awsSdk.smsMod.Server]
  type ServerReplicationConfigurations = js.Array[typingsJapgolly.awsSdk.smsMod.ServerReplicationConfiguration]
  type ServerType = typingsJapgolly.awsSdk.awsSdkStrings.VIRTUAL_MACHINE | java.lang.String
  type StackId = java.lang.String
  type StackName = java.lang.String
  type Subnet = java.lang.String
  type TagKey = java.lang.String
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.smsMod.Tag]
  type Timestamp = js.Date
  type TotalServerGroups = scala.Double
  type TotalServers = scala.Double
  type VPC = java.lang.String
  type VmId = java.lang.String
  type VmManagerId = java.lang.String
  type VmManagerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.VSPHERE
    - typingsJapgolly.awsSdk.awsSdkStrings.SCVMM
    - typingsJapgolly.awsSdk.awsSdkStrings.`HYPERV-MANAGER`
    - java.lang.String
  */
  type VmManagerType = typingsJapgolly.awsSdk.smsMod._VmManagerType | java.lang.String
  type VmName = java.lang.String
  type VmPath = java.lang.String
  type VmServerAddressList = js.Array[typingsJapgolly.awsSdk.smsMod.VmServerAddress]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-10-24`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.smsMod._apiVersion | java.lang.String
}
