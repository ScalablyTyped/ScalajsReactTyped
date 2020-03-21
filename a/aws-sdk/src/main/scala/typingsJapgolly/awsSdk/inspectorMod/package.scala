package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inspectorMod {
  type AddRemoveAttributesFindingArnList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Arn]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type AgentHealth = typingsJapgolly.awsSdk.inspectorMod._AgentHealth | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IDLE
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.SHUTDOWN
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.THROTTLED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type AgentHealthCode = typingsJapgolly.awsSdk.inspectorMod._AgentHealthCode | java.lang.String
  type AgentHealthCodeList = js.Array[typingsJapgolly.awsSdk.inspectorMod.AgentHealthCode]
  type AgentHealthList = js.Array[typingsJapgolly.awsSdk.inspectorMod.AgentHealth]
  type AgentId = java.lang.String
  type AgentIdList = js.Array[typingsJapgolly.awsSdk.inspectorMod.AgentId]
  type AgentPreviewList = js.Array[typingsJapgolly.awsSdk.inspectorMod.AgentPreview]
  type AgentVersion = java.lang.String
  type AmiId = java.lang.String
  type Arn = java.lang.String
  type ArnCount = scala.Double
  type AssessmentRulesPackageArnList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Arn]
  type AssessmentRunAgentList = js.Array[typingsJapgolly.awsSdk.inspectorMod.AssessmentRunAgent]
  type AssessmentRunDuration = scala.Double
  type AssessmentRunFindingCounts = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.inspectorMod.FindingCount]
  type AssessmentRunList = js.Array[typingsJapgolly.awsSdk.inspectorMod.AssessmentRun]
  type AssessmentRunName = java.lang.String
  type AssessmentRunNotificationList = js.Array[typingsJapgolly.awsSdk.inspectorMod.AssessmentRunNotification]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.TOPIC_DOES_NOT_EXIST
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type AssessmentRunNotificationSnsStatusCode = typingsJapgolly.awsSdk.inspectorMod._AssessmentRunNotificationSnsStatusCode | java.lang.String
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
  type AssessmentRunState = typingsJapgolly.awsSdk.inspectorMod._AssessmentRunState | java.lang.String
  type AssessmentRunStateChangeList = js.Array[typingsJapgolly.awsSdk.inspectorMod.AssessmentRunStateChange]
  type AssessmentRunStateList = js.Array[typingsJapgolly.awsSdk.inspectorMod.AssessmentRunState]
  type AssessmentTargetList = js.Array[typingsJapgolly.awsSdk.inspectorMod.AssessmentTarget]
  type AssessmentTargetName = java.lang.String
  type AssessmentTemplateList = js.Array[typingsJapgolly.awsSdk.inspectorMod.AssessmentTemplate]
  type AssessmentTemplateName = java.lang.String
  type AssessmentTemplateRulesPackageArnList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Arn]
  type AssetType = typingsJapgolly.awsSdk.awsSdkStrings.`ec2-instance` | java.lang.String
  type AttributeKey = java.lang.String
  type AttributeList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Attribute]
  type AttributeValue = java.lang.String
  type AutoScalingGroup = java.lang.String
  type AutoScalingGroupList = js.Array[typingsJapgolly.awsSdk.inspectorMod.AutoScalingGroup]
  type BatchDescribeArnList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Arn]
  type BatchDescribeExclusionsArnList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Arn]
  type Bool = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.inspectorMod.ClientApiVersions
  type EventSubscriptionList = js.Array[typingsJapgolly.awsSdk.inspectorMod.EventSubscription]
  type ExclusionMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.inspectorMod.Exclusion]
  type ExclusionPreviewList = js.Array[typingsJapgolly.awsSdk.inspectorMod.ExclusionPreview]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_ARN
    - typingsJapgolly.awsSdk.awsSdkStrings.DUPLICATE_ARN
    - typingsJapgolly.awsSdk.awsSdkStrings.ITEM_DOES_NOT_EXIST
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typingsJapgolly.awsSdk.awsSdkStrings.LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type FailedItemErrorCode = typingsJapgolly.awsSdk.inspectorMod._FailedItemErrorCode | java.lang.String
  type FailedItems = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.inspectorMod.FailedItemDetails]
  type FilterRulesPackageArnList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Arn]
  type FindingCount = scala.Double
  type FindingId = java.lang.String
  type FindingList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Finding]
  type Hostname = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASSESSMENT_RUN_STARTED
    - typingsJapgolly.awsSdk.awsSdkStrings.ASSESSMENT_RUN_COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.ASSESSMENT_RUN_STATE_CHANGED
    - typingsJapgolly.awsSdk.awsSdkStrings.FINDING_REPORTED
    - typingsJapgolly.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type InspectorEvent = typingsJapgolly.awsSdk.inspectorMod._InspectorEvent | java.lang.String
  type IocConfidence = scala.Double
  type Ipv4Address = java.lang.String
  type Ipv4AddressList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Ipv4Address]
  type Ipv6Addresses = js.Array[typingsJapgolly.awsSdk.inspectorMod.Text]
  type KernelVersion = java.lang.String
  type ListEventSubscriptionsMaxResults = scala.Double
  type ListMaxResults = scala.Double
  type ListParentArnList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Arn]
  type ListReturnedArnList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Arn]
  type Locale = typingsJapgolly.awsSdk.awsSdkStrings.EN_US | java.lang.String
  type Long = scala.Double
  type Message = java.lang.String
  type MessageType = java.lang.String
  type NamePattern = java.lang.String
  type NetworkInterfaces = js.Array[typingsJapgolly.awsSdk.inspectorMod.NetworkInterface]
  type NumericSeverity = scala.Double
  type NumericVersion = scala.Double
  type OperatingSystem = java.lang.String
  type PaginationToken = java.lang.String
  type PreviewAgentsMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WORK_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type PreviewStatus = typingsJapgolly.awsSdk.inspectorMod._PreviewStatus | java.lang.String
  type PrivateIpAddresses = js.Array[typingsJapgolly.awsSdk.inspectorMod.PrivateIp]
  type ProviderName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HTML
    - typingsJapgolly.awsSdk.awsSdkStrings.PDF
    - java.lang.String
  */
  type ReportFileFormat = typingsJapgolly.awsSdk.inspectorMod._ReportFileFormat | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WORK_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type ReportStatus = typingsJapgolly.awsSdk.inspectorMod._ReportStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FINDING
    - typingsJapgolly.awsSdk.awsSdkStrings.FULL
    - java.lang.String
  */
  type ReportType = typingsJapgolly.awsSdk.inspectorMod._ReportType | java.lang.String
  type ResourceGroupList = js.Array[typingsJapgolly.awsSdk.inspectorMod.ResourceGroup]
  type ResourceGroupTags = js.Array[typingsJapgolly.awsSdk.inspectorMod.ResourceGroupTag]
  type RuleName = java.lang.String
  type RuleNameList = js.Array[typingsJapgolly.awsSdk.inspectorMod.RuleName]
  type RulesPackageList = js.Array[typingsJapgolly.awsSdk.inspectorMod.RulesPackage]
  type RulesPackageName = java.lang.String
  type ScopeList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Scope]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.RULES_PACKAGE_ARN
    - java.lang.String
  */
  type ScopeType = typingsJapgolly.awsSdk.inspectorMod._ScopeType | java.lang.String
  type ScopeValue = java.lang.String
  type SecurityGroups = js.Array[typingsJapgolly.awsSdk.inspectorMod.SecurityGroup]
  type ServiceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Low_
    - typingsJapgolly.awsSdk.awsSdkStrings.Medium_
    - typingsJapgolly.awsSdk.awsSdkStrings.High_
    - typingsJapgolly.awsSdk.awsSdkStrings.Informational_
    - typingsJapgolly.awsSdk.awsSdkStrings.Undefined_
    - java.lang.String
  */
  type Severity = typingsJapgolly.awsSdk.inspectorMod._Severity | java.lang.String
  type SeverityList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Severity]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.START_EVALUATION
    - typingsJapgolly.awsSdk.awsSdkStrings.SKIP_EVALUATION
    - java.lang.String
  */
  type StopAction = typingsJapgolly.awsSdk.inspectorMod._StopAction | java.lang.String
  type SubscriptionList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Subscription]
  type TagKey = java.lang.String
  type TagList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Tag]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.inspectorMod.Tag]
  type TelemetryMetadataList = js.Array[typingsJapgolly.awsSdk.inspectorMod.TelemetryMetadata]
  type Text = java.lang.String
  type Timestamp = js.Date
  type UUID = java.lang.String
  type Url = java.lang.String
  type UserAttributeKeyList = js.Array[typingsJapgolly.awsSdk.inspectorMod.AttributeKey]
  type UserAttributeList = js.Array[typingsJapgolly.awsSdk.inspectorMod.Attribute]
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-08-18`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-02-16`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.inspectorMod._apiVersion | java.lang.String
}
