package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActivationKey = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.DETACHED
  - typingsJapgolly.awsSdk.awsSdkStrings.JOINED
  - typingsJapgolly.awsSdk.awsSdkStrings.JOINING
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMEOUT
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN_ERROR
  - java.lang.String
*/
type ActiveDirectoryStatus = _ActiveDirectoryStatus | String

type AuditDestinationARN = String

type Authentication = String

type AutomaticTapeCreationPolicyInfos = js.Array[AutomaticTapeCreationPolicyInfo]

type AutomaticTapeCreationRules = js.Array[AutomaticTapeCreationRule]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type AvailabilityMonitorTestStatus = _AvailabilityMonitorTestStatus | String

type BandwidthDownloadRateLimit = Double

type BandwidthRateLimitIntervals = js.Array[BandwidthRateLimitInterval]

type BandwidthType = String

type BandwidthUploadRateLimit = Double

type Boolean = scala.Boolean

type CacheStaleTimeoutInSeconds = Double

type CachediSCSIVolumes = js.Array[CachediSCSIVolume]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ClientSpecified
  - typingsJapgolly.awsSdk.awsSdkStrings.CaseSensitive
  - java.lang.String
*/
type CaseSensitivity = _CaseSensitivity | String

type ChapCredentials = js.Array[ChapInfo]

type ChapSecret = String

type ClientToken = String

type CloudWatchLogGroupARN = String

type CreatedDate = js.Date

type DNSHostName = String

type DayOfMonth = Double

type DayOfWeek = Double

type DaysOfWeek = js.Array[DayOfWeek]

type DeprecationDate = String

type Description = String

type DeviceType = String

type DiskAllocationType = String

type DiskAttribute = String

type DiskAttributeList = js.Array[DiskAttribute]

type DiskId = String

type DiskIds = js.Array[DiskId]

type Disks = js.Array[Disk]

type DomainName = String

type DomainUserName = String

type DomainUserPassword = String

type DoubleObject = Double

type Ec2InstanceId = String

type Ec2InstanceRegion = String

type EndpointType = String

type FileShareARN = String

type FileShareARNList = js.Array[FileShareARN]

type FileShareClientList = js.Array[IPV4AddressCIDR]

type FileShareId = String

type FileShareInfoList = js.Array[FileShareInfo]

type FileShareName = String

type FileShareStatus = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NFS
  - typingsJapgolly.awsSdk.awsSdkStrings.SMB
  - java.lang.String
*/
type FileShareType = _FileShareType | String

type FileSystemAssociationARN = String

type FileSystemAssociationARNList = js.Array[FileSystemAssociationARN]

type FileSystemAssociationId = String

type FileSystemAssociationInfoList = js.Array[FileSystemAssociationInfo]

type FileSystemAssociationStatus = String

type FileSystemAssociationStatusDetails = js.Array[FileSystemAssociationStatusDetail]

type FileSystemAssociationSummaryList = js.Array[FileSystemAssociationSummary]

type FileSystemAssociationSyncErrorCode = String

type FileSystemLocationARN = String

type Folder = String

type FolderList = js.Array[Folder]

type GatewayARN = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Small_
  - typingsJapgolly.awsSdk.awsSdkStrings.Medium_
  - typingsJapgolly.awsSdk.awsSdkStrings.Large_
  - java.lang.String
*/
type GatewayCapacity = _GatewayCapacity | String

type GatewayId = String

type GatewayName = String

type GatewayNetworkInterfaces = js.Array[NetworkInterface]

type GatewayOperationalState = String

type GatewayState = String

type GatewayTimezone = String

type GatewayType = String

type Gateways = js.Array[GatewayInfo]

type Host = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VMWARE
  - typingsJapgolly.awsSdk.awsSdkStrings.`HYPER-V`
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2
  - typingsJapgolly.awsSdk.awsSdkStrings.KVM
  - typingsJapgolly.awsSdk.awsSdkStrings.OTHER
  - typingsJapgolly.awsSdk.awsSdkStrings.SNOWBALL
  - java.lang.String
*/
type HostEnvironment = _HostEnvironment | String

type HostEnvironmentId = String

type Hosts = js.Array[Host]

type HourOfDay = Double

type IPV4Address = String

type IPV4AddressCIDR = String

type Initiator = String

type Initiators = js.Array[Initiator]

type IpAddressList = js.Array[IPV4Address]

type IqnName = String

type KMSKey = String

type LastSoftwareUpdate = String

type LocalConsolePassword = String

type LocationARN = String

type Marker = String

type MediumChangerType = String

type MinimumNumTapes = Double

type MinuteOfHour = Double

type NFSFileShareInfoList = js.Array[NFSFileShareInfo]

type NetworkInterfaceId = String

type NextUpdateAvailabilityDate = String

type NotificationId = String

type NotificationPolicy = String

type NumTapesToCreate = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.private__
  - typingsJapgolly.awsSdk.awsSdkStrings.`public-read`
  - typingsJapgolly.awsSdk.awsSdkStrings.`public-read-write`
  - typingsJapgolly.awsSdk.awsSdkStrings.`authenticated-read`
  - typingsJapgolly.awsSdk.awsSdkStrings.`bucket-owner-read`
  - typingsJapgolly.awsSdk.awsSdkStrings.`bucket-owner-full-control`
  - typingsJapgolly.awsSdk.awsSdkStrings.`aws-exec-read`
  - java.lang.String
*/
type ObjectACL = _ObjectACL | String

type OrganizationalUnit = String

type Path = String

type PermissionId = Double

type PermissionMode = String

type PoolARN = String

type PoolARNs = js.Array[PoolARN]

type PoolId = String

type PoolInfos = js.Array[PoolInfo]

type PoolName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type PoolStatus = _PoolStatus | String

type PositiveIntObject = Double

type RecurrenceInHours = Double

type RegionId = String

type ResourceARN = String

type RetentionLockTimeInDays = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.GOVERNANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type RetentionLockType = _RetentionLockType | String

type Role = String

type SMBFileShareInfoList = js.Array[SMBFileShareInfo]

type SMBGuestPassword = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ClientSpecified
  - typingsJapgolly.awsSdk.awsSdkStrings.MandatorySigning
  - typingsJapgolly.awsSdk.awsSdkStrings.MandatoryEncryption
  - java.lang.String
*/
type SMBSecurityStrategy = _SMBSecurityStrategy | String

type SnapshotDescription = String

type SnapshotId = String

type SoftwareUpdatesEndDate = String

type Squash = String

type StorageClass = String

type StorediSCSIVolumes = js.Array[StorediSCSIVolume]

type SupportedGatewayCapacities = js.Array[GatewayCapacity]

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type Tags = js.Array[Tag]

type TapeARN = String

type TapeARNs = js.Array[TapeARN]

type TapeArchiveStatus = String

type TapeArchives = js.Array[TapeArchive]

type TapeBarcode = String

type TapeBarcodePrefix = String

type TapeDriveType = String

type TapeInfos = js.Array[TapeInfo]

type TapeRecoveryPointInfos = js.Array[TapeRecoveryPointInfo]

type TapeRecoveryPointStatus = String

type TapeSize = Double

type TapeStatus = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER
  - java.lang.String
*/
type TapeStorageClass = _TapeStorageClass | String

type TapeUsage = Double

type Tapes = js.Array[Tape]

type TargetARN = String

type TargetName = String

type Time = js.Date

type TimeoutInSeconds = Double

type UserList = js.Array[UserListUser]

type UserListUser = String

type VTLDeviceARN = String

type VTLDeviceARNs = js.Array[VTLDeviceARN]

type VTLDeviceProductIdentifier = String

type VTLDeviceType = String

type VTLDeviceVendor = String

type VTLDevices = js.Array[VTLDevice]

type VolumeARN = String

type VolumeARNs = js.Array[VolumeARN]

type VolumeAttachmentStatus = String

type VolumeId = String

type VolumeInfos = js.Array[VolumeInfo]

type VolumeRecoveryPointInfos = js.Array[VolumeRecoveryPointInfo]

type VolumeStatus = String

type VolumeType = String

type VolumeUsedInBytes = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2013-06-30`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type double = Double

type integer = Double

type long = Double
