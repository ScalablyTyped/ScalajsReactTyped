package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codepipelineMod {
  type AWSRegionName = java.lang.String
  type AccessKeyId = java.lang.String
  type AccountId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Source
    - typingsJapgolly.awsSdk.awsSdkStrings.Build_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deploy
    - typingsJapgolly.awsSdk.awsSdkStrings.Test_
    - typingsJapgolly.awsSdk.awsSdkStrings.Invoke
    - typingsJapgolly.awsSdk.awsSdkStrings.Approval
    - java.lang.String
  */
  type ActionCategory = typingsJapgolly.awsSdk.codepipelineMod._ActionCategory | java.lang.String
  type ActionConfigurationKey = java.lang.String
  type ActionConfigurationMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.codepipelineMod.ActionConfigurationValue]
  type ActionConfigurationPropertyList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.ActionConfigurationProperty]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.String_
    - typingsJapgolly.awsSdk.awsSdkStrings.Number_
    - typingsJapgolly.awsSdk.awsSdkStrings.Boolean_
    - java.lang.String
  */
  type ActionConfigurationPropertyType = typingsJapgolly.awsSdk.codepipelineMod._ActionConfigurationPropertyType | java.lang.String
  type ActionConfigurationQueryableValue = java.lang.String
  type ActionConfigurationValue = java.lang.String
  type ActionExecutionDetailList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.ActionExecutionDetail]
  type ActionExecutionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Abandoned
    - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type ActionExecutionStatus = typingsJapgolly.awsSdk.codepipelineMod._ActionExecutionStatus | java.lang.String
  type ActionExecutionToken = java.lang.String
  type ActionName = java.lang.String
  type ActionNamespace = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS
    - typingsJapgolly.awsSdk.awsSdkStrings.ThirdParty
    - typingsJapgolly.awsSdk.awsSdkStrings.Custom_
    - java.lang.String
  */
  type ActionOwner = typingsJapgolly.awsSdk.codepipelineMod._ActionOwner | java.lang.String
  type ActionProvider = java.lang.String
  type ActionRunOrder = scala.Double
  type ActionStateList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.ActionState]
  type ActionTypeList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.ActionType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Approved_
    - typingsJapgolly.awsSdk.awsSdkStrings.Rejected_
    - java.lang.String
  */
  type ApprovalStatus = typingsJapgolly.awsSdk.codepipelineMod._ApprovalStatus | java.lang.String
  type ApprovalSummary = java.lang.String
  type ApprovalToken = java.lang.String
  type ArtifactDetailList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.ArtifactDetail]
  type ArtifactList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.Artifact]
  type ArtifactLocationType = typingsJapgolly.awsSdk.awsSdkStrings.S3 | java.lang.String
  type ArtifactName = java.lang.String
  type ArtifactRevisionList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.ArtifactRevision]
  type ArtifactStoreLocation = java.lang.String
  type ArtifactStoreMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.codepipelineMod.ArtifactStore]
  type ArtifactStoreType = typingsJapgolly.awsSdk.awsSdkStrings.S3 | java.lang.String
  type BlockerName = java.lang.String
  type BlockerType = typingsJapgolly.awsSdk.awsSdkStrings.Schedule | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.codepipelineMod.ClientApiVersions
  type ClientId = java.lang.String
  type ClientRequestToken = java.lang.String
  type ClientToken = java.lang.String
  type Code = java.lang.String
  type ContinuationToken = java.lang.String
  type Description = java.lang.String
  type DisabledReason = java.lang.String
  type Enabled = scala.Boolean
  type EncryptionKeyId = java.lang.String
  type EncryptionKeyType = typingsJapgolly.awsSdk.awsSdkStrings.KMS | java.lang.String
  type ExecutionId = java.lang.String
  type ExecutionSummary = java.lang.String
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
  type FailureType = typingsJapgolly.awsSdk.codepipelineMod._FailureType | java.lang.String
  type InputArtifactList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.InputArtifact]
  type JobId = java.lang.String
  type JobList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.Job]
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
  type JobStatus = typingsJapgolly.awsSdk.codepipelineMod._JobStatus | java.lang.String
  type JsonPath = java.lang.String
  type LastChangedAt = js.Date
  type LastChangedBy = java.lang.String
  type LastUpdatedBy = java.lang.String
  type MatchEquals = java.lang.String
  type MaxBatchSize = scala.Double
  type MaxResults = scala.Double
  type MaximumArtifactCount = scala.Double
  type Message = java.lang.String
  type MinimumArtifactCount = scala.Double
  type NextToken = java.lang.String
  type Nonce = java.lang.String
  type OutputArtifactList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.OutputArtifact]
  type OutputVariablesKey = java.lang.String
  type OutputVariablesMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.codepipelineMod.OutputVariablesValue]
  type OutputVariablesValue = java.lang.String
  type Percentage = scala.Double
  type PipelineArn = java.lang.String
  type PipelineExecutionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
    - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
    - typingsJapgolly.awsSdk.awsSdkStrings.Superseded_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type PipelineExecutionStatus = typingsJapgolly.awsSdk.codepipelineMod._PipelineExecutionStatus | java.lang.String
  type PipelineExecutionSummaryList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.PipelineExecutionSummary]
  type PipelineList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.PipelineSummary]
  type PipelineName = java.lang.String
  type PipelineStageDeclarationList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.StageDeclaration]
  type PipelineVersion = scala.Double
  type QueryParamMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.codepipelineMod.ActionConfigurationQueryableValue]
  type ResolvedActionConfigurationMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.codepipelineMod.String]
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
  type SessionToken = java.lang.String
  type SourceRevisionList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.SourceRevision]
  type StageActionDeclarationList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.ActionDeclaration]
  type StageBlockerDeclarationList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.BlockerDeclaration]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
    - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
    - java.lang.String
  */
  type StageExecutionStatus = typingsJapgolly.awsSdk.codepipelineMod._StageExecutionStatus | java.lang.String
  type StageName = java.lang.String
  type StageRetryMode = typingsJapgolly.awsSdk.awsSdkStrings.FAILED_ACTIONS | java.lang.String
  type StageStateList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.StageState]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Inbound_
    - typingsJapgolly.awsSdk.awsSdkStrings.Outbound_
    - java.lang.String
  */
  type StageTransitionType = typingsJapgolly.awsSdk.codepipelineMod._StageTransitionType | java.lang.String
  type StopPipelineExecutionReason = java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.Tag]
  type TagValue = java.lang.String
  type ThirdPartyJobId = java.lang.String
  type ThirdPartyJobList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.ThirdPartyJob]
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
  type TriggerType = typingsJapgolly.awsSdk.codepipelineMod._TriggerType | java.lang.String
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
  type WebhookAuthenticationType = typingsJapgolly.awsSdk.codepipelineMod._WebhookAuthenticationType | java.lang.String
  type WebhookErrorCode = java.lang.String
  type WebhookErrorMessage = java.lang.String
  type WebhookFilters = js.Array[typingsJapgolly.awsSdk.codepipelineMod.WebhookFilterRule]
  type WebhookLastTriggered = js.Date
  type WebhookList = js.Array[typingsJapgolly.awsSdk.codepipelineMod.ListWebhookItem]
  type WebhookName = java.lang.String
  type WebhookUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-07-09`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.codepipelineMod._apiVersion | java.lang.String
}
