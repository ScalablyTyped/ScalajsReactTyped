package typingsJapgolly.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.InternalServiceError
import typingsJapgolly.awsSdk.awsSdkStrings.OGRE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.X86_64
  - typingsJapgolly.awsSdk.awsSdkStrings.ARM64
  - typingsJapgolly.awsSdk.awsSdkStrings.ARMHF
  - java.lang.String
*/
type Architecture = _Architecture | String

type Arn = String

type Arns = js.Array[Arn]

type BatchTimeoutInSeconds = Double

type Boolean = scala.Boolean

type BoxedBoolean = scala.Boolean

type ClientRequestToken = String

type Command = String

type CommandList = js.Array[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CPU
  - typingsJapgolly.awsSdk.awsSdkStrings.GPU_AND_CPU
  - java.lang.String
*/
type ComputeType = _ComputeType | String

type CreateSimulationJobRequests = js.Array[SimulationJobRequest]

type CreatedAt = js.Date

type DataSourceConfigs = js.Array[DataSourceConfig]

type DataSourceNames = js.Array[Name]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Prefix_
  - typingsJapgolly.awsSdk.awsSdkStrings.Archive_
  - typingsJapgolly.awsSdk.awsSdkStrings.File_
  - java.lang.String
*/
type DataSourceType = _DataSourceType | String

type DataSources = js.Array[DataSource]

type DeploymentApplicationConfigs = js.Array[DeploymentApplicationConfig]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotFound
  - typingsJapgolly.awsSdk.awsSdkStrings.EnvironmentSetupError
  - typingsJapgolly.awsSdk.awsSdkStrings.EtagMismatch
  - typingsJapgolly.awsSdk.awsSdkStrings.FailureThresholdBreached
  - typingsJapgolly.awsSdk.awsSdkStrings.RobotDeploymentAborted
  - typingsJapgolly.awsSdk.awsSdkStrings.RobotDeploymentNoResponse
  - typingsJapgolly.awsSdk.awsSdkStrings.RobotAgentConnectionTimeout
  - typingsJapgolly.awsSdk.awsSdkStrings.GreengrassDeploymentFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidGreengrassGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.MissingRobotArchitecture
  - typingsJapgolly.awsSdk.awsSdkStrings.MissingRobotApplicationArchitecture
  - typingsJapgolly.awsSdk.awsSdkStrings.MissingRobotDeploymentResource
  - typingsJapgolly.awsSdk.awsSdkStrings.GreengrassGroupVersionDoesNotExist
  - typingsJapgolly.awsSdk.awsSdkStrings.LambdaDeleted
  - typingsJapgolly.awsSdk.awsSdkStrings.ExtractingBundleFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.PreLaunchFileFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.PostLaunchFileFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.BadPermissionError
  - typingsJapgolly.awsSdk.awsSdkStrings.DownloadConditionFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.BadLambdaAssociated
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalServerError
  - typingsJapgolly.awsSdk.awsSdkStrings.RobotApplicationDoesNotExist
  - typingsJapgolly.awsSdk.awsSdkStrings.DeploymentFleetDoesNotExist
  - typingsJapgolly.awsSdk.awsSdkStrings.FleetDeploymentTimeout
  - java.lang.String
*/
type DeploymentJobErrorCode = _DeploymentJobErrorCode | String

type DeploymentJobs = js.Array[DeploymentJob]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Preparing_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - typingsJapgolly.awsSdk.awsSdkStrings.Canceled_
  - java.lang.String
*/
type DeploymentStatus = _DeploymentStatus | String

type DeploymentTimeout = Double

type DeploymentVersion = String

type EnvironmentVariableKey = String

type EnvironmentVariableMap = StringDictionary[EnvironmentVariableValue]

type EnvironmentVariableValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FAIL
  - typingsJapgolly.awsSdk.awsSdkStrings.RESTART
  - java.lang.String
*/
type ExitBehavior = _ExitBehavior | String

type FailedAt = js.Date

type FailedCreateSimulationJobRequests = js.Array[FailedCreateSimulationJobRequest]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Fail_
  - typingsJapgolly.awsSdk.awsSdkStrings.Continue_
  - java.lang.String
*/
type FailureBehavior = _FailureBehavior | String

type FilterValues = js.Array[Name]

type Filters = js.Array[Filter]

type Fleets = js.Array[Fleet]

type FloorplanCount = Double

type GPUUnit = Double

type GenericInteger = Double

type GenericString = String

type IamRole = String

type Id = String

type ImageDigest = String

type Integer = Double

type InteriorCountPerFloorplan = Double

type JobDuration = Double

type Json = String

type LastStartedAt = js.Date

type LastUpdatedAt = js.Date

type MaxConcurrency = Double

type MaxResults = Double

type Name = String

type NonEmptyString = String

type NonSystemPort = Double

type PaginationToken = String

type Path = String

type PercentDone = Double

type Percentage = Double

type Port = Double

type PortMappingList = js.Array[PortMapping]

type RenderingEngineType = OGRE | String

type RenderingEngineVersionType = String

type RepositoryUrl = String

type RevisionId = String

type RobotApplicationConfigs = js.Array[RobotApplicationConfig]

type RobotApplicationNames = js.Array[Name]

type RobotApplicationSummaries = js.Array[RobotApplicationSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Validating_
  - typingsJapgolly.awsSdk.awsSdkStrings.DownloadingExtracting
  - typingsJapgolly.awsSdk.awsSdkStrings.ExecutingDownloadCondition
  - typingsJapgolly.awsSdk.awsSdkStrings.ExecutingPreLaunch
  - typingsJapgolly.awsSdk.awsSdkStrings.Launching_
  - typingsJapgolly.awsSdk.awsSdkStrings.ExecutingPostLaunch
  - typingsJapgolly.awsSdk.awsSdkStrings.Finished_
  - java.lang.String
*/
type RobotDeploymentStep = _RobotDeploymentStep | String

type RobotDeploymentSummary = js.Array[RobotDeployment]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ROS
  - typingsJapgolly.awsSdk.awsSdkStrings.ROS2
  - typingsJapgolly.awsSdk.awsSdkStrings.General_
  - java.lang.String
*/
type RobotSoftwareSuiteType = _RobotSoftwareSuiteType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Kinetic
  - typingsJapgolly.awsSdk.awsSdkStrings.Melodic
  - typingsJapgolly.awsSdk.awsSdkStrings.Dashing
  - typingsJapgolly.awsSdk.awsSdkStrings.Foxy
  - java.lang.String
*/
type RobotSoftwareSuiteVersionType = _RobotSoftwareSuiteVersionType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Available_
  - typingsJapgolly.awsSdk.awsSdkStrings.Registered_
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingNewDeployment
  - typingsJapgolly.awsSdk.awsSdkStrings.Deploying_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.InSync_
  - typingsJapgolly.awsSdk.awsSdkStrings.NoResponse
  - java.lang.String
*/
type RobotStatus = _RobotStatus | String

type Robots = js.Array[Robot]

type S3Bucket = String

type S3Etag = String

type S3Etags = js.Array[S3Etag]

type S3Key = String

type S3KeyOrPrefix = String

type S3KeyOutputs = js.Array[S3KeyOutput]

type S3KeysOrPrefixes = js.Array[S3KeyOrPrefix]

type SecurityGroups = js.Array[NonEmptyString]

type SimulationApplicationConfigs = js.Array[SimulationApplicationConfig]

type SimulationApplicationNames = js.Array[Name]

type SimulationApplicationSummaries = js.Array[SimulationApplicationSummary]

type SimulationJobBatchErrorCode = InternalServiceError | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Canceled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Canceling_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completing_
  - typingsJapgolly.awsSdk.awsSdkStrings.TimingOut
  - typingsJapgolly.awsSdk.awsSdkStrings.TimedOut_
  - java.lang.String
*/
type SimulationJobBatchStatus = _SimulationJobBatchStatus | String

type SimulationJobBatchSummaries = js.Array[SimulationJobBatchSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalServiceError
  - typingsJapgolly.awsSdk.awsSdkStrings.RobotApplicationCrash
  - typingsJapgolly.awsSdk.awsSdkStrings.SimulationApplicationCrash
  - typingsJapgolly.awsSdk.awsSdkStrings.RobotApplicationHealthCheckFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.SimulationApplicationHealthCheckFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.BadPermissionsRobotApplication
  - typingsJapgolly.awsSdk.awsSdkStrings.BadPermissionsSimulationApplication
  - typingsJapgolly.awsSdk.awsSdkStrings.BadPermissionsS3Object
  - typingsJapgolly.awsSdk.awsSdkStrings.BadPermissionsS3Output
  - typingsJapgolly.awsSdk.awsSdkStrings.BadPermissionsCloudwatchLogs
  - typingsJapgolly.awsSdk.awsSdkStrings.SubnetIpLimitExceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.ENILimitExceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.BadPermissionsUserCredentials
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidBundleRobotApplication
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidBundleSimulationApplication
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidS3Resource
  - typingsJapgolly.awsSdk.awsSdkStrings.ThrottlingError
  - typingsJapgolly.awsSdk.awsSdkStrings.LimitExceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.MismatchedEtag
  - typingsJapgolly.awsSdk.awsSdkStrings.RobotApplicationVersionMismatchedEtag
  - typingsJapgolly.awsSdk.awsSdkStrings.SimulationApplicationVersionMismatchedEtag
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotFound
  - typingsJapgolly.awsSdk.awsSdkStrings.RequestThrottled
  - typingsJapgolly.awsSdk.awsSdkStrings.BatchTimedOut
  - typingsJapgolly.awsSdk.awsSdkStrings.BatchCanceled
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidInput
  - typingsJapgolly.awsSdk.awsSdkStrings.WrongRegionS3Bucket
  - typingsJapgolly.awsSdk.awsSdkStrings.WrongRegionS3Output
  - typingsJapgolly.awsSdk.awsSdkStrings.WrongRegionRobotApplication
  - typingsJapgolly.awsSdk.awsSdkStrings.WrongRegionSimulationApplication
  - typingsJapgolly.awsSdk.awsSdkStrings.UploadContentMismatchError
  - java.lang.String
*/
type SimulationJobErrorCode = _SimulationJobErrorCode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Preparing_
  - typingsJapgolly.awsSdk.awsSdkStrings.Running_
  - typingsJapgolly.awsSdk.awsSdkStrings.Restarting
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.RunningFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.Terminating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Terminated_
  - typingsJapgolly.awsSdk.awsSdkStrings.Canceled_
  - java.lang.String
*/
type SimulationJobStatus = _SimulationJobStatus | String

type SimulationJobSummaries = js.Array[SimulationJobSummary]

type SimulationJobs = js.Array[SimulationJob]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Gazebo
  - typingsJapgolly.awsSdk.awsSdkStrings.RosbagPlay
  - typingsJapgolly.awsSdk.awsSdkStrings.SimulationRuntime
  - java.lang.String
*/
type SimulationSoftwareSuiteType = _SimulationSoftwareSuiteType | String

type SimulationSoftwareSuiteVersionType = String

type SimulationTimeMillis = Double

type SimulationUnit = Double

type SourceConfigs = js.Array[SourceConfig]

type Sources = js.Array[Source]

type Subnets = js.Array[NonEmptyString]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TemplateName = String

type TemplateSummaries = js.Array[TemplateSummary]

type Tools = js.Array[Tool]

type UnrestrictedCommand = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLOAD_ON_TERMINATE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLOAD_ROLLING_AUTO_REMOVE
  - java.lang.String
*/
type UploadBehavior = _UploadBehavior | String

type UploadConfigurations = js.Array[UploadConfiguration]

type Version = String

type VersionQualifier = String

type WorldConfigs = js.Array[WorldConfig]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalServiceError
  - typingsJapgolly.awsSdk.awsSdkStrings.LimitExceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotFound
  - typingsJapgolly.awsSdk.awsSdkStrings.RequestThrottled
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidInput
  - typingsJapgolly.awsSdk.awsSdkStrings.AccessDenied
  - java.lang.String
*/
type WorldExportJobErrorCode = _WorldExportJobErrorCode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Running_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Canceling_
  - typingsJapgolly.awsSdk.awsSdkStrings.Canceled_
  - java.lang.String
*/
type WorldExportJobStatus = _WorldExportJobStatus | String

type WorldExportJobSummaries = js.Array[WorldExportJobSummary]

type WorldFailures = js.Array[WorldFailure]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalServiceError
  - typingsJapgolly.awsSdk.awsSdkStrings.LimitExceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotFound
  - typingsJapgolly.awsSdk.awsSdkStrings.RequestThrottled
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidInput
  - typingsJapgolly.awsSdk.awsSdkStrings.AllWorldGenerationFailed
  - java.lang.String
*/
type WorldGenerationJobErrorCode = _WorldGenerationJobErrorCode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Running_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.PartialFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.Canceling_
  - typingsJapgolly.awsSdk.awsSdkStrings.Canceled_
  - java.lang.String
*/
type WorldGenerationJobStatus = _WorldGenerationJobStatus | String

type WorldGenerationJobSummaries = js.Array[WorldGenerationJobSummary]

type WorldSummaries = js.Array[WorldSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-06-29`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
