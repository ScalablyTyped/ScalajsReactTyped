package typingsJapgolly.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.EN_US
import typingsJapgolly.awsSdk.awsSdkStrings.`ec2-instance`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AddRemoveAttributesFindingArnList = js.Array[Arn]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
  - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type AgentHealth = _AgentHealth | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IDLE
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.SHUTDOWN
  - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
  - typingsJapgolly.awsSdk.awsSdkStrings.THROTTLED
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type AgentHealthCode = _AgentHealthCode | String

type AgentHealthCodeList = js.Array[AgentHealthCode]

type AgentHealthList = js.Array[AgentHealth]

type AgentId = String

type AgentIdList = js.Array[AgentId]

type AgentPreviewList = js.Array[AgentPreview]

type AgentVersion = String

type AmiId = String

type Arn = String

type ArnCount = Double

type AssessmentRulesPackageArnList = js.Array[Arn]

type AssessmentRunAgentList = js.Array[AssessmentRunAgent]

type AssessmentRunDuration = Double

type AssessmentRunFindingCounts = StringDictionary[FindingCount]

type AssessmentRunList = js.Array[AssessmentRun]

type AssessmentRunName = String

type AssessmentRunNotificationList = js.Array[AssessmentRunNotification]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.TOPIC_DOES_NOT_EXIST
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - java.lang.String
*/
type AssessmentRunNotificationSnsStatusCode = _AssessmentRunNotificationSnsStatusCode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.START_DATA_COLLECTION_PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.START_DATA_COLLECTION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COLLECTING_DATA
  - typingsJapgolly.awsSdk.awsSdkStrings.STOP_DATA_COLLECTION_PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_COLLECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.START_EVALUATING_RULES_PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.EVALUATING_RULES
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED_WITH_ERRORS
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
  - java.lang.String
*/
type AssessmentRunState = _AssessmentRunState | String

type AssessmentRunStateChangeList = js.Array[AssessmentRunStateChange]

type AssessmentRunStateList = js.Array[AssessmentRunState]

type AssessmentTargetList = js.Array[AssessmentTarget]

type AssessmentTargetName = String

type AssessmentTemplateList = js.Array[AssessmentTemplate]

type AssessmentTemplateName = String

type AssessmentTemplateRulesPackageArnList = js.Array[Arn]

type AssetType = `ec2-instance` | String

type AttributeKey = String

type AttributeList = js.Array[Attribute]

type AttributeValue = String

type AutoScalingGroup = String

type AutoScalingGroupList = js.Array[AutoScalingGroup]

type BatchDescribeArnList = js.Array[Arn]

type BatchDescribeExclusionsArnList = js.Array[Arn]

type Bool = Boolean

type EventSubscriptionList = js.Array[EventSubscription]

type ExclusionMap = StringDictionary[Exclusion]

type ExclusionPreviewList = js.Array[ExclusionPreview]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_ARN
  - typingsJapgolly.awsSdk.awsSdkStrings.DUPLICATE_ARN
  - typingsJapgolly.awsSdk.awsSdkStrings.ITEM_DOES_NOT_EXIST
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.LIMIT_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - java.lang.String
*/
type FailedItemErrorCode = _FailedItemErrorCode | String

type FailedItems = StringDictionary[FailedItemDetails]

type FilterRulesPackageArnList = js.Array[Arn]

type FindingCount = Double

type FindingId = String

type FindingList = js.Array[Finding]

type Hostname = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSESSMENT_RUN_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSESSMENT_RUN_COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSESSMENT_RUN_STATE_CHANGED
  - typingsJapgolly.awsSdk.awsSdkStrings.FINDING_REPORTED
  - typingsJapgolly.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
type InspectorEvent = _InspectorEvent | String

type IocConfidence = Double

type Ipv4Address = String

type Ipv4AddressList = js.Array[Ipv4Address]

type Ipv6Addresses = js.Array[Text]

type KernelVersion = String

type ListEventSubscriptionsMaxResults = Double

type ListMaxResults = Double

type ListParentArnList = js.Array[Arn]

type ListReturnedArnList = js.Array[Arn]

type Locale = EN_US | String

type Long = Double

type Message = String

type MessageType = String

type NamePattern = String

type NetworkInterfaces = js.Array[NetworkInterface]

type NumericSeverity = Double

type NumericVersion = Double

type OperatingSystem = String

type PaginationToken = String

type PreviewAgentsMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WORK_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type PreviewStatus = _PreviewStatus | String

type PrivateIpAddresses = js.Array[PrivateIp]

type ProviderName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HTML
  - typingsJapgolly.awsSdk.awsSdkStrings.PDF
  - java.lang.String
*/
type ReportFileFormat = _ReportFileFormat | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WORK_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type ReportStatus = _ReportStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FINDING
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL
  - java.lang.String
*/
type ReportType = _ReportType | String

type ResourceGroupList = js.Array[ResourceGroup]

type ResourceGroupTags = js.Array[ResourceGroupTag]

type RuleName = String

type RuleNameList = js.Array[RuleName]

type RulesPackageList = js.Array[RulesPackage]

type RulesPackageName = String

type ScopeList = js.Array[Scope]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.RULES_PACKAGE_ARN
  - java.lang.String
*/
type ScopeType = _ScopeType | String

type ScopeValue = String

type SecurityGroups = js.Array[SecurityGroup]

type ServiceName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Low_
  - typingsJapgolly.awsSdk.awsSdkStrings.Medium_
  - typingsJapgolly.awsSdk.awsSdkStrings.High_
  - typingsJapgolly.awsSdk.awsSdkStrings.Informational_
  - typingsJapgolly.awsSdk.awsSdkStrings.Undefined_
  - java.lang.String
*/
type Severity = _Severity | String

type SeverityList = js.Array[Severity]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.START_EVALUATION
  - typingsJapgolly.awsSdk.awsSdkStrings.SKIP_EVALUATION
  - java.lang.String
*/
type StopAction = _StopAction | String

type SubscriptionList = js.Array[Subscription]

type TagKey = String

type TagList = js.Array[Tag]

type TagValue = String

type Tags = js.Array[Tag]

type TelemetryMetadataList = js.Array[TelemetryMetadata]

type Text = String

type Timestamp = js.Date

type UUID = String

type Url = String

type UserAttributeKeyList = js.Array[AttributeKey]

type UserAttributeList = js.Array[Attribute]

type Version = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2015-08-18`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-02-16`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
