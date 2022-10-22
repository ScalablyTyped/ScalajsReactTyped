package typingsJapgolly.awsSdk.clientsRdsMod

import typingsJapgolly.awsSdk.awsSdkStrings.SECRETS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountQuotaList = js.Array[AccountQuota]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.sync_
  - typingsJapgolly.awsSdk.awsSdkStrings.async_
  - java.lang.String
*/
type ActivityStreamMode = _ActivityStreamMode | java.lang.String

type ActivityStreamModeList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.locked_
  - typingsJapgolly.awsSdk.awsSdkStrings.unlocked_
  - typingsJapgolly.awsSdk.awsSdkStrings.`locking-policy`
  - typingsJapgolly.awsSdk.awsSdkStrings.`unlocking-policy`
  - java.lang.String
*/
type ActivityStreamPolicyStatus = _ActivityStreamPolicyStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.stopped__
  - typingsJapgolly.awsSdk.awsSdkStrings.starting__
  - typingsJapgolly.awsSdk.awsSdkStrings.started__
  - typingsJapgolly.awsSdk.awsSdkStrings.stopping__
  - java.lang.String
*/
type ActivityStreamStatus = _ActivityStreamStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.immediate_
  - typingsJapgolly.awsSdk.awsSdkStrings.`pending-reboot`
  - java.lang.String
*/
type ApplyMethod = _ApplyMethod | java.lang.String

type AttributeValueList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.locked_
  - typingsJapgolly.awsSdk.awsSdkStrings.unlocked_
  - java.lang.String
*/
type AuditPolicyState = _AuditPolicyState | java.lang.String

type AuthScheme = SECRETS | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.full_
  - typingsJapgolly.awsSdk.awsSdkStrings.`all-paused`
  - java.lang.String
*/
type AutomationMode = _AutomationMode | java.lang.String

type AvailabilityZoneList = js.Array[AvailabilityZone]

type AvailabilityZones = js.Array[String]

type AvailableProcessorFeatureList = js.Array[AvailableProcessorFeature]

type AwsBackupRecoveryPointArn = java.lang.String

type Boolean = scala.Boolean

type BooleanOptional = scala.Boolean

type BucketName = java.lang.String

type CertificateList = js.Array[Certificate]

type CustomDBEngineVersionManifest = java.lang.String

type CustomEngineName = java.lang.String

type CustomEngineVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.available__
  - typingsJapgolly.awsSdk.awsSdkStrings.inactive__
  - typingsJapgolly.awsSdk.awsSdkStrings.`inactive-except-restore`
  - java.lang.String
*/
type CustomEngineVersionStatus = _CustomEngineVersionStatus | java.lang.String

type DBClusterBacktrackList = js.Array[DBClusterBacktrack]

type DBClusterEndpointList = js.Array[DBClusterEndpoint]

type DBClusterIdentifier = java.lang.String

type DBClusterList = js.Array[DBCluster]

type DBClusterMemberList = js.Array[DBClusterMember]

type DBClusterOptionGroupMemberships = js.Array[DBClusterOptionGroupStatus]

type DBClusterParameterGroupList = js.Array[DBClusterParameterGroup]

type DBClusterRoles = js.Array[DBClusterRole]

type DBClusterSnapshotAttributeList = js.Array[DBClusterSnapshotAttribute]

type DBClusterSnapshotList = js.Array[DBClusterSnapshot]

type DBEngineVersionList = js.Array[DBEngineVersion]

type DBInstanceAutomatedBackupList = js.Array[DBInstanceAutomatedBackup]

type DBInstanceAutomatedBackupsReplicationList = js.Array[DBInstanceAutomatedBackupsReplication]

type DBInstanceList = js.Array[DBInstance]

type DBInstanceRoles = js.Array[DBInstanceRole]

type DBInstanceStatusInfoList = js.Array[DBInstanceStatusInfo]

type DBParameterGroupList = js.Array[DBParameterGroup]

type DBParameterGroupStatusList = js.Array[DBParameterGroupStatus]

type DBProxyEndpointList = js.Array[DBProxyEndpoint]

type DBProxyEndpointName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.available__
  - typingsJapgolly.awsSdk.awsSdkStrings.modifying_
  - typingsJapgolly.awsSdk.awsSdkStrings.`incompatible-network`
  - typingsJapgolly.awsSdk.awsSdkStrings.`insufficient-resource-limits`
  - typingsJapgolly.awsSdk.awsSdkStrings.creating__
  - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
  - java.lang.String
*/
type DBProxyEndpointStatus = _DBProxyEndpointStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READ_WRITE
  - typingsJapgolly.awsSdk.awsSdkStrings.READ_ONLY
  - java.lang.String
*/
type DBProxyEndpointTargetRole = _DBProxyEndpointTargetRole | java.lang.String

type DBProxyList = js.Array[DBProxy]

type DBProxyName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.available__
  - typingsJapgolly.awsSdk.awsSdkStrings.modifying_
  - typingsJapgolly.awsSdk.awsSdkStrings.`incompatible-network`
  - typingsJapgolly.awsSdk.awsSdkStrings.`insufficient-resource-limits`
  - typingsJapgolly.awsSdk.awsSdkStrings.creating__
  - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
  - typingsJapgolly.awsSdk.awsSdkStrings.suspended__
  - typingsJapgolly.awsSdk.awsSdkStrings.suspending_
  - typingsJapgolly.awsSdk.awsSdkStrings.reactivating
  - java.lang.String
*/
type DBProxyStatus = _DBProxyStatus | java.lang.String

type DBSecurityGroupMembershipList = js.Array[DBSecurityGroupMembership]

type DBSecurityGroupNameList = js.Array[String]

type DBSecurityGroups = js.Array[DBSecurityGroup]

type DBSnapshotAttributeList = js.Array[DBSnapshotAttribute]

type DBSnapshotList = js.Array[DBSnapshot]

type DBSubnetGroups = js.Array[DBSubnetGroup]

type DescribeDBLogFilesList = js.Array[DescribeDBLogFilesDetails]

type Description = java.lang.String

type DomainMembershipList = js.Array[DomainMembership]

type Double = scala.Double

type DoubleOptional = scala.Double

type DoubleRangeList = js.Array[DoubleRange]

type EC2SecurityGroupList = js.Array[EC2SecurityGroup]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MYSQL
  - typingsJapgolly.awsSdk.awsSdkStrings.POSTGRESQL
  - typingsJapgolly.awsSdk.awsSdkStrings.SQLSERVER
  - java.lang.String
*/
type EngineFamily = _EngineFamily | java.lang.String

type EngineModeList = js.Array[String]

type EventCategoriesList = js.Array[String]

type EventCategoriesMapList = js.Array[EventCategoriesMap]

type EventList = js.Array[Event]

type EventSubscriptionsList = js.Array[EventSubscription]

type ExportTasksList = js.Array[ExportTask]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.pending__
  - typingsJapgolly.awsSdk.awsSdkStrings.`failing-over`
  - typingsJapgolly.awsSdk.awsSdkStrings.cancelling__
  - java.lang.String
*/
type FailoverStatus = _FailoverStatus | java.lang.String

type FeatureNameList = js.Array[String]

type FilterList = js.Array[Filter]

type FilterValueList = js.Array[String]

type GlobalClusterIdentifier = java.lang.String

type GlobalClusterList = js.Array[GlobalCluster]

type GlobalClusterMemberList = js.Array[GlobalClusterMember]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - java.lang.String
*/
type IAMAuthMode = _IAMAuthMode | java.lang.String

type IPRangeList = js.Array[IPRange]

type Integer = scala.Double

type IntegerOptional = scala.Double

type KeyList = js.Array[String]

type KmsKeyIdOrArn = java.lang.String

type LogTypeList = js.Array[String]

type Long = scala.Double

type LongOptional = scala.Double

type MaxRecords = scala.Double

type MinimumEngineVersionPerAllowedValueList = js.Array[MinimumEngineVersionPerAllowedValue]

type OptionConfigurationList = js.Array[OptionConfiguration]

type OptionGroupMembershipList = js.Array[OptionGroupMembership]

type OptionGroupOptionSettingsList = js.Array[OptionGroupOptionSetting]

type OptionGroupOptionVersionsList = js.Array[OptionVersion]

type OptionGroupOptionsList = js.Array[OptionGroupOption]

type OptionGroupsList = js.Array[OptionGroup]

type OptionNamesList = js.Array[String]

type OptionSettingConfigurationList = js.Array[OptionSetting]

type OptionSettingsList = js.Array[OptionSetting]

type OptionsConflictsWith = js.Array[String]

type OptionsDependedOn = js.Array[String]

type OptionsList = js.Array[Option]

type OrderableDBInstanceOptionsList = js.Array[OrderableDBInstanceOption]

type ParametersList = js.Array[Parameter]

type PendingMaintenanceActionDetails = js.Array[PendingMaintenanceAction]

type PendingMaintenanceActions = js.Array[ResourcePendingMaintenanceActions]

type ProcessorFeatureList = js.Array[ProcessorFeature]

type RangeList = js.Array[Range]

type ReadReplicaDBClusterIdentifierList = js.Array[String]

type ReadReplicaDBInstanceIdentifierList = js.Array[String]

type ReadReplicaIdentifierList = js.Array[String]

type ReadersArnList = js.Array[String]

type RecurringChargeList = js.Array[RecurringCharge]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`open-read-only`
  - typingsJapgolly.awsSdk.awsSdkStrings.mounted
  - java.lang.String
*/
type ReplicaMode = _ReplicaMode | java.lang.String

type ReservedDBInstanceList = js.Array[ReservedDBInstance]

type ReservedDBInstancesOfferingList = js.Array[ReservedDBInstancesOffering]

type SourceIdsList = js.Array[String]

type SourceRegionList = js.Array[SourceRegion]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`db-instance`
  - typingsJapgolly.awsSdk.awsSdkStrings.`db-parameter-group`
  - typingsJapgolly.awsSdk.awsSdkStrings.`db-security-group`
  - typingsJapgolly.awsSdk.awsSdkStrings.`db-snapshot`
  - typingsJapgolly.awsSdk.awsSdkStrings.`db-cluster`
  - typingsJapgolly.awsSdk.awsSdkStrings.`db-cluster-snapshot`
  - typingsJapgolly.awsSdk.awsSdkStrings.`custom-engine-version`
  - typingsJapgolly.awsSdk.awsSdkStrings.`db-proxy`
  - java.lang.String
*/
type SourceType = _SourceType | java.lang.String

type String = java.lang.String

type String255 = java.lang.String

type StringList = js.Array[String]

type SubnetIdentifierList = js.Array[String]

type SubnetList = js.Array[Subnet]

type SupportedCharacterSetsList = js.Array[CharacterSet]

type SupportedTimezonesList = js.Array[Timezone]

type TStamp = js.Date

type TagList = js.Array[Tag]

type TargetGroupList = js.Array[DBProxyTargetGroup]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNREACHABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTH_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_PROXY_CAPACITY
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_REPLICATION_STATE
  - java.lang.String
*/
type TargetHealthReason = _TargetHealthReason | java.lang.String

type TargetList = js.Array[DBProxyTarget]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READ_WRITE
  - typingsJapgolly.awsSdk.awsSdkStrings.READ_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type TargetRole = _TargetRole | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REGISTERING
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE
  - java.lang.String
*/
type TargetState = _TargetState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RDS_INSTANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.RDS_SERVERLESS_ENDPOINT
  - typingsJapgolly.awsSdk.awsSdkStrings.TRACKED_CLUSTER
  - java.lang.String
*/
type TargetType = _TargetType | java.lang.String

type UserAuthConfigInfoList = js.Array[UserAuthConfigInfo]

type UserAuthConfigList = js.Array[UserAuthConfig]

type ValidStorageOptionsList = js.Array[ValidStorageOptions]

type ValidUpgradeTargetList = js.Array[UpgradeTarget]

type VpcSecurityGroupIdList = js.Array[String]

type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.enabled__
  - typingsJapgolly.awsSdk.awsSdkStrings.disabled__
  - typingsJapgolly.awsSdk.awsSdkStrings.enabling__
  - typingsJapgolly.awsSdk.awsSdkStrings.disabling_
  - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
  - java.lang.String
*/
type WriteForwardingStatus = _WriteForwardingStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2013-01-10`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2013-02-12`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2013-09-09`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2014-09-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2014-10-31`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
