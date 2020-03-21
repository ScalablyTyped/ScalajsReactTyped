package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rdsMod {
  type AccountQuotaList = js.Array[typingsJapgolly.awsSdk.rdsMod.AccountQuota]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.sync
    - typingsJapgolly.awsSdk.awsSdkStrings.async
    - java.lang.String
  */
  type ActivityStreamMode = typingsJapgolly.awsSdk.rdsMod._ActivityStreamMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.stopped__
    - typingsJapgolly.awsSdk.awsSdkStrings.starting__
    - typingsJapgolly.awsSdk.awsSdkStrings.started__
    - typingsJapgolly.awsSdk.awsSdkStrings.stopping__
    - java.lang.String
  */
  type ActivityStreamStatus = typingsJapgolly.awsSdk.rdsMod._ActivityStreamStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.immediate_
    - typingsJapgolly.awsSdk.awsSdkStrings.`pending-reboot`
    - java.lang.String
  */
  type ApplyMethod = typingsJapgolly.awsSdk.rdsMod._ApplyMethod | java.lang.String
  type AttributeValueList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type AuthScheme = typingsJapgolly.awsSdk.awsSdkStrings.SECRETS | java.lang.String
  type AvailabilityZoneList = js.Array[typingsJapgolly.awsSdk.rdsMod.AvailabilityZone]
  type AvailabilityZones = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type AvailableProcessorFeatureList = js.Array[typingsJapgolly.awsSdk.rdsMod.AvailableProcessorFeature]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CertificateList = js.Array[typingsJapgolly.awsSdk.rdsMod.Certificate]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.rdsMod.ClientApiVersions
  type CustomAvailabilityZoneList = js.Array[typingsJapgolly.awsSdk.rdsMod.CustomAvailabilityZone]
  type DBClusterBacktrackList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBClusterBacktrack]
  type DBClusterEndpointList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBClusterEndpoint]
  type DBClusterList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBCluster]
  type DBClusterMemberList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBClusterMember]
  type DBClusterOptionGroupMemberships = js.Array[typingsJapgolly.awsSdk.rdsMod.DBClusterOptionGroupStatus]
  type DBClusterParameterGroupList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBClusterParameterGroup]
  type DBClusterRoles = js.Array[typingsJapgolly.awsSdk.rdsMod.DBClusterRole]
  type DBClusterSnapshotAttributeList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBClusterSnapshotAttribute]
  type DBClusterSnapshotList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBClusterSnapshot]
  type DBEngineVersionList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBEngineVersion]
  type DBInstanceAutomatedBackupList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBInstanceAutomatedBackup]
  type DBInstanceList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBInstance]
  type DBInstanceRoles = js.Array[typingsJapgolly.awsSdk.rdsMod.DBInstanceRole]
  type DBInstanceStatusInfoList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBInstanceStatusInfo]
  type DBParameterGroupList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBParameterGroup]
  type DBParameterGroupStatusList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBParameterGroupStatus]
  type DBProxyList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBProxy]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.modifying_
    - typingsJapgolly.awsSdk.awsSdkStrings.`incompatible-network`
    - typingsJapgolly.awsSdk.awsSdkStrings.`insufficient-resource-limits`
    - typingsJapgolly.awsSdk.awsSdkStrings.creating__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - java.lang.String
  */
  type DBProxyStatus = typingsJapgolly.awsSdk.rdsMod._DBProxyStatus | java.lang.String
  type DBSecurityGroupMembershipList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBSecurityGroupMembership]
  type DBSecurityGroupNameList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type DBSecurityGroups = js.Array[typingsJapgolly.awsSdk.rdsMod.DBSecurityGroup]
  type DBSnapshotAttributeList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBSnapshotAttribute]
  type DBSnapshotList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBSnapshot]
  type DBSubnetGroups = js.Array[typingsJapgolly.awsSdk.rdsMod.DBSubnetGroup]
  type DescribeDBLogFilesList = js.Array[typingsJapgolly.awsSdk.rdsMod.DescribeDBLogFilesDetails]
  type DomainMembershipList = js.Array[typingsJapgolly.awsSdk.rdsMod.DomainMembership]
  type Double = scala.Double
  type DoubleOptional = scala.Double
  type DoubleRangeList = js.Array[typingsJapgolly.awsSdk.rdsMod.DoubleRange]
  type EC2SecurityGroupList = js.Array[typingsJapgolly.awsSdk.rdsMod.EC2SecurityGroup]
  type EngineFamily = typingsJapgolly.awsSdk.awsSdkStrings.MYSQL | java.lang.String
  type EngineModeList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type EventCategoriesList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type EventCategoriesMapList = js.Array[typingsJapgolly.awsSdk.rdsMod.EventCategoriesMap]
  type EventList = js.Array[typingsJapgolly.awsSdk.rdsMod.Event]
  type EventSubscriptionsList = js.Array[typingsJapgolly.awsSdk.rdsMod.EventSubscription]
  type ExportTasksList = js.Array[typingsJapgolly.awsSdk.rdsMod.ExportTask]
  type FeatureNameList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type FilterList = js.Array[typingsJapgolly.awsSdk.rdsMod.Filter]
  type FilterValueList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type GlobalClusterList = js.Array[typingsJapgolly.awsSdk.rdsMod.GlobalCluster]
  type GlobalClusterMemberList = js.Array[typingsJapgolly.awsSdk.rdsMod.GlobalClusterMember]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.REQUIRED
    - java.lang.String
  */
  type IAMAuthMode = typingsJapgolly.awsSdk.rdsMod._IAMAuthMode | java.lang.String
  type IPRangeList = js.Array[typingsJapgolly.awsSdk.rdsMod.IPRange]
  type InstallationMediaList = js.Array[typingsJapgolly.awsSdk.rdsMod.InstallationMedia]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type LogTypeList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type Long = scala.Double
  type LongOptional = scala.Double
  type MaxRecords = scala.Double
  type MinimumEngineVersionPerAllowedValueList = js.Array[typingsJapgolly.awsSdk.rdsMod.MinimumEngineVersionPerAllowedValue]
  type OptionConfigurationList = js.Array[typingsJapgolly.awsSdk.rdsMod.OptionConfiguration]
  type OptionGroupMembershipList = js.Array[typingsJapgolly.awsSdk.rdsMod.OptionGroupMembership]
  type OptionGroupOptionSettingsList = js.Array[typingsJapgolly.awsSdk.rdsMod.OptionGroupOptionSetting]
  type OptionGroupOptionVersionsList = js.Array[typingsJapgolly.awsSdk.rdsMod.OptionVersion]
  type OptionGroupOptionsList = js.Array[typingsJapgolly.awsSdk.rdsMod.OptionGroupOption]
  type OptionGroupsList = js.Array[typingsJapgolly.awsSdk.rdsMod.OptionGroup]
  type OptionNamesList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type OptionSettingConfigurationList = js.Array[typingsJapgolly.awsSdk.rdsMod.OptionSetting]
  type OptionSettingsList = js.Array[typingsJapgolly.awsSdk.rdsMod.OptionSetting]
  type OptionsConflictsWith = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type OptionsDependedOn = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type OptionsList = js.Array[typingsJapgolly.awsSdk.rdsMod.Option]
  type OrderableDBInstanceOptionsList = js.Array[typingsJapgolly.awsSdk.rdsMod.OrderableDBInstanceOption]
  type ParametersList = js.Array[typingsJapgolly.awsSdk.rdsMod.Parameter]
  type PendingMaintenanceActionDetails = js.Array[typingsJapgolly.awsSdk.rdsMod.PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[typingsJapgolly.awsSdk.rdsMod.ResourcePendingMaintenanceActions]
  type ProcessorFeatureList = js.Array[typingsJapgolly.awsSdk.rdsMod.ProcessorFeature]
  type RangeList = js.Array[typingsJapgolly.awsSdk.rdsMod.Range]
  type ReadReplicaDBClusterIdentifierList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type ReadReplicaDBInstanceIdentifierList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type ReadReplicaIdentifierList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type ReadersArnList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type RecurringChargeList = js.Array[typingsJapgolly.awsSdk.rdsMod.RecurringCharge]
  type ReservedDBInstanceList = js.Array[typingsJapgolly.awsSdk.rdsMod.ReservedDBInstance]
  type ReservedDBInstancesOfferingList = js.Array[typingsJapgolly.awsSdk.rdsMod.ReservedDBInstancesOffering]
  type SourceIdsList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type SourceRegionList = js.Array[typingsJapgolly.awsSdk.rdsMod.SourceRegion]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`db-instance`
    - typingsJapgolly.awsSdk.awsSdkStrings.`db-parameter-group`
    - typingsJapgolly.awsSdk.awsSdkStrings.`db-security-group`
    - typingsJapgolly.awsSdk.awsSdkStrings.`db-snapshot`
    - typingsJapgolly.awsSdk.awsSdkStrings.`db-cluster`
    - typingsJapgolly.awsSdk.awsSdkStrings.`db-cluster-snapshot`
    - java.lang.String
  */
  type SourceType = typingsJapgolly.awsSdk.rdsMod._SourceType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type StringSensitive = java.lang.String
  type SubnetIdentifierList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type SubnetList = js.Array[typingsJapgolly.awsSdk.rdsMod.Subnet]
  type SupportedCharacterSetsList = js.Array[typingsJapgolly.awsSdk.rdsMod.CharacterSet]
  type SupportedTimezonesList = js.Array[typingsJapgolly.awsSdk.rdsMod.Timezone]
  type TStamp = js.Date
  type TagList = js.Array[typingsJapgolly.awsSdk.rdsMod.Tag]
  type TargetGroupList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBProxyTargetGroup]
  type TargetList = js.Array[typingsJapgolly.awsSdk.rdsMod.DBProxyTarget]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RDS_INSTANCE
    - typingsJapgolly.awsSdk.awsSdkStrings.RDS_SERVERLESS_ENDPOINT
    - typingsJapgolly.awsSdk.awsSdkStrings.TRACKED_CLUSTER
    - java.lang.String
  */
  type TargetType = typingsJapgolly.awsSdk.rdsMod._TargetType | java.lang.String
  type UserAuthConfigInfoList = js.Array[typingsJapgolly.awsSdk.rdsMod.UserAuthConfigInfo]
  type UserAuthConfigList = js.Array[typingsJapgolly.awsSdk.rdsMod.UserAuthConfig]
  type ValidStorageOptionsList = js.Array[typingsJapgolly.awsSdk.rdsMod.ValidStorageOptions]
  type ValidUpgradeTargetList = js.Array[typingsJapgolly.awsSdk.rdsMod.UpgradeTarget]
  type VpcSecurityGroupIdList = js.Array[typingsJapgolly.awsSdk.rdsMod.String]
  type VpcSecurityGroupMembershipList = js.Array[typingsJapgolly.awsSdk.rdsMod.VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2013-01-10`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2013-02-12`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2013-09-09`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-09-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-10-31`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.rdsMod._apiVersion | java.lang.String
}
