package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object backupMod {
  type ARN = java.lang.String
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
  type BackupJobState = typingsJapgolly.awsSdk.backupMod._BackupJobState | java.lang.String
  type BackupJobsList = js.Array[typingsJapgolly.awsSdk.backupMod.BackupJob]
  type BackupPlanName = java.lang.String
  type BackupPlanTemplatesList = js.Array[typingsJapgolly.awsSdk.backupMod.BackupPlanTemplatesListMember]
  type BackupPlanVersionsList = js.Array[typingsJapgolly.awsSdk.backupMod.BackupPlansListMember]
  type BackupPlansList = js.Array[typingsJapgolly.awsSdk.backupMod.BackupPlansListMember]
  type BackupRuleName = java.lang.String
  type BackupRules = js.Array[typingsJapgolly.awsSdk.backupMod.BackupRule]
  type BackupRulesInput = js.Array[typingsJapgolly.awsSdk.backupMod.BackupRuleInput]
  type BackupSelectionName = java.lang.String
  type BackupSelectionsList = js.Array[typingsJapgolly.awsSdk.backupMod.BackupSelectionsListMember]
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
    - java.lang.String
  */
  type BackupVaultEvent = typingsJapgolly.awsSdk.backupMod._BackupVaultEvent | java.lang.String
  type BackupVaultEvents = js.Array[typingsJapgolly.awsSdk.backupMod.BackupVaultEvent]
  type BackupVaultList = js.Array[typingsJapgolly.awsSdk.backupMod.BackupVaultListMember]
  type BackupVaultName = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.backupMod.ClientApiVersions
  type ConditionKey = java.lang.String
  type ConditionType = typingsJapgolly.awsSdk.awsSdkStrings.STRINGEQUALS | java.lang.String
  type ConditionValue = java.lang.String
  type CopyActions = js.Array[typingsJapgolly.awsSdk.backupMod.CopyAction]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CopyJobState = typingsJapgolly.awsSdk.backupMod._CopyJobState | java.lang.String
  type CopyJobsList = js.Array[typingsJapgolly.awsSdk.backupMod.CopyJob]
  type CronExpression = java.lang.String
  type IAMPolicy = java.lang.String
  type IAMRoleArn = java.lang.String
  type ListOfTags = js.Array[typingsJapgolly.awsSdk.backupMod.Condition]
  type Long_ = scala.Double
  type MaxResults = scala.Double
  type Metadata = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.backupMod.MetadataValue]
  type MetadataKey = java.lang.String
  type MetadataValue = java.lang.String
  type ProtectedResourcesList = js.Array[typingsJapgolly.awsSdk.backupMod.ProtectedResource]
  type RecoveryPointByBackupVaultList = js.Array[typingsJapgolly.awsSdk.backupMod.RecoveryPointByBackupVault]
  type RecoveryPointByResourceList = js.Array[typingsJapgolly.awsSdk.backupMod.RecoveryPointByResource]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.PARTIAL
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type RecoveryPointStatus = typingsJapgolly.awsSdk.backupMod._RecoveryPointStatus | java.lang.String
  type ResourceArns = js.Array[typingsJapgolly.awsSdk.backupMod.ARN]
  type ResourceType = java.lang.String
  type ResourceTypes = js.Array[typingsJapgolly.awsSdk.backupMod.ResourceType]
  type RestoreJobId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.ABORTED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RestoreJobStatus = typingsJapgolly.awsSdk.backupMod._RestoreJobStatus | java.lang.String
  type RestoreJobsList = js.Array[typingsJapgolly.awsSdk.backupMod.RestoreJobsListMember]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WARM
    - typingsJapgolly.awsSdk.awsSdkStrings.COLD
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type StorageClass = typingsJapgolly.awsSdk.backupMod._StorageClass | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[java.lang.String]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.backupMod.TagValue]
  type WindowMinutes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-11-15`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.backupMod._apiVersion | java.lang.String
  type long = scala.Double
  type timestamp = js.Date
}
