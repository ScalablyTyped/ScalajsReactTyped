package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.Active_
import typingsJapgolly.awsSdk.awsSdkStrings.GreengrassV2Component
import typingsJapgolly.awsSdk.awsSdkStrings.PHASES
import typingsJapgolly.awsSdk.awsSdkStrings.Prioritized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Accept = java.lang.String

type AccountId = java.lang.String

type ActionArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type ActionStatus = _ActionStatus | java.lang.String

type ActionSummaries = js.Array[ActionSummary]

type AdditionalCodeRepositoryNamesOrUrls = js.Array[CodeRepositoryNameOrUrl]

type AdditionalInferenceSpecifications = js.Array[AdditionalInferenceSpecificationDefinition]

type AgentVersions = js.Array[AgentVersion]

type AlarmList = js.Array[Alarm]

type AlarmName = java.lang.String

type AlgorithmArn = java.lang.String

type AlgorithmImage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type AlgorithmSortBy = _AlgorithmSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - java.lang.String
*/
type AlgorithmStatus = _AlgorithmStatus | java.lang.String

type AlgorithmStatusItemList = js.Array[AlgorithmStatusItem]

type AlgorithmSummaryList = js.Array[AlgorithmSummary]

type AlgorithmValidationProfiles = js.Array[AlgorithmValidationProfile]

type AppArn = java.lang.String

type AppImageConfigArn = java.lang.String

type AppImageConfigList = js.Array[AppImageConfigDetails]

type AppImageConfigName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.LastModifiedTime
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - java.lang.String
*/
type AppImageConfigSortKey = _AppImageConfigSortKey | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.system__
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott3Dotmicro
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott3Dotsmall
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott3Dotmedium
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott3Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott3Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott3Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3dnDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot48xlarge
  - java.lang.String
*/
type AppInstanceType = _AppInstanceType | java.lang.String

type AppList = js.Array[AppDetails]

type AppManaged = scala.Boolean

type AppName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PublicInternetOnly
  - typingsJapgolly.awsSdk.awsSdkStrings.VpcOnly
  - java.lang.String
*/
type AppNetworkAccessType = _AppNetworkAccessType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Service_
  - typingsJapgolly.awsSdk.awsSdkStrings.Customer_
  - java.lang.String
*/
type AppSecurityGroupManagement = _AppSecurityGroupManagement | java.lang.String

type AppSortKey = typingsJapgolly.awsSdk.awsSdkStrings.CreationTime | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.InService
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - java.lang.String
*/
type AppStatus = _AppStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JupyterServer
  - typingsJapgolly.awsSdk.awsSdkStrings.KernelGateway
  - typingsJapgolly.awsSdk.awsSdkStrings.TensorBoard
  - typingsJapgolly.awsSdk.awsSdkStrings.RStudioServerPro
  - typingsJapgolly.awsSdk.awsSdkStrings.RSessionGateway
  - java.lang.String
*/
type AppType = _AppType | java.lang.String

type ApprovalDescription = java.lang.String

type ArnOrName = java.lang.String

type ArtifactArn = java.lang.String

type ArtifactDigest = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MD5Hash
  - typingsJapgolly.awsSdk.awsSdkStrings.S3ETag
  - typingsJapgolly.awsSdk.awsSdkStrings.S3Version
  - typingsJapgolly.awsSdk.awsSdkStrings.Custom_
  - java.lang.String
*/
type ArtifactSourceIdType = _ArtifactSourceIdType | java.lang.String

type ArtifactSourceTypes = js.Array[ArtifactSourceType]

type ArtifactSummaries = js.Array[ArtifactSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - typingsJapgolly.awsSdk.awsSdkStrings.Line_
  - java.lang.String
*/
type AssemblyType = _AssemblyType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ContributedTo
  - typingsJapgolly.awsSdk.awsSdkStrings.AssociatedWith
  - typingsJapgolly.awsSdk.awsSdkStrings.DerivedFrom
  - typingsJapgolly.awsSdk.awsSdkStrings.Produced
  - java.lang.String
*/
type AssociationEdgeType = _AssociationEdgeType | java.lang.String

type AssociationEntityArn = java.lang.String

type AssociationSummaries = js.Array[AssociationSummary]

type AthenaCatalog = java.lang.String

type AthenaDatabase = java.lang.String

type AthenaQueryString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GZIP
  - typingsJapgolly.awsSdk.awsSdkStrings.SNAPPY
  - typingsJapgolly.awsSdk.awsSdkStrings.ZLIB
  - java.lang.String
*/
type AthenaResultCompressionType = _AthenaResultCompressionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PARQUET
  - typingsJapgolly.awsSdk.awsSdkStrings.ORC
  - typingsJapgolly.awsSdk.awsSdkStrings.AVRO
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXTFILE
  - java.lang.String
*/
type AthenaResultFormat = _AthenaResultFormat | java.lang.String

type AthenaWorkGroup = java.lang.String

type AttributeName = java.lang.String

type AttributeNames = js.Array[AttributeName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SSO
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM
  - java.lang.String
*/
type AuthMode = _AuthMode | java.lang.String

type AutoGenerateEndpointName = scala.Boolean

type AutoMLCandidates = js.Array[AutoMLCandidate]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.training__
  - typingsJapgolly.awsSdk.awsSdkStrings.validation__
  - java.lang.String
*/
type AutoMLChannelType = _AutoMLChannelType | java.lang.String

type AutoMLContainerDefinitions = js.Array[AutoMLContainerDefinition]

type AutoMLFailureReason = java.lang.String

type AutoMLInputDataConfig = js.Array[AutoMLChannel]

type AutoMLJobArn = java.lang.String

type AutoMLJobName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Maximize
  - typingsJapgolly.awsSdk.awsSdkStrings.Minimize
  - java.lang.String
*/
type AutoMLJobObjectiveType = _AutoMLJobObjectiveType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Starting_
  - typingsJapgolly.awsSdk.awsSdkStrings.AnalyzingData
  - typingsJapgolly.awsSdk.awsSdkStrings.FeatureEngineering
  - typingsJapgolly.awsSdk.awsSdkStrings.ModelTuning
  - typingsJapgolly.awsSdk.awsSdkStrings.MaxCandidatesReached
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - typingsJapgolly.awsSdk.awsSdkStrings.MaxAutoMLJobRuntimeReached
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.CandidateDefinitionsGenerated
  - typingsJapgolly.awsSdk.awsSdkStrings.GeneratingExplainabilityReport
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.ExplainabilityError
  - typingsJapgolly.awsSdk.awsSdkStrings.DeployingModel
  - typingsJapgolly.awsSdk.awsSdkStrings.ModelDeploymentError
  - typingsJapgolly.awsSdk.awsSdkStrings.GeneratingModelInsightsReport
  - typingsJapgolly.awsSdk.awsSdkStrings.ModelInsightsError
  - java.lang.String
*/
type AutoMLJobSecondaryStatus = _AutoMLJobSecondaryStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - java.lang.String
*/
type AutoMLJobStatus = _AutoMLJobStatus | java.lang.String

type AutoMLJobSummaries = js.Array[AutoMLJobSummary]

type AutoMLMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Accuracy
  - typingsJapgolly.awsSdk.awsSdkStrings.MSE
  - typingsJapgolly.awsSdk.awsSdkStrings.F1
  - typingsJapgolly.awsSdk.awsSdkStrings.F1macro
  - typingsJapgolly.awsSdk.awsSdkStrings.AUC
  - java.lang.String
*/
type AutoMLMetricEnum = _AutoMLMetricEnum | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Accuracy
  - typingsJapgolly.awsSdk.awsSdkStrings.MSE
  - typingsJapgolly.awsSdk.awsSdkStrings.F1
  - typingsJapgolly.awsSdk.awsSdkStrings.F1macro
  - typingsJapgolly.awsSdk.awsSdkStrings.AUC
  - typingsJapgolly.awsSdk.awsSdkStrings.RMSE
  - typingsJapgolly.awsSdk.awsSdkStrings.MAE
  - typingsJapgolly.awsSdk.awsSdkStrings.R2
  - typingsJapgolly.awsSdk.awsSdkStrings.BalancedAccuracy
  - typingsJapgolly.awsSdk.awsSdkStrings.Precision
  - typingsJapgolly.awsSdk.awsSdkStrings.PrecisionMacro
  - typingsJapgolly.awsSdk.awsSdkStrings.Recall
  - typingsJapgolly.awsSdk.awsSdkStrings.RecallMacro
  - typingsJapgolly.awsSdk.awsSdkStrings.LogLoss
  - java.lang.String
*/
type AutoMLMetricExtendedEnum = _AutoMLMetricExtendedEnum | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTO
  - typingsJapgolly.awsSdk.awsSdkStrings.ENSEMBLING
  - typingsJapgolly.awsSdk.awsSdkStrings.HYPERPARAMETER_TUNING
  - java.lang.String
*/
type AutoMLMode = _AutoMLMode | java.lang.String

type AutoMLNameContains = java.lang.String

type AutoMLPartialFailureReasons = js.Array[AutoMLPartialFailureReason]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ManifestFile
  - typingsJapgolly.awsSdk.awsSdkStrings.S3Prefix
  - java.lang.String
*/
type AutoMLS3DataType = _AutoMLS3DataType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - java.lang.String
*/
type AutoMLSortBy = _AutoMLSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
  - java.lang.String
*/
type AutoMLSortOrder = _AutoMLSortOrder | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSSlashRekognitionSlashDetectModerationLabelsSlashImageSlashV3
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSSlashTextractSlashAnalyzeDocumentSlashFormsSlashV1
  - java.lang.String
*/
type AwsManagedHumanLoopRequestSource = _AwsManagedHumanLoopRequestSource | java.lang.String

type BatchDescribeModelPackageErrorMap = StringDictionary[BatchDescribeModelPackageError]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MultiRecord
  - typingsJapgolly.awsSdk.awsSdkStrings.SingleRecord
  - java.lang.String
*/
type BatchStrategy = _BatchStrategy | java.lang.String

type BillableTimeInSeconds = Double

type BlockedReason = java.lang.String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.And_
  - typingsJapgolly.awsSdk.awsSdkStrings.Or_
  - java.lang.String
*/
type BooleanOperator = _BooleanOperator | java.lang.String

type Branch = java.lang.String

type BucketName = java.lang.String

type CallbackToken = java.lang.String

type CandidateDefinitionNotebookLocation = java.lang.String

type CandidateName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - typingsJapgolly.awsSdk.awsSdkStrings.FinalObjectiveMetricValue
  - java.lang.String
*/
type CandidateSortBy = _CandidateSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - java.lang.String
*/
type CandidateStatus = _CandidateStatus | java.lang.String

type CandidateStepArn = java.lang.String

type CandidateStepName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonTrainingJob
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonTransformJob
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonProcessingJob
  - java.lang.String
*/
type CandidateStepType = _CandidateStepType | java.lang.String

type CandidateSteps = js.Array[AutoMLCandidateStep]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_COUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.CAPACITY_PERCENT
  - java.lang.String
*/
type CapacitySizeType = _CapacitySizeType | java.lang.String

type CapacitySizeValue = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Input_
  - typingsJapgolly.awsSdk.awsSdkStrings.Output_
  - java.lang.String
*/
type CaptureMode = _CaptureMode | java.lang.String

type CaptureOptionList = js.Array[CaptureOption]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Started_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type CaptureStatus = _CaptureStatus | java.lang.String

type Catalog = java.lang.String

type CategoricalParameterRangeValues = js.Array[String128]

type CategoricalParameterRanges = js.Array[CategoricalParameterRange]

type CategoricalParameters = js.Array[CategoricalParameter]

type Cents = Double

type CertifyForMarketplace = scala.Boolean

type ChannelName = java.lang.String

type ChannelSpecifications = js.Array[ChannelSpecification]

type Cidr = java.lang.String

type Cidrs = js.Array[Cidr]

type ClarifyContentTemplate = java.lang.String

type ClarifyEnableExplanations = java.lang.String

type ClarifyFeatureHeaders = js.Array[ClarifyHeader]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.numerical
  - typingsJapgolly.awsSdk.awsSdkStrings.categorical_
  - typingsJapgolly.awsSdk.awsSdkStrings.text__
  - java.lang.String
*/
type ClarifyFeatureType = _ClarifyFeatureType | java.lang.String

type ClarifyFeatureTypes = js.Array[ClarifyFeatureType]

type ClarifyFeaturesAttribute = java.lang.String

type ClarifyHeader = java.lang.String

type ClarifyLabelAttribute = java.lang.String

type ClarifyLabelHeaders = js.Array[ClarifyHeader]

type ClarifyLabelIndex = Double

type ClarifyMaxPayloadInMB = Double

type ClarifyMaxRecordCount = Double

type ClarifyMimeType = java.lang.String

type ClarifyProbabilityAttribute = java.lang.String

type ClarifyProbabilityIndex = Double

type ClarifyShapBaseline = java.lang.String

type ClarifyShapNumberOfSamples = Double

type ClarifyShapSeed = Double

type ClarifyShapUseLogit = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.token__
  - typingsJapgolly.awsSdk.awsSdkStrings.sentence
  - typingsJapgolly.awsSdk.awsSdkStrings.paragraph
  - java.lang.String
*/
type ClarifyTextGranularity = _ClarifyTextGranularity | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.af_
  - typingsJapgolly.awsSdk.awsSdkStrings.sq
  - typingsJapgolly.awsSdk.awsSdkStrings.ar_
  - typingsJapgolly.awsSdk.awsSdkStrings.hy
  - typingsJapgolly.awsSdk.awsSdkStrings.eu_
  - typingsJapgolly.awsSdk.awsSdkStrings.bn_
  - typingsJapgolly.awsSdk.awsSdkStrings.bg_
  - typingsJapgolly.awsSdk.awsSdkStrings.ca_
  - typingsJapgolly.awsSdk.awsSdkStrings.zh
  - typingsJapgolly.awsSdk.awsSdkStrings.hr_
  - typingsJapgolly.awsSdk.awsSdkStrings.cs_
  - typingsJapgolly.awsSdk.awsSdkStrings.da
  - typingsJapgolly.awsSdk.awsSdkStrings.nl_
  - typingsJapgolly.awsSdk.awsSdkStrings.en_
  - typingsJapgolly.awsSdk.awsSdkStrings.et_
  - typingsJapgolly.awsSdk.awsSdkStrings.fi_
  - typingsJapgolly.awsSdk.awsSdkStrings.fr_
  - typingsJapgolly.awsSdk.awsSdkStrings.de_
  - typingsJapgolly.awsSdk.awsSdkStrings.el
  - typingsJapgolly.awsSdk.awsSdkStrings.gu_
  - typingsJapgolly.awsSdk.awsSdkStrings.he
  - typingsJapgolly.awsSdk.awsSdkStrings.hi
  - typingsJapgolly.awsSdk.awsSdkStrings.hu_
  - typingsJapgolly.awsSdk.awsSdkStrings.is_
  - typingsJapgolly.awsSdk.awsSdkStrings.id__
  - typingsJapgolly.awsSdk.awsSdkStrings.ga_
  - typingsJapgolly.awsSdk.awsSdkStrings.it_
  - typingsJapgolly.awsSdk.awsSdkStrings.kn_
  - typingsJapgolly.awsSdk.awsSdkStrings.ky_
  - typingsJapgolly.awsSdk.awsSdkStrings.lv_
  - typingsJapgolly.awsSdk.awsSdkStrings.lt_
  - typingsJapgolly.awsSdk.awsSdkStrings.lb_
  - typingsJapgolly.awsSdk.awsSdkStrings.mk_
  - typingsJapgolly.awsSdk.awsSdkStrings.ml_
  - typingsJapgolly.awsSdk.awsSdkStrings.mr_
  - typingsJapgolly.awsSdk.awsSdkStrings.ne_
  - typingsJapgolly.awsSdk.awsSdkStrings.nb
  - typingsJapgolly.awsSdk.awsSdkStrings.fa
  - typingsJapgolly.awsSdk.awsSdkStrings.pl_
  - typingsJapgolly.awsSdk.awsSdkStrings.pt_
  - typingsJapgolly.awsSdk.awsSdkStrings.ro_
  - typingsJapgolly.awsSdk.awsSdkStrings.ru_
  - typingsJapgolly.awsSdk.awsSdkStrings.sa_
  - typingsJapgolly.awsSdk.awsSdkStrings.sr_
  - typingsJapgolly.awsSdk.awsSdkStrings.tn_
  - typingsJapgolly.awsSdk.awsSdkStrings.si_
  - typingsJapgolly.awsSdk.awsSdkStrings.sk_
  - typingsJapgolly.awsSdk.awsSdkStrings.sl_
  - typingsJapgolly.awsSdk.awsSdkStrings.es_
  - typingsJapgolly.awsSdk.awsSdkStrings.sv_
  - typingsJapgolly.awsSdk.awsSdkStrings.tl_
  - typingsJapgolly.awsSdk.awsSdkStrings.ta
  - typingsJapgolly.awsSdk.awsSdkStrings.tt_
  - typingsJapgolly.awsSdk.awsSdkStrings.te
  - typingsJapgolly.awsSdk.awsSdkStrings.tr_
  - typingsJapgolly.awsSdk.awsSdkStrings.uk
  - typingsJapgolly.awsSdk.awsSdkStrings.ur
  - typingsJapgolly.awsSdk.awsSdkStrings.yo
  - typingsJapgolly.awsSdk.awsSdkStrings.lij
  - typingsJapgolly.awsSdk.awsSdkStrings.xx
  - java.lang.String
*/
type ClarifyTextLanguage = _ClarifyTextLanguage | java.lang.String

type ClientId = java.lang.String

type ClientSecret = java.lang.String

type ClientToken = java.lang.String

type CodeRepositoryArn = java.lang.String

type CodeRepositoryContains = java.lang.String

type CodeRepositoryNameContains = java.lang.String

type CodeRepositoryNameOrUrl = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.LastModifiedTime
  - java.lang.String
*/
type CodeRepositorySortBy = _CodeRepositorySortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
  - java.lang.String
*/
type CodeRepositorySortOrder = _CodeRepositorySortOrder | java.lang.String

type CodeRepositorySummaryList = js.Array[CodeRepositorySummary]

type CognitoUserGroup = java.lang.String

type CognitoUserPool = java.lang.String

type CollectionConfigurations = js.Array[CollectionConfiguration]

type CollectionName = java.lang.String

type CollectionParameters = StringDictionary[ConfigValue]

type CompilationJobArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INPROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type CompilationJobStatus = _CompilationJobStatus | java.lang.String

type CompilationJobSummaries = js.Array[CompilationJobSummary]

type CompilerOptions = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - typingsJapgolly.awsSdk.awsSdkStrings.Gzip_
  - java.lang.String
*/
type CompressionType = _CompressionType | java.lang.String

type CompressionTypes = js.Array[CompressionType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.True_
  - typingsJapgolly.awsSdk.awsSdkStrings.False_
  - java.lang.String
*/
type ConditionOutcome = _ConditionOutcome | java.lang.String

type ConfigKey = java.lang.String

type ConfigValue = java.lang.String

type ContainerArgument = java.lang.String

type ContainerArguments = js.Array[ContainerArgument]

type ContainerDefinitionList = js.Array[ContainerDefinition]

type ContainerEntrypoint = js.Array[ContainerEntrypointString]

type ContainerEntrypointString = java.lang.String

type ContainerHostname = java.lang.String

type ContainerImage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SingleModel
  - typingsJapgolly.awsSdk.awsSdkStrings.MultiModel
  - java.lang.String
*/
type ContainerMode = _ContainerMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
  - typingsJapgolly.awsSdk.awsSdkStrings.FreeOfAdultContent
  - java.lang.String
*/
type ContentClassifier = _ContentClassifier | java.lang.String

type ContentClassifiers = js.Array[ContentClassifier]

type ContentDigest = java.lang.String

type ContentType = java.lang.String

type ContentTypes = js.Array[ContentType]

type ContextArn = java.lang.String

type ContextSummaries = js.Array[ContextSummary]

type ContinuousParameterRanges = js.Array[ContinuousParameterRange]

type CreationTime = js.Date

type CsvContentType = java.lang.String

type CsvContentTypes = js.Array[CsvContentType]

type CustomImages = js.Array[CustomImage]

type CustomerMetadataKey = java.lang.String

type CustomerMetadataKeyList = js.Array[CustomerMetadataKey]

type CustomerMetadataMap = StringDictionary[CustomerMetadataValue]

type CustomerMetadataValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FullyReplicated
  - typingsJapgolly.awsSdk.awsSdkStrings.ShardedByS3Key
  - java.lang.String
*/
type DataDistributionType = _DataDistributionType | java.lang.String

type DataExplorationNotebookLocation = java.lang.String

type DataInputConfig = java.lang.String

type Database = java.lang.String

type DebugRuleConfigurations = js.Array[DebugRuleConfiguration]

type DebugRuleEvaluationStatuses = js.Array[DebugRuleEvaluationStatus]

type DefaultGid = Double

type DefaultUid = Double

type DeployedImages = js.Array[DeployedImage]

type DeploymentStageMaxResults = Double

type DeploymentStageStatusSummaries = js.Array[DeploymentStageStatusSummary]

type DeploymentStages = js.Array[DeploymentStage]

type Description = java.lang.String

type DesiredWeightAndCapacityList = js.Array[DesiredWeightAndCapacity]

type DestinationS3Uri = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NotStarted
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type DetailedAlgorithmStatus = _DetailedAlgorithmStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NotStarted
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type DetailedModelPackageStatus = _DetailedModelPackageStatus | java.lang.String

type DeviceArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READYTODEPLOY
  - typingsJapgolly.awsSdk.awsSdkStrings.INPROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type DeviceDeploymentStatus = _DeviceDeploymentStatus | java.lang.String

type DeviceDeploymentSummaries = js.Array[DeviceDeploymentSummary]

type DeviceDescription = java.lang.String

type DeviceFleetArn = java.lang.String

type DeviceFleetDescription = java.lang.String

type DeviceFleetSummaries = js.Array[DeviceFleetSummary]

type DeviceName = java.lang.String

type DeviceNames = js.Array[DeviceName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PERCENTAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.SELECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.NAMECONTAINS
  - java.lang.String
*/
type DeviceSubsetType = _DeviceSubsetType | java.lang.String

type DeviceSummaries = js.Array[DeviceSummary]

type Devices = js.Array[Device]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type DirectInternetAccess = _DirectInternetAccess | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Both_
  - typingsJapgolly.awsSdk.awsSdkStrings.Ascendants
  - typingsJapgolly.awsSdk.awsSdkStrings.Descendants
  - java.lang.String
*/
type Direction = _Direction | java.lang.String

type DirectoryPath = java.lang.String

type DisableProfiler = scala.Boolean

type DisassociateAdditionalCodeRepositories = scala.Boolean

type DisassociateDefaultCodeRepository = scala.Boolean

type DisassociateNotebookInstanceAcceleratorTypes = scala.Boolean

type DisassociateNotebookInstanceLifecycleConfig = scala.Boolean

type Dollars = Double

type DomainArn = java.lang.String

type DomainId = java.lang.String

type DomainList = js.Array[DomainDetails]

type DomainName = java.lang.String

type DomainSecurityGroupIds = js.Array[SecurityGroupId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.InService
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Updating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Update_Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Delete_Failed_
  - java.lang.String
*/
type DomainStatus = _DomainStatus | java.lang.String

type DoubleParameterValue = Double

type EdgeDeploymentModelConfigs = js.Array[EdgeDeploymentModelConfig]

type EdgeDeploymentPlanArn = java.lang.String

type EdgeDeploymentPlanSummaries = js.Array[EdgeDeploymentPlanSummary]

type EdgeModelStats = js.Array[EdgeModelStat]

type EdgeModelSummaries = js.Array[EdgeModelSummary]

type EdgeModels = js.Array[EdgeModel]

type EdgePackagingJobArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
  - typingsJapgolly.awsSdk.awsSdkStrings.INPROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type EdgePackagingJobStatus = _EdgePackagingJobStatus | java.lang.String

type EdgePackagingJobSummaries = js.Array[EdgePackagingJobSummary]

type EdgePresetDeploymentArtifact = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type EdgePresetDeploymentStatus = _EdgePresetDeploymentStatus | java.lang.String

type EdgePresetDeploymentType = GreengrassV2Component | java.lang.String

type EdgeVersion = java.lang.String

type Edges = js.Array[Edge]

type EfsUid = java.lang.String

type EnableCapture = scala.Boolean

type EnableIotRoleAlias = scala.Boolean

type EndpointArn = java.lang.String

type EndpointConfigArn = java.lang.String

type EndpointConfigName = java.lang.String

type EndpointConfigNameContains = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type EndpointConfigSortKey = _EndpointConfigSortKey | java.lang.String

type EndpointConfigSummaryList = js.Array[EndpointConfigSummary]

type EndpointInputConfigurations = js.Array[EndpointInputConfiguration]

type EndpointName = java.lang.String

type EndpointNameContains = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - java.lang.String
*/
type EndpointSortKey = _EndpointSortKey | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OutOfService
  - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Updating_
  - typingsJapgolly.awsSdk.awsSdkStrings.SystemUpdating
  - typingsJapgolly.awsSdk.awsSdkStrings.RollingBack
  - typingsJapgolly.awsSdk.awsSdkStrings.InService
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type EndpointStatus = _EndpointStatus | java.lang.String

type EndpointSummaryList = js.Array[EndpointSummary]

type EntityDescription = java.lang.String

type EntityName = java.lang.String

type EnvironmentKey = java.lang.String

type EnvironmentMap = StringDictionary[EnvironmentValue]

type EnvironmentParameters = js.Array[EnvironmentParameter]

type EnvironmentValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER_PROFILE_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ExecutionRoleIdentityConfig = _ExecutionRoleIdentityConfig | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.CompletedWithViolations
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type ExecutionStatus = _ExecutionStatus | java.lang.String

type ExitMessage = java.lang.String

type ExperimentArn = java.lang.String

type ExperimentDescription = java.lang.String

type ExperimentEntityName = java.lang.String

type ExperimentEntityNameOrArn = java.lang.String

type ExperimentSourceArn = java.lang.String

type ExperimentSummaries = js.Array[ExperimentSummary]

type ExpiresInSeconds = Double

type ExplainabilityLocation = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLBACK_ON_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.DO_NOTHING
  - java.lang.String
*/
type FailureHandlingPolicy = _FailureHandlingPolicy | java.lang.String

type FailureReason = java.lang.String

type FeatureAdditions = js.Array[FeatureDefinition]

type FeatureDefinitions = js.Array[FeatureDefinition]

type FeatureDescription = java.lang.String

type FeatureGroupArn = java.lang.String

type FeatureGroupMaxResults = Double

type FeatureGroupName = java.lang.String

type FeatureGroupNameContains = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.FeatureGroupStatus
  - typingsJapgolly.awsSdk.awsSdkStrings.OfflineStoreStatus
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type FeatureGroupSortBy = _FeatureGroupSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
  - java.lang.String
*/
type FeatureGroupSortOrder = _FeatureGroupSortOrder | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Created_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteFailed
  - java.lang.String
*/
type FeatureGroupStatus = _FeatureGroupStatus | java.lang.String

type FeatureGroupSummaries = js.Array[FeatureGroupSummary]

type FeatureName = java.lang.String

type FeatureParameterAdditions = js.Array[FeatureParameter]

type FeatureParameterKey = java.lang.String

type FeatureParameterRemovals = js.Array[FeatureParameterKey]

type FeatureParameterValue = java.lang.String

type FeatureParameters = js.Array[FeatureParameter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type FeatureStatus = _FeatureStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Integral
  - typingsJapgolly.awsSdk.awsSdkStrings.Fractional
  - typingsJapgolly.awsSdk.awsSdkStrings.String_
  - java.lang.String
*/
type FeatureType = _FeatureType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.rw_
  - typingsJapgolly.awsSdk.awsSdkStrings.ro_
  - java.lang.String
*/
type FileSystemAccessMode = _FileSystemAccessMode | java.lang.String

type FileSystemId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EFS
  - typingsJapgolly.awsSdk.awsSdkStrings.FSxLustre
  - java.lang.String
*/
type FileSystemType = _FileSystemType | java.lang.String

type FilterList = js.Array[Filter]

type FilterValue = java.lang.String

type FinalMetricDataList = js.Array[MetricData]

type Float = Double

type FlowDefinitionArn = java.lang.String

type FlowDefinitionName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Initializing_
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - java.lang.String
*/
type FlowDefinitionStatus = _FlowDefinitionStatus | java.lang.String

type FlowDefinitionSummaries = js.Array[FlowDefinitionSummary]

type FlowDefinitionTaskAvailabilityLifetimeInSeconds = Double

type FlowDefinitionTaskCount = Double

type FlowDefinitionTaskDescription = java.lang.String

type FlowDefinitionTaskKeyword = java.lang.String

type FlowDefinitionTaskKeywords = js.Array[FlowDefinitionTaskKeyword]

type FlowDefinitionTaskTimeLimitInSeconds = Double

type FlowDefinitionTaskTitle = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TENSORFLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.KERAS
  - typingsJapgolly.awsSdk.awsSdkStrings.MXNET
  - typingsJapgolly.awsSdk.awsSdkStrings.ONNX
  - typingsJapgolly.awsSdk.awsSdkStrings.PYTORCH
  - typingsJapgolly.awsSdk.awsSdkStrings.XGBOOST
  - typingsJapgolly.awsSdk.awsSdkStrings.TFLITE
  - typingsJapgolly.awsSdk.awsSdkStrings.DARKNET
  - typingsJapgolly.awsSdk.awsSdkStrings.SKLEARN
  - java.lang.String
*/
type Framework = _Framework | java.lang.String

type FrameworkVersion = java.lang.String

type GenerateCandidateDefinitionsOnly = scala.Boolean

type GitConfigUrl = java.lang.String

type Group = java.lang.String

type Groups = js.Array[Group]

type HookParameters = StringDictionary[ConfigValue]

type HumanLoopActivationConditions = java.lang.String

type HumanTaskUiArn = java.lang.String

type HumanTaskUiName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - java.lang.String
*/
type HumanTaskUiStatus = _HumanTaskUiStatus | java.lang.String

type HumanTaskUiSummaries = js.Array[HumanTaskUiSummary]

type HyperParameterKey = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Auto_
  - typingsJapgolly.awsSdk.awsSdkStrings.Linear_
  - typingsJapgolly.awsSdk.awsSdkStrings.Logarithmic
  - typingsJapgolly.awsSdk.awsSdkStrings.ReverseLogarithmic
  - java.lang.String
*/
type HyperParameterScalingType = _HyperParameterScalingType | java.lang.String

type HyperParameterSpecifications = js.Array[HyperParameterSpecification]

type HyperParameterTrainingJobDefinitionName = java.lang.String

type HyperParameterTrainingJobDefinitions = js.Array[HyperParameterTrainingJobDefinition]

type HyperParameterTrainingJobSummaries = js.Array[HyperParameterTrainingJobSummary]

type HyperParameterTuningAllocationStrategy = Prioritized | java.lang.String

type HyperParameterTuningInstanceConfigs = js.Array[HyperParameterTuningInstanceConfig]

type HyperParameterTuningJobArn = java.lang.String

type HyperParameterTuningJobName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Maximize
  - typingsJapgolly.awsSdk.awsSdkStrings.Minimize
  - java.lang.String
*/
type HyperParameterTuningJobObjectiveType = _HyperParameterTuningJobObjectiveType | java.lang.String

type HyperParameterTuningJobObjectives = js.Array[HyperParameterTuningJobObjective]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type HyperParameterTuningJobSortByOptions = _HyperParameterTuningJobSortByOptions | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - java.lang.String
*/
type HyperParameterTuningJobStatus = _HyperParameterTuningJobStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Bayesian
  - typingsJapgolly.awsSdk.awsSdkStrings.Random_
  - typingsJapgolly.awsSdk.awsSdkStrings.Hyperband
  - java.lang.String
*/
type HyperParameterTuningJobStrategyType = _HyperParameterTuningJobStrategyType | java.lang.String

type HyperParameterTuningJobSummaries = js.Array[HyperParameterTuningJobSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IdenticalDataAndAlgorithm
  - typingsJapgolly.awsSdk.awsSdkStrings.TransferLearning
  - java.lang.String
*/
type HyperParameterTuningJobWarmStartType = _HyperParameterTuningJobWarmStartType | java.lang.String

type HyperParameterValue = java.lang.String

type HyperParameters = StringDictionary[HyperParameterValue]

type HyperbandStrategyMaxResource = Double

type HyperbandStrategyMinResource = Double

type IdempotencyToken = java.lang.String

type ImageArn = java.lang.String

type ImageBaseImage = java.lang.String

type ImageContainerImage = java.lang.String

type ImageDeleteProperty = java.lang.String

type ImageDeletePropertyList = js.Array[ImageDeleteProperty]

type ImageDescription = java.lang.String

type ImageDigest = java.lang.String

type ImageDisplayName = java.lang.String

type ImageName = java.lang.String

type ImageNameContains = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.IMAGE_NAME
  - java.lang.String
*/
type ImageSortBy = _ImageSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type ImageSortOrder = _ImageSortOrder | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type ImageStatus = _ImageStatus | java.lang.String

type ImageUri = java.lang.String

type ImageVersionArn = java.lang.String

type ImageVersionNumber = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.VERSION
  - java.lang.String
*/
type ImageVersionSortBy = _ImageVersionSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type ImageVersionSortOrder = _ImageVersionSortOrder | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type ImageVersionStatus = _ImageVersionStatus | java.lang.String

type ImageVersions = js.Array[ImageVersion]

type Images = js.Array[Image]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Serial_
  - typingsJapgolly.awsSdk.awsSdkStrings.Direct_
  - java.lang.String
*/
type InferenceExecutionMode = _InferenceExecutionMode | java.lang.String

type InferenceImage = java.lang.String

type InferenceRecommendations = js.Array[InferenceRecommendation]

type InferenceRecommendationsJobs = js.Array[InferenceRecommendationsJob]

type InferenceSpecificationName = java.lang.String

type InitialNumberOfUsers = Double

type InitialTaskCount = Double

type InputDataConfig = js.Array[Channel]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pipe
  - typingsJapgolly.awsSdk.awsSdkStrings.File_
  - java.lang.String
*/
type InputMode = _InputMode | java.lang.String

type InputModes = js.Array[TrainingInputMode]

type InstanceGroupName = java.lang.String

type InstanceGroupNames = js.Array[InstanceGroupName]

type InstanceGroups = js.Array[InstanceGroup]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott2Dotmedium
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott2Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott2Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott2Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott3Dotmedium
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott3Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott3Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott3Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5dDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5dDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5dDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5dDot9xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5dDot18xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3dnDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot48xlarge
  - java.lang.String
*/
type InstanceType = _InstanceType | java.lang.String

type Integer = Double

type IntegerParameterRanges = js.Array[IntegerParameterRange]

type IntegerValue = Double

type InvocationsMaxRetries = Double

type InvocationsTimeoutInSeconds = Double

type IotRoleAlias = java.lang.String

type JobDurationInSeconds = Double

type JobReferenceCode = java.lang.String

type JobReferenceCodeContains = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Input_
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - java.lang.String
*/
type JoinSource = _JoinSource | java.lang.String

type JsonContentType = java.lang.String

type JsonContentTypes = js.Array[JsonContentType]

type JsonPath = java.lang.String

type KeepAlivePeriodInSeconds = Double

type KernelDisplayName = java.lang.String

type KernelName = java.lang.String

type KernelSpecs = js.Array[KernelSpec]

type Key = java.lang.String

type KmsKeyId = java.lang.String

type LabelAttributeName = java.lang.String

type LabelCounter = Double

type LabelingJobAlgorithmSpecificationArn = java.lang.String

type LabelingJobArn = java.lang.String

type LabelingJobForWorkteamSummaryList = js.Array[LabelingJobForWorkteamSummary]

type LabelingJobName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Initializing_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type LabelingJobStatus = _LabelingJobStatus | java.lang.String

type LabelingJobSummaryList = js.Array[LabelingJobSummary]

type LambdaFunctionArn = java.lang.String

type LastModifiedTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Successful_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - java.lang.String
*/
type LastUpdateStatusValue = _LastUpdateStatusValue | java.lang.String

type LifecycleConfigArns = js.Array[StudioLifecycleConfigArn]

type LineageEntityParameters = StringDictionary[StringParameterValue]

type LineageGroupArn = java.lang.String

type LineageGroupNameOrArn = java.lang.String

type LineageGroupSummaries = js.Array[LineageGroupSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TrialComponent
  - typingsJapgolly.awsSdk.awsSdkStrings.Artifact
  - typingsJapgolly.awsSdk.awsSdkStrings.Context
  - typingsJapgolly.awsSdk.awsSdkStrings.Action_
  - java.lang.String
*/
type LineageType = _LineageType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - java.lang.String
*/
type ListCompilationJobsSortBy = _ListCompilationJobsSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
  - java.lang.String
*/
type ListDeviceFleetsSortBy = _ListDeviceFleetsSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.DEVICE_FLEET_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
  - java.lang.String
*/
type ListEdgeDeploymentPlansSortBy = _ListEdgeDeploymentPlansSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.MODEL_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.STATUS
  - java.lang.String
*/
type ListEdgePackagingJobsSortBy = _ListEdgePackagingJobsSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - java.lang.String
*/
type ListInferenceRecommendationsJobsSortBy = _ListInferenceRecommendationsJobsSortBy | java.lang.String

type ListLabelingJobsForWorkteamSortByOptions = typingsJapgolly.awsSdk.awsSdkStrings.CreationTime | java.lang.String

type ListLineageEntityParameterKey = js.Array[StringParameterValue]

type ListMaxResults = Double

type ListTagsMaxResults = Double

type ListTrialComponentKey256 = js.Array[TrialComponentKey256]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateDate
  - java.lang.String
*/
type ListWorkforcesSortByOptions = _ListWorkforcesSortByOptions | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateDate
  - java.lang.String
*/
type ListWorkteamsSortByOptions = _ListWorkteamsSortByOptions | java.lang.String

type Long = Double

type MaxAutoMLJobRuntimeInSeconds = Double

type MaxCandidates = Double

type MaxConcurrentInvocationsPerInstance = Double

type MaxConcurrentTaskCount = Double

type MaxConcurrentTransforms = Double

type MaxHumanLabeledObjectCount = Double

type MaxNumberOfTests = Double

type MaxNumberOfTrainingJobs = Double

type MaxParallelExecutionSteps = Double

type MaxParallelOfTests = Double

type MaxParallelTrainingJobs = Double

type MaxPayloadInMB = Double

type MaxPercentageOfInputDatasetLabeled = Double

type MaxResults = Double

type MaxRuntimeInSeconds = Double

type MaxRuntimePerTrainingJobInSeconds = Double

type MaxWaitTimeInSeconds = Double

type MaximumExecutionTimeoutInSeconds = Double

type MaximumRetryAttempts = Double

type MediaType = java.lang.String

type MemberDefinitions = js.Array[MemberDefinition]

type MetadataPropertyValue = java.lang.String

type MetricDataList = js.Array[MetricDatum]

type MetricDefinitionList = js.Array[MetricDefinition]

type MetricName = java.lang.String

type MetricRegex = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Train_
  - typingsJapgolly.awsSdk.awsSdkStrings.Validation_
  - typingsJapgolly.awsSdk.awsSdkStrings.Test_
  - java.lang.String
*/
type MetricSetSource = _MetricSetSource | java.lang.String

type MetricValue = Double

type MinimumInstanceMetadataServiceVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Approved_
  - typingsJapgolly.awsSdk.awsSdkStrings.Rejected_
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingManualApproval
  - java.lang.String
*/
type ModelApprovalStatus = _ModelApprovalStatus | java.lang.String

type ModelArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ModelCacheSetting = _ModelCacheSetting | java.lang.String

type ModelInsightsLocation = java.lang.String

type ModelLatencyThresholds = js.Array[ModelLatencyThreshold]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Domain_
  - typingsJapgolly.awsSdk.awsSdkStrings.Framework
  - typingsJapgolly.awsSdk.awsSdkStrings.Task_
  - typingsJapgolly.awsSdk.awsSdkStrings.FrameworkVersion
  - java.lang.String
*/
type ModelMetadataFilterType = _ModelMetadataFilterType | java.lang.String

type ModelMetadataFilters = js.Array[ModelMetadataFilter]

type ModelMetadataSummaries = js.Array[ModelMetadataSummary]

type ModelName = java.lang.String

type ModelNameContains = java.lang.String

type ModelPackageArn = java.lang.String

type ModelPackageArnList = js.Array[ModelPackageArn]

type ModelPackageContainerDefinitionList = js.Array[ModelPackageContainerDefinition]

type ModelPackageGroupArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type ModelPackageGroupSortBy = _ModelPackageGroupSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteFailed
  - java.lang.String
*/
type ModelPackageGroupStatus = _ModelPackageGroupStatus | java.lang.String

type ModelPackageGroupSummaryList = js.Array[ModelPackageGroupSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type ModelPackageSortBy = _ModelPackageSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - java.lang.String
*/
type ModelPackageStatus = _ModelPackageStatus | java.lang.String

type ModelPackageStatusItemList = js.Array[ModelPackageStatusItem]

type ModelPackageSummaries = StringDictionary[BatchDescribeModelPackageSummary]

type ModelPackageSummaryList = js.Array[ModelPackageSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Versioned
  - typingsJapgolly.awsSdk.awsSdkStrings.Unversioned
  - typingsJapgolly.awsSdk.awsSdkStrings.Both_
  - java.lang.String
*/
type ModelPackageType = _ModelPackageType | java.lang.String

type ModelPackageValidationProfiles = js.Array[ModelPackageValidationProfile]

type ModelPackageVersion = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type ModelSortKey = _ModelSortKey | java.lang.String

type ModelSummaryList = js.Array[ModelSummary]

type MonitoringContainerArguments = js.Array[ContainerArgument]

type MonitoringEnvironmentMap = StringDictionary[ProcessingEnvironmentValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.ScheduledTime
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - java.lang.String
*/
type MonitoringExecutionSortKey = _MonitoringExecutionSortKey | java.lang.String

type MonitoringExecutionSummaryList = js.Array[MonitoringExecutionSummary]

type MonitoringInputs = js.Array[MonitoringInput]

type MonitoringJobDefinitionArn = java.lang.String

type MonitoringJobDefinitionName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type MonitoringJobDefinitionSortKey = _MonitoringJobDefinitionSortKey | java.lang.String

type MonitoringJobDefinitionSummaryList = js.Array[MonitoringJobDefinitionSummary]

type MonitoringMaxRuntimeInSeconds = Double

type MonitoringOutputs = js.Array[MonitoringOutput]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BinaryClassification
  - typingsJapgolly.awsSdk.awsSdkStrings.MulticlassClassification
  - typingsJapgolly.awsSdk.awsSdkStrings.Regression_
  - java.lang.String
*/
type MonitoringProblemType = _MonitoringProblemType | java.lang.String

type MonitoringS3Uri = java.lang.String

type MonitoringScheduleArn = java.lang.String

type MonitoringScheduleList = js.Array[MonitoringSchedule]

type MonitoringScheduleName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - java.lang.String
*/
type MonitoringScheduleSortKey = _MonitoringScheduleSortKey | java.lang.String

type MonitoringScheduleSummaryList = js.Array[MonitoringScheduleSummary]

type MonitoringTimeOffsetString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DataQuality
  - typingsJapgolly.awsSdk.awsSdkStrings.ModelQuality
  - typingsJapgolly.awsSdk.awsSdkStrings.ModelBias
  - typingsJapgolly.awsSdk.awsSdkStrings.ModelExplainability
  - java.lang.String
*/
type MonitoringType = _MonitoringType | java.lang.String

type MountPath = java.lang.String

type NameContains = java.lang.String

type NeoVpcSecurityGroupId = java.lang.String

type NeoVpcSecurityGroupIds = js.Array[NeoVpcSecurityGroupId]

type NeoVpcSubnetId = java.lang.String

type NeoVpcSubnets = js.Array[NeoVpcSubnetId]

type NestedFiltersList = js.Array[NestedFilters]

type NetworkInterfaceId = java.lang.String

type NextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia1Dotmedium
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia1Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia1Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia2Dotmedium
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia2Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia2Dotxlarge
  - java.lang.String
*/
type NotebookInstanceAcceleratorType = _NotebookInstanceAcceleratorType | java.lang.String

type NotebookInstanceAcceleratorTypes = js.Array[NotebookInstanceAcceleratorType]

type NotebookInstanceArn = java.lang.String

type NotebookInstanceLifecycleConfigArn = java.lang.String

type NotebookInstanceLifecycleConfigContent = java.lang.String

type NotebookInstanceLifecycleConfigList = js.Array[NotebookInstanceLifecycleHook]

type NotebookInstanceLifecycleConfigName = java.lang.String

type NotebookInstanceLifecycleConfigNameContains = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.LastModifiedTime
  - java.lang.String
*/
type NotebookInstanceLifecycleConfigSortKey = _NotebookInstanceLifecycleConfigSortKey | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
  - java.lang.String
*/
type NotebookInstanceLifecycleConfigSortOrder = _NotebookInstanceLifecycleConfigSortOrder | java.lang.String

type NotebookInstanceLifecycleConfigSummaryList = js.Array[NotebookInstanceLifecycleConfigSummary]

type NotebookInstanceName = java.lang.String

type NotebookInstanceNameContains = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - java.lang.String
*/
type NotebookInstanceSortKey = _NotebookInstanceSortKey | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
  - java.lang.String
*/
type NotebookInstanceSortOrder = _NotebookInstanceSortOrder | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InService
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.Updating_
  - java.lang.String
*/
type NotebookInstanceStatus = _NotebookInstanceStatus | java.lang.String

type NotebookInstanceSummaryList = js.Array[NotebookInstanceSummary]

type NotebookInstanceUrl = java.lang.String

type NotebookInstanceVolumeSizeInGB = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Allowed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type NotebookOutputOption = _NotebookOutputOption | java.lang.String

type NotificationTopicArn = java.lang.String

type NumberOfHumanWorkersPerDataObject = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type ObjectiveStatus = _ObjectiveStatus | java.lang.String

type ObjectiveStatusCounter = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - typingsJapgolly.awsSdk.awsSdkStrings.Blocked
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type OfflineStoreStatusValue = _OfflineStoreStatusValue | java.lang.String

type OidcEndpoint = java.lang.String

type OnlineStoreTotalSizeBytes = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Equals_
  - typingsJapgolly.awsSdk.awsSdkStrings.NotEquals
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThan
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanOrEqualTo
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThan
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThanOrEqualTo
  - typingsJapgolly.awsSdk.awsSdkStrings.Contains_
  - typingsJapgolly.awsSdk.awsSdkStrings.Exists
  - typingsJapgolly.awsSdk.awsSdkStrings.NotExists
  - typingsJapgolly.awsSdk.awsSdkStrings.In_
  - java.lang.String
*/
type Operator = _Operator | java.lang.String

type OptionalDouble = Double

type OptionalInteger = Double

type OptionalVolumeSizeInGB = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
  - java.lang.String
*/
type OrderKey = _OrderKey | java.lang.String

type OutputParameterList = js.Array[OutputParameter]

type PaginationToken = java.lang.String

type ParameterKey = java.lang.String

type ParameterList = js.Array[Parameter]

type ParameterName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Integer_
  - typingsJapgolly.awsSdk.awsSdkStrings.Continuous_
  - typingsJapgolly.awsSdk.awsSdkStrings.Categorical
  - typingsJapgolly.awsSdk.awsSdkStrings.FreeText
  - java.lang.String
*/
type ParameterType = _ParameterType | java.lang.String

type ParameterValue = java.lang.String

type ParameterValues = js.Array[ParameterValue]

type ParentHyperParameterTuningJobs = js.Array[ParentHyperParameterTuningJob]

type Parents = js.Array[Parent]

type PendingProductionVariantSummaryList = js.Array[PendingProductionVariantSummary]

type Percentage = Double

type Phases = js.Array[Phase]

type PipelineArn = java.lang.String

type PipelineDefinition = java.lang.String

type PipelineDescription = java.lang.String

type PipelineExecutionArn = java.lang.String

type PipelineExecutionDescription = java.lang.String

type PipelineExecutionFailureReason = java.lang.String

type PipelineExecutionName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Executing_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - java.lang.String
*/
type PipelineExecutionStatus = _PipelineExecutionStatus | java.lang.String

type PipelineExecutionStepList = js.Array[PipelineExecutionStep]

type PipelineExecutionSummaryList = js.Array[PipelineExecutionSummary]

type PipelineName = java.lang.String

type PipelineParameterName = java.lang.String

type PipelineStatus = Active_ | java.lang.String

type PipelineSummaryList = js.Array[PipelineSummary]

type PlatformIdentifier = java.lang.String

type PolicyString = java.lang.String

type PresignedDomainUrl = java.lang.String

type ProbabilityThresholdAttribute = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BinaryClassification
  - typingsJapgolly.awsSdk.awsSdkStrings.MulticlassClassification
  - typingsJapgolly.awsSdk.awsSdkStrings.Regression_
  - java.lang.String
*/
type ProblemType = _ProblemType | java.lang.String

type ProcessingEnvironmentKey = java.lang.String

type ProcessingEnvironmentMap = StringDictionary[ProcessingEnvironmentValue]

type ProcessingEnvironmentValue = java.lang.String

type ProcessingInputs = js.Array[ProcessingInput]

type ProcessingInstanceCount = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott3Dotmedium
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott3Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott3Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott3Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot16xlarge
  - java.lang.String
*/
type ProcessingInstanceType = _ProcessingInstanceType | java.lang.String

type ProcessingJobArn = java.lang.String

type ProcessingJobName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type ProcessingJobStatus = _ProcessingJobStatus | java.lang.String

type ProcessingJobSummaries = js.Array[ProcessingJobSummary]

type ProcessingLocalPath = java.lang.String

type ProcessingMaxRuntimeInSeconds = Double

type ProcessingOutputs = js.Array[ProcessingOutput]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - typingsJapgolly.awsSdk.awsSdkStrings.Gzip_
  - java.lang.String
*/
type ProcessingS3CompressionType = _ProcessingS3CompressionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FullyReplicated
  - typingsJapgolly.awsSdk.awsSdkStrings.ShardedByS3Key
  - java.lang.String
*/
type ProcessingS3DataDistributionType = _ProcessingS3DataDistributionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ManifestFile
  - typingsJapgolly.awsSdk.awsSdkStrings.S3Prefix
  - java.lang.String
*/
type ProcessingS3DataType = _ProcessingS3DataType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pipe
  - typingsJapgolly.awsSdk.awsSdkStrings.File_
  - java.lang.String
*/
type ProcessingS3InputMode = _ProcessingS3InputMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Continuous_
  - typingsJapgolly.awsSdk.awsSdkStrings.EndOfJob
  - java.lang.String
*/
type ProcessingS3UploadMode = _ProcessingS3UploadMode | java.lang.String

type ProcessingVolumeSizeInGB = Double

type ProductId = java.lang.String

type ProductListings = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia1Dotmedium
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia1Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia1Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia2Dotmedium
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia2Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia2Dotxlarge
  - java.lang.String
*/
type ProductionVariantAcceleratorType = _ProductionVariantAcceleratorType | java.lang.String

type ProductionVariantContainerStartupHealthCheckTimeoutInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott2Dotmedium
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott2Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott2Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDott2Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5dDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5dDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5dDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5dDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5dDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5dDot9xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5dDot18xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5dDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5dDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5dDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5dDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5dDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr5dDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotinf1Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotinf1Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotinf1Dot6xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotinf1Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6iDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6iDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6iDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6iDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6iDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6iDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6iDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6iDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6iDot32xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot48xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp4dDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc7gDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc7gDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc7gDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc7gDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc7gDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc7gDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc7gDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm6gDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm6gDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm6gDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm6gDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm6gDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm6gDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm6gDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm6gdDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm6gdDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm6gdDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm6gdDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm6gdDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm6gdDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm6gdDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gdDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gdDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gdDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gdDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gdDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gdDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gdDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gnDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gnDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gnDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gnDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gnDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gnDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc6gnDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr6gDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr6gDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr6gDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr6gDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr6gDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr6gDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr6gDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr6gdDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr6gdDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr6gdDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr6gdDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr6gdDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr6gdDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotr6gdDot16xlarge
  - java.lang.String
*/
type ProductionVariantInstanceType = _ProductionVariantInstanceType | java.lang.String

type ProductionVariantList = js.Array[ProductionVariant]

type ProductionVariantModelDataDownloadTimeoutInSeconds = Double

type ProductionVariantStatusList = js.Array[ProductionVariantStatus]

type ProductionVariantSummaryList = js.Array[ProductionVariantSummary]

type ProductionVariantVolumeSizeInGB = Double

type ProfilerRuleConfigurations = js.Array[ProfilerRuleConfiguration]

type ProfilerRuleEvaluationStatuses = js.Array[ProfilerRuleEvaluationStatus]

type ProfilingIntervalInMilliseconds = Double

type ProfilingParameters = StringDictionary[ConfigValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ProfilingStatus = _ProfilingStatus | java.lang.String

type ProjectArn = java.lang.String

type ProjectEntityName = java.lang.String

type ProjectId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type ProjectSortBy = _ProjectSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
  - java.lang.String
*/
type ProjectSortOrder = _ProjectSortOrder | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateInProgress
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateCompleted
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteInProgress
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.DeleteCompleted
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateInProgress
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateCompleted
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdateFailed
  - java.lang.String
*/
type ProjectStatus = _ProjectStatus | java.lang.String

type ProjectSummaryList = js.Array[ProjectSummary]

type PropertyNameHint = java.lang.String

type PropertyNameSuggestionList = js.Array[PropertyNameSuggestion]

type ProvisionedProductStatusMessage = java.lang.String

type ProvisioningParameterKey = java.lang.String

type ProvisioningParameterValue = java.lang.String

type ProvisioningParameters = js.Array[ProvisioningParameter]

type QueryLineageMaxDepth = Double

type QueryLineageMaxResults = Double

type QueryLineageStartArns = js.Array[AssociationEntityArn]

type QueryLineageTypes = js.Array[LineageType]

type QueryProperties = StringDictionary[String256]

type QueryTypes = js.Array[String40]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type RStudioServerProAccessStatus = _RStudioServerProAccessStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.R_STUDIO_ADMIN
  - typingsJapgolly.awsSdk.awsSdkStrings.R_STUDIO_USER
  - java.lang.String
*/
type RStudioServerProUserGroup = _RStudioServerProUserGroup | java.lang.String

type RealtimeInferenceInstanceTypes = js.Array[ProductionVariantInstanceType]

type RecommendationJobArn = java.lang.String

type RecommendationJobDescription = java.lang.String

type RecommendationJobName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type RecommendationJobStatus = _RecommendationJobStatus | java.lang.String

type RecommendationJobSupportedContentTypes = js.Array[String]

type RecommendationJobSupportedInstanceTypes = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Default_
  - typingsJapgolly.awsSdk.awsSdkStrings.Advanced_
  - java.lang.String
*/
type RecommendationJobType = _RecommendationJobType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - typingsJapgolly.awsSdk.awsSdkStrings.RecordIO
  - java.lang.String
*/
type RecordWrapper = _RecordWrapper | java.lang.String

type RedshiftClusterId = java.lang.String

type RedshiftDatabase = java.lang.String

type RedshiftQueryString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - typingsJapgolly.awsSdk.awsSdkStrings.GZIP
  - typingsJapgolly.awsSdk.awsSdkStrings.BZIP2
  - typingsJapgolly.awsSdk.awsSdkStrings.ZSTD
  - typingsJapgolly.awsSdk.awsSdkStrings.SNAPPY
  - java.lang.String
*/
type RedshiftResultCompressionType = _RedshiftResultCompressionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PARQUET
  - typingsJapgolly.awsSdk.awsSdkStrings.CSV
  - java.lang.String
*/
type RedshiftResultFormat = _RedshiftResultFormat | java.lang.String

type RedshiftUserName = java.lang.String

type RenderingErrorList = js.Array[RenderingError]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Platform_
  - typingsJapgolly.awsSdk.awsSdkStrings.Vpc_
  - java.lang.String
*/
type RepositoryAccessMode = _RepositoryAccessMode | java.lang.String

type RepositoryCredentialsProviderArn = java.lang.String

type ResourceArn = java.lang.String

type ResourceId = java.lang.String

type ResourcePolicyString = java.lang.String

type ResourcePropertyName = java.lang.String

type ResourceRetainedBillableTimeInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TrainingJob
  - typingsJapgolly.awsSdk.awsSdkStrings.Experiment_
  - typingsJapgolly.awsSdk.awsSdkStrings.ExperimentTrial
  - typingsJapgolly.awsSdk.awsSdkStrings.ExperimentTrialComponent
  - typingsJapgolly.awsSdk.awsSdkStrings.Endpoint_
  - typingsJapgolly.awsSdk.awsSdkStrings.ModelPackage
  - typingsJapgolly.awsSdk.awsSdkStrings.ModelPackageGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.Pipeline_
  - typingsJapgolly.awsSdk.awsSdkStrings.PipelineExecution
  - typingsJapgolly.awsSdk.awsSdkStrings.FeatureGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.Project_
  - typingsJapgolly.awsSdk.awsSdkStrings.FeatureMetadata
  - typingsJapgolly.awsSdk.awsSdkStrings.HyperParameterTuningJob
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

type ResponseMIMEType = java.lang.String

type ResponseMIMETypes = js.Array[ResponseMIMEType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Retain_
  - typingsJapgolly.awsSdk.awsSdkStrings.Delete_
  - java.lang.String
*/
type RetentionType = _RetentionType | java.lang.String

type RoleArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type RootAccess = _RootAccess | java.lang.String

type RuleConfigurationName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.NoIssuesFound
  - typingsJapgolly.awsSdk.awsSdkStrings.IssuesFound
  - typingsJapgolly.awsSdk.awsSdkStrings.Error_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type RuleEvaluationStatus = _RuleEvaluationStatus | java.lang.String

type RuleParameters = StringDictionary[ConfigValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FullyReplicated
  - typingsJapgolly.awsSdk.awsSdkStrings.ShardedByS3Key
  - java.lang.String
*/
type S3DataDistribution = _S3DataDistribution | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ManifestFile
  - typingsJapgolly.awsSdk.awsSdkStrings.S3Prefix
  - typingsJapgolly.awsSdk.awsSdkStrings.AugmentedManifestFile
  - java.lang.String
*/
type S3DataType = _S3DataType | java.lang.String

type S3Uri = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type SagemakerServicecatalogStatus = _SagemakerServicecatalogStatus | java.lang.String

type SamplingPercentage = Double

type ScheduleExpression = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Scheduled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type ScheduleStatus = _ScheduleStatus | java.lang.String

type SearchExpressionList = js.Array[SearchExpression]

type SearchResultsList = js.Array[SearchRecord]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
  - java.lang.String
*/
type SearchSortOrder = _SearchSortOrder | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Starting_
  - typingsJapgolly.awsSdk.awsSdkStrings.LaunchingMLInstances
  - typingsJapgolly.awsSdk.awsSdkStrings.PreparingTrainingStack
  - typingsJapgolly.awsSdk.awsSdkStrings.Downloading_
  - typingsJapgolly.awsSdk.awsSdkStrings.DownloadingTrainingImage
  - typingsJapgolly.awsSdk.awsSdkStrings.Training_
  - typingsJapgolly.awsSdk.awsSdkStrings.Uploading_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - typingsJapgolly.awsSdk.awsSdkStrings.MaxRuntimeExceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Interrupted_
  - typingsJapgolly.awsSdk.awsSdkStrings.MaxWaitTimeExceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.Updating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Restarting
  - java.lang.String
*/
type SecondaryStatus = _SecondaryStatus | java.lang.String

type SecondaryStatusTransitions = js.Array[SecondaryStatusTransition]

type SecretArn = java.lang.String

type SecurityGroupId = java.lang.String

type SecurityGroupIds = js.Array[SecurityGroupId]

type Seed = Double

type ServerlessMaxConcurrency = Double

type ServerlessMemorySizeInMB = Double

type ServiceCatalogEntityId = java.lang.String

type SessionExpirationDurationInSeconds = Double

type SingleSignOnUserIdentifier = java.lang.String

type SnsTopicArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type SortActionsBy = _SortActionsBy | java.lang.String

type SortArtifactsBy = typingsJapgolly.awsSdk.awsSdkStrings.CreationTime | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SourceArn
  - typingsJapgolly.awsSdk.awsSdkStrings.DestinationArn
  - typingsJapgolly.awsSdk.awsSdkStrings.SourceType
  - typingsJapgolly.awsSdk.awsSdkStrings.DestinationType
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type SortAssociationsBy = _SortAssociationsBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - java.lang.String
*/
type SortBy = _SortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type SortContextsBy = _SortContextsBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type SortExperimentsBy = _SortExperimentsBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type SortLineageGroupsBy = _SortLineageGroupsBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.PipelineExecutionArn
  - java.lang.String
*/
type SortPipelineExecutionsBy = _SortPipelineExecutionsBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type SortPipelinesBy = _SortPipelinesBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type SortTrialComponentsBy = _SortTrialComponentsBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type SortTrialsBy = _SortTrialsBy | java.lang.String

type SourceAlgorithmList = js.Array[SourceAlgorithm]

type SourceType = java.lang.String

type SourceUri = java.lang.String

type SpawnRate = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - typingsJapgolly.awsSdk.awsSdkStrings.Line_
  - typingsJapgolly.awsSdk.awsSdkStrings.RecordIO
  - typingsJapgolly.awsSdk.awsSdkStrings.TFRecord
  - java.lang.String
*/
type SplitType = _SplitType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.READYTODEPLOY
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
  - typingsJapgolly.awsSdk.awsSdkStrings.INPROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type StageStatus = _StageStatus | java.lang.String

type StatusDetails = java.lang.String

type StatusMessage = java.lang.String

type StepDescription = java.lang.String

type StepDisplayName = java.lang.String

type StepName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Starting_
  - typingsJapgolly.awsSdk.awsSdkStrings.Executing_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - java.lang.String
*/
type StepStatus = _StepStatus | java.lang.String

type String = java.lang.String

type String1024 = java.lang.String

type String128 = java.lang.String

type String200 = java.lang.String

type String2048 = java.lang.String

type String256 = java.lang.String

type String3072 = java.lang.String

type String40 = java.lang.String

type String64 = java.lang.String

type String8192 = java.lang.String

type StringParameterValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JupyterServer
  - typingsJapgolly.awsSdk.awsSdkStrings.KernelGateway
  - java.lang.String
*/
type StudioLifecycleConfigAppType = _StudioLifecycleConfigAppType | java.lang.String

type StudioLifecycleConfigArn = java.lang.String

type StudioLifecycleConfigContent = java.lang.String

type StudioLifecycleConfigName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.LastModifiedTime
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - java.lang.String
*/
type StudioLifecycleConfigSortKey = _StudioLifecycleConfigSortKey | java.lang.String

type StudioLifecycleConfigsList = js.Array[StudioLifecycleConfigDetails]

type SubnetId = java.lang.String

type Subnets = js.Array[SubnetId]

type SubscribedWorkteams = js.Array[SubscribedWorkteam]

type Success = scala.Boolean

type TableName = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TargetAttributeName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.lambda__
  - typingsJapgolly.awsSdk.awsSdkStrings.ml_m4
  - typingsJapgolly.awsSdk.awsSdkStrings.ml_m5
  - typingsJapgolly.awsSdk.awsSdkStrings.ml_c4
  - typingsJapgolly.awsSdk.awsSdkStrings.ml_c5
  - typingsJapgolly.awsSdk.awsSdkStrings.ml_p2
  - typingsJapgolly.awsSdk.awsSdkStrings.ml_p3
  - typingsJapgolly.awsSdk.awsSdkStrings.ml_g4dn
  - typingsJapgolly.awsSdk.awsSdkStrings.ml_inf1
  - typingsJapgolly.awsSdk.awsSdkStrings.ml_eia2
  - typingsJapgolly.awsSdk.awsSdkStrings.jetson_tx1
  - typingsJapgolly.awsSdk.awsSdkStrings.jetson_tx2
  - typingsJapgolly.awsSdk.awsSdkStrings.jetson_nano
  - typingsJapgolly.awsSdk.awsSdkStrings.jetson_xavier
  - typingsJapgolly.awsSdk.awsSdkStrings.rasp3b
  - typingsJapgolly.awsSdk.awsSdkStrings.imx8qm
  - typingsJapgolly.awsSdk.awsSdkStrings.deeplens
  - typingsJapgolly.awsSdk.awsSdkStrings.rk3399
  - typingsJapgolly.awsSdk.awsSdkStrings.rk3288
  - typingsJapgolly.awsSdk.awsSdkStrings.aisage
  - typingsJapgolly.awsSdk.awsSdkStrings.sbe_c
  - typingsJapgolly.awsSdk.awsSdkStrings.qcs605
  - typingsJapgolly.awsSdk.awsSdkStrings.qcs603
  - typingsJapgolly.awsSdk.awsSdkStrings.sitara_am57x
  - typingsJapgolly.awsSdk.awsSdkStrings.amba_cv2
  - typingsJapgolly.awsSdk.awsSdkStrings.amba_cv22
  - typingsJapgolly.awsSdk.awsSdkStrings.amba_cv25
  - typingsJapgolly.awsSdk.awsSdkStrings.x86_win32
  - typingsJapgolly.awsSdk.awsSdkStrings.x86_win64
  - typingsJapgolly.awsSdk.awsSdkStrings.coreml
  - typingsJapgolly.awsSdk.awsSdkStrings.jacinto_tda4vm
  - typingsJapgolly.awsSdk.awsSdkStrings.imx8mplus
  - java.lang.String
*/
type TargetDevice = _TargetDevice | java.lang.String

type TargetObjectiveMetricValue = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INTEL_GRAPHICS
  - typingsJapgolly.awsSdk.awsSdkStrings.MALI
  - typingsJapgolly.awsSdk.awsSdkStrings.NVIDIA
  - typingsJapgolly.awsSdk.awsSdkStrings.NNA
  - java.lang.String
*/
type TargetPlatformAccelerator = _TargetPlatformAccelerator | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.X86_64
  - typingsJapgolly.awsSdk.awsSdkStrings.X86
  - typingsJapgolly.awsSdk.awsSdkStrings.ARM64
  - typingsJapgolly.awsSdk.awsSdkStrings.ARM_EABI
  - typingsJapgolly.awsSdk.awsSdkStrings.ARM_EABIHF
  - java.lang.String
*/
type TargetPlatformArch = _TargetPlatformArch | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ANDROID
  - typingsJapgolly.awsSdk.awsSdkStrings.LINUX
  - java.lang.String
*/
type TargetPlatformOs = _TargetPlatformOs | java.lang.String

type TaskAvailabilityLifetimeInSeconds = Double

type TaskCount = Double

type TaskDescription = java.lang.String

type TaskInput = java.lang.String

type TaskKeyword = java.lang.String

type TaskKeywords = js.Array[TaskKeyword]

type TaskTimeLimitInSeconds = Double

type TaskTitle = java.lang.String

type TemplateContent = java.lang.String

type TemplateContentSha256 = java.lang.String

type TemplateUrl = java.lang.String

type TenthFractionsOfACent = Double

type TerminationWaitInSeconds = Double

type ThingName = java.lang.String

type Timestamp = js.Date

type TrafficDurationInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL_AT_ONCE
  - typingsJapgolly.awsSdk.awsSdkStrings.CANARY
  - typingsJapgolly.awsSdk.awsSdkStrings.LINEAR
  - java.lang.String
*/
type TrafficRoutingConfigType = _TrafficRoutingConfigType | java.lang.String

type TrafficType = PHASES | java.lang.String

type TrainingEnvironmentKey = java.lang.String

type TrainingEnvironmentMap = StringDictionary[TrainingEnvironmentValue]

type TrainingEnvironmentValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pipe
  - typingsJapgolly.awsSdk.awsSdkStrings.File_
  - typingsJapgolly.awsSdk.awsSdkStrings.FastFile
  - java.lang.String
*/
type TrainingInputMode = _TrainingInputMode | java.lang.String

type TrainingInstanceCount = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3dnDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp4dDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5nDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5nDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5nDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5nDot9xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5nDot18xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg5Dot48xlarge
  - java.lang.String
*/
type TrainingInstanceType = _TrainingInstanceType | java.lang.String

type TrainingInstanceTypes = js.Array[TrainingInstanceType]

type TrainingJobArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Off_
  - typingsJapgolly.awsSdk.awsSdkStrings.Auto_
  - java.lang.String
*/
type TrainingJobEarlyStoppingType = _TrainingJobEarlyStoppingType | java.lang.String

type TrainingJobName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.Status_
  - typingsJapgolly.awsSdk.awsSdkStrings.FinalObjectiveMetricValue
  - java.lang.String
*/
type TrainingJobSortByOptions = _TrainingJobSortByOptions | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type TrainingJobStatus = _TrainingJobStatus | java.lang.String

type TrainingJobStatusCounter = Double

type TrainingJobSummaries = js.Array[TrainingJobSummary]

type TrainingTimeInSeconds = Double

type TransformEnvironmentKey = java.lang.String

type TransformEnvironmentMap = StringDictionary[TransformEnvironmentValue]

type TransformEnvironmentValue = java.lang.String

type TransformInstanceCount = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot16xlarge
  - java.lang.String
*/
type TransformInstanceType = _TransformInstanceType | java.lang.String

type TransformInstanceTypes = js.Array[TransformInstanceType]

type TransformJobArn = java.lang.String

type TransformJobName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type TransformJobStatus = _TransformJobStatus | java.lang.String

type TransformJobSummaries = js.Array[TransformJobSummary]

type TrialArn = java.lang.String

type TrialComponentArn = java.lang.String

type TrialComponentArtifactValue = java.lang.String

type TrialComponentArtifacts = StringDictionary[TrialComponentArtifact]

type TrialComponentKey256 = java.lang.String

type TrialComponentKey64 = java.lang.String

type TrialComponentMetricSummaries = js.Array[TrialComponentMetricSummary]

type TrialComponentParameters = StringDictionary[TrialComponentParameterValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type TrialComponentPrimaryStatus = _TrialComponentPrimaryStatus | java.lang.String

type TrialComponentSimpleSummaries = js.Array[TrialComponentSimpleSummary]

type TrialComponentSourceArn = java.lang.String

type TrialComponentStatusMessage = java.lang.String

type TrialComponentSummaries = js.Array[TrialComponentSummary]

type TrialSourceArn = java.lang.String

type TrialSummaries = js.Array[TrialSummary]

type Url = java.lang.String

type UserProfileArn = java.lang.String

type UserProfileList = js.Array[UserProfileDetails]

type UserProfileName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - typingsJapgolly.awsSdk.awsSdkStrings.LastModifiedTime
  - java.lang.String
*/
type UserProfileSortKey = _UserProfileSortKey | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.InService
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Updating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Update_Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Delete_Failed_
  - java.lang.String
*/
type UserProfileStatus = _UserProfileStatus | java.lang.String

type ValidationFraction = Double

type VariantName = java.lang.String

type VariantPropertyList = js.Array[VariantProperty]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DesiredInstanceCount
  - typingsJapgolly.awsSdk.awsSdkStrings.DesiredWeight
  - typingsJapgolly.awsSdk.awsSdkStrings.DataCaptureConfig
  - java.lang.String
*/
type VariantPropertyType = _VariantPropertyType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Updating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.ActivatingTraffic
  - typingsJapgolly.awsSdk.awsSdkStrings.Baking_
  - java.lang.String
*/
type VariantStatus = _VariantStatus | java.lang.String

type VariantStatusMessage = java.lang.String

type VariantWeight = Double

type VersionId = java.lang.String

type VersionedArnOrName = java.lang.String

type Vertices = js.Array[Vertex]

type VolumeSizeInGB = Double

type VpcId = java.lang.String

type VpcSecurityGroupIds = js.Array[SecurityGroupId]

type WaitIntervalInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Available_
  - typingsJapgolly.awsSdk.awsSdkStrings.Terminated_
  - typingsJapgolly.awsSdk.awsSdkStrings.Reused
  - typingsJapgolly.awsSdk.awsSdkStrings.InUse
  - java.lang.String
*/
type WarmPoolResourceStatus = _WarmPoolResourceStatus | java.lang.String

type WorkforceArn = java.lang.String

type WorkforceFailureReason = java.lang.String

type WorkforceName = java.lang.String

type WorkforceSecurityGroupId = java.lang.String

type WorkforceSecurityGroupIds = js.Array[WorkforceSecurityGroupId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Initializing_
  - typingsJapgolly.awsSdk.awsSdkStrings.Updating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - java.lang.String
*/
type WorkforceStatus = _WorkforceStatus | java.lang.String

type WorkforceSubnetId = java.lang.String

type WorkforceSubnets = js.Array[WorkforceSubnetId]

type WorkforceVpcEndpointId = java.lang.String

type WorkforceVpcId = java.lang.String

type Workforces = js.Array[Workforce]

type WorkteamArn = java.lang.String

type WorkteamName = java.lang.String

type Workteams = js.Array[Workteam]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-07-24`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
