package typingsJapgolly.awsSdk.clientsFsxMod

import typingsJapgolly.awsSdk.awsSdkStrings.CACHE_1
import typingsJapgolly.awsSdk.awsSdkStrings.DELETE_CHILD_VOLUMES_AND_SNAPSHOTS
import typingsJapgolly.awsSdk.awsSdkStrings.FAILED_FILES_ONLY
import typingsJapgolly.awsSdk.awsSdkStrings.LUSTRE
import typingsJapgolly.awsSdk.awsSdkStrings.NFS3
import typingsJapgolly.awsSdk.awsSdkStrings.REPORT_CSV_20191124
import typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_AZ_1
import typingsJapgolly.awsSdk.awsSdkStrings.`file-system-id`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountId = String

type ActiveDirectoryFullyQualifiedName = String

type AdminPassword = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE_SYSTEM_UPDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.STORAGE_OPTIMIZATION
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE_SYSTEM_ALIAS_ASSOCIATION
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE_SYSTEM_ALIAS_DISASSOCIATION
  - typingsJapgolly.awsSdk.awsSdkStrings.VOLUME_UPDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.SNAPSHOT_UPDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.RELEASE_NFS_V3_LOCKS
  - java.lang.String
*/
type AdministrativeActionType = _AdministrativeActionType | String

type AdministrativeActions = js.Array[AdministrativeAction]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type AliasLifecycle = _AliasLifecycle | String

type Aliases = js.Array[Alias]

type AlternateDNSName = String

type AlternateDNSNames = js.Array[AlternateDNSName]

type ArchivePath = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.NEW
  - typingsJapgolly.awsSdk.awsSdkStrings.NEW_CHANGED
  - typingsJapgolly.awsSdk.awsSdkStrings.NEW_CHANGED_DELETED
  - java.lang.String
*/
type AutoImportPolicyType = _AutoImportPolicyType | String

type AutomaticBackupRetentionDays = Double

type BackupId = String

type BackupIds = js.Array[BackupId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.TRANSFERRING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.COPYING
  - java.lang.String
*/
type BackupLifecycle = _BackupLifecycle | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATIC
  - typingsJapgolly.awsSdk.awsSdkStrings.USER_INITIATED
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_BACKUP
  - java.lang.String
*/
type BackupType = _BackupType | String

type Backups = js.Array[Backup]

type BatchImportMetaDataOnCreate = Boolean

type CapacityToRelease = Double

type ClientRequestToken = String

type CoolingPeriod = Double

type CopyTagsToDataRepositoryAssociations = Boolean

type CreateFileCacheDataRepositoryAssociations = js.Array[FileCacheDataRepositoryAssociation]

type CreationTime = js.Date

type DNSName = String

type DailyTime = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.LZ4
  - java.lang.String
*/
type DataCompressionType = _DataCompressionType | String

type DataRepositoryAssociationId = String

type DataRepositoryAssociationIds = js.Array[DataRepositoryAssociationId]

type DataRepositoryAssociations = js.Array[DataRepositoryAssociation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.MISCONFIGURED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type DataRepositoryLifecycle = _DataRepositoryLifecycle | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`file-system-id`
  - typingsJapgolly.awsSdk.awsSdkStrings.`task-lifecycle`
  - typingsJapgolly.awsSdk.awsSdkStrings.`data-repository-association-id`
  - typingsJapgolly.awsSdk.awsSdkStrings.`file-cache-id`
  - java.lang.String
*/
type DataRepositoryTaskFilterName = _DataRepositoryTaskFilterName | String

type DataRepositoryTaskFilterValue = String

type DataRepositoryTaskFilterValues = js.Array[DataRepositoryTaskFilterValue]

type DataRepositoryTaskFilters = js.Array[DataRepositoryTaskFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELING
  - java.lang.String
*/
type DataRepositoryTaskLifecycle = _DataRepositoryTaskLifecycle | String

type DataRepositoryTaskPath = String

type DataRepositoryTaskPaths = js.Array[DataRepositoryTaskPath]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPORT_TO_REPOSITORY
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_METADATA_FROM_REPOSITORY
  - typingsJapgolly.awsSdk.awsSdkStrings.RELEASE_DATA_FROM_FILESYSTEM
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTO_RELEASE_DATA
  - java.lang.String
*/
type DataRepositoryTaskType = _DataRepositoryTaskType | String

type DataRepositoryTasks = js.Array[DataRepositoryTask]

type DeleteDataInFileSystem = Boolean

type DeleteFileSystemOpenZFSOption = DELETE_CHILD_VOLUMES_AND_SNAPSHOTS | String

type DeleteFileSystemOpenZFSOptions = js.Array[DeleteFileSystemOpenZFSOption]

type DeleteOpenZFSVolumeOption = DELETE_CHILD_VOLUMES_AND_SNAPSHOTS | String

type DeleteOpenZFSVolumeOptions = js.Array[DeleteOpenZFSVolumeOption]

type DirectoryId = String

type DirectoryPassword = String

type DirectoryUserName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATIC
  - typingsJapgolly.awsSdk.awsSdkStrings.USER_PROVISIONED
  - java.lang.String
*/
type DiskIopsConfigurationMode = _DiskIopsConfigurationMode | String

type DnsIps = js.Array[IpAddress]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.READ
  - java.lang.String
*/
type DriveCacheType = _DriveCacheType | String

type EndTime = js.Date

type ErrorMessage = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NEW
  - typingsJapgolly.awsSdk.awsSdkStrings.CHANGED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type EventType = _EventType | String

type EventTypes = js.Array[EventType]

type FailedCount = Double

type FileCacheId = String

type FileCacheIds = js.Array[FileCacheId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type FileCacheLifecycle = _FileCacheLifecycle | String

type FileCacheLustreDeploymentType = CACHE_1 | String

type FileCacheType = LUSTRE | String

type FileCaches = js.Array[FileCache]

type FileSystemAdministratorsGroupName = String

type FileSystemId = String

type FileSystemIds = js.Array[FileSystemId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.MISCONFIGURED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.MISCONFIGURED_UNAVAILABLE
  - java.lang.String
*/
type FileSystemLifecycle = _FileSystemLifecycle | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PATCHING
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKING_UP
  - java.lang.String
*/
type FileSystemMaintenanceOperation = _FileSystemMaintenanceOperation | String

type FileSystemMaintenanceOperations = js.Array[FileSystemMaintenanceOperation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS
  - typingsJapgolly.awsSdk.awsSdkStrings.LUSTRE
  - typingsJapgolly.awsSdk.awsSdkStrings.ONTAP
  - typingsJapgolly.awsSdk.awsSdkStrings.OPENZFS
  - java.lang.String
*/
type FileSystemType = _FileSystemType | String

type FileSystemTypeVersion = String

type FileSystems = js.Array[FileSystem]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`file-system-id`
  - typingsJapgolly.awsSdk.awsSdkStrings.`backup-type`
  - typingsJapgolly.awsSdk.awsSdkStrings.`file-system-type`
  - typingsJapgolly.awsSdk.awsSdkStrings.`volume-id`
  - typingsJapgolly.awsSdk.awsSdkStrings.`data-repository-type`
  - typingsJapgolly.awsSdk.awsSdkStrings.`file-cache-id`
  - typingsJapgolly.awsSdk.awsSdkStrings.`file-cache-type`
  - java.lang.String
*/
type FilterName = _FilterName | String

type FilterValue = String

type FilterValues = js.Array[FilterValue]

type Filters = js.Array[Filter]

type Flag = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.ORIGIN
  - typingsJapgolly.awsSdk.awsSdkStrings.CACHE
  - java.lang.String
*/
type FlexCacheEndpointType = _FlexCacheEndpointType | String

type GeneralARN = String

type IntegerNoMax = Double

type IntegerNoMaxFromNegativeOne = Double

type IntegerRecordSizeKiB = Double

type Iops = Double

type IpAddress = String

type IpAddressRange = String

type JunctionPath = String

type KmsKeyId = String

type LastUpdatedTime = js.Date

type LimitedMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.WARN_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.WARN_ERROR
  - java.lang.String
*/
type LustreAccessAuditLogLevel = _LustreAccessAuditLogLevel | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SCRATCH_1
  - typingsJapgolly.awsSdk.awsSdkStrings.SCRATCH_2
  - typingsJapgolly.awsSdk.awsSdkStrings.PERSISTENT_1
  - typingsJapgolly.awsSdk.awsSdkStrings.PERSISTENT_2
  - java.lang.String
*/
type LustreDeploymentType = _LustreDeploymentType | String

type LustreFileSystemMountName = String

type LustreNoSquashNid = String

type LustreNoSquashNids = js.Array[LustreNoSquashNid]

type LustreRootSquash = String

type MaxResults = Double

type Megabytes = Double

type MegabytesPerSecond = Double

type MetadataStorageCapacity = Double

type Namespace = String

type NetBiosAlias = String

type NetworkInterfaceId = String

type NetworkInterfaceIds = js.Array[NetworkInterfaceId]

type NextToken = String

type NfsVersion = NFS3 | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MULTI_AZ_1
  - typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_AZ_1
  - java.lang.String
*/
type OntapDeploymentType = _OntapDeploymentType | String

type OntapEndpointIpAddresses = js.Array[IpAddress]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RW
  - typingsJapgolly.awsSdk.awsSdkStrings.DP
  - typingsJapgolly.awsSdk.awsSdkStrings.LS
  - java.lang.String
*/
type OntapVolumeType = _OntapVolumeType | String

type OpenZFSClientConfigurations = js.Array[OpenZFSClientConfiguration]

type OpenZFSClients = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CLONE
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL_COPY
  - java.lang.String
*/
type OpenZFSCopyStrategy = _OpenZFSCopyStrategy | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.ZSTD
  - typingsJapgolly.awsSdk.awsSdkStrings.LZ4
  - java.lang.String
*/
type OpenZFSDataCompressionType = _OpenZFSDataCompressionType | String

type OpenZFSDeploymentType = SINGLE_AZ_1 | String

type OpenZFSNfsExportOption = String

type OpenZFSNfsExportOptions = js.Array[OpenZFSNfsExportOption]

type OpenZFSNfsExports = js.Array[OpenZFSNfsExport]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER
  - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
type OpenZFSQuotaType = _OpenZFSQuotaType | String

type OpenZFSUserAndGroupQuotas = js.Array[OpenZFSUserOrGroupQuota]

type OrganizationalUnitDistinguishedName = String

type PerUnitStorageThroughput = Double

type ProgressPercent = Double

type ReadOnly = Boolean

type Region = String

type ReleasedCapacity = Double

type ReportFormat = REPORT_CSV_20191124 | String

type ReportScope = FAILED_FILES_ONLY | String

type RepositoryDnsIps = js.Array[IpAddress]

type RequestTime = js.Date

type ResourceARN = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE_SYSTEM
  - typingsJapgolly.awsSdk.awsSdkStrings.VOLUME
  - java.lang.String
*/
type ResourceType = _ResourceType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_INTERMEDIATE_SNAPSHOTS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_CLONED_VOLUMES
  - java.lang.String
*/
type RestoreOpenZFSVolumeOption = _RestoreOpenZFSVolumeOption | String

type RestoreOpenZFSVolumeOptions = js.Array[RestoreOpenZFSVolumeOption]

type RouteTableId = String

type RouteTableIds = js.Array[RouteTableId]

type SecurityGroupId = String

type SecurityGroupIds = js.Array[SecurityGroupId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNIX
  - typingsJapgolly.awsSdk.awsSdkStrings.NTFS
  - typingsJapgolly.awsSdk.awsSdkStrings.MIXED
  - java.lang.String
*/
type SecurityStyle = _SecurityStyle | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`file-system-id`
  - typingsJapgolly.awsSdk.awsSdkStrings.`volume-id`
  - java.lang.String
*/
type SnapshotFilterName = _SnapshotFilterName | String

type SnapshotFilterValue = String

type SnapshotFilterValues = js.Array[SnapshotFilterValue]

type SnapshotFilters = js.Array[SnapshotFilter]

type SnapshotId = String

type SnapshotIds = js.Array[SnapshotId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - java.lang.String
*/
type SnapshotLifecycle = _SnapshotLifecycle | String

type SnapshotName = String

type Snapshots = js.Array[Snapshot]

type SourceBackupId = String

type StartTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATED_OPTIMIZING
  - java.lang.String
*/
type Status = _Status | String

type StorageCapacity = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SSD
  - typingsJapgolly.awsSdk.awsSdkStrings.HDD
  - java.lang.String
*/
type StorageType = _StorageType | String

type StorageVirtualMachineFilterName = `file-system-id` | String

type StorageVirtualMachineFilterValue = String

type StorageVirtualMachineFilterValues = js.Array[StorageVirtualMachineFilterValue]

type StorageVirtualMachineFilters = js.Array[StorageVirtualMachineFilter]

type StorageVirtualMachineId = String

type StorageVirtualMachineIds = js.Array[StorageVirtualMachineId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.MISCONFIGURED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type StorageVirtualMachineLifecycle = _StorageVirtualMachineLifecycle | String

type StorageVirtualMachineName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNIX
  - typingsJapgolly.awsSdk.awsSdkStrings.NTFS
  - typingsJapgolly.awsSdk.awsSdkStrings.MIXED
  - java.lang.String
*/
type StorageVirtualMachineRootVolumeSecurityStyle = _StorageVirtualMachineRootVolumeSecurityStyle | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.DP_DESTINATION
  - typingsJapgolly.awsSdk.awsSdkStrings.SYNC_DESTINATION
  - typingsJapgolly.awsSdk.awsSdkStrings.SYNC_SOURCE
  - java.lang.String
*/
type StorageVirtualMachineSubtype = _StorageVirtualMachineSubtype | String

type StorageVirtualMachines = js.Array[StorageVirtualMachine]

type SubDirectoriesPaths = js.Array[Namespace]

type SubnetId = String

type SubnetIds = js.Array[SubnetId]

type SucceededCount = Double

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type Tags = js.Array[Tag]

type TaskId = String

type TaskIds = js.Array[TaskId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SNAPSHOT_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTO
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type TieringPolicyName = _TieringPolicyName | String

type TotalCount = Double

type UUID = String

type VolumeCapacity = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`file-system-id`
  - typingsJapgolly.awsSdk.awsSdkStrings.`storage-virtual-machine-id`
  - java.lang.String
*/
type VolumeFilterName = _VolumeFilterName | String

type VolumeFilterValue = String

type VolumeFilterValues = js.Array[VolumeFilterValue]

type VolumeFilters = js.Array[VolumeFilter]

type VolumeId = String

type VolumeIds = js.Array[VolumeId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.MISCONFIGURED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - java.lang.String
*/
type VolumeLifecycle = _VolumeLifecycle | String

type VolumeName = String

type VolumePath = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ONTAP
  - typingsJapgolly.awsSdk.awsSdkStrings.OPENZFS
  - java.lang.String
*/
type VolumeType = _VolumeType | String

type Volumes = js.Array[Volume]

type VpcId = String

type WeeklyTime = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILURE_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS_AND_FAILURE
  - java.lang.String
*/
type WindowsAccessAuditLogLevel = _WindowsAccessAuditLogLevel | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MULTI_AZ_1
  - typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_AZ_1
  - typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_AZ_2
  - java.lang.String
*/
type WindowsDeploymentType = _WindowsDeploymentType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-03-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
