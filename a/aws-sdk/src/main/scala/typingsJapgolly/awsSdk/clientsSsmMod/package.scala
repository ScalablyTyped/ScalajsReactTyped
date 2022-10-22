package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.ChangeRequest
import typingsJapgolly.awsSdk.awsSdkStrings.Equal_
import typingsJapgolly.awsSdk.awsSdkStrings.JsonSerDe
import typingsJapgolly.awsSdk.awsSdkStrings.Sha256_
import typingsJapgolly.awsSdk.awsSdkStrings.Share
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Account = java.lang.String

type AccountId = java.lang.String

type AccountIdList = js.Array[AccountId]

type AccountSharingInfoList = js.Array[AccountSharingInfo]

type Accounts = js.Array[Account]

type ActivationCode = java.lang.String

type ActivationDescription = java.lang.String

type ActivationId = java.lang.String

type ActivationList = js.Array[Activation]

type AgentErrorCode = java.lang.String

type AggregatorSchemaOnly = scala.Boolean

type AlarmList = js.Array[Alarm]

type AlarmName = java.lang.String

type AlarmStateInformationList = js.Array[AlarmStateInformation]

type AllowedPattern = java.lang.String

type ApplyOnlyAtCronInterval = scala.Boolean

type ApproveAfterDays = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
  - typingsJapgolly.awsSdk.awsSdkStrings.LOW
  - typingsJapgolly.awsSdk.awsSdkStrings.UNSPECIFIED
  - java.lang.String
*/
type AssociationComplianceSeverity = _AssociationComplianceSeverity | java.lang.String

type AssociationDescriptionList = js.Array[AssociationDescription]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ExecutionId
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreatedTime
  - java.lang.String
*/
type AssociationExecutionFilterKey = _AssociationExecutionFilterKey | java.lang.String

type AssociationExecutionFilterList = js.Array[AssociationExecutionFilter]

type AssociationExecutionFilterValue = java.lang.String

type AssociationExecutionId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceId
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceType
  - java.lang.String
*/
type AssociationExecutionTargetsFilterKey = _AssociationExecutionTargetsFilterKey | java.lang.String

type AssociationExecutionTargetsFilterList = js.Array[AssociationExecutionTargetsFilter]

type AssociationExecutionTargetsFilterValue = java.lang.String

type AssociationExecutionTargetsList = js.Array[AssociationExecutionTarget]

type AssociationExecutionsList = js.Array[AssociationExecution]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceId
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.AssociationId
  - typingsJapgolly.awsSdk.awsSdkStrings.AssociationStatusName
  - typingsJapgolly.awsSdk.awsSdkStrings.LastExecutedBefore
  - typingsJapgolly.awsSdk.awsSdkStrings.LastExecutedAfter
  - typingsJapgolly.awsSdk.awsSdkStrings.AssociationName
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceGroupName
  - java.lang.String
*/
type AssociationFilterKey = _AssociationFilterKey | java.lang.String

type AssociationFilterList = js.Array[AssociationFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EQUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
  - java.lang.String
*/
type AssociationFilterOperatorType = _AssociationFilterOperatorType | java.lang.String

type AssociationFilterValue = java.lang.String

type AssociationId = java.lang.String

type AssociationIdList = js.Array[AssociationId]

type AssociationList = js.Array[Association]

type AssociationName = java.lang.String

type AssociationResourceId = java.lang.String

type AssociationResourceType = java.lang.String

type AssociationStatusAggregatedCount = StringDictionary[InstanceCount]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type AssociationStatusName = _AssociationStatusName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTO
  - typingsJapgolly.awsSdk.awsSdkStrings.MANUAL
  - java.lang.String
*/
type AssociationSyncCompliance = _AssociationSyncCompliance | java.lang.String

type AssociationVersion = java.lang.String

type AssociationVersionList = js.Array[AssociationVersionInfo]

type AttachmentContentList = js.Array[AttachmentContent]

type AttachmentHash = java.lang.String

type AttachmentHashType = Sha256_ | java.lang.String

type AttachmentIdentifier = java.lang.String

type AttachmentInformationList = js.Array[AttachmentInformation]

type AttachmentName = java.lang.String

type AttachmentUrl = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SourceUrl
  - typingsJapgolly.awsSdk.awsSdkStrings.S3FileUrl
  - typingsJapgolly.awsSdk.awsSdkStrings.AttachmentReference
  - java.lang.String
*/
type AttachmentsSourceKey = _AttachmentsSourceKey | java.lang.String

type AttachmentsSourceList = js.Array[AttachmentsSource]

type AttachmentsSourceValue = java.lang.String

type AttachmentsSourceValues = js.Array[AttachmentsSourceValue]

type AttributeName = java.lang.String

type AttributeValue = java.lang.String

type AutomationActionName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DocumentNamePrefix
  - typingsJapgolly.awsSdk.awsSdkStrings.ExecutionStatus
  - typingsJapgolly.awsSdk.awsSdkStrings.ExecutionId
  - typingsJapgolly.awsSdk.awsSdkStrings.ParentExecutionId
  - typingsJapgolly.awsSdk.awsSdkStrings.CurrentAction
  - typingsJapgolly.awsSdk.awsSdkStrings.StartTimeBefore
  - typingsJapgolly.awsSdk.awsSdkStrings.StartTimeAfter
  - typingsJapgolly.awsSdk.awsSdkStrings.AutomationType
  - typingsJapgolly.awsSdk.awsSdkStrings.TagKey
  - typingsJapgolly.awsSdk.awsSdkStrings.TargetResourceGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.AutomationSubtype
  - typingsJapgolly.awsSdk.awsSdkStrings.OpsItemId
  - java.lang.String
*/
type AutomationExecutionFilterKey = _AutomationExecutionFilterKey | java.lang.String

type AutomationExecutionFilterList = js.Array[AutomationExecutionFilter]

type AutomationExecutionFilterValue = java.lang.String

type AutomationExecutionFilterValueList = js.Array[AutomationExecutionFilterValue]

type AutomationExecutionId = java.lang.String

type AutomationExecutionMetadataList = js.Array[AutomationExecutionMetadata]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Waiting_
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.TimedOut_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelling_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingApproval
  - typingsJapgolly.awsSdk.awsSdkStrings.Approved_
  - typingsJapgolly.awsSdk.awsSdkStrings.Rejected_
  - typingsJapgolly.awsSdk.awsSdkStrings.Scheduled_
  - typingsJapgolly.awsSdk.awsSdkStrings.RunbookInProgress
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingChangeCalendarOverride
  - typingsJapgolly.awsSdk.awsSdkStrings.ChangeCalendarOverrideApproved
  - typingsJapgolly.awsSdk.awsSdkStrings.ChangeCalendarOverrideRejected
  - typingsJapgolly.awsSdk.awsSdkStrings.CompletedWithSuccess
  - typingsJapgolly.awsSdk.awsSdkStrings.CompletedWithFailure
  - java.lang.String
*/
type AutomationExecutionStatus = _AutomationExecutionStatus | java.lang.String

type AutomationParameterKey = java.lang.String

type AutomationParameterMap = StringDictionary[AutomationParameterValueList]

type AutomationParameterValue = java.lang.String

type AutomationParameterValueList = js.Array[AutomationParameterValue]

type AutomationSubtype = ChangeRequest | java.lang.String

type AutomationTargetParameterName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CrossAccount
  - typingsJapgolly.awsSdk.awsSdkStrings.Local_
  - java.lang.String
*/
type AutomationType = _AutomationType | java.lang.String

type BaselineDescription = java.lang.String

type BaselineId = java.lang.String

type BaselineName = java.lang.String

type BatchErrorMessage = java.lang.String

type Boolean = scala.Boolean

type CalendarNameOrARN = java.lang.String

type CalendarNameOrARNList = js.Array[CalendarNameOrARN]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OPEN
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED
  - java.lang.String
*/
type CalendarState = _CalendarState | java.lang.String

type Category = java.lang.String

type CategoryEnumList = js.Array[Category]

type CategoryList = js.Array[Category]

type ChangeDetailsValue = java.lang.String

type ChangeRequestName = java.lang.String

type ClientToken = java.lang.String

type CloudWatchLogGroupName = java.lang.String

type CloudWatchOutputEnabled = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InvokedAfter
  - typingsJapgolly.awsSdk.awsSdkStrings.InvokedBefore
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - typingsJapgolly.awsSdk.awsSdkStrings.ExecutionStage
  - typingsJapgolly.awsSdk.awsSdkStrings.DocumentName
  - java.lang.String
*/
type CommandFilterKey = _CommandFilterKey | java.lang.String

type CommandFilterList = js.Array[CommandFilter]

type CommandFilterValue = java.lang.String

type CommandId = java.lang.String

type CommandInvocationList = js.Array[CommandInvocation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Delayed
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - typingsJapgolly.awsSdk.awsSdkStrings.TimedOut_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelling_
  - java.lang.String
*/
type CommandInvocationStatus = _CommandInvocationStatus | java.lang.String

type CommandList = js.Array[Command]

type CommandMaxResults = Double

type CommandPluginList = js.Array[CommandPlugin]

type CommandPluginName = java.lang.String

type CommandPluginOutput = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.TimedOut_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type CommandPluginStatus = _CommandPluginStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.TimedOut_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelling_
  - java.lang.String
*/
type CommandStatus = _CommandStatus | java.lang.String

type Comment = java.lang.String

type CompletedCount = Double

type ComplianceExecutionId = java.lang.String

type ComplianceExecutionType = java.lang.String

type ComplianceFilterValue = java.lang.String

type ComplianceItemContentHash = java.lang.String

type ComplianceItemDetails = StringDictionary[AttributeValue]

type ComplianceItemEntryList = js.Array[ComplianceItemEntry]

type ComplianceItemId = java.lang.String

type ComplianceItemList = js.Array[ComplianceItem]

type ComplianceItemTitle = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EQUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EQUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.BEGIN_WITH
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
  - java.lang.String
*/
type ComplianceQueryOperatorType = _ComplianceQueryOperatorType | java.lang.String

type ComplianceResourceId = java.lang.String

type ComplianceResourceIdList = js.Array[ComplianceResourceId]

type ComplianceResourceType = java.lang.String

type ComplianceResourceTypeList = js.Array[ComplianceResourceType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
  - typingsJapgolly.awsSdk.awsSdkStrings.LOW
  - typingsJapgolly.awsSdk.awsSdkStrings.INFORMATIONAL
  - typingsJapgolly.awsSdk.awsSdkStrings.UNSPECIFIED
  - java.lang.String
*/
type ComplianceSeverity = _ComplianceSeverity | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANT
  - typingsJapgolly.awsSdk.awsSdkStrings.NON_COMPLIANT
  - java.lang.String
*/
type ComplianceStatus = _ComplianceStatus | java.lang.String

type ComplianceStringFilterKey = java.lang.String

type ComplianceStringFilterList = js.Array[ComplianceStringFilter]

type ComplianceStringFilterValueList = js.Array[ComplianceFilterValue]

type ComplianceSummaryCount = Double

type ComplianceSummaryItemList = js.Array[ComplianceSummaryItem]

type ComplianceTypeName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.PARTIAL
  - java.lang.String
*/
type ComplianceUploadType = _ComplianceUploadType | java.lang.String

type ComputerName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Connected_
  - typingsJapgolly.awsSdk.awsSdkStrings.NotConnected
  - java.lang.String
*/
type ConnectionStatus = _ConnectionStatus | java.lang.String

type ContentLength = Double

type CreateAssociationBatchRequestEntries = js.Array[CreateAssociationBatchRequestEntry]

type CreatedDate = js.Date

type DateTime = js.Date

type DefaultBaseline = scala.Boolean

type DefaultInstanceName = java.lang.String

type DeliveryTimedOutCount = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ActivationIds
  - typingsJapgolly.awsSdk.awsSdkStrings.DefaultInstanceName
  - typingsJapgolly.awsSdk.awsSdkStrings.IamRole
  - java.lang.String
*/
type DescribeActivationsFilterKeys = _DescribeActivationsFilterKeys | java.lang.String

type DescribeActivationsFilterList = js.Array[DescribeActivationsFilter]

type DescriptionInDocument = java.lang.String

type DocumentARN = java.lang.String

type DocumentAuthor = java.lang.String

type DocumentContent = java.lang.String

type DocumentDisplayName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.Owner_
  - typingsJapgolly.awsSdk.awsSdkStrings.PlatformTypes
  - typingsJapgolly.awsSdk.awsSdkStrings.DocumentType
  - java.lang.String
*/
type DocumentFilterKey = _DocumentFilterKey | java.lang.String

type DocumentFilterList = js.Array[DocumentFilter]

type DocumentFilterValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.YAML
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT
  - java.lang.String
*/
type DocumentFormat = _DocumentFormat | java.lang.String

type DocumentHash = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Sha256_
  - typingsJapgolly.awsSdk.awsSdkStrings.Sha1_
  - java.lang.String
*/
type DocumentHashType = _DocumentHashType | java.lang.String

type DocumentIdentifierList = js.Array[DocumentIdentifier]

type DocumentKeyValuesFilterKey = java.lang.String

type DocumentKeyValuesFilterList = js.Array[DocumentKeyValuesFilter]

type DocumentKeyValuesFilterValue = java.lang.String

type DocumentKeyValuesFilterValues = js.Array[DocumentKeyValuesFilterValue]

type DocumentMetadataEnum = typingsJapgolly.awsSdk.awsSdkStrings.DocumentReviews | java.lang.String

type DocumentName = java.lang.String

type DocumentOwner = java.lang.String

type DocumentParameterDefaultValue = java.lang.String

type DocumentParameterDescrption = java.lang.String

type DocumentParameterList = js.Array[DocumentParameter]

type DocumentParameterName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.String_
  - typingsJapgolly.awsSdk.awsSdkStrings.StringList_
  - java.lang.String
*/
type DocumentParameterType = _DocumentParameterType | java.lang.String

type DocumentPermissionMaxResults = Double

type DocumentPermissionType = Share | java.lang.String

type DocumentRequiresList = js.Array[DocumentRequires]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SendForReview
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateReview
  - typingsJapgolly.awsSdk.awsSdkStrings.Approve_
  - typingsJapgolly.awsSdk.awsSdkStrings.Reject_
  - java.lang.String
*/
type DocumentReviewAction = _DocumentReviewAction | java.lang.String

type DocumentReviewComment = java.lang.String

type DocumentReviewCommentList = js.Array[DocumentReviewCommentSource]

type DocumentReviewCommentType = typingsJapgolly.awsSdk.awsSdkStrings.Comment | java.lang.String

type DocumentReviewerResponseList = js.Array[DocumentReviewerResponseSource]

type DocumentSchemaVersion = java.lang.String

type DocumentSha1 = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - typingsJapgolly.awsSdk.awsSdkStrings.Updating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type DocumentStatus = _DocumentStatus | java.lang.String

type DocumentStatusInformation = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Command_
  - typingsJapgolly.awsSdk.awsSdkStrings.Policy_
  - typingsJapgolly.awsSdk.awsSdkStrings.Automation_
  - typingsJapgolly.awsSdk.awsSdkStrings.Session
  - typingsJapgolly.awsSdk.awsSdkStrings.Package_
  - typingsJapgolly.awsSdk.awsSdkStrings.ApplicationConfiguration
  - typingsJapgolly.awsSdk.awsSdkStrings.ApplicationConfigurationSchema
  - typingsJapgolly.awsSdk.awsSdkStrings.DeploymentStrategy
  - typingsJapgolly.awsSdk.awsSdkStrings.ChangeCalendar
  - typingsJapgolly.awsSdk.awsSdkStrings.AutomationDotChangeTemplate
  - typingsJapgolly.awsSdk.awsSdkStrings.ProblemAnalysis
  - typingsJapgolly.awsSdk.awsSdkStrings.ProblemAnalysisTemplate
  - typingsJapgolly.awsSdk.awsSdkStrings.CloudFormation_
  - typingsJapgolly.awsSdk.awsSdkStrings.ConformancePackTemplate
  - java.lang.String
*/
type DocumentType = _DocumentType | java.lang.String

type DocumentVersion = java.lang.String

type DocumentVersionList = js.Array[DocumentVersionInfo]

type DocumentVersionName = java.lang.String

type DocumentVersionNumber = java.lang.String

type DryRun = scala.Boolean

type EffectiveInstanceAssociationMaxResults = Double

type EffectivePatchList = js.Array[EffectivePatch]

type ErrorCount = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Auto_
  - typingsJapgolly.awsSdk.awsSdkStrings.Interactive_
  - java.lang.String
*/
type ExecutionMode = _ExecutionMode | java.lang.String

type ExecutionRoleName = java.lang.String

type ExpirationDate = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - typingsJapgolly.awsSdk.awsSdkStrings.ALARM
  - java.lang.String
*/
type ExternalAlarmState = _ExternalAlarmState | java.lang.String

type FailedCreateAssociationList = js.Array[FailedCreateAssociation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Client
  - typingsJapgolly.awsSdk.awsSdkStrings.Server_
  - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
  - java.lang.String
*/
type Fault = _Fault | java.lang.String

type GetInventorySchemaMaxResults = Double

type GetOpsMetadataMaxResults = Double

type GetParametersByPathMaxResults = Double

type IPAddress = java.lang.String

type ISO8601String = java.lang.String

type IamRole = java.lang.String

type IdempotencyToken = java.lang.String

type InstallOverrideList = java.lang.String

type InstanceAssociationExecutionSummary = java.lang.String

type InstanceAssociationList = js.Array[InstanceAssociation]

type InstanceAssociationStatusAggregatedCount = StringDictionary[InstanceCount]

type InstanceAssociationStatusInfos = js.Array[InstanceAssociationStatusInfo]

type InstanceCount = Double

type InstanceId = java.lang.String

type InstanceIdList = js.Array[InstanceId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceIds
  - typingsJapgolly.awsSdk.awsSdkStrings.AgentVersion
  - typingsJapgolly.awsSdk.awsSdkStrings.PingStatus
  - typingsJapgolly.awsSdk.awsSdkStrings.PlatformTypes
  - typingsJapgolly.awsSdk.awsSdkStrings.ActivationIds
  - typingsJapgolly.awsSdk.awsSdkStrings.IamRole
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceType
  - typingsJapgolly.awsSdk.awsSdkStrings.AssociationStatus
  - java.lang.String
*/
type InstanceInformationFilterKey = _InstanceInformationFilterKey | java.lang.String

type InstanceInformationFilterList = js.Array[InstanceInformationFilter]

type InstanceInformationFilterValue = java.lang.String

type InstanceInformationFilterValueSet = js.Array[InstanceInformationFilterValue]

type InstanceInformationList = js.Array[InstanceInformation]

type InstanceInformationStringFilterKey = java.lang.String

type InstanceInformationStringFilterList = js.Array[InstanceInformationStringFilter]

type InstancePatchStateFilterKey = java.lang.String

type InstancePatchStateFilterList = js.Array[InstancePatchStateFilter]

type InstancePatchStateFilterValue = java.lang.String

type InstancePatchStateFilterValues = js.Array[InstancePatchStateFilterValue]

type InstancePatchStateList = js.Array[InstancePatchState]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Equal_
  - typingsJapgolly.awsSdk.awsSdkStrings.NotEqual
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThan
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThan
  - java.lang.String
*/
type InstancePatchStateOperatorType = _InstancePatchStateOperatorType | java.lang.String

type InstancePatchStatesList = js.Array[InstancePatchState]

type InstanceTagName = java.lang.String

type InstancesCount = Double

type Integer = Double

type InventoryAggregatorExpression = java.lang.String

type InventoryAggregatorList = js.Array[InventoryAggregator]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.string__
  - typingsJapgolly.awsSdk.awsSdkStrings.number__
  - java.lang.String
*/
type InventoryAttributeDataType = _InventoryAttributeDataType | java.lang.String

type InventoryDeletionLastStatusMessage = java.lang.String

type InventoryDeletionLastStatusUpdateTime = js.Date

type InventoryDeletionStartTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
  - java.lang.String
*/
type InventoryDeletionStatus = _InventoryDeletionStatus | java.lang.String

type InventoryDeletionSummaryItems = js.Array[InventoryDeletionSummaryItem]

type InventoryDeletionsList = js.Array[InventoryDeletionStatusItem]

type InventoryFilterKey = java.lang.String

type InventoryFilterList = js.Array[InventoryFilter]

type InventoryFilterValue = java.lang.String

type InventoryFilterValueList = js.Array[InventoryFilterValue]

type InventoryGroupList = js.Array[InventoryGroup]

type InventoryGroupName = java.lang.String

type InventoryItemAttributeList = js.Array[InventoryItemAttribute]

type InventoryItemAttributeName = java.lang.String

type InventoryItemCaptureTime = java.lang.String

type InventoryItemContentContext = StringDictionary[AttributeValue]

type InventoryItemContentHash = java.lang.String

type InventoryItemEntry = StringDictionary[AttributeValue]

type InventoryItemEntryList = js.Array[InventoryItemEntry]

type InventoryItemList = js.Array[InventoryItem]

type InventoryItemSchemaResultList = js.Array[InventoryItemSchema]

type InventoryItemSchemaVersion = java.lang.String

type InventoryItemTypeName = java.lang.String

type InventoryItemTypeNameFilter = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Equal_
  - typingsJapgolly.awsSdk.awsSdkStrings.NotEqual
  - typingsJapgolly.awsSdk.awsSdkStrings.BeginWith
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThan
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThan
  - typingsJapgolly.awsSdk.awsSdkStrings.Exists
  - java.lang.String
*/
type InventoryQueryOperatorType = _InventoryQueryOperatorType | java.lang.String

type InventoryResultEntityId = java.lang.String

type InventoryResultEntityList = js.Array[InventoryResultEntity]

type InventoryResultItemKey = java.lang.String

type InventoryResultItemMap = StringDictionary[InventoryResultItem]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DisableSchema
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteSchema
  - java.lang.String
*/
type InventorySchemaDeleteOption = _InventorySchemaDeleteOption | java.lang.String

type InventoryTypeDisplayName = java.lang.String

type InvocationTraceOutput = java.lang.String

type IsSubTypeSchema = scala.Boolean

type KeyList = js.Array[TagKey]

type LastResourceDataSyncMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Successful_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - java.lang.String
*/
type LastResourceDataSyncStatus = _LastResourceDataSyncStatus | java.lang.String

type LastResourceDataSyncTime = js.Date

type LastSuccessfulResourceDataSyncTime = js.Date

type ListOpsMetadataMaxResults = Double

type Long = Double

type MaintenanceWindowAllowUnassociatedTargets = scala.Boolean

type MaintenanceWindowCutoff = Double

type MaintenanceWindowDescription = java.lang.String

type MaintenanceWindowDurationHours = Double

type MaintenanceWindowEnabled = scala.Boolean

type MaintenanceWindowExecutionId = java.lang.String

type MaintenanceWindowExecutionList = js.Array[MaintenanceWindowExecution]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLING
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.SKIPPED_OVERLAPPING
  - java.lang.String
*/
type MaintenanceWindowExecutionStatus = _MaintenanceWindowExecutionStatus | java.lang.String

type MaintenanceWindowExecutionStatusDetails = java.lang.String

type MaintenanceWindowExecutionTaskExecutionId = java.lang.String

type MaintenanceWindowExecutionTaskId = java.lang.String

type MaintenanceWindowExecutionTaskIdList = js.Array[MaintenanceWindowExecutionTaskId]

type MaintenanceWindowExecutionTaskIdentityList = js.Array[MaintenanceWindowExecutionTaskIdentity]

type MaintenanceWindowExecutionTaskInvocationId = java.lang.String

type MaintenanceWindowExecutionTaskInvocationIdentityList = js.Array[MaintenanceWindowExecutionTaskInvocationIdentity]

type MaintenanceWindowExecutionTaskInvocationParameters = java.lang.String

type MaintenanceWindowFilterKey = java.lang.String

type MaintenanceWindowFilterList = js.Array[MaintenanceWindowFilter]

type MaintenanceWindowFilterValue = java.lang.String

type MaintenanceWindowFilterValues = js.Array[MaintenanceWindowFilterValue]

type MaintenanceWindowId = java.lang.String

type MaintenanceWindowIdentityList = js.Array[MaintenanceWindowIdentity]

type MaintenanceWindowLambdaClientContext = java.lang.String

type MaintenanceWindowLambdaPayload = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type MaintenanceWindowLambdaQualifier = java.lang.String

type MaintenanceWindowMaxResults = Double

type MaintenanceWindowName = java.lang.String

type MaintenanceWindowOffset = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_GROUP
  - java.lang.String
*/
type MaintenanceWindowResourceType = _MaintenanceWindowResourceType | java.lang.String

type MaintenanceWindowSchedule = java.lang.String

type MaintenanceWindowSearchMaxResults = Double

type MaintenanceWindowStepFunctionsInput = java.lang.String

type MaintenanceWindowStepFunctionsName = java.lang.String

type MaintenanceWindowStringDateTime = java.lang.String

type MaintenanceWindowTargetId = java.lang.String

type MaintenanceWindowTargetList = js.Array[MaintenanceWindowTarget]

type MaintenanceWindowTaskArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTINUE_TASK
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCEL_TASK
  - java.lang.String
*/
type MaintenanceWindowTaskCutoffBehavior = _MaintenanceWindowTaskCutoffBehavior | java.lang.String

type MaintenanceWindowTaskId = java.lang.String

type MaintenanceWindowTaskList = js.Array[MaintenanceWindowTask]

type MaintenanceWindowTaskParameterName = java.lang.String

type MaintenanceWindowTaskParameterValue = java.lang.String

type MaintenanceWindowTaskParameterValueList = js.Array[MaintenanceWindowTaskParameterValue]

type MaintenanceWindowTaskParameters = StringDictionary[MaintenanceWindowTaskParameterValueExpression]

type MaintenanceWindowTaskParametersList = js.Array[MaintenanceWindowTaskParameters]

type MaintenanceWindowTaskPriority = Double

type MaintenanceWindowTaskTargetId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUN_COMMAND
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATION
  - typingsJapgolly.awsSdk.awsSdkStrings.STEP_FUNCTIONS
  - typingsJapgolly.awsSdk.awsSdkStrings.LAMBDA
  - java.lang.String
*/
type MaintenanceWindowTaskType = _MaintenanceWindowTaskType | java.lang.String

type MaintenanceWindowTimezone = java.lang.String

type MaintenanceWindowsForTargetList = js.Array[MaintenanceWindowIdentityForTarget]

type ManagedInstanceId = java.lang.String

type MaxConcurrency = java.lang.String

type MaxErrors = java.lang.String

type MaxResults = Double

type MaxResultsEC2Compatible = Double

type MaxSessionDuration = java.lang.String

type MetadataKey = java.lang.String

type MetadataKeysToDeleteList = js.Array[MetadataKey]

type MetadataMap = StringDictionary[MetadataValue]

type MetadataValueString = java.lang.String

type NextToken = java.lang.String

type NormalStringMap = StringDictionary[String]

type NotificationArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.All_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.TimedOut_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type NotificationEvent = _NotificationEvent | java.lang.String

type NotificationEventList = js.Array[NotificationEvent]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Command_
  - typingsJapgolly.awsSdk.awsSdkStrings.Invocation
  - java.lang.String
*/
type NotificationType = _NotificationType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS
  - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_LINUX
  - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_LINUX_2
  - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_LINUX_2022
  - typingsJapgolly.awsSdk.awsSdkStrings.UBUNTU
  - typingsJapgolly.awsSdk.awsSdkStrings.REDHAT_ENTERPRISE_LINUX
  - typingsJapgolly.awsSdk.awsSdkStrings.SUSE
  - typingsJapgolly.awsSdk.awsSdkStrings.CENTOS
  - typingsJapgolly.awsSdk.awsSdkStrings.ORACLE_LINUX
  - typingsJapgolly.awsSdk.awsSdkStrings.DEBIAN
  - typingsJapgolly.awsSdk.awsSdkStrings.MACOS
  - typingsJapgolly.awsSdk.awsSdkStrings.RASPBIAN
  - typingsJapgolly.awsSdk.awsSdkStrings.ROCKY_LINUX
  - java.lang.String
*/
type OperatingSystem = _OperatingSystem | java.lang.String

type OpsAggregatorList = js.Array[OpsAggregator]

type OpsAggregatorType = java.lang.String

type OpsAggregatorValue = java.lang.String

type OpsAggregatorValueKey = java.lang.String

type OpsAggregatorValueMap = StringDictionary[OpsAggregatorValue]

type OpsDataAttributeName = java.lang.String

type OpsDataTypeName = java.lang.String

type OpsEntityId = java.lang.String

type OpsEntityItemCaptureTime = java.lang.String

type OpsEntityItemEntry = StringDictionary[AttributeValue]

type OpsEntityItemEntryList = js.Array[OpsEntityItemEntry]

type OpsEntityItemKey = java.lang.String

type OpsEntityItemMap = StringDictionary[OpsEntityItem]

type OpsEntityList = js.Array[OpsEntity]

type OpsFilterKey = java.lang.String

type OpsFilterList = js.Array[OpsFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Equal_
  - typingsJapgolly.awsSdk.awsSdkStrings.NotEqual
  - typingsJapgolly.awsSdk.awsSdkStrings.BeginWith
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThan
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThan
  - typingsJapgolly.awsSdk.awsSdkStrings.Exists
  - java.lang.String
*/
type OpsFilterOperatorType = _OpsFilterOperatorType | java.lang.String

type OpsFilterValue = java.lang.String

type OpsFilterValueList = js.Array[OpsFilterValue]

type OpsItemCategory = java.lang.String

type OpsItemDataKey = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SearchableString
  - typingsJapgolly.awsSdk.awsSdkStrings.String_
  - java.lang.String
*/
type OpsItemDataType = _OpsItemDataType | java.lang.String

type OpsItemDataValueString = java.lang.String

type OpsItemDescription = java.lang.String

type OpsItemEventFilterKey = typingsJapgolly.awsSdk.awsSdkStrings.OpsItemId | java.lang.String

type OpsItemEventFilterOperator = Equal_ | java.lang.String

type OpsItemEventFilterValue = java.lang.String

type OpsItemEventFilterValues = js.Array[OpsItemEventFilterValue]

type OpsItemEventFilters = js.Array[OpsItemEventFilter]

type OpsItemEventMaxResults = Double

type OpsItemEventSummaries = js.Array[OpsItemEventSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreatedBy
  - typingsJapgolly.awsSdk.awsSdkStrings.Source_
  - typingsJapgolly.awsSdk.awsSdkStrings.Priority_
  - typingsJapgolly.awsSdk.awsSdkStrings.Title_
  - typingsJapgolly.awsSdk.awsSdkStrings.OpsItemId
  - typingsJapgolly.awsSdk.awsSdkStrings.CreatedTime
  - typingsJapgolly.awsSdk.awsSdkStrings.LastModifiedTime
  - typingsJapgolly.awsSdk.awsSdkStrings.ActualStartTime
  - typingsJapgolly.awsSdk.awsSdkStrings.ActualEndTime
  - typingsJapgolly.awsSdk.awsSdkStrings.PlannedStartTime
  - typingsJapgolly.awsSdk.awsSdkStrings.PlannedEndTime
  - typingsJapgolly.awsSdk.awsSdkStrings.OperationalData
  - typingsJapgolly.awsSdk.awsSdkStrings.OperationalDataKey
  - typingsJapgolly.awsSdk.awsSdkStrings.OperationalDataValue
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceId
  - typingsJapgolly.awsSdk.awsSdkStrings.AutomationId
  - typingsJapgolly.awsSdk.awsSdkStrings.Category
  - typingsJapgolly.awsSdk.awsSdkStrings.Severity_
  - typingsJapgolly.awsSdk.awsSdkStrings.OpsItemType
  - typingsJapgolly.awsSdk.awsSdkStrings.ChangeRequestByRequesterArn
  - typingsJapgolly.awsSdk.awsSdkStrings.ChangeRequestByRequesterName
  - typingsJapgolly.awsSdk.awsSdkStrings.ChangeRequestByApproverArn
  - typingsJapgolly.awsSdk.awsSdkStrings.ChangeRequestByApproverName
  - typingsJapgolly.awsSdk.awsSdkStrings.ChangeRequestByTemplate
  - typingsJapgolly.awsSdk.awsSdkStrings.ChangeRequestByTargetsResourceGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.InsightByType
  - java.lang.String
*/
type OpsItemFilterKey = _OpsItemFilterKey | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Equal_
  - typingsJapgolly.awsSdk.awsSdkStrings.Contains_
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThan
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThan
  - java.lang.String
*/
type OpsItemFilterOperator = _OpsItemFilterOperator | java.lang.String

type OpsItemFilterValue = java.lang.String

type OpsItemFilterValues = js.Array[OpsItemFilterValue]

type OpsItemFilters = js.Array[OpsItemFilter]

type OpsItemId = java.lang.String

type OpsItemMaxResults = Double

type OpsItemNotifications = js.Array[OpsItemNotification]

type OpsItemOperationalData = StringDictionary[OpsItemDataValue]

type OpsItemOpsDataKeysList = js.Array[String]

type OpsItemPriority = Double

type OpsItemRelatedItemAssociationId = java.lang.String

type OpsItemRelatedItemAssociationResourceType = java.lang.String

type OpsItemRelatedItemAssociationResourceUri = java.lang.String

type OpsItemRelatedItemAssociationType = java.lang.String

type OpsItemRelatedItemSummaries = js.Array[OpsItemRelatedItemSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceType
  - typingsJapgolly.awsSdk.awsSdkStrings.AssociationId
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceUri
  - java.lang.String
*/
type OpsItemRelatedItemsFilterKey = _OpsItemRelatedItemsFilterKey | java.lang.String

type OpsItemRelatedItemsFilterOperator = Equal_ | java.lang.String

type OpsItemRelatedItemsFilterValue = java.lang.String

type OpsItemRelatedItemsFilterValues = js.Array[OpsItemRelatedItemsFilterValue]

type OpsItemRelatedItemsFilters = js.Array[OpsItemRelatedItemsFilter]

type OpsItemRelatedItemsMaxResults = Double

type OpsItemSeverity = java.lang.String

type OpsItemSource = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Open_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Resolved_
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.TimedOut_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelling_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.CompletedWithSuccess
  - typingsJapgolly.awsSdk.awsSdkStrings.CompletedWithFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.Scheduled_
  - typingsJapgolly.awsSdk.awsSdkStrings.RunbookInProgress
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingChangeCalendarOverride
  - typingsJapgolly.awsSdk.awsSdkStrings.ChangeCalendarOverrideApproved
  - typingsJapgolly.awsSdk.awsSdkStrings.ChangeCalendarOverrideRejected
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingApproval
  - typingsJapgolly.awsSdk.awsSdkStrings.Approved_
  - typingsJapgolly.awsSdk.awsSdkStrings.Rejected_
  - typingsJapgolly.awsSdk.awsSdkStrings.Closed_
  - java.lang.String
*/
type OpsItemStatus = _OpsItemStatus | java.lang.String

type OpsItemSummaries = js.Array[OpsItemSummary]

type OpsItemTitle = java.lang.String

type OpsItemType = java.lang.String

type OpsMetadataArn = java.lang.String

type OpsMetadataFilterKey = java.lang.String

type OpsMetadataFilterList = js.Array[OpsMetadataFilter]

type OpsMetadataFilterValue = java.lang.String

type OpsMetadataFilterValueList = js.Array[OpsMetadataFilterValue]

type OpsMetadataList = js.Array[OpsMetadata]

type OpsMetadataResourceId = java.lang.String

type OpsResultAttributeList = js.Array[OpsResultAttribute]

type OutputSourceId = java.lang.String

type OutputSourceType = java.lang.String

type OwnerInformation = java.lang.String

type PSParameterName = java.lang.String

type PSParameterSelector = java.lang.String

type PSParameterValue = java.lang.String

type PSParameterVersion = Double

type ParameterDataType = java.lang.String

type ParameterDescription = java.lang.String

type ParameterHistoryList = js.Array[ParameterHistory]

type ParameterKeyId = java.lang.String

type ParameterLabel = java.lang.String

type ParameterLabelList = js.Array[ParameterLabel]

type ParameterList = js.Array[Parameter]

type ParameterMetadataList = js.Array[ParameterMetadata]

type ParameterName = java.lang.String

type ParameterNameList = js.Array[PSParameterName]

type ParameterPolicies = java.lang.String

type ParameterPolicyList = js.Array[ParameterInlinePolicy]

type ParameterStringFilterKey = java.lang.String

type ParameterStringFilterList = js.Array[ParameterStringFilter]

type ParameterStringFilterValue = java.lang.String

type ParameterStringFilterValueList = js.Array[ParameterStringFilterValue]

type ParameterStringQueryOption = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Standard_
  - typingsJapgolly.awsSdk.awsSdkStrings.Advanced_
  - typingsJapgolly.awsSdk.awsSdkStrings.`Intelligent-Tiering`
  - java.lang.String
*/
type ParameterTier = _ParameterTier | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.String_
  - typingsJapgolly.awsSdk.awsSdkStrings.StringList_
  - typingsJapgolly.awsSdk.awsSdkStrings.SecureString
  - java.lang.String
*/
type ParameterType = _ParameterType | java.lang.String

type ParameterValue = java.lang.String

type ParameterValueList = js.Array[ParameterValue]

type Parameters = StringDictionary[ParameterValueList]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.Type_
  - typingsJapgolly.awsSdk.awsSdkStrings.KeyId
  - java.lang.String
*/
type ParametersFilterKey = _ParametersFilterKey | java.lang.String

type ParametersFilterList = js.Array[ParametersFilter]

type ParametersFilterValue = java.lang.String

type ParametersFilterValueList = js.Array[ParametersFilterValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW_AS_DEPENDENCY
  - typingsJapgolly.awsSdk.awsSdkStrings.BLOCK
  - java.lang.String
*/
type PatchAction = _PatchAction | java.lang.String

type PatchAdvisoryId = java.lang.String

type PatchAdvisoryIdList = js.Array[PatchAdvisoryId]

type PatchArch = java.lang.String

type PatchBaselineIdentityList = js.Array[PatchBaselineIdentity]

type PatchBaselineMaxResults = Double

type PatchBugzillaId = java.lang.String

type PatchBugzillaIdList = js.Array[PatchBugzillaId]

type PatchCVEId = java.lang.String

type PatchCVEIdList = js.Array[PatchCVEId]

type PatchCVEIds = java.lang.String

type PatchClassification = java.lang.String

type PatchComplianceDataList = js.Array[PatchComplianceData]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTALLED
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTALLED_OTHER
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTALLED_PENDING_REBOOT
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTALLED_REJECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSING
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_APPLICABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type PatchComplianceDataState = _PatchComplianceDataState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
  - typingsJapgolly.awsSdk.awsSdkStrings.LOW
  - typingsJapgolly.awsSdk.awsSdkStrings.INFORMATIONAL
  - typingsJapgolly.awsSdk.awsSdkStrings.UNSPECIFIED
  - java.lang.String
*/
type PatchComplianceLevel = _PatchComplianceLevel | java.lang.String

type PatchComplianceMaxResults = Double

type PatchContentUrl = java.lang.String

type PatchCriticalNonCompliantCount = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.APPROVED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_APPROVAL
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPLICIT_APPROVED
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPLICIT_REJECTED
  - java.lang.String
*/
type PatchDeploymentStatus = _PatchDeploymentStatus | java.lang.String

type PatchDescription = java.lang.String

type PatchEpoch = Double

type PatchFailedCount = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ARCH
  - typingsJapgolly.awsSdk.awsSdkStrings.ADVISORY_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.BUGZILLA_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.PATCH_SET
  - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCT
  - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCT_FAMILY
  - typingsJapgolly.awsSdk.awsSdkStrings.CLASSIFICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.CVE_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.EPOCH
  - typingsJapgolly.awsSdk.awsSdkStrings.MSRC_SEVERITY
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.PATCH_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.SECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIORITY
  - typingsJapgolly.awsSdk.awsSdkStrings.REPOSITORY
  - typingsJapgolly.awsSdk.awsSdkStrings.RELEASE
  - typingsJapgolly.awsSdk.awsSdkStrings.SEVERITY
  - typingsJapgolly.awsSdk.awsSdkStrings.SECURITY
  - typingsJapgolly.awsSdk.awsSdkStrings.VERSION
  - java.lang.String
*/
type PatchFilterKey = _PatchFilterKey | java.lang.String

type PatchFilterList = js.Array[PatchFilter]

type PatchFilterValue = java.lang.String

type PatchFilterValueList = js.Array[PatchFilterValue]

type PatchGroup = java.lang.String

type PatchGroupList = js.Array[PatchGroup]

type PatchGroupPatchBaselineMappingList = js.Array[PatchGroupPatchBaselineMapping]

type PatchId = java.lang.String

type PatchIdList = js.Array[PatchId]

type PatchInstalledCount = Double

type PatchInstalledOtherCount = Double

type PatchInstalledPendingRebootCount = Double

type PatchInstalledRejectedCount = Double

type PatchKbNumber = java.lang.String

type PatchLanguage = java.lang.String

type PatchList = js.Array[Patch]

type PatchMissingCount = Double

type PatchMsrcNumber = java.lang.String

type PatchMsrcSeverity = java.lang.String

type PatchName = java.lang.String

type PatchNotApplicableCount = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Scan
  - typingsJapgolly.awsSdk.awsSdkStrings.Install_
  - java.lang.String
*/
type PatchOperationType = _PatchOperationType | java.lang.String

type PatchOrchestratorFilterKey = java.lang.String

type PatchOrchestratorFilterList = js.Array[PatchOrchestratorFilter]

type PatchOrchestratorFilterValue = java.lang.String

type PatchOrchestratorFilterValues = js.Array[PatchOrchestratorFilterValue]

type PatchOtherNonCompliantCount = Double

type PatchProduct = java.lang.String

type PatchProductFamily = java.lang.String

type PatchPropertiesList = js.Array[PatchPropertyEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCT
  - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCT_FAMILY
  - typingsJapgolly.awsSdk.awsSdkStrings.CLASSIFICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.MSRC_SEVERITY
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIORITY
  - typingsJapgolly.awsSdk.awsSdkStrings.SEVERITY
  - java.lang.String
*/
type PatchProperty = _PatchProperty | java.lang.String

type PatchPropertyEntry = StringDictionary[AttributeValue]

type PatchRelease = java.lang.String

type PatchRepository = java.lang.String

type PatchRuleList = js.Array[PatchRule]

type PatchSecurityNonCompliantCount = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OS
  - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION
  - java.lang.String
*/
type PatchSet = _PatchSet | java.lang.String

type PatchSeverity = java.lang.String

type PatchSourceConfiguration = java.lang.String

type PatchSourceList = js.Array[PatchSource]

type PatchSourceName = java.lang.String

type PatchSourceProduct = java.lang.String

type PatchSourceProductList = js.Array[PatchSourceProduct]

type PatchStringDateTime = java.lang.String

type PatchTitle = java.lang.String

type PatchUnreportedNotApplicableCount = Double

type PatchVendor = java.lang.String

type PatchVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Online_
  - typingsJapgolly.awsSdk.awsSdkStrings.ConnectionLost
  - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
type PingStatus = _PingStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Windows_
  - typingsJapgolly.awsSdk.awsSdkStrings.Linux_
  - typingsJapgolly.awsSdk.awsSdkStrings.MacOS_
  - java.lang.String
*/
type PlatformType = _PlatformType | java.lang.String

type PlatformTypeList = js.Array[PlatformType]

type Product = java.lang.String

type PutInventoryMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RebootIfNeeded
  - typingsJapgolly.awsSdk.awsSdkStrings.NoReboot
  - java.lang.String
*/
type RebootOption = _RebootOption | java.lang.String

type Region = java.lang.String

type Regions = js.Array[Region]

type RegistrationLimit = Double

type RegistrationMetadataKey = java.lang.String

type RegistrationMetadataList = js.Array[RegistrationMetadataItem]

type RegistrationMetadataValue = java.lang.String

type RegistrationsCount = Double

type RelatedOpsItems = js.Array[RelatedOpsItem]

type RemainingCount = Double

type ResourceComplianceSummaryItemList = js.Array[ResourceComplianceSummaryItem]

type ResourceCount = Double

type ResourceCountByStatus = java.lang.String

type ResourceDataSyncAWSKMSKeyARN = java.lang.String

type ResourceDataSyncCreatedTime = js.Date

type ResourceDataSyncDestinationDataSharingType = java.lang.String

type ResourceDataSyncEnableAllOpsDataSources = scala.Boolean

type ResourceDataSyncIncludeFutureRegions = scala.Boolean

type ResourceDataSyncItemList = js.Array[ResourceDataSyncItem]

type ResourceDataSyncLastModifiedTime = js.Date

type ResourceDataSyncName = java.lang.String

type ResourceDataSyncOrganizationSourceType = java.lang.String

type ResourceDataSyncOrganizationalUnitId = java.lang.String

type ResourceDataSyncOrganizationalUnitList = js.Array[ResourceDataSyncOrganizationalUnit]

type ResourceDataSyncS3BucketName = java.lang.String

type ResourceDataSyncS3Format = JsonSerDe | java.lang.String

type ResourceDataSyncS3Prefix = java.lang.String

type ResourceDataSyncS3Region = java.lang.String

type ResourceDataSyncSourceRegion = java.lang.String

type ResourceDataSyncSourceRegionList = js.Array[ResourceDataSyncSourceRegion]

type ResourceDataSyncSourceType = java.lang.String

type ResourceDataSyncState = java.lang.String

type ResourceDataSyncType = java.lang.String

type ResourceId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ManagedInstance
  - typingsJapgolly.awsSdk.awsSdkStrings.Document_
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2Instance
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Document_
  - typingsJapgolly.awsSdk.awsSdkStrings.ManagedInstance
  - typingsJapgolly.awsSdk.awsSdkStrings.MaintenanceWindow
  - typingsJapgolly.awsSdk.awsSdkStrings.Parameter
  - typingsJapgolly.awsSdk.awsSdkStrings.PatchBaseline
  - typingsJapgolly.awsSdk.awsSdkStrings.OpsItem
  - typingsJapgolly.awsSdk.awsSdkStrings.OpsMetadata
  - typingsJapgolly.awsSdk.awsSdkStrings.Automation_
  - typingsJapgolly.awsSdk.awsSdkStrings.Association_
  - java.lang.String
*/
type ResourceTypeForTagging = _ResourceTypeForTagging | java.lang.String

type ResponseCode = Double

type ResultAttributeList = js.Array[ResultAttribute]

type ReviewInformationList = js.Array[ReviewInformation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.APPROVED
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_REVIEWED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
  - java.lang.String
*/
type ReviewStatus = _ReviewStatus | java.lang.String

type Reviewer = java.lang.String

type Runbooks = js.Array[Runbook]

type S3BucketName = java.lang.String

type S3KeyPrefix = java.lang.String

type S3Region = java.lang.String

type ScheduleExpression = java.lang.String

type ScheduleOffset = Double

type ScheduledWindowExecutionList = js.Array[ScheduledWindowExecution]

type ServiceRole = java.lang.String

type ServiceSettingId = java.lang.String

type ServiceSettingValue = java.lang.String

type SessionDetails = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InvokedAfter
  - typingsJapgolly.awsSdk.awsSdkStrings.InvokedBefore
  - typingsJapgolly.awsSdk.awsSdkStrings.Target
  - typingsJapgolly.awsSdk.awsSdkStrings.Owner_
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - typingsJapgolly.awsSdk.awsSdkStrings.SessionId
  - java.lang.String
*/
type SessionFilterKey = _SessionFilterKey | java.lang.String

type SessionFilterList = js.Array[SessionFilter]

type SessionFilterValue = java.lang.String

type SessionId = java.lang.String

type SessionList = js.Array[Session]

type SessionManagerCloudWatchOutputUrl = java.lang.String

type SessionManagerParameterName = java.lang.String

type SessionManagerParameterValue = java.lang.String

type SessionManagerParameterValueList = js.Array[SessionManagerParameterValue]

type SessionManagerParameters = StringDictionary[SessionManagerParameterValueList]

type SessionManagerS3OutputUrl = java.lang.String

type SessionMaxResults = Double

type SessionOwner = java.lang.String

type SessionReason = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - typingsJapgolly.awsSdk.awsSdkStrings.History
  - java.lang.String
*/
type SessionState = _SessionState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Connected_
  - typingsJapgolly.awsSdk.awsSdkStrings.Connecting_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disconnected_
  - typingsJapgolly.awsSdk.awsSdkStrings.Terminated_
  - typingsJapgolly.awsSdk.awsSdkStrings.Terminating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type SessionStatus = _SessionStatus | java.lang.String

type SessionTarget = java.lang.String

type SharedDocumentVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Approve_
  - typingsJapgolly.awsSdk.awsSdkStrings.Reject_
  - typingsJapgolly.awsSdk.awsSdkStrings.StartStep
  - typingsJapgolly.awsSdk.awsSdkStrings.StopStep
  - typingsJapgolly.awsSdk.awsSdkStrings.Resume_
  - java.lang.String
*/
type SignalType = _SignalType | java.lang.String

type SnapshotDownloadUrl = java.lang.String

type SnapshotId = java.lang.String

type SourceId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonInstance
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonIoTColonColonThing
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonManagedInstance
  - java.lang.String
*/
type SourceType = _SourceType | java.lang.String

type StandardErrorContent = java.lang.String

type StandardOutputContent = java.lang.String

type StatusAdditionalInfo = java.lang.String

type StatusDetails = java.lang.String

type StatusMessage = java.lang.String

type StatusName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.StartTimeBefore
  - typingsJapgolly.awsSdk.awsSdkStrings.StartTimeAfter
  - typingsJapgolly.awsSdk.awsSdkStrings.StepExecutionStatus
  - typingsJapgolly.awsSdk.awsSdkStrings.StepExecutionId
  - typingsJapgolly.awsSdk.awsSdkStrings.StepName
  - typingsJapgolly.awsSdk.awsSdkStrings.Action_
  - java.lang.String
*/
type StepExecutionFilterKey = _StepExecutionFilterKey | java.lang.String

type StepExecutionFilterList = js.Array[StepExecutionFilter]

type StepExecutionFilterValue = java.lang.String

type StepExecutionFilterValueList = js.Array[StepExecutionFilterValue]

type StepExecutionList = js.Array[StepExecution]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancel_
  - java.lang.String
*/
type StopType = _StopType | java.lang.String

type StreamUrl = java.lang.String

type String = java.lang.String

type StringDateTime = java.lang.String

type StringList = js.Array[String]

type TagKey = java.lang.String

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TargetCount = Double

type TargetKey = java.lang.String

type TargetLocations = js.Array[TargetLocation]

type TargetMap = StringDictionary[TargetMapValueList]

type TargetMapKey = java.lang.String

type TargetMapValue = java.lang.String

type TargetMapValueList = js.Array[TargetMapValue]

type TargetMaps = js.Array[TargetMap]

type TargetParameterList = js.Array[ParameterValue]

type TargetType = java.lang.String

type TargetValue = java.lang.String

type TargetValues = js.Array[TargetValue]

type Targets = js.Array[Target]

type TimeoutSeconds = Double

type TokenValue = java.lang.String

type TotalCount = Double

type UUID = java.lang.String

type Url = java.lang.String

type ValidNextStep = java.lang.String

type ValidNextStepList = js.Array[ValidNextStep]

type Version = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2014-11-06`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
