package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elasticbeanstalkMod {
  type ARN = java.lang.String
  type AbortableOperationInProgress = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type ActionHistoryStatus = typingsJapgolly.awsSdk.elasticbeanstalkMod._ActionHistoryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Scheduled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Running_
    - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type ActionStatus = typingsJapgolly.awsSdk.elasticbeanstalkMod._ActionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceRefresh
    - typingsJapgolly.awsSdk.awsSdkStrings.PlatformUpdate
    - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type ActionType = typingsJapgolly.awsSdk.elasticbeanstalkMod._ActionType | java.lang.String
  type ApplicationArn = java.lang.String
  type ApplicationDescriptionList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.ApplicationDescription]
  type ApplicationName = java.lang.String
  type ApplicationNamesList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.ApplicationName]
  type ApplicationVersionArn = java.lang.String
  type ApplicationVersionDescriptionList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.ApplicationVersionDescription]
  type ApplicationVersionProccess = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Processed
    - typingsJapgolly.awsSdk.awsSdkStrings.Unprocessed
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Processing_
    - typingsJapgolly.awsSdk.awsSdkStrings.Building_
    - java.lang.String
  */
  type ApplicationVersionStatus = typingsJapgolly.awsSdk.elasticbeanstalkMod._ApplicationVersionStatus | java.lang.String
  type AutoCreateApplication = scala.Boolean
  type AutoScalingGroupList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.AutoScalingGroup]
  type AvailableSolutionStackDetailsList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.SolutionStackDescription]
  type AvailableSolutionStackNamesList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.SolutionStackName]
  type BoxedBoolean = scala.Boolean
  type BoxedInt = scala.Double
  type Cause = java.lang.String
  type Causes = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.Cause]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.elasticbeanstalkMod.ClientApiVersions
  type CnameAvailability = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILD_GENERAL1_SMALL
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILD_GENERAL1_MEDIUM
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILD_GENERAL1_LARGE
    - java.lang.String
  */
  type ComputeType = typingsJapgolly.awsSdk.elasticbeanstalkMod._ComputeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.deployed_
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type ConfigurationDeploymentStatus = typingsJapgolly.awsSdk.elasticbeanstalkMod._ConfigurationDeploymentStatus | java.lang.String
  type ConfigurationOptionDefaultValue = java.lang.String
  type ConfigurationOptionDescriptionsList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.ConfigurationOptionDescription]
  type ConfigurationOptionName = java.lang.String
  type ConfigurationOptionPossibleValue = java.lang.String
  type ConfigurationOptionPossibleValues = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.ConfigurationOptionPossibleValue]
  type ConfigurationOptionSettingsList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.ConfigurationOptionSetting]
  type ConfigurationOptionSeverity = java.lang.String
  type ConfigurationOptionValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Scalar
    - typingsJapgolly.awsSdk.awsSdkStrings.List
    - java.lang.String
  */
  type ConfigurationOptionValueType = typingsJapgolly.awsSdk.elasticbeanstalkMod._ConfigurationOptionValueType | java.lang.String
  type ConfigurationSettingsDescriptionList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.ConfigurationSettingsDescription]
  type ConfigurationTemplateName = java.lang.String
  type ConfigurationTemplateNamesList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.ConfigurationTemplateName]
  type CreationDate = js.Date
  type CustomAmiList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.CustomAmi]
  type DNSCname = java.lang.String
  type DNSCnamePrefix = java.lang.String
  type DeleteSourceBundle = scala.Boolean
  type DeploymentTimestamp = js.Date
  type Description = java.lang.String
  type Ec2InstanceId = java.lang.String
  type EndpointURL = java.lang.String
  type EnvironmentArn = java.lang.String
  type EnvironmentDescriptionsList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.EnvironmentDescription]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Green_
    - typingsJapgolly.awsSdk.awsSdkStrings.Yellow_
    - typingsJapgolly.awsSdk.awsSdkStrings.Red_
    - typingsJapgolly.awsSdk.awsSdkStrings.Grey
    - java.lang.String
  */
  type EnvironmentHealth = typingsJapgolly.awsSdk.elasticbeanstalkMod._EnvironmentHealth | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Status_
    - typingsJapgolly.awsSdk.awsSdkStrings.Color_
    - typingsJapgolly.awsSdk.awsSdkStrings.Causes
    - typingsJapgolly.awsSdk.awsSdkStrings.ApplicationMetrics
    - typingsJapgolly.awsSdk.awsSdkStrings.InstancesHealth
    - typingsJapgolly.awsSdk.awsSdkStrings.All_
    - typingsJapgolly.awsSdk.awsSdkStrings.HealthStatus
    - typingsJapgolly.awsSdk.awsSdkStrings.RefreshedAt
    - java.lang.String
  */
  type EnvironmentHealthAttribute = typingsJapgolly.awsSdk.elasticbeanstalkMod._EnvironmentHealthAttribute | java.lang.String
  type EnvironmentHealthAttributes = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.EnvironmentHealthAttribute]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NoData
    - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Ok_
    - typingsJapgolly.awsSdk.awsSdkStrings.Info_
    - typingsJapgolly.awsSdk.awsSdkStrings.Warning_
    - typingsJapgolly.awsSdk.awsSdkStrings.Degraded_
    - typingsJapgolly.awsSdk.awsSdkStrings.Severe
    - typingsJapgolly.awsSdk.awsSdkStrings.Suspended_
    - java.lang.String
  */
  type EnvironmentHealthStatus = typingsJapgolly.awsSdk.elasticbeanstalkMod._EnvironmentHealthStatus | java.lang.String
  type EnvironmentId = java.lang.String
  type EnvironmentIdList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.EnvironmentId]
  type EnvironmentInfoDescriptionList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.EnvironmentInfoDescription]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.tail_
    - typingsJapgolly.awsSdk.awsSdkStrings.bundle
    - java.lang.String
  */
  type EnvironmentInfoType = typingsJapgolly.awsSdk.elasticbeanstalkMod._EnvironmentInfoType | java.lang.String
  type EnvironmentLinks = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.EnvironmentLink]
  type EnvironmentName = java.lang.String
  type EnvironmentNamesList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.EnvironmentName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Launching_
    - typingsJapgolly.awsSdk.awsSdkStrings.Updating_
    - typingsJapgolly.awsSdk.awsSdkStrings.Ready_
    - typingsJapgolly.awsSdk.awsSdkStrings.Terminating_
    - typingsJapgolly.awsSdk.awsSdkStrings.Terminated_
    - java.lang.String
  */
  type EnvironmentStatus = typingsJapgolly.awsSdk.elasticbeanstalkMod._EnvironmentStatus | java.lang.String
  type EventDate = js.Date
  type EventDescriptionList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.EventDescription]
  type EventMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TRACE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEBUG
    - typingsJapgolly.awsSdk.awsSdkStrings.INFO
    - typingsJapgolly.awsSdk.awsSdkStrings.WARN
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.FATAL
    - java.lang.String
  */
  type EventSeverity = typingsJapgolly.awsSdk.elasticbeanstalkMod._EventSeverity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UpdateCancelled
    - typingsJapgolly.awsSdk.awsSdkStrings.CancellationFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.RollbackFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.RollbackSuccessful
    - typingsJapgolly.awsSdk.awsSdkStrings.InternalFailure
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidEnvironmentState
    - typingsJapgolly.awsSdk.awsSdkStrings.PermissionsError
    - java.lang.String
  */
  type FailureType = typingsJapgolly.awsSdk.elasticbeanstalkMod._FailureType | java.lang.String
  type FileTypeExtension = java.lang.String
  type ForceTerminate = scala.Boolean
  type GroupName = java.lang.String
  type ImageId = java.lang.String
  type IncludeDeleted = scala.Boolean
  type IncludeDeletedBackTo = js.Date
  type InstanceHealthList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.SingleInstanceHealth]
  type InstanceId = java.lang.String
  type InstanceList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.Instance]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HealthStatus
    - typingsJapgolly.awsSdk.awsSdkStrings.Color_
    - typingsJapgolly.awsSdk.awsSdkStrings.Causes
    - typingsJapgolly.awsSdk.awsSdkStrings.ApplicationMetrics
    - typingsJapgolly.awsSdk.awsSdkStrings.RefreshedAt
    - typingsJapgolly.awsSdk.awsSdkStrings.LaunchedAt
    - typingsJapgolly.awsSdk.awsSdkStrings.System_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deployment
    - typingsJapgolly.awsSdk.awsSdkStrings.AvailabilityZone
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceType
    - typingsJapgolly.awsSdk.awsSdkStrings.All_
    - java.lang.String
  */
  type InstancesHealthAttribute = typingsJapgolly.awsSdk.elasticbeanstalkMod._InstancesHealthAttribute | java.lang.String
  type InstancesHealthAttributes = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.InstancesHealthAttribute]
  type Integer = scala.Double
  type LaunchConfigurationList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.LaunchConfiguration]
  type LaunchTemplateList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.LaunchTemplate]
  type LaunchedAt = js.Date
  type LoadAverage = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.LoadAverageValue]
  type LoadAverageValue = scala.Double
  type LoadBalancerList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.LoadBalancer]
  type LoadBalancerListenersDescription = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.Listener]
  type Maintainer = java.lang.String
  type ManagedActionHistoryItems = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.ManagedActionHistoryItem]
  type ManagedActions = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.ManagedAction]
  type MaxRecords = scala.Double
  type Message = java.lang.String
  type NextToken = java.lang.String
  type NonEmptyString = java.lang.String
  type NullableDouble = scala.Double
  type NullableInteger = scala.Double
  type NullableLong = scala.Double
  type OperatingSystemName = java.lang.String
  type OperatingSystemVersion = java.lang.String
  type OptionNamespace = java.lang.String
  type OptionRestrictionMaxLength = scala.Double
  type OptionRestrictionMaxValue = scala.Double
  type OptionRestrictionMinValue = scala.Double
  type OptionsSpecifierList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.OptionSpecification]
  type PlatformArn = java.lang.String
  type PlatformCategory = java.lang.String
  type PlatformFilterOperator = java.lang.String
  type PlatformFilterType = java.lang.String
  type PlatformFilterValue = java.lang.String
  type PlatformFilterValueList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.PlatformFilterValue]
  type PlatformFilters = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.PlatformFilter]
  type PlatformFrameworks = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.PlatformFramework]
  type PlatformMaxRecords = scala.Double
  type PlatformName = java.lang.String
  type PlatformOwner = java.lang.String
  type PlatformProgrammingLanguages = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.PlatformProgrammingLanguage]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Ready_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
    - java.lang.String
  */
  type PlatformStatus = typingsJapgolly.awsSdk.elasticbeanstalkMod._PlatformStatus | java.lang.String
  type PlatformSummaryList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.PlatformSummary]
  type PlatformVersion = java.lang.String
  type QueueList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.Queue]
  type RefreshedAt = js.Date
  type RegexLabel = java.lang.String
  type RegexPattern = java.lang.String
  type RequestCount = scala.Double
  type RequestId = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type SampleTimestamp = js.Date
  type SolutionStackFileTypeList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.FileTypeExtension]
  type SolutionStackName = java.lang.String
  type SourceLocation = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CodeCommit_
    - typingsJapgolly.awsSdk.awsSdkStrings.S3
    - java.lang.String
  */
  type SourceRepository = typingsJapgolly.awsSdk.elasticbeanstalkMod._SourceRepository | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Git
    - typingsJapgolly.awsSdk.awsSdkStrings.Zip_
    - java.lang.String
  */
  type SourceType = typingsJapgolly.awsSdk.elasticbeanstalkMod._SourceType | java.lang.String
  type String = java.lang.String
  type SupportedAddon = java.lang.String
  type SupportedAddonList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.SupportedAddon]
  type SupportedTier = java.lang.String
  type SupportedTierList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.SupportedTier]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.Tag]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.Tag]
  type TerminateEnvForce = scala.Boolean
  type TerminateEnvironmentResources = scala.Boolean
  type TimeFilterEnd = js.Date
  type TimeFilterStart = js.Date
  type Timestamp = js.Date
  type Token = java.lang.String
  type TriggerList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.Trigger]
  type UpdateDate = js.Date
  type UserDefinedOption = scala.Boolean
  type ValidationMessageString = java.lang.String
  type ValidationMessagesList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.ValidationMessage]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.error__
    - typingsJapgolly.awsSdk.awsSdkStrings.warning__
    - java.lang.String
  */
  type ValidationSeverity = typingsJapgolly.awsSdk.elasticbeanstalkMod._ValidationSeverity | java.lang.String
  type VersionLabel = java.lang.String
  type VersionLabels = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.VersionLabel]
  type VersionLabelsList = js.Array[typingsJapgolly.awsSdk.elasticbeanstalkMod.VersionLabel]
  type VirtualizationType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2010-12-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.elasticbeanstalkMod._apiVersion | java.lang.String
}
