package typingsJapgolly.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /**
    * A boolean value that, if true, indicates that major version upgrades will be applied automatically to the cluster during the maintenance window. 
    */
  var AllowVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator).
    */
  var AquaConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.AquaConfiguration] = js.undefined
  
  /**
    * The number of days that automatic cluster snapshots are retained.
    */
  var AutomatedSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the Availability Zone in which the cluster is located.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the status of the Availability Zone relocation operation.
    */
  var AvailabilityZoneRelocationStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The availability status of the cluster for queries. Possible values are the following:   Available - The cluster is available for queries.    Unavailable - The cluster is not available for queries.   Maintenance - The cluster is intermittently available for queries due to maintenance activities.   Modifying - The cluster is intermittently available for queries due to changes that modify the cluster.   Failed - The cluster failed and is not available for queries.  
    */
  var ClusterAvailabilityStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the cluster was created.
    */
  var ClusterCreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier of the cluster.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The namespace Amazon Resource Name (ARN) of the cluster.
    */
  var ClusterNamespaceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The nodes in the cluster.
    */
  var ClusterNodes: js.UndefOr[ClusterNodesList] = js.undefined
  
  /**
    * The list of cluster parameter groups that are associated with this cluster. Each parameter group in the list is returned with its status.
    */
  var ClusterParameterGroups: js.UndefOr[ClusterParameterGroupStatusList] = js.undefined
  
  /**
    * The public key for the cluster.
    */
  var ClusterPublicKey: js.UndefOr[String] = js.undefined
  
  /**
    * The specific revision number of the database in the cluster.
    */
  var ClusterRevisionNumber: js.UndefOr[String] = js.undefined
  
  /**
    * A list of cluster security group that are associated with the cluster. Each security group is represented by an element that contains ClusterSecurityGroup.Name and ClusterSecurityGroup.Status subelements.  Cluster security groups are used when the cluster is not created in an Amazon Virtual Private Cloud (VPC). Clusters that are created in a VPC use VPC security groups, which are listed by the VpcSecurityGroups parameter. 
    */
  var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupMembershipList] = js.undefined
  
  /**
    * A value that returns the destination region and retention period that are configured for cross-region snapshot copy.
    */
  var ClusterSnapshotCopyStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.ClusterSnapshotCopyStatus] = js.undefined
  
  /**
    *  The current state of the cluster. Possible values are the following:    available     available, prep-for-resize     available, resize-cleanup     cancelling-resize     creating     deleting     final-snapshot     hardware-failure     incompatible-hsm     incompatible-network     incompatible-parameters     incompatible-restore     modifying     paused     rebooting     renaming     resizing     rotating-keys     storage-full     updating-hsm   
    */
  var ClusterStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the subnet group that is associated with the cluster. This parameter is valid only when the cluster is in a VPC.
    */
  var ClusterSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The version ID of the Amazon Redshift engine that is running on the cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the initial database that was created when the cluster was created. This same name is returned for the life of the cluster. If an initial database was not specified, a database named devdev was created by default. 
    */
  var DBName: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var DataTransferProgress: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.DataTransferProgress] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the IAM role set as default for the cluster.
    */
  var DefaultIamRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Describes a group of DeferredMaintenanceWindow objects.
    */
  var DeferredMaintenanceWindows: js.UndefOr[DeferredMaintenanceWindowsList] = js.undefined
  
  /**
    * The status of the elastic IP (EIP) address.
    */
  var ElasticIpStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.ElasticIpStatus] = js.undefined
  
  /**
    * The number of nodes that you can resize the cluster to with the elastic resize method. 
    */
  var ElasticResizeNumberOfNodeOptions: js.UndefOr[String] = js.undefined
  
  /**
    * A boolean value that, if true, indicates that data in the cluster is encrypted at rest.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The connection endpoint.
    */
  var Endpoint: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.Endpoint] = js.undefined
  
  /**
    * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
    */
  var EnhancedVpcRouting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time when the next snapshot is expected to be taken for clusters with a valid snapshot schedule and backups enabled. 
    */
  var ExpectedNextSnapshotScheduleTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The status of next expected snapshot for clusters having a valid snapshot schedule and backups enabled. Possible values are the following:   OnTrack - The next snapshot is expected to be taken on time.    Pending - The next snapshot is pending to be taken.   
    */
  var ExpectedNextSnapshotScheduleTimeStatus: js.UndefOr[String] = js.undefined
  
  /**
    * A value that reports whether the Amazon Redshift cluster has finished applying any hardware security module (HSM) settings changes specified in a modify cluster command. Values: active, applying
    */
  var HsmStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.HsmStatus] = js.undefined
  
  /**
    * A list of Identity and Access Management (IAM) roles that can be used by the cluster to access other Amazon Web Services services.
    */
  var IamRoles: js.UndefOr[ClusterIamRoleList] = js.undefined
  
  /**
    * The Key Management Service (KMS) key ID of the encryption key used to encrypt data in the cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the maintenance track for the cluster.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.undefined
  
  /**
    * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the retention period of existing snapshots. The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The admin user name for the cluster. This name is used to connect to the database that is specified in the DBName parameter. 
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  
  /**
    * The status of a modify operation, if any, initiated for the cluster.
    */
  var ModifyStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time in UTC when system maintenance can begin.
    */
  var NextMaintenanceWindowStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The node type for the nodes in the cluster.
    */
  var NodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The number of compute nodes in the cluster.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.undefined
  
  /**
    * Cluster operations that are waiting to be started.
    */
  var PendingActions: js.UndefOr[PendingActionsList] = js.undefined
  
  /**
    * A value that, if present, indicates that changes to the cluster are pending. Specific pending changes are identified by subelements.
    */
  var PendingModifiedValues: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.PendingModifiedValues] = js.undefined
  
  /**
    * The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * A boolean value that, if true, indicates that the cluster can be accessed from a public network.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The status of the reserved-node exchange request. Statuses include in-progress and requested.
    */
  var ReservedNodeExchangeStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.ReservedNodeExchangeStatus] = js.undefined
  
  /**
    * Returns the following:   AllowCancelResize: a boolean value indicating if the resize operation can be cancelled.   ResizeType: Returns ClassicResize  
    */
  var ResizeInfo: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.ResizeInfo] = js.undefined
  
  /**
    * A value that describes the status of a cluster restore action. This parameter returns null if the cluster was not created by restoring a snapshot.
    */
  var RestoreStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.RestoreStatus] = js.undefined
  
  /**
    * A unique identifier for the cluster snapshot schedule.
    */
  var SnapshotScheduleIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the cluster snapshot schedule.
    */
  var SnapshotScheduleState: js.UndefOr[ScheduleState] = js.undefined
  
  /**
    * The list of tags for the cluster.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The total storage capacity of the cluster in megabytes. 
    */
  var TotalStorageCapacityInMegaBytes: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * The identifier of the VPC the cluster is in, if the cluster is in a VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that are associated with the cluster. This parameter is returned only if the cluster is in a VPC.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
}
object Cluster {
  
  inline def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  extension [Self <: Cluster](x: Self) {
    
    inline def setAllowVersionUpgrade(value: Boolean): Self = StObject.set(x, "AllowVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAllowVersionUpgradeUndefined: Self = StObject.set(x, "AllowVersionUpgrade", js.undefined)
    
    inline def setAquaConfiguration(value: AquaConfiguration): Self = StObject.set(x, "AquaConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAquaConfigurationUndefined: Self = StObject.set(x, "AquaConfiguration", js.undefined)
    
    inline def setAutomatedSnapshotRetentionPeriod(value: Integer): Self = StObject.set(x, "AutomatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setAutomatedSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "AutomatedSnapshotRetentionPeriod", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneRelocationStatus(value: String): Self = StObject.set(x, "AvailabilityZoneRelocationStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneRelocationStatusUndefined: Self = StObject.set(x, "AvailabilityZoneRelocationStatus", js.undefined)
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setClusterAvailabilityStatus(value: String): Self = StObject.set(x, "ClusterAvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setClusterAvailabilityStatusUndefined: Self = StObject.set(x, "ClusterAvailabilityStatus", js.undefined)
    
    inline def setClusterCreateTime(value: js.Date): Self = StObject.set(x, "ClusterCreateTime", value.asInstanceOf[js.Any])
    
    inline def setClusterCreateTimeUndefined: Self = StObject.set(x, "ClusterCreateTime", js.undefined)
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setClusterNamespaceArn(value: String): Self = StObject.set(x, "ClusterNamespaceArn", value.asInstanceOf[js.Any])
    
    inline def setClusterNamespaceArnUndefined: Self = StObject.set(x, "ClusterNamespaceArn", js.undefined)
    
    inline def setClusterNodes(value: ClusterNodesList): Self = StObject.set(x, "ClusterNodes", value.asInstanceOf[js.Any])
    
    inline def setClusterNodesUndefined: Self = StObject.set(x, "ClusterNodes", js.undefined)
    
    inline def setClusterNodesVarargs(value: ClusterNode*): Self = StObject.set(x, "ClusterNodes", js.Array(value*))
    
    inline def setClusterParameterGroups(value: ClusterParameterGroupStatusList): Self = StObject.set(x, "ClusterParameterGroups", value.asInstanceOf[js.Any])
    
    inline def setClusterParameterGroupsUndefined: Self = StObject.set(x, "ClusterParameterGroups", js.undefined)
    
    inline def setClusterParameterGroupsVarargs(value: ClusterParameterGroupStatus*): Self = StObject.set(x, "ClusterParameterGroups", js.Array(value*))
    
    inline def setClusterPublicKey(value: String): Self = StObject.set(x, "ClusterPublicKey", value.asInstanceOf[js.Any])
    
    inline def setClusterPublicKeyUndefined: Self = StObject.set(x, "ClusterPublicKey", js.undefined)
    
    inline def setClusterRevisionNumber(value: String): Self = StObject.set(x, "ClusterRevisionNumber", value.asInstanceOf[js.Any])
    
    inline def setClusterRevisionNumberUndefined: Self = StObject.set(x, "ClusterRevisionNumber", js.undefined)
    
    inline def setClusterSecurityGroups(value: ClusterSecurityGroupMembershipList): Self = StObject.set(x, "ClusterSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setClusterSecurityGroupsUndefined: Self = StObject.set(x, "ClusterSecurityGroups", js.undefined)
    
    inline def setClusterSecurityGroupsVarargs(value: ClusterSecurityGroupMembership*): Self = StObject.set(x, "ClusterSecurityGroups", js.Array(value*))
    
    inline def setClusterSnapshotCopyStatus(value: ClusterSnapshotCopyStatus): Self = StObject.set(x, "ClusterSnapshotCopyStatus", value.asInstanceOf[js.Any])
    
    inline def setClusterSnapshotCopyStatusUndefined: Self = StObject.set(x, "ClusterSnapshotCopyStatus", js.undefined)
    
    inline def setClusterStatus(value: String): Self = StObject.set(x, "ClusterStatus", value.asInstanceOf[js.Any])
    
    inline def setClusterStatusUndefined: Self = StObject.set(x, "ClusterStatus", js.undefined)
    
    inline def setClusterSubnetGroupName(value: String): Self = StObject.set(x, "ClusterSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setClusterSubnetGroupNameUndefined: Self = StObject.set(x, "ClusterSubnetGroupName", js.undefined)
    
    inline def setClusterVersion(value: String): Self = StObject.set(x, "ClusterVersion", value.asInstanceOf[js.Any])
    
    inline def setClusterVersionUndefined: Self = StObject.set(x, "ClusterVersion", js.undefined)
    
    inline def setDBName(value: String): Self = StObject.set(x, "DBName", value.asInstanceOf[js.Any])
    
    inline def setDBNameUndefined: Self = StObject.set(x, "DBName", js.undefined)
    
    inline def setDataTransferProgress(value: DataTransferProgress): Self = StObject.set(x, "DataTransferProgress", value.asInstanceOf[js.Any])
    
    inline def setDataTransferProgressUndefined: Self = StObject.set(x, "DataTransferProgress", js.undefined)
    
    inline def setDefaultIamRoleArn(value: String): Self = StObject.set(x, "DefaultIamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDefaultIamRoleArnUndefined: Self = StObject.set(x, "DefaultIamRoleArn", js.undefined)
    
    inline def setDeferredMaintenanceWindows(value: DeferredMaintenanceWindowsList): Self = StObject.set(x, "DeferredMaintenanceWindows", value.asInstanceOf[js.Any])
    
    inline def setDeferredMaintenanceWindowsUndefined: Self = StObject.set(x, "DeferredMaintenanceWindows", js.undefined)
    
    inline def setDeferredMaintenanceWindowsVarargs(value: DeferredMaintenanceWindow*): Self = StObject.set(x, "DeferredMaintenanceWindows", js.Array(value*))
    
    inline def setElasticIpStatus(value: ElasticIpStatus): Self = StObject.set(x, "ElasticIpStatus", value.asInstanceOf[js.Any])
    
    inline def setElasticIpStatusUndefined: Self = StObject.set(x, "ElasticIpStatus", js.undefined)
    
    inline def setElasticResizeNumberOfNodeOptions(value: String): Self = StObject.set(x, "ElasticResizeNumberOfNodeOptions", value.asInstanceOf[js.Any])
    
    inline def setElasticResizeNumberOfNodeOptionsUndefined: Self = StObject.set(x, "ElasticResizeNumberOfNodeOptions", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setEnhancedVpcRouting(value: Boolean): Self = StObject.set(x, "EnhancedVpcRouting", value.asInstanceOf[js.Any])
    
    inline def setEnhancedVpcRoutingUndefined: Self = StObject.set(x, "EnhancedVpcRouting", js.undefined)
    
    inline def setExpectedNextSnapshotScheduleTime(value: js.Date): Self = StObject.set(x, "ExpectedNextSnapshotScheduleTime", value.asInstanceOf[js.Any])
    
    inline def setExpectedNextSnapshotScheduleTimeStatus(value: String): Self = StObject.set(x, "ExpectedNextSnapshotScheduleTimeStatus", value.asInstanceOf[js.Any])
    
    inline def setExpectedNextSnapshotScheduleTimeStatusUndefined: Self = StObject.set(x, "ExpectedNextSnapshotScheduleTimeStatus", js.undefined)
    
    inline def setExpectedNextSnapshotScheduleTimeUndefined: Self = StObject.set(x, "ExpectedNextSnapshotScheduleTime", js.undefined)
    
    inline def setHsmStatus(value: HsmStatus): Self = StObject.set(x, "HsmStatus", value.asInstanceOf[js.Any])
    
    inline def setHsmStatusUndefined: Self = StObject.set(x, "HsmStatus", js.undefined)
    
    inline def setIamRoles(value: ClusterIamRoleList): Self = StObject.set(x, "IamRoles", value.asInstanceOf[js.Any])
    
    inline def setIamRolesUndefined: Self = StObject.set(x, "IamRoles", js.undefined)
    
    inline def setIamRolesVarargs(value: ClusterIamRole*): Self = StObject.set(x, "IamRoles", js.Array(value*))
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMaintenanceTrackName(value: String): Self = StObject.set(x, "MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceTrackNameUndefined: Self = StObject.set(x, "MaintenanceTrackName", js.undefined)
    
    inline def setManualSnapshotRetentionPeriod(value: Integer): Self = StObject.set(x, "ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setManualSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "ManualSnapshotRetentionPeriod", js.undefined)
    
    inline def setMasterUsername(value: String): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    inline def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    inline def setModifyStatus(value: String): Self = StObject.set(x, "ModifyStatus", value.asInstanceOf[js.Any])
    
    inline def setModifyStatusUndefined: Self = StObject.set(x, "ModifyStatus", js.undefined)
    
    inline def setNextMaintenanceWindowStartTime(value: js.Date): Self = StObject.set(x, "NextMaintenanceWindowStartTime", value.asInstanceOf[js.Any])
    
    inline def setNextMaintenanceWindowStartTimeUndefined: Self = StObject.set(x, "NextMaintenanceWindowStartTime", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setNumberOfNodes(value: Integer): Self = StObject.set(x, "NumberOfNodes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNodesUndefined: Self = StObject.set(x, "NumberOfNodes", js.undefined)
    
    inline def setPendingActions(value: PendingActionsList): Self = StObject.set(x, "PendingActions", value.asInstanceOf[js.Any])
    
    inline def setPendingActionsUndefined: Self = StObject.set(x, "PendingActions", js.undefined)
    
    inline def setPendingActionsVarargs(value: String*): Self = StObject.set(x, "PendingActions", js.Array(value*))
    
    inline def setPendingModifiedValues(value: PendingModifiedValues): Self = StObject.set(x, "PendingModifiedValues", value.asInstanceOf[js.Any])
    
    inline def setPendingModifiedValuesUndefined: Self = StObject.set(x, "PendingModifiedValues", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    inline def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    inline def setReservedNodeExchangeStatus(value: ReservedNodeExchangeStatus): Self = StObject.set(x, "ReservedNodeExchangeStatus", value.asInstanceOf[js.Any])
    
    inline def setReservedNodeExchangeStatusUndefined: Self = StObject.set(x, "ReservedNodeExchangeStatus", js.undefined)
    
    inline def setResizeInfo(value: ResizeInfo): Self = StObject.set(x, "ResizeInfo", value.asInstanceOf[js.Any])
    
    inline def setResizeInfoUndefined: Self = StObject.set(x, "ResizeInfo", js.undefined)
    
    inline def setRestoreStatus(value: RestoreStatus): Self = StObject.set(x, "RestoreStatus", value.asInstanceOf[js.Any])
    
    inline def setRestoreStatusUndefined: Self = StObject.set(x, "RestoreStatus", js.undefined)
    
    inline def setSnapshotScheduleIdentifier(value: String): Self = StObject.set(x, "SnapshotScheduleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSnapshotScheduleIdentifierUndefined: Self = StObject.set(x, "SnapshotScheduleIdentifier", js.undefined)
    
    inline def setSnapshotScheduleState(value: ScheduleState): Self = StObject.set(x, "SnapshotScheduleState", value.asInstanceOf[js.Any])
    
    inline def setSnapshotScheduleStateUndefined: Self = StObject.set(x, "SnapshotScheduleState", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTotalStorageCapacityInMegaBytes(value: LongOptional): Self = StObject.set(x, "TotalStorageCapacityInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalStorageCapacityInMegaBytesUndefined: Self = StObject.set(x, "TotalStorageCapacityInMegaBytes", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    inline def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = StObject.set(x, "VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupsUndefined: Self = StObject.set(x, "VpcSecurityGroups", js.undefined)
    
    inline def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = StObject.set(x, "VpcSecurityGroups", js.Array(value*))
  }
}
