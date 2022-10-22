package typingsJapgolly.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.CANCEL
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AssociateClientDeviceWithCoreDeviceEntryList = js.Array[AssociateClientDeviceWithCoreDeviceEntry]

type AssociateClientDeviceWithCoreDeviceErrorList = js.Array[AssociateClientDeviceWithCoreDeviceErrorEntry]

type AssociatedClientDeviceList = js.Array[AssociatedClientDevice]

type CPU = Double

type ClientTokenString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUESTED
  - typingsJapgolly.awsSdk.awsSdkStrings.INITIATED
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPRECATED
  - java.lang.String
*/
type CloudComponentState = _CloudComponentState | java.lang.String

type ComponentARN = java.lang.String

type ComponentCandidateList = js.Array[ComponentCandidate]

type ComponentConfigurationPath = java.lang.String

type ComponentConfigurationPathList = js.Array[ComponentConfigurationPath]

type ComponentConfigurationString = java.lang.String

type ComponentDependencyMap = StringDictionary[ComponentDependencyRequirement]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HARD
  - typingsJapgolly.awsSdk.awsSdkStrings.SOFT
  - java.lang.String
*/
type ComponentDependencyType = _ComponentDependencyType | java.lang.String

type ComponentDeploymentSpecifications = StringDictionary[ComponentDeploymentSpecification]

type ComponentList = js.Array[Component]

type ComponentNameString = java.lang.String

type ComponentPlatformList = js.Array[ComponentPlatform]

type ComponentVersionARN = java.lang.String

type ComponentVersionList = js.Array[ComponentVersionListItem]

type ComponentVersionRequirementMap = StringDictionary[NonEmptyString]

type ComponentVersionString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC
  - java.lang.String
*/
type ComponentVisibilityScope = _ComponentVisibilityScope | java.lang.String

type CoreDeviceArchitectureString = java.lang.String

type CoreDevicePlatformString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
  - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
  - java.lang.String
*/
type CoreDeviceStatus = _CoreDeviceStatus | java.lang.String

type CoreDeviceThingName = java.lang.String

type CoreDevicesList = js.Array[CoreDevice]

type DefaultMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOTIFY_COMPONENTS
  - typingsJapgolly.awsSdk.awsSdkStrings.SKIP_NOTIFY_COMPONENTS
  - java.lang.String
*/
type DeploymentComponentUpdatePolicyAction = _DeploymentComponentUpdatePolicyAction | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLBACK
  - typingsJapgolly.awsSdk.awsSdkStrings.DO_NOTHING
  - java.lang.String
*/
type DeploymentFailureHandlingPolicy = _DeploymentFailureHandlingPolicy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.LATEST_ONLY
  - java.lang.String
*/
type DeploymentHistoryFilter = _DeploymentHistoryFilter | java.lang.String

type DeploymentID = java.lang.String

type DeploymentList = js.Array[Deployment]

type DeploymentName = java.lang.String

type DeploymentNameString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type DeploymentStatus = _DeploymentStatus | java.lang.String

type Description = java.lang.String

type DescriptionString = java.lang.String

type DisassociateClientDeviceFromCoreDeviceEntryList = js.Array[DisassociateClientDeviceFromCoreDeviceEntry]

type DisassociateClientDeviceFromCoreDeviceErrorList = js.Array[DisassociateClientDeviceFromCoreDeviceErrorEntry]

type EffectiveDeploymentErrorCode = java.lang.String

type EffectiveDeploymentErrorStack = js.Array[EffectiveDeploymentErrorCode]

type EffectiveDeploymentErrorType = java.lang.String

type EffectiveDeploymentErrorTypeList = js.Array[EffectiveDeploymentErrorType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
  - java.lang.String
*/
type EffectiveDeploymentExecutionStatus = _EffectiveDeploymentExecutionStatus | java.lang.String

type EffectiveDeploymentsList = js.Array[EffectiveDeployment]

type FileSystemPath = java.lang.String

type GGCVersion = java.lang.String

type GenericV2ARN = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NEW
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTALLED
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.ERRORED
  - typingsJapgolly.awsSdk.awsSdkStrings.BROKEN
  - typingsJapgolly.awsSdk.awsSdkStrings.FINISHED
  - java.lang.String
*/
type InstalledComponentLifecycleState = _InstalledComponentLifecycleState | java.lang.String

type InstalledComponentLifecycleStatusCode = java.lang.String

type InstalledComponentLifecycleStatusCodeList = js.Array[InstalledComponentLifecycleStatusCode]

type InstalledComponentList = js.Array[InstalledComponent]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.ROOT
  - java.lang.String
*/
type InstalledComponentTopologyFilter = _InstalledComponentTopologyFilter | java.lang.String

type IoTJobARN = java.lang.String

type IoTJobAbortAction = CANCEL | java.lang.String

type IoTJobAbortCriteriaList = js.Array[IoTJobAbortCriteria]

type IoTJobAbortThresholdPercentage = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type IoTJobExecutionFailureType = _IoTJobExecutionFailureType | java.lang.String

type IoTJobId = java.lang.String

type IoTJobInProgressTimeoutInMinutes = Double

type IoTJobMaxExecutionsPerMin = Double

type IoTJobMinimumNumberOfExecutedThings = Double

type IoTJobNumberOfThings = Double

type IoTJobRolloutBaseRatePerMinute = Double

type IoTJobRolloutIncrementFactor = Double

type IoTThingName = java.lang.String

type IsLatestForTarget = Boolean

type IsRoot = Boolean

type LambdaDeviceList = js.Array[LambdaDeviceMount]

type LambdaEnvironmentVariables = StringDictionary[String]

type LambdaEventSourceList = js.Array[LambdaEventSource]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PUB_SUB
  - typingsJapgolly.awsSdk.awsSdkStrings.IOT_CORE
  - java.lang.String
*/
type LambdaEventSourceType = _LambdaEventSourceType | java.lang.String

type LambdaExecArg = java.lang.String

type LambdaExecArgsList = js.Array[LambdaExecArg]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ro_
  - typingsJapgolly.awsSdk.awsSdkStrings.rw_
  - java.lang.String
*/
type LambdaFilesystemPermission = _LambdaFilesystemPermission | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.json__
  - typingsJapgolly.awsSdk.awsSdkStrings.binary__
  - java.lang.String
*/
type LambdaInputPayloadEncodingType = _LambdaInputPayloadEncodingType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GreengrassContainer
  - typingsJapgolly.awsSdk.awsSdkStrings.NoContainer
  - java.lang.String
*/
type LambdaIsolationMode = _LambdaIsolationMode | java.lang.String

type LambdaVolumeList = js.Array[LambdaVolumeMount]

type LifecycleStateDetails = java.lang.String

type Memory = Double

type NextTokenString = java.lang.String

type NonEmptyString = java.lang.String

type NullableString = java.lang.String

type OptionalBoolean = Boolean

type OptionalInteger = Double

type PlatformAttributesMap = StringDictionary[NonEmptyString]

type PortNumberInt = Double

type PublisherString = java.lang.String

type Reason = java.lang.String

type RecipeBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - typingsJapgolly.awsSdk.awsSdkStrings.YAML
  - java.lang.String
*/
type RecipeOutputFormat = _RecipeOutputFormat | java.lang.String

type ResolvedComponentVersionsList = js.Array[ResolvedComponentVersion]

type String = java.lang.String

type StringMap = StringDictionary[NonEmptyString]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type TargetARN = java.lang.String

type ThingGroupARN = java.lang.String

type Timestamp = js.Date

type TopicString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISCONTINUED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type VendorGuidance = _VendorGuidance | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-11-30`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type connectivityInfoList = js.Array[ConnectivityInfo]
