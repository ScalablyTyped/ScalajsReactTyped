package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsxMod {
  type AWSAccountId = java.lang.String
  type ActiveDirectoryFullyQualifiedName = java.lang.String
  type ArchivePath = java.lang.String
  type AutomaticBackupRetentionDays = scala.Double
  type BackupId = java.lang.String
  type BackupIds = js.Array[typingsJapgolly.awsSdk.fsxMod.BackupId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type BackupLifecycle = typingsJapgolly.awsSdk.fsxMod._BackupLifecycle | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATIC
    - typingsJapgolly.awsSdk.awsSdkStrings.USER_INITIATED
    - java.lang.String
  */
  type BackupType = typingsJapgolly.awsSdk.fsxMod._BackupType | java.lang.String
  type Backups = js.Array[typingsJapgolly.awsSdk.fsxMod.Backup]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.fsxMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CreationTime = js.Date
  type DNSName = java.lang.String
  type DailyTime = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`file-system-id`
    - typingsJapgolly.awsSdk.awsSdkStrings.`task-lifecycle`
    - java.lang.String
  */
  type DataRepositoryTaskFilterName = typingsJapgolly.awsSdk.fsxMod._DataRepositoryTaskFilterName | java.lang.String
  type DataRepositoryTaskFilterValue = java.lang.String
  type DataRepositoryTaskFilterValues = js.Array[typingsJapgolly.awsSdk.fsxMod.DataRepositoryTaskFilterValue]
  type DataRepositoryTaskFilters = js.Array[typingsJapgolly.awsSdk.fsxMod.DataRepositoryTaskFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELING
    - java.lang.String
  */
  type DataRepositoryTaskLifecycle = typingsJapgolly.awsSdk.fsxMod._DataRepositoryTaskLifecycle | java.lang.String
  type DataRepositoryTaskPath = java.lang.String
  type DataRepositoryTaskPaths = js.Array[typingsJapgolly.awsSdk.fsxMod.DataRepositoryTaskPath]
  type DataRepositoryTaskType = typingsJapgolly.awsSdk.awsSdkStrings.EXPORT_TO_REPOSITORY | java.lang.String
  type DataRepositoryTasks = js.Array[typingsJapgolly.awsSdk.fsxMod.DataRepositoryTask]
  type DirectoryId = java.lang.String
  type DirectoryPassword = java.lang.String
  type DirectoryUserName = java.lang.String
  type DnsIps = js.Array[typingsJapgolly.awsSdk.fsxMod.IpAddress]
  type EndTime = js.Date
  type ErrorMessage = java.lang.String
  type FailedCount = scala.Double
  type FileSystemAdministratorsGroupName = java.lang.String
  type FileSystemId = java.lang.String
  type FileSystemIds = js.Array[typingsJapgolly.awsSdk.fsxMod.FileSystemId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.MISCONFIGURED
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type FileSystemLifecycle = typingsJapgolly.awsSdk.fsxMod._FileSystemLifecycle | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PATCHING
    - typingsJapgolly.awsSdk.awsSdkStrings.BACKING_UP
    - java.lang.String
  */
  type FileSystemMaintenanceOperation = typingsJapgolly.awsSdk.fsxMod._FileSystemMaintenanceOperation | java.lang.String
  type FileSystemMaintenanceOperations = js.Array[typingsJapgolly.awsSdk.fsxMod.FileSystemMaintenanceOperation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS
    - typingsJapgolly.awsSdk.awsSdkStrings.LUSTRE
    - java.lang.String
  */
  type FileSystemType = typingsJapgolly.awsSdk.fsxMod._FileSystemType | java.lang.String
  type FileSystems = js.Array[typingsJapgolly.awsSdk.fsxMod.FileSystem]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`file-system-id`
    - typingsJapgolly.awsSdk.awsSdkStrings.`backup-type`
    - java.lang.String
  */
  type FilterName = typingsJapgolly.awsSdk.fsxMod._FilterName | java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[typingsJapgolly.awsSdk.fsxMod.FilterValue]
  type Filters = js.Array[typingsJapgolly.awsSdk.fsxMod.Filter]
  type Flag = scala.Boolean
  type IpAddress = java.lang.String
  type KmsKeyId = java.lang.String
  type LastUpdatedTime = js.Date
  type MaxResults = scala.Double
  type Megabytes = scala.Double
  type MegabytesPerSecond = scala.Double
  type NetworkInterfaceId = java.lang.String
  type NetworkInterfaceIds = js.Array[typingsJapgolly.awsSdk.fsxMod.NetworkInterfaceId]
  type NextToken = java.lang.String
  type OrganizationalUnitDistinguishedName = java.lang.String
  type ProgressPercent = scala.Double
  type ReportFormat = typingsJapgolly.awsSdk.awsSdkStrings.REPORT_CSV_20191124 | java.lang.String
  type ReportScope = typingsJapgolly.awsSdk.awsSdkStrings.FAILED_FILES_ONLY | java.lang.String
  type ResourceARN = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[typingsJapgolly.awsSdk.fsxMod.SecurityGroupId]
  type StartTime = js.Date
  type StorageCapacity = scala.Double
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typingsJapgolly.awsSdk.fsxMod.SubnetId]
  type SucceededCount = scala.Double
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsJapgolly.awsSdk.fsxMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.fsxMod.Tag]
  type TaskId = java.lang.String
  type TaskIds = js.Array[typingsJapgolly.awsSdk.fsxMod.TaskId]
  type TotalCount = scala.Double
  type VpcId = java.lang.String
  type WeeklyTime = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MULTI_AZ_1
    - typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_AZ_1
    - java.lang.String
  */
  type WindowsDeploymentType = typingsJapgolly.awsSdk.fsxMod._WindowsDeploymentType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-03-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.fsxMod._apiVersion | java.lang.String
}
