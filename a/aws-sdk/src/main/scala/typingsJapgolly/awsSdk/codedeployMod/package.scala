package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codedeployMod {
  type AdditionalDeploymentStatusInfo = java.lang.String
  type AlarmList = js.Array[typingsJapgolly.awsSdk.codedeployMod.Alarm]
  type AlarmName = java.lang.String
  type ApplicationId = java.lang.String
  type ApplicationName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.registerTime
    - typingsJapgolly.awsSdk.awsSdkStrings.firstUsedTime
    - typingsJapgolly.awsSdk.awsSdkStrings.lastUsedTime
    - java.lang.String
  */
  type ApplicationRevisionSortBy = typingsJapgolly.awsSdk.codedeployMod._ApplicationRevisionSortBy | java.lang.String
  type ApplicationsInfoList = js.Array[typingsJapgolly.awsSdk.codedeployMod.ApplicationInfo]
  type ApplicationsList = js.Array[typingsJapgolly.awsSdk.codedeployMod.ApplicationName]
  type Arn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_ALARM
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_REQUEST
    - java.lang.String
  */
  type AutoRollbackEvent = typingsJapgolly.awsSdk.codedeployMod._AutoRollbackEvent | java.lang.String
  type AutoRollbackEventsList = js.Array[typingsJapgolly.awsSdk.codedeployMod.AutoRollbackEvent]
  type AutoScalingGroupHook = java.lang.String
  type AutoScalingGroupList = js.Array[typingsJapgolly.awsSdk.codedeployMod.AutoScalingGroup]
  type AutoScalingGroupName = java.lang.String
  type AutoScalingGroupNameList = js.Array[typingsJapgolly.awsSdk.codedeployMod.AutoScalingGroupName]
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.tar
    - typingsJapgolly.awsSdk.awsSdkStrings.tgz
    - typingsJapgolly.awsSdk.awsSdkStrings.zip__
    - typingsJapgolly.awsSdk.awsSdkStrings.YAML
    - typingsJapgolly.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type BundleType = typingsJapgolly.awsSdk.codedeployMod._BundleType | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.codedeployMod.ClientApiVersions
  type CommitId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Server_
    - typingsJapgolly.awsSdk.awsSdkStrings.Lambda_
    - typingsJapgolly.awsSdk.awsSdkStrings.ECS
    - java.lang.String
  */
  type ComputePlatform = typingsJapgolly.awsSdk.codedeployMod._ComputePlatform | java.lang.String
  type DeploymentConfigId = java.lang.String
  type DeploymentConfigName = java.lang.String
  type DeploymentConfigsList = js.Array[typingsJapgolly.awsSdk.codedeployMod.DeploymentConfigName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.user__
    - typingsJapgolly.awsSdk.awsSdkStrings.autoscaling
    - typingsJapgolly.awsSdk.awsSdkStrings.codeDeployRollback
    - java.lang.String
  */
  type DeploymentCreator = typingsJapgolly.awsSdk.codedeployMod._DeploymentCreator | java.lang.String
  type DeploymentGroupId = java.lang.String
  type DeploymentGroupInfoList = js.Array[typingsJapgolly.awsSdk.codedeployMod.DeploymentGroupInfo]
  type DeploymentGroupName = java.lang.String
  type DeploymentGroupsList = js.Array[typingsJapgolly.awsSdk.codedeployMod.DeploymentGroupName]
  type DeploymentId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WITH_TRAFFIC_CONTROL
    - typingsJapgolly.awsSdk.awsSdkStrings.WITHOUT_TRAFFIC_CONTROL
    - java.lang.String
  */
  type DeploymentOption = typingsJapgolly.awsSdk.codedeployMod._DeploymentOption | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTINUE_DEPLOYMENT
    - typingsJapgolly.awsSdk.awsSdkStrings.STOP_DEPLOYMENT
    - java.lang.String
  */
  type DeploymentReadyAction = typingsJapgolly.awsSdk.codedeployMod._DeploymentReadyAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Created_
    - typingsJapgolly.awsSdk.awsSdkStrings.Queued_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
    - typingsJapgolly.awsSdk.awsSdkStrings.Ready_
    - java.lang.String
  */
  type DeploymentStatus = typingsJapgolly.awsSdk.codedeployMod._DeploymentStatus | java.lang.String
  type DeploymentStatusList = js.Array[typingsJapgolly.awsSdk.codedeployMod.DeploymentStatus]
  type DeploymentStatusMessageList = js.Array[typingsJapgolly.awsSdk.codedeployMod.ErrorMessage]
  type DeploymentTargetList = js.Array[typingsJapgolly.awsSdk.codedeployMod.DeploymentTarget]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceTarget
    - typingsJapgolly.awsSdk.awsSdkStrings.LambdaTarget
    - typingsJapgolly.awsSdk.awsSdkStrings.ECSTarget
    - java.lang.String
  */
  type DeploymentTargetType = typingsJapgolly.awsSdk.codedeployMod._DeploymentTargetType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PLACE
    - typingsJapgolly.awsSdk.awsSdkStrings.BLUE_GREEN
    - java.lang.String
  */
  type DeploymentType = typingsJapgolly.awsSdk.codedeployMod._DeploymentType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.READY_WAIT
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATION_WAIT
    - java.lang.String
  */
  type DeploymentWaitType = typingsJapgolly.awsSdk.codedeployMod._DeploymentWaitType | java.lang.String
  type DeploymentsInfoList = js.Array[typingsJapgolly.awsSdk.codedeployMod.DeploymentInfo]
  type DeploymentsList = js.Array[typingsJapgolly.awsSdk.codedeployMod.DeploymentId]
  type Description = java.lang.String
  type Duration = scala.Double
  type EC2TagFilterList = js.Array[typingsJapgolly.awsSdk.codedeployMod.EC2TagFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.KEY_ONLY
    - typingsJapgolly.awsSdk.awsSdkStrings.VALUE_ONLY
    - typingsJapgolly.awsSdk.awsSdkStrings.KEY_AND_VALUE
    - java.lang.String
  */
  type EC2TagFilterType = typingsJapgolly.awsSdk.codedeployMod._EC2TagFilterType | java.lang.String
  type EC2TagSetList = js.Array[typingsJapgolly.awsSdk.codedeployMod.EC2TagFilterList]
  type ECSClusterName = java.lang.String
  type ECSServiceList = js.Array[typingsJapgolly.awsSdk.codedeployMod.ECSService]
  type ECSServiceName = java.lang.String
  type ECSTaskSetCount = scala.Double
  type ECSTaskSetIdentifier = java.lang.String
  type ECSTaskSetList = js.Array[typingsJapgolly.awsSdk.codedeployMod.ECSTaskSet]
  type ECSTaskSetStatus = java.lang.String
  type ELBInfoList = js.Array[typingsJapgolly.awsSdk.codedeployMod.ELBInfo]
  type ELBName = java.lang.String
  type ETag = java.lang.String
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
    - java.lang.String
  */
  type ErrorCode = typingsJapgolly.awsSdk.codedeployMod._ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DISALLOW
    - typingsJapgolly.awsSdk.awsSdkStrings.OVERWRITE
    - typingsJapgolly.awsSdk.awsSdkStrings.RETAIN
    - java.lang.String
  */
  type FileExistsBehavior = typingsJapgolly.awsSdk.codedeployMod._FileExistsBehavior | java.lang.String
  type FilterValue = java.lang.String
  type FilterValueList = js.Array[typingsJapgolly.awsSdk.codedeployMod.FilterValue]
  type GitHubAccountTokenName = java.lang.String
  type GitHubAccountTokenNameList = js.Array[typingsJapgolly.awsSdk.codedeployMod.GitHubAccountTokenName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DISCOVER_EXISTING
    - typingsJapgolly.awsSdk.awsSdkStrings.COPY_AUTO_SCALING_GROUP
    - java.lang.String
  */
  type GreenFleetProvisioningAction = typingsJapgolly.awsSdk.codedeployMod._GreenFleetProvisioningAction | java.lang.String
  type IamSessionArn = java.lang.String
  type IamUserArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE
    - typingsJapgolly.awsSdk.awsSdkStrings.KEEP_ALIVE
    - java.lang.String
  */
  type InstanceAction = typingsJapgolly.awsSdk.codedeployMod._InstanceAction | java.lang.String
  type InstanceArn = java.lang.String
  type InstanceCount = scala.Double
  type InstanceId = java.lang.String
  type InstanceInfoList = js.Array[typingsJapgolly.awsSdk.codedeployMod.InstanceInfo]
  type InstanceName = java.lang.String
  type InstanceNameList = js.Array[typingsJapgolly.awsSdk.codedeployMod.InstanceName]
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
  type InstanceStatus = typingsJapgolly.awsSdk.codedeployMod._InstanceStatus | java.lang.String
  type InstanceStatusList = js.Array[typingsJapgolly.awsSdk.codedeployMod.InstanceStatus]
  type InstanceSummaryList = js.Array[typingsJapgolly.awsSdk.codedeployMod.InstanceSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Blue_
    - typingsJapgolly.awsSdk.awsSdkStrings.Green_
    - java.lang.String
  */
  type InstanceType = typingsJapgolly.awsSdk.codedeployMod._InstanceType | java.lang.String
  type InstanceTypeList = js.Array[typingsJapgolly.awsSdk.codedeployMod.InstanceType]
  type InstancesList = js.Array[typingsJapgolly.awsSdk.codedeployMod.InstanceId]
  type Key = java.lang.String
  type LambdaFunctionAlias = java.lang.String
  type LambdaFunctionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Success_
    - typingsJapgolly.awsSdk.awsSdkStrings.ScriptMissing
    - typingsJapgolly.awsSdk.awsSdkStrings.ScriptNotExecutable
    - typingsJapgolly.awsSdk.awsSdkStrings.ScriptTimedOut
    - typingsJapgolly.awsSdk.awsSdkStrings.ScriptFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.UnknownError
    - java.lang.String
  */
  type LifecycleErrorCode = typingsJapgolly.awsSdk.codedeployMod._LifecycleErrorCode | java.lang.String
  type LifecycleEventHookExecutionId = java.lang.String
  type LifecycleEventList = js.Array[typingsJapgolly.awsSdk.codedeployMod.LifecycleEvent]
  type LifecycleEventName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Skipped_
    - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type LifecycleEventStatus = typingsJapgolly.awsSdk.codedeployMod._LifecycleEventStatus | java.lang.String
  type LifecycleMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.include_
    - typingsJapgolly.awsSdk.awsSdkStrings.exclude_
    - typingsJapgolly.awsSdk.awsSdkStrings.ignore__
    - java.lang.String
  */
  type ListStateFilterAction = typingsJapgolly.awsSdk.codedeployMod._ListStateFilterAction | java.lang.String
  type ListenerArn = java.lang.String
  type ListenerArnList = js.Array[typingsJapgolly.awsSdk.codedeployMod.ListenerArn]
  type LogTail = java.lang.String
  type Message = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HOST_COUNT
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_PERCENT
    - java.lang.String
  */
  type MinimumHealthyHostsType = typingsJapgolly.awsSdk.codedeployMod._MinimumHealthyHostsType | java.lang.String
  type MinimumHealthyHostsValue = scala.Double
  type NextToken = java.lang.String
  type NullableBoolean = scala.Boolean
  type OnPremisesTagSetList = js.Array[typingsJapgolly.awsSdk.codedeployMod.TagFilterList]
  type Percentage = scala.Double
  type RawStringContent = java.lang.String
  type RawStringSha256 = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Registered_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deregistered_
    - java.lang.String
  */
  type RegistrationStatus = typingsJapgolly.awsSdk.codedeployMod._RegistrationStatus | java.lang.String
  type Repository = java.lang.String
  type RevisionInfoList = js.Array[typingsJapgolly.awsSdk.codedeployMod.RevisionInfo]
  type RevisionLocationList = js.Array[typingsJapgolly.awsSdk.codedeployMod.RevisionLocation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.S3
    - typingsJapgolly.awsSdk.awsSdkStrings.GitHub_
    - typingsJapgolly.awsSdk.awsSdkStrings.String_
    - typingsJapgolly.awsSdk.awsSdkStrings.AppSpecContent
    - java.lang.String
  */
  type RevisionLocationType = typingsJapgolly.awsSdk.codedeployMod._RevisionLocationType | java.lang.String
  type Role = java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type ScriptName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ascending__
    - typingsJapgolly.awsSdk.awsSdkStrings.descending__
    - java.lang.String
  */
  type SortOrder = typingsJapgolly.awsSdk.codedeployMod._SortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
    - java.lang.String
  */
  type StopStatus = typingsJapgolly.awsSdk.codedeployMod._StopStatus | java.lang.String
  type TagFilterList = js.Array[typingsJapgolly.awsSdk.codedeployMod.TagFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.KEY_ONLY
    - typingsJapgolly.awsSdk.awsSdkStrings.VALUE_ONLY
    - typingsJapgolly.awsSdk.awsSdkStrings.KEY_AND_VALUE
    - java.lang.String
  */
  type TagFilterType = typingsJapgolly.awsSdk.codedeployMod._TagFilterType | java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.codedeployMod.Key]
  type TagList = js.Array[typingsJapgolly.awsSdk.codedeployMod.Tag]
  type TargetArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TargetStatus
    - typingsJapgolly.awsSdk.awsSdkStrings.ServerInstanceLabel
    - java.lang.String
  */
  type TargetFilterName = typingsJapgolly.awsSdk.codedeployMod._TargetFilterName | java.lang.String
  type TargetFilters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.codedeployMod.FilterValueList]
  type TargetGroupInfoList = js.Array[typingsJapgolly.awsSdk.codedeployMod.TargetGroupInfo]
  type TargetGroupName = java.lang.String
  type TargetGroupPairInfoList = js.Array[typingsJapgolly.awsSdk.codedeployMod.TargetGroupPairInfo]
  type TargetId = java.lang.String
  type TargetIdList = js.Array[typingsJapgolly.awsSdk.codedeployMod.TargetId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Blue_
    - typingsJapgolly.awsSdk.awsSdkStrings.Green_
    - java.lang.String
  */
  type TargetLabel = typingsJapgolly.awsSdk.codedeployMod._TargetLabel | java.lang.String
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
  type TargetStatus = typingsJapgolly.awsSdk.codedeployMod._TargetStatus | java.lang.String
  type Time = js.Date
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TimeBasedCanary
    - typingsJapgolly.awsSdk.awsSdkStrings.TimeBasedLinear
    - typingsJapgolly.awsSdk.awsSdkStrings.AllAtOnce
    - java.lang.String
  */
  type TrafficRoutingType = typingsJapgolly.awsSdk.codedeployMod._TrafficRoutingType | java.lang.String
  type TrafficWeight = scala.Double
  type TriggerConfigList = js.Array[typingsJapgolly.awsSdk.codedeployMod.TriggerConfig]
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
  type TriggerEventType = typingsJapgolly.awsSdk.codedeployMod._TriggerEventType | java.lang.String
  type TriggerEventTypeList = js.Array[typingsJapgolly.awsSdk.codedeployMod.TriggerEventType]
  type TriggerName = java.lang.String
  type TriggerTargetArn = java.lang.String
  type Value = java.lang.String
  type Version = java.lang.String
  type VersionId = java.lang.String
  type WaitTimeInMins = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-10-06`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.codedeployMod._apiVersion | java.lang.String
}
