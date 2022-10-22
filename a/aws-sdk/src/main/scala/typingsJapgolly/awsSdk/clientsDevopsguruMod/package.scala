package typingsJapgolly.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.LOG_GROUPS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountHealths = js.Array[AccountHealth]

type AccountIdList = js.Array[AwsAccountId]

type AnomalousLogGroups = js.Array[AnomalousLogGroup]

type AnomalyDescription = String

type AnomalyId = String

type AnomalyLimit = Double

type AnomalyName = String

type AnomalyResources = js.Array[AnomalyResource]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LOW
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - java.lang.String
*/
type AnomalySeverity = _AnomalySeverity | String

type AnomalySource = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ONGOING
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED
  - java.lang.String
*/
type AnomalyStatus = _AnomalyStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CAUSAL
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTEXTUAL
  - java.lang.String
*/
type AnomalyType = _AnomalyType | String

type AppBoundaryKey = String

type AssociatedResourceArns = js.Array[ResourceArn]

type AwsAccountId = String

type Channels = js.Array[NotificationChannel]

type ClientToken = String

type CloudFormationHealths = js.Array[CloudFormationHealth]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalError
  - typingsJapgolly.awsSdk.awsSdkStrings.PartialData
  - java.lang.String
*/
type CloudWatchMetricDataStatusCode = _CloudWatchMetricDataStatusCode | String

type CloudWatchMetricsDetails = js.Array[CloudWatchMetricsDetail]

type CloudWatchMetricsDimensionName = String

type CloudWatchMetricsDimensionValue = String

type CloudWatchMetricsDimensions = js.Array[CloudWatchMetricsDimension]

type CloudWatchMetricsMetricName = String

type CloudWatchMetricsNamespace = String

type CloudWatchMetricsPeriod = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Sum_
  - typingsJapgolly.awsSdk.awsSdkStrings.Average_
  - typingsJapgolly.awsSdk.awsSdkStrings.SampleCount
  - typingsJapgolly.awsSdk.awsSdkStrings.Minimum_
  - typingsJapgolly.awsSdk.awsSdkStrings.Maximum_
  - typingsJapgolly.awsSdk.awsSdkStrings.p99
  - typingsJapgolly.awsSdk.awsSdkStrings.p90
  - typingsJapgolly.awsSdk.awsSdkStrings.p50
  - java.lang.String
*/
type CloudWatchMetricsStat = _CloudWatchMetricsStat | String

type CloudWatchMetricsUnit = String

type Cost = Double

type CostEstimationServiceResourceCount = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type CostEstimationServiceResourceState = _CostEstimationServiceResourceState | String

type CostEstimationStackNames = js.Array[StackName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ONGOING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type CostEstimationStatus = _CostEstimationStatus | String

type CostEstimationTagValues = js.Array[TagValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INFRASTRUCTURE
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.SECURITY_CHANGE
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIG_CHANGE
  - typingsJapgolly.awsSdk.awsSdkStrings.SCHEMA_CHANGE
  - java.lang.String
*/
type EventClass = _EventClass | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_CLOUD_TRAIL
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_CODE_DEPLOY
  - java.lang.String
*/
type EventDataSource = _EventDataSource | String

type EventId = String

type EventName = String

type EventResourceArn = String

type EventResourceName = String

type EventResourceType = String

type EventResources = js.Array[EventResource]

type EventSource = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type EventSourceOptInStatus = _EventSourceOptInStatus | String

type Events = js.Array[Event]

type Explanation = String

type InsightDescription = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VALID_COLLECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.RECOMMENDATION_USEFUL
  - typingsJapgolly.awsSdk.awsSdkStrings.ALERT_TOO_SENSITIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_NOISY_ANOMALY
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_INCORRECT
  - java.lang.String
*/
type InsightFeedbackOption = _InsightFeedbackOption | String

type InsightId = String

type InsightName = String

type InsightSeverities = js.Array[InsightSeverity]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LOW
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - java.lang.String
*/
type InsightSeverity = _InsightSeverity | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ONGOING
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED
  - java.lang.String
*/
type InsightStatus = _InsightStatus | String

type InsightStatuses = js.Array[InsightStatus]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.PROACTIVE
  - java.lang.String
*/
type InsightType = _InsightType | String

type ListAnomaliesForInsightMaxResults = Double

type ListAnomalousLogGroupsMaxResults = Double

type ListEventsMaxResults = Double

type ListInsightsAccountIdList = js.Array[AwsAccountId]

type ListInsightsMaxResults = Double

type ListInsightsOrganizationalUnitIdList = js.Array[OrganizationalUnitId]

type ListMonitoredResourcesMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DE_DE
  - typingsJapgolly.awsSdk.awsSdkStrings.EN_US
  - typingsJapgolly.awsSdk.awsSdkStrings.EN_GB
  - typingsJapgolly.awsSdk.awsSdkStrings.ES_ES
  - typingsJapgolly.awsSdk.awsSdkStrings.FR_FR
  - typingsJapgolly.awsSdk.awsSdkStrings.IT_IT
  - typingsJapgolly.awsSdk.awsSdkStrings.JA_JP
  - typingsJapgolly.awsSdk.awsSdkStrings.KO_KR
  - typingsJapgolly.awsSdk.awsSdkStrings.PT_BR
  - typingsJapgolly.awsSdk.awsSdkStrings.ZH_CN
  - typingsJapgolly.awsSdk.awsSdkStrings.ZH_TW
  - java.lang.String
*/
type Locale = _Locale | String

type LogAnomalyClasses = js.Array[LogAnomalyClass]

type LogAnomalyShowcases = js.Array[LogAnomalyShowcase]

type LogAnomalyToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.KEYWORD
  - typingsJapgolly.awsSdk.awsSdkStrings.KEYWORD_TOKEN
  - typingsJapgolly.awsSdk.awsSdkStrings.FORMAT
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTP_CODE
  - typingsJapgolly.awsSdk.awsSdkStrings.BLOCK_FORMAT
  - typingsJapgolly.awsSdk.awsSdkStrings.NUMERICAL_POINT
  - typingsJapgolly.awsSdk.awsSdkStrings.NUMERICAL_NAN
  - typingsJapgolly.awsSdk.awsSdkStrings.NEW_FIELD_NAME
  - java.lang.String
*/
type LogAnomalyType = _LogAnomalyType | String

type LogEventId = String

type LogGroupName = String

type LogStreamName = String

type MeanTimeToRecoverInMilliseconds = Double

type MetricValue = Double

type MonitoredResourceIdentifiers = js.Array[MonitoredResourceIdentifier]

type MonitoredResourceName = String

type NotificationChannelId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NEW_INSIGHT
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED_INSIGHT
  - typingsJapgolly.awsSdk.awsSdkStrings.NEW_ASSOCIATION
  - typingsJapgolly.awsSdk.awsSdkStrings.SEVERITY_UPGRADED
  - typingsJapgolly.awsSdk.awsSdkStrings.NEW_RECOMMENDATION
  - java.lang.String
*/
type NotificationMessageType = _NotificationMessageType | String

type NotificationMessageTypes = js.Array[NotificationMessageType]

type NumMetricsAnalyzed = Double

type NumOpenProactiveInsights = Double

type NumOpenReactiveInsights = Double

type NumProactiveInsights = Double

type NumReactiveInsights = Double

type NumberOfLogLinesOccurrences = Double

type NumberOfLogLinesScanned = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type OptInStatus = _OptInStatus | String

type OrganizationResourceCollectionMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_CLOUD_FORMATION
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_SERVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_ACCOUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_TAGS
  - java.lang.String
*/
type OrganizationResourceCollectionType = _OrganizationResourceCollectionType | String

type OrganizationalUnitId = String

type OrganizationalUnitIdList = js.Array[OrganizationalUnitId]

type PerformanceInsightsMetricDimension = String

type PerformanceInsightsMetricDimensions = js.Array[PerformanceInsightsMetricDimension]

type PerformanceInsightsMetricDisplayName = String

type PerformanceInsightsMetricFilterKey = String

type PerformanceInsightsMetricFilterMap = StringDictionary[PerformanceInsightsMetricFilterValue]

type PerformanceInsightsMetricFilterValue = String

type PerformanceInsightsMetricGroup = String

type PerformanceInsightsMetricLimitInteger = Double

type PerformanceInsightsMetricName = String

type PerformanceInsightsMetricUnit = String

type PerformanceInsightsMetricsDetails = js.Array[PerformanceInsightsMetricsDetail]

type PerformanceInsightsReferenceDataList = js.Array[PerformanceInsightsReferenceData]

type PerformanceInsightsReferenceName = String

type PerformanceInsightsStatType = String

type PerformanceInsightsStats = js.Array[PerformanceInsightsStat]

type PerformanceInsightsValueDouble = Double

type ProactiveAnomalies = js.Array[ProactiveAnomalySummary]

type ProactiveInsights = js.Array[ProactiveInsightSummary]

type ProactiveOrganizationInsights = js.Array[ProactiveOrganizationInsightSummary]

type ReactiveAnomalies = js.Array[ReactiveAnomalySummary]

type ReactiveInsights = js.Array[ReactiveInsightSummary]

type ReactiveOrganizationInsights = js.Array[ReactiveOrganizationInsightSummary]

type RecommendationCategory = String

type RecommendationDescription = String

type RecommendationLink = String

type RecommendationName = String

type RecommendationReason = String

type RecommendationRelatedAnomalies = js.Array[RecommendationRelatedAnomaly]

type RecommendationRelatedAnomalyResourceName = String

type RecommendationRelatedAnomalyResourceType = String

type RecommendationRelatedAnomalyResources = js.Array[RecommendationRelatedAnomalyResource]

type RecommendationRelatedCloudWatchMetricsSourceDetails = js.Array[RecommendationRelatedCloudWatchMetricsSourceDetail]

type RecommendationRelatedCloudWatchMetricsSourceMetricName = String

type RecommendationRelatedCloudWatchMetricsSourceNamespace = String

type RecommendationRelatedEventName = String

type RecommendationRelatedEventResourceName = String

type RecommendationRelatedEventResourceType = String

type RecommendationRelatedEventResources = js.Array[RecommendationRelatedEventResource]

type RecommendationRelatedEvents = js.Array[RecommendationRelatedEvent]

type Recommendations = js.Array[Recommendation]

type RelatedAnomalySourceDetails = js.Array[RecommendationRelatedAnomalySourceDetail]

type ResourceArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_CLOUD_FORMATION
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_SERVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_TAGS
  - java.lang.String
*/
type ResourceCollectionType = _ResourceCollectionType | String

type ResourceHours = Double

type ResourceName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL_PERMISSION
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSING_PERMISSION
  - java.lang.String
*/
type ResourcePermission = _ResourcePermission | String

type ResourceType = String

type ResourceTypeFilter = LOG_GROUPS | String

type ResourceTypeFilters = js.Array[ResourceTypeFilter]

type SearchInsightsAccountIdList = js.Array[AwsAccountId]

type SearchInsightsMaxResults = Double

type SearchOrganizationInsightsMaxResults = Double

type ServiceHealths = js.Array[ServiceHealth]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.API_GATEWAY
  - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION_ELB
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTO_SCALING_GROUP
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOUD_FRONT
  - typingsJapgolly.awsSdk.awsSdkStrings.DYNAMO_DB
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2
  - typingsJapgolly.awsSdk.awsSdkStrings.ECS
  - typingsJapgolly.awsSdk.awsSdkStrings.EKS
  - typingsJapgolly.awsSdk.awsSdkStrings.ELASTIC_BEANSTALK
  - typingsJapgolly.awsSdk.awsSdkStrings.ELASTI_CACHE
  - typingsJapgolly.awsSdk.awsSdkStrings.ELB
  - typingsJapgolly.awsSdk.awsSdkStrings.ES
  - typingsJapgolly.awsSdk.awsSdkStrings.KINESIS
  - typingsJapgolly.awsSdk.awsSdkStrings.LAMBDA
  - typingsJapgolly.awsSdk.awsSdkStrings.NAT_GATEWAY
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_ELB
  - typingsJapgolly.awsSdk.awsSdkStrings.RDS
  - typingsJapgolly.awsSdk.awsSdkStrings.REDSHIFT
  - typingsJapgolly.awsSdk.awsSdkStrings.ROUTE_53
  - typingsJapgolly.awsSdk.awsSdkStrings.S3
  - typingsJapgolly.awsSdk.awsSdkStrings.SAGE_MAKER
  - typingsJapgolly.awsSdk.awsSdkStrings.SNS
  - typingsJapgolly.awsSdk.awsSdkStrings.SQS
  - typingsJapgolly.awsSdk.awsSdkStrings.STEP_FUNCTIONS
  - typingsJapgolly.awsSdk.awsSdkStrings.SWF
  - java.lang.String
*/
type ServiceName = _ServiceName | String

type ServiceNames = js.Array[ServiceName]

type ServiceResourceCosts = js.Array[ServiceResourceCost]

type SsmOpsItemId = String

type StackName = String

type StackNames = js.Array[StackName]

type TagCollectionFilters = js.Array[TagCollectionFilter]

type TagCollections = js.Array[TagCollection]

type TagCostEstimationResourceCollectionFilters = js.Array[TagCostEstimationResourceCollectionFilter]

type TagHealths = js.Array[TagHealth]

type TagValue = String

type TagValues = js.Array[TagValue]

type Timestamp = js.Date

type TimestampMetricValuePairList = js.Array[TimestampMetricValuePair]

type TopicArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ADD
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE
  - java.lang.String
*/
type UpdateResourceCollectionAction = _UpdateResourceCollectionAction | String

type UpdateStackNames = js.Array[StackName]

type UpdateTagCollectionFilters = js.Array[UpdateTagCollectionFilter]

type UpdateTagValues = js.Array[TagValue]

type UuidNextToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-12-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
