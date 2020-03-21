package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object workspacesMod {
  type ARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW
    - typingsJapgolly.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type AccessPropertyValue = typingsJapgolly.awsSdk.workspacesMod._AccessPropertyValue | java.lang.String
  type AccountModificationList = js.Array[typingsJapgolly.awsSdk.workspacesMod.AccountModification]
  type Alias = java.lang.String
  type BooleanObject = scala.Boolean
  type BundleId = java.lang.String
  type BundleIdList = js.Array[typingsJapgolly.awsSdk.workspacesMod.BundleId]
  type BundleList = js.Array[typingsJapgolly.awsSdk.workspacesMod.WorkspaceBundle]
  type BundleOwner = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.workspacesMod.ClientApiVersions
  type ClientPropertiesList = js.Array[typingsJapgolly.awsSdk.workspacesMod.ClientPropertiesResult]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.VALUE
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - typingsJapgolly.awsSdk.awsSdkStrings.PERFORMANCE
    - typingsJapgolly.awsSdk.awsSdkStrings.POWER
    - typingsJapgolly.awsSdk.awsSdkStrings.GRAPHICS
    - typingsJapgolly.awsSdk.awsSdkStrings.POWERPRO
    - typingsJapgolly.awsSdk.awsSdkStrings.GRAPHICSPRO
    - java.lang.String
  */
  type Compute = typingsJapgolly.awsSdk.workspacesMod._Compute | java.lang.String
  type ComputerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISCONNECTED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type ConnectionState = typingsJapgolly.awsSdk.workspacesMod._ConnectionState | java.lang.String
  type DedicatedTenancyCidrRangeList = js.Array[typingsJapgolly.awsSdk.workspacesMod.DedicatedTenancyManagementCidrRange]
  type DedicatedTenancyManagementCidrRange = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DedicatedTenancyModificationStateEnum = typingsJapgolly.awsSdk.workspacesMod._DedicatedTenancyModificationStateEnum | java.lang.String
  type DedicatedTenancySupportEnum = typingsJapgolly.awsSdk.awsSdkStrings.ENABLED | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DedicatedTenancySupportResultEnum = typingsJapgolly.awsSdk.workspacesMod._DedicatedTenancySupportResultEnum | java.lang.String
  type DefaultOu = java.lang.String
  type Description = java.lang.String
  type DirectoryId = java.lang.String
  type DirectoryIdList = js.Array[typingsJapgolly.awsSdk.workspacesMod.DirectoryId]
  type DirectoryList = js.Array[typingsJapgolly.awsSdk.workspacesMod.WorkspaceDirectory]
  type DirectoryName = java.lang.String
  type DnsIpAddresses = js.Array[typingsJapgolly.awsSdk.workspacesMod.IpAddress]
  type Ec2ImageId = java.lang.String
  type ErrorType = java.lang.String
  type FailedCreateWorkspaceRequests = js.Array[typingsJapgolly.awsSdk.workspacesMod.FailedCreateWorkspaceRequest]
  type FailedRebootWorkspaceRequests = js.Array[typingsJapgolly.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  type FailedRebuildWorkspaceRequests = js.Array[typingsJapgolly.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  type FailedStartWorkspaceRequests = js.Array[typingsJapgolly.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  type FailedStopWorkspaceRequests = js.Array[typingsJapgolly.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  type FailedTerminateWorkspaceRequests = js.Array[typingsJapgolly.awsSdk.workspacesMod.FailedWorkspaceChangeRequest]
  type IpAddress = java.lang.String
  type IpGroupDesc = java.lang.String
  type IpGroupId = java.lang.String
  type IpGroupIdList = js.Array[typingsJapgolly.awsSdk.workspacesMod.IpGroupId]
  type IpGroupName = java.lang.String
  type IpRevokedRuleList = js.Array[typingsJapgolly.awsSdk.workspacesMod.IpRule]
  type IpRule = java.lang.String
  type IpRuleDesc = java.lang.String
  type IpRuleList = js.Array[typingsJapgolly.awsSdk.workspacesMod.IpRuleItem]
  type Limit = scala.Double
  type ManagementCidrRangeConstraint = java.lang.String
  type ManagementCidrRangeMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ROOT_VOLUME
    - typingsJapgolly.awsSdk.awsSdkStrings.USER_VOLUME
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPUTE_TYPE
    - java.lang.String
  */
  type ModificationResourceEnum = typingsJapgolly.awsSdk.workspacesMod._ModificationResourceEnum | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_INITIATED
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - java.lang.String
  */
  type ModificationStateEnum = typingsJapgolly.awsSdk.workspacesMod._ModificationStateEnum | java.lang.String
  type ModificationStateList = js.Array[typingsJapgolly.awsSdk.workspacesMod.ModificationState]
  type NonEmptyString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS
    - typingsJapgolly.awsSdk.awsSdkStrings.LINUX
    - java.lang.String
  */
  type OperatingSystemType = typingsJapgolly.awsSdk.workspacesMod._OperatingSystemType | java.lang.String
  type PaginationToken = java.lang.String
  type RebootWorkspaceRequests = js.Array[typingsJapgolly.awsSdk.workspacesMod.RebootRequest]
  type RebuildWorkspaceRequests = js.Array[typingsJapgolly.awsSdk.workspacesMod.RebuildRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ReconnectEnum = typingsJapgolly.awsSdk.workspacesMod._ReconnectEnum | java.lang.String
  type Region = java.lang.String
  type RegistrationCode = java.lang.String
  type ResourceIdList = js.Array[typingsJapgolly.awsSdk.workspacesMod.NonEmptyString]
  type RootVolumeSizeGib = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTO_STOP
    - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS_ON
    - java.lang.String
  */
  type RunningMode = typingsJapgolly.awsSdk.workspacesMod._RunningMode | java.lang.String
  type RunningModeAutoStopTimeoutInMinutes = scala.Double
  type SecurityGroupId = java.lang.String
  type SnapshotList = js.Array[typingsJapgolly.awsSdk.workspacesMod.Snapshot]
  type StartWorkspaceRequests = js.Array[typingsJapgolly.awsSdk.workspacesMod.StartRequest]
  type StopWorkspaceRequests = js.Array[typingsJapgolly.awsSdk.workspacesMod.StopRequest]
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typingsJapgolly.awsSdk.workspacesMod.SubnetId]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.workspacesMod.NonEmptyString]
  type TagList = js.Array[typingsJapgolly.awsSdk.workspacesMod.Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.ADMIN_MAINTENANCE
    - java.lang.String
  */
  type TargetWorkspaceState = typingsJapgolly.awsSdk.workspacesMod._TargetWorkspaceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEDICATED
    - typingsJapgolly.awsSdk.awsSdkStrings.SHARED
    - java.lang.String
  */
  type Tenancy = typingsJapgolly.awsSdk.workspacesMod._Tenancy | java.lang.String
  type TerminateWorkspaceRequests = js.Array[typingsJapgolly.awsSdk.workspacesMod.TerminateRequest]
  type Timestamp = js.Date
  type UserName = java.lang.String
  type UserVolumeSizeGib = scala.Double
  type VolumeEncryptionKey = java.lang.String
  type WorkspaceConnectionStatusList = js.Array[typingsJapgolly.awsSdk.workspacesMod.WorkspaceConnectionStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.REGISTERING
    - typingsJapgolly.awsSdk.awsSdkStrings.REGISTERED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEREGISTERING
    - typingsJapgolly.awsSdk.awsSdkStrings.DEREGISTERED
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type WorkspaceDirectoryState = typingsJapgolly.awsSdk.workspacesMod._WorkspaceDirectoryState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SIMPLE_AD
    - typingsJapgolly.awsSdk.awsSdkStrings.AD_CONNECTOR
    - java.lang.String
  */
  type WorkspaceDirectoryType = typingsJapgolly.awsSdk.workspacesMod._WorkspaceDirectoryType | java.lang.String
  type WorkspaceErrorCode = java.lang.String
  type WorkspaceId = java.lang.String
  type WorkspaceIdList = js.Array[typingsJapgolly.awsSdk.workspacesMod.WorkspaceId]
  type WorkspaceImageDescription = java.lang.String
  type WorkspaceImageErrorCode = java.lang.String
  type WorkspaceImageId = java.lang.String
  type WorkspaceImageIdList = js.Array[typingsJapgolly.awsSdk.workspacesMod.WorkspaceImageId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BYOL_REGULAR
    - typingsJapgolly.awsSdk.awsSdkStrings.BYOL_GRAPHICS
    - typingsJapgolly.awsSdk.awsSdkStrings.BYOL_GRAPHICSPRO
    - java.lang.String
  */
  type WorkspaceImageIngestionProcess = typingsJapgolly.awsSdk.workspacesMod._WorkspaceImageIngestionProcess | java.lang.String
  type WorkspaceImageList = js.Array[typingsJapgolly.awsSdk.workspacesMod.WorkspaceImage]
  type WorkspaceImageName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.DEDICATED
    - java.lang.String
  */
  type WorkspaceImageRequiredTenancy = typingsJapgolly.awsSdk.workspacesMod._WorkspaceImageRequiredTenancy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type WorkspaceImageState = typingsJapgolly.awsSdk.workspacesMod._WorkspaceImageState | java.lang.String
  type WorkspaceList = js.Array[typingsJapgolly.awsSdk.workspacesMod.Workspace]
  type WorkspaceRequestList = js.Array[typingsJapgolly.awsSdk.workspacesMod.WorkspaceRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPAIRED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.REBOOTING
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
    - typingsJapgolly.awsSdk.awsSdkStrings.REBUILDING
    - typingsJapgolly.awsSdk.awsSdkStrings.RESTORING
    - typingsJapgolly.awsSdk.awsSdkStrings.MAINTENANCE
    - typingsJapgolly.awsSdk.awsSdkStrings.ADMIN_MAINTENANCE
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATING
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
    - typingsJapgolly.awsSdk.awsSdkStrings.SUSPENDED
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type WorkspaceState = typingsJapgolly.awsSdk.workspacesMod._WorkspaceState | java.lang.String
  type WorkspacesIpGroupsList = js.Array[typingsJapgolly.awsSdk.workspacesMod.WorkspacesIpGroup]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-04-08`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.workspacesMod._apiVersion | java.lang.String
}
