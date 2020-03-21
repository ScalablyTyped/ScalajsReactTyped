package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object redshiftMod {
  type AccountsWithRestoreAccessList = js.Array[typingsJapgolly.awsSdk.redshiftMod.AccountWithRestoreAccess]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`restore-cluster`
    - typingsJapgolly.awsSdk.awsSdkStrings.`recommend-node-config`
    - java.lang.String
  */
  type ActionType = typingsJapgolly.awsSdk.redshiftMod._ActionType | java.lang.String
  type AssociatedClusterList = js.Array[typingsJapgolly.awsSdk.redshiftMod.ClusterAssociatedToSchedule]
  type AttributeList = js.Array[typingsJapgolly.awsSdk.redshiftMod.AccountAttribute]
  type AttributeNameList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type AttributeValueList = js.Array[typingsJapgolly.awsSdk.redshiftMod.AttributeValueTarget]
  type AvailabilityZoneList = js.Array[typingsJapgolly.awsSdk.redshiftMod.AvailabilityZone]
  type BatchSnapshotOperationErrorList = js.Array[typingsJapgolly.awsSdk.redshiftMod.SnapshotErrorMessage]
  type BatchSnapshotOperationErrors = js.Array[typingsJapgolly.awsSdk.redshiftMod.SnapshotErrorMessage]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.redshiftMod.ClientApiVersions
  type ClusterDbRevisionsList = js.Array[typingsJapgolly.awsSdk.redshiftMod.ClusterDbRevision]
  type ClusterIamRoleList = js.Array[typingsJapgolly.awsSdk.redshiftMod.ClusterIamRole]
  type ClusterList = js.Array[typingsJapgolly.awsSdk.redshiftMod.Cluster]
  type ClusterNodesList = js.Array[typingsJapgolly.awsSdk.redshiftMod.ClusterNode]
  type ClusterParameterGroupStatusList = js.Array[typingsJapgolly.awsSdk.redshiftMod.ClusterParameterGroupStatus]
  type ClusterParameterStatusList = js.Array[typingsJapgolly.awsSdk.redshiftMod.ClusterParameterStatus]
  type ClusterSecurityGroupMembershipList = js.Array[typingsJapgolly.awsSdk.redshiftMod.ClusterSecurityGroupMembership]
  type ClusterSecurityGroupNameList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type ClusterSecurityGroups = js.Array[typingsJapgolly.awsSdk.redshiftMod.ClusterSecurityGroup]
  type ClusterSubnetGroups = js.Array[typingsJapgolly.awsSdk.redshiftMod.ClusterSubnetGroup]
  type ClusterVersionList = js.Array[typingsJapgolly.awsSdk.redshiftMod.ClusterVersion]
  type DbGroupList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type DeferredMaintenanceWindowsList = js.Array[typingsJapgolly.awsSdk.redshiftMod.DeferredMaintenanceWindow]
  type DeleteClusterSnapshotMessageList = js.Array[typingsJapgolly.awsSdk.redshiftMod.DeleteClusterSnapshotMessage]
  type Double = scala.Double
  type DoubleOptional = scala.Double
  type EC2SecurityGroupList = js.Array[typingsJapgolly.awsSdk.redshiftMod.EC2SecurityGroup]
  type EligibleTracksToUpdateList = js.Array[typingsJapgolly.awsSdk.redshiftMod.UpdateTarget]
  type EventCategoriesList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type EventCategoriesMapList = js.Array[typingsJapgolly.awsSdk.redshiftMod.EventCategoriesMap]
  type EventInfoMapList = js.Array[typingsJapgolly.awsSdk.redshiftMod.EventInfoMap]
  type EventList = js.Array[typingsJapgolly.awsSdk.redshiftMod.Event]
  type EventSubscriptionsList = js.Array[typingsJapgolly.awsSdk.redshiftMod.EventSubscription]
  type HsmClientCertificateList = js.Array[typingsJapgolly.awsSdk.redshiftMod.HsmClientCertificate]
  type HsmConfigurationList = js.Array[typingsJapgolly.awsSdk.redshiftMod.HsmConfiguration]
  type IPRangeList = js.Array[typingsJapgolly.awsSdk.redshiftMod.IPRange]
  type IamRoleArnList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type ImportTablesCompleted = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type ImportTablesInProgress = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type ImportTablesNotStarted = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type Long = scala.Double
  type LongOptional = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.standard__
    - typingsJapgolly.awsSdk.awsSdkStrings.`high-performance`
    - java.lang.String
  */
  type Mode = typingsJapgolly.awsSdk.redshiftMod._Mode | java.lang.String
  type NodeConfigurationOptionList = js.Array[typingsJapgolly.awsSdk.redshiftMod.NodeConfigurationOption]
  type NodeConfigurationOptionsFilterList = js.Array[typingsJapgolly.awsSdk.redshiftMod.NodeConfigurationOptionsFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NodeType
    - typingsJapgolly.awsSdk.awsSdkStrings.NumberOfNodes
    - typingsJapgolly.awsSdk.awsSdkStrings.EstimatedDiskUtilizationPercent
    - typingsJapgolly.awsSdk.awsSdkStrings.Mode
    - java.lang.String
  */
  type NodeConfigurationOptionsFilterName = typingsJapgolly.awsSdk.redshiftMod._NodeConfigurationOptionsFilterName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.eq_
    - typingsJapgolly.awsSdk.awsSdkStrings.lt_
    - typingsJapgolly.awsSdk.awsSdkStrings.gt_
    - typingsJapgolly.awsSdk.awsSdkStrings.le_
    - typingsJapgolly.awsSdk.awsSdkStrings.ge_
    - typingsJapgolly.awsSdk.awsSdkStrings.in__
    - typingsJapgolly.awsSdk.awsSdkStrings.between_
    - java.lang.String
  */
  type OperatorType = typingsJapgolly.awsSdk.redshiftMod._OperatorType | java.lang.String
  type OrderableClusterOptionsList = js.Array[typingsJapgolly.awsSdk.redshiftMod.OrderableClusterOption]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.static__
    - typingsJapgolly.awsSdk.awsSdkStrings.dynamic__
    - java.lang.String
  */
  type ParameterApplyType = typingsJapgolly.awsSdk.redshiftMod._ParameterApplyType | java.lang.String
  type ParameterGroupList = js.Array[typingsJapgolly.awsSdk.redshiftMod.ClusterParameterGroup]
  type ParametersList = js.Array[typingsJapgolly.awsSdk.redshiftMod.Parameter]
  type PendingActionsList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type RecurringChargeList = js.Array[typingsJapgolly.awsSdk.redshiftMod.RecurringCharge]
  type ReservedNodeList = js.Array[typingsJapgolly.awsSdk.redshiftMod.ReservedNode]
  type ReservedNodeOfferingList = js.Array[typingsJapgolly.awsSdk.redshiftMod.ReservedNodeOffering]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Regular_
    - typingsJapgolly.awsSdk.awsSdkStrings.Upgradable
    - java.lang.String
  */
  type ReservedNodeOfferingType = typingsJapgolly.awsSdk.redshiftMod._ReservedNodeOfferingType | java.lang.String
  type RestorableNodeTypeList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type RevisionTargetsList = js.Array[typingsJapgolly.awsSdk.redshiftMod.RevisionTarget]
  type ScheduleDefinitionList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MODIFYING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ScheduleState = typingsJapgolly.awsSdk.redshiftMod._ScheduleState | java.lang.String
  type ScheduledActionFilterList = js.Array[typingsJapgolly.awsSdk.redshiftMod.ScheduledActionFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`cluster-identifier`
    - typingsJapgolly.awsSdk.awsSdkStrings.`iam-role`
    - java.lang.String
  */
  type ScheduledActionFilterName = typingsJapgolly.awsSdk.redshiftMod._ScheduledActionFilterName | java.lang.String
  type ScheduledActionList = js.Array[typingsJapgolly.awsSdk.redshiftMod.ScheduledAction]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ScheduledActionState = typingsJapgolly.awsSdk.redshiftMod._ScheduledActionState | java.lang.String
  type ScheduledActionTimeList = js.Array[js.Date]
  type ScheduledActionTypeValues = typingsJapgolly.awsSdk.awsSdkStrings.ResizeCluster | java.lang.String
  type ScheduledSnapshotTimeList = js.Array[js.Date]
  type SensitiveString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SOURCE_TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.TOTAL_SIZE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_TIME
    - java.lang.String
  */
  type SnapshotAttributeToSortBy = typingsJapgolly.awsSdk.redshiftMod._SnapshotAttributeToSortBy | java.lang.String
  type SnapshotCopyGrantList = js.Array[typingsJapgolly.awsSdk.redshiftMod.SnapshotCopyGrant]
  type SnapshotIdentifierList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type SnapshotList = js.Array[typingsJapgolly.awsSdk.redshiftMod.Snapshot]
  type SnapshotScheduleList = js.Array[typingsJapgolly.awsSdk.redshiftMod.SnapshotSchedule]
  type SnapshotSortingEntityList = js.Array[typingsJapgolly.awsSdk.redshiftMod.SnapshotSortingEntity]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASC
    - typingsJapgolly.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type SortByOrder = typingsJapgolly.awsSdk.redshiftMod._SortByOrder | java.lang.String
  type SourceIdsList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.cluster_
    - typingsJapgolly.awsSdk.awsSdkStrings.`cluster-parameter-group`
    - typingsJapgolly.awsSdk.awsSdkStrings.`cluster-security-group`
    - typingsJapgolly.awsSdk.awsSdkStrings.`cluster-snapshot`
    - typingsJapgolly.awsSdk.awsSdkStrings.`scheduled-action`
    - java.lang.String
  */
  type SourceType = typingsJapgolly.awsSdk.redshiftMod._SourceType | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type SubnetList = js.Array[typingsJapgolly.awsSdk.redshiftMod.Subnet]
  type SupportedOperationList = js.Array[typingsJapgolly.awsSdk.redshiftMod.SupportedOperation]
  type SupportedPlatformsList = js.Array[typingsJapgolly.awsSdk.redshiftMod.SupportedPlatform]
  type TStamp = js.Date
  type TableRestoreStatusList = js.Array[typingsJapgolly.awsSdk.redshiftMod.TableRestoreStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type TableRestoreStatusType = typingsJapgolly.awsSdk.redshiftMod._TableRestoreStatusType | java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type TagList = js.Array[typingsJapgolly.awsSdk.redshiftMod.Tag]
  type TagValueList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type TaggedResourceList = js.Array[typingsJapgolly.awsSdk.redshiftMod.TaggedResource]
  type TrackList = js.Array[typingsJapgolly.awsSdk.redshiftMod.MaintenanceTrack]
  type ValueStringList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type VpcSecurityGroupIdList = js.Array[typingsJapgolly.awsSdk.redshiftMod.String]
  type VpcSecurityGroupMembershipList = js.Array[typingsJapgolly.awsSdk.redshiftMod.VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2012-12-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.redshiftMod._apiVersion | java.lang.String
}
