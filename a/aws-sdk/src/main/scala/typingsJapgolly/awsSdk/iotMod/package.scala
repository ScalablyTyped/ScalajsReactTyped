package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iotMod {
  type AbortAction = typingsJapgolly.awsSdk.awsSdkStrings.CANCEL | java.lang.String
  type AbortCriteriaList = js.Array[typingsJapgolly.awsSdk.iotMod.AbortCriteria]
  type AbortThresholdPercentage = scala.Double
  type AcmCertificateArn = java.lang.String
  type ActionList = js.Array[typingsJapgolly.awsSdk.iotMod.Action]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PUBLISH
    - typingsJapgolly.awsSdk.awsSdkStrings.SUBSCRIBE
    - typingsJapgolly.awsSdk.awsSdkStrings.RECEIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.CONNECT
    - java.lang.String
  */
  type ActionType = typingsJapgolly.awsSdk.iotMod._ActionType | java.lang.String
  type ActiveViolations = js.Array[typingsJapgolly.awsSdk.iotMod.ActiveViolation]
  type AdditionalMetricsToRetainList = js.Array[typingsJapgolly.awsSdk.iotMod.BehaviorMetric]
  type AdditionalParameterMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.Value]
  type AggregationField = java.lang.String
  type AlarmName = java.lang.String
  type AlertTargetArn = java.lang.String
  type AlertTargetType = typingsJapgolly.awsSdk.awsSdkStrings.SNS | java.lang.String
  type AlertTargets = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.AlertTarget]
  type AllowAuthorizerOverride = scala.Boolean
  type AllowAutoRegistration = scala.Boolean
  type ApproximateSecondsBeforeTimedOut = scala.Double
  type AscendingOrder = scala.Boolean
  type AssetId = java.lang.String
  type AssetPropertyAlias = java.lang.String
  type AssetPropertyBooleanValue = java.lang.String
  type AssetPropertyDoubleValue = java.lang.String
  type AssetPropertyEntryId = java.lang.String
  type AssetPropertyId = java.lang.String
  type AssetPropertyIntegerValue = java.lang.String
  type AssetPropertyOffsetInNanos = java.lang.String
  type AssetPropertyQuality = java.lang.String
  type AssetPropertyStringValue = java.lang.String
  type AssetPropertyTimeInSeconds = java.lang.String
  type AssetPropertyValueList = js.Array[typingsJapgolly.awsSdk.iotMod.AssetPropertyValue]
  type AttributeKey = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.AttributeValue]
  type AttributesMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.Value]
  type AuditCheckConfigurations = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.AuditCheckConfiguration]
  type AuditCheckName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.WAITING_FOR_DATA_COLLECTION
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED_COMPLIANT
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED_NON_COMPLIANT
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AuditCheckRunStatus = typingsJapgolly.awsSdk.iotMod._AuditCheckRunStatus | java.lang.String
  type AuditCheckToActionsMapping = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.MitigationActionNameList]
  type AuditCheckToReasonCodeFilter = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.ReasonForNonComplianceCodes]
  type AuditDetails = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.AuditCheckDetails]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
    - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
    - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
    - typingsJapgolly.awsSdk.awsSdkStrings.LOW
    - java.lang.String
  */
  type AuditFindingSeverity = typingsJapgolly.awsSdk.iotMod._AuditFindingSeverity | java.lang.String
  type AuditFindings = js.Array[typingsJapgolly.awsSdk.iotMod.AuditFinding]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DAILY
    - typingsJapgolly.awsSdk.awsSdkStrings.WEEKLY
    - typingsJapgolly.awsSdk.awsSdkStrings.BIWEEKLY
    - typingsJapgolly.awsSdk.awsSdkStrings.MONTHLY
    - java.lang.String
  */
  type AuditFrequency = typingsJapgolly.awsSdk.iotMod._AuditFrequency | java.lang.String
  type AuditMitigationActionExecutionMetadataList = js.Array[typingsJapgolly.awsSdk.iotMod.AuditMitigationActionExecutionMetadata]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
    - typingsJapgolly.awsSdk.awsSdkStrings.SKIPPED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type AuditMitigationActionsExecutionStatus = typingsJapgolly.awsSdk.iotMod._AuditMitigationActionsExecutionStatus | java.lang.String
  type AuditMitigationActionsTaskId = java.lang.String
  type AuditMitigationActionsTaskMetadataList = js.Array[typingsJapgolly.awsSdk.iotMod.AuditMitigationActionsTaskMetadata]
  type AuditMitigationActionsTaskStatistics = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.TaskStatisticsForAuditCheck]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type AuditMitigationActionsTaskStatus = typingsJapgolly.awsSdk.iotMod._AuditMitigationActionsTaskStatus | java.lang.String
  type AuditNotificationTargetConfigurations = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.AuditNotificationTarget]
  type AuditNotificationType = typingsJapgolly.awsSdk.awsSdkStrings.SNS | java.lang.String
  type AuditTaskId = java.lang.String
  type AuditTaskMetadataList = js.Array[typingsJapgolly.awsSdk.iotMod.AuditTaskMetadata]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type AuditTaskStatus = typingsJapgolly.awsSdk.iotMod._AuditTaskStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND_AUDIT_TASK
    - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULED_AUDIT_TASK
    - java.lang.String
  */
  type AuditTaskType = typingsJapgolly.awsSdk.iotMod._AuditTaskType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALLOWED
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPLICIT_DENY
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPLICIT_DENY
    - java.lang.String
  */
  type AuthDecision = typingsJapgolly.awsSdk.iotMod._AuthDecision | java.lang.String
  type AuthInfos = js.Array[typingsJapgolly.awsSdk.iotMod.AuthInfo]
  type AuthResults = js.Array[typingsJapgolly.awsSdk.iotMod.AuthResult]
  type AuthorizerArn = java.lang.String
  type AuthorizerFunctionArn = java.lang.String
  type AuthorizerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type AuthorizerStatus = typingsJapgolly.awsSdk.iotMod._AuthorizerStatus | java.lang.String
  type Authorizers = js.Array[typingsJapgolly.awsSdk.iotMod.AuthorizerSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE
    - java.lang.String
  */
  type AutoRegistrationStatus = typingsJapgolly.awsSdk.iotMod._AutoRegistrationStatus | java.lang.String
  type Average = scala.Double
  type AwsAccountId = java.lang.String
  type AwsArn = java.lang.String
  type AwsIotJobArn = java.lang.String
  type AwsIotJobId = java.lang.String
  type AwsIotSqlVersion = java.lang.String
  type BehaviorMetric = java.lang.String
  type BehaviorName = java.lang.String
  type Behaviors = js.Array[typingsJapgolly.awsSdk.iotMod.Behavior]
  type BillingGroupArn = java.lang.String
  type BillingGroupDescription = java.lang.String
  type BillingGroupId = java.lang.String
  type BillingGroupName = java.lang.String
  type BillingGroupNameAndArnList = js.Array[typingsJapgolly.awsSdk.iotMod.GroupNameAndArn]
  type Boolean = scala.Boolean
  type BooleanKey = scala.Boolean
  type BucketName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type CACertificateStatus = typingsJapgolly.awsSdk.iotMod._CACertificateStatus | java.lang.String
  type CACertificateUpdateAction = typingsJapgolly.awsSdk.awsSdkStrings.DEACTIVATE | java.lang.String
  type CACertificates = js.Array[typingsJapgolly.awsSdk.iotMod.CACertificate]
  type CanceledChecksCount = scala.Double
  type CanceledFindingsCount = scala.Double
  type CanceledThings = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.private__
    - typingsJapgolly.awsSdk.awsSdkStrings.`public-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`public-read-write`
    - typingsJapgolly.awsSdk.awsSdkStrings.`aws-exec-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`authenticated-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`bucket-owner-read`
    - typingsJapgolly.awsSdk.awsSdkStrings.`bucket-owner-full-control`
    - typingsJapgolly.awsSdk.awsSdkStrings.`log-delivery-write`
    - java.lang.String
  */
  type CannedAccessControlList = typingsJapgolly.awsSdk.iotMod._CannedAccessControlList | java.lang.String
  type CertificateArn = java.lang.String
  type CertificateId = java.lang.String
  type CertificateName = java.lang.String
  type CertificatePathOnDevice = java.lang.String
  type CertificatePem = java.lang.String
  type CertificateSigningRequest = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.REVOKED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_TRANSFER
    - typingsJapgolly.awsSdk.awsSdkStrings.REGISTER_INACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_ACTIVATION
    - java.lang.String
  */
  type CertificateStatus = typingsJapgolly.awsSdk.iotMod._CertificateStatus | java.lang.String
  type Certificates = js.Array[typingsJapgolly.awsSdk.iotMod.Certificate]
  type ChannelName = java.lang.String
  type CheckCompliant = scala.Boolean
  type Cidr = java.lang.String
  type Cidrs = js.Array[typingsJapgolly.awsSdk.iotMod.Cidr]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.iotMod.ClientApiVersions
  type ClientId = java.lang.String
  type ClientRequestToken = java.lang.String
  type Code = java.lang.String
  type CognitoIdentityPoolId = java.lang.String
  type Comment = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`less-than`
    - typingsJapgolly.awsSdk.awsSdkStrings.`less-than-equals`
    - typingsJapgolly.awsSdk.awsSdkStrings.`greater-than`
    - typingsJapgolly.awsSdk.awsSdkStrings.`greater-than-equals`
    - typingsJapgolly.awsSdk.awsSdkStrings.`in-cidr-set`
    - typingsJapgolly.awsSdk.awsSdkStrings.`not-in-cidr-set`
    - typingsJapgolly.awsSdk.awsSdkStrings.`in-port-set`
    - typingsJapgolly.awsSdk.awsSdkStrings.`not-in-port-set`
    - java.lang.String
  */
  type ComparisonOperator = typingsJapgolly.awsSdk.iotMod._ComparisonOperator | java.lang.String
  type CompliantChecksCount = scala.Double
  type ConfirmationToken = java.lang.String
  type ConnectivityTimestamp = scala.Double
  type ConsecutiveDatapointsToAlarm = scala.Double
  type ConsecutiveDatapointsToClear = scala.Double
  type Count = scala.Double
  type CreatedAtDate = js.Date
  type CreationDate = js.Date
  type CredentialDurationSeconds = scala.Double
  type CustomerVersion = scala.Double
  type DateType = js.Date
  type DayOfMonth = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUN
    - typingsJapgolly.awsSdk.awsSdkStrings.MON
    - typingsJapgolly.awsSdk.awsSdkStrings.TUE
    - typingsJapgolly.awsSdk.awsSdkStrings.WED
    - typingsJapgolly.awsSdk.awsSdkStrings.THU
    - typingsJapgolly.awsSdk.awsSdkStrings.FRI
    - typingsJapgolly.awsSdk.awsSdkStrings.SAT
    - java.lang.String
  */
  type DayOfWeek = typingsJapgolly.awsSdk.iotMod._DayOfWeek | java.lang.String
  type DeleteAdditionalMetricsToRetain = scala.Boolean
  type DeleteAlertTargets = scala.Boolean
  type DeleteBehaviors = scala.Boolean
  type DeleteScheduledAudits = scala.Boolean
  type DeleteStream = scala.Boolean
  type DeliveryStreamName = java.lang.String
  type DeprecationDate = js.Date
  type Description = java.lang.String
  type DetailsKey = java.lang.String
  type DetailsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.DetailsValue]
  type DetailsValue = java.lang.String
  type DeviceCertificateUpdateAction = typingsJapgolly.awsSdk.awsSdkStrings.DEACTIVATE | java.lang.String
  type DeviceDefenderThingName = java.lang.String
  type DisableAllLogs = scala.Boolean
  type DomainConfigurationArn = java.lang.String
  type DomainConfigurationName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DomainConfigurationStatus = typingsJapgolly.awsSdk.iotMod._DomainConfigurationStatus | java.lang.String
  type DomainConfigurations = js.Array[typingsJapgolly.awsSdk.iotMod.DomainConfigurationSummary]
  type DomainName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENDPOINT
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_MANAGED
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_MANAGED
    - java.lang.String
  */
  type DomainType = typingsJapgolly.awsSdk.iotMod._DomainType | java.lang.String
  type DurationSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILDING
    - typingsJapgolly.awsSdk.awsSdkStrings.REBUILDING
    - java.lang.String
  */
  type DynamicGroupStatus = typingsJapgolly.awsSdk.iotMod._DynamicGroupStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STRING
    - typingsJapgolly.awsSdk.awsSdkStrings.NUMBER
    - java.lang.String
  */
  type DynamoKeyType = typingsJapgolly.awsSdk.iotMod._DynamoKeyType | java.lang.String
  type DynamoOperation = java.lang.String
  type EffectivePolicies = js.Array[typingsJapgolly.awsSdk.iotMod.EffectivePolicy]
  type ElasticsearchEndpoint = java.lang.String
  type ElasticsearchId = java.lang.String
  type ElasticsearchIndex = java.lang.String
  type ElasticsearchType = java.lang.String
  type Enabled = scala.Boolean
  type EndpointAddress = java.lang.String
  type EndpointType = java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type EvaluationStatistic = java.lang.String
  type EventConfigurations = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.Configuration]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.THING
    - typingsJapgolly.awsSdk.awsSdkStrings.THING_GROUP
    - typingsJapgolly.awsSdk.awsSdkStrings.THING_TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.THING_GROUP_MEMBERSHIP
    - typingsJapgolly.awsSdk.awsSdkStrings.THING_GROUP_HIERARCHY
    - typingsJapgolly.awsSdk.awsSdkStrings.THING_TYPE_ASSOCIATION
    - typingsJapgolly.awsSdk.awsSdkStrings.JOB
    - typingsJapgolly.awsSdk.awsSdkStrings.JOB_EXECUTION
    - typingsJapgolly.awsSdk.awsSdkStrings.POLICY
    - typingsJapgolly.awsSdk.awsSdkStrings.CERTIFICATE
    - typingsJapgolly.awsSdk.awsSdkStrings.CA_CERTIFICATE
    - java.lang.String
  */
  type EventType = typingsJapgolly.awsSdk.iotMod._EventType | java.lang.String
  type ExecutionNamePrefix = java.lang.String
  type ExecutionNumber = scala.Double
  type ExpectedVersion = scala.Double
  type ExpiresInSec = scala.Double
  type ExpiresInSeconds = scala.Double
  type FailedChecksCount = scala.Double
  type FailedFindingsCount = scala.Double
  type FailedThings = scala.Double
  type FieldName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Number_
    - typingsJapgolly.awsSdk.awsSdkStrings.String_
    - typingsJapgolly.awsSdk.awsSdkStrings.Boolean_
    - java.lang.String
  */
  type FieldType = typingsJapgolly.awsSdk.iotMod._FieldType | java.lang.String
  type Fields = js.Array[typingsJapgolly.awsSdk.iotMod.Field]
  type FileId = scala.Double
  type FileName = java.lang.String
  type FindingId = java.lang.String
  type FindingIds = js.Array[typingsJapgolly.awsSdk.iotMod.FindingId]
  type FirehoseSeparator = java.lang.String
  type Flag = scala.Boolean
  type ForceDelete = scala.Boolean
  type ForceDeleteAWSJob = scala.Boolean
  type ForceFlag = scala.Boolean
  type Forced = scala.Boolean
  type FunctionArn = java.lang.String
  type GenerationId = java.lang.String
  type HashAlgorithm = java.lang.String
  type HashKeyField = java.lang.String
  type HashKeyValue = java.lang.String
  type HeaderKey = java.lang.String
  type HeaderList = js.Array[typingsJapgolly.awsSdk.iotMod.HttpActionHeader]
  type HeaderValue = java.lang.String
  type HttpHeaderName = java.lang.String
  type HttpHeaderValue = java.lang.String
  type HttpHeaders = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.HttpHeaderValue]
  type HttpQueryString = java.lang.String
  type InProgressChecksCount = scala.Double
  type InProgressThings = scala.Double
  type InProgressTimeoutInMinutes = scala.Double
  type IncrementFactor = scala.Double
  type IndexName = java.lang.String
  type IndexNamesList = js.Array[typingsJapgolly.awsSdk.iotMod.IndexName]
  type IndexSchema = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILDING
    - typingsJapgolly.awsSdk.awsSdkStrings.REBUILDING
    - java.lang.String
  */
  type IndexStatus = typingsJapgolly.awsSdk.iotMod._IndexStatus | java.lang.String
  type InlineDocument = java.lang.String
  type InputName = java.lang.String
  type IsAuthenticated = scala.Boolean
  type IsDefaultVersion = scala.Boolean
  type IsDisabled = scala.Boolean
  type JobArn = java.lang.String
  type JobDescription = java.lang.String
  type JobDocument = java.lang.String
  type JobDocumentSource = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type JobExecutionFailureType = typingsJapgolly.awsSdk.iotMod._JobExecutionFailureType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
    - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
    - typingsJapgolly.awsSdk.awsSdkStrings.REMOVED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type JobExecutionStatus = typingsJapgolly.awsSdk.iotMod._JobExecutionStatus | java.lang.String
  type JobExecutionSummaryForJobList = js.Array[typingsJapgolly.awsSdk.iotMod.JobExecutionSummaryForJob]
  type JobExecutionSummaryForThingList = js.Array[typingsJapgolly.awsSdk.iotMod.JobExecutionSummaryForThing]
  type JobId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETION_IN_PROGRESS
    - java.lang.String
  */
  type JobStatus = typingsJapgolly.awsSdk.iotMod._JobStatus | java.lang.String
  type JobSummaryList = js.Array[typingsJapgolly.awsSdk.iotMod.JobSummary]
  type JobTargets = js.Array[typingsJapgolly.awsSdk.iotMod.TargetArn]
  type JsonDocument = java.lang.String
  type Key = java.lang.String
  type KeyName = java.lang.String
  type KeyValue = java.lang.String
  type LaserMaxResults = scala.Double
  type LastModifiedDate = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEBUG
    - typingsJapgolly.awsSdk.awsSdkStrings.INFO
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.WARN
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type LogLevel = typingsJapgolly.awsSdk.iotMod._LogLevel | java.lang.String
  type LogTargetConfigurations = js.Array[typingsJapgolly.awsSdk.iotMod.LogTargetConfiguration]
  type LogTargetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.THING_GROUP
    - java.lang.String
  */
  type LogTargetType = typingsJapgolly.awsSdk.iotMod._LogTargetType | java.lang.String
  type Marker = java.lang.String
  type MaxJobExecutionsPerMin = scala.Double
  type MaxResults = scala.Double
  type Maximum = scala.Double
  type MaximumPerMinute = scala.Double
  type Message = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RAW
    - typingsJapgolly.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type MessageFormat = typingsJapgolly.awsSdk.iotMod._MessageFormat | java.lang.String
  type MessageId = java.lang.String
  type Minimum = scala.Double
  type MinimumNumberOfExecutedThings = scala.Double
  type MissingContextValue = java.lang.String
  type MissingContextValues = js.Array[typingsJapgolly.awsSdk.iotMod.MissingContextValue]
  type MitigationActionArn = java.lang.String
  type MitigationActionId = java.lang.String
  type MitigationActionIdentifierList = js.Array[typingsJapgolly.awsSdk.iotMod.MitigationActionIdentifier]
  type MitigationActionList = js.Array[typingsJapgolly.awsSdk.iotMod.MitigationAction]
  type MitigationActionName = java.lang.String
  type MitigationActionNameList = js.Array[typingsJapgolly.awsSdk.iotMod.MitigationActionName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_DEVICE_CERTIFICATE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_CA_CERTIFICATE
    - typingsJapgolly.awsSdk.awsSdkStrings.ADD_THINGS_TO_THING_GROUP
    - typingsJapgolly.awsSdk.awsSdkStrings.REPLACE_DEFAULT_POLICY_VERSION
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE_IOT_LOGGING
    - typingsJapgolly.awsSdk.awsSdkStrings.PUBLISH_FINDING_TO_SNS
    - java.lang.String
  */
  type MitigationActionType = typingsJapgolly.awsSdk.iotMod._MitigationActionType | java.lang.String
  type MqttClientId = java.lang.String
  type MqttPassword = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.iotMod.Blob | java.lang.String
  type MqttUsername = java.lang.String
  type NextToken = java.lang.String
  type NonCompliantChecksCount = scala.Double
  type NonCompliantResourcesCount = scala.Double
  type NumberOfThings = scala.Double
  type OTAUpdateArn = java.lang.String
  type OTAUpdateDescription = java.lang.String
  type OTAUpdateErrorMessage = java.lang.String
  type OTAUpdateFileVersion = java.lang.String
  type OTAUpdateFiles = js.Array[typingsJapgolly.awsSdk.iotMod.OTAUpdateFile]
  type OTAUpdateId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
    - java.lang.String
  */
  type OTAUpdateStatus = typingsJapgolly.awsSdk.iotMod._OTAUpdateStatus | java.lang.String
  type OTAUpdatesSummary = js.Array[typingsJapgolly.awsSdk.iotMod.OTAUpdateSummary]
  type OptionalVersion = scala.Double
  type OutgoingCertificates = js.Array[typingsJapgolly.awsSdk.iotMod.OutgoingCertificate]
  type OverrideDynamicGroups = scala.Boolean
  type PageSize = scala.Double
  type Parameter = java.lang.String
  type Parameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.Value]
  type PartitionKey = java.lang.String
  type PayloadField = java.lang.String
  type Percent = scala.Double
  type PercentList = js.Array[typingsJapgolly.awsSdk.iotMod.Percent]
  type PercentValue = scala.Double
  type Percentage = scala.Double
  type Percentiles = js.Array[typingsJapgolly.awsSdk.iotMod.PercentPair]
  type Platform = java.lang.String
  type Policies = js.Array[typingsJapgolly.awsSdk.iotMod.Policy]
  type PolicyArn = java.lang.String
  type PolicyDocument = java.lang.String
  type PolicyDocuments = js.Array[typingsJapgolly.awsSdk.iotMod.PolicyDocument]
  type PolicyName = java.lang.String
  type PolicyNames = js.Array[typingsJapgolly.awsSdk.iotMod.PolicyName]
  type PolicyTarget = java.lang.String
  type PolicyTargets = js.Array[typingsJapgolly.awsSdk.iotMod.PolicyTarget]
  type PolicyTemplateName = typingsJapgolly.awsSdk.awsSdkStrings.BLANK_POLICY | java.lang.String
  type PolicyVersionId = java.lang.String
  type PolicyVersions = js.Array[typingsJapgolly.awsSdk.iotMod.PolicyVersion]
  type Port = scala.Double
  type Ports = js.Array[typingsJapgolly.awsSdk.iotMod.Port]
  type Prefix = java.lang.String
  type Principal = java.lang.String
  type PrincipalArn = java.lang.String
  type PrincipalId = java.lang.String
  type Principals = js.Array[typingsJapgolly.awsSdk.iotMod.PrincipalArn]
  type PrivateKey = java.lang.String
  type ProcessingTargetName = java.lang.String
  type ProcessingTargetNameList = js.Array[typingsJapgolly.awsSdk.iotMod.ProcessingTargetName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MQTT
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTP
    - java.lang.String
  */
  type Protocol = typingsJapgolly.awsSdk.iotMod._Protocol | java.lang.String
  type Protocols = js.Array[typingsJapgolly.awsSdk.iotMod.Protocol]
  type ProvisioningTemplateListing = js.Array[typingsJapgolly.awsSdk.iotMod.ProvisioningTemplateSummary]
  type ProvisioningTemplateVersionListing = js.Array[typingsJapgolly.awsSdk.iotMod.ProvisioningTemplateVersionSummary]
  type PublicKey = java.lang.String
  type PublicKeyMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.KeyValue]
  type PutAssetPropertyValueEntryList = js.Array[typingsJapgolly.awsSdk.iotMod.PutAssetPropertyValueEntry]
  type Qos = scala.Double
  type QueryMaxResults = scala.Double
  type QueryString = java.lang.String
  type QueryVersion = java.lang.String
  type QueueUrl = java.lang.String
  type QueuedThings = scala.Double
  type RangeKeyField = java.lang.String
  type RangeKeyValue = java.lang.String
  type ReasonCode = java.lang.String
  type ReasonForNonCompliance = java.lang.String
  type ReasonForNonComplianceCode = java.lang.String
  type ReasonForNonComplianceCodes = js.Array[typingsJapgolly.awsSdk.iotMod.ReasonForNonComplianceCode]
  type Recursive = scala.Boolean
  type RecursiveWithoutDefault = scala.Boolean
  type RegistrationCode = java.lang.String
  type RegistryMaxResults = scala.Double
  type RegistryS3BucketName = java.lang.String
  type RegistryS3KeyName = java.lang.String
  type RejectedThings = scala.Double
  type RelatedResources = js.Array[typingsJapgolly.awsSdk.iotMod.RelatedResource]
  type RemoveAuthorizerConfig = scala.Boolean
  type RemoveAutoRegistration = scala.Boolean
  type RemoveThingType = scala.Boolean
  type RemovedThings = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ERRORS
    - typingsJapgolly.awsSdk.awsSdkStrings.RESULTS
    - java.lang.String
  */
  type ReportType = typingsJapgolly.awsSdk.iotMod._ReportType | java.lang.String
  type ReservedDomainConfigurationName = java.lang.String
  type Resource = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceArns = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.ResourceArn]
  type ResourceLogicalId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEVICE_CERTIFICATE
    - typingsJapgolly.awsSdk.awsSdkStrings.CA_CERTIFICATE
    - typingsJapgolly.awsSdk.awsSdkStrings.IOT_POLICY
    - typingsJapgolly.awsSdk.awsSdkStrings.COGNITO_IDENTITY_POOL
    - typingsJapgolly.awsSdk.awsSdkStrings.CLIENT_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_SETTINGS
    - typingsJapgolly.awsSdk.awsSdkStrings.ROLE_ALIAS
    - typingsJapgolly.awsSdk.awsSdkStrings.IAM_ROLE
    - java.lang.String
  */
  type ResourceType = typingsJapgolly.awsSdk.iotMod._ResourceType | java.lang.String
  type Resources = js.Array[typingsJapgolly.awsSdk.iotMod.Resource]
  type RoleAlias = java.lang.String
  type RoleAliasArn = java.lang.String
  type RoleAliases = js.Array[typingsJapgolly.awsSdk.iotMod.RoleAlias]
  type RoleArn = java.lang.String
  type RolloutRatePerMinute = scala.Double
  type RuleArn = java.lang.String
  type RuleName = java.lang.String
  type S3Bucket = java.lang.String
  type S3FileUrl = java.lang.String
  type S3FileUrlList = js.Array[typingsJapgolly.awsSdk.iotMod.S3FileUrl]
  type S3Key = java.lang.String
  type S3Version = java.lang.String
  type SQL = java.lang.String
  type SalesforceEndpoint = java.lang.String
  type SalesforceToken = java.lang.String
  type ScheduledAuditArn = java.lang.String
  type ScheduledAuditMetadataList = js.Array[typingsJapgolly.awsSdk.iotMod.ScheduledAuditMetadata]
  type ScheduledAuditName = java.lang.String
  type SearchableAttributes = js.Array[typingsJapgolly.awsSdk.iotMod.AttributeName]
  type Seconds = scala.Double
  type SecurityProfileArn = java.lang.String
  type SecurityProfileDescription = java.lang.String
  type SecurityProfileIdentifiers = js.Array[typingsJapgolly.awsSdk.iotMod.SecurityProfileIdentifier]
  type SecurityProfileName = java.lang.String
  type SecurityProfileTargetArn = java.lang.String
  type SecurityProfileTargetMappings = js.Array[typingsJapgolly.awsSdk.iotMod.SecurityProfileTargetMapping]
  type SecurityProfileTargets = js.Array[typingsJapgolly.awsSdk.iotMod.SecurityProfileTarget]
  type ServerCertificateArns = js.Array[typingsJapgolly.awsSdk.iotMod.AcmCertificateArn]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INVALID
    - typingsJapgolly.awsSdk.awsSdkStrings.VALID
    - java.lang.String
  */
  type ServerCertificateStatus = typingsJapgolly.awsSdk.iotMod._ServerCertificateStatus | java.lang.String
  type ServerCertificateStatusDetail = java.lang.String
  type ServerCertificates = js.Array[typingsJapgolly.awsSdk.iotMod.ServerCertificateSummary]
  type ServerName = java.lang.String
  type ServiceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DATA
    - typingsJapgolly.awsSdk.awsSdkStrings.CREDENTIAL_PROVIDER
    - typingsJapgolly.awsSdk.awsSdkStrings.JOBS
    - java.lang.String
  */
  type ServiceType = typingsJapgolly.awsSdk.iotMod._ServiceType | java.lang.String
  type SetAsActive = scala.Boolean
  type SetAsActiveFlag = scala.Boolean
  type SetAsDefault = scala.Boolean
  type Signature = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.iotMod.Blob | java.lang.String
  type SignatureAlgorithm = java.lang.String
  type SigningJobId = java.lang.String
  type SigningProfileName = java.lang.String
  type SigningRegion = java.lang.String
  type SkippedFindingsCount = scala.Double
  type SkyfallMaxResults = scala.Double
  type SnsTopicArn = java.lang.String
  type StateMachineName = java.lang.String
  type StateReason = java.lang.String
  type StateValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Cancelling_
    - java.lang.String
  */
  type Status = typingsJapgolly.awsSdk.iotMod._Status | java.lang.String
  type StdDeviation = scala.Double
  type StreamArn = java.lang.String
  type StreamDescription = java.lang.String
  type StreamFiles = js.Array[typingsJapgolly.awsSdk.iotMod.StreamFile]
  type StreamId = java.lang.String
  type StreamName = java.lang.String
  type StreamVersion = scala.Double
  type StreamsSummary = js.Array[typingsJapgolly.awsSdk.iotMod.StreamSummary]
  type String = java.lang.String
  type StringMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotMod.String]
  type SucceededFindingsCount = scala.Double
  type SucceededThings = scala.Double
  type Sum = scala.Double
  type SumOfSquares = scala.Double
  type TableName = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.iotMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.iotMod.Tag]
  type TagValue = java.lang.String
  type Target = java.lang.String
  type TargetArn = java.lang.String
  type TargetAuditCheckNames = js.Array[typingsJapgolly.awsSdk.iotMod.AuditCheckName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTINUOUS
    - typingsJapgolly.awsSdk.awsSdkStrings.SNAPSHOT
    - java.lang.String
  */
  type TargetSelection = typingsJapgolly.awsSdk.iotMod._TargetSelection | java.lang.String
  type Targets = js.Array[typingsJapgolly.awsSdk.iotMod.Target]
  type TaskId = java.lang.String
  type TaskIdList = js.Array[typingsJapgolly.awsSdk.iotMod.TaskId]
  type TemplateArn = java.lang.String
  type TemplateBody = java.lang.String
  type TemplateDescription = java.lang.String
  type TemplateName = java.lang.String
  type TemplateVersionId = scala.Double
  type ThingArn = java.lang.String
  type ThingAttributeList = js.Array[typingsJapgolly.awsSdk.iotMod.ThingAttribute]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OFF
    - typingsJapgolly.awsSdk.awsSdkStrings.STATUS
    - java.lang.String
  */
  type ThingConnectivityIndexingMode = typingsJapgolly.awsSdk.iotMod._ThingConnectivityIndexingMode | java.lang.String
  type ThingDocumentList = js.Array[typingsJapgolly.awsSdk.iotMod.ThingDocument]
  type ThingGroupArn = java.lang.String
  type ThingGroupDescription = java.lang.String
  type ThingGroupDocumentList = js.Array[typingsJapgolly.awsSdk.iotMod.ThingGroupDocument]
  type ThingGroupId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OFF
    - typingsJapgolly.awsSdk.awsSdkStrings.ON
    - java.lang.String
  */
  type ThingGroupIndexingMode = typingsJapgolly.awsSdk.iotMod._ThingGroupIndexingMode | java.lang.String
  type ThingGroupList = js.Array[typingsJapgolly.awsSdk.iotMod.ThingGroupName]
  type ThingGroupName = java.lang.String
  type ThingGroupNameAndArnList = js.Array[typingsJapgolly.awsSdk.iotMod.GroupNameAndArn]
  type ThingGroupNameList = js.Array[typingsJapgolly.awsSdk.iotMod.ThingGroupName]
  type ThingGroupNames = js.Array[typingsJapgolly.awsSdk.iotMod.ThingGroupName]
  type ThingId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OFF
    - typingsJapgolly.awsSdk.awsSdkStrings.REGISTRY
    - typingsJapgolly.awsSdk.awsSdkStrings.REGISTRY_AND_SHADOW
    - java.lang.String
  */
  type ThingIndexingMode = typingsJapgolly.awsSdk.iotMod._ThingIndexingMode | java.lang.String
  type ThingName = java.lang.String
  type ThingNameList = js.Array[typingsJapgolly.awsSdk.iotMod.ThingName]
  type ThingTypeArn = java.lang.String
  type ThingTypeDescription = java.lang.String
  type ThingTypeId = java.lang.String
  type ThingTypeList = js.Array[typingsJapgolly.awsSdk.iotMod.ThingTypeDefinition]
  type ThingTypeName = java.lang.String
  type TimedOutThings = scala.Double
  type Timestamp = js.Date
  type Token = java.lang.String
  type TokenKeyName = java.lang.String
  type TokenSignature = java.lang.String
  type Topic = java.lang.String
  type TopicPattern = java.lang.String
  type TopicRuleDestinationMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type TopicRuleDestinationStatus = typingsJapgolly.awsSdk.iotMod._TopicRuleDestinationStatus | java.lang.String
  type TopicRuleDestinationSummaries = js.Array[typingsJapgolly.awsSdk.iotMod.TopicRuleDestinationSummary]
  type TopicRuleList = js.Array[typingsJapgolly.awsSdk.iotMod.TopicRuleListItem]
  type TopicRuleMaxResults = scala.Double
  type TotalChecksCount = scala.Double
  type TotalFindingsCount = scala.Double
  type TotalResourcesCount = scala.Double
  type UndoDeprecate = scala.Boolean
  type UnsignedLong = scala.Double
  type Url = java.lang.String
  type UseBase64 = scala.Boolean
  type Valid = scala.Boolean
  type ValidationErrors = js.Array[typingsJapgolly.awsSdk.iotMod.ValidationError]
  type Value = java.lang.String
  type Variance = scala.Double
  type Version = scala.Double
  type VersionNumber = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`in-alarm`
    - typingsJapgolly.awsSdk.awsSdkStrings.`alarm-cleared`
    - typingsJapgolly.awsSdk.awsSdkStrings.`alarm-invalidated`
    - java.lang.String
  */
  type ViolationEventType = typingsJapgolly.awsSdk.iotMod._ViolationEventType | java.lang.String
  type ViolationEvents = js.Array[typingsJapgolly.awsSdk.iotMod.ViolationEvent]
  type ViolationId = java.lang.String
  type WaitingForDataCollectionChecksCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-05-28`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.iotMod._apiVersion | java.lang.String
}
