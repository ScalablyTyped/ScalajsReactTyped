package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object neptuneMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.immediate_
    - typingsJapgolly.awsSdk.awsSdkStrings.`pending-reboot`
    - java.lang.String
  */
  type ApplyMethod = typingsJapgolly.awsSdk.neptuneMod._ApplyMethod | java.lang.String
  type AttributeValueList = js.Array[typingsJapgolly.awsSdk.neptuneMod.String]
  type AvailabilityZoneList = js.Array[typingsJapgolly.awsSdk.neptuneMod.AvailabilityZone]
  type AvailabilityZones = js.Array[typingsJapgolly.awsSdk.neptuneMod.String]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.neptuneMod.ClientApiVersions
  type DBClusterList = js.Array[typingsJapgolly.awsSdk.neptuneMod.DBCluster]
  type DBClusterMemberList = js.Array[typingsJapgolly.awsSdk.neptuneMod.DBClusterMember]
  type DBClusterOptionGroupMemberships = js.Array[typingsJapgolly.awsSdk.neptuneMod.DBClusterOptionGroupStatus]
  type DBClusterParameterGroupList = js.Array[typingsJapgolly.awsSdk.neptuneMod.DBClusterParameterGroup]
  type DBClusterRoles = js.Array[typingsJapgolly.awsSdk.neptuneMod.DBClusterRole]
  type DBClusterSnapshotAttributeList = js.Array[typingsJapgolly.awsSdk.neptuneMod.DBClusterSnapshotAttribute]
  type DBClusterSnapshotList = js.Array[typingsJapgolly.awsSdk.neptuneMod.DBClusterSnapshot]
  type DBEngineVersionList = js.Array[typingsJapgolly.awsSdk.neptuneMod.DBEngineVersion]
  type DBInstanceList = js.Array[typingsJapgolly.awsSdk.neptuneMod.DBInstance]
  type DBInstanceStatusInfoList = js.Array[typingsJapgolly.awsSdk.neptuneMod.DBInstanceStatusInfo]
  type DBParameterGroupList = js.Array[typingsJapgolly.awsSdk.neptuneMod.DBParameterGroup]
  type DBParameterGroupStatusList = js.Array[typingsJapgolly.awsSdk.neptuneMod.DBParameterGroupStatus]
  type DBSecurityGroupMembershipList = js.Array[typingsJapgolly.awsSdk.neptuneMod.DBSecurityGroupMembership]
  type DBSecurityGroupNameList = js.Array[typingsJapgolly.awsSdk.neptuneMod.String]
  type DBSubnetGroups = js.Array[typingsJapgolly.awsSdk.neptuneMod.DBSubnetGroup]
  type DomainMembershipList = js.Array[typingsJapgolly.awsSdk.neptuneMod.DomainMembership]
  type Double = scala.Double
  type DoubleOptional = scala.Double
  type DoubleRangeList = js.Array[typingsJapgolly.awsSdk.neptuneMod.DoubleRange]
  type EventCategoriesList = js.Array[typingsJapgolly.awsSdk.neptuneMod.String]
  type EventCategoriesMapList = js.Array[typingsJapgolly.awsSdk.neptuneMod.EventCategoriesMap]
  type EventList = js.Array[typingsJapgolly.awsSdk.neptuneMod.Event]
  type EventSubscriptionsList = js.Array[typingsJapgolly.awsSdk.neptuneMod.EventSubscription]
  type FilterList = js.Array[typingsJapgolly.awsSdk.neptuneMod.Filter]
  type FilterValueList = js.Array[typingsJapgolly.awsSdk.neptuneMod.String]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[typingsJapgolly.awsSdk.neptuneMod.String]
  type LogTypeList = js.Array[typingsJapgolly.awsSdk.neptuneMod.String]
  type OptionGroupMembershipList = js.Array[typingsJapgolly.awsSdk.neptuneMod.OptionGroupMembership]
  type OrderableDBInstanceOptionsList = js.Array[typingsJapgolly.awsSdk.neptuneMod.OrderableDBInstanceOption]
  type ParametersList = js.Array[typingsJapgolly.awsSdk.neptuneMod.Parameter]
  type PendingMaintenanceActionDetails = js.Array[typingsJapgolly.awsSdk.neptuneMod.PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[typingsJapgolly.awsSdk.neptuneMod.ResourcePendingMaintenanceActions]
  type RangeList = js.Array[typingsJapgolly.awsSdk.neptuneMod.Range]
  type ReadReplicaDBClusterIdentifierList = js.Array[typingsJapgolly.awsSdk.neptuneMod.String]
  type ReadReplicaDBInstanceIdentifierList = js.Array[typingsJapgolly.awsSdk.neptuneMod.String]
  type ReadReplicaIdentifierList = js.Array[typingsJapgolly.awsSdk.neptuneMod.String]
  type SourceIdsList = js.Array[typingsJapgolly.awsSdk.neptuneMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`db-instance`
    - typingsJapgolly.awsSdk.awsSdkStrings.`db-parameter-group`
    - typingsJapgolly.awsSdk.awsSdkStrings.`db-security-group`
    - typingsJapgolly.awsSdk.awsSdkStrings.`db-snapshot`
    - typingsJapgolly.awsSdk.awsSdkStrings.`db-cluster`
    - typingsJapgolly.awsSdk.awsSdkStrings.`db-cluster-snapshot`
    - java.lang.String
  */
  type SourceType = typingsJapgolly.awsSdk.neptuneMod._SourceType | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[typingsJapgolly.awsSdk.neptuneMod.String]
  type SubnetList = js.Array[typingsJapgolly.awsSdk.neptuneMod.Subnet]
  type SupportedCharacterSetsList = js.Array[typingsJapgolly.awsSdk.neptuneMod.CharacterSet]
  type SupportedTimezonesList = js.Array[typingsJapgolly.awsSdk.neptuneMod.Timezone]
  type TStamp = js.Date
  type TagList = js.Array[typingsJapgolly.awsSdk.neptuneMod.Tag]
  type ValidStorageOptionsList = js.Array[typingsJapgolly.awsSdk.neptuneMod.ValidStorageOptions]
  type ValidUpgradeTargetList = js.Array[typingsJapgolly.awsSdk.neptuneMod.UpgradeTarget]
  type VpcSecurityGroupIdList = js.Array[typingsJapgolly.awsSdk.neptuneMod.String]
  type VpcSecurityGroupMembershipList = js.Array[typingsJapgolly.awsSdk.neptuneMod.VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-10-31`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.neptuneMod._apiVersion | java.lang.String
}
