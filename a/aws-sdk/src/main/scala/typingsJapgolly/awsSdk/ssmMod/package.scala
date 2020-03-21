package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ssmMod {
  type Account = java.lang.String
  type AccountId = java.lang.String
  type AccountIdList = js.Array[typingsJapgolly.awsSdk.ssmMod.AccountId]
  type AccountSharingInfoList = js.Array[typingsJapgolly.awsSdk.ssmMod.AccountSharingInfo]
  type Accounts = js.Array[typingsJapgolly.awsSdk.ssmMod.Account]
  type ActivationCode = java.lang.String
  type ActivationDescription = java.lang.String
  type ActivationId = java.lang.String
  type ActivationList = js.Array[typingsJapgolly.awsSdk.ssmMod.Activation]
  type AgentErrorCode = java.lang.String
  type AggregatorSchemaOnly = scala.Boolean
  type AllowedPattern = java.lang.String
  type ApproveAfterDays = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
    - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
    - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
    - typingsJapgolly.awsSdk.awsSdkStrings.LOW
    - typingsJapgolly.awsSdk.awsSdkStrings.UNSPECIFIED
    - java.lang.String
  */
  type AssociationComplianceSeverity = typingsJapgolly.awsSdk.ssmMod._AssociationComplianceSeverity | java.lang.String
  type AssociationDescriptionList = js.Array[typingsJapgolly.awsSdk.ssmMod.AssociationDescription]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ExecutionId
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreatedTime
    - java.lang.String
  */
  type AssociationExecutionFilterKey = typingsJapgolly.awsSdk.ssmMod._AssociationExecutionFilterKey | java.lang.String
  type AssociationExecutionFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.AssociationExecutionFilter]
  type AssociationExecutionFilterValue = java.lang.String
  type AssociationExecutionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourceId
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourceType
    - java.lang.String
  */
  type AssociationExecutionTargetsFilterKey = typingsJapgolly.awsSdk.ssmMod._AssociationExecutionTargetsFilterKey | java.lang.String
  type AssociationExecutionTargetsFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.AssociationExecutionTargetsFilter]
  type AssociationExecutionTargetsFilterValue = java.lang.String
  type AssociationExecutionTargetsList = js.Array[typingsJapgolly.awsSdk.ssmMod.AssociationExecutionTarget]
  type AssociationExecutionsList = js.Array[typingsJapgolly.awsSdk.ssmMod.AssociationExecution]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceId
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.AssociationId
    - typingsJapgolly.awsSdk.awsSdkStrings.AssociationStatusName
    - typingsJapgolly.awsSdk.awsSdkStrings.LastExecutedBefore
    - typingsJapgolly.awsSdk.awsSdkStrings.LastExecutedAfter
    - typingsJapgolly.awsSdk.awsSdkStrings.AssociationName
    - java.lang.String
  */
  type AssociationFilterKey = typingsJapgolly.awsSdk.ssmMod._AssociationFilterKey | java.lang.String
  type AssociationFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.AssociationFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EQUAL
    - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
    - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
    - java.lang.String
  */
  type AssociationFilterOperatorType = typingsJapgolly.awsSdk.ssmMod._AssociationFilterOperatorType | java.lang.String
  type AssociationFilterValue = java.lang.String
  type AssociationId = java.lang.String
  type AssociationIdList = js.Array[typingsJapgolly.awsSdk.ssmMod.AssociationId]
  type AssociationList = js.Array[typingsJapgolly.awsSdk.ssmMod.Association]
  type AssociationName = java.lang.String
  type AssociationResourceId = java.lang.String
  type AssociationResourceType = java.lang.String
  type AssociationStatusAggregatedCount = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.InstanceCount]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Success_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type AssociationStatusName = typingsJapgolly.awsSdk.ssmMod._AssociationStatusName | java.lang.String
  type AssociationVersion = java.lang.String
  type AssociationVersionList = js.Array[typingsJapgolly.awsSdk.ssmMod.AssociationVersionInfo]
  type AttachmentContentList = js.Array[typingsJapgolly.awsSdk.ssmMod.AttachmentContent]
  type AttachmentHash = java.lang.String
  type AttachmentHashType = typingsJapgolly.awsSdk.awsSdkStrings.Sha256_ | java.lang.String
  type AttachmentIdentifier = java.lang.String
  type AttachmentInformationList = js.Array[typingsJapgolly.awsSdk.ssmMod.AttachmentInformation]
  type AttachmentName = java.lang.String
  type AttachmentUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SourceUrl
    - typingsJapgolly.awsSdk.awsSdkStrings.S3FileUrl
    - typingsJapgolly.awsSdk.awsSdkStrings.AttachmentReference
    - java.lang.String
  */
  type AttachmentsSourceKey = typingsJapgolly.awsSdk.ssmMod._AttachmentsSourceKey | java.lang.String
  type AttachmentsSourceList = js.Array[typingsJapgolly.awsSdk.ssmMod.AttachmentsSource]
  type AttachmentsSourceValue = java.lang.String
  type AttachmentsSourceValues = js.Array[typingsJapgolly.awsSdk.ssmMod.AttachmentsSourceValue]
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
    - java.lang.String
  */
  type AutomationExecutionFilterKey = typingsJapgolly.awsSdk.ssmMod._AutomationExecutionFilterKey | java.lang.String
  type AutomationExecutionFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.AutomationExecutionFilter]
  type AutomationExecutionFilterValue = java.lang.String
  type AutomationExecutionFilterValueList = js.Array[typingsJapgolly.awsSdk.ssmMod.AutomationExecutionFilterValue]
  type AutomationExecutionId = java.lang.String
  type AutomationExecutionMetadataList = js.Array[typingsJapgolly.awsSdk.ssmMod.AutomationExecutionMetadata]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Waiting_
    - typingsJapgolly.awsSdk.awsSdkStrings.Success_
    - typingsJapgolly.awsSdk.awsSdkStrings.TimedOut_
    - typingsJapgolly.awsSdk.awsSdkStrings.Cancelling_
    - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type AutomationExecutionStatus = typingsJapgolly.awsSdk.ssmMod._AutomationExecutionStatus | java.lang.String
  type AutomationParameterKey = java.lang.String
  type AutomationParameterMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.AutomationParameterValueList]
  type AutomationParameterValue = java.lang.String
  type AutomationParameterValueList = js.Array[typingsJapgolly.awsSdk.ssmMod.AutomationParameterValue]
  type AutomationTargetParameterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CrossAccount
    - typingsJapgolly.awsSdk.awsSdkStrings.Local_
    - java.lang.String
  */
  type AutomationType = typingsJapgolly.awsSdk.ssmMod._AutomationType | java.lang.String
  type BaselineDescription = java.lang.String
  type BaselineId = java.lang.String
  type BaselineName = java.lang.String
  type BatchErrorMessage = java.lang.String
  type Boolean = scala.Boolean
  type CalendarNameOrARN = java.lang.String
  type CalendarNameOrARNList = js.Array[typingsJapgolly.awsSdk.ssmMod.CalendarNameOrARN]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OPEN
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type CalendarState = typingsJapgolly.awsSdk.ssmMod._CalendarState | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.ssmMod.ClientApiVersions
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
  type CommandFilterKey = typingsJapgolly.awsSdk.ssmMod._CommandFilterKey | java.lang.String
  type CommandFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.CommandFilter]
  type CommandFilterValue = java.lang.String
  type CommandId = java.lang.String
  type CommandInvocationList = js.Array[typingsJapgolly.awsSdk.ssmMod.CommandInvocation]
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
  type CommandInvocationStatus = typingsJapgolly.awsSdk.ssmMod._CommandInvocationStatus | java.lang.String
  type CommandList = js.Array[typingsJapgolly.awsSdk.ssmMod.Command]
  type CommandMaxResults = scala.Double
  type CommandPluginList = js.Array[typingsJapgolly.awsSdk.ssmMod.CommandPlugin]
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
  type CommandPluginStatus = typingsJapgolly.awsSdk.ssmMod._CommandPluginStatus | java.lang.String
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
  type CommandStatus = typingsJapgolly.awsSdk.ssmMod._CommandStatus | java.lang.String
  type Comment = java.lang.String
  type CompletedCount = scala.Double
  type ComplianceExecutionId = java.lang.String
  type ComplianceExecutionType = java.lang.String
  type ComplianceFilterValue = java.lang.String
  type ComplianceItemContentHash = java.lang.String
  type ComplianceItemDetails = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.AttributeValue]
  type ComplianceItemEntryList = js.Array[typingsJapgolly.awsSdk.ssmMod.ComplianceItemEntry]
  type ComplianceItemId = java.lang.String
  type ComplianceItemList = js.Array[typingsJapgolly.awsSdk.ssmMod.ComplianceItem]
  type ComplianceItemTitle = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EQUAL
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EQUAL
    - typingsJapgolly.awsSdk.awsSdkStrings.BEGIN_WITH
    - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
    - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
    - java.lang.String
  */
  type ComplianceQueryOperatorType = typingsJapgolly.awsSdk.ssmMod._ComplianceQueryOperatorType | java.lang.String
  type ComplianceResourceId = java.lang.String
  type ComplianceResourceIdList = js.Array[typingsJapgolly.awsSdk.ssmMod.ComplianceResourceId]
  type ComplianceResourceType = java.lang.String
  type ComplianceResourceTypeList = js.Array[typingsJapgolly.awsSdk.ssmMod.ComplianceResourceType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
    - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
    - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
    - typingsJapgolly.awsSdk.awsSdkStrings.LOW
    - typingsJapgolly.awsSdk.awsSdkStrings.INFORMATIONAL
    - typingsJapgolly.awsSdk.awsSdkStrings.UNSPECIFIED
    - java.lang.String
  */
  type ComplianceSeverity = typingsJapgolly.awsSdk.ssmMod._ComplianceSeverity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANT
    - typingsJapgolly.awsSdk.awsSdkStrings.NON_COMPLIANT
    - java.lang.String
  */
  type ComplianceStatus = typingsJapgolly.awsSdk.ssmMod._ComplianceStatus | java.lang.String
  type ComplianceStringFilterKey = java.lang.String
  type ComplianceStringFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.ComplianceStringFilter]
  type ComplianceStringFilterValueList = js.Array[typingsJapgolly.awsSdk.ssmMod.ComplianceFilterValue]
  type ComplianceSummaryCount = scala.Double
  type ComplianceSummaryItemList = js.Array[typingsJapgolly.awsSdk.ssmMod.ComplianceSummaryItem]
  type ComplianceTypeName = java.lang.String
  type ComputerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Connected_
    - typingsJapgolly.awsSdk.awsSdkStrings.NotConnected
    - java.lang.String
  */
  type ConnectionStatus = typingsJapgolly.awsSdk.ssmMod._ConnectionStatus | java.lang.String
  type ContentLength = scala.Double
  type CreateAssociationBatchRequestEntries = js.Array[typingsJapgolly.awsSdk.ssmMod.CreateAssociationBatchRequestEntry]
  type CreatedDate = js.Date
  type DateTime = js.Date
  type DefaultBaseline = scala.Boolean
  type DefaultInstanceName = java.lang.String
  type DeliveryTimedOutCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ActivationIds
    - typingsJapgolly.awsSdk.awsSdkStrings.DefaultInstanceName
    - typingsJapgolly.awsSdk.awsSdkStrings.IamRole
    - java.lang.String
  */
  type DescribeActivationsFilterKeys = typingsJapgolly.awsSdk.ssmMod._DescribeActivationsFilterKeys | java.lang.String
  type DescribeActivationsFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.DescribeActivationsFilter]
  type DescriptionInDocument = java.lang.String
  type DocumentARN = java.lang.String
  type DocumentContent = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.Owner_
    - typingsJapgolly.awsSdk.awsSdkStrings.PlatformTypes
    - typingsJapgolly.awsSdk.awsSdkStrings.DocumentType
    - java.lang.String
  */
  type DocumentFilterKey = typingsJapgolly.awsSdk.ssmMod._DocumentFilterKey | java.lang.String
  type DocumentFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.DocumentFilter]
  type DocumentFilterValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.YAML
    - typingsJapgolly.awsSdk.awsSdkStrings.JSON
    - typingsJapgolly.awsSdk.awsSdkStrings.TEXT
    - java.lang.String
  */
  type DocumentFormat = typingsJapgolly.awsSdk.ssmMod._DocumentFormat | java.lang.String
  type DocumentHash = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Sha256_
    - typingsJapgolly.awsSdk.awsSdkStrings.Sha1_
    - java.lang.String
  */
  type DocumentHashType = typingsJapgolly.awsSdk.ssmMod._DocumentHashType | java.lang.String
  type DocumentIdentifierList = js.Array[typingsJapgolly.awsSdk.ssmMod.DocumentIdentifier]
  type DocumentKeyValuesFilterKey = java.lang.String
  type DocumentKeyValuesFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.DocumentKeyValuesFilter]
  type DocumentKeyValuesFilterValue = java.lang.String
  type DocumentKeyValuesFilterValues = js.Array[typingsJapgolly.awsSdk.ssmMod.DocumentKeyValuesFilterValue]
  type DocumentName = java.lang.String
  type DocumentOwner = java.lang.String
  type DocumentParameterDefaultValue = java.lang.String
  type DocumentParameterDescrption = java.lang.String
  type DocumentParameterList = js.Array[typingsJapgolly.awsSdk.ssmMod.DocumentParameter]
  type DocumentParameterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.String_
    - typingsJapgolly.awsSdk.awsSdkStrings.StringList
    - java.lang.String
  */
  type DocumentParameterType = typingsJapgolly.awsSdk.ssmMod._DocumentParameterType | java.lang.String
  type DocumentPermissionType = typingsJapgolly.awsSdk.awsSdkStrings.Share | java.lang.String
  type DocumentRequiresList = js.Array[typingsJapgolly.awsSdk.ssmMod.DocumentRequires]
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
  type DocumentStatus = typingsJapgolly.awsSdk.ssmMod._DocumentStatus | java.lang.String
  type DocumentStatusInformation = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Command
    - typingsJapgolly.awsSdk.awsSdkStrings.Policy_
    - typingsJapgolly.awsSdk.awsSdkStrings.Automation_
    - typingsJapgolly.awsSdk.awsSdkStrings.Session
    - typingsJapgolly.awsSdk.awsSdkStrings.Package
    - typingsJapgolly.awsSdk.awsSdkStrings.ApplicationConfiguration
    - typingsJapgolly.awsSdk.awsSdkStrings.ApplicationConfigurationSchema
    - typingsJapgolly.awsSdk.awsSdkStrings.DeploymentStrategy
    - typingsJapgolly.awsSdk.awsSdkStrings.ChangeCalendar
    - java.lang.String
  */
  type DocumentType = typingsJapgolly.awsSdk.ssmMod._DocumentType | java.lang.String
  type DocumentVersion = java.lang.String
  type DocumentVersionList = js.Array[typingsJapgolly.awsSdk.ssmMod.DocumentVersionInfo]
  type DocumentVersionName = java.lang.String
  type DocumentVersionNumber = java.lang.String
  type DryRun = scala.Boolean
  type EffectiveInstanceAssociationMaxResults = scala.Double
  type EffectivePatchList = js.Array[typingsJapgolly.awsSdk.ssmMod.EffectivePatch]
  type ErrorCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Auto_
    - typingsJapgolly.awsSdk.awsSdkStrings.Interactive_
    - java.lang.String
  */
  type ExecutionMode = typingsJapgolly.awsSdk.ssmMod._ExecutionMode | java.lang.String
  type ExecutionRoleName = java.lang.String
  type ExpirationDate = js.Date
  type FailedCreateAssociationList = js.Array[typingsJapgolly.awsSdk.ssmMod.FailedCreateAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Client
    - typingsJapgolly.awsSdk.awsSdkStrings.Server_
    - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type Fault = typingsJapgolly.awsSdk.ssmMod._Fault | java.lang.String
  type GetInventorySchemaMaxResults = scala.Double
  type GetParametersByPathMaxResults = scala.Double
  type IPAddress = java.lang.String
  type ISO8601String = java.lang.String
  type IamRole = java.lang.String
  type IdempotencyToken = java.lang.String
  type InstallOverrideList = java.lang.String
  type InstanceAssociationExecutionSummary = java.lang.String
  type InstanceAssociationList = js.Array[typingsJapgolly.awsSdk.ssmMod.InstanceAssociation]
  type InstanceAssociationStatusAggregatedCount = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.InstanceCount]
  type InstanceAssociationStatusInfos = js.Array[typingsJapgolly.awsSdk.ssmMod.InstanceAssociationStatusInfo]
  type InstanceCount = scala.Double
  type InstanceId = java.lang.String
  type InstanceIdList = js.Array[typingsJapgolly.awsSdk.ssmMod.InstanceId]
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
  type InstanceInformationFilterKey = typingsJapgolly.awsSdk.ssmMod._InstanceInformationFilterKey | java.lang.String
  type InstanceInformationFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.InstanceInformationFilter]
  type InstanceInformationFilterValue = java.lang.String
  type InstanceInformationFilterValueSet = js.Array[typingsJapgolly.awsSdk.ssmMod.InstanceInformationFilterValue]
  type InstanceInformationList = js.Array[typingsJapgolly.awsSdk.ssmMod.InstanceInformation]
  type InstanceInformationStringFilterKey = java.lang.String
  type InstanceInformationStringFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.InstanceInformationStringFilter]
  type InstancePatchStateFilterKey = java.lang.String
  type InstancePatchStateFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.InstancePatchStateFilter]
  type InstancePatchStateFilterValue = java.lang.String
  type InstancePatchStateFilterValues = js.Array[typingsJapgolly.awsSdk.ssmMod.InstancePatchStateFilterValue]
  type InstancePatchStateList = js.Array[typingsJapgolly.awsSdk.ssmMod.InstancePatchState]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Equal_
    - typingsJapgolly.awsSdk.awsSdkStrings.NotEqual
    - typingsJapgolly.awsSdk.awsSdkStrings.LessThan
    - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThan
    - java.lang.String
  */
  type InstancePatchStateOperatorType = typingsJapgolly.awsSdk.ssmMod._InstancePatchStateOperatorType | java.lang.String
  type InstancePatchStatesList = js.Array[typingsJapgolly.awsSdk.ssmMod.InstancePatchState]
  type InstanceTagName = java.lang.String
  type InstancesCount = scala.Double
  type Integer = scala.Double
  type InventoryAggregatorExpression = java.lang.String
  type InventoryAggregatorList = js.Array[typingsJapgolly.awsSdk.ssmMod.InventoryAggregator]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.string__
    - typingsJapgolly.awsSdk.awsSdkStrings.number__
    - java.lang.String
  */
  type InventoryAttributeDataType = typingsJapgolly.awsSdk.ssmMod._InventoryAttributeDataType | java.lang.String
  type InventoryDeletionId = java.lang.String
  type InventoryDeletionLastStatusMessage = java.lang.String
  type InventoryDeletionLastStatusUpdateTime = js.Date
  type InventoryDeletionStartTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
    - java.lang.String
  */
  type InventoryDeletionStatus = typingsJapgolly.awsSdk.ssmMod._InventoryDeletionStatus | java.lang.String
  type InventoryDeletionSummaryItems = js.Array[typingsJapgolly.awsSdk.ssmMod.InventoryDeletionSummaryItem]
  type InventoryDeletionsList = js.Array[typingsJapgolly.awsSdk.ssmMod.InventoryDeletionStatusItem]
  type InventoryFilterKey = java.lang.String
  type InventoryFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.InventoryFilter]
  type InventoryFilterValue = java.lang.String
  type InventoryFilterValueList = js.Array[typingsJapgolly.awsSdk.ssmMod.InventoryFilterValue]
  type InventoryGroupList = js.Array[typingsJapgolly.awsSdk.ssmMod.InventoryGroup]
  type InventoryGroupName = java.lang.String
  type InventoryItemAttributeList = js.Array[typingsJapgolly.awsSdk.ssmMod.InventoryItemAttribute]
  type InventoryItemAttributeName = java.lang.String
  type InventoryItemCaptureTime = java.lang.String
  type InventoryItemContentContext = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.AttributeValue]
  type InventoryItemContentHash = java.lang.String
  type InventoryItemEntry = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.AttributeValue]
  type InventoryItemEntryList = js.Array[typingsJapgolly.awsSdk.ssmMod.InventoryItemEntry]
  type InventoryItemList = js.Array[typingsJapgolly.awsSdk.ssmMod.InventoryItem]
  type InventoryItemSchemaResultList = js.Array[typingsJapgolly.awsSdk.ssmMod.InventoryItemSchema]
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
  type InventoryQueryOperatorType = typingsJapgolly.awsSdk.ssmMod._InventoryQueryOperatorType | java.lang.String
  type InventoryResultEntityId = java.lang.String
  type InventoryResultEntityList = js.Array[typingsJapgolly.awsSdk.ssmMod.InventoryResultEntity]
  type InventoryResultItemKey = java.lang.String
  type InventoryResultItemMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.InventoryResultItem]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DisableSchema
    - typingsJapgolly.awsSdk.awsSdkStrings.DeleteSchema
    - java.lang.String
  */
  type InventorySchemaDeleteOption = typingsJapgolly.awsSdk.ssmMod._InventorySchemaDeleteOption | java.lang.String
  type InventoryTypeDisplayName = java.lang.String
  type InvocationTraceOutput = java.lang.String
  type IsSubTypeSchema = scala.Boolean
  type KeyList = js.Array[typingsJapgolly.awsSdk.ssmMod.TagKey]
  type LastResourceDataSyncMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Successful_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - java.lang.String
  */
  type LastResourceDataSyncStatus = typingsJapgolly.awsSdk.ssmMod._LastResourceDataSyncStatus | java.lang.String
  type LastResourceDataSyncTime = js.Date
  type LastSuccessfulResourceDataSyncTime = js.Date
  type Long = scala.Double
  type MaintenanceWindowAllowUnassociatedTargets = scala.Boolean
  type MaintenanceWindowCutoff = scala.Double
  type MaintenanceWindowDescription = java.lang.String
  type MaintenanceWindowDurationHours = scala.Double
  type MaintenanceWindowEnabled = scala.Boolean
  type MaintenanceWindowExecutionId = java.lang.String
  type MaintenanceWindowExecutionList = js.Array[typingsJapgolly.awsSdk.ssmMod.MaintenanceWindowExecution]
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
  type MaintenanceWindowExecutionStatus = typingsJapgolly.awsSdk.ssmMod._MaintenanceWindowExecutionStatus | java.lang.String
  type MaintenanceWindowExecutionStatusDetails = java.lang.String
  type MaintenanceWindowExecutionTaskExecutionId = java.lang.String
  type MaintenanceWindowExecutionTaskId = java.lang.String
  type MaintenanceWindowExecutionTaskIdList = js.Array[typingsJapgolly.awsSdk.ssmMod.MaintenanceWindowExecutionTaskId]
  type MaintenanceWindowExecutionTaskIdentityList = js.Array[typingsJapgolly.awsSdk.ssmMod.MaintenanceWindowExecutionTaskIdentity]
  type MaintenanceWindowExecutionTaskInvocationId = java.lang.String
  type MaintenanceWindowExecutionTaskInvocationIdentityList = js.Array[typingsJapgolly.awsSdk.ssmMod.MaintenanceWindowExecutionTaskInvocationIdentity]
  type MaintenanceWindowExecutionTaskInvocationParameters = java.lang.String
  type MaintenanceWindowFilterKey = java.lang.String
  type MaintenanceWindowFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.MaintenanceWindowFilter]
  type MaintenanceWindowFilterValue = java.lang.String
  type MaintenanceWindowFilterValues = js.Array[typingsJapgolly.awsSdk.ssmMod.MaintenanceWindowFilterValue]
  type MaintenanceWindowId = java.lang.String
  type MaintenanceWindowIdentityList = js.Array[typingsJapgolly.awsSdk.ssmMod.MaintenanceWindowIdentity]
  type MaintenanceWindowLambdaClientContext = java.lang.String
  type MaintenanceWindowLambdaPayload = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.ssmMod.Blob | java.lang.String
  type MaintenanceWindowLambdaQualifier = java.lang.String
  type MaintenanceWindowMaxResults = scala.Double
  type MaintenanceWindowName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE
    - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_GROUP
    - java.lang.String
  */
  type MaintenanceWindowResourceType = typingsJapgolly.awsSdk.ssmMod._MaintenanceWindowResourceType | java.lang.String
  type MaintenanceWindowSchedule = java.lang.String
  type MaintenanceWindowSearchMaxResults = scala.Double
  type MaintenanceWindowStepFunctionsInput = java.lang.String
  type MaintenanceWindowStepFunctionsName = java.lang.String
  type MaintenanceWindowStringDateTime = java.lang.String
  type MaintenanceWindowTargetId = java.lang.String
  type MaintenanceWindowTargetList = js.Array[typingsJapgolly.awsSdk.ssmMod.MaintenanceWindowTarget]
  type MaintenanceWindowTaskArn = java.lang.String
  type MaintenanceWindowTaskId = java.lang.String
  type MaintenanceWindowTaskList = js.Array[typingsJapgolly.awsSdk.ssmMod.MaintenanceWindowTask]
  type MaintenanceWindowTaskParameterName = java.lang.String
  type MaintenanceWindowTaskParameterValue = java.lang.String
  type MaintenanceWindowTaskParameterValueList = js.Array[typingsJapgolly.awsSdk.ssmMod.MaintenanceWindowTaskParameterValue]
  type MaintenanceWindowTaskParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.MaintenanceWindowTaskParameterValueExpression]
  type MaintenanceWindowTaskParametersList = js.Array[typingsJapgolly.awsSdk.ssmMod.MaintenanceWindowTaskParameters]
  type MaintenanceWindowTaskPriority = scala.Double
  type MaintenanceWindowTaskTargetId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RUN_COMMAND
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATION
    - typingsJapgolly.awsSdk.awsSdkStrings.STEP_FUNCTIONS
    - typingsJapgolly.awsSdk.awsSdkStrings.LAMBDA
    - java.lang.String
  */
  type MaintenanceWindowTaskType = typingsJapgolly.awsSdk.ssmMod._MaintenanceWindowTaskType | java.lang.String
  type MaintenanceWindowTimezone = java.lang.String
  type MaintenanceWindowsForTargetList = js.Array[typingsJapgolly.awsSdk.ssmMod.MaintenanceWindowIdentityForTarget]
  type ManagedInstanceId = java.lang.String
  type MaxConcurrency = java.lang.String
  type MaxErrors = java.lang.String
  type MaxResults = scala.Double
  type MaxResultsEC2Compatible = scala.Double
  type NextToken = java.lang.String
  type NormalStringMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.String]
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
  type NotificationEvent = typingsJapgolly.awsSdk.ssmMod._NotificationEvent | java.lang.String
  type NotificationEventList = js.Array[typingsJapgolly.awsSdk.ssmMod.NotificationEvent]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Command
    - typingsJapgolly.awsSdk.awsSdkStrings.Invocation
    - java.lang.String
  */
  type NotificationType = typingsJapgolly.awsSdk.ssmMod._NotificationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS
    - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_LINUX
    - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_LINUX_2
    - typingsJapgolly.awsSdk.awsSdkStrings.UBUNTU
    - typingsJapgolly.awsSdk.awsSdkStrings.REDHAT_ENTERPRISE_LINUX
    - typingsJapgolly.awsSdk.awsSdkStrings.SUSE
    - typingsJapgolly.awsSdk.awsSdkStrings.CENTOS
    - java.lang.String
  */
  type OperatingSystem = typingsJapgolly.awsSdk.ssmMod._OperatingSystem | java.lang.String
  type OpsAggregatorList = js.Array[typingsJapgolly.awsSdk.ssmMod.OpsAggregator]
  type OpsAggregatorType = java.lang.String
  type OpsAggregatorValue = java.lang.String
  type OpsAggregatorValueKey = java.lang.String
  type OpsAggregatorValueMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.OpsAggregatorValue]
  type OpsDataAttributeName = java.lang.String
  type OpsDataTypeName = java.lang.String
  type OpsEntityId = java.lang.String
  type OpsEntityItemCaptureTime = java.lang.String
  type OpsEntityItemEntry = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.AttributeValue]
  type OpsEntityItemEntryList = js.Array[typingsJapgolly.awsSdk.ssmMod.OpsEntityItemEntry]
  type OpsEntityItemKey = java.lang.String
  type OpsEntityItemMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.OpsEntityItem]
  type OpsEntityList = js.Array[typingsJapgolly.awsSdk.ssmMod.OpsEntity]
  type OpsFilterKey = java.lang.String
  type OpsFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.OpsFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Equal_
    - typingsJapgolly.awsSdk.awsSdkStrings.NotEqual
    - typingsJapgolly.awsSdk.awsSdkStrings.BeginWith
    - typingsJapgolly.awsSdk.awsSdkStrings.LessThan
    - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThan
    - typingsJapgolly.awsSdk.awsSdkStrings.Exists
    - java.lang.String
  */
  type OpsFilterOperatorType = typingsJapgolly.awsSdk.ssmMod._OpsFilterOperatorType | java.lang.String
  type OpsFilterValue = java.lang.String
  type OpsFilterValueList = js.Array[typingsJapgolly.awsSdk.ssmMod.OpsFilterValue]
  type OpsItemCategory = java.lang.String
  type OpsItemDataKey = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SearchableString
    - typingsJapgolly.awsSdk.awsSdkStrings.String_
    - java.lang.String
  */
  type OpsItemDataType = typingsJapgolly.awsSdk.ssmMod._OpsItemDataType | java.lang.String
  type OpsItemDataValueString = java.lang.String
  type OpsItemDescription = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreatedBy
    - typingsJapgolly.awsSdk.awsSdkStrings.Source
    - typingsJapgolly.awsSdk.awsSdkStrings.Priority_
    - typingsJapgolly.awsSdk.awsSdkStrings.Title_
    - typingsJapgolly.awsSdk.awsSdkStrings.OpsItemId
    - typingsJapgolly.awsSdk.awsSdkStrings.CreatedTime
    - typingsJapgolly.awsSdk.awsSdkStrings.LastModifiedTime
    - typingsJapgolly.awsSdk.awsSdkStrings.OperationalData
    - typingsJapgolly.awsSdk.awsSdkStrings.OperationalDataKey
    - typingsJapgolly.awsSdk.awsSdkStrings.OperationalDataValue
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourceId
    - typingsJapgolly.awsSdk.awsSdkStrings.AutomationId
    - typingsJapgolly.awsSdk.awsSdkStrings.Category
    - typingsJapgolly.awsSdk.awsSdkStrings.Severity_
    - java.lang.String
  */
  type OpsItemFilterKey = typingsJapgolly.awsSdk.ssmMod._OpsItemFilterKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Equal_
    - typingsJapgolly.awsSdk.awsSdkStrings.Contains_
    - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThan
    - typingsJapgolly.awsSdk.awsSdkStrings.LessThan
    - java.lang.String
  */
  type OpsItemFilterOperator = typingsJapgolly.awsSdk.ssmMod._OpsItemFilterOperator | java.lang.String
  type OpsItemFilterValue = java.lang.String
  type OpsItemFilterValues = js.Array[typingsJapgolly.awsSdk.ssmMod.OpsItemFilterValue]
  type OpsItemFilters = js.Array[typingsJapgolly.awsSdk.ssmMod.OpsItemFilter]
  type OpsItemId = java.lang.String
  type OpsItemMaxResults = scala.Double
  type OpsItemNotifications = js.Array[typingsJapgolly.awsSdk.ssmMod.OpsItemNotification]
  type OpsItemOperationalData = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.OpsItemDataValue]
  type OpsItemOpsDataKeysList = js.Array[typingsJapgolly.awsSdk.ssmMod.String]
  type OpsItemPriority = scala.Double
  type OpsItemSeverity = java.lang.String
  type OpsItemSource = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Open_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Resolved_
    - java.lang.String
  */
  type OpsItemStatus = typingsJapgolly.awsSdk.ssmMod._OpsItemStatus | java.lang.String
  type OpsItemSummaries = js.Array[typingsJapgolly.awsSdk.ssmMod.OpsItemSummary]
  type OpsItemTitle = java.lang.String
  type OpsResultAttributeList = js.Array[typingsJapgolly.awsSdk.ssmMod.OpsResultAttribute]
  type OutputSourceId = java.lang.String
  type OutputSourceType = java.lang.String
  type OwnerInformation = java.lang.String
  type PSParameterName = java.lang.String
  type PSParameterSelector = java.lang.String
  type PSParameterValue = java.lang.String
  type PSParameterVersion = scala.Double
  type ParameterDescription = java.lang.String
  type ParameterHistoryList = js.Array[typingsJapgolly.awsSdk.ssmMod.ParameterHistory]
  type ParameterKeyId = java.lang.String
  type ParameterLabel = java.lang.String
  type ParameterLabelList = js.Array[typingsJapgolly.awsSdk.ssmMod.ParameterLabel]
  type ParameterList = js.Array[typingsJapgolly.awsSdk.ssmMod.Parameter]
  type ParameterMetadataList = js.Array[typingsJapgolly.awsSdk.ssmMod.ParameterMetadata]
  type ParameterName = java.lang.String
  type ParameterNameList = js.Array[typingsJapgolly.awsSdk.ssmMod.PSParameterName]
  type ParameterPolicies = java.lang.String
  type ParameterPolicyList = js.Array[typingsJapgolly.awsSdk.ssmMod.ParameterInlinePolicy]
  type ParameterStringFilterKey = java.lang.String
  type ParameterStringFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.ParameterStringFilter]
  type ParameterStringFilterValue = java.lang.String
  type ParameterStringFilterValueList = js.Array[typingsJapgolly.awsSdk.ssmMod.ParameterStringFilterValue]
  type ParameterStringQueryOption = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Standard_
    - typingsJapgolly.awsSdk.awsSdkStrings.Advanced
    - typingsJapgolly.awsSdk.awsSdkStrings.`Intelligent-Tiering`
    - java.lang.String
  */
  type ParameterTier = typingsJapgolly.awsSdk.ssmMod._ParameterTier | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.String_
    - typingsJapgolly.awsSdk.awsSdkStrings.StringList
    - typingsJapgolly.awsSdk.awsSdkStrings.SecureString
    - java.lang.String
  */
  type ParameterType = typingsJapgolly.awsSdk.ssmMod._ParameterType | java.lang.String
  type ParameterValue = java.lang.String
  type ParameterValueList = js.Array[typingsJapgolly.awsSdk.ssmMod.ParameterValue]
  type Parameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.ParameterValueList]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.Type_
    - typingsJapgolly.awsSdk.awsSdkStrings.KeyId
    - java.lang.String
  */
  type ParametersFilterKey = typingsJapgolly.awsSdk.ssmMod._ParametersFilterKey | java.lang.String
  type ParametersFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.ParametersFilter]
  type ParametersFilterValue = java.lang.String
  type ParametersFilterValueList = js.Array[typingsJapgolly.awsSdk.ssmMod.ParametersFilterValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW_AS_DEPENDENCY
    - typingsJapgolly.awsSdk.awsSdkStrings.BLOCK
    - java.lang.String
  */
  type PatchAction = typingsJapgolly.awsSdk.ssmMod._PatchAction | java.lang.String
  type PatchBaselineIdentityList = js.Array[typingsJapgolly.awsSdk.ssmMod.PatchBaselineIdentity]
  type PatchBaselineMaxResults = scala.Double
  type PatchClassification = java.lang.String
  type PatchComplianceDataList = js.Array[typingsJapgolly.awsSdk.ssmMod.PatchComplianceData]
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
  type PatchComplianceDataState = typingsJapgolly.awsSdk.ssmMod._PatchComplianceDataState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
    - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
    - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
    - typingsJapgolly.awsSdk.awsSdkStrings.LOW
    - typingsJapgolly.awsSdk.awsSdkStrings.INFORMATIONAL
    - typingsJapgolly.awsSdk.awsSdkStrings.UNSPECIFIED
    - java.lang.String
  */
  type PatchComplianceLevel = typingsJapgolly.awsSdk.ssmMod._PatchComplianceLevel | java.lang.String
  type PatchComplianceMaxResults = scala.Double
  type PatchContentUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.APPROVED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_APPROVAL
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPLICIT_APPROVED
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPLICIT_REJECTED
    - java.lang.String
  */
  type PatchDeploymentStatus = typingsJapgolly.awsSdk.ssmMod._PatchDeploymentStatus | java.lang.String
  type PatchDescription = java.lang.String
  type PatchFailedCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PATCH_SET
    - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCT
    - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCT_FAMILY
    - typingsJapgolly.awsSdk.awsSdkStrings.CLASSIFICATION
    - typingsJapgolly.awsSdk.awsSdkStrings.MSRC_SEVERITY
    - typingsJapgolly.awsSdk.awsSdkStrings.PATCH_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.SECTION
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIORITY
    - typingsJapgolly.awsSdk.awsSdkStrings.SEVERITY
    - java.lang.String
  */
  type PatchFilterKey = typingsJapgolly.awsSdk.ssmMod._PatchFilterKey | java.lang.String
  type PatchFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.PatchFilter]
  type PatchFilterValue = java.lang.String
  type PatchFilterValueList = js.Array[typingsJapgolly.awsSdk.ssmMod.PatchFilterValue]
  type PatchGroup = java.lang.String
  type PatchGroupList = js.Array[typingsJapgolly.awsSdk.ssmMod.PatchGroup]
  type PatchGroupPatchBaselineMappingList = js.Array[typingsJapgolly.awsSdk.ssmMod.PatchGroupPatchBaselineMapping]
  type PatchId = java.lang.String
  type PatchIdList = js.Array[typingsJapgolly.awsSdk.ssmMod.PatchId]
  type PatchInstalledCount = scala.Double
  type PatchInstalledOtherCount = scala.Double
  type PatchInstalledPendingRebootCount = scala.Double
  type PatchInstalledRejectedCount = scala.Double
  type PatchKbNumber = java.lang.String
  type PatchLanguage = java.lang.String
  type PatchList = js.Array[typingsJapgolly.awsSdk.ssmMod.Patch]
  type PatchMissingCount = scala.Double
  type PatchMsrcNumber = java.lang.String
  type PatchMsrcSeverity = java.lang.String
  type PatchNotApplicableCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Scan
    - typingsJapgolly.awsSdk.awsSdkStrings.Install_
    - java.lang.String
  */
  type PatchOperationType = typingsJapgolly.awsSdk.ssmMod._PatchOperationType | java.lang.String
  type PatchOrchestratorFilterKey = java.lang.String
  type PatchOrchestratorFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.PatchOrchestratorFilter]
  type PatchOrchestratorFilterValue = java.lang.String
  type PatchOrchestratorFilterValues = js.Array[typingsJapgolly.awsSdk.ssmMod.PatchOrchestratorFilterValue]
  type PatchProduct = java.lang.String
  type PatchProductFamily = java.lang.String
  type PatchPropertiesList = js.Array[typingsJapgolly.awsSdk.ssmMod.PatchPropertyEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCT
    - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCT_FAMILY
    - typingsJapgolly.awsSdk.awsSdkStrings.CLASSIFICATION
    - typingsJapgolly.awsSdk.awsSdkStrings.MSRC_SEVERITY
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIORITY
    - typingsJapgolly.awsSdk.awsSdkStrings.SEVERITY
    - java.lang.String
  */
  type PatchProperty = typingsJapgolly.awsSdk.ssmMod._PatchProperty | java.lang.String
  type PatchPropertyEntry = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.AttributeValue]
  type PatchRuleList = js.Array[typingsJapgolly.awsSdk.ssmMod.PatchRule]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OS
    - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION
    - java.lang.String
  */
  type PatchSet = typingsJapgolly.awsSdk.ssmMod._PatchSet | java.lang.String
  type PatchSeverity = java.lang.String
  type PatchSourceConfiguration = java.lang.String
  type PatchSourceList = js.Array[typingsJapgolly.awsSdk.ssmMod.PatchSource]
  type PatchSourceName = java.lang.String
  type PatchSourceProduct = java.lang.String
  type PatchSourceProductList = js.Array[typingsJapgolly.awsSdk.ssmMod.PatchSourceProduct]
  type PatchStringDate = java.lang.String
  type PatchTitle = java.lang.String
  type PatchUnreportedNotApplicableCount = scala.Double
  type PatchVendor = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Online_
    - typingsJapgolly.awsSdk.awsSdkStrings.ConnectionLost
    - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
    - java.lang.String
  */
  type PingStatus = typingsJapgolly.awsSdk.ssmMod._PingStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Windows_
    - typingsJapgolly.awsSdk.awsSdkStrings.Linux_
    - java.lang.String
  */
  type PlatformType = typingsJapgolly.awsSdk.ssmMod._PlatformType | java.lang.String
  type PlatformTypeList = js.Array[typingsJapgolly.awsSdk.ssmMod.PlatformType]
  type Product = java.lang.String
  type PutInventoryMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RebootIfNeeded
    - typingsJapgolly.awsSdk.awsSdkStrings.NoReboot
    - java.lang.String
  */
  type RebootOption = typingsJapgolly.awsSdk.ssmMod._RebootOption | java.lang.String
  type Region = java.lang.String
  type Regions = js.Array[typingsJapgolly.awsSdk.ssmMod.Region]
  type RegistrationLimit = scala.Double
  type RegistrationsCount = scala.Double
  type RelatedOpsItems = js.Array[typingsJapgolly.awsSdk.ssmMod.RelatedOpsItem]
  type RemainingCount = scala.Double
  type ResourceComplianceSummaryItemList = js.Array[typingsJapgolly.awsSdk.ssmMod.ResourceComplianceSummaryItem]
  type ResourceCount = scala.Double
  type ResourceCountByStatus = java.lang.String
  type ResourceDataSyncAWSKMSKeyARN = java.lang.String
  type ResourceDataSyncCreatedTime = js.Date
  type ResourceDataSyncIncludeFutureRegions = scala.Boolean
  type ResourceDataSyncItemList = js.Array[typingsJapgolly.awsSdk.ssmMod.ResourceDataSyncItem]
  type ResourceDataSyncLastModifiedTime = js.Date
  type ResourceDataSyncName = java.lang.String
  type ResourceDataSyncOrganizationSourceType = java.lang.String
  type ResourceDataSyncOrganizationalUnitId = java.lang.String
  type ResourceDataSyncOrganizationalUnitList = js.Array[typingsJapgolly.awsSdk.ssmMod.ResourceDataSyncOrganizationalUnit]
  type ResourceDataSyncS3BucketName = java.lang.String
  type ResourceDataSyncS3Format = typingsJapgolly.awsSdk.awsSdkStrings.JsonSerDe | java.lang.String
  type ResourceDataSyncS3Prefix = java.lang.String
  type ResourceDataSyncS3Region = java.lang.String
  type ResourceDataSyncSourceRegion = java.lang.String
  type ResourceDataSyncSourceRegionList = js.Array[typingsJapgolly.awsSdk.ssmMod.ResourceDataSyncSourceRegion]
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
  type ResourceType = typingsJapgolly.awsSdk.ssmMod._ResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Document_
    - typingsJapgolly.awsSdk.awsSdkStrings.ManagedInstance
    - typingsJapgolly.awsSdk.awsSdkStrings.MaintenanceWindow
    - typingsJapgolly.awsSdk.awsSdkStrings.Parameter
    - typingsJapgolly.awsSdk.awsSdkStrings.PatchBaseline
    - typingsJapgolly.awsSdk.awsSdkStrings.OpsItem
    - java.lang.String
  */
  type ResourceTypeForTagging = typingsJapgolly.awsSdk.ssmMod._ResourceTypeForTagging | java.lang.String
  type ResponseCode = scala.Double
  type ResultAttributeList = js.Array[typingsJapgolly.awsSdk.ssmMod.ResultAttribute]
  type S3BucketName = java.lang.String
  type S3KeyPrefix = java.lang.String
  type S3Region = java.lang.String
  type ScheduleExpression = java.lang.String
  type ScheduledWindowExecutionList = js.Array[typingsJapgolly.awsSdk.ssmMod.ScheduledWindowExecution]
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
    - java.lang.String
  */
  type SessionFilterKey = typingsJapgolly.awsSdk.ssmMod._SessionFilterKey | java.lang.String
  type SessionFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.SessionFilter]
  type SessionFilterValue = java.lang.String
  type SessionId = java.lang.String
  type SessionList = js.Array[typingsJapgolly.awsSdk.ssmMod.Session]
  type SessionManagerCloudWatchOutputUrl = java.lang.String
  type SessionManagerParameterName = java.lang.String
  type SessionManagerParameterValue = java.lang.String
  type SessionManagerParameterValueList = js.Array[typingsJapgolly.awsSdk.ssmMod.SessionManagerParameterValue]
  type SessionManagerParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.SessionManagerParameterValueList]
  type SessionManagerS3OutputUrl = java.lang.String
  type SessionMaxResults = scala.Double
  type SessionOwner = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.History
    - java.lang.String
  */
  type SessionState = typingsJapgolly.awsSdk.ssmMod._SessionState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Connected_
    - typingsJapgolly.awsSdk.awsSdkStrings.Connecting_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disconnected_
    - typingsJapgolly.awsSdk.awsSdkStrings.Terminated_
    - typingsJapgolly.awsSdk.awsSdkStrings.Terminating_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type SessionStatus = typingsJapgolly.awsSdk.ssmMod._SessionStatus | java.lang.String
  type SessionTarget = java.lang.String
  type SharedDocumentVersion = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Approve_
    - typingsJapgolly.awsSdk.awsSdkStrings.Reject_
    - typingsJapgolly.awsSdk.awsSdkStrings.StartStep
    - typingsJapgolly.awsSdk.awsSdkStrings.StopStep
    - typingsJapgolly.awsSdk.awsSdkStrings.Resume
    - java.lang.String
  */
  type SignalType = typingsJapgolly.awsSdk.ssmMod._SignalType | java.lang.String
  type SnapshotDownloadUrl = java.lang.String
  type SnapshotId = java.lang.String
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
  type StepExecutionFilterKey = typingsJapgolly.awsSdk.ssmMod._StepExecutionFilterKey | java.lang.String
  type StepExecutionFilterList = js.Array[typingsJapgolly.awsSdk.ssmMod.StepExecutionFilter]
  type StepExecutionFilterValue = java.lang.String
  type StepExecutionFilterValueList = js.Array[typingsJapgolly.awsSdk.ssmMod.StepExecutionFilterValue]
  type StepExecutionList = js.Array[typingsJapgolly.awsSdk.ssmMod.StepExecution]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
    - typingsJapgolly.awsSdk.awsSdkStrings.Cancel_
    - java.lang.String
  */
  type StopType = typingsJapgolly.awsSdk.ssmMod._StopType | java.lang.String
  type StreamUrl = java.lang.String
  type String = java.lang.String
  type StringDateTime = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.ssmMod.String]
  type TagKey = java.lang.String
  type TagList = js.Array[typingsJapgolly.awsSdk.ssmMod.Tag]
  type TagValue = java.lang.String
  type TargetCount = scala.Double
  type TargetKey = java.lang.String
  type TargetLocations = js.Array[typingsJapgolly.awsSdk.ssmMod.TargetLocation]
  type TargetMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.ssmMod.TargetMapValueList]
  type TargetMapKey = java.lang.String
  type TargetMapValue = java.lang.String
  type TargetMapValueList = js.Array[typingsJapgolly.awsSdk.ssmMod.TargetMapValue]
  type TargetMaps = js.Array[typingsJapgolly.awsSdk.ssmMod.TargetMap]
  type TargetParameterList = js.Array[typingsJapgolly.awsSdk.ssmMod.ParameterValue]
  type TargetType = java.lang.String
  type TargetValue = java.lang.String
  type TargetValues = js.Array[typingsJapgolly.awsSdk.ssmMod.TargetValue]
  type Targets = js.Array[typingsJapgolly.awsSdk.ssmMod.Target]
  type TimeoutSeconds = scala.Double
  type TokenValue = java.lang.String
  type TotalCount = scala.Double
  type Url = java.lang.String
  type ValidNextStep = java.lang.String
  type ValidNextStepList = js.Array[typingsJapgolly.awsSdk.ssmMod.ValidNextStep]
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-11-06`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.ssmMod._apiVersion | java.lang.String
}
