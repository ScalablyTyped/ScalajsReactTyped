package typingsJapgolly.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplicationGroupMessage extends js.Object {
  /**
    * A flag that enables encryption at rest when set to true. You cannot modify the value of AtRestEncryptionEnabled after the replication group is created. To enable encryption at rest on a replication group you must set AtRestEncryptionEnabled to true when you create the replication group.   Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later. Default: false 
    */
  var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    *  Reserved parameter. The password used to access a password protected server.  AuthToken can be specified only on replication groups where TransitEncryptionEnabled is true.  For HIPAA compliance, you must specify TransitEncryptionEnabled as true, an AuthToken, and a CacheSubnetGroup.  Password constraints:   Must be only printable ASCII characters.   Must be at least 16 characters and no more than 128 characters in length.   The only permitted printable special characters are !, &amp;, #, $, ^, &lt;, &gt;, and -. Other printable special characters cannot be used in the AUTH token.   For more information, see AUTH password at http://redis.io/commands/AUTH.
    */
  var AuthToken: js.UndefOr[String] = js.native
  /**
    * This parameter is currently disabled.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  /**
    * Specifies whether a read-only replica is automatically promoted to read/write primary if the existing primary fails. If true, Multi-AZ is enabled for this replication group. If false, Multi-AZ is disabled for this replication group.  AutomaticFailoverEnabled must be enabled for Redis (cluster mode enabled) replication groups. Default: false Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:   Redis versions earlier than 2.8.6.   Redis (cluster mode disabled): T1 node types.   Redis (cluster mode enabled): T1 node types.  
    */
  var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    * The compute and memory capacity of the nodes in the node group (shard). The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   M5 node types: cache.m5.large, cache.m5.xlarge, cache.m5.2xlarge, cache.m5.4xlarge, cache.m5.12xlarge, cache.m5.24xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R5 node types: cache.r5.large, cache.r5.xlarge, cache.r5.2xlarge, cache.r5.4xlarge, cache.r5.12xlarge, cache.r5.24xlarge   R4 node types: cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge       Additional node type info    All current generation instance types are created in Amazon VPC by default.   Redis append-only files (AOF) are not supported for T1 or T2 instances.   Redis Multi-AZ with automatic failover is not supported on T1 instances.   Redis configuration variables appendonly and appendfsync are not supported on Redis version 2.8.22 and later.  
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  /**
    * The name of the parameter group to associate with this replication group. If this argument is omitted, the default cache parameter group for the specified engine is used.  If you are restoring to an engine version that is different than the original, you must specify the default version of that version. For example, CacheParameterGroupName=default.redis4.0.  If you are running Redis version 3.2.4 or later, only one node group (shard), and want to use a default parameter group, we recommend that you specify the parameter group by name.    To create a Redis (cluster mode disabled) replication group, use CacheParameterGroupName=default.redis3.2.   To create a Redis (cluster mode enabled) replication group, use CacheParameterGroupName=default.redis3.2.cluster.on.  
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
  /**
    * A list of cache security group names to associate with this replication group.
    */
  var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.native
  /**
    * The name of the cache subnet group to be used for the replication group.  If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group before you start creating a cluster. For more information, see Subnets and Subnet Groups. 
    */
  var CacheSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * The name of the cache engine to be used for the clusters in this replication group.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The version number of the cache engine to be used for the clusters in this replication group. To view the supported cache engine versions, use the DescribeCacheEngineVersions operation.  Important: You can upgrade to a newer engine version (see Selecting a Cache Engine and Version) in the ElastiCache User Guide, but you cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the existing cluster or replication group and create it anew with the earlier engine version. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The ID of the KMS key used to encrypt the disk on the cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * A list of node group (shard) configuration options. Each node group (shard) configuration has the following members: PrimaryAvailabilityZone, ReplicaAvailabilityZones, ReplicaCount, and Slots. If you're creating a Redis (cluster mode disabled) or a Redis (cluster mode enabled) replication group, you can use this parameter to individually configure each node group (shard), or you can omit this parameter. However, when seeding a Redis (cluster mode enabled) cluster from a S3 rdb file, you must configure each node group (shard) using this parameter because you must specify the slots for each node group.
    */
  var NodeGroupConfiguration: js.UndefOr[NodeGroupConfigurationList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are sent.  The Amazon SNS topic owner must be the same as the cluster owner. 
    */
  var NotificationTopicArn: js.UndefOr[String] = js.native
  /**
    * The number of clusters this replication group initially has. This parameter is not used if there is more than one node group (shard). You should use ReplicasPerNodeGroup instead. If AutomaticFailoverEnabled is true, the value of this parameter must be at least 2. If AutomaticFailoverEnabled is false you can omit this parameter (it will default to 1), or you can explicitly set it to a value between 2 and 6. The maximum permitted value for NumCacheClusters is 6 (1 primary plus 5 replicas).
    */
  var NumCacheClusters: js.UndefOr[IntegerOptional] = js.native
  /**
    * An optional parameter that specifies the number of node groups (shards) for this Redis (cluster mode enabled) replication group. For Redis (cluster mode disabled) either omit this parameter or set it to 1. Default: 1
    */
  var NumNodeGroups: js.UndefOr[IntegerOptional] = js.native
  /**
    * The port number on which each member of the replication group accepts connections.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * A list of EC2 Availability Zones in which the replication group's clusters are created. The order of the Availability Zones in the list is the order in which clusters are allocated. The primary cluster is created in the first AZ in the list. This parameter is not used if there is more than one node group (shard). You should use NodeGroupConfiguration instead.  If you are creating your replication group in an Amazon VPC (recommended), you can only locate clusters in Availability Zones associated with the subnets in the selected subnet group. The number of Availability Zones listed must equal the value of NumCacheClusters.  Default: system chosen Availability Zones.
    */
  var PreferredCacheClusterAZs: js.UndefOr[AvailabilityZonesList] = js.native
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are: Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * The identifier of the cluster that serves as the primary for this replication group. This cluster must already exist and have a status of available. This parameter is not required if NumCacheClusters, NumNodeGroups, or ReplicasPerNodeGroup is specified.
    */
  var PrimaryClusterId: js.UndefOr[String] = js.native
  /**
    * An optional parameter that specifies the number of replica nodes in each node group (shard). Valid values are 0 to 5.
    */
  var ReplicasPerNodeGroup: js.UndefOr[IntegerOptional] = js.native
  /**
    * A user-created description for the replication group.
    */
  var ReplicationGroupDescription: String = js.native
  /**
    * The replication group identifier. This parameter is stored as a lowercase string. Constraints:   A name must contain from 1 to 40 alphanumeric characters or hyphens.   The first character must be a letter.   A name cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ReplicationGroupId: String = js.native
  /**
    * One or more Amazon VPC security groups associated with this replication group. Use this parameter only when you are creating a replication group in an Amazon Virtual Private Cloud (Amazon VPC).
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.native
  /**
    * A list of Amazon Resource Names (ARN) that uniquely identify the Redis RDB snapshot files stored in Amazon S3. The snapshot files are used to populate the new replication group. The Amazon S3 object name in the ARN cannot contain any commas. The new replication group will have the number of node groups (console: shards) specified by the parameter NumNodeGroups or the number of node groups configured by NodeGroupConfiguration regardless of the number of ARNs specified here. Example of an Amazon S3 ARN: arn:aws:s3:::my_bucket/snapshot1.rdb 
    */
  var SnapshotArns: js.UndefOr[SnapshotArnsList] = js.native
  /**
    * The name of a snapshot from which to restore data into the new replication group. The snapshot status changes to restoring while the new replication group is being created.
    */
  var SnapshotName: js.UndefOr[String] = js.native
  /**
    * The number of days for which ElastiCache retains automatic snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted. Default: 0 (i.e., automatic backups are disabled for this cluster).
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.native
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard). Example: 05:00-09:00  If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
    */
  var SnapshotWindow: js.UndefOr[String] = js.native
  /**
    * A list of cost allocation tags to be added to this resource. Tags are comma-separated key,value pairs (e.g. Key=myKey, Value=myKeyValue. You can include multiple tags as shown following: Key=myKey, Value=myKeyValue Key=mySecondKey, Value=mySecondKeyValue.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A flag that enables in-transit encryption when set to true. You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster. This parameter is valid only if the Engine parameter is redis, the EngineVersion parameter is 3.2.6, 4.x or later, and the cluster is being created in an Amazon VPC. If you enable in-transit encryption, you must also specify a value for CacheSubnetGroup.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later. Default: false   For HIPAA compliance, you must specify TransitEncryptionEnabled as true, an AuthToken, and a CacheSubnetGroup. 
    */
  var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.native
}

object CreateReplicationGroupMessage {
  @scala.inline
  def apply(
    ReplicationGroupDescription: String,
    ReplicationGroupId: String,
    AtRestEncryptionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    AuthToken: String = null,
    AutoMinorVersionUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    AutomaticFailoverEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    CacheNodeType: String = null,
    CacheParameterGroupName: String = null,
    CacheSecurityGroupNames: CacheSecurityGroupNameList = null,
    CacheSubnetGroupName: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    KmsKeyId: String = null,
    NodeGroupConfiguration: NodeGroupConfigurationList = null,
    NotificationTopicArn: String = null,
    NumCacheClusters: Int | scala.Double = null,
    NumNodeGroups: Int | scala.Double = null,
    Port: Int | scala.Double = null,
    PreferredCacheClusterAZs: AvailabilityZonesList = null,
    PreferredMaintenanceWindow: String = null,
    PrimaryClusterId: String = null,
    ReplicasPerNodeGroup: Int | scala.Double = null,
    SecurityGroupIds: SecurityGroupIdsList = null,
    SnapshotArns: SnapshotArnsList = null,
    SnapshotName: String = null,
    SnapshotRetentionLimit: Int | scala.Double = null,
    SnapshotWindow: String = null,
    Tags: TagList = null,
    TransitEncryptionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationGroupDescription = ReplicationGroupDescription.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    if (!js.isUndefined(AtRestEncryptionEnabled)) __obj.updateDynamic("AtRestEncryptionEnabled")(AtRestEncryptionEnabled.asInstanceOf[js.Any])
    if (AuthToken != null) __obj.updateDynamic("AuthToken")(AuthToken.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade.asInstanceOf[js.Any])
    if (!js.isUndefined(AutomaticFailoverEnabled)) __obj.updateDynamic("AutomaticFailoverEnabled")(AutomaticFailoverEnabled.asInstanceOf[js.Any])
    if (CacheNodeType != null) __obj.updateDynamic("CacheNodeType")(CacheNodeType.asInstanceOf[js.Any])
    if (CacheParameterGroupName != null) __obj.updateDynamic("CacheParameterGroupName")(CacheParameterGroupName.asInstanceOf[js.Any])
    if (CacheSecurityGroupNames != null) __obj.updateDynamic("CacheSecurityGroupNames")(CacheSecurityGroupNames.asInstanceOf[js.Any])
    if (CacheSubnetGroupName != null) __obj.updateDynamic("CacheSubnetGroupName")(CacheSubnetGroupName.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (NodeGroupConfiguration != null) __obj.updateDynamic("NodeGroupConfiguration")(NodeGroupConfiguration.asInstanceOf[js.Any])
    if (NotificationTopicArn != null) __obj.updateDynamic("NotificationTopicArn")(NotificationTopicArn.asInstanceOf[js.Any])
    if (NumCacheClusters != null) __obj.updateDynamic("NumCacheClusters")(NumCacheClusters.asInstanceOf[js.Any])
    if (NumNodeGroups != null) __obj.updateDynamic("NumNodeGroups")(NumNodeGroups.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (PreferredCacheClusterAZs != null) __obj.updateDynamic("PreferredCacheClusterAZs")(PreferredCacheClusterAZs.asInstanceOf[js.Any])
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow.asInstanceOf[js.Any])
    if (PrimaryClusterId != null) __obj.updateDynamic("PrimaryClusterId")(PrimaryClusterId.asInstanceOf[js.Any])
    if (ReplicasPerNodeGroup != null) __obj.updateDynamic("ReplicasPerNodeGroup")(ReplicasPerNodeGroup.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SnapshotArns != null) __obj.updateDynamic("SnapshotArns")(SnapshotArns.asInstanceOf[js.Any])
    if (SnapshotName != null) __obj.updateDynamic("SnapshotName")(SnapshotName.asInstanceOf[js.Any])
    if (SnapshotRetentionLimit != null) __obj.updateDynamic("SnapshotRetentionLimit")(SnapshotRetentionLimit.asInstanceOf[js.Any])
    if (SnapshotWindow != null) __obj.updateDynamic("SnapshotWindow")(SnapshotWindow.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(TransitEncryptionEnabled)) __obj.updateDynamic("TransitEncryptionEnabled")(TransitEncryptionEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationGroupMessage]
  }
}

