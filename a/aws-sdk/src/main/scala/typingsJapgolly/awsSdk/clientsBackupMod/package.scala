package typingsJapgolly.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.STRINGEQUALS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = String

type AccountId = String

type AdvancedBackupSettings = js.Array[AdvancedBackupSetting]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.ABORTING
  - typingsJapgolly.awsSdk.awsSdkStrings.ABORTED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type BackupJobState = _BackupJobState | String

type BackupJobsList = js.Array[BackupJob]

type BackupOptionKey = String

type BackupOptionValue = String

type BackupOptions = StringDictionary[BackupOptionValue]

type BackupPlanName = String

type BackupPlanTemplatesList = js.Array[BackupPlanTemplatesListMember]

type BackupPlanVersionsList = js.Array[BackupPlansListMember]

type BackupPlansList = js.Array[BackupPlansListMember]

type BackupRuleName = String

type BackupRules = js.Array[BackupRule]

type BackupRulesInput = js.Array[BackupRuleInput]

type BackupSelectionName = String

type BackupSelectionsList = js.Array[BackupSelectionsListMember]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKUP_JOB_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKUP_JOB_COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKUP_JOB_SUCCESSFUL
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKUP_JOB_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKUP_JOB_EXPIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.RESTORE_JOB_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.RESTORE_JOB_COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.RESTORE_JOB_SUCCESSFUL
  - typingsJapgolly.awsSdk.awsSdkStrings.RESTORE_JOB_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.COPY_JOB_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.COPY_JOB_SUCCESSFUL
  - typingsJapgolly.awsSdk.awsSdkStrings.COPY_JOB_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.RECOVERY_POINT_MODIFIED
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKUP_PLAN_CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKUP_PLAN_MODIFIED
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_BACKUP_OBJECT_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_RESTORE_OBJECT_FAILED
  - java.lang.String
*/
type BackupVaultEvent = _BackupVaultEvent | String

type BackupVaultEvents = js.Array[BackupVaultEvent]

type BackupVaultList = js.Array[BackupVaultListMember]

type BackupVaultName = String

type Boolean = scala.Boolean

type ComplianceResourceIdList = js.Array[String]

type ConditionKey = String

type ConditionParameters = js.Array[ConditionParameter]

type ConditionType = STRINGEQUALS | String

type ConditionValue = String

type ControlInputParameters = js.Array[ControlInputParameter]

type ControlName = String

type CopyActions = js.Array[CopyAction]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type CopyJobState = _CopyJobState | String

type CopyJobsList = js.Array[CopyJob]

type CronExpression = String

type FormatList = js.Array[String]

type FrameworkControls = js.Array[FrameworkControl]

type FrameworkDescription = String

type FrameworkList = js.Array[Framework]

type FrameworkName = String

type GlobalSettings = StringDictionary[GlobalSettingsValue]

type GlobalSettingsName = String

type GlobalSettingsValue = String

type IAMPolicy = String

type IAMRoleArn = String

type IsEnabled = scala.Boolean

type ListOfTags = js.Array[Condition]

type Long_ = Double

type MaxFrameworkInputs = Double

type MaxResults = Double

type Metadata = StringDictionary[MetadataValue]

type MetadataKey = String

type MetadataValue = String

type ParameterName = String

type ParameterValue = String

type ProtectedResourcesList = js.Array[ProtectedResource]

type RecoveryPointByBackupVaultList = js.Array[RecoveryPointByBackupVault]

type RecoveryPointByResourceList = js.Array[RecoveryPointByResource]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.PARTIAL
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type RecoveryPointStatus = _RecoveryPointStatus | String

type ReportJobId = String

type ReportJobList = js.Array[ReportJob]

type ReportPlanDescription = String

type ReportPlanList = js.Array[ReportPlan]

type ReportPlanName = String

type ResourceArns = js.Array[ARN]

type ResourceType = String

type ResourceTypeList = js.Array[ARN]

type ResourceTypeManagementPreference = StringDictionary[IsEnabled]

type ResourceTypeOptInPreference = StringDictionary[IsEnabled]

type ResourceTypes = js.Array[ResourceType]

type RestoreJobId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.ABORTED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type RestoreJobStatus = _RestoreJobStatus | String

type RestoreJobsList = js.Array[RestoreJobsListMember]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WARM
  - typingsJapgolly.awsSdk.awsSdkStrings.COLD
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type StorageClass = _StorageClass | String

type TagKey = String

type TagKeyList = js.Array[String]

type TagValue = String

type Tags = StringDictionary[TagValue]

type WindowMinutes = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-11-15`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type integer = Double

type long = Double

type stringList = js.Array[String]

type stringMap = StringDictionary[String]

type timestamp = js.Date
