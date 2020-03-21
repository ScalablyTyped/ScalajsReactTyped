package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gameliftMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCEPT
    - typingsJapgolly.awsSdk.awsSdkStrings.REJECT
    - java.lang.String
  */
  type AcceptanceType = typingsJapgolly.awsSdk.gameliftMod._AcceptanceType | java.lang.String
  type AliasId = java.lang.String
  type AliasList = js.Array[typingsJapgolly.awsSdk.gameliftMod.Alias]
  type AmazonResourceName = java.lang.String
  type ArnStringModel = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATIC
    - typingsJapgolly.awsSdk.awsSdkStrings.MANUAL
    - java.lang.String
  */
  type BackfillMode = typingsJapgolly.awsSdk.gameliftMod._BackfillMode | java.lang.String
  type BooleanModel = scala.Boolean
  type BuildArn = java.lang.String
  type BuildId = java.lang.String
  type BuildList = js.Array[typingsJapgolly.awsSdk.gameliftMod.Build]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZED
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type BuildStatus = typingsJapgolly.awsSdk.gameliftMod._BuildStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.GENERATED
    - java.lang.String
  */
  type CertificateType = typingsJapgolly.awsSdk.gameliftMod._CertificateType | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.gameliftMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
    - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanThreshold
    - typingsJapgolly.awsSdk.awsSdkStrings.LessThanThreshold
    - typingsJapgolly.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
    - java.lang.String
  */
  type ComparisonOperatorType = typingsJapgolly.awsSdk.gameliftMod._ComparisonOperatorType | java.lang.String
  type CustomEventData = java.lang.String
  type DesiredPlayerSessionList = js.Array[typingsJapgolly.awsSdk.gameliftMod.DesiredPlayerSession]
  type DnsName = java.lang.String
  type Double = scala.Double
  type DoubleObject = scala.Double
  type EC2InstanceLimitList = js.Array[typingsJapgolly.awsSdk.gameliftMod.EC2InstanceLimit]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.t2Dotmicro
    - typingsJapgolly.awsSdk.awsSdkStrings.t2Dotsmall
    - typingsJapgolly.awsSdk.awsSdkStrings.t2Dotmedium
    - typingsJapgolly.awsSdk.awsSdkStrings.t2Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c3Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c3Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c3Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c3Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c3Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c4Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c4Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c4Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c4Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c4Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot9xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot18xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r3Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r3Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r3Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r3Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r3Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m3Dotmedium
    - typingsJapgolly.awsSdk.awsSdkStrings.m3Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m3Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m3Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m4Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m4Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m4Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m4Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m4Dot10xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot24xlarge
    - java.lang.String
  */
  type EC2InstanceType = typingsJapgolly.awsSdk.gameliftMod._EC2InstanceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GENERIC_EVENT
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_CREATED
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_SCALING_EVENT
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_STATE_DOWNLOADING
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_STATE_VALIDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_STATE_BUILDING
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_STATE_ACTIVATING
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_STATE_ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_STATE_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_INITIALIZATION_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_BINARY_DOWNLOAD_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_VALIDATION_TIMED_OUT
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_ACTIVATION_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_ACTIVATION_FAILED_NO_INSTANCES
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_PROCESS_INVALID_PATH
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_PROCESS_PROCESS_READY_TIMEOUT
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_PROCESS_CRASHED
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_PROCESS_TERMINATED_UNHEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_PROCESS_FORCE_TERMINATED
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_PROCESS_PROCESS_EXIT_TIMEOUT
    - typingsJapgolly.awsSdk.awsSdkStrings.GAME_SESSION_ACTIVATION_TIMEOUT
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_CREATION_EXTRACTING_BUILD
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_CREATION_RUNNING_INSTALLER
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_CREATION_VALIDATING_RUNTIME_CONFIG
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_VPC_PEERING_SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_VPC_PEERING_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_VPC_PEERING_DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_INTERRUPTED
    - java.lang.String
  */
  type EventCode = typingsJapgolly.awsSdk.gameliftMod._EventCode | java.lang.String
  type EventList = js.Array[typingsJapgolly.awsSdk.gameliftMod.Event]
  type FleetAction = typingsJapgolly.awsSdk.awsSdkStrings.AUTO_SCALING | java.lang.String
  type FleetActionList = js.Array[typingsJapgolly.awsSdk.gameliftMod.FleetAction]
  type FleetAttributesList = js.Array[typingsJapgolly.awsSdk.gameliftMod.FleetAttributes]
  type FleetCapacityList = js.Array[typingsJapgolly.awsSdk.gameliftMod.FleetCapacity]
  type FleetId = java.lang.String
  type FleetIdList = js.Array[typingsJapgolly.awsSdk.gameliftMod.FleetId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NEW
    - typingsJapgolly.awsSdk.awsSdkStrings.DOWNLOADING
    - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.BUILDING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
    - java.lang.String
  */
  type FleetStatus = typingsJapgolly.awsSdk.gameliftMod._FleetStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND
    - typingsJapgolly.awsSdk.awsSdkStrings.SPOT
    - java.lang.String
  */
  type FleetType = typingsJapgolly.awsSdk.gameliftMod._FleetType | java.lang.String
  type FleetUtilizationList = js.Array[typingsJapgolly.awsSdk.gameliftMod.FleetUtilization]
  type Float = scala.Double
  type FreeText = java.lang.String
  type GamePropertyKey = java.lang.String
  type GamePropertyList = js.Array[typingsJapgolly.awsSdk.gameliftMod.GameProperty]
  type GamePropertyValue = java.lang.String
  type GameSessionActivationTimeoutSeconds = scala.Double
  type GameSessionData = java.lang.String
  type GameSessionDetailList = js.Array[typingsJapgolly.awsSdk.gameliftMod.GameSessionDetail]
  type GameSessionList = js.Array[typingsJapgolly.awsSdk.gameliftMod.GameSession]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.FULFILLED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type GameSessionPlacementState = typingsJapgolly.awsSdk.gameliftMod._GameSessionPlacementState | java.lang.String
  type GameSessionQueueDestinationList = js.Array[typingsJapgolly.awsSdk.gameliftMod.GameSessionQueueDestination]
  type GameSessionQueueList = js.Array[typingsJapgolly.awsSdk.gameliftMod.GameSessionQueue]
  type GameSessionQueueName = java.lang.String
  type GameSessionQueueNameList = js.Array[typingsJapgolly.awsSdk.gameliftMod.GameSessionQueueName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATING
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type GameSessionStatus = typingsJapgolly.awsSdk.gameliftMod._GameSessionStatus | java.lang.String
  type GameSessionStatusReason = typingsJapgolly.awsSdk.awsSdkStrings.INTERRUPTED | java.lang.String
  type IdStringModel = java.lang.String
  type InstanceId = java.lang.String
  type InstanceList = js.Array[typingsJapgolly.awsSdk.gameliftMod.Instance]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATING
    - java.lang.String
  */
  type InstanceStatus = typingsJapgolly.awsSdk.gameliftMod._InstanceStatus | java.lang.String
  type Integer = scala.Double
  type IpAddress = java.lang.String
  type IpPermissionsList = js.Array[typingsJapgolly.awsSdk.gameliftMod.IpPermission]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TCP
    - typingsJapgolly.awsSdk.awsSdkStrings.UDP
    - java.lang.String
  */
  type IpProtocol = typingsJapgolly.awsSdk.gameliftMod._IpProtocol | java.lang.String
  type LatencyMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.gameliftMod.PositiveInteger]
  type MatchedPlayerSessionList = js.Array[typingsJapgolly.awsSdk.gameliftMod.MatchedPlayerSession]
  type MatchmakerData = java.lang.String
  type MatchmakingAcceptanceTimeoutInteger = scala.Double
  type MatchmakingConfigurationArn = java.lang.String
  type MatchmakingConfigurationList = js.Array[typingsJapgolly.awsSdk.gameliftMod.MatchmakingConfiguration]
  type MatchmakingConfigurationName = java.lang.String
  type MatchmakingConfigurationNameList = js.Array[typingsJapgolly.awsSdk.gameliftMod.MatchmakingConfigurationName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.PLACING
    - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
    - typingsJapgolly.awsSdk.awsSdkStrings.REQUIRES_ACCEPTANCE
    - typingsJapgolly.awsSdk.awsSdkStrings.SEARCHING
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
    - java.lang.String
  */
  type MatchmakingConfigurationStatus = typingsJapgolly.awsSdk.gameliftMod._MatchmakingConfigurationStatus | java.lang.String
  type MatchmakingIdList = js.Array[typingsJapgolly.awsSdk.gameliftMod.MatchmakingIdStringModel]
  type MatchmakingIdStringModel = java.lang.String
  type MatchmakingRequestTimeoutInteger = scala.Double
  type MatchmakingRuleSetArn = java.lang.String
  type MatchmakingRuleSetList = js.Array[typingsJapgolly.awsSdk.gameliftMod.MatchmakingRuleSet]
  type MatchmakingRuleSetName = java.lang.String
  type MatchmakingRuleSetNameList = js.Array[typingsJapgolly.awsSdk.gameliftMod.MatchmakingRuleSetName]
  type MatchmakingTicketList = js.Array[typingsJapgolly.awsSdk.gameliftMod.MatchmakingTicket]
  type MaxConcurrentGameSessionActivations = scala.Double
  type MetricGroup = java.lang.String
  type MetricGroupList = js.Array[typingsJapgolly.awsSdk.gameliftMod.MetricGroup]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ActivatingGameSessions
    - typingsJapgolly.awsSdk.awsSdkStrings.ActiveGameSessions
    - typingsJapgolly.awsSdk.awsSdkStrings.ActiveInstances
    - typingsJapgolly.awsSdk.awsSdkStrings.AvailableGameSessions
    - typingsJapgolly.awsSdk.awsSdkStrings.AvailablePlayerSessions
    - typingsJapgolly.awsSdk.awsSdkStrings.CurrentPlayerSessions
    - typingsJapgolly.awsSdk.awsSdkStrings.IdleInstances
    - typingsJapgolly.awsSdk.awsSdkStrings.PercentAvailableGameSessions
    - typingsJapgolly.awsSdk.awsSdkStrings.PercentIdleInstances
    - typingsJapgolly.awsSdk.awsSdkStrings.QueueDepth
    - typingsJapgolly.awsSdk.awsSdkStrings.WaitTime
    - java.lang.String
  */
  type MetricName = typingsJapgolly.awsSdk.gameliftMod._MetricName | java.lang.String
  type NonBlankAndLengthConstraintString = java.lang.String
  type NonBlankString = java.lang.String
  type NonEmptyString = java.lang.String
  type NonZeroAndMaxString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_2012
    - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_LINUX
    - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_LINUX_2
    - java.lang.String
  */
  type OperatingSystem = typingsJapgolly.awsSdk.gameliftMod._OperatingSystem | java.lang.String
  type PlacedPlayerSessionList = js.Array[typingsJapgolly.awsSdk.gameliftMod.PlacedPlayerSession]
  type PlayerAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.gameliftMod.AttributeValue]
  type PlayerData = java.lang.String
  type PlayerDataMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.gameliftMod.PlayerData]
  type PlayerIdList = js.Array[typingsJapgolly.awsSdk.gameliftMod.NonZeroAndMaxString]
  type PlayerLatencyList = js.Array[typingsJapgolly.awsSdk.gameliftMod.PlayerLatency]
  type PlayerLatencyPolicyList = js.Array[typingsJapgolly.awsSdk.gameliftMod.PlayerLatencyPolicy]
  type PlayerList = js.Array[typingsJapgolly.awsSdk.gameliftMod.Player]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCEPT_ALL
    - typingsJapgolly.awsSdk.awsSdkStrings.DENY_ALL
    - java.lang.String
  */
  type PlayerSessionCreationPolicy = typingsJapgolly.awsSdk.gameliftMod._PlayerSessionCreationPolicy | java.lang.String
  type PlayerSessionId = java.lang.String
  type PlayerSessionList = js.Array[typingsJapgolly.awsSdk.gameliftMod.PlayerSession]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RESERVED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMEDOUT
    - java.lang.String
  */
  type PlayerSessionStatus = typingsJapgolly.awsSdk.gameliftMod._PlayerSessionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RuleBased
    - typingsJapgolly.awsSdk.awsSdkStrings.TargetBased
    - java.lang.String
  */
  type PolicyType = typingsJapgolly.awsSdk.gameliftMod._PolicyType | java.lang.String
  type PortNumber = scala.Double
  type PositiveInteger = scala.Double
  type PositiveLong = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NoProtection
    - typingsJapgolly.awsSdk.awsSdkStrings.FullProtection
    - java.lang.String
  */
  type ProtectionPolicy = typingsJapgolly.awsSdk.gameliftMod._ProtectionPolicy | java.lang.String
  type QueueArnsList = js.Array[typingsJapgolly.awsSdk.gameliftMod.ArnStringModel]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SIMPLE
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINAL
    - java.lang.String
  */
  type RoutingStrategyType = typingsJapgolly.awsSdk.gameliftMod._RoutingStrategyType | java.lang.String
  type RuleSetBody = java.lang.String
  type RuleSetLimit = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ChangeInCapacity
    - typingsJapgolly.awsSdk.awsSdkStrings.ExactCapacity
    - typingsJapgolly.awsSdk.awsSdkStrings.PercentChangeInCapacity
    - java.lang.String
  */
  type ScalingAdjustmentType = typingsJapgolly.awsSdk.gameliftMod._ScalingAdjustmentType | java.lang.String
  type ScalingPolicyList = js.Array[typingsJapgolly.awsSdk.gameliftMod.ScalingPolicy]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_REQUESTED
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_REQUESTED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ScalingStatusType = typingsJapgolly.awsSdk.gameliftMod._ScalingStatusType | java.lang.String
  type ScriptArn = java.lang.String
  type ScriptId = java.lang.String
  type ScriptList = js.Array[typingsJapgolly.awsSdk.gameliftMod.Script]
  type ServerProcessList = js.Array[typingsJapgolly.awsSdk.gameliftMod.ServerProcess]
  type SnsArnStringModel = java.lang.String
  type StringDoubleMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.gameliftMod.DoubleObject]
  type StringList = js.Array[typingsJapgolly.awsSdk.gameliftMod.NonZeroAndMaxString]
  type StringModel = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.gameliftMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.gameliftMod.Tag]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  type VpcPeeringAuthorizationList = js.Array[typingsJapgolly.awsSdk.gameliftMod.VpcPeeringAuthorization]
  type VpcPeeringConnectionList = js.Array[typingsJapgolly.awsSdk.gameliftMod.VpcPeeringConnection]
  type WholeNumber = scala.Double
  type ZipBlob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.gameliftMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-10-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.gameliftMod._apiVersion | java.lang.String
}
