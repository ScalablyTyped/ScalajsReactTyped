package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object robomakerMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.X86_64
    - typingsJapgolly.awsSdk.awsSdkStrings.ARM64
    - typingsJapgolly.awsSdk.awsSdkStrings.ARMHF
    - java.lang.String
  */
  type Architecture = typingsJapgolly.awsSdk.robomakerMod._Architecture | java.lang.String
  type Arn = java.lang.String
  type Arns = js.Array[typingsJapgolly.awsSdk.robomakerMod.Arn]
  type BatchTimeoutInSeconds = scala.Double
  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.robomakerMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type Command = java.lang.String
  type CreateSimulationJobRequests = js.Array[typingsJapgolly.awsSdk.robomakerMod.SimulationJobRequest]
  type CreatedAt = js.Date
  type DataSourceConfigs = js.Array[typingsJapgolly.awsSdk.robomakerMod.DataSourceConfig]
  type DataSourceNames = js.Array[typingsJapgolly.awsSdk.robomakerMod.Name]
  type DataSources = js.Array[typingsJapgolly.awsSdk.robomakerMod.DataSource]
  type DeploymentApplicationConfigs = js.Array[typingsJapgolly.awsSdk.robomakerMod.DeploymentApplicationConfig]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotFound
    - typingsJapgolly.awsSdk.awsSdkStrings.EnvironmentSetupError
    - typingsJapgolly.awsSdk.awsSdkStrings.EtagMismatch
    - typingsJapgolly.awsSdk.awsSdkStrings.FailureThresholdBreached
    - typingsJapgolly.awsSdk.awsSdkStrings.RobotDeploymentAborted
    - typingsJapgolly.awsSdk.awsSdkStrings.RobotDeploymentNoResponse
    - typingsJapgolly.awsSdk.awsSdkStrings.RobotAgentConnectionTimeout
    - typingsJapgolly.awsSdk.awsSdkStrings.GreengrassDeploymentFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.MissingRobotArchitecture
    - typingsJapgolly.awsSdk.awsSdkStrings.MissingRobotApplicationArchitecture
    - typingsJapgolly.awsSdk.awsSdkStrings.MissingRobotDeploymentResource
    - typingsJapgolly.awsSdk.awsSdkStrings.GreengrassGroupVersionDoesNotExist
    - typingsJapgolly.awsSdk.awsSdkStrings.ExtractingBundleFailure
    - typingsJapgolly.awsSdk.awsSdkStrings.PreLaunchFileFailure
    - typingsJapgolly.awsSdk.awsSdkStrings.PostLaunchFileFailure
    - typingsJapgolly.awsSdk.awsSdkStrings.BadPermissionError
    - typingsJapgolly.awsSdk.awsSdkStrings.DownloadConditionFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.InternalServerError
    - java.lang.String
  */
  type DeploymentJobErrorCode = typingsJapgolly.awsSdk.robomakerMod._DeploymentJobErrorCode | java.lang.String
  type DeploymentJobs = js.Array[typingsJapgolly.awsSdk.robomakerMod.DeploymentJob]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Preparing_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
    - typingsJapgolly.awsSdk.awsSdkStrings.Canceled_
    - java.lang.String
  */
  type DeploymentStatus = typingsJapgolly.awsSdk.robomakerMod._DeploymentStatus | java.lang.String
  type DeploymentTimeout = scala.Double
  type DeploymentVersion = java.lang.String
  type EnvironmentVariableKey = java.lang.String
  type EnvironmentVariableMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.robomakerMod.EnvironmentVariableValue]
  type EnvironmentVariableValue = java.lang.String
  type FailedAt = js.Date
  type FailedCreateSimulationJobRequests = js.Array[typingsJapgolly.awsSdk.robomakerMod.FailedCreateSimulationJobRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Fail_
    - typingsJapgolly.awsSdk.awsSdkStrings.Continue_
    - java.lang.String
  */
  type FailureBehavior = typingsJapgolly.awsSdk.robomakerMod._FailureBehavior | java.lang.String
  type FilterValues = js.Array[typingsJapgolly.awsSdk.robomakerMod.Name]
  type Filters = js.Array[typingsJapgolly.awsSdk.robomakerMod.Filter]
  type Fleets = js.Array[typingsJapgolly.awsSdk.robomakerMod.Fleet]
  type GenericInteger = scala.Double
  type GenericString = java.lang.String
  type IamRole = java.lang.String
  type Id = java.lang.String
  type Integer = scala.Double
  type JobDuration = scala.Double
  type LastStartedAt = js.Date
  type LastUpdatedAt = js.Date
  type MaxConcurrency = scala.Double
  type MaxResults = scala.Double
  type Name = java.lang.String
  type NonEmptyString = java.lang.String
  type NonSystemPort = scala.Double
  type PaginationToken = java.lang.String
  type Path = java.lang.String
  type PercentDone = scala.Double
  type Percentage = scala.Double
  type Port = scala.Double
  type PortMappingList = js.Array[typingsJapgolly.awsSdk.robomakerMod.PortMapping]
  type RenderingEngineType = typingsJapgolly.awsSdk.awsSdkStrings.OGRE | java.lang.String
  type RenderingEngineVersionType = java.lang.String
  type RevisionId = java.lang.String
  type RobotApplicationConfigs = js.Array[typingsJapgolly.awsSdk.robomakerMod.RobotApplicationConfig]
  type RobotApplicationNames = js.Array[typingsJapgolly.awsSdk.robomakerMod.Name]
  type RobotApplicationSummaries = js.Array[typingsJapgolly.awsSdk.robomakerMod.RobotApplicationSummary]
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
  type RobotDeploymentStep = typingsJapgolly.awsSdk.robomakerMod._RobotDeploymentStep | java.lang.String
  type RobotDeploymentSummary = js.Array[typingsJapgolly.awsSdk.robomakerMod.RobotDeployment]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ROS
    - typingsJapgolly.awsSdk.awsSdkStrings.ROS2
    - java.lang.String
  */
  type RobotSoftwareSuiteType = typingsJapgolly.awsSdk.robomakerMod._RobotSoftwareSuiteType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Kinetic
    - typingsJapgolly.awsSdk.awsSdkStrings.Melodic
    - typingsJapgolly.awsSdk.awsSdkStrings.Dashing
    - java.lang.String
  */
  type RobotSoftwareSuiteVersionType = typingsJapgolly.awsSdk.robomakerMod._RobotSoftwareSuiteVersionType | java.lang.String
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
  type RobotStatus = typingsJapgolly.awsSdk.robomakerMod._RobotStatus | java.lang.String
  type Robots = js.Array[typingsJapgolly.awsSdk.robomakerMod.Robot]
  type S3Bucket = java.lang.String
  type S3Etag = java.lang.String
  type S3Key = java.lang.String
  type S3KeyOutputs = js.Array[typingsJapgolly.awsSdk.robomakerMod.S3KeyOutput]
  type S3Keys = js.Array[typingsJapgolly.awsSdk.robomakerMod.S3Key]
  type SecurityGroups = js.Array[typingsJapgolly.awsSdk.robomakerMod.NonEmptyString]
  type SimulationApplicationConfigs = js.Array[typingsJapgolly.awsSdk.robomakerMod.SimulationApplicationConfig]
  type SimulationApplicationNames = js.Array[typingsJapgolly.awsSdk.robomakerMod.Name]
  type SimulationApplicationSummaries = js.Array[typingsJapgolly.awsSdk.robomakerMod.SimulationApplicationSummary]
  type SimulationJobBatchErrorCode = typingsJapgolly.awsSdk.awsSdkStrings.InternalServiceError | java.lang.String
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
  type SimulationJobBatchStatus = typingsJapgolly.awsSdk.robomakerMod._SimulationJobBatchStatus | java.lang.String
  type SimulationJobBatchSummaries = js.Array[typingsJapgolly.awsSdk.robomakerMod.SimulationJobBatchSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InternalServiceError
    - typingsJapgolly.awsSdk.awsSdkStrings.RobotApplicationCrash
    - typingsJapgolly.awsSdk.awsSdkStrings.SimulationApplicationCrash
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
    - java.lang.String
  */
  type SimulationJobErrorCode = typingsJapgolly.awsSdk.robomakerMod._SimulationJobErrorCode | java.lang.String
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
  type SimulationJobStatus = typingsJapgolly.awsSdk.robomakerMod._SimulationJobStatus | java.lang.String
  type SimulationJobSummaries = js.Array[typingsJapgolly.awsSdk.robomakerMod.SimulationJobSummary]
  type SimulationJobs = js.Array[typingsJapgolly.awsSdk.robomakerMod.SimulationJob]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Gazebo
    - typingsJapgolly.awsSdk.awsSdkStrings.RosbagPlay
    - java.lang.String
  */
  type SimulationSoftwareSuiteType = typingsJapgolly.awsSdk.robomakerMod._SimulationSoftwareSuiteType | java.lang.String
  type SimulationSoftwareSuiteVersionType = java.lang.String
  type SimulationTimeMillis = scala.Double
  type SourceConfigs = js.Array[typingsJapgolly.awsSdk.robomakerMod.SourceConfig]
  type Sources = js.Array[typingsJapgolly.awsSdk.robomakerMod.Source]
  type Subnets = js.Array[typingsJapgolly.awsSdk.robomakerMod.NonEmptyString]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.robomakerMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.robomakerMod.TagValue]
  type TagValue = java.lang.String
  type Version = java.lang.String
  type VersionQualifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-06-29`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.robomakerMod._apiVersion | java.lang.String
}
