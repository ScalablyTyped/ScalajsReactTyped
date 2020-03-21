package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elasticacheMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`single-az`
    - typingsJapgolly.awsSdk.awsSdkStrings.`cross-az`
    - java.lang.String
  */
  type AZMode = typingsJapgolly.awsSdk.elasticacheMod._AZMode | java.lang.String
  type AllowedNodeGroupId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SETTING
    - typingsJapgolly.awsSdk.awsSdkStrings.ROTATING
    - java.lang.String
  */
  type AuthTokenUpdateStatus = typingsJapgolly.awsSdk.elasticacheMod._AuthTokenUpdateStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SET
    - typingsJapgolly.awsSdk.awsSdkStrings.ROTATE
    - java.lang.String
  */
  type AuthTokenUpdateStrategyType = typingsJapgolly.awsSdk.elasticacheMod._AuthTokenUpdateStrategyType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.enabled__
    - typingsJapgolly.awsSdk.awsSdkStrings.disabled__
    - typingsJapgolly.awsSdk.awsSdkStrings.enabling__
    - typingsJapgolly.awsSdk.awsSdkStrings.disabling_
    - java.lang.String
  */
  type AutomaticFailoverStatus = typingsJapgolly.awsSdk.elasticacheMod._AutomaticFailoverStatus | java.lang.String
  type AvailabilityZonesList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.String]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CacheClusterIdList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.String]
  type CacheClusterList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.CacheCluster]
  type CacheEngineVersionList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.CacheEngineVersion]
  type CacheNodeIdsList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.String]
  type CacheNodeList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.CacheNode]
  type CacheNodeTypeSpecificParametersList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.CacheNodeTypeSpecificParameter]
  type CacheNodeTypeSpecificValueList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.CacheNodeTypeSpecificValue]
  type CacheNodeUpdateStatusList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.CacheNodeUpdateStatus]
  type CacheParameterGroupList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.CacheParameterGroup]
  type CacheSecurityGroupMembershipList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.CacheSecurityGroupMembership]
  type CacheSecurityGroupNameList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.String]
  type CacheSecurityGroups = js.Array[typingsJapgolly.awsSdk.elasticacheMod.CacheSecurityGroup]
  type CacheSubnetGroups = js.Array[typingsJapgolly.awsSdk.elasticacheMod.CacheSubnetGroup]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.immediate_
    - typingsJapgolly.awsSdk.awsSdkStrings.`requires-reboot`
    - java.lang.String
  */
  type ChangeType = typingsJapgolly.awsSdk.elasticacheMod._ChangeType | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.elasticacheMod.ClientApiVersions
  type ClusterIdList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.String]
  type CustomerNodeEndpointList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.CustomerNodeEndpoint]
  type Double = scala.Double
  type EC2SecurityGroupList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.EC2SecurityGroup]
  type EventList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.Event]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.String]
  type NodeGroupConfigurationList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.NodeGroupConfiguration]
  type NodeGroupList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.NodeGroup]
  type NodeGroupMemberList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.NodeGroupMember]
  type NodeGroupMemberUpdateStatusList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.NodeGroupMemberUpdateStatus]
  type NodeGroupUpdateStatusList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.NodeGroupUpdateStatus]
  type NodeGroupsToRemoveList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.AllowedNodeGroupId]
  type NodeGroupsToRetainList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.AllowedNodeGroupId]
  type NodeSnapshotList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.NodeSnapshot]
  type NodeTypeList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.system__
    - typingsJapgolly.awsSdk.awsSdkStrings.customer_
    - java.lang.String
  */
  type NodeUpdateInitiatedBy = typingsJapgolly.awsSdk.elasticacheMod._NodeUpdateInitiatedBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`not-applied`
    - typingsJapgolly.awsSdk.awsSdkStrings.`waiting-to-start`
    - typingsJapgolly.awsSdk.awsSdkStrings.`in-progress`
    - typingsJapgolly.awsSdk.awsSdkStrings.stopping__
    - typingsJapgolly.awsSdk.awsSdkStrings.stopped__
    - typingsJapgolly.awsSdk.awsSdkStrings.complete__
    - java.lang.String
  */
  type NodeUpdateStatus = typingsJapgolly.awsSdk.elasticacheMod._NodeUpdateStatus | java.lang.String
  type ParameterNameValueList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.ParameterNameValue]
  type ParametersList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.Parameter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.enabled__
    - typingsJapgolly.awsSdk.awsSdkStrings.disabled__
    - java.lang.String
  */
  type PendingAutomaticFailoverStatus = typingsJapgolly.awsSdk.elasticacheMod._PendingAutomaticFailoverStatus | java.lang.String
  type PreferredAvailabilityZoneList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.String]
  type ProcessedUpdateActionList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.ProcessedUpdateAction]
  type RecurringChargeList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.RecurringCharge]
  type RemoveReplicasList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.String]
  type ReplicaConfigurationList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.ConfigureShard]
  type ReplicationGroupIdList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.String]
  type ReplicationGroupList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.ReplicationGroup]
  type ReservedCacheNodeList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.ReservedCacheNode]
  type ReservedCacheNodesOfferingList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.ReservedCacheNodesOffering]
  type ReshardingConfigurationList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.ReshardingConfiguration]
  type SecurityGroupIdsList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.String]
  type SecurityGroupMembershipList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.SecurityGroupMembership]
  type ServiceUpdateList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.ServiceUpdate]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.critical_
    - typingsJapgolly.awsSdk.awsSdkStrings.important
    - typingsJapgolly.awsSdk.awsSdkStrings.medium__
    - typingsJapgolly.awsSdk.awsSdkStrings.low__
    - java.lang.String
  */
  type ServiceUpdateSeverity = typingsJapgolly.awsSdk.elasticacheMod._ServiceUpdateSeverity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelled__
    - typingsJapgolly.awsSdk.awsSdkStrings.expired__
    - java.lang.String
  */
  type ServiceUpdateStatus = typingsJapgolly.awsSdk.elasticacheMod._ServiceUpdateStatus | java.lang.String
  type ServiceUpdateStatusList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.ServiceUpdateStatus]
  type ServiceUpdateType = typingsJapgolly.awsSdk.awsSdkStrings.`security-update` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.yes_
    - typingsJapgolly.awsSdk.awsSdkStrings.no_
    - typingsJapgolly.awsSdk.awsSdkStrings.nSlasha
    - java.lang.String
  */
  type SlaMet = typingsJapgolly.awsSdk.elasticacheMod._SlaMet | java.lang.String
  type SnapshotArnsList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.String]
  type SnapshotList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.Snapshot]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`cache-cluster`
    - typingsJapgolly.awsSdk.awsSdkStrings.`cache-parameter-group`
    - typingsJapgolly.awsSdk.awsSdkStrings.`cache-security-group`
    - typingsJapgolly.awsSdk.awsSdkStrings.`cache-subnet-group`
    - typingsJapgolly.awsSdk.awsSdkStrings.`replication-group`
    - java.lang.String
  */
  type SourceType = typingsJapgolly.awsSdk.elasticacheMod._SourceType | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.String]
  type SubnetList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.Subnet]
  type TStamp = js.Date
  type TagList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.Tag]
  type UnprocessedUpdateActionList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.UnprocessedUpdateAction]
  type UpdateActionList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.UpdateAction]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`not-applied`
    - typingsJapgolly.awsSdk.awsSdkStrings.`waiting-to-start`
    - typingsJapgolly.awsSdk.awsSdkStrings.`in-progress`
    - typingsJapgolly.awsSdk.awsSdkStrings.stopping__
    - typingsJapgolly.awsSdk.awsSdkStrings.stopped__
    - typingsJapgolly.awsSdk.awsSdkStrings.complete__
    - java.lang.String
  */
  type UpdateActionStatus = typingsJapgolly.awsSdk.elasticacheMod._UpdateActionStatus | java.lang.String
  type UpdateActionStatusList = js.Array[typingsJapgolly.awsSdk.elasticacheMod.UpdateActionStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2012-11-15`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-03-24`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-07-15`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-09-30`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-02-02`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.elasticacheMod._apiVersion | java.lang.String
}
