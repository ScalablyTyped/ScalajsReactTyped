package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sagemakerMod {
  type Accept = java.lang.String
  type AccountId = java.lang.String
  type AdditionalCodeRepositoryNamesOrUrls = js.Array[typingsJapgolly.awsSdk.sagemakerMod.CodeRepositoryNameOrUrl]
  type AlgorithmArn = java.lang.String
  type AlgorithmImage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type AlgorithmSortBy = typingsJapgolly.awsSdk.sagemakerMod._AlgorithmSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type AlgorithmStatus = typingsJapgolly.awsSdk.sagemakerMod._AlgorithmStatus | java.lang.String
  type AlgorithmStatusItemList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.AlgorithmStatusItem]
  type AlgorithmSummaryList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.AlgorithmSummary]
  type AlgorithmValidationProfiles = js.Array[typingsJapgolly.awsSdk.sagemakerMod.AlgorithmValidationProfile]
  type AppArn = java.lang.String
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
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDotg4dnDot16xlarge
    - java.lang.String
  */
  type AppInstanceType = typingsJapgolly.awsSdk.sagemakerMod._AppInstanceType | java.lang.String
  type AppList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.AppDetails]
  type AppName = java.lang.String
  type AppSortKey = typingsJapgolly.awsSdk.awsSdkStrings.CreationTime | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.InService
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - java.lang.String
  */
  type AppStatus = typingsJapgolly.awsSdk.sagemakerMod._AppStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.JupyterServer
    - typingsJapgolly.awsSdk.awsSdkStrings.KernelGateway
    - typingsJapgolly.awsSdk.awsSdkStrings.TensorBoard
    - java.lang.String
  */
  type AppType = typingsJapgolly.awsSdk.sagemakerMod._AppType | java.lang.String
  type ArnOrName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.None_
    - typingsJapgolly.awsSdk.awsSdkStrings.Line_
    - java.lang.String
  */
  type AssemblyType = typingsJapgolly.awsSdk.sagemakerMod._AssemblyType | java.lang.String
  type AttributeName = java.lang.String
  type AttributeNames = js.Array[typingsJapgolly.awsSdk.sagemakerMod.AttributeName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SSO
    - typingsJapgolly.awsSdk.awsSdkStrings.IAM
    - java.lang.String
  */
  type AuthMode = typingsJapgolly.awsSdk.sagemakerMod._AuthMode | java.lang.String
  type AutoMLCandidates = js.Array[typingsJapgolly.awsSdk.sagemakerMod.AutoMLCandidate]
  type AutoMLContainerDefinitions = js.Array[typingsJapgolly.awsSdk.sagemakerMod.AutoMLContainerDefinition]
  type AutoMLFailureReason = java.lang.String
  type AutoMLInputDataConfig = js.Array[typingsJapgolly.awsSdk.sagemakerMod.AutoMLChannel]
  type AutoMLJobArn = java.lang.String
  type AutoMLJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Maximize
    - typingsJapgolly.awsSdk.awsSdkStrings.Minimize
    - java.lang.String
  */
  type AutoMLJobObjectiveType = typingsJapgolly.awsSdk.sagemakerMod._AutoMLJobObjectiveType | java.lang.String
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
    - java.lang.String
  */
  type AutoMLJobSecondaryStatus = typingsJapgolly.awsSdk.sagemakerMod._AutoMLJobSecondaryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
    - java.lang.String
  */
  type AutoMLJobStatus = typingsJapgolly.awsSdk.sagemakerMod._AutoMLJobStatus | java.lang.String
  type AutoMLJobSummaries = js.Array[typingsJapgolly.awsSdk.sagemakerMod.AutoMLJobSummary]
  type AutoMLMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Accuracy
    - typingsJapgolly.awsSdk.awsSdkStrings.MSE
    - typingsJapgolly.awsSdk.awsSdkStrings.F1
    - typingsJapgolly.awsSdk.awsSdkStrings.F1macro
    - java.lang.String
  */
  type AutoMLMetricEnum = typingsJapgolly.awsSdk.sagemakerMod._AutoMLMetricEnum | java.lang.String
  type AutoMLNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ManifestFile
    - typingsJapgolly.awsSdk.awsSdkStrings.S3Prefix
    - java.lang.String
  */
  type AutoMLS3DataType = typingsJapgolly.awsSdk.sagemakerMod._AutoMLS3DataType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type AutoMLSortBy = typingsJapgolly.awsSdk.sagemakerMod._AutoMLSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type AutoMLSortOrder = typingsJapgolly.awsSdk.sagemakerMod._AutoMLSortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSSlashRekognitionSlashDetectModerationLabelsSlashImageSlashV3
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSSlashTextractSlashAnalyzeDocumentSlashFormsSlashV1
    - java.lang.String
  */
  type AwsManagedHumanLoopRequestSource = typingsJapgolly.awsSdk.sagemakerMod._AwsManagedHumanLoopRequestSource | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MultiRecord
    - typingsJapgolly.awsSdk.awsSdkStrings.SingleRecord
    - java.lang.String
  */
  type BatchStrategy = typingsJapgolly.awsSdk.sagemakerMod._BatchStrategy | java.lang.String
  type BillableTimeInSeconds = scala.Double
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.And_
    - typingsJapgolly.awsSdk.awsSdkStrings.Or_
    - java.lang.String
  */
  type BooleanOperator = typingsJapgolly.awsSdk.sagemakerMod._BooleanOperator | java.lang.String
  type Branch = java.lang.String
  type CandidateDefinitionNotebookLocation = java.lang.String
  type CandidateName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - typingsJapgolly.awsSdk.awsSdkStrings.FinalObjectiveMetricValue
    - java.lang.String
  */
  type CandidateSortBy = typingsJapgolly.awsSdk.sagemakerMod._CandidateSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
    - java.lang.String
  */
  type CandidateStatus = typingsJapgolly.awsSdk.sagemakerMod._CandidateStatus | java.lang.String
  type CandidateStepArn = java.lang.String
  type CandidateStepName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonTrainingJob
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonTransformJob
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonProcessingJob
    - java.lang.String
  */
  type CandidateStepType = typingsJapgolly.awsSdk.sagemakerMod._CandidateStepType | java.lang.String
  type CandidateSteps = js.Array[typingsJapgolly.awsSdk.sagemakerMod.AutoMLCandidateStep]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Input_
    - typingsJapgolly.awsSdk.awsSdkStrings.Output_
    - java.lang.String
  */
  type CaptureMode = typingsJapgolly.awsSdk.sagemakerMod._CaptureMode | java.lang.String
  type CaptureOptionList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.CaptureOption]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Started_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type CaptureStatus = typingsJapgolly.awsSdk.sagemakerMod._CaptureStatus | java.lang.String
  type CategoricalParameterRanges = js.Array[typingsJapgolly.awsSdk.sagemakerMod.CategoricalParameterRange]
  type Cents = scala.Double
  type CertifyForMarketplace = scala.Boolean
  type ChannelName = java.lang.String
  type ChannelSpecifications = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ChannelSpecification]
  type Cidr = java.lang.String
  type Cidrs = js.Array[typingsJapgolly.awsSdk.sagemakerMod.Cidr]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.sagemakerMod.ClientApiVersions
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
  type CodeRepositorySortBy = typingsJapgolly.awsSdk.sagemakerMod._CodeRepositorySortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type CodeRepositorySortOrder = typingsJapgolly.awsSdk.sagemakerMod._CodeRepositorySortOrder | java.lang.String
  type CodeRepositorySummaryList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.CodeRepositorySummary]
  type CognitoClientId = java.lang.String
  type CognitoUserGroup = java.lang.String
  type CognitoUserPool = java.lang.String
  type CollectionConfigurations = js.Array[typingsJapgolly.awsSdk.sagemakerMod.CollectionConfiguration]
  type CollectionName = java.lang.String
  type CollectionParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sagemakerMod.ConfigValue]
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
  type CompilationJobStatus = typingsJapgolly.awsSdk.sagemakerMod._CompilationJobStatus | java.lang.String
  type CompilationJobSummaries = js.Array[typingsJapgolly.awsSdk.sagemakerMod.CompilationJobSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.None_
    - typingsJapgolly.awsSdk.awsSdkStrings.Gzip_
    - java.lang.String
  */
  type CompressionType = typingsJapgolly.awsSdk.sagemakerMod._CompressionType | java.lang.String
  type CompressionTypes = js.Array[typingsJapgolly.awsSdk.sagemakerMod.CompressionType]
  type ConfigKey = java.lang.String
  type ConfigValue = java.lang.String
  type ContainerArgument = java.lang.String
  type ContainerArguments = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ContainerArgument]
  type ContainerDefinitionList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ContainerDefinition]
  type ContainerEntrypoint = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ContainerEntrypointString]
  type ContainerEntrypointString = java.lang.String
  type ContainerHostname = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SingleModel
    - typingsJapgolly.awsSdk.awsSdkStrings.MultiModel
    - java.lang.String
  */
  type ContainerMode = typingsJapgolly.awsSdk.sagemakerMod._ContainerMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typingsJapgolly.awsSdk.awsSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = typingsJapgolly.awsSdk.sagemakerMod._ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ContentClassifier]
  type ContentType = java.lang.String
  type ContentTypes = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ContentType]
  type ContinuousParameterRanges = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ContinuousParameterRange]
  type CreationTime = js.Date
  type CsvContentType = java.lang.String
  type CsvContentTypes = js.Array[typingsJapgolly.awsSdk.sagemakerMod.CsvContentType]
  type DataExplorationNotebookLocation = java.lang.String
  type DataInputConfig = java.lang.String
  type DebugRuleConfigurations = js.Array[typingsJapgolly.awsSdk.sagemakerMod.DebugRuleConfiguration]
  type DebugRuleEvaluationStatuses = js.Array[typingsJapgolly.awsSdk.sagemakerMod.DebugRuleEvaluationStatus]
  type DeployedImages = js.Array[typingsJapgolly.awsSdk.sagemakerMod.DeployedImage]
  type DesiredWeightAndCapacityList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.DesiredWeightAndCapacity]
  type DestinationS3Uri = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NotStarted
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DetailedAlgorithmStatus = typingsJapgolly.awsSdk.sagemakerMod._DetailedAlgorithmStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NotStarted
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DetailedModelPackageStatus = typingsJapgolly.awsSdk.sagemakerMod._DetailedModelPackageStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type DirectInternetAccess = typingsJapgolly.awsSdk.sagemakerMod._DirectInternetAccess | java.lang.String
  type DirectoryPath = java.lang.String
  type DisassociateAdditionalCodeRepositories = scala.Boolean
  type DisassociateDefaultCodeRepository = scala.Boolean
  type DisassociateNotebookInstanceAcceleratorTypes = scala.Boolean
  type DisassociateNotebookInstanceLifecycleConfig = scala.Boolean
  type Dollars = scala.Double
  type DomainArn = java.lang.String
  type DomainId = java.lang.String
  type DomainList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.DomainDetails]
  type DomainName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.InService
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - java.lang.String
  */
  type DomainStatus = typingsJapgolly.awsSdk.sagemakerMod._DomainStatus | java.lang.String
  type DoubleParameterValue = scala.Double
  type EfsUid = java.lang.String
  type EnableCapture = scala.Boolean
  type EndpointArn = java.lang.String
  type EndpointConfigArn = java.lang.String
  type EndpointConfigName = java.lang.String
  type EndpointConfigNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type EndpointConfigSortKey = typingsJapgolly.awsSdk.sagemakerMod._EndpointConfigSortKey | java.lang.String
  type EndpointConfigSummaryList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.EndpointConfigSummary]
  type EndpointName = java.lang.String
  type EndpointNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type EndpointSortKey = typingsJapgolly.awsSdk.sagemakerMod._EndpointSortKey | java.lang.String
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
  type EndpointStatus = typingsJapgolly.awsSdk.sagemakerMod._EndpointStatus | java.lang.String
  type EndpointSummaryList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.EndpointSummary]
  type EntityDescription = java.lang.String
  type EntityName = java.lang.String
  type EnvironmentArn = java.lang.String
  type EnvironmentKey = java.lang.String
  type EnvironmentMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sagemakerMod.EnvironmentValue]
  type EnvironmentValue = java.lang.String
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
  type ExecutionStatus = typingsJapgolly.awsSdk.sagemakerMod._ExecutionStatus | java.lang.String
  type ExitMessage = java.lang.String
  type ExperimentArn = java.lang.String
  type ExperimentConfigName = java.lang.String
  type ExperimentDescription = java.lang.String
  type ExperimentEntityName = java.lang.String
  type ExperimentSourceArn = java.lang.String
  type ExperimentSummaries = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ExperimentSummary]
  type FailureReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.rw_
    - typingsJapgolly.awsSdk.awsSdkStrings.ro_
    - java.lang.String
  */
  type FileSystemAccessMode = typingsJapgolly.awsSdk.sagemakerMod._FileSystemAccessMode | java.lang.String
  type FileSystemId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EFS
    - typingsJapgolly.awsSdk.awsSdkStrings.FSxLustre
    - java.lang.String
  */
  type FileSystemType = typingsJapgolly.awsSdk.sagemakerMod._FileSystemType | java.lang.String
  type FilterList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.Filter]
  type FilterValue = java.lang.String
  type FinalMetricDataList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.MetricData]
  type Float = scala.Double
  type FlowDefinitionArn = java.lang.String
  type FlowDefinitionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Initializing_
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
    - java.lang.String
  */
  type FlowDefinitionStatus = typingsJapgolly.awsSdk.sagemakerMod._FlowDefinitionStatus | java.lang.String
  type FlowDefinitionSummaries = js.Array[typingsJapgolly.awsSdk.sagemakerMod.FlowDefinitionSummary]
  type FlowDefinitionTaskAvailabilityLifetimeInSeconds = scala.Double
  type FlowDefinitionTaskCount = scala.Double
  type FlowDefinitionTaskDescription = java.lang.String
  type FlowDefinitionTaskKeyword = java.lang.String
  type FlowDefinitionTaskKeywords = js.Array[typingsJapgolly.awsSdk.sagemakerMod.FlowDefinitionTaskKeyword]
  type FlowDefinitionTaskTimeLimitInSeconds = scala.Double
  type FlowDefinitionTaskTitle = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TENSORFLOW
    - typingsJapgolly.awsSdk.awsSdkStrings.KERAS
    - typingsJapgolly.awsSdk.awsSdkStrings.MXNET
    - typingsJapgolly.awsSdk.awsSdkStrings.ONNX
    - typingsJapgolly.awsSdk.awsSdkStrings.PYTORCH
    - typingsJapgolly.awsSdk.awsSdkStrings.XGBOOST
    - java.lang.String
  */
  type Framework = typingsJapgolly.awsSdk.sagemakerMod._Framework | java.lang.String
  type GenerateCandidateDefinitionsOnly = scala.Boolean
  type GitConfigUrl = java.lang.String
  type HookParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sagemakerMod.ConfigValue]
  type HumanLoopActivationConditions = java.lang.String
  type HumanTaskUiArn = java.lang.String
  type HumanTaskUiName = java.lang.String
  type HumanTaskUiSummaries = js.Array[typingsJapgolly.awsSdk.sagemakerMod.HumanTaskUiSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Auto_
    - typingsJapgolly.awsSdk.awsSdkStrings.Linear_
    - typingsJapgolly.awsSdk.awsSdkStrings.Logarithmic
    - typingsJapgolly.awsSdk.awsSdkStrings.ReverseLogarithmic
    - java.lang.String
  */
  type HyperParameterScalingType = typingsJapgolly.awsSdk.sagemakerMod._HyperParameterScalingType | java.lang.String
  type HyperParameterSpecifications = js.Array[typingsJapgolly.awsSdk.sagemakerMod.HyperParameterSpecification]
  type HyperParameterTrainingJobDefinitionName = java.lang.String
  type HyperParameterTrainingJobDefinitions = js.Array[typingsJapgolly.awsSdk.sagemakerMod.HyperParameterTrainingJobDefinition]
  type HyperParameterTrainingJobSummaries = js.Array[typingsJapgolly.awsSdk.sagemakerMod.HyperParameterTrainingJobSummary]
  type HyperParameterTuningJobArn = java.lang.String
  type HyperParameterTuningJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Maximize
    - typingsJapgolly.awsSdk.awsSdkStrings.Minimize
    - java.lang.String
  */
  type HyperParameterTuningJobObjectiveType = typingsJapgolly.awsSdk.sagemakerMod._HyperParameterTuningJobObjectiveType | java.lang.String
  type HyperParameterTuningJobObjectives = js.Array[typingsJapgolly.awsSdk.sagemakerMod.HyperParameterTuningJobObjective]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type HyperParameterTuningJobSortByOptions = typingsJapgolly.awsSdk.sagemakerMod._HyperParameterTuningJobSortByOptions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
    - java.lang.String
  */
  type HyperParameterTuningJobStatus = typingsJapgolly.awsSdk.sagemakerMod._HyperParameterTuningJobStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Bayesian
    - typingsJapgolly.awsSdk.awsSdkStrings.Random
    - java.lang.String
  */
  type HyperParameterTuningJobStrategyType = typingsJapgolly.awsSdk.sagemakerMod._HyperParameterTuningJobStrategyType | java.lang.String
  type HyperParameterTuningJobSummaries = js.Array[typingsJapgolly.awsSdk.sagemakerMod.HyperParameterTuningJobSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IdenticalDataAndAlgorithm
    - typingsJapgolly.awsSdk.awsSdkStrings.TransferLearning
    - java.lang.String
  */
  type HyperParameterTuningJobWarmStartType = typingsJapgolly.awsSdk.sagemakerMod._HyperParameterTuningJobWarmStartType | java.lang.String
  type HyperParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sagemakerMod.ParameterValue]
  type Image = java.lang.String
  type ImageDigest = java.lang.String
  type ImageUri = java.lang.String
  type InputDataConfig = js.Array[typingsJapgolly.awsSdk.sagemakerMod.Channel]
  type InputModes = js.Array[typingsJapgolly.awsSdk.sagemakerMod.TrainingInputMode]
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
    - java.lang.String
  */
  type InstanceType = typingsJapgolly.awsSdk.sagemakerMod._InstanceType | java.lang.String
  type IntegerParameterRanges = js.Array[typingsJapgolly.awsSdk.sagemakerMod.IntegerParameterRange]
  type JobReferenceCode = java.lang.String
  type JobReferenceCodeContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Input_
    - typingsJapgolly.awsSdk.awsSdkStrings.None_
    - java.lang.String
  */
  type JoinSource = typingsJapgolly.awsSdk.sagemakerMod._JoinSource | java.lang.String
  type JsonContentType = java.lang.String
  type JsonContentTypes = js.Array[typingsJapgolly.awsSdk.sagemakerMod.JsonContentType]
  type JsonPath = java.lang.String
  type KmsKeyId = java.lang.String
  type LabelAttributeName = java.lang.String
  type LabelCounter = scala.Double
  type LabelingJobAlgorithmSpecificationArn = java.lang.String
  type LabelingJobArn = java.lang.String
  type LabelingJobForWorkteamSummaryList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.LabelingJobForWorkteamSummary]
  type LabelingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type LabelingJobStatus = typingsJapgolly.awsSdk.sagemakerMod._LabelingJobStatus | java.lang.String
  type LabelingJobSummaryList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.LabelingJobSummary]
  type LambdaFunctionArn = java.lang.String
  type LastModifiedTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type ListCompilationJobsSortBy = typingsJapgolly.awsSdk.sagemakerMod._ListCompilationJobsSortBy | java.lang.String
  type ListLabelingJobsForWorkteamSortByOptions = typingsJapgolly.awsSdk.awsSdkStrings.CreationTime | java.lang.String
  type ListTagsMaxResults = scala.Double
  type ListTrialComponentKey256 = js.Array[typingsJapgolly.awsSdk.sagemakerMod.TrialComponentKey256]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateDate
    - java.lang.String
  */
  type ListWorkteamsSortByOptions = typingsJapgolly.awsSdk.sagemakerMod._ListWorkteamsSortByOptions | java.lang.String
  type MaxAutoMLJobRuntimeInSeconds = scala.Double
  type MaxCandidates = scala.Double
  type MaxConcurrentTaskCount = scala.Double
  type MaxConcurrentTransforms = scala.Double
  type MaxHumanLabeledObjectCount = scala.Double
  type MaxNumberOfTrainingJobs = scala.Double
  type MaxParallelTrainingJobs = scala.Double
  type MaxPayloadInMB = scala.Double
  type MaxPercentageOfInputDatasetLabeled = scala.Double
  type MaxResults = scala.Double
  type MaxRuntimeInSeconds = scala.Double
  type MaxRuntimePerTrainingJobInSeconds = scala.Double
  type MaxWaitTimeInSeconds = scala.Double
  type MediaType = java.lang.String
  type MemberDefinitions = js.Array[typingsJapgolly.awsSdk.sagemakerMod.MemberDefinition]
  type MetricDefinitionList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.MetricDefinition]
  type MetricName = java.lang.String
  type MetricRegex = java.lang.String
  type MetricValue = scala.Double
  type ModelArn = java.lang.String
  type ModelName = java.lang.String
  type ModelNameContains = java.lang.String
  type ModelPackageArn = java.lang.String
  type ModelPackageContainerDefinitionList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ModelPackageContainerDefinition]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type ModelPackageSortBy = typingsJapgolly.awsSdk.sagemakerMod._ModelPackageSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type ModelPackageStatus = typingsJapgolly.awsSdk.sagemakerMod._ModelPackageStatus | java.lang.String
  type ModelPackageStatusItemList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ModelPackageStatusItem]
  type ModelPackageSummaryList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ModelPackageSummary]
  type ModelPackageValidationProfiles = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ModelPackageValidationProfile]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type ModelSortKey = typingsJapgolly.awsSdk.sagemakerMod._ModelSortKey | java.lang.String
  type ModelSummaryList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ModelSummary]
  type MonitoringContainerArguments = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ContainerArgument]
  type MonitoringEnvironmentMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sagemakerMod.ProcessingEnvironmentValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - typingsJapgolly.awsSdk.awsSdkStrings.ScheduledTime
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type MonitoringExecutionSortKey = typingsJapgolly.awsSdk.sagemakerMod._MonitoringExecutionSortKey | java.lang.String
  type MonitoringExecutionSummaryList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.MonitoringExecutionSummary]
  type MonitoringInputs = js.Array[typingsJapgolly.awsSdk.sagemakerMod.MonitoringInput]
  type MonitoringMaxRuntimeInSeconds = scala.Double
  type MonitoringOutputs = js.Array[typingsJapgolly.awsSdk.sagemakerMod.MonitoringOutput]
  type MonitoringS3Uri = java.lang.String
  type MonitoringScheduleArn = java.lang.String
  type MonitoringScheduleName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type MonitoringScheduleSortKey = typingsJapgolly.awsSdk.sagemakerMod._MonitoringScheduleSortKey | java.lang.String
  type MonitoringScheduleSummaryList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.MonitoringScheduleSummary]
  type NameContains = java.lang.String
  type NestedFiltersList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.NestedFilters]
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
  type NotebookInstanceAcceleratorType = typingsJapgolly.awsSdk.sagemakerMod._NotebookInstanceAcceleratorType | java.lang.String
  type NotebookInstanceAcceleratorTypes = js.Array[typingsJapgolly.awsSdk.sagemakerMod.NotebookInstanceAcceleratorType]
  type NotebookInstanceArn = java.lang.String
  type NotebookInstanceLifecycleConfigArn = java.lang.String
  type NotebookInstanceLifecycleConfigContent = java.lang.String
  type NotebookInstanceLifecycleConfigList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.NotebookInstanceLifecycleHook]
  type NotebookInstanceLifecycleConfigName = java.lang.String
  type NotebookInstanceLifecycleConfigNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - typingsJapgolly.awsSdk.awsSdkStrings.LastModifiedTime
    - java.lang.String
  */
  type NotebookInstanceLifecycleConfigSortKey = typingsJapgolly.awsSdk.sagemakerMod._NotebookInstanceLifecycleConfigSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type NotebookInstanceLifecycleConfigSortOrder = typingsJapgolly.awsSdk.sagemakerMod._NotebookInstanceLifecycleConfigSortOrder | java.lang.String
  type NotebookInstanceLifecycleConfigSummaryList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigSummary]
  type NotebookInstanceName = java.lang.String
  type NotebookInstanceNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type NotebookInstanceSortKey = typingsJapgolly.awsSdk.sagemakerMod._NotebookInstanceSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type NotebookInstanceSortOrder = typingsJapgolly.awsSdk.sagemakerMod._NotebookInstanceSortOrder | java.lang.String
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
  type NotebookInstanceStatus = typingsJapgolly.awsSdk.sagemakerMod._NotebookInstanceStatus | java.lang.String
  type NotebookInstanceSummaryList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.NotebookInstanceSummary]
  type NotebookInstanceUrl = java.lang.String
  type NotebookInstanceVolumeSizeInGB = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Allowed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type NotebookOutputOption = typingsJapgolly.awsSdk.sagemakerMod._NotebookOutputOption | java.lang.String
  type NotificationTopicArn = java.lang.String
  type NumberOfHumanWorkersPerDataObject = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type ObjectiveStatus = typingsJapgolly.awsSdk.sagemakerMod._ObjectiveStatus | java.lang.String
  type ObjectiveStatusCounter = scala.Double
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
    - java.lang.String
  */
  type Operator = typingsJapgolly.awsSdk.sagemakerMod._Operator | java.lang.String
  type OptionalDouble = scala.Double
  type OptionalInteger = scala.Double
  type OptionalVolumeSizeInGB = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type OrderKey = typingsJapgolly.awsSdk.sagemakerMod._OrderKey | java.lang.String
  type PaginationToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Integer_
    - typingsJapgolly.awsSdk.awsSdkStrings.Continuous_
    - typingsJapgolly.awsSdk.awsSdkStrings.Categorical
    - typingsJapgolly.awsSdk.awsSdkStrings.FreeText
    - java.lang.String
  */
  type ParameterType = typingsJapgolly.awsSdk.sagemakerMod._ParameterType | java.lang.String
  type ParameterValue = java.lang.String
  type ParameterValues = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ParameterValue]
  type ParentHyperParameterTuningJobs = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ParentHyperParameterTuningJob]
  type Parents = js.Array[typingsJapgolly.awsSdk.sagemakerMod.Parent]
  type PresignedDomainUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BinaryClassification
    - typingsJapgolly.awsSdk.awsSdkStrings.MulticlassClassification
    - typingsJapgolly.awsSdk.awsSdkStrings.Regression_
    - java.lang.String
  */
  type ProblemType = typingsJapgolly.awsSdk.sagemakerMod._ProblemType | java.lang.String
  type ProcessingEnvironmentKey = java.lang.String
  type ProcessingEnvironmentMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sagemakerMod.ProcessingEnvironmentValue]
  type ProcessingEnvironmentValue = java.lang.String
  type ProcessingInputs = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ProcessingInput]
  type ProcessingInstanceCount = scala.Double
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
    - java.lang.String
  */
  type ProcessingInstanceType = typingsJapgolly.awsSdk.sagemakerMod._ProcessingInstanceType | java.lang.String
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
  type ProcessingJobStatus = typingsJapgolly.awsSdk.sagemakerMod._ProcessingJobStatus | java.lang.String
  type ProcessingJobSummaries = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ProcessingJobSummary]
  type ProcessingLocalPath = java.lang.String
  type ProcessingMaxRuntimeInSeconds = scala.Double
  type ProcessingOutputs = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ProcessingOutput]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.None_
    - typingsJapgolly.awsSdk.awsSdkStrings.Gzip_
    - java.lang.String
  */
  type ProcessingS3CompressionType = typingsJapgolly.awsSdk.sagemakerMod._ProcessingS3CompressionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FullyReplicated
    - typingsJapgolly.awsSdk.awsSdkStrings.ShardedByS3Key
    - java.lang.String
  */
  type ProcessingS3DataDistributionType = typingsJapgolly.awsSdk.sagemakerMod._ProcessingS3DataDistributionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ManifestFile
    - typingsJapgolly.awsSdk.awsSdkStrings.S3Prefix
    - java.lang.String
  */
  type ProcessingS3DataType = typingsJapgolly.awsSdk.sagemakerMod._ProcessingS3DataType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pipe
    - typingsJapgolly.awsSdk.awsSdkStrings.File_
    - java.lang.String
  */
  type ProcessingS3InputMode = typingsJapgolly.awsSdk.sagemakerMod._ProcessingS3InputMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Continuous_
    - typingsJapgolly.awsSdk.awsSdkStrings.EndOfJob
    - java.lang.String
  */
  type ProcessingS3UploadMode = typingsJapgolly.awsSdk.sagemakerMod._ProcessingS3UploadMode | java.lang.String
  type ProcessingVolumeSizeInGB = scala.Double
  type ProductId = java.lang.String
  type ProductListings = js.Array[typingsJapgolly.awsSdk.sagemakerMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia1Dotmedium
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia1Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia1Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia2Dotmedium
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia2Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDoteia2Dotxlarge
    - java.lang.String
  */
  type ProductionVariantAcceleratorType = typingsJapgolly.awsSdk.sagemakerMod._ProductionVariantAcceleratorType | java.lang.String
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
    - java.lang.String
  */
  type ProductionVariantInstanceType = typingsJapgolly.awsSdk.sagemakerMod._ProductionVariantInstanceType | java.lang.String
  type ProductionVariantList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ProductionVariant]
  type ProductionVariantSummaryList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ProductionVariantSummary]
  type PropertyNameHint = java.lang.String
  type PropertyNameSuggestionList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.PropertyNameSuggestion]
  type RealtimeInferenceInstanceTypes = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ProductionVariantInstanceType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.None_
    - typingsJapgolly.awsSdk.awsSdkStrings.RecordIO
    - java.lang.String
  */
  type RecordWrapper = typingsJapgolly.awsSdk.sagemakerMod._RecordWrapper | java.lang.String
  type RenderingErrorList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.RenderingError]
  type ResourceArn = java.lang.String
  type ResourceId = java.lang.String
  type ResourcePropertyName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TrainingJob
    - typingsJapgolly.awsSdk.awsSdkStrings.Experiment
    - typingsJapgolly.awsSdk.awsSdkStrings.ExperimentTrial
    - typingsJapgolly.awsSdk.awsSdkStrings.ExperimentTrialComponent
    - java.lang.String
  */
  type ResourceType = typingsJapgolly.awsSdk.sagemakerMod._ResourceType | java.lang.String
  type ResponseMIMEType = java.lang.String
  type ResponseMIMETypes = js.Array[typingsJapgolly.awsSdk.sagemakerMod.ResponseMIMEType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Retain_
    - typingsJapgolly.awsSdk.awsSdkStrings.Delete_
    - java.lang.String
  */
  type RetentionType = typingsJapgolly.awsSdk.sagemakerMod._RetentionType | java.lang.String
  type RoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type RootAccess = typingsJapgolly.awsSdk.sagemakerMod._RootAccess | java.lang.String
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
  type RuleEvaluationStatus = typingsJapgolly.awsSdk.sagemakerMod._RuleEvaluationStatus | java.lang.String
  type RuleParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sagemakerMod.ConfigValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FullyReplicated
    - typingsJapgolly.awsSdk.awsSdkStrings.ShardedByS3Key
    - java.lang.String
  */
  type S3DataDistribution = typingsJapgolly.awsSdk.sagemakerMod._S3DataDistribution | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ManifestFile
    - typingsJapgolly.awsSdk.awsSdkStrings.S3Prefix
    - typingsJapgolly.awsSdk.awsSdkStrings.AugmentedManifestFile
    - java.lang.String
  */
  type S3DataType = typingsJapgolly.awsSdk.sagemakerMod._S3DataType | java.lang.String
  type S3Uri = java.lang.String
  type SamplingPercentage = scala.Double
  type ScheduleExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Scheduled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type ScheduleStatus = typingsJapgolly.awsSdk.sagemakerMod._ScheduleStatus | java.lang.String
  type SearchExpressionList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.SearchExpression]
  type SearchResultsList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.SearchRecord]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type SearchSortOrder = typingsJapgolly.awsSdk.sagemakerMod._SearchSortOrder | java.lang.String
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
    - java.lang.String
  */
  type SecondaryStatus = typingsJapgolly.awsSdk.sagemakerMod._SecondaryStatus | java.lang.String
  type SecondaryStatusTransitions = js.Array[typingsJapgolly.awsSdk.sagemakerMod.SecondaryStatusTransition]
  type SecretArn = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[typingsJapgolly.awsSdk.sagemakerMod.SecurityGroupId]
  type Seed = scala.Double
  type SessionExpirationDurationInSeconds = scala.Double
  type SingleSignOnUserIdentifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type SortBy = typingsJapgolly.awsSdk.sagemakerMod._SortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type SortExperimentsBy = typingsJapgolly.awsSdk.sagemakerMod._SortExperimentsBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type SortOrder = typingsJapgolly.awsSdk.sagemakerMod._SortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type SortTrialComponentsBy = typingsJapgolly.awsSdk.sagemakerMod._SortTrialComponentsBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type SortTrialsBy = typingsJapgolly.awsSdk.sagemakerMod._SortTrialsBy | java.lang.String
  type SourceAlgorithmList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.SourceAlgorithm]
  type SourceType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.None_
    - typingsJapgolly.awsSdk.awsSdkStrings.Line_
    - typingsJapgolly.awsSdk.awsSdkStrings.RecordIO
    - typingsJapgolly.awsSdk.awsSdkStrings.TFRecord
    - java.lang.String
  */
  type SplitType = typingsJapgolly.awsSdk.sagemakerMod._SplitType | java.lang.String
  type StatusDetails = java.lang.String
  type StatusMessage = java.lang.String
  type String = java.lang.String
  type String1024 = java.lang.String
  type String200 = java.lang.String
  type String256 = java.lang.String
  type StringParameterValue = java.lang.String
  type SubnetId = java.lang.String
  type Subnets = js.Array[typingsJapgolly.awsSdk.sagemakerMod.SubnetId]
  type SubscribedWorkteams = js.Array[typingsJapgolly.awsSdk.sagemakerMod.SubscribedWorkteam]
  type Success = scala.Boolean
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.Tag]
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
    - typingsJapgolly.awsSdk.awsSdkStrings.ml_inf1
    - typingsJapgolly.awsSdk.awsSdkStrings.jetson_tx1
    - typingsJapgolly.awsSdk.awsSdkStrings.jetson_tx2
    - typingsJapgolly.awsSdk.awsSdkStrings.jetson_nano
    - typingsJapgolly.awsSdk.awsSdkStrings.rasp3b
    - typingsJapgolly.awsSdk.awsSdkStrings.deeplens
    - typingsJapgolly.awsSdk.awsSdkStrings.rk3399
    - typingsJapgolly.awsSdk.awsSdkStrings.rk3288
    - typingsJapgolly.awsSdk.awsSdkStrings.aisage
    - typingsJapgolly.awsSdk.awsSdkStrings.sbe_c
    - typingsJapgolly.awsSdk.awsSdkStrings.qcs605
    - typingsJapgolly.awsSdk.awsSdkStrings.qcs603
    - java.lang.String
  */
  type TargetDevice = typingsJapgolly.awsSdk.sagemakerMod._TargetDevice | java.lang.String
  type TargetObjectiveMetricValue = scala.Double
  type TaskAvailabilityLifetimeInSeconds = scala.Double
  type TaskCount = scala.Double
  type TaskDescription = java.lang.String
  type TaskInput = java.lang.String
  type TaskKeyword = java.lang.String
  type TaskKeywords = js.Array[typingsJapgolly.awsSdk.sagemakerMod.TaskKeyword]
  type TaskTimeLimitInSeconds = scala.Double
  type TaskTitle = java.lang.String
  type TemplateContent = java.lang.String
  type TemplateContentSha256 = java.lang.String
  type TemplateUrl = java.lang.String
  type TenthFractionsOfACent = scala.Double
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pipe
    - typingsJapgolly.awsSdk.awsSdkStrings.File_
    - java.lang.String
  */
  type TrainingInputMode = typingsJapgolly.awsSdk.sagemakerMod._TrainingInputMode | java.lang.String
  type TrainingInstanceCount = scala.Double
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
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
    - java.lang.String
  */
  type TrainingInstanceType = typingsJapgolly.awsSdk.sagemakerMod._TrainingInstanceType | java.lang.String
  type TrainingInstanceTypes = js.Array[typingsJapgolly.awsSdk.sagemakerMod.TrainingInstanceType]
  type TrainingJobArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Off_
    - typingsJapgolly.awsSdk.awsSdkStrings.Auto_
    - java.lang.String
  */
  type TrainingJobEarlyStoppingType = typingsJapgolly.awsSdk.sagemakerMod._TrainingJobEarlyStoppingType | java.lang.String
  type TrainingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - typingsJapgolly.awsSdk.awsSdkStrings.FinalObjectiveMetricValue
    - java.lang.String
  */
  type TrainingJobSortByOptions = typingsJapgolly.awsSdk.sagemakerMod._TrainingJobSortByOptions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type TrainingJobStatus = typingsJapgolly.awsSdk.sagemakerMod._TrainingJobStatus | java.lang.String
  type TrainingJobStatusCounter = scala.Double
  type TrainingJobSummaries = js.Array[typingsJapgolly.awsSdk.sagemakerMod.TrainingJobSummary]
  type TrainingTimeInSeconds = scala.Double
  type TransformEnvironmentKey = java.lang.String
  type TransformEnvironmentMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sagemakerMod.TransformEnvironmentValue]
  type TransformEnvironmentValue = java.lang.String
  type TransformInstanceCount = scala.Double
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
    - java.lang.String
  */
  type TransformInstanceType = typingsJapgolly.awsSdk.sagemakerMod._TransformInstanceType | java.lang.String
  type TransformInstanceTypes = js.Array[typingsJapgolly.awsSdk.sagemakerMod.TransformInstanceType]
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
  type TransformJobStatus = typingsJapgolly.awsSdk.sagemakerMod._TransformJobStatus | java.lang.String
  type TransformJobSummaries = js.Array[typingsJapgolly.awsSdk.sagemakerMod.TransformJobSummary]
  type TrialArn = java.lang.String
  type TrialComponentArn = java.lang.String
  type TrialComponentArtifactValue = java.lang.String
  type TrialComponentArtifacts = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sagemakerMod.TrialComponentArtifact]
  type TrialComponentKey256 = java.lang.String
  type TrialComponentKey64 = java.lang.String
  type TrialComponentMetricSummaries = js.Array[typingsJapgolly.awsSdk.sagemakerMod.TrialComponentMetricSummary]
  type TrialComponentParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.sagemakerMod.TrialComponentParameterValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type TrialComponentPrimaryStatus = typingsJapgolly.awsSdk.sagemakerMod._TrialComponentPrimaryStatus | java.lang.String
  type TrialComponentSimpleSummaries = js.Array[typingsJapgolly.awsSdk.sagemakerMod.TrialComponentSimpleSummary]
  type TrialComponentSourceArn = java.lang.String
  type TrialComponentStatusMessage = java.lang.String
  type TrialComponentSummaries = js.Array[typingsJapgolly.awsSdk.sagemakerMod.TrialComponentSummary]
  type TrialSourceArn = java.lang.String
  type TrialSummaries = js.Array[typingsJapgolly.awsSdk.sagemakerMod.TrialSummary]
  type Url = java.lang.String
  type UserProfileArn = java.lang.String
  type UserProfileList = js.Array[typingsJapgolly.awsSdk.sagemakerMod.UserProfileDetails]
  type UserProfileName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
    - typingsJapgolly.awsSdk.awsSdkStrings.LastModifiedTime
    - java.lang.String
  */
  type UserProfileSortKey = typingsJapgolly.awsSdk.sagemakerMod._UserProfileSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.InService
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - java.lang.String
  */
  type UserProfileStatus = typingsJapgolly.awsSdk.sagemakerMod._UserProfileStatus | java.lang.String
  type VariantName = java.lang.String
  type VariantWeight = scala.Double
  type VolumeSizeInGB = scala.Double
  type VpcId = java.lang.String
  type VpcSecurityGroupIds = js.Array[typingsJapgolly.awsSdk.sagemakerMod.SecurityGroupId]
  type WorkforceArn = java.lang.String
  type WorkforceName = java.lang.String
  type WorkteamArn = java.lang.String
  type WorkteamName = java.lang.String
  type Workteams = js.Array[typingsJapgolly.awsSdk.sagemakerMod.Workteam]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-07-24`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.sagemakerMod._apiVersion | java.lang.String
}
