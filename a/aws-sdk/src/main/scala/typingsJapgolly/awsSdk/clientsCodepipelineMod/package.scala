package typingsJapgolly.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.FAILED_ACTIONS
import typingsJapgolly.awsSdk.awsSdkStrings.KMS
import typingsJapgolly.awsSdk.awsSdkStrings.S3
import typingsJapgolly.awsSdk.awsSdkStrings.Schedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSRegionName = java.lang.String

type AccessKeyId = java.lang.String

type AccountId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Source_
  - typingsJapgolly.awsSdk.awsSdkStrings.Build_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deploy_
  - typingsJapgolly.awsSdk.awsSdkStrings.Test_
  - typingsJapgolly.awsSdk.awsSdkStrings.Invoke
  - typingsJapgolly.awsSdk.awsSdkStrings.Approval
  - java.lang.String
*/
type ActionCategory = _ActionCategory | java.lang.String

type ActionConfigurationKey = java.lang.String

type ActionConfigurationMap = StringDictionary[ActionConfigurationValue]

type ActionConfigurationPropertyList = js.Array[ActionConfigurationProperty]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.String_
  - typingsJapgolly.awsSdk.awsSdkStrings.Number_
  - typingsJapgolly.awsSdk.awsSdkStrings.Boolean_
  - java.lang.String
*/
type ActionConfigurationPropertyType = _ActionConfigurationPropertyType | java.lang.String

type ActionConfigurationQueryableValue = java.lang.String

type ActionConfigurationValue = java.lang.String

type ActionExecutionDetailList = js.Array[ActionExecutionDetail]

type ActionExecutionId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Abandoned
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type ActionExecutionStatus = _ActionExecutionStatus | java.lang.String

type ActionExecutionToken = java.lang.String

type ActionName = java.lang.String

type ActionNamespace = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS
  - typingsJapgolly.awsSdk.awsSdkStrings.ThirdParty
  - typingsJapgolly.awsSdk.awsSdkStrings.Custom_
  - java.lang.String
*/
type ActionOwner = _ActionOwner | java.lang.String

type ActionProvider = java.lang.String

type ActionRunOrder = Double

type ActionStateList = js.Array[ActionState]

type ActionTypeDescription = java.lang.String

type ActionTypeList = js.Array[ActionType]

type ActionTypeOwner = java.lang.String

type ActionTypeProperties = js.Array[ActionTypeProperty]

type AllowedAccount = java.lang.String

type AllowedAccounts = js.Array[AllowedAccount]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Approved_
  - typingsJapgolly.awsSdk.awsSdkStrings.Rejected_
  - java.lang.String
*/
type ApprovalStatus = _ApprovalStatus | java.lang.String

type ApprovalSummary = java.lang.String

type ApprovalToken = java.lang.String

type ArtifactDetailList = js.Array[ArtifactDetail]

type ArtifactList = js.Array[Artifact]

type ArtifactLocationType = S3 | java.lang.String

type ArtifactName = java.lang.String

type ArtifactRevisionList = js.Array[ArtifactRevision]

type ArtifactStoreLocation = java.lang.String

type ArtifactStoreMap = StringDictionary[ArtifactStore]

type ArtifactStoreType = S3 | java.lang.String

type BlockerName = java.lang.String

type BlockerType = Schedule | java.lang.String

type Boolean = scala.Boolean

type ClientId = java.lang.String

type ClientRequestToken = java.lang.String

type ClientToken = java.lang.String

type Code = java.lang.String

type ContinuationToken = java.lang.String

type Description = java.lang.String

type DisabledReason = java.lang.String

type Enabled = scala.Boolean

type EncryptionKeyId = java.lang.String

type EncryptionKeyType = KMS | java.lang.String

type ExecutionId = java.lang.String

type ExecutionSummary = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JobWorker
  - typingsJapgolly.awsSdk.awsSdkStrings.Lambda_
  - java.lang.String
*/
type ExecutorType = _ExecutorType | java.lang.String

type ExternalExecutionId = java.lang.String

type ExternalExecutionSummary = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JobFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationError
  - typingsJapgolly.awsSdk.awsSdkStrings.PermissionError
  - typingsJapgolly.awsSdk.awsSdkStrings.RevisionOutOfSync
  - typingsJapgolly.awsSdk.awsSdkStrings.RevisionUnavailable
  - typingsJapgolly.awsSdk.awsSdkStrings.SystemUnavailable
  - java.lang.String
*/
type FailureType = _FailureType | java.lang.String

type InputArtifactList = js.Array[InputArtifact]

type JobId = java.lang.String

type JobList = js.Array[Job]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Created_
  - typingsJapgolly.awsSdk.awsSdkStrings.Queued_
  - typingsJapgolly.awsSdk.awsSdkStrings.Dispatched
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.TimedOut_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type JobStatus = _JobStatus | java.lang.String

type JobTimeout = Double

type JsonPath = java.lang.String

type LambdaFunctionArn = java.lang.String

type LastChangedAt = js.Date

type LastChangedBy = java.lang.String

type LastUpdatedBy = java.lang.String

type MatchEquals = java.lang.String

type MaxBatchSize = Double

type MaxPipelines = Double

type MaxResults = Double

type MaximumActionTypeArtifactCount = Double

type MaximumArtifactCount = Double

type Message = java.lang.String

type MinimumActionTypeArtifactCount = Double

type MinimumArtifactCount = Double

type NextToken = java.lang.String

type Nonce = java.lang.String

type OutputArtifactList = js.Array[OutputArtifact]

type OutputVariablesKey = java.lang.String

type OutputVariablesMap = StringDictionary[OutputVariablesValue]

type OutputVariablesValue = java.lang.String

type Percentage = Double

type PipelineArn = java.lang.String

type PipelineExecutionId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - typingsJapgolly.awsSdk.awsSdkStrings.Superseded_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type PipelineExecutionStatus = _PipelineExecutionStatus | java.lang.String

type PipelineExecutionStatusSummary = java.lang.String

type PipelineExecutionSummaryList = js.Array[PipelineExecutionSummary]

type PipelineList = js.Array[PipelineSummary]

type PipelineName = java.lang.String

type PipelineStageDeclarationList = js.Array[StageDeclaration]

type PipelineVersion = Double

type PolicyStatementsTemplate = java.lang.String

type PollingAccountList = js.Array[AccountId]

type PollingServicePrincipalList = js.Array[ServicePrincipal]

type PropertyDescription = java.lang.String

type QueryParamMap = StringDictionary[ActionConfigurationQueryableValue]

type ResolvedActionConfigurationMap = StringDictionary[String]

type ResourceArn = java.lang.String

type Revision = java.lang.String

type RevisionChangeIdentifier = java.lang.String

type RevisionSummary = java.lang.String

type RoleArn = java.lang.String

type S3Bucket = java.lang.String

type S3BucketName = java.lang.String

type S3Key = java.lang.String

type S3ObjectKey = java.lang.String

type SecretAccessKey = java.lang.String

type ServicePrincipal = java.lang.String

type SessionToken = java.lang.String

type SourceRevisionList = js.Array[SourceRevision]

type StageActionDeclarationList = js.Array[ActionDeclaration]

type StageBlockerDeclarationList = js.Array[BlockerDeclaration]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - java.lang.String
*/
type StageExecutionStatus = _StageExecutionStatus | java.lang.String

type StageName = java.lang.String

type StageRetryMode = FAILED_ACTIONS | java.lang.String

type StageStateList = js.Array[StageState]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Inbound_
  - typingsJapgolly.awsSdk.awsSdkStrings.Outbound_
  - java.lang.String
*/
type StageTransitionType = _StageTransitionType | java.lang.String

type StopPipelineExecutionReason = java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type ThirdPartyJobId = java.lang.String

type ThirdPartyJobList = js.Array[ThirdPartyJob]

type Time = js.Date

type Timestamp = js.Date

type TriggerDetail = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CreatePipeline
  - typingsJapgolly.awsSdk.awsSdkStrings.StartPipelineExecution
  - typingsJapgolly.awsSdk.awsSdkStrings.PollForSourceChanges
  - typingsJapgolly.awsSdk.awsSdkStrings.Webhook
  - typingsJapgolly.awsSdk.awsSdkStrings.CloudWatchEvent
  - typingsJapgolly.awsSdk.awsSdkStrings.PutActionRevision
  - java.lang.String
*/
type TriggerType = _TriggerType | java.lang.String

type Url = java.lang.String

type UrlTemplate = java.lang.String

type Version = java.lang.String

type WebhookArn = java.lang.String

type WebhookAuthConfigurationAllowedIPRange = java.lang.String

type WebhookAuthConfigurationSecretToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GITHUB_HMAC
  - typingsJapgolly.awsSdk.awsSdkStrings.IP
  - typingsJapgolly.awsSdk.awsSdkStrings.UNAUTHENTICATED
  - java.lang.String
*/
type WebhookAuthenticationType = _WebhookAuthenticationType | java.lang.String

type WebhookErrorCode = java.lang.String

type WebhookErrorMessage = java.lang.String

type WebhookFilters = js.Array[WebhookFilterRule]

type WebhookLastTriggered = js.Date

type WebhookList = js.Array[ListWebhookItem]

type WebhookName = java.lang.String

type WebhookUrl = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2015-07-09`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
