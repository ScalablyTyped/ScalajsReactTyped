package typingsJapgolly.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.S3
import typingsJapgolly.awsSdk.awsSdkStrings.SELECT_FROM_LIST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccounts = js.Array[AWSAccount]

type AWSServiceName = java.lang.String

type AWSServices = js.Array[AWSService]

type AccountId = java.lang.String

type AccountName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_ACTIVATION
  - java.lang.String
*/
type AccountStatus = _AccountStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_METADATA
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNDER_REVIEW
  - typingsJapgolly.awsSdk.awsSdkStrings.REVIEWED
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_EVIDENCE
  - java.lang.String
*/
type ActionEnum = _ActionEnum | java.lang.String

type ActionPlanInstructions = java.lang.String

type ActionPlanTitle = java.lang.String

type AssessmentControlSets = js.Array[AssessmentControlSet]

type AssessmentControls = js.Array[AssessmentControl]

type AssessmentDescription = java.lang.String

type AssessmentEvidenceFolderName = java.lang.String

type AssessmentEvidenceFolders = js.Array[AssessmentEvidenceFolder]

type AssessmentFrameworkDescription = java.lang.String

type AssessmentFrameworkShareRequestList = js.Array[AssessmentFrameworkShareRequest]

type AssessmentName = java.lang.String

type AssessmentReportDescription = java.lang.String

type AssessmentReportDestinationType = S3 | java.lang.String

type AssessmentReportEvidenceErrors = js.Array[AssessmentReportEvidenceError]

type AssessmentReportName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AssessmentReportStatus = _AssessmentReportStatus | java.lang.String

type AssessmentReportsMetadata = js.Array[AssessmentReportMetadata]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type AssessmentStatus = _AssessmentStatus | java.lang.String

type AuditManagerArn = java.lang.String

type BatchCreateDelegationByAssessmentErrors = js.Array[BatchCreateDelegationByAssessmentError]

type BatchDeleteDelegationByAssessmentErrors = js.Array[BatchDeleteDelegationByAssessmentError]

type BatchImportEvidenceToAssessmentControlErrors = js.Array[BatchImportEvidenceToAssessmentControlError]

type Boolean = scala.Boolean

type ChangeLogs = js.Array[ChangeLog]

type ComplianceType = java.lang.String

type ControlCommentBody = java.lang.String

type ControlComments = js.Array[ControlComment]

type ControlDescription = java.lang.String

type ControlDomainInsightsList = js.Array[ControlDomainInsights]

type ControlInsightsMetadata = js.Array[ControlInsightsMetadataItem]

type ControlInsightsMetadataByAssessment = js.Array[ControlInsightsMetadataByAssessmentItem]

type ControlMappingSources = js.Array[ControlMappingSource]

type ControlMetadataList = js.Array[ControlMetadata]

type ControlName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MANUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFER
  - typingsJapgolly.awsSdk.awsSdkStrings.IGNORE
  - java.lang.String
*/
type ControlResponse = _ControlResponse | java.lang.String

type ControlSetId = java.lang.String

type ControlSetName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNDER_REVIEW
  - typingsJapgolly.awsSdk.awsSdkStrings.REVIEWED
  - java.lang.String
*/
type ControlSetStatus = _ControlSetStatus | java.lang.String

type ControlSets = js.Array[ControlSet]

type ControlSetsCount = Double

type ControlSources = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNDER_REVIEW
  - typingsJapgolly.awsSdk.awsSdkStrings.REVIEWED
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type ControlStatus = _ControlStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Standard_
  - typingsJapgolly.awsSdk.awsSdkStrings.Custom_
  - java.lang.String
*/
type ControlType = _ControlType | java.lang.String

type Controls = js.Array[Control]

type ControlsCount = Double

type CreateAssessmentFrameworkControlSets = js.Array[CreateAssessmentFrameworkControlSet]

type CreateAssessmentFrameworkControls = js.Array[CreateAssessmentFrameworkControl]

type CreateControlMappingSources = js.Array[CreateControlMappingSource]

type CreateDelegationRequests = js.Array[CreateDelegationRequest]

type CreatedBy = java.lang.String

type DelegationComment = java.lang.String

type DelegationIds = js.Array[UUID]

type DelegationMetadataList = js.Array[DelegationMetadata]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.UNDER_REVIEW
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - java.lang.String
*/
type DelegationStatus = _DelegationStatus | java.lang.String

type Delegations = js.Array[Delegation]

type EmailAddress = java.lang.String

type ErrorCode = java.lang.String

type ErrorMessage = java.lang.String

type EventName = java.lang.String

type EvidenceAttributeKey = java.lang.String

type EvidenceAttributeValue = java.lang.String

type EvidenceAttributes = StringDictionary[EvidenceAttributeValue]

type EvidenceIds = js.Array[UUID]

type EvidenceList = js.Array[Evidence]

type EvidenceSources = js.Array[NonEmptyString]

type Filename = java.lang.String

type FrameworkDescription = java.lang.String

type FrameworkMetadataList = js.Array[AssessmentFrameworkMetadata]

type FrameworkName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Standard_
  - typingsJapgolly.awsSdk.awsSdkStrings.Custom_
  - java.lang.String
*/
type FrameworkType = _FrameworkType | java.lang.String

type GenericArn = java.lang.String

type HyperlinkName = java.lang.String

type IamArn = java.lang.String

type Integer = Double

type KeywordInputType = SELECT_FROM_LIST | java.lang.String

type KeywordValue = java.lang.String

type Keywords = js.Array[KeywordValue]

type KmsKey = java.lang.String

type LastUpdatedBy = java.lang.String

type ListAssessmentMetadata = js.Array[AssessmentMetadataItem]

type ManualEvidenceList = js.Array[ManualEvidence]

type MaxResults = Double

type NonEmptyString = java.lang.String

type Notifications = js.Array[Notification]

type NullableInteger = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSESSMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTROL_SET
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTROL
  - typingsJapgolly.awsSdk.awsSdkStrings.DELEGATION
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSESSMENT_REPORT
  - java.lang.String
*/
type ObjectTypeEnum = _ObjectTypeEnum | java.lang.String

type Region = java.lang.String

type Resources = js.Array[Resource]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PROCESS_OWNER
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_OWNER
  - java.lang.String
*/
type RoleType = _RoleType | java.lang.String

type Roles = js.Array[Role]

type S3Url = java.lang.String

type SNSTopic = java.lang.String

type ServiceMetadataList = js.Array[ServiceMetadata]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.IS_AWS_ORG_ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.SNS_TOPIC
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_ASSESSMENT_REPORTS_DESTINATION
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_PROCESS_OWNERS
  - java.lang.String
*/
type SettingAttribute = _SettingAttribute | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCEPT
  - typingsJapgolly.awsSdk.awsSdkStrings.DECLINE
  - typingsJapgolly.awsSdk.awsSdkStrings.REVOKE
  - java.lang.String
*/
type ShareRequestAction = _ShareRequestAction | java.lang.String

type ShareRequestComment = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLICATING
  - typingsJapgolly.awsSdk.awsSdkStrings.SHARED
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.DECLINED
  - typingsJapgolly.awsSdk.awsSdkStrings.REVOKED
  - java.lang.String
*/
type ShareRequestStatus = _ShareRequestStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SENT
  - typingsJapgolly.awsSdk.awsSdkStrings.RECEIVED
  - java.lang.String
*/
type ShareRequestType = _ShareRequestType | java.lang.String

type SnsArn = java.lang.String

type SourceDescription = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DAILY
  - typingsJapgolly.awsSdk.awsSdkStrings.WEEKLY
  - typingsJapgolly.awsSdk.awsSdkStrings.MONTHLY
  - java.lang.String
*/
type SourceFrequency = _SourceFrequency | java.lang.String

type SourceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.System_Controls_Mapping
  - typingsJapgolly.awsSdk.awsSdkStrings.Procedural_Controls_Mapping
  - java.lang.String
*/
type SourceSetUpOption = _SourceSetUpOption | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_Cloudtrail
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_Config
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_Security_Hub
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_API_Call_
  - typingsJapgolly.awsSdk.awsSdkStrings.MANUAL
  - java.lang.String
*/
type SourceType = _SourceType | java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type TestingInformation = java.lang.String

type Timestamp = js.Date

type TimestampUUID = java.lang.String

type Token = java.lang.String

type TroubleshootingText = java.lang.String

type UUID = java.lang.String

type UpdateAssessmentFrameworkControlSets = js.Array[UpdateAssessmentFrameworkControlSet]

type UrlLink = java.lang.String

type Username = java.lang.String

type ValidationErrors = js.Array[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-07-25`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type organizationId = java.lang.String
