package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object configserviceMod {
  type ARN = java.lang.String
  type AccountAggregationSourceAccountList = js.Array[typingsJapgolly.awsSdk.configserviceMod.AccountId]
  type AccountAggregationSourceList = js.Array[typingsJapgolly.awsSdk.configserviceMod.AccountAggregationSource]
  type AccountId = java.lang.String
  type AggregateComplianceByConfigRuleList = js.Array[typingsJapgolly.awsSdk.configserviceMod.AggregateComplianceByConfigRule]
  type AggregateComplianceCountList = js.Array[typingsJapgolly.awsSdk.configserviceMod.AggregateComplianceCount]
  type AggregateEvaluationResultList = js.Array[typingsJapgolly.awsSdk.configserviceMod.AggregateEvaluationResult]
  type AggregatedSourceStatusList = js.Array[typingsJapgolly.awsSdk.configserviceMod.AggregatedSourceStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.OUTDATED
    - java.lang.String
  */
  type AggregatedSourceStatusType = typingsJapgolly.awsSdk.configserviceMod._AggregatedSourceStatusType | java.lang.String
  type AggregatedSourceStatusTypeList = js.Array[typingsJapgolly.awsSdk.configserviceMod.AggregatedSourceStatusType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
    - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION
    - java.lang.String
  */
  type AggregatedSourceType = typingsJapgolly.awsSdk.configserviceMod._AggregatedSourceType | java.lang.String
  type AggregationAuthorizationList = js.Array[typingsJapgolly.awsSdk.configserviceMod.AggregationAuthorization]
  type AggregatorRegionList = js.Array[typingsJapgolly.awsSdk.configserviceMod.String]
  type AllSupported = scala.Boolean
  type AmazonResourceName = java.lang.String
  type Annotation = java.lang.String
  type AutoRemediationAttemptSeconds = scala.Double
  type AutoRemediationAttempts = scala.Double
  type AvailabilityZone = java.lang.String
  type AwsRegion = java.lang.String
  type BaseConfigurationItems = js.Array[typingsJapgolly.awsSdk.configserviceMod.BaseConfigurationItem]
  type BaseResourceId = java.lang.String
  type Boolean = scala.Boolean
  type ChannelName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Reverse
    - typingsJapgolly.awsSdk.awsSdkStrings.Forward_
    - java.lang.String
  */
  type ChronologicalOrder = typingsJapgolly.awsSdk.configserviceMod._ChronologicalOrder | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.configserviceMod.ClientApiVersions
  type ComplianceByConfigRules = js.Array[typingsJapgolly.awsSdk.configserviceMod.ComplianceByConfigRule]
  type ComplianceByResources = js.Array[typingsJapgolly.awsSdk.configserviceMod.ComplianceByResource]
  type ComplianceResourceTypes = js.Array[typingsJapgolly.awsSdk.configserviceMod.StringWithCharLimit256]
  type ComplianceSummariesByResourceType = js.Array[typingsJapgolly.awsSdk.configserviceMod.ComplianceSummaryByResourceType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANT
    - typingsJapgolly.awsSdk.awsSdkStrings.NON_COMPLIANT
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_APPLICABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
    - java.lang.String
  */
  type ComplianceType = typingsJapgolly.awsSdk.configserviceMod._ComplianceType | java.lang.String
  type ComplianceTypes = js.Array[typingsJapgolly.awsSdk.configserviceMod.ComplianceType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_REGION
    - java.lang.String
  */
  type ConfigRuleComplianceSummaryGroupKey = typingsJapgolly.awsSdk.configserviceMod._ConfigRuleComplianceSummaryGroupKey | java.lang.String
  type ConfigRuleEvaluationStatusList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConfigRuleEvaluationStatus]
  type ConfigRuleName = java.lang.String
  type ConfigRuleNames = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConfigRuleName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING_RESULTS
    - typingsJapgolly.awsSdk.awsSdkStrings.EVALUATING
    - java.lang.String
  */
  type ConfigRuleState = typingsJapgolly.awsSdk.configserviceMod._ConfigRuleState | java.lang.String
  type ConfigRules = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConfigRule]
  type Configuration = java.lang.String
  type ConfigurationAggregatorArn = java.lang.String
  type ConfigurationAggregatorList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConfigurationAggregator]
  type ConfigurationAggregatorName = java.lang.String
  type ConfigurationAggregatorNameList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConfigurationAggregatorName]
  type ConfigurationItemCaptureTime = js.Date
  type ConfigurationItemList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConfigurationItem]
  type ConfigurationItemMD5Hash = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OK
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourceDiscovered
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotRecorded
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourceDeleted
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourceDeletedNotRecorded
    - java.lang.String
  */
  type ConfigurationItemStatus = typingsJapgolly.awsSdk.configserviceMod._ConfigurationItemStatus | java.lang.String
  type ConfigurationRecorderList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConfigurationRecorder]
  type ConfigurationRecorderNameList = js.Array[typingsJapgolly.awsSdk.configserviceMod.RecorderName]
  type ConfigurationRecorderStatusList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConfigurationRecorderStatus]
  type ConfigurationStateId = java.lang.String
  type ConformancePackArn = java.lang.String
  type ConformancePackComplianceResourceIds = js.Array[typingsJapgolly.awsSdk.configserviceMod.StringWithCharLimit256]
  type ConformancePackComplianceSummaryList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConformancePackComplianceSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANT
    - typingsJapgolly.awsSdk.awsSdkStrings.NON_COMPLIANT
    - java.lang.String
  */
  type ConformancePackComplianceType = typingsJapgolly.awsSdk.configserviceMod._ConformancePackComplianceType | java.lang.String
  type ConformancePackConfigRuleNames = js.Array[typingsJapgolly.awsSdk.configserviceMod.StringWithCharLimit64]
  type ConformancePackDetailList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConformancePackDetail]
  type ConformancePackId = java.lang.String
  type ConformancePackInputParameters = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConformancePackInputParameter]
  type ConformancePackName = java.lang.String
  type ConformancePackNamesList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConformancePackName]
  type ConformancePackNamesToSummarizeList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConformancePackName]
  type ConformancePackRuleComplianceList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConformancePackRuleCompliance]
  type ConformancePackRuleEvaluationResultsList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConformancePackEvaluationResult]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type ConformancePackState = typingsJapgolly.awsSdk.configserviceMod._ConformancePackState | java.lang.String
  type ConformancePackStatusDetailsList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ConformancePackStatusDetail]
  type ConformancePackStatusReason = java.lang.String
  type CosmosPageLimit = scala.Double
  type Date = js.Date
  type DeliveryChannelList = js.Array[typingsJapgolly.awsSdk.configserviceMod.DeliveryChannel]
  type DeliveryChannelNameList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ChannelName]
  type DeliveryChannelStatusList = js.Array[typingsJapgolly.awsSdk.configserviceMod.DeliveryChannelStatus]
  type DeliveryS3Bucket = java.lang.String
  type DeliveryS3KeyPrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Success_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failure_
    - typingsJapgolly.awsSdk.awsSdkStrings.Not_Applicable_
    - java.lang.String
  */
  type DeliveryStatus = typingsJapgolly.awsSdk.configserviceMod._DeliveryStatus | java.lang.String
  type DescribeConformancePackComplianceLimit = scala.Double
  type DescribePendingAggregationRequestsLimit = scala.Double
  type DiscoveredResourceIdentifierList = js.Array[typingsJapgolly.awsSdk.configserviceMod.AggregateResourceIdentifier]
  type EarlierTime = js.Date
  type EmptiableStringWithCharLimit256 = java.lang.String
  type EvaluationResults = js.Array[typingsJapgolly.awsSdk.configserviceMod.EvaluationResult]
  type Evaluations = js.Array[typingsJapgolly.awsSdk.configserviceMod.Evaluation]
  type EventSource = typingsJapgolly.awsSdk.awsSdkStrings.awsDotconfig | java.lang.String
  type ExcludedAccounts = js.Array[typingsJapgolly.awsSdk.configserviceMod.AccountId]
  type Expression = java.lang.String
  type FailedDeleteRemediationExceptionsBatches = js.Array[typingsJapgolly.awsSdk.configserviceMod.FailedDeleteRemediationExceptionsBatch]
  type FailedRemediationBatches = js.Array[typingsJapgolly.awsSdk.configserviceMod.FailedRemediationBatch]
  type FailedRemediationExceptionBatches = js.Array[typingsJapgolly.awsSdk.configserviceMod.FailedRemediationExceptionBatch]
  type FieldInfoList = js.Array[typingsJapgolly.awsSdk.configserviceMod.FieldInfo]
  type FieldName = java.lang.String
  type GetConformancePackComplianceDetailsLimit = scala.Double
  type GroupByAPILimit = scala.Double
  type GroupedResourceCountList = js.Array[typingsJapgolly.awsSdk.configserviceMod.GroupedResourceCount]
  type IncludeGlobalResourceTypes = scala.Boolean
  type Integer = scala.Double
  type LaterTime = js.Date
  type Limit = scala.Double
  type Long = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.One_Hour_
    - typingsJapgolly.awsSdk.awsSdkStrings.Three_Hours
    - typingsJapgolly.awsSdk.awsSdkStrings.Six_Hours_
    - typingsJapgolly.awsSdk.awsSdkStrings.Twelve_Hours
    - typingsJapgolly.awsSdk.awsSdkStrings.TwentyFour_Hours
    - java.lang.String
  */
  type MaximumExecutionFrequency = typingsJapgolly.awsSdk.configserviceMod._MaximumExecutionFrequency | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type MemberAccountRuleStatus = typingsJapgolly.awsSdk.configserviceMod._MemberAccountRuleStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationItemChangeNotification
    - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationSnapshotDeliveryCompleted
    - typingsJapgolly.awsSdk.awsSdkStrings.ScheduledNotification
    - typingsJapgolly.awsSdk.awsSdkStrings.OversizedConfigurationItemChangeNotification
    - java.lang.String
  */
  type MessageType = typingsJapgolly.awsSdk.configserviceMod._MessageType | java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type OrderingTimestamp = js.Date
  type OrganizationConfigRuleDetailedStatus = js.Array[typingsJapgolly.awsSdk.configserviceMod.MemberAccountStatus]
  type OrganizationConfigRuleName = java.lang.String
  type OrganizationConfigRuleNames = js.Array[typingsJapgolly.awsSdk.configserviceMod.StringWithCharLimit64]
  type OrganizationConfigRuleStatuses = js.Array[typingsJapgolly.awsSdk.configserviceMod.OrganizationConfigRuleStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationItemChangeNotification
    - typingsJapgolly.awsSdk.awsSdkStrings.OversizedConfigurationItemChangeNotification
    - typingsJapgolly.awsSdk.awsSdkStrings.ScheduledNotification
    - java.lang.String
  */
  type OrganizationConfigRuleTriggerType = typingsJapgolly.awsSdk.configserviceMod._OrganizationConfigRuleTriggerType | java.lang.String
  type OrganizationConfigRuleTriggerTypes = js.Array[typingsJapgolly.awsSdk.configserviceMod.OrganizationConfigRuleTriggerType]
  type OrganizationConfigRules = js.Array[typingsJapgolly.awsSdk.configserviceMod.OrganizationConfigRule]
  type OrganizationConformancePackDetailedStatuses = js.Array[
    typingsJapgolly.awsSdk.configserviceMod.OrganizationConformancePackDetailedStatus
  ]
  type OrganizationConformancePackName = java.lang.String
  type OrganizationConformancePackNames = js.Array[typingsJapgolly.awsSdk.configserviceMod.OrganizationConformancePackName]
  type OrganizationConformancePackStatuses = js.Array[typingsJapgolly.awsSdk.configserviceMod.OrganizationConformancePackStatus]
  type OrganizationConformancePacks = js.Array[typingsJapgolly.awsSdk.configserviceMod.OrganizationConformancePack]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type OrganizationResourceDetailedStatus = typingsJapgolly.awsSdk.configserviceMod._OrganizationResourceDetailedStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type OrganizationResourceStatus = typingsJapgolly.awsSdk.configserviceMod._OrganizationResourceStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type OrganizationRuleStatus = typingsJapgolly.awsSdk.configserviceMod._OrganizationRuleStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_LAMBDA
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS
    - java.lang.String
  */
  type Owner = typingsJapgolly.awsSdk.configserviceMod._Owner | java.lang.String
  type PageSizeLimit = scala.Double
  type ParameterName = java.lang.String
  type ParameterValue = java.lang.String
  type PendingAggregationRequestList = js.Array[typingsJapgolly.awsSdk.configserviceMod.PendingAggregationRequest]
  type Percentage = scala.Double
  type RecorderName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Success_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failure_
    - java.lang.String
  */
  type RecorderStatus = typingsJapgolly.awsSdk.configserviceMod._RecorderStatus | java.lang.String
  type ReevaluateConfigRuleNames = js.Array[typingsJapgolly.awsSdk.configserviceMod.StringWithCharLimit64]
  type RelatedEvent = java.lang.String
  type RelatedEventList = js.Array[typingsJapgolly.awsSdk.configserviceMod.RelatedEvent]
  type RelationshipList = js.Array[typingsJapgolly.awsSdk.configserviceMod.Relationship]
  type RelationshipName = java.lang.String
  type RemediationConfigurations = js.Array[typingsJapgolly.awsSdk.configserviceMod.RemediationConfiguration]
  type RemediationExceptionResourceKeys = js.Array[typingsJapgolly.awsSdk.configserviceMod.RemediationExceptionResourceKey]
  type RemediationExceptions = js.Array[typingsJapgolly.awsSdk.configserviceMod.RemediationException]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RemediationExecutionState = typingsJapgolly.awsSdk.configserviceMod._RemediationExecutionState | java.lang.String
  type RemediationExecutionStatuses = js.Array[typingsJapgolly.awsSdk.configserviceMod.RemediationExecutionStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RemediationExecutionStepState = typingsJapgolly.awsSdk.configserviceMod._RemediationExecutionStepState | java.lang.String
  type RemediationExecutionSteps = js.Array[typingsJapgolly.awsSdk.configserviceMod.RemediationExecutionStep]
  type RemediationParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.configserviceMod.RemediationParameterValue]
  type RemediationTargetType = typingsJapgolly.awsSdk.awsSdkStrings.SSM_DOCUMENT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_REGION
    - java.lang.String
  */
  type ResourceCountGroupKey = typingsJapgolly.awsSdk.configserviceMod._ResourceCountGroupKey | java.lang.String
  type ResourceCounts = js.Array[typingsJapgolly.awsSdk.configserviceMod.ResourceCount]
  type ResourceCreationTime = js.Date
  type ResourceDeletionTime = js.Date
  type ResourceId = java.lang.String
  type ResourceIdList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ResourceId]
  type ResourceIdentifierList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ResourceIdentifier]
  type ResourceIdentifiersList = js.Array[typingsJapgolly.awsSdk.configserviceMod.AggregateResourceIdentifier]
  type ResourceKeys = js.Array[typingsJapgolly.awsSdk.configserviceMod.ResourceKey]
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonCustomerGateway
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonEIP
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonHost
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonInstance
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonInternetGateway
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonNetworkAcl
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonNetworkInterface
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonRouteTable
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonSecurityGroup
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonSubnet
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonCloudTrailColonColonTrail
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVolume
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPC
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPNConnection
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPNGateway
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonRegisteredHAInstance
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonNatGateway
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonEgressOnlyInternetGateway
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPCEndpoint
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPCEndpointService
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonFlowLog
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPCPeeringConnection
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonGroup
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonPolicy
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonRole
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonUser
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonElasticLoadBalancingV2ColonColonLoadBalancer
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonACMColonColonCertificate
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBInstance
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBParameterGroup
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBOptionGroup
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSubnetGroup
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSecurityGroup
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBCluster
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBClusterParameterGroup
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBClusterSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonEventSubscription
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonBucket
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonAccountPublicAccessBlock
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonCluster
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterParameterGroup
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterSecurityGroup
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterSubnetGroup
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonEventSubscription
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonManagedInstanceInventory
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonCloudWatchColonColonAlarm
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonCloudFormationColonColonStack
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonElasticLoadBalancingColonColonLoadBalancer
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonAutoScalingGroup
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonLaunchConfiguration
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonScalingPolicy
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonScheduledAction
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonDynamoDBColonColonTable
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonCodeBuildColonColonProject
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonRateBasedRule
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonRule
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonRuleGroup
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonWebACL
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonRateBasedRule
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonRule
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonRuleGroup
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonWebACL
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonCloudFrontColonColonDistribution
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonCloudFrontColonColonStreamingDistribution
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonAlias
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonFunction
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonApplication
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonApplicationVersion
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonEnvironment
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonMobileHubColonColonProject
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonXRayColonColonEncryptionConfig
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonAssociationCompliance
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonPatchCompliance
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonShieldColonColonProtection
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonShieldRegionalColonColonProtection
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonConfigColonColonResourceCompliance
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonLicenseManagerColonColonLicenseConfiguration
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonApiGatewayColonColonDomainName
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonApiGatewayColonColonMethod
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonApiGatewayColonColonStage
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonApiGatewayColonColonRestApi
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonApiGatewayV2ColonColonDomainName
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonApiGatewayV2ColonColonStage
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonApiGatewayV2ColonColonApi
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonCodePipelineColonColonPipeline
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonCloudFormationProvisionedProduct
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonCloudFormationProduct
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonPortfolio
    - java.lang.String
  */
  type ResourceType = typingsJapgolly.awsSdk.configserviceMod._ResourceType | java.lang.String
  type ResourceTypeList = js.Array[typingsJapgolly.awsSdk.configserviceMod.ResourceType]
  type ResourceTypeString = java.lang.String
  type ResourceTypes = js.Array[typingsJapgolly.awsSdk.configserviceMod.StringWithCharLimit256]
  type ResourceTypesScope = js.Array[typingsJapgolly.awsSdk.configserviceMod.StringWithCharLimit256]
  type ResourceValueType = typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_ID | java.lang.String
  type Results = js.Array[typingsJapgolly.awsSdk.configserviceMod.String]
  type RetentionConfigurationList = js.Array[typingsJapgolly.awsSdk.configserviceMod.RetentionConfiguration]
  type RetentionConfigurationName = java.lang.String
  type RetentionConfigurationNameList = js.Array[typingsJapgolly.awsSdk.configserviceMod.RetentionConfigurationName]
  type RetentionPeriodInDays = scala.Double
  type RuleLimit = scala.Double
  type SchemaVersionId = java.lang.String
  type SourceDetails = js.Array[typingsJapgolly.awsSdk.configserviceMod.SourceDetail]
  type StackArn = java.lang.String
  type StaticParameterValues = js.Array[typingsJapgolly.awsSdk.configserviceMod.StringWithCharLimit256]
  type String = java.lang.String
  type StringWithCharLimit1024 = java.lang.String
  type StringWithCharLimit128 = java.lang.String
  type StringWithCharLimit2048 = java.lang.String
  type StringWithCharLimit256 = java.lang.String
  type StringWithCharLimit256Min0 = java.lang.String
  type StringWithCharLimit64 = java.lang.String
  type StringWithCharLimit768 = java.lang.String
  type SupplementaryConfiguration = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.configserviceMod.SupplementaryConfigurationValue]
  type SupplementaryConfigurationName = java.lang.String
  type SupplementaryConfigurationValue = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.configserviceMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.configserviceMod.Tag]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.configserviceMod.Value]
  type TagsList = js.Array[typingsJapgolly.awsSdk.configserviceMod.Tag]
  type TemplateBody = java.lang.String
  type TemplateS3Uri = java.lang.String
  type UnprocessedResourceIdentifierList = js.Array[typingsJapgolly.awsSdk.configserviceMod.AggregateResourceIdentifier]
  type Value = java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-11-12`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.configserviceMod._apiVersion | java.lang.String
}
