package typingsJapgolly.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.HOURS
import typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULED_ACTION
import typingsJapgolly.awsSdk.awsSdkStrings.`TXT-DICTIONARY`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = java.lang.String

type AdditionalLimitList = js.Array[AdditionalLimit]

type AdvancedOptions = StringDictionary[String]

type AutoTuneDate = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AutoTuneDesiredState = _AutoTuneDesiredState | java.lang.String

type AutoTuneList = js.Array[AutoTune]

type AutoTuneMaintenanceScheduleList = js.Array[AutoTuneMaintenanceSchedule]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED_AND_ROLLBACK_SCHEDULED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED_AND_ROLLBACK_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED_AND_ROLLBACK_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED_AND_ROLLBACK_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type AutoTuneState = _AutoTuneState | java.lang.String

type AutoTuneType = SCHEDULED_ACTION | java.lang.String

type BackendRole = java.lang.String

type Boolean = scala.Boolean

type ChangeProgressStageList = js.Array[ChangeProgressStage]

type ChangeProgressStageName = java.lang.String

type ChangeProgressStageStatus = java.lang.String

type CloudWatchLogsLogGroupArn = java.lang.String

type CommitMessage = java.lang.String

type CompatibleVersionsList = js.Array[CompatibleVersionsMap]

type ConnectionAlias = java.lang.String

type ConnectionId = java.lang.String

type ConnectionStatusMessage = java.lang.String

type CreatedAt = js.Date

type DeploymentCloseDateTimeStamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_UPDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_ELIGIBLE
  - typingsJapgolly.awsSdk.awsSdkStrings.ELIGIBLE
  - java.lang.String
*/
type DeploymentStatus = _DeploymentStatus | java.lang.String

type DeploymentType = java.lang.String

type DescribePackagesFilterList = js.Array[DescribePackagesFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PackageID
  - typingsJapgolly.awsSdk.awsSdkStrings.PackageName
  - typingsJapgolly.awsSdk.awsSdkStrings.PackageStatus
  - java.lang.String
*/
type DescribePackagesFilterName = _DescribePackagesFilterName | java.lang.String

type DescribePackagesFilterValue = java.lang.String

type DescribePackagesFilterValues = js.Array[DescribePackagesFilterValue]

type Description = java.lang.String

type DisableTimestamp = js.Date

type DomainId = java.lang.String

type DomainInfoList = js.Array[DomainInfo]

type DomainName = java.lang.String

type DomainNameFqdn = java.lang.String

type DomainNameList = js.Array[DomainName]

type DomainPackageDetailsList = js.Array[DomainPackageDetails]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISSOCIATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DISSOCIATION_FAILED
  - java.lang.String
*/
type DomainPackageStatus = _DomainPackageStatus | java.lang.String

type DomainStatusList = js.Array[DomainStatus]

type Double = scala.Double

type DryRun = scala.Boolean

type DurationValue = scala.Double

type EndpointsMap = StringDictionary[ServiceUrl]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OpenSearch
  - typingsJapgolly.awsSdk.awsSdkStrings.Elasticsearch
  - java.lang.String
*/
type EngineType = _EngineType | java.lang.String

type ErrorMessage = java.lang.String

type ErrorType = java.lang.String

type FilterList = js.Array[Filter]

type GUID = java.lang.String

type IdentityPoolId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_ACCEPTANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPROVED
  - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECTING
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type InboundConnectionStatusCode = _InboundConnectionStatusCode | java.lang.String

type InboundConnections = js.Array[InboundConnection]

type InstanceCount = scala.Double

type InstanceRole = java.lang.String

type InstanceRoleList = js.Array[InstanceRole]

type InstanceTypeDetailsList = js.Array[InstanceTypeDetails]

type Integer = scala.Double

type IntegerClass = scala.Double

type Issue = java.lang.String

type Issues = js.Array[Issue]

type KmsKeyId = java.lang.String

type LastUpdated = js.Date

type LimitName = java.lang.String

type LimitValue = java.lang.String

type LimitValueList = js.Array[LimitValue]

type LimitsByRole = StringDictionary[Limits]

type LogPublishingOptions = StringDictionary[LogPublishingOption]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INDEX_SLOW_LOGS
  - typingsJapgolly.awsSdk.awsSdkStrings.SEARCH_SLOW_LOGS
  - typingsJapgolly.awsSdk.awsSdkStrings.ES_APPLICATION_LOGS
  - typingsJapgolly.awsSdk.awsSdkStrings.AUDIT_LOGS
  - java.lang.String
*/
type LogType = _LogType | java.lang.String

type Long = scala.Double

type MaxResults = scala.Double

type MaximumInstanceCount = scala.Double

type Message = java.lang.String

type MinimumInstanceCount = scala.Double

type NextToken = java.lang.String

type NonEmptyString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.m3DotmediumDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m3DotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m3DotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m3Dot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m4DotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m4DotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m4Dot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m4Dot4xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m4Dot10xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m5DotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m5DotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot4xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot12xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot24xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r5DotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r5DotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot4xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot12xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot24xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c5DotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c5DotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot4xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot9xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot18xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.t3DotnanoDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.t3DotmicroDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.t3DotsmallDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.t3DotmediumDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.t3DotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.t3DotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.t3Dot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.ultrawarm1DotmediumDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.ultrawarm1DotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.ultrawarm1DotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.t2DotmicroDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.t2DotsmallDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.t2DotmediumDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r3DotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r3DotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r3Dot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r3Dot4xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r3Dot8xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.i2DotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.i2Dot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.d2DotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.d2Dot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.d2Dot4xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.d2Dot8xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c4DotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c4DotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c4Dot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c4Dot4xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c4Dot8xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r4DotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r4DotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot4xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot8xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot16xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.i3DotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.i3DotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.i3Dot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.i3Dot4xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.i3Dot8xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.i3Dot16xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gDotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gDotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gDot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gDot4xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gDot8xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gDot12xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m6gDotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m6gDotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m6gDot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m6gDot4xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m6gDot8xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.m6gDot12xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c6gDotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c6gDotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c6gDot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c6gDot4xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c6gDot8xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.c6gDot12xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gdDotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gdDotxlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gdDot2xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gdDot4xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gdDot8xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gdDot12xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gdDot16xlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.t4gDotsmallDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.t4gDotmediumDotsearch
  - java.lang.String
*/
type OpenSearchPartitionInstanceType = _OpenSearchPartitionInstanceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ultrawarm1DotmediumDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.ultrawarm1DotlargeDotsearch
  - typingsJapgolly.awsSdk.awsSdkStrings.ultrawarm1DotxlargeDotsearch
  - java.lang.String
*/
type OpenSearchWarmPartitionInstanceType = _OpenSearchWarmPartitionInstanceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RequiresIndexDocuments
  - typingsJapgolly.awsSdk.awsSdkStrings.Processing_
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - java.lang.String
*/
type OptionState = _OptionState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_ACCEPTANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPROVED
  - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECTING
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type OutboundConnectionStatusCode = _OutboundConnectionStatusCode | java.lang.String

type OutboundConnections = js.Array[OutboundConnection]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.PROCESSING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type OverallChangeStatus = _OverallChangeStatus | java.lang.String

type OwnerId = java.lang.String

type PackageDescription = java.lang.String

type PackageDetailsList = js.Array[PackageDetails]

type PackageID = java.lang.String

type PackageName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COPYING
  - typingsJapgolly.awsSdk.awsSdkStrings.COPY_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type PackageStatus = _PackageStatus | java.lang.String

type PackageType = `TXT-DICTIONARY` | java.lang.String

type PackageVersion = java.lang.String

type PackageVersionHistoryList = js.Array[PackageVersionHistory]

type Password = java.lang.String

type PolicyDocument = java.lang.String

type RecurringChargeList = js.Array[RecurringCharge]

type ReferencePath = java.lang.String

type Region = java.lang.String

type ReservationToken = java.lang.String

type ReservedInstanceList = js.Array[ReservedInstance]

type ReservedInstanceOfferingList = js.Array[ReservedInstanceOffering]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL_UPFRONT
  - typingsJapgolly.awsSdk.awsSdkStrings.PARTIAL_UPFRONT
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_UPFRONT
  - java.lang.String
*/
type ReservedInstancePaymentOption = _ReservedInstancePaymentOption | java.lang.String

type RoleArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_ROLLBACK
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_ROLLBACK
  - java.lang.String
*/
type RollbackOnDisable = _RollbackOnDisable | java.lang.String

type S3BucketName = java.lang.String

type S3Key = java.lang.String

type SAMLEntityId = java.lang.String

type SAMLMetadata = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JVM_HEAP_SIZE_TUNING
  - typingsJapgolly.awsSdk.awsSdkStrings.JVM_YOUNG_GEN_TUNING
  - java.lang.String
*/
type ScheduledAutoTuneActionType = _ScheduledAutoTuneActionType | java.lang.String

type ScheduledAutoTuneDescription = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LOW
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - java.lang.String
*/
type ScheduledAutoTuneSeverityType = _ScheduledAutoTuneSeverityType | java.lang.String

type ServiceUrl = java.lang.String

type StartAt = js.Date

type StartTimestamp = js.Date

type StorageSubTypeName = java.lang.String

type StorageTypeLimitList = js.Array[StorageTypeLimit]

type StorageTypeList = js.Array[StorageType]

type StorageTypeName = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-0-2019-07`
  - typingsJapgolly.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-2-2019-07`
  - java.lang.String
*/
type TLSSecurityPolicy = _TLSSecurityPolicy | java.lang.String

type TagKey = java.lang.String

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TimeUnit = HOURS | java.lang.String

type TotalNumberOfStages = scala.Double

type UIntValue = scala.Double

type UpdateTimestamp = js.Date

type UpgradeHistoryList = js.Array[UpgradeHistory]

type UpgradeName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED_WITH_ISSUES
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type UpgradeStatus = _UpgradeStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRE_UPGRADE_CHECK
  - typingsJapgolly.awsSdk.awsSdkStrings.SNAPSHOT
  - typingsJapgolly.awsSdk.awsSdkStrings.UPGRADE
  - java.lang.String
*/
type UpgradeStep = _UpgradeStep | java.lang.String

type UpgradeStepsList = js.Array[UpgradeStepItem]

type UserPoolId = java.lang.String

type Username = java.lang.String

type ValueStringList = js.Array[NonEmptyString]

type VersionList = js.Array[VersionString]

type VersionString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.standard__
  - typingsJapgolly.awsSdk.awsSdkStrings.gp2_
  - typingsJapgolly.awsSdk.awsSdkStrings.io1_
  - typingsJapgolly.awsSdk.awsSdkStrings.gp3_
  - java.lang.String
*/
type VolumeType = _VolumeType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2021-01-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
