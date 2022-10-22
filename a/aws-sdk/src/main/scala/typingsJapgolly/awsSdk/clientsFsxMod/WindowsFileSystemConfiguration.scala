package typingsJapgolly.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsFileSystemConfiguration extends StObject {
  
  /**
    * The ID for an existing Amazon Web Services Managed Microsoft Active Directory instance that the file system is joined to.
    */
  var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined
  
  var Aliases: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.Aliases] = js.undefined
  
  /**
    * The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of files, folders, and file shares on the Amazon FSx for Windows File Server file system.
    */
  var AuditLogConfiguration: js.UndefOr[WindowsAuditLogConfiguration] = js.undefined
  
  /**
    * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
    */
  var AutomaticBackupRetentionDays: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.AutomaticBackupRetentionDays] = js.undefined
  
  /**
    * A boolean flag indicating whether tags on the file system should be copied to backups. This value defaults to false. If it's set to true, all tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.undefined
  
  /**
    * The preferred time to take daily automatic backups, in the UTC time zone.
    */
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  
  /**
    * Specifies the file system deployment type, valid values are the following:    MULTI_AZ_1 - Specifies a high availability file system that is configured for Multi-AZ redundancy to tolerate temporary Availability Zone (AZ) unavailability, and supports SSD and HDD storage.    SINGLE_AZ_1 - (Default) Specifies a file system that is configured for single AZ redundancy, only supports SSD storage.    SINGLE_AZ_2 - Latest generation Single AZ file system. Specifies a file system that is configured for single AZ redundancy and supports SSD and HDD storage.   For more information, see Single-AZ and Multi-AZ File Systems.
    */
  var DeploymentType: js.UndefOr[WindowsDeploymentType] = js.undefined
  
  /**
    * The list of maintenance operations in progress for this file system.
    */
  var MaintenanceOperationsInProgress: js.UndefOr[FileSystemMaintenanceOperations] = js.undefined
  
  /**
    * For MULTI_AZ_1 deployment types, the IP address of the primary, or preferred, file server. Use this IP address when mounting the file system on Linux SMB clients or Windows SMB clients that are not joined to a Microsoft Active Directory. Applicable for all Windows file system deployment types. This IP address is temporarily unavailable when the file system is undergoing maintenance. For Linux and Windows SMB clients that are joined to an Active Directory, use the file system's DNSName instead. For more information on mapping and mounting file shares, see Accessing File Shares.
    */
  var PreferredFileServerIp: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * For MULTI_AZ_1 deployment types, it specifies the ID of the subnet where the preferred file server is located. Must be one of the two subnet IDs specified in SubnetIds property. Amazon FSx serves traffic from this subnet except in the event of a failover to the secondary file server. For SINGLE_AZ_1 and SINGLE_AZ_2 deployment types, this value is the same as that for SubnetIDs. For more information, see Availability and durability: Single-AZ and Multi-AZ file systems.
    */
  var PreferredSubnetId: js.UndefOr[SubnetId] = js.undefined
  
  /**
    * For MULTI_AZ_1 deployment types, use this endpoint when performing administrative tasks on the file system using Amazon FSx Remote PowerShell. For SINGLE_AZ_1 and SINGLE_AZ_2 deployment types, this is the DNS name of the file system. This endpoint is temporarily unavailable when the file system is undergoing maintenance.
    */
  var RemoteAdministrationEndpoint: js.UndefOr[DNSName] = js.undefined
  
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryAttributes] = js.undefined
  
  /**
    * The throughput of the Amazon FSx file system, measured in megabytes per second.
    */
  var ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined
  
  /**
    * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}
object WindowsFileSystemConfiguration {
  
  inline def apply(): WindowsFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsFileSystemConfiguration]
  }
  
  extension [Self <: WindowsFileSystemConfiguration](x: Self) {
    
    inline def setActiveDirectoryId(value: DirectoryId): Self = StObject.set(x, "ActiveDirectoryId", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryIdUndefined: Self = StObject.set(x, "ActiveDirectoryId", js.undefined)
    
    inline def setAliases(value: Aliases): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    inline def setAliasesVarargs(value: Alias*): Self = StObject.set(x, "Aliases", js.Array(value*))
    
    inline def setAuditLogConfiguration(value: WindowsAuditLogConfiguration): Self = StObject.set(x, "AuditLogConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAuditLogConfigurationUndefined: Self = StObject.set(x, "AuditLogConfiguration", js.undefined)
    
    inline def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = StObject.set(x, "AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "AutomaticBackupRetentionDays", js.undefined)
    
    inline def setCopyTagsToBackups(value: Flag): Self = StObject.set(x, "CopyTagsToBackups", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToBackupsUndefined: Self = StObject.set(x, "CopyTagsToBackups", js.undefined)
    
    inline def setDailyAutomaticBackupStartTime(value: DailyTime): Self = StObject.set(x, "DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    
    inline def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "DailyAutomaticBackupStartTime", js.undefined)
    
    inline def setDeploymentType(value: WindowsDeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTypeUndefined: Self = StObject.set(x, "DeploymentType", js.undefined)
    
    inline def setMaintenanceOperationsInProgress(value: FileSystemMaintenanceOperations): Self = StObject.set(x, "MaintenanceOperationsInProgress", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceOperationsInProgressUndefined: Self = StObject.set(x, "MaintenanceOperationsInProgress", js.undefined)
    
    inline def setMaintenanceOperationsInProgressVarargs(value: FileSystemMaintenanceOperation*): Self = StObject.set(x, "MaintenanceOperationsInProgress", js.Array(value*))
    
    inline def setPreferredFileServerIp(value: IpAddress): Self = StObject.set(x, "PreferredFileServerIp", value.asInstanceOf[js.Any])
    
    inline def setPreferredFileServerIpUndefined: Self = StObject.set(x, "PreferredFileServerIp", js.undefined)
    
    inline def setPreferredSubnetId(value: SubnetId): Self = StObject.set(x, "PreferredSubnetId", value.asInstanceOf[js.Any])
    
    inline def setPreferredSubnetIdUndefined: Self = StObject.set(x, "PreferredSubnetId", js.undefined)
    
    inline def setRemoteAdministrationEndpoint(value: DNSName): Self = StObject.set(x, "RemoteAdministrationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setRemoteAdministrationEndpointUndefined: Self = StObject.set(x, "RemoteAdministrationEndpoint", js.undefined)
    
    inline def setSelfManagedActiveDirectoryConfiguration(value: SelfManagedActiveDirectoryAttributes): Self = StObject.set(x, "SelfManagedActiveDirectoryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedActiveDirectoryConfigurationUndefined: Self = StObject.set(x, "SelfManagedActiveDirectoryConfiguration", js.undefined)
    
    inline def setThroughputCapacity(value: MegabytesPerSecond): Self = StObject.set(x, "ThroughputCapacity", value.asInstanceOf[js.Any])
    
    inline def setThroughputCapacityUndefined: Self = StObject.set(x, "ThroughputCapacity", js.undefined)
    
    inline def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
