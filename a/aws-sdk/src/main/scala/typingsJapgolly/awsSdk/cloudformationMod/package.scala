package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudformationMod {
  type Account = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.SKIPPED
    - java.lang.String
  */
  type AccountGateStatus = typingsJapgolly.awsSdk.cloudformationMod._AccountGateStatus | java.lang.String
  type AccountGateStatusReason = java.lang.String
  type AccountLimitList = js.Array[typingsJapgolly.awsSdk.cloudformationMod.AccountLimit]
  type AccountList = js.Array[typingsJapgolly.awsSdk.cloudformationMod.Account]
  type AllowedValue = java.lang.String
  type AllowedValues = js.Array[typingsJapgolly.awsSdk.cloudformationMod.AllowedValue]
  type Arn = java.lang.String
  type AutoDeploymentNullable = scala.Boolean
  type BoxedInteger = scala.Double
  type BoxedMaxResults = scala.Double
  type Capabilities = js.Array[typingsJapgolly.awsSdk.cloudformationMod.Capability]
  type CapabilitiesReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CAPABILITY_IAM
    - typingsJapgolly.awsSdk.awsSdkStrings.CAPABILITY_NAMED_IAM
    - typingsJapgolly.awsSdk.awsSdkStrings.CAPABILITY_AUTO_EXPAND
    - java.lang.String
  */
  type Capability = typingsJapgolly.awsSdk.cloudformationMod._Capability | java.lang.String
  type CausingEntity = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Add_
    - typingsJapgolly.awsSdk.awsSdkStrings.Modify_
    - typingsJapgolly.awsSdk.awsSdkStrings.Remove_
    - typingsJapgolly.awsSdk.awsSdkStrings.Import_
    - java.lang.String
  */
  type ChangeAction = typingsJapgolly.awsSdk.cloudformationMod._ChangeAction | java.lang.String
  type ChangeSetId = java.lang.String
  type ChangeSetName = java.lang.String
  type ChangeSetNameOrId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ChangeSetStatus = typingsJapgolly.awsSdk.cloudformationMod._ChangeSetStatus | java.lang.String
  type ChangeSetStatusReason = java.lang.String
  type ChangeSetSummaries = js.Array[typingsJapgolly.awsSdk.cloudformationMod.ChangeSetSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT
    - java.lang.String
  */
  type ChangeSetType = typingsJapgolly.awsSdk.cloudformationMod._ChangeSetType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourceReference
    - typingsJapgolly.awsSdk.awsSdkStrings.ParameterReference
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourceAttribute
    - typingsJapgolly.awsSdk.awsSdkStrings.DirectModification
    - typingsJapgolly.awsSdk.awsSdkStrings.Automatic_
    - java.lang.String
  */
  type ChangeSource = typingsJapgolly.awsSdk.cloudformationMod._ChangeSource | java.lang.String
  type ChangeType = typingsJapgolly.awsSdk.awsSdkStrings.Resource_ | java.lang.String
  type Changes = js.Array[typingsJapgolly.awsSdk.cloudformationMod.Change]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.cloudformationMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type ClientToken = java.lang.String
  type CreationTime = js.Date
  type DeletionTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPRECATED
    - java.lang.String
  */
  type DeprecatedStatus = typingsJapgolly.awsSdk.cloudformationMod._DeprecatedStatus | java.lang.String
  type Description = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ADD
    - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EQUAL
    - java.lang.String
  */
  type DifferenceType = typingsJapgolly.awsSdk.cloudformationMod._DifferenceType | java.lang.String
  type DisableRollback = scala.Boolean
  type DriftedStackInstancesCount = scala.Double
  type EnableTerminationProtection = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Static_
    - typingsJapgolly.awsSdk.awsSdkStrings.Dynamic_
    - java.lang.String
  */
  type EvaluationType = typingsJapgolly.awsSdk.cloudformationMod._EvaluationType | java.lang.String
  type EventId = java.lang.String
  type ExecutionRoleName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTE_COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.OBSOLETE
    - java.lang.String
  */
  type ExecutionStatus = typingsJapgolly.awsSdk.cloudformationMod._ExecutionStatus | java.lang.String
  type ExportName = java.lang.String
  type ExportValue = java.lang.String
  type Exports = js.Array[typingsJapgolly.awsSdk.cloudformationMod.Export]
  type FailedStackInstancesCount = scala.Double
  type FailureToleranceCount = scala.Double
  type FailureTolerancePercentage = scala.Double
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
    - java.lang.String
  */
  type HandlerErrorCode = typingsJapgolly.awsSdk.cloudformationMod._HandlerErrorCode | java.lang.String
  type Imports = js.Array[typingsJapgolly.awsSdk.cloudformationMod.StackName]
  type InProgressStackInstancesCount = scala.Double
  type InSyncStackInstancesCount = scala.Double
  type Key = java.lang.String
  type LastUpdatedTime = js.Date
  type LimitName = java.lang.String
  type LimitValue = scala.Double
  type LogGroupName = java.lang.String
  type LogicalResourceId = java.lang.String
  type LogicalResourceIds = js.Array[typingsJapgolly.awsSdk.cloudformationMod.LogicalResourceId]
  type MaxConcurrentCount = scala.Double
  type MaxConcurrentPercentage = scala.Double
  type MaxResults = scala.Double
  type Metadata = java.lang.String
  type MonitoringTimeInMinutes = scala.Double
  type NextToken = java.lang.String
  type NoEcho = scala.Boolean
  type NotificationARN = java.lang.String
  type NotificationARNs = js.Array[typingsJapgolly.awsSdk.cloudformationMod.NotificationARN]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DO_NOTHING
    - typingsJapgolly.awsSdk.awsSdkStrings.ROLLBACK
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type OnFailure = typingsJapgolly.awsSdk.cloudformationMod._OnFailure | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type OperationStatus = typingsJapgolly.awsSdk.cloudformationMod._OperationStatus | java.lang.String
  type OptionalSecureUrl = java.lang.String
  type OrganizationalUnitId = java.lang.String
  type OrganizationalUnitIdList = js.Array[typingsJapgolly.awsSdk.cloudformationMod.OrganizationalUnitId]
  type OutputKey = java.lang.String
  type OutputValue = java.lang.String
  type Outputs = js.Array[typingsJapgolly.awsSdk.cloudformationMod.Output]
  type ParameterDeclarations = js.Array[typingsJapgolly.awsSdk.cloudformationMod.ParameterDeclaration]
  type ParameterKey = java.lang.String
  type ParameterType = java.lang.String
  type ParameterValue = java.lang.String
  type Parameters = js.Array[typingsJapgolly.awsSdk.cloudformationMod.Parameter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_MANAGED
    - typingsJapgolly.awsSdk.awsSdkStrings.SELF_MANAGED
    - java.lang.String
  */
  type PermissionModels = typingsJapgolly.awsSdk.cloudformationMod._PermissionModels | java.lang.String
  type PhysicalResourceId = java.lang.String
  type PhysicalResourceIdContext = js.Array[typingsJapgolly.awsSdk.cloudformationMod.PhysicalResourceIdContextKeyValuePair]
  type PrivateTypeArn = java.lang.String
  type Properties = java.lang.String
  type PropertyDifferences = js.Array[typingsJapgolly.awsSdk.cloudformationMod.PropertyDifference]
  type PropertyName = java.lang.String
  type PropertyPath = java.lang.String
  type PropertyValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NON_PROVISIONABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.IMMUTABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.FULLY_MUTABLE
    - java.lang.String
  */
  type ProvisioningType = typingsJapgolly.awsSdk.cloudformationMod._ProvisioningType | java.lang.String
  type Reason = java.lang.String
  type Region = java.lang.String
  type RegionList = js.Array[typingsJapgolly.awsSdk.cloudformationMod.Region]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RegistrationStatus = typingsJapgolly.awsSdk.cloudformationMod._RegistrationStatus | java.lang.String
  type RegistrationToken = java.lang.String
  type RegistrationTokenList = js.Array[typingsJapgolly.awsSdk.cloudformationMod.RegistrationToken]
  type RegistryType = typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.True_
    - typingsJapgolly.awsSdk.awsSdkStrings.False_
    - typingsJapgolly.awsSdk.awsSdkStrings.Conditional_
    - java.lang.String
  */
  type Replacement = typingsJapgolly.awsSdk.cloudformationMod._Replacement | java.lang.String
  type RequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Never_
    - typingsJapgolly.awsSdk.awsSdkStrings.Conditionally_
    - typingsJapgolly.awsSdk.awsSdkStrings.Always_
    - java.lang.String
  */
  type RequiresRecreation = typingsJapgolly.awsSdk.cloudformationMod._RequiresRecreation | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Properties_
    - typingsJapgolly.awsSdk.awsSdkStrings.Metadata_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationPolicy_
    - typingsJapgolly.awsSdk.awsSdkStrings.UpdatePolicy_
    - typingsJapgolly.awsSdk.awsSdkStrings.DeletionPolicy_
    - typingsJapgolly.awsSdk.awsSdkStrings.Tags_
    - java.lang.String
  */
  type ResourceAttribute = typingsJapgolly.awsSdk.cloudformationMod._ResourceAttribute | java.lang.String
  type ResourceChangeDetails = js.Array[typingsJapgolly.awsSdk.cloudformationMod.ResourceChangeDetail]
  type ResourceIdentifierProperties = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cloudformationMod.ResourceIdentifierPropertyValue]
  type ResourceIdentifierPropertyKey = java.lang.String
  type ResourceIdentifierPropertyValue = java.lang.String
  type ResourceIdentifierSummaries = js.Array[typingsJapgolly.awsSdk.cloudformationMod.ResourceIdentifierSummary]
  type ResourceIdentifiers = js.Array[typingsJapgolly.awsSdk.cloudformationMod.ResourceIdentifierPropertyKey]
  type ResourceModel = java.lang.String
  type ResourceProperties = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILURE
    - java.lang.String
  */
  type ResourceSignalStatus = typingsJapgolly.awsSdk.cloudformationMod._ResourceSignalStatus | java.lang.String
  type ResourceSignalUniqueId = java.lang.String
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
    - java.lang.String
  */
  type ResourceStatus = typingsJapgolly.awsSdk.cloudformationMod._ResourceStatus | java.lang.String
  type ResourceStatusReason = java.lang.String
  type ResourceToSkip = java.lang.String
  type ResourceType = java.lang.String
  type ResourceTypes = js.Array[typingsJapgolly.awsSdk.cloudformationMod.ResourceType]
  type ResourcesToImport = js.Array[typingsJapgolly.awsSdk.cloudformationMod.ResourceToImport]
  type ResourcesToSkip = js.Array[typingsJapgolly.awsSdk.cloudformationMod.ResourceToSkip]
  type RetainResources = js.Array[typingsJapgolly.awsSdk.cloudformationMod.LogicalResourceId]
  type RetainStacks = scala.Boolean
  type RetainStacksNullable = scala.Boolean
  type RetainStacksOnAccountRemovalNullable = scala.Boolean
  type RoleARN_ = java.lang.String
  type RoleArn = java.lang.String
  type RollbackTriggers = js.Array[typingsJapgolly.awsSdk.cloudformationMod.RollbackTrigger]
  type S3Url = java.lang.String
  type Scope = js.Array[typingsJapgolly.awsSdk.cloudformationMod.ResourceAttribute]
  type StackDriftDetectionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DETECTION_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.DETECTION_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DETECTION_COMPLETE
    - java.lang.String
  */
  type StackDriftDetectionStatus = typingsJapgolly.awsSdk.cloudformationMod._StackDriftDetectionStatus | java.lang.String
  type StackDriftDetectionStatusReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DRIFTED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_SYNC
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CHECKED
    - java.lang.String
  */
  type StackDriftStatus = typingsJapgolly.awsSdk.cloudformationMod._StackDriftStatus | java.lang.String
  type StackEvents = js.Array[typingsJapgolly.awsSdk.cloudformationMod.StackEvent]
  type StackId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CURRENT
    - typingsJapgolly.awsSdk.awsSdkStrings.OUTDATED
    - typingsJapgolly.awsSdk.awsSdkStrings.INOPERABLE
    - java.lang.String
  */
  type StackInstanceStatus = typingsJapgolly.awsSdk.cloudformationMod._StackInstanceStatus | java.lang.String
  type StackInstanceSummaries = js.Array[typingsJapgolly.awsSdk.cloudformationMod.StackInstanceSummary]
  type StackName = java.lang.String
  type StackNameOrId = java.lang.String
  type StackPolicyBody = java.lang.String
  type StackPolicyDuringUpdateBody = java.lang.String
  type StackPolicyDuringUpdateURL = java.lang.String
  type StackPolicyURL = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_SYNC
    - typingsJapgolly.awsSdk.awsSdkStrings.MODIFIED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CHECKED
    - java.lang.String
  */
  type StackResourceDriftStatus = typingsJapgolly.awsSdk.cloudformationMod._StackResourceDriftStatus | java.lang.String
  type StackResourceDriftStatusFilters = js.Array[typingsJapgolly.awsSdk.cloudformationMod.StackResourceDriftStatus]
  type StackResourceDrifts = js.Array[typingsJapgolly.awsSdk.cloudformationMod.StackResourceDrift]
  type StackResourceSummaries = js.Array[typingsJapgolly.awsSdk.cloudformationMod.StackResourceSummary]
  type StackResources = js.Array[typingsJapgolly.awsSdk.cloudformationMod.StackResource]
  type StackSetARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type StackSetDriftDetectionStatus = typingsJapgolly.awsSdk.cloudformationMod._StackSetDriftDetectionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DRIFTED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_SYNC
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CHECKED
    - java.lang.String
  */
  type StackSetDriftStatus = typingsJapgolly.awsSdk.cloudformationMod._StackSetDriftStatus | java.lang.String
  type StackSetId = java.lang.String
  type StackSetName = java.lang.String
  type StackSetNameOrId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
    - typingsJapgolly.awsSdk.awsSdkStrings.DETECT_DRIFT
    - java.lang.String
  */
  type StackSetOperationAction = typingsJapgolly.awsSdk.cloudformationMod._StackSetOperationAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type StackSetOperationResultStatus = typingsJapgolly.awsSdk.cloudformationMod._StackSetOperationResultStatus | java.lang.String
  type StackSetOperationResultSummaries = js.Array[typingsJapgolly.awsSdk.cloudformationMod.StackSetOperationResultSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
    - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
    - java.lang.String
  */
  type StackSetOperationStatus = typingsJapgolly.awsSdk.cloudformationMod._StackSetOperationStatus | java.lang.String
  type StackSetOperationSummaries = js.Array[typingsJapgolly.awsSdk.cloudformationMod.StackSetOperationSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type StackSetStatus = typingsJapgolly.awsSdk.cloudformationMod._StackSetStatus | java.lang.String
  type StackSetSummaries = js.Array[typingsJapgolly.awsSdk.cloudformationMod.StackSetSummary]
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
  type StackStatus = typingsJapgolly.awsSdk.cloudformationMod._StackStatus | java.lang.String
  type StackStatusFilter = js.Array[typingsJapgolly.awsSdk.cloudformationMod.StackStatus]
  type StackStatusReason = java.lang.String
  type StackSummaries = js.Array[typingsJapgolly.awsSdk.cloudformationMod.StackSummary]
  type Stacks = js.Array[typingsJapgolly.awsSdk.cloudformationMod.Stack]
  type StageList = js.Array[typingsJapgolly.awsSdk.cloudformationMod.TemplateStage]
  type StatusMessage = java.lang.String
  type TagKey = java.lang.String
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.cloudformationMod.Tag]
  type TemplateBody = java.lang.String
  type TemplateDescription = java.lang.String
  type TemplateParameters = js.Array[typingsJapgolly.awsSdk.cloudformationMod.TemplateParameter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Original_
    - typingsJapgolly.awsSdk.awsSdkStrings.Processed
    - java.lang.String
  */
  type TemplateStage = typingsJapgolly.awsSdk.cloudformationMod._TemplateStage | java.lang.String
  type TemplateURL = java.lang.String
  type TimeoutMinutes = scala.Double
  type Timestamp = js.Date
  type TotalStackInstancesCount = scala.Double
  type TransformName = java.lang.String
  type TransformsList = js.Array[typingsJapgolly.awsSdk.cloudformationMod.TransformName]
  type Type = java.lang.String
  type TypeArn = java.lang.String
  type TypeName = java.lang.String
  type TypeSchema = java.lang.String
  type TypeSummaries = js.Array[typingsJapgolly.awsSdk.cloudformationMod.TypeSummary]
  type TypeVersionId = java.lang.String
  type TypeVersionSummaries = js.Array[typingsJapgolly.awsSdk.cloudformationMod.TypeVersionSummary]
  type Url = java.lang.String
  type UsePreviousTemplate = scala.Boolean
  type UsePreviousValue = scala.Boolean
  type Value = java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type Visibility = typingsJapgolly.awsSdk.cloudformationMod._Visibility | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2010-05-15`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.cloudformationMod._apiVersion | java.lang.String
}
