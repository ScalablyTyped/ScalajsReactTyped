package typingsJapgolly.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OntapFileSystemConfiguration extends StObject {
  
  var AutomaticBackupRetentionDays: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.AutomaticBackupRetentionDays] = js.undefined
  
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  
  /**
    * Specifies the FSx for ONTAP file system deployment type in use in the file system.     MULTI_AZ_1 - (Default) A high availability file system configured for Multi-AZ redundancy to tolerate temporary Availability Zone (AZ) unavailability.     SINGLE_AZ_1 - A file system configured for Single-AZ redundancy.   For information about the use cases for Multi-AZ and Single-AZ deployments, refer to Choosing Multi-AZ or Single-AZ file system deployment. 
    */
  var DeploymentType: js.UndefOr[OntapDeploymentType] = js.undefined
  
  /**
    * The SSD IOPS configuration for the ONTAP file system, specifying the number of provisioned IOPS and the provision mode.
    */
  var DiskIopsConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.DiskIopsConfiguration] = js.undefined
  
  /**
    * (Multi-AZ only) The IP address range in which the endpoints to access your file system are created.  The Endpoint IP address range you select for your file system must exist outside the VPC's CIDR range and must be at least /30 or larger. If you do not specify this optional parameter, Amazon FSx will automatically select a CIDR block for you. 
    */
  var EndpointIpAddressRange: js.UndefOr[IpAddressRange] = js.undefined
  
  /**
    * The Management and Intercluster endpoints that are used to access data or to manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror.
    */
  var Endpoints: js.UndefOr[FileSystemEndpoints] = js.undefined
  
  var PreferredSubnetId: js.UndefOr[SubnetId] = js.undefined
  
  /**
    * (Multi-AZ only) The VPC route tables in which your file system's endpoints are created.
    */
  var RouteTableIds: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.RouteTableIds] = js.undefined
  
  var ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined
  
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}
object OntapFileSystemConfiguration {
  
  inline def apply(): OntapFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OntapFileSystemConfiguration]
  }
  
  extension [Self <: OntapFileSystemConfiguration](x: Self) {
    
    inline def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = StObject.set(x, "AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "AutomaticBackupRetentionDays", js.undefined)
    
    inline def setDailyAutomaticBackupStartTime(value: DailyTime): Self = StObject.set(x, "DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    
    inline def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "DailyAutomaticBackupStartTime", js.undefined)
    
    inline def setDeploymentType(value: OntapDeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTypeUndefined: Self = StObject.set(x, "DeploymentType", js.undefined)
    
    inline def setDiskIopsConfiguration(value: DiskIopsConfiguration): Self = StObject.set(x, "DiskIopsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDiskIopsConfigurationUndefined: Self = StObject.set(x, "DiskIopsConfiguration", js.undefined)
    
    inline def setEndpointIpAddressRange(value: IpAddressRange): Self = StObject.set(x, "EndpointIpAddressRange", value.asInstanceOf[js.Any])
    
    inline def setEndpointIpAddressRangeUndefined: Self = StObject.set(x, "EndpointIpAddressRange", js.undefined)
    
    inline def setEndpoints(value: FileSystemEndpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setPreferredSubnetId(value: SubnetId): Self = StObject.set(x, "PreferredSubnetId", value.asInstanceOf[js.Any])
    
    inline def setPreferredSubnetIdUndefined: Self = StObject.set(x, "PreferredSubnetId", js.undefined)
    
    inline def setRouteTableIds(value: RouteTableIds): Self = StObject.set(x, "RouteTableIds", value.asInstanceOf[js.Any])
    
    inline def setRouteTableIdsUndefined: Self = StObject.set(x, "RouteTableIds", js.undefined)
    
    inline def setRouteTableIdsVarargs(value: RouteTableId*): Self = StObject.set(x, "RouteTableIds", js.Array(value*))
    
    inline def setThroughputCapacity(value: MegabytesPerSecond): Self = StObject.set(x, "ThroughputCapacity", value.asInstanceOf[js.Any])
    
    inline def setThroughputCapacityUndefined: Self = StObject.set(x, "ThroughputCapacity", js.undefined)
    
    inline def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
