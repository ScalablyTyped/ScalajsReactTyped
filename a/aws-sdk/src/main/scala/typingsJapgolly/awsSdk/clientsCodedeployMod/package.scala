package typingsJapgolly.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AdditionalDeploymentStatusInfo = String

type AlarmList = js.Array[Alarm]

type AlarmName = String

type ApplicationId = String

type ApplicationName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.registerTime
  - typingsJapgolly.awsSdk.awsSdkStrings.firstUsedTime
  - typingsJapgolly.awsSdk.awsSdkStrings.lastUsedTime
  - java.lang.String
*/
type ApplicationRevisionSortBy = _ApplicationRevisionSortBy | String

type ApplicationsInfoList = js.Array[ApplicationInfo]

type ApplicationsList = js.Array[ApplicationName]

type Arn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_ALARM
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_REQUEST
  - java.lang.String
*/
type AutoRollbackEvent = _AutoRollbackEvent | String

type AutoRollbackEventsList = js.Array[AutoRollbackEvent]

type AutoScalingGroupHook = String

type AutoScalingGroupList = js.Array[AutoScalingGroup]

type AutoScalingGroupName = String

type AutoScalingGroupNameList = js.Array[AutoScalingGroupName]

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.tar
  - typingsJapgolly.awsSdk.awsSdkStrings.tgz
  - typingsJapgolly.awsSdk.awsSdkStrings.zip__
  - typingsJapgolly.awsSdk.awsSdkStrings.YAML
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type BundleType = _BundleType | String

type CloudFormationResourceType = String

type CommitId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Server_
  - typingsJapgolly.awsSdk.awsSdkStrings.Lambda_
  - typingsJapgolly.awsSdk.awsSdkStrings.ECS
  - java.lang.String
*/
type ComputePlatform = _ComputePlatform | String

type DeploymentConfigId = String

type DeploymentConfigName = String

type DeploymentConfigsList = js.Array[DeploymentConfigName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.user__
  - typingsJapgolly.awsSdk.awsSdkStrings.autoscaling_
  - typingsJapgolly.awsSdk.awsSdkStrings.codeDeployRollback
  - typingsJapgolly.awsSdk.awsSdkStrings.CodeDeploy
  - typingsJapgolly.awsSdk.awsSdkStrings.CodeDeployAutoUpdate
  - typingsJapgolly.awsSdk.awsSdkStrings.CloudFormation_
  - typingsJapgolly.awsSdk.awsSdkStrings.CloudFormationRollback
  - java.lang.String
*/
type DeploymentCreator = _DeploymentCreator | String

type DeploymentGroupId = String

type DeploymentGroupInfoList = js.Array[DeploymentGroupInfo]

type DeploymentGroupName = String

type DeploymentGroupsList = js.Array[DeploymentGroupName]

type DeploymentId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WITH_TRAFFIC_CONTROL
  - typingsJapgolly.awsSdk.awsSdkStrings.WITHOUT_TRAFFIC_CONTROL
  - java.lang.String
*/
type DeploymentOption = _DeploymentOption | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTINUE_DEPLOYMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.STOP_DEPLOYMENT
  - java.lang.String
*/
type DeploymentReadyAction = _DeploymentReadyAction | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Created_
  - typingsJapgolly.awsSdk.awsSdkStrings.Queued_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Baking_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Ready_
  - java.lang.String
*/
type DeploymentStatus = _DeploymentStatus | String

type DeploymentStatusList = js.Array[DeploymentStatus]

type DeploymentStatusMessageList = js.Array[ErrorMessage]

type DeploymentTargetList = js.Array[DeploymentTarget]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceTarget
  - typingsJapgolly.awsSdk.awsSdkStrings.LambdaTarget
  - typingsJapgolly.awsSdk.awsSdkStrings.ECSTarget
  - typingsJapgolly.awsSdk.awsSdkStrings.CloudFormationTarget
  - java.lang.String
*/
type DeploymentTargetType = _DeploymentTargetType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PLACE
  - typingsJapgolly.awsSdk.awsSdkStrings.BLUE_GREEN
  - java.lang.String
*/
type DeploymentType = _DeploymentType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READY_WAIT
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATION_WAIT
  - java.lang.String
*/
type DeploymentWaitType = _DeploymentWaitType | String

type DeploymentsInfoList = js.Array[DeploymentInfo]

type DeploymentsList = js.Array[DeploymentId]

type Description = String

type Duration = Double

type EC2TagFilterList = js.Array[EC2TagFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.KEY_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.VALUE_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.KEY_AND_VALUE
  - java.lang.String
*/
type EC2TagFilterType = _EC2TagFilterType | String

type EC2TagSetList = js.Array[EC2TagFilterList]

type ECSClusterName = String

type ECSServiceList = js.Array[ECSService]

type ECSServiceName = String

type ECSTaskSetCount = Double

type ECSTaskSetIdentifier = String

type ECSTaskSetList = js.Array[ECSTaskSet]

type ECSTaskSetStatus = String

type ELBInfoList = js.Array[ELBInfo]

type ELBName = String

type ETag = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENT_ISSUE
  - typingsJapgolly.awsSdk.awsSdkStrings.ALARM_ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION_MISSING
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOSCALING_VALIDATION_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTO_SCALING_CONFIGURATION
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTO_SCALING_IAM_ROLE_PERMISSIONS
  - typingsJapgolly.awsSdk.awsSdkStrings.CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_APPLICATION_UNHEALTHY
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_GROUP_MISSING
  - typingsJapgolly.awsSdk.awsSdkStrings.ECS_UPDATE_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.ELASTIC_LOAD_BALANCING_INVALID
  - typingsJapgolly.awsSdk.awsSdkStrings.ELB_INVALID_INSTANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.HEALTH_CONSTRAINTS
  - typingsJapgolly.awsSdk.awsSdkStrings.HEALTH_CONSTRAINTS_INVALID
  - typingsJapgolly.awsSdk.awsSdkStrings.HOOK_EXECUTION_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_ROLE_MISSING
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_ROLE_PERMISSIONS
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_ECS_SERVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_LAMBDA_CONFIGURATION
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_LAMBDA_FUNCTION
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_REVISION
  - typingsJapgolly.awsSdk.awsSdkStrings.MANUAL_STOP
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSING_ELB_INFORMATION
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSING_GITHUB_TOKEN
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_EC2_SUBSCRIPTION
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_INSTANCES
  - typingsJapgolly.awsSdk.awsSdkStrings.OVER_MAX_INSTANCES
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_LIMIT_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.REVISION_MISSING
  - typingsJapgolly.awsSdk.awsSdkStrings.THROTTLED
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMEOUT
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_FAILURE
  - java.lang.String
*/
type ErrorCode = _ErrorCode | String

type ErrorMessage = String

type ExternalId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISALLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.OVERWRITE
  - typingsJapgolly.awsSdk.awsSdkStrings.RETAIN
  - java.lang.String
*/
type FileExistsBehavior = _FileExistsBehavior | String

type FilterValue = String

type FilterValueList = js.Array[FilterValue]

type GitHubAccountTokenName = String

type GitHubAccountTokenNameList = js.Array[GitHubAccountTokenName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISCOVER_EXISTING
  - typingsJapgolly.awsSdk.awsSdkStrings.COPY_AUTO_SCALING_GROUP
  - java.lang.String
*/
type GreenFleetProvisioningAction = _GreenFleetProvisioningAction | String

type IamSessionArn = String

type IamUserArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE
  - typingsJapgolly.awsSdk.awsSdkStrings.KEEP_ALIVE
  - java.lang.String
*/
type InstanceAction = _InstanceAction | String

type InstanceArn = String

type InstanceCount = Double

type InstanceId = String

type InstanceInfoList = js.Array[InstanceInfo]

type InstanceName = String

type InstanceNameList = js.Array[InstanceName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Skipped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
  - typingsJapgolly.awsSdk.awsSdkStrings.Ready_
  - java.lang.String
*/
type InstanceStatus = _InstanceStatus | String

type InstanceStatusList = js.Array[InstanceStatus]

type InstanceSummaryList = js.Array[InstanceSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Blue_
  - typingsJapgolly.awsSdk.awsSdkStrings.Green_
  - java.lang.String
*/
type InstanceType = _InstanceType | String

type InstanceTypeList = js.Array[InstanceType]

type InstancesList = js.Array[InstanceId]

type Key = String

type LambdaFunctionAlias = String

type LambdaFunctionName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.ScriptMissing
  - typingsJapgolly.awsSdk.awsSdkStrings.ScriptNotExecutable
  - typingsJapgolly.awsSdk.awsSdkStrings.ScriptTimedOut
  - typingsJapgolly.awsSdk.awsSdkStrings.ScriptFailed
  - typingsJapgolly.awsSdk.awsSdkStrings.UnknownError
  - java.lang.String
*/
type LifecycleErrorCode = _LifecycleErrorCode | String

type LifecycleEventHookExecutionId = String

type LifecycleEventList = js.Array[LifecycleEvent]

type LifecycleEventName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Skipped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
  - java.lang.String
*/
type LifecycleEventStatus = _LifecycleEventStatus | String

type LifecycleMessage = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.include_
  - typingsJapgolly.awsSdk.awsSdkStrings.exclude_
  - typingsJapgolly.awsSdk.awsSdkStrings.ignore__
  - java.lang.String
*/
type ListStateFilterAction = _ListStateFilterAction | String

type ListenerArn = String

type ListenerArnList = js.Array[ListenerArn]

type LogTail = String

type Message = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HOST_COUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_PERCENT
  - java.lang.String
*/
type MinimumHealthyHostsType = _MinimumHealthyHostsType | String

type MinimumHealthyHostsValue = Double

type NextToken = String

type NullableBoolean = scala.Boolean

type OnPremisesTagSetList = js.Array[TagFilterList]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.IGNORE
  - java.lang.String
*/
type OutdatedInstancesStrategy = _OutdatedInstancesStrategy | String

type Percentage = Double

type RawStringContent = String

type RawStringSha256 = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Registered_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deregistered_
  - java.lang.String
*/
type RegistrationStatus = _RegistrationStatus | String

type Repository = String

type RevisionInfoList = js.Array[RevisionInfo]

type RevisionLocationList = js.Array[RevisionLocation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.S3
  - typingsJapgolly.awsSdk.awsSdkStrings.GitHub_
  - typingsJapgolly.awsSdk.awsSdkStrings.String_
  - typingsJapgolly.awsSdk.awsSdkStrings.AppSpecContent
  - java.lang.String
*/
type RevisionLocationType = _RevisionLocationType | String

type Role = String

type S3Bucket = String

type S3Key = String

type ScriptName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ascending__
  - typingsJapgolly.awsSdk.awsSdkStrings.descending__
  - java.lang.String
*/
type SortOrder = _SortOrder | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - java.lang.String
*/
type StopStatus = _StopStatus | String

type TagFilterList = js.Array[TagFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.KEY_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.VALUE_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.KEY_AND_VALUE
  - java.lang.String
*/
type TagFilterType = _TagFilterType | String

type TagKeyList = js.Array[Key]

type TagList = js.Array[Tag]

type TargetArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TargetStatus
  - typingsJapgolly.awsSdk.awsSdkStrings.ServerInstanceLabel
  - java.lang.String
*/
type TargetFilterName = _TargetFilterName | String

type TargetFilters = StringDictionary[FilterValueList]

type TargetGroupInfoList = js.Array[TargetGroupInfo]

type TargetGroupName = String

type TargetGroupPairInfoList = js.Array[TargetGroupPairInfo]

type TargetId = String

type TargetIdList = js.Array[TargetId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Blue_
  - typingsJapgolly.awsSdk.awsSdkStrings.Green_
  - java.lang.String
*/
type TargetLabel = _TargetLabel | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Skipped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
  - typingsJapgolly.awsSdk.awsSdkStrings.Ready_
  - java.lang.String
*/
type TargetStatus = _TargetStatus | String

type Time = js.Date

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TimeBasedCanary
  - typingsJapgolly.awsSdk.awsSdkStrings.TimeBasedLinear
  - typingsJapgolly.awsSdk.awsSdkStrings.AllAtOnce
  - java.lang.String
*/
type TrafficRoutingType = _TrafficRoutingType | String

type TrafficWeight = Double

type TriggerConfigList = js.Array[TriggerConfig]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DeploymentStart
  - typingsJapgolly.awsSdk.awsSdkStrings.DeploymentSuccess
  - typingsJapgolly.awsSdk.awsSdkStrings.DeploymentFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.DeploymentStop
  - typingsJapgolly.awsSdk.awsSdkStrings.DeploymentRollback
  - typingsJapgolly.awsSdk.awsSdkStrings.DeploymentReady
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceStart
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceSuccess
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceReady
  - java.lang.String
*/
type TriggerEventType = _TriggerEventType | String

type TriggerEventTypeList = js.Array[TriggerEventType]

type TriggerName = String

type TriggerTargetArn = String

type Value = String

type Version = String

type VersionId = String

type WaitTimeInMins = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2014-10-06`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
