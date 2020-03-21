package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storagegatewayMod {
  type ActivationKey = java.lang.String
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
  type ActiveDirectoryStatus = typingsJapgolly.awsSdk.storagegatewayMod._ActiveDirectoryStatus | java.lang.String
  type Authentication = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type AvailabilityMonitorTestStatus = typingsJapgolly.awsSdk.storagegatewayMod._AvailabilityMonitorTestStatus | java.lang.String
  type BandwidthDownloadRateLimit = scala.Double
  type BandwidthType = java.lang.String
  type BandwidthUploadRateLimit = scala.Double
  type Boolean = scala.Boolean
  type CachediSCSIVolumes = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.CachediSCSIVolume]
  type ChapCredentials = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.ChapInfo]
  type ChapSecret = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.storagegatewayMod.ClientApiVersions
  type ClientToken = java.lang.String
  type CloudWatchLogGroupARN = java.lang.String
  type CreatedDate = js.Date
  type DayOfMonth = scala.Double
  type DayOfWeek = scala.Double
  type Description = java.lang.String
  type DeviceType = java.lang.String
  type DiskAllocationType = java.lang.String
  type DiskAttribute = java.lang.String
  type DiskAttributeList = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.DiskAttribute]
  type DiskId = java.lang.String
  type DiskIds = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.DiskId]
  type Disks = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.Disk]
  type DomainName = java.lang.String
  type DomainUserName = java.lang.String
  type DomainUserPassword = java.lang.String
  type DoubleObject = scala.Double
  type Ec2InstanceId = java.lang.String
  type Ec2InstanceRegion = java.lang.String
  type FileShareARN = java.lang.String
  type FileShareARNList = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.FileShareARN]
  type FileShareClientList = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.IPV4AddressCIDR]
  type FileShareId = java.lang.String
  type FileShareInfoList = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.FileShareInfo]
  type FileShareStatus = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NFS
    - typingsJapgolly.awsSdk.awsSdkStrings.SMB
    - java.lang.String
  */
  type FileShareType = typingsJapgolly.awsSdk.storagegatewayMod._FileShareType | java.lang.String
  type FileShareUser = java.lang.String
  type FileShareUserList = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.FileShareUser]
  type Folder = java.lang.String
  type FolderList = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.Folder]
  type GatewayARN = java.lang.String
  type GatewayId = java.lang.String
  type GatewayName = java.lang.String
  type GatewayNetworkInterfaces = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.NetworkInterface]
  type GatewayOperationalState = java.lang.String
  type GatewayState = java.lang.String
  type GatewayTimezone = java.lang.String
  type GatewayType = java.lang.String
  type Gateways = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.GatewayInfo]
  type Host = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.VMWARE
    - typingsJapgolly.awsSdk.awsSdkStrings.`HYPER-V`
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2
    - typingsJapgolly.awsSdk.awsSdkStrings.KVM
    - typingsJapgolly.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type HostEnvironment = typingsJapgolly.awsSdk.storagegatewayMod._HostEnvironment | java.lang.String
  type Hosts = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.Host]
  type HourOfDay = scala.Double
  type IPV4AddressCIDR = java.lang.String
  type Initiator = java.lang.String
  type Initiators = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.Initiator]
  type IqnName = java.lang.String
  type KMSKey = java.lang.String
  type LastSoftwareUpdate = java.lang.String
  type LocalConsolePassword = java.lang.String
  type LocationARN = java.lang.String
  type Marker = java.lang.String
  type MediumChangerType = java.lang.String
  type MinuteOfHour = scala.Double
  type NFSFileShareInfoList = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.NFSFileShareInfo]
  type NetworkInterfaceId = java.lang.String
  type NextUpdateAvailabilityDate = java.lang.String
  type NotificationId = java.lang.String
  type NumTapesToCreate = scala.Double
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
  type ObjectACL = typingsJapgolly.awsSdk.storagegatewayMod._ObjectACL | java.lang.String
  type OrganizationalUnit = java.lang.String
  type Path = java.lang.String
  type PermissionId = scala.Double
  type PermissionMode = java.lang.String
  type PoolId = java.lang.String
  type PositiveIntObject = scala.Double
  type RecurrenceInHours = scala.Double
  type RegionId = java.lang.String
  type ResourceARN = java.lang.String
  type Role = java.lang.String
  type SMBFileShareInfoList = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.SMBFileShareInfo]
  type SMBGuestPassword = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ClientSpecified
    - typingsJapgolly.awsSdk.awsSdkStrings.MandatorySigning
    - typingsJapgolly.awsSdk.awsSdkStrings.MandatoryEncryption
    - java.lang.String
  */
  type SMBSecurityStrategy = typingsJapgolly.awsSdk.storagegatewayMod._SMBSecurityStrategy | java.lang.String
  type SnapshotDescription = java.lang.String
  type SnapshotId = java.lang.String
  type Squash = java.lang.String
  type StorageClass = java.lang.String
  type StorediSCSIVolumes = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.StorediSCSIVolume]
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.Tag]
  type TapeARN = java.lang.String
  type TapeARNs = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.TapeARN]
  type TapeArchiveStatus = java.lang.String
  type TapeArchives = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.TapeArchive]
  type TapeBarcode = java.lang.String
  type TapeBarcodePrefix = java.lang.String
  type TapeDriveType = java.lang.String
  type TapeInfos = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.TapeInfo]
  type TapeRecoveryPointInfos = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.TapeRecoveryPointInfo]
  type TapeRecoveryPointStatus = java.lang.String
  type TapeSize = scala.Double
  type TapeStatus = java.lang.String
  type TapeUsage = scala.Double
  type Tapes = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.Tape]
  type TargetARN = java.lang.String
  type TargetName = java.lang.String
  type Time = js.Date
  type TimeoutInSeconds = scala.Double
  type VTLDeviceARN = java.lang.String
  type VTLDeviceARNs = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.VTLDeviceARN]
  type VTLDeviceProductIdentifier = java.lang.String
  type VTLDeviceType = java.lang.String
  type VTLDeviceVendor = java.lang.String
  type VTLDevices = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.VTLDevice]
  type VolumeARN = java.lang.String
  type VolumeARNs = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.VolumeARN]
  type VolumeAttachmentStatus = java.lang.String
  type VolumeId = java.lang.String
  type VolumeInfos = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.VolumeInfo]
  type VolumeRecoveryPointInfos = js.Array[typingsJapgolly.awsSdk.storagegatewayMod.VolumeRecoveryPointInfo]
  type VolumeStatus = java.lang.String
  type VolumeType = java.lang.String
  type VolumeUsedInBytes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2013-06-30`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.storagegatewayMod._apiVersion | java.lang.String
  type double = scala.Double
  type integer = scala.Double
  type long = scala.Double
}
