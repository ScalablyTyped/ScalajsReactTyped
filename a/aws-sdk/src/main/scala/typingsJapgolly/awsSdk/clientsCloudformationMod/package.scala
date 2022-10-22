package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.DETAILED_STATUS
import typingsJapgolly.awsSdk.awsSdkStrings.PRE_PROVISION
import typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE
import typingsJapgolly.awsSdk.awsSdkStrings.Resource_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AcceptTermsAndConditions = Boolean

type Account = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERSECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.DIFFERENCE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNION
  - java.lang.String
*/
type AccountFilterType = _AccountFilterType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SKIPPED
  - java.lang.String
*/
type AccountGateStatus = _AccountGateStatus | String

type AccountGateStatusReason = String

type AccountLimitList = js.Array[AccountLimit]

type AccountList = js.Array[Account]

type AccountsUrl = String

type AllowedValue = String

type AllowedValues = js.Array[AllowedValue]

type Arn = String

type AutoDeploymentNullable = Boolean

type AutoUpdate = Boolean

type BatchDescribeTypeConfigurationsErrors = js.Array[BatchDescribeTypeConfigurationsError]

type BoxedInteger = Double

type BoxedMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SELF
  - typingsJapgolly.awsSdk.awsSdkStrings.DELEGATED_ADMIN
  - java.lang.String
*/
type CallAs = _CallAs | String

type Capabilities = js.Array[Capability]

type CapabilitiesReason = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CAPABILITY_IAM
  - typingsJapgolly.awsSdk.awsSdkStrings.CAPABILITY_NAMED_IAM
  - typingsJapgolly.awsSdk.awsSdkStrings.CAPABILITY_AUTO_EXPAND
  - java.lang.String
*/
type Capability = _Capability | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REGISTERED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVATED
  - typingsJapgolly.awsSdk.awsSdkStrings.THIRD_PARTY
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_TYPES
  - java.lang.String
*/
type Category = _Category | String

type CausingEntity = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Add_
  - typingsJapgolly.awsSdk.awsSdkStrings.Modify_
  - typingsJapgolly.awsSdk.awsSdkStrings.Remove_
  - typingsJapgolly.awsSdk.awsSdkStrings.Import_
  - typingsJapgolly.awsSdk.awsSdkStrings.Dynamic_
  - java.lang.String
*/
type ChangeAction = _ChangeAction | String

type ChangeSetHooks = js.Array[ChangeSetHook]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PLANNING
  - typingsJapgolly.awsSdk.awsSdkStrings.PLANNED
  - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE
  - java.lang.String
*/
type ChangeSetHooksStatus = _ChangeSetHooksStatus | String

type ChangeSetId = String

type ChangeSetName = String

type ChangeSetNameOrId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ChangeSetStatus = _ChangeSetStatus | String

type ChangeSetStatusReason = String

type ChangeSetSummaries = js.Array[ChangeSetSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT
  - java.lang.String
*/
type ChangeSetType = _ChangeSetType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceReference
  - typingsJapgolly.awsSdk.awsSdkStrings.ParameterReference
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceAttribute
  - typingsJapgolly.awsSdk.awsSdkStrings.DirectModification
  - typingsJapgolly.awsSdk.awsSdkStrings.Automatic_
  - java.lang.String
*/
type ChangeSource = _ChangeSource | String

type ChangeType = Resource_ | String

type Changes = js.Array[Change]

type ClientRequestToken = String

type ClientToken = String

type ConfigurationSchema = String

type ConnectionArn = String

type CreationTime = js.Date

type DeletionTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPRECATED
  - java.lang.String
*/
type DeprecatedStatus = _DeprecatedStatus | String

type Description = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ADD
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EQUAL
  - java.lang.String
*/
type DifferenceType = _DifferenceType | String

type DisableRollback = Boolean

type DriftedStackInstancesCount = Double

type EnableTerminationProtection = Boolean

type ErrorCode = String

type ErrorMessage = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Static_
  - typingsJapgolly.awsSdk.awsSdkStrings.Dynamic_
  - java.lang.String
*/
type EvaluationType = _EvaluationType | String

type EventId = String

type ExecutionRoleName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.OBSOLETE
  - java.lang.String
*/
type ExecutionStatus = _ExecutionStatus | String

type ExportName = String

type ExportValue = String

type Exports = js.Array[Export]

type FailedStackInstancesCount = Double

type FailureToleranceCount = Double

type FailureTolerancePercentage = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NotUpdatable
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidRequest
  - typingsJapgolly.awsSdk.awsSdkStrings.AccessDenied
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidCredentials
  - typingsJapgolly.awsSdk.awsSdkStrings.AlreadyExists
  - typingsJapgolly.awsSdk.awsSdkStrings.NotFound
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceConflict
  - typingsJapgolly.awsSdk.awsSdkStrings.Throttling_
  - typingsJapgolly.awsSdk.awsSdkStrings.ServiceLimitExceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.NotStabilized
  - typingsJapgolly.awsSdk.awsSdkStrings.GeneralServiceException
  - typingsJapgolly.awsSdk.awsSdkStrings.ServiceInternalError
  - typingsJapgolly.awsSdk.awsSdkStrings.NetworkFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidTypeConfiguration
  - typingsJapgolly.awsSdk.awsSdkStrings.HandlerInternalFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.NonCompliant
  - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
  - java.lang.String
*/
type HandlerErrorCode = _HandlerErrorCode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FAIL
  - typingsJapgolly.awsSdk.awsSdkStrings.WARN
  - java.lang.String
*/
type HookFailureMode = _HookFailureMode | String

type HookInvocationCount = Double

type HookInvocationPoint = PRE_PROVISION | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HOOK_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.HOOK_COMPLETE_SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.HOOK_COMPLETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.HOOK_FAILED
  - java.lang.String
*/
type HookStatus = _HookStatus | String

type HookStatusReason = String

type HookTargetType = RESOURCE | String

type HookTargetTypeName = String

type HookType = String

type HookTypeConfigurationVersionId = String

type HookTypeName = String

type HookTypeVersionId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_Marketplace
  - typingsJapgolly.awsSdk.awsSdkStrings.GitHub_
  - typingsJapgolly.awsSdk.awsSdkStrings.Bitbucket_
  - java.lang.String
*/
type IdentityProvider = _IdentityProvider | String

type Imports = js.Array[StackName]

type InProgressStackInstancesCount = Double

type InSyncStackInstancesCount = Double

type IncludeNestedStacks = Boolean

type IsActivated = Boolean

type IsDefaultConfiguration = Boolean

type IsDefaultVersion = Boolean

type Key = String

type LastUpdatedTime = js.Date

type LimitName = String

type LimitValue = Double

type LogGroupName = String

type LogicalIdHierarchy = String

type LogicalResourceId = String

type LogicalResourceIds = js.Array[LogicalResourceId]

type MajorVersion = Double

type ManagedExecutionNullable = Boolean

type MaxConcurrentCount = Double

type MaxConcurrentPercentage = Double

type MaxResults = Double

type Metadata = String

type MonitoringTimeInMinutes = Double

type NextToken = String

type NoEcho = Boolean

type NotificationARN = String

type NotificationARNs = js.Array[NotificationARN]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DO_NOTHING
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLBACK
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type OnFailure = _OnFailure | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type OperationStatus = _OperationStatus | String

type OptionalSecureUrl = String

type OrganizationalUnitId = String

type OrganizationalUnitIdList = js.Array[OrganizationalUnitId]

type OutputKey = String

type OutputValue = String

type Outputs = js.Array[Output]

type ParameterDeclarations = js.Array[ParameterDeclaration]

type ParameterKey = String

type ParameterType = String

type ParameterValue = String

type Parameters = js.Array[Parameter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_MANAGED
  - typingsJapgolly.awsSdk.awsSdkStrings.SELF_MANAGED
  - java.lang.String
*/
type PermissionModels = _PermissionModels | String

type PhysicalResourceId = String

type PhysicalResourceIdContext = js.Array[PhysicalResourceIdContextKeyValuePair]

type PrivateTypeArn = String

type Properties = String

type PropertyDifferences = js.Array[PropertyDifference]

type PropertyName = String

type PropertyPath = String

type PropertyValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NON_PROVISIONABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.IMMUTABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.FULLY_MUTABLE
  - java.lang.String
*/
type ProvisioningType = _ProvisioningType | String

type PublicVersionNumber = String

type PublisherId = String

type PublisherName = String

type PublisherProfile = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VERIFIED
  - typingsJapgolly.awsSdk.awsSdkStrings.UNVERIFIED
  - java.lang.String
*/
type PublisherStatus = _PublisherStatus | String

type Reason = String

type Region = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SEQUENTIAL
  - typingsJapgolly.awsSdk.awsSdkStrings.PARALLEL
  - java.lang.String
*/
type RegionConcurrencyType = _RegionConcurrencyType | String

type RegionList = js.Array[Region]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type RegistrationStatus = _RegistrationStatus | String

type RegistrationToken = String

type RegistrationTokenList = js.Array[RegistrationToken]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE
  - typingsJapgolly.awsSdk.awsSdkStrings.MODULE
  - typingsJapgolly.awsSdk.awsSdkStrings.HOOK
  - java.lang.String
*/
type RegistryType = _RegistryType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.True_
  - typingsJapgolly.awsSdk.awsSdkStrings.False_
  - typingsJapgolly.awsSdk.awsSdkStrings.Conditional_
  - java.lang.String
*/
type Replacement = _Replacement | String

type RequestToken = String

type RequiredActivatedTypes = js.Array[RequiredActivatedType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Never_
  - typingsJapgolly.awsSdk.awsSdkStrings.Conditionally_
  - typingsJapgolly.awsSdk.awsSdkStrings.Always_
  - java.lang.String
*/
type RequiresRecreation = _RequiresRecreation | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Properties_
  - typingsJapgolly.awsSdk.awsSdkStrings.Metadata_
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationPolicy_
  - typingsJapgolly.awsSdk.awsSdkStrings.UpdatePolicy_
  - typingsJapgolly.awsSdk.awsSdkStrings.DeletionPolicy_
  - typingsJapgolly.awsSdk.awsSdkStrings.Tags_
  - java.lang.String
*/
type ResourceAttribute = _ResourceAttribute | String

type ResourceChangeDetails = js.Array[ResourceChangeDetail]

type ResourceIdentifierProperties = StringDictionary[ResourceIdentifierPropertyValue]

type ResourceIdentifierPropertyKey = String

type ResourceIdentifierPropertyValue = String

type ResourceIdentifierSummaries = js.Array[ResourceIdentifierSummary]

type ResourceIdentifiers = js.Array[ResourceIdentifierPropertyKey]

type ResourceModel = String

type ResourceProperties = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILURE
  - java.lang.String
*/
type ResourceSignalStatus = _ResourceSignalStatus | String

type ResourceSignalUniqueId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_SKIPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLBACK_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLBACK_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLBACK_FAILED
  - java.lang.String
*/
type ResourceStatus = _ResourceStatus | String

type ResourceStatusReason = String

type ResourceToSkip = String

type ResourceType = String

type ResourceTypes = js.Array[ResourceType]

type ResourcesToImport = js.Array[ResourceToImport]

type ResourcesToSkip = js.Array[ResourceToSkip]

type RetainResources = js.Array[LogicalResourceId]

type RetainStacks = Boolean

type RetainStacksNullable = Boolean

type RetainStacksOnAccountRemovalNullable = Boolean

type RoleARN_ = String

type RoleArn = String

type RollbackTriggers = js.Array[RollbackTrigger]

type S3Bucket = String

type S3Url = String

type Scope = js.Array[ResourceAttribute]

type StackDriftDetectionId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DETECTION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DETECTION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DETECTION_COMPLETE
  - java.lang.String
*/
type StackDriftDetectionStatus = _StackDriftDetectionStatus | String

type StackDriftDetectionStatusReason = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DRIFTED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_SYNC
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CHECKED
  - java.lang.String
*/
type StackDriftStatus = _StackDriftStatus | String

type StackEvents = js.Array[StackEvent]

type StackId = String

type StackIdList = js.Array[StackId]

type StackIdsUrl = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.INOPERABLE
  - java.lang.String
*/
type StackInstanceDetailedStatus = _StackInstanceDetailedStatus | String

type StackInstanceFilterName = DETAILED_STATUS | String

type StackInstanceFilterValues = String

type StackInstanceFilters = js.Array[StackInstanceFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CURRENT
  - typingsJapgolly.awsSdk.awsSdkStrings.OUTDATED
  - typingsJapgolly.awsSdk.awsSdkStrings.INOPERABLE
  - java.lang.String
*/
type StackInstanceStatus = _StackInstanceStatus | String

type StackInstanceSummaries = js.Array[StackInstanceSummary]

type StackName = String

type StackNameOrId = String

type StackPolicyBody = String

type StackPolicyDuringUpdateBody = String

type StackPolicyDuringUpdateURL = String

type StackPolicyURL = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_SYNC
  - typingsJapgolly.awsSdk.awsSdkStrings.MODIFIED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CHECKED
  - java.lang.String
*/
type StackResourceDriftStatus = _StackResourceDriftStatus | String

type StackResourceDriftStatusFilters = js.Array[StackResourceDriftStatus]

type StackResourceDrifts = js.Array[StackResourceDrift]

type StackResourceSummaries = js.Array[StackResourceSummary]

type StackResources = js.Array[StackResource]

type StackSetARN = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type StackSetDriftDetectionStatus = _StackSetDriftDetectionStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DRIFTED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_SYNC
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CHECKED
  - java.lang.String
*/
type StackSetDriftStatus = _StackSetDriftStatus | String

type StackSetId = String

type StackSetName = String

type StackSetNameOrId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DETECT_DRIFT
  - java.lang.String
*/
type StackSetOperationAction = _StackSetOperationAction | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type StackSetOperationResultStatus = _StackSetOperationResultStatus | String

type StackSetOperationResultSummaries = js.Array[StackSetOperationResultSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
  - java.lang.String
*/
type StackSetOperationStatus = _StackSetOperationStatus | String

type StackSetOperationStatusReason = String

type StackSetOperationSummaries = js.Array[StackSetOperationSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type StackSetStatus = _StackSetStatus | String

type StackSetSummaries = js.Array[StackSetSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLBACK_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLBACK_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLBACK_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_COMPLETE_CLEANUP_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.REVIEW_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_COMPLETE
  - java.lang.String
*/
type StackStatus = _StackStatus | String

type StackStatusFilter = js.Array[StackStatus]

type StackStatusReason = String

type StackSummaries = js.Array[StackSummary]

type Stacks = js.Array[Stack]

type StageList = js.Array[TemplateStage]

type StatusMessage = String

type SupportedMajorVersion = Double

type SupportedMajorVersions = js.Array[SupportedMajorVersion]

type TagKey = String

type TagValue = String

type Tags = js.Array[Tag]

type TemplateBody = String

type TemplateDescription = String

type TemplateParameters = js.Array[TemplateParameter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Original_
  - typingsJapgolly.awsSdk.awsSdkStrings.Processed
  - java.lang.String
*/
type TemplateStage = _TemplateStage | String

type TemplateURL = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE
  - typingsJapgolly.awsSdk.awsSdkStrings.MODULE
  - typingsJapgolly.awsSdk.awsSdkStrings.HOOK
  - java.lang.String
*/
type ThirdPartyType = _ThirdPartyType | String

type ThirdPartyTypeArn = String

type TimeoutMinutes = Double

type Timestamp = js.Date

type TotalStackInstancesCount = Double

type TransformName = String

type TransformsList = js.Array[TransformName]

type Type = String

type TypeArn = String

type TypeConfiguration = String

type TypeConfigurationAlias = String

type TypeConfigurationArn = String

type TypeConfigurationDetailsList = js.Array[TypeConfigurationDetails]

type TypeConfigurationIdentifiers = js.Array[TypeConfigurationIdentifier]

type TypeHierarchy = String

type TypeName = String

type TypeNamePrefix = String

type TypeSchema = String

type TypeSummaries = js.Array[TypeSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PASSED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_TESTED
  - java.lang.String
*/
type TypeTestsStatus = _TypeTestsStatus | String

type TypeTestsStatusDescription = String

type TypeVersionId = String

type TypeVersionSummaries = js.Array[TypeVersionSummary]

type UnprocessedTypeConfigurations = js.Array[TypeConfigurationIdentifier]

type Url = String

type UsePreviousTemplate = Boolean

type UsePreviousValue = Boolean

type Value = String

type Version = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MAJOR
  - typingsJapgolly.awsSdk.awsSdkStrings.MINOR
  - java.lang.String
*/
type VersionBump = _VersionBump | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type Visibility = _Visibility | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2010-05-15`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
