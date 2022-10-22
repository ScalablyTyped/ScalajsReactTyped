package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.AUTO_SCALING
import typingsJapgolly.awsSdk.awsSdkStrings.CLAIMED
import typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
import typingsJapgolly.awsSdk.awsSdkStrings.INTERRUPTED
import typingsJapgolly.awsSdk.awsSdkStrings.PENDING_UPDATE
import typingsJapgolly.awsSdk.awsSdkStrings.REPLACE_INSTANCE_TYPES
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCEPT
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECT
  - java.lang.String
*/
type AcceptanceType = _AcceptanceType | String

type AliasArn = String

type AliasId = String

type AliasIdOrArn = String

type AliasList = js.Array[Alias]

type AmazonResourceName = String

type ArnStringModel = String

type AutoScalingGroupArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATIC
  - typingsJapgolly.awsSdk.awsSdkStrings.MANUAL
  - java.lang.String
*/
type BackfillMode = _BackfillMode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SPOT_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.SPOT_PREFERRED
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND_ONLY
  - java.lang.String
*/
type BalancingStrategy = _BalancingStrategy | String

type BooleanModel = Boolean

type BuildArn = String

type BuildId = String

type BuildIdOrArn = String

type BuildList = js.Array[Build]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZED
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type BuildStatus = _BuildStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.GENERATED
  - java.lang.String
*/
type CertificateType = _CertificateType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanThreshold
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThanThreshold
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
  - java.lang.String
*/
type ComparisonOperatorType = _ComparisonOperatorType | String

type CustomEventData = String

type DesiredPlayerSessionList = js.Array[DesiredPlayerSession]

type DnsName = String

type Double = scala.Double

type DoubleObject = scala.Double

type EC2InstanceLimitList = js.Array[EC2InstanceLimit]

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
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDot24xlarge
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
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot24xlarge
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
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5dDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5dDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5dDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5dDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5dDot9xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5dDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5dDot18xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5dDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6aDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6aDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6aDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6aDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6aDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6aDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6aDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6aDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6iDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6iDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6iDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6iDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6iDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6iDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6iDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6iDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5dDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5dDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5dDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5dDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5dDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5dDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5dDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5dDot24xlarge
  - java.lang.String
*/
type EC2InstanceType = _EC2InstanceType | String

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
type EventCode = _EventCode | String

type EventList = js.Array[Event]

type FleetAction = AUTO_SCALING | String

type FleetActionList = js.Array[FleetAction]

type FleetArn = String

type FleetAttributesList = js.Array[FleetAttributes]

type FleetCapacityList = js.Array[FleetCapacity]

type FleetId = String

type FleetIdList = js.Array[FleetId]

type FleetIdOrArn = String

type FleetIdOrArnList = js.Array[FleetIdOrArn]

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
type FleetStatus = _FleetStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND
  - typingsJapgolly.awsSdk.awsSdkStrings.SPOT
  - java.lang.String
*/
type FleetType = _FleetType | String

type FleetUtilizationList = js.Array[FleetUtilization]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDALONE
  - typingsJapgolly.awsSdk.awsSdkStrings.WITH_QUEUE
  - java.lang.String
*/
type FlexMatchMode = _FlexMatchMode | String

type Float = scala.Double

type FreeText = String

type GamePropertyKey = String

type GamePropertyList = js.Array[GameProperty]

type GamePropertyValue = String

type GameServerClaimStatus = CLAIMED | String

type GameServerConnectionInfo = String

type GameServerData = String

type GameServerGroupAction = REPLACE_INSTANCE_TYPES | String

type GameServerGroupActions = js.Array[GameServerGroupAction]

type GameServerGroupArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SAFE_DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.FORCE_DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.RETAIN
  - java.lang.String
*/
type GameServerGroupDeleteOption = _GameServerGroupDeleteOption | String

/* Rewritten from type alias, can be one of: 
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
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c5aDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6gDotmedium
  - typingsJapgolly.awsSdk.awsSdkStrings.c6gDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6gDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6gDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6gDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6gDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6gDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.c6gDot16xlarge
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
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gDotmedium
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.r6gDot16xlarge
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
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot24xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m6gDotmedium
  - typingsJapgolly.awsSdk.awsSdkStrings.m6gDotlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m6gDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m6gDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m6gDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m6gDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m6gDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.m6gDot16xlarge
  - java.lang.String
*/
type GameServerGroupInstanceType = _GameServerGroupInstanceType | String

type GameServerGroupName = String

type GameServerGroupNameOrArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NEW
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_SCHEDULED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type GameServerGroupStatus = _GameServerGroupStatus | String

type GameServerGroups = js.Array[GameServerGroup]

type GameServerHealthCheck = HEALTHY | String

type GameServerId = String

type GameServerInstanceId = String

type GameServerInstanceIds = js.Array[GameServerInstanceId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DRAINING
  - typingsJapgolly.awsSdk.awsSdkStrings.SPOT_TERMINATING
  - java.lang.String
*/
type GameServerInstanceStatus = _GameServerInstanceStatus | String

type GameServerInstances = js.Array[GameServerInstance]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_PROTECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.FULL_PROTECTION
  - java.lang.String
*/
type GameServerProtectionPolicy = _GameServerProtectionPolicy | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.UTILIZED
  - java.lang.String
*/
type GameServerUtilizationStatus = _GameServerUtilizationStatus | String

type GameServers = js.Array[GameServer]

type GameSessionActivationTimeoutSeconds = scala.Double

type GameSessionData = String

type GameSessionDetailList = js.Array[GameSessionDetail]

type GameSessionList = js.Array[GameSession]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.FULFILLED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type GameSessionPlacementState = _GameSessionPlacementState | String

type GameSessionQueueArn = String

type GameSessionQueueDestinationList = js.Array[GameSessionQueueDestination]

type GameSessionQueueList = js.Array[GameSessionQueue]

type GameSessionQueueName = String

type GameSessionQueueNameOrArn = String

type GameSessionQueueNameOrArnList = js.Array[GameSessionQueueNameOrArn]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATING
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type GameSessionStatus = _GameSessionStatus | String

type GameSessionStatusReason = INTERRUPTED | String

type IamRoleArn = String

type IdStringModel = String

type InstanceDefinitions = js.Array[InstanceDefinition]

type InstanceId = String

type InstanceList = js.Array[Instance]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATING
  - java.lang.String
*/
type InstanceStatus = _InstanceStatus | String

type Integer = scala.Double

type IpAddress = String

type IpPermissionsList = js.Array[IpPermission]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TCP
  - typingsJapgolly.awsSdk.awsSdkStrings.UDP
  - java.lang.String
*/
type IpProtocol = _IpProtocol | String

type LargeGameSessionData = String

type LatencyMap = StringDictionary[PositiveInteger]

type LaunchParametersStringModel = String

type LaunchPathStringModel = String

type LaunchTemplateId = String

type LaunchTemplateName = String

type LaunchTemplateVersion = String

type LocationAttributesList = js.Array[LocationAttributes]

type LocationConfigurationList = js.Array[LocationConfiguration]

type LocationList = js.Array[LocationStringModel]

type LocationStateList = js.Array[LocationState]

type LocationStringModel = String

type LocationUpdateStatus = PENDING_UPDATE | String

type MatchedPlayerSessionList = js.Array[MatchedPlayerSession]

type MatchmakerData = String

type MatchmakingAcceptanceTimeoutInteger = scala.Double

type MatchmakingConfigurationArn = String

type MatchmakingConfigurationList = js.Array[MatchmakingConfiguration]

type MatchmakingConfigurationName = String

type MatchmakingConfigurationNameList = js.Array[MatchmakingConfigurationName]

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
type MatchmakingConfigurationStatus = _MatchmakingConfigurationStatus | String

type MatchmakingIdList = js.Array[MatchmakingIdStringModel]

type MatchmakingIdStringModel = String

type MatchmakingRequestTimeoutInteger = scala.Double

type MatchmakingRuleSetArn = String

type MatchmakingRuleSetList = js.Array[MatchmakingRuleSet]

type MatchmakingRuleSetName = String

type MatchmakingRuleSetNameList = js.Array[MatchmakingRuleSetName]

type MatchmakingTicketList = js.Array[MatchmakingTicket]

type MaxConcurrentGameSessionActivations = scala.Double

type MetricGroup = String

type MetricGroupList = js.Array[MetricGroup]

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
type MetricName = _MetricName | String

type NonBlankAndLengthConstraintString = String

type NonBlankString = String

type NonEmptyString = String

type NonNegativeDouble = scala.Double

type NonZeroAndMaxString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_2012
  - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_LINUX
  - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_LINUX_2
  - java.lang.String
*/
type OperatingSystem = _OperatingSystem | String

type PlacedPlayerSessionList = js.Array[PlacedPlayerSession]

type PlayerAttributeMap = StringDictionary[AttributeValue]

type PlayerData = String

type PlayerDataMap = StringDictionary[PlayerData]

type PlayerIdList = js.Array[NonZeroAndMaxString]

type PlayerLatencyList = js.Array[PlayerLatency]

type PlayerLatencyPolicyList = js.Array[PlayerLatencyPolicy]

type PlayerList = js.Array[Player]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCEPT_ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.DENY_ALL
  - java.lang.String
*/
type PlayerSessionCreationPolicy = _PlayerSessionCreationPolicy | String

type PlayerSessionId = String

type PlayerSessionList = js.Array[PlayerSession]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RESERVED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMEDOUT
  - java.lang.String
*/
type PlayerSessionStatus = _PlayerSessionStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RuleBased
  - typingsJapgolly.awsSdk.awsSdkStrings.TargetBased
  - java.lang.String
*/
type PolicyType = _PolicyType | String

type PortNumber = scala.Double

type PositiveInteger = scala.Double

type PositiveLong = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LATENCY
  - typingsJapgolly.awsSdk.awsSdkStrings.COST
  - typingsJapgolly.awsSdk.awsSdkStrings.DESTINATION
  - typingsJapgolly.awsSdk.awsSdkStrings.LOCATION
  - java.lang.String
*/
type PriorityType = _PriorityType | String

type PriorityTypeList = js.Array[PriorityType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NoProtection
  - typingsJapgolly.awsSdk.awsSdkStrings.FullProtection
  - java.lang.String
*/
type ProtectionPolicy = _ProtectionPolicy | String

type QueueArnsList = js.Array[ArnStringModel]

type QueueCustomEventData = String

type QueueSnsArnStringModel = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SIMPLE
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINAL
  - java.lang.String
*/
type RoutingStrategyType = _RoutingStrategyType | String

type RuleSetBody = String

type RuleSetLimit = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ChangeInCapacity
  - typingsJapgolly.awsSdk.awsSdkStrings.ExactCapacity
  - typingsJapgolly.awsSdk.awsSdkStrings.PercentChangeInCapacity
  - java.lang.String
*/
type ScalingAdjustmentType = _ScalingAdjustmentType | String

type ScalingPolicyList = js.Array[ScalingPolicy]

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
type ScalingStatusType = _ScalingStatusType | String

type ScriptArn = String

type ScriptId = String

type ScriptIdOrArn = String

type ScriptList = js.Array[Script]

type ServerProcessList = js.Array[ServerProcess]

type SnsArnStringModel = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | String

type StringDoubleMap = StringDictionary[DoubleObject]

type StringList = js.Array[NonZeroAndMaxString]

type StringModel = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type Timestamp = js.Date

type VpcPeeringAuthorizationList = js.Array[VpcPeeringAuthorization]

type VpcPeeringConnectionList = js.Array[VpcPeeringConnection]

type VpcSubnet = String

type VpcSubnets = js.Array[VpcSubnet]

type WeightedCapacity = String

type WholeNumber = scala.Double

type ZipBlob = Buffer | js.typedarray.Uint8Array | Blob | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2015-10-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
