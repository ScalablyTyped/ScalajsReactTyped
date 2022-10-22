package typingsJapgolly.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.DENY
  - java.lang.String
*/
type AccessPropertyValue = _AccessPropertyValue | String

type AccountModificationList = js.Array[AccountModification]

type AddInName = String

type AddInUrl = String

type Alias = String

type AmazonUuid = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Microsoft_Office_2016
  - typingsJapgolly.awsSdk.awsSdkStrings.Microsoft_Office_2019
  - java.lang.String
*/
type Application = _Application | String

type ApplicationList = js.Array[Application]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_ASSOCIATED
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATED_WITH_OWNER_ACCOUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATED_WITH_SHARED_ACCOUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_ASSOCIATION
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_DISASSOCIATION
  - java.lang.String
*/
type AssociationStatus = _AssociationStatus | String

type AwsAccount = String

type BooleanObject = Boolean

type BundleId = String

type BundleIdList = js.Array[BundleId]

type BundleList = js.Array[WorkspaceBundle]

type BundleOwner = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DeviceTypeWindows
  - typingsJapgolly.awsSdk.awsSdkStrings.DeviceTypeOsx
  - typingsJapgolly.awsSdk.awsSdkStrings.DeviceTypeAndroid
  - typingsJapgolly.awsSdk.awsSdkStrings.DeviceTypeIos
  - typingsJapgolly.awsSdk.awsSdkStrings.DeviceTypeLinux
  - typingsJapgolly.awsSdk.awsSdkStrings.DeviceTypeWeb
  - java.lang.String
*/
type ClientDeviceType = _ClientDeviceType | String

type ClientDeviceTypeList = js.Array[ClientDeviceType]

type ClientEmail = String

type ClientLocale = String

type ClientLoginMessage = String

type ClientPropertiesList = js.Array[ClientPropertiesResult]

type ClientUrl = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - typingsJapgolly.awsSdk.awsSdkStrings.PERFORMANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.POWER
  - typingsJapgolly.awsSdk.awsSdkStrings.GRAPHICS
  - typingsJapgolly.awsSdk.awsSdkStrings.POWERPRO
  - typingsJapgolly.awsSdk.awsSdkStrings.GRAPHICSPRO
  - typingsJapgolly.awsSdk.awsSdkStrings.GRAPHICS_G4DN
  - typingsJapgolly.awsSdk.awsSdkStrings.GRAPHICSPRO_G4DN
  - java.lang.String
*/
type Compute = _Compute | String

type ComputerName = String

type ConnectClientAddInList = js.Array[ConnectClientAddIn]

type ConnectionAliasAssociationList = js.Array[ConnectionAliasAssociation]

type ConnectionAliasId = String

type ConnectionAliasIdList = js.Array[ConnectionAliasId]

type ConnectionAliasList = js.Array[ConnectionAlias]

type ConnectionAliasPermissions = js.Array[ConnectionAliasPermission]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ConnectionAliasState = _ConnectionAliasState | String

type ConnectionIdentifier = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISCONNECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type ConnectionState = _ConnectionState | String

type ConnectionString = String

type DedicatedTenancyCidrRangeList = js.Array[DedicatedTenancyManagementCidrRange]

type DedicatedTenancyManagementCidrRange = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type DedicatedTenancyModificationStateEnum = _DedicatedTenancyModificationStateEnum | String

type DedicatedTenancySupportEnum = ENABLED | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type DedicatedTenancySupportResultEnum = _DedicatedTenancySupportResultEnum | String

type DefaultLogo = Buffer | js.typedarray.Uint8Array | Blob | String

type DefaultOu = String

type DeletableSamlPropertiesList = js.Array[DeletableSamlProperty]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SAML_PROPERTIES_USER_ACCESS_URL
  - typingsJapgolly.awsSdk.awsSdkStrings.SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME
  - java.lang.String
*/
type DeletableSamlProperty = _DeletableSamlProperty | String

type Description = String

type DirectoryId = String

type DirectoryIdList = js.Array[DirectoryId]

type DirectoryList = js.Array[WorkspaceDirectory]

type DirectoryName = String

type DnsIpAddresses = js.Array[IpAddress]

type Ec2ImageId = String

type ErrorType = String

type FailedCreateWorkspaceRequests = js.Array[FailedCreateWorkspaceRequest]

type FailedRebootWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]

type FailedRebuildWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]

type FailedStartWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]

type FailedStopWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]

type FailedTerminateWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]

type ImagePermissions = js.Array[ImagePermission]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OWNED
  - typingsJapgolly.awsSdk.awsSdkStrings.SHARED
  - java.lang.String
*/
type ImageType = _ImageType | String

type Ios2XLogo = Buffer | js.typedarray.Uint8Array | Blob | String

type Ios3XLogo = Buffer | js.typedarray.Uint8Array | Blob | String

type IosLogo = Buffer | js.typedarray.Uint8Array | Blob | String

type IpAddress = String

type IpGroupDesc = String

type IpGroupId = String

type IpGroupIdList = js.Array[IpGroupId]

type IpGroupName = String

type IpRevokedRuleList = js.Array[IpRule]

type IpRule = String

type IpRuleDesc = String

type IpRuleList = js.Array[IpRuleItem]

type Limit = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type LogUploadEnum = _LogUploadEnum | String

type LoginMessage = StringDictionary[ClientLoginMessage]

type ManagementCidrRangeConstraint = String

type ManagementCidrRangeMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ROOT_VOLUME
  - typingsJapgolly.awsSdk.awsSdkStrings.USER_VOLUME
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPUTE_TYPE
  - java.lang.String
*/
type ModificationResourceEnum = _ModificationResourceEnum | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_INITIATED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - java.lang.String
*/
type ModificationStateEnum = _ModificationStateEnum | String

type ModificationStateList = js.Array[ModificationState]

type NonEmptyString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS
  - typingsJapgolly.awsSdk.awsSdkStrings.LINUX
  - java.lang.String
*/
type OperatingSystemType = _OperatingSystemType | String

type PaginationToken = String

type RebootWorkspaceRequests = js.Array[RebootRequest]

type RebuildWorkspaceRequests = js.Array[RebuildRequest]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ReconnectEnum = _ReconnectEnum | String

type Region = String

type RegistrationCode = String

type ResourceIdList = js.Array[NonEmptyString]

type RootVolumeSizeGib = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTO_STOP
  - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS_ON
  - java.lang.String
*/
type RunningMode = _RunningMode | String

type RunningModeAutoStopTimeoutInMinutes = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK
  - java.lang.String
*/
type SamlStatusEnum = _SamlStatusEnum | String

type SamlUserAccessUrl = String

type SecurityGroupId = String

type SnapshotList = js.Array[Snapshot]

type StartWorkspaceRequests = js.Array[StartRequest]

type StopWorkspaceRequests = js.Array[StopRequest]

type SubnetId = String

type SubnetIds = js.Array[SubnetId]

type TagKey = String

type TagKeyList = js.Array[NonEmptyString]

type TagList = js.Array[Tag]

type TagValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.ADMIN_MAINTENANCE
  - java.lang.String
*/
type TargetWorkspaceState = _TargetWorkspaceState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEDICATED
  - typingsJapgolly.awsSdk.awsSdkStrings.SHARED
  - java.lang.String
*/
type Tenancy = _Tenancy | String

type TerminateWorkspaceRequests = js.Array[TerminateRequest]

type Timestamp = js.Date

type UpdateDescription = String

type UserName = String

type UserVolumeSizeGib = Double

type VolumeEncryptionKey = String

type WorkspaceBundleDescription = String

type WorkspaceBundleName = String

type WorkspaceConnectionStatusList = js.Array[WorkspaceConnectionStatus]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REGISTERING
  - typingsJapgolly.awsSdk.awsSdkStrings.REGISTERED
  - typingsJapgolly.awsSdk.awsSdkStrings.DEREGISTERING
  - typingsJapgolly.awsSdk.awsSdkStrings.DEREGISTERED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type WorkspaceDirectoryState = _WorkspaceDirectoryState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SIMPLE_AD
  - typingsJapgolly.awsSdk.awsSdkStrings.AD_CONNECTOR
  - java.lang.String
*/
type WorkspaceDirectoryType = _WorkspaceDirectoryType | String

type WorkspaceErrorCode = String

type WorkspaceId = String

type WorkspaceIdList = js.Array[WorkspaceId]

type WorkspaceImageDescription = String

type WorkspaceImageErrorCode = String

type WorkspaceImageId = String

type WorkspaceImageIdList = js.Array[WorkspaceImageId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BYOL_REGULAR
  - typingsJapgolly.awsSdk.awsSdkStrings.BYOL_GRAPHICS
  - typingsJapgolly.awsSdk.awsSdkStrings.BYOL_GRAPHICSPRO
  - typingsJapgolly.awsSdk.awsSdkStrings.BYOL_GRAPHICS_G4DN
  - typingsJapgolly.awsSdk.awsSdkStrings.BYOL_REGULAR_WSP
  - java.lang.String
*/
type WorkspaceImageIngestionProcess = _WorkspaceImageIngestionProcess | String

type WorkspaceImageList = js.Array[WorkspaceImage]

type WorkspaceImageName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.DEDICATED
  - java.lang.String
*/
type WorkspaceImageRequiredTenancy = _WorkspaceImageRequiredTenancy | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type WorkspaceImageState = _WorkspaceImageState | String

type WorkspaceList = js.Array[Workspace]

type WorkspaceRequestList = js.Array[WorkspaceRequest]

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
type WorkspaceState = _WorkspaceState | String

type WorkspacesIpGroupsList = js.Array[WorkspacesIpGroup]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2015-04-08`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
