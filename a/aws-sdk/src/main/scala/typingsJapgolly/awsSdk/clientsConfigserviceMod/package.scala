package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_ID
import typingsJapgolly.awsSdk.awsSdkStrings.SCORE
import typingsJapgolly.awsSdk.awsSdkStrings.SSM_DOCUMENT
import typingsJapgolly.awsSdk.awsSdkStrings.awsDotconfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = java.lang.String

type AccountAggregationSourceAccountList = js.Array[AccountId]

type AccountAggregationSourceList = js.Array[AccountAggregationSource]

type AccountId = java.lang.String

type AggregateComplianceByConfigRuleList = js.Array[AggregateComplianceByConfigRule]

type AggregateComplianceByConformancePackList = js.Array[AggregateComplianceByConformancePack]

type AggregateComplianceCountList = js.Array[AggregateComplianceCount]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_REGION
  - java.lang.String
*/
type AggregateConformancePackComplianceSummaryGroupKey = _AggregateConformancePackComplianceSummaryGroupKey | java.lang.String

type AggregateConformancePackComplianceSummaryList = js.Array[AggregateConformancePackComplianceSummary]

type AggregateEvaluationResultList = js.Array[AggregateEvaluationResult]

type AggregatedSourceStatusList = js.Array[AggregatedSourceStatus]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.OUTDATED
  - java.lang.String
*/
type AggregatedSourceStatusType = _AggregatedSourceStatusType | java.lang.String

type AggregatedSourceStatusTypeList = js.Array[AggregatedSourceStatusType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION
  - java.lang.String
*/
type AggregatedSourceType = _AggregatedSourceType | java.lang.String

type AggregationAuthorizationList = js.Array[AggregationAuthorization]

type AggregatorRegionList = js.Array[String]

type AllSupported = scala.Boolean

type AmazonResourceName = java.lang.String

type Annotation = java.lang.String

type AutoRemediationAttemptSeconds = Double

type AutoRemediationAttempts = Double

type AvailabilityZone = java.lang.String

type AwsRegion = java.lang.String

type BaseConfigurationItems = js.Array[BaseConfigurationItem]

type BaseResourceId = java.lang.String

type Boolean = scala.Boolean

type ChannelName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Reverse
  - typingsJapgolly.awsSdk.awsSdkStrings.Forward_
  - java.lang.String
*/
type ChronologicalOrder = _ChronologicalOrder | java.lang.String

type ComplianceByConfigRules = js.Array[ComplianceByConfigRule]

type ComplianceByResources = js.Array[ComplianceByResource]

type ComplianceResourceTypes = js.Array[StringWithCharLimit256]

type ComplianceScore = java.lang.String

type ComplianceSummariesByResourceType = js.Array[ComplianceSummaryByResourceType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANT
  - typingsJapgolly.awsSdk.awsSdkStrings.NON_COMPLIANT
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_APPLICABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
  - java.lang.String
*/
type ComplianceType = _ComplianceType | java.lang.String

type ComplianceTypes = js.Array[ComplianceType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_REGION
  - java.lang.String
*/
type ConfigRuleComplianceSummaryGroupKey = _ConfigRuleComplianceSummaryGroupKey | java.lang.String

type ConfigRuleEvaluationStatusList = js.Array[ConfigRuleEvaluationStatus]

type ConfigRuleName = java.lang.String

type ConfigRuleNames = js.Array[ConfigRuleName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING_RESULTS
  - typingsJapgolly.awsSdk.awsSdkStrings.EVALUATING
  - java.lang.String
*/
type ConfigRuleState = _ConfigRuleState | java.lang.String

type ConfigRules = js.Array[ConfigRule]

type Configuration = java.lang.String

type ConfigurationAggregatorArn = java.lang.String

type ConfigurationAggregatorList = js.Array[ConfigurationAggregator]

type ConfigurationAggregatorName = java.lang.String

type ConfigurationAggregatorNameList = js.Array[ConfigurationAggregatorName]

type ConfigurationItemCaptureTime = js.Date

type ConfigurationItemList = js.Array[ConfigurationItem]

type ConfigurationItemMD5Hash = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OK
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceDiscovered
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotRecorded
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceDeleted
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceDeletedNotRecorded
  - java.lang.String
*/
type ConfigurationItemStatus = _ConfigurationItemStatus | java.lang.String

type ConfigurationRecorderList = js.Array[ConfigurationRecorder]

type ConfigurationRecorderNameList = js.Array[RecorderName]

type ConfigurationRecorderStatusList = js.Array[ConfigurationRecorderStatus]

type ConfigurationStateId = java.lang.String

type ConformancePackArn = java.lang.String

type ConformancePackComplianceResourceIds = js.Array[StringWithCharLimit256]

type ConformancePackComplianceScores = js.Array[ConformancePackComplianceScore]

type ConformancePackComplianceSummaryList = js.Array[ConformancePackComplianceSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLIANT
  - typingsJapgolly.awsSdk.awsSdkStrings.NON_COMPLIANT
  - typingsJapgolly.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
  - java.lang.String
*/
type ConformancePackComplianceType = _ConformancePackComplianceType | java.lang.String

type ConformancePackConfigRuleNames = js.Array[StringWithCharLimit64]

type ConformancePackDetailList = js.Array[ConformancePackDetail]

type ConformancePackId = java.lang.String

type ConformancePackInputParameters = js.Array[ConformancePackInputParameter]

type ConformancePackName = java.lang.String

type ConformancePackNameFilter = js.Array[ConformancePackName]

type ConformancePackNamesList = js.Array[ConformancePackName]

type ConformancePackNamesToSummarizeList = js.Array[ConformancePackName]

type ConformancePackRuleComplianceList = js.Array[ConformancePackRuleCompliance]

type ConformancePackRuleEvaluationResultsList = js.Array[ConformancePackEvaluationResult]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type ConformancePackState = _ConformancePackState | java.lang.String

type ConformancePackStatusDetailsList = js.Array[ConformancePackStatusDetail]

type ConformancePackStatusReason = java.lang.String

type ControlsList = js.Array[StringWithCharLimit128]

type CosmosPageLimit = Double

type Date = js.Date

type DebugLogDeliveryAccounts = js.Array[AccountId]

type DeliveryChannelList = js.Array[DeliveryChannel]

type DeliveryChannelNameList = js.Array[ChannelName]

type DeliveryChannelStatusList = js.Array[DeliveryChannelStatus]

type DeliveryS3Bucket = java.lang.String

type DeliveryS3KeyPrefix = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failure_
  - typingsJapgolly.awsSdk.awsSdkStrings.Not_Applicable_
  - java.lang.String
*/
type DeliveryStatus = _DeliveryStatus | java.lang.String

type DescribeConformancePackComplianceLimit = Double

type DescribePendingAggregationRequestsLimit = Double

type DiscoveredResourceIdentifierList = js.Array[AggregateResourceIdentifier]

type EarlierTime = js.Date

type EmptiableStringWithCharLimit256 = java.lang.String

type EvaluationResults = js.Array[EvaluationResult]

type Evaluations = js.Array[Evaluation]

type EventSource = awsDotconfig | java.lang.String

type ExcludedAccounts = js.Array[AccountId]

type Expression = java.lang.String

type FailedDeleteRemediationExceptionsBatches = js.Array[FailedDeleteRemediationExceptionsBatch]

type FailedRemediationBatches = js.Array[FailedRemediationBatch]

type FailedRemediationExceptionBatches = js.Array[FailedRemediationExceptionBatch]

type FieldInfoList = js.Array[FieldInfo]

type FieldName = java.lang.String

type GetConformancePackComplianceDetailsLimit = Double

type GroupByAPILimit = Double

type GroupedResourceCountList = js.Array[GroupedResourceCount]

type IncludeGlobalResourceTypes = scala.Boolean

type Integer = Double

type LastUpdatedTime = js.Date

type LaterTime = js.Date

type Limit = Double

type Long = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.One_Hour_
  - typingsJapgolly.awsSdk.awsSdkStrings.Three_Hours
  - typingsJapgolly.awsSdk.awsSdkStrings.Six_Hours_
  - typingsJapgolly.awsSdk.awsSdkStrings.Twelve_Hours
  - typingsJapgolly.awsSdk.awsSdkStrings.TwentyFour_Hours
  - java.lang.String
*/
type MaximumExecutionFrequency = _MaximumExecutionFrequency | java.lang.String

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
type MemberAccountRuleStatus = _MemberAccountRuleStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationItemChangeNotification
  - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationSnapshotDeliveryCompleted
  - typingsJapgolly.awsSdk.awsSdkStrings.ScheduledNotification
  - typingsJapgolly.awsSdk.awsSdkStrings.OversizedConfigurationItemChangeNotification
  - java.lang.String
*/
type MessageType = _MessageType | java.lang.String

type Name = java.lang.String

type NextToken = java.lang.String

type OrderingTimestamp = js.Date

type OrganizationConfigRuleDetailedStatus = js.Array[MemberAccountStatus]

type OrganizationConfigRuleName = java.lang.String

type OrganizationConfigRuleNames = js.Array[StringWithCharLimit64]

type OrganizationConfigRuleStatuses = js.Array[OrganizationConfigRuleStatus]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationItemChangeNotification
  - typingsJapgolly.awsSdk.awsSdkStrings.OversizedConfigurationItemChangeNotification
  - typingsJapgolly.awsSdk.awsSdkStrings.ScheduledNotification
  - java.lang.String
*/
type OrganizationConfigRuleTriggerType = _OrganizationConfigRuleTriggerType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationItemChangeNotification
  - typingsJapgolly.awsSdk.awsSdkStrings.OversizedConfigurationItemChangeNotification
  - java.lang.String
*/
type OrganizationConfigRuleTriggerTypeNoSN = _OrganizationConfigRuleTriggerTypeNoSN | java.lang.String

type OrganizationConfigRuleTriggerTypeNoSNs = js.Array[OrganizationConfigRuleTriggerTypeNoSN]

type OrganizationConfigRuleTriggerTypes = js.Array[OrganizationConfigRuleTriggerType]

type OrganizationConfigRules = js.Array[OrganizationConfigRule]

type OrganizationConformancePackDetailedStatuses = js.Array[OrganizationConformancePackDetailedStatus]

type OrganizationConformancePackName = java.lang.String

type OrganizationConformancePackNames = js.Array[OrganizationConformancePackName]

type OrganizationConformancePackStatuses = js.Array[OrganizationConformancePackStatus]

type OrganizationConformancePacks = js.Array[OrganizationConformancePack]

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
type OrganizationResourceDetailedStatus = _OrganizationResourceDetailedStatus | java.lang.String

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
type OrganizationResourceStatus = _OrganizationResourceStatus | java.lang.String

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
type OrganizationRuleStatus = _OrganizationRuleStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_LAMBDA
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_POLICY
  - java.lang.String
*/
type Owner = _Owner | java.lang.String

type PageSizeLimit = Double

type ParameterName = java.lang.String

type ParameterValue = java.lang.String

type PendingAggregationRequestList = js.Array[PendingAggregationRequest]

type Percentage = Double

type PolicyRuntime = java.lang.String

type PolicyText = java.lang.String

type QueryArn = java.lang.String

type QueryDescription = java.lang.String

type QueryExpression = java.lang.String

type QueryId = java.lang.String

type QueryName = java.lang.String

type RecorderName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failure_
  - java.lang.String
*/
type RecorderStatus = _RecorderStatus | java.lang.String

type ReevaluateConfigRuleNames = js.Array[ConfigRuleName]

type RelatedEvent = java.lang.String

type RelatedEventList = js.Array[RelatedEvent]

type RelationshipList = js.Array[Relationship]

type RelationshipName = java.lang.String

type RemediationConfigurations = js.Array[RemediationConfiguration]

type RemediationExceptionResourceKeys = js.Array[RemediationExceptionResourceKey]

type RemediationExceptions = js.Array[RemediationException]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type RemediationExecutionState = _RemediationExecutionState | java.lang.String

type RemediationExecutionStatuses = js.Array[RemediationExecutionStatus]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type RemediationExecutionStepState = _RemediationExecutionStepState | java.lang.String

type RemediationExecutionSteps = js.Array[RemediationExecutionStep]

type RemediationParameters = StringDictionary[RemediationParameterValue]

type RemediationTargetType = SSM_DOCUMENT | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_REGION
  - java.lang.String
*/
type ResourceCountGroupKey = _ResourceCountGroupKey | java.lang.String

type ResourceCounts = js.Array[ResourceCount]

type ResourceCreationTime = js.Date

type ResourceDeletionTime = js.Date

type ResourceId = java.lang.String

type ResourceIdList = js.Array[ResourceId]

type ResourceIdentifierList = js.Array[ResourceIdentifier]

type ResourceIdentifiersList = js.Array[AggregateResourceIdentifier]

type ResourceKeys = js.Array[ResourceKey]

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
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonElasticsearchColonColonDomain
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonPolicy
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonRole
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonUser
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonElasticLoadBalancingV2ColonColonLoadBalancer
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonACMColonColonCertificate
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBInstance
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSubnetGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSecurityGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSnapshot
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBCluster
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
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonFunction
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonNetworkFirewallColonColonFirewall
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonNetworkFirewallColonColonFirewallPolicy
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonNetworkFirewallColonColonRuleGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonApplication
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonApplicationVersion
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonEnvironment
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonWebACL
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonRuleGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonIPSet
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonRegexPatternSet
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonManagedRuleSet
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonXRayColonColonEncryptionConfig
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonAssociationCompliance
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonPatchCompliance
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonShieldColonColonProtection
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonShieldRegionalColonColonProtection
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonConfigColonColonConformancePackCompliance
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonConfigColonColonResourceCompliance
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonApiGatewayColonColonStage
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonApiGatewayColonColonRestApi
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonApiGatewayV2ColonColonStage
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonApiGatewayV2ColonColonApi
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonCodePipelineColonColonPipeline
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonCloudFormationProvisionedProduct
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonCloudFormationProduct
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonPortfolio
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSQSColonColonQueue
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonKMSColonColonKey
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonQLDBColonColonLedger
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSecretsManagerColonColonSecret
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSNSColonColonTopic
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonFileData
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonBackupColonColonBackupPlan
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonBackupColonColonBackupSelection
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonBackupColonColonBackupVault
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonBackupColonColonRecoveryPoint
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonECRColonColonRepository
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonECSColonColonCluster
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonECSColonColonService
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonECSColonColonTaskDefinition
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEFSColonColonAccessPoint
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEFSColonColonFileSystem
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEKSColonColonCluster
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonOpenSearchColonColonDomain
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonTransitGateway
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonKinesisColonColonStream
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonKinesisColonColonStreamConsumer
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonCodeDeployColonColonApplication
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonCodeDeployColonColonDeploymentConfig
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonCodeDeployColonColonDeploymentGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonLaunchTemplate
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonECRColonColonPublicRepository
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonGuardDutyColonColonDetector
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEMRColonColonSecurityConfiguration
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonCodeRepository
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRoute53ResolverColonColonResolverEndpoint
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRoute53ResolverColonColonResolverRule
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonRoute53ResolverColonColonResolverRuleAssociation
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonDMSColonColonReplicationSubnetGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonDMSColonColonEventSubscription
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonMSKColonColonCluster
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonStepFunctionsColonColonActivity
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWorkSpacesColonColonWorkspace
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonWorkSpacesColonColonConnectionAlias
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonModel
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonElasticLoadBalancingV2ColonColonListener
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonStepFunctionsColonColonStateMachine
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonBatchColonColonJobQueue
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonBatchColonColonComputeEnvironment
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonAccessAnalyzerColonColonAnalyzer
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonAthenaColonColonWorkGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonAthenaColonColonDataCatalog
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonDetectiveColonColonGraph
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonGlobalAcceleratorColonColonAccelerator
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonGlobalAcceleratorColonColonEndpointGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonGlobalAcceleratorColonColonListener
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonTransitGatewayAttachment
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonTransitGatewayRouteTable
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonDMSColonColonCertificate
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

type ResourceTypeList = js.Array[ResourceType]

type ResourceTypeString = java.lang.String

type ResourceTypes = js.Array[StringWithCharLimit256]

type ResourceTypesScope = js.Array[StringWithCharLimit256]

type ResourceValueType = RESOURCE_ID | java.lang.String

type Results = js.Array[String]

type RetentionConfigurationList = js.Array[RetentionConfiguration]

type RetentionConfigurationName = java.lang.String

type RetentionConfigurationNameList = js.Array[RetentionConfigurationName]

type RetentionPeriodInDays = Double

type RuleLimit = Double

type SSMDocumentName = java.lang.String

type SSMDocumentVersion = java.lang.String

type SchemaVersionId = java.lang.String

type SortBy = SCORE | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type SourceDetails = js.Array[SourceDetail]

type StackArn = java.lang.String

type StaticParameterValues = js.Array[StringWithCharLimit256]

type StoredQueryMetadataList = js.Array[StoredQueryMetadata]

type String = java.lang.String

type StringWithCharLimit1024 = java.lang.String

type StringWithCharLimit128 = java.lang.String

type StringWithCharLimit2048 = java.lang.String

type StringWithCharLimit256 = java.lang.String

type StringWithCharLimit256Min0 = java.lang.String

type StringWithCharLimit64 = java.lang.String

type StringWithCharLimit768 = java.lang.String

type SupplementaryConfiguration = StringDictionary[SupplementaryConfigurationValue]

type SupplementaryConfigurationName = java.lang.String

type SupplementaryConfigurationValue = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Tags = StringDictionary[Value]

type TagsList = js.Array[Tag]

type TemplateBody = java.lang.String

type TemplateS3Uri = java.lang.String

type UnprocessedResourceIdentifierList = js.Array[AggregateResourceIdentifier]

type Value = java.lang.String

type Version = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2014-11-12`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
