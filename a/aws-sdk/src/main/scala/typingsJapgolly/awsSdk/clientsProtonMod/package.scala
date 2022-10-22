package typingsJapgolly.awsSdk.clientsProtonMod

import typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_MANAGED
import typingsJapgolly.awsSdk.awsSdkStrings.DIRECTLY_DEFINED
import typingsJapgolly.awsSdk.awsSdkStrings.TEMPLATE_SYNC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = java.lang.String

type AwsAccountId = java.lang.String

type Boolean = scala.Boolean

type ClientToken = java.lang.String

type CompatibleEnvironmentTemplateInputList = js.Array[CompatibleEnvironmentTemplateInput]

type CompatibleEnvironmentTemplateList = js.Array[CompatibleEnvironmentTemplate]

type ComponentArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.CURRENT_VERSION
  - java.lang.String
*/
type ComponentDeploymentUpdateType = _ComponentDeploymentUpdateType | java.lang.String

type ComponentSummaryList = js.Array[ComponentSummary]

type DeploymentId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLING
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type DeploymentStatus = _DeploymentStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.CURRENT_VERSION
  - typingsJapgolly.awsSdk.awsSdkStrings.MINOR_VERSION
  - typingsJapgolly.awsSdk.awsSdkStrings.MAJOR_VERSION
  - java.lang.String
*/
type DeploymentUpdateType = _DeploymentUpdateType | java.lang.String

type Description = java.lang.String

type DisplayName = java.lang.String

type EmptyNextToken = java.lang.String

type EnvironmentAccountConnectionArn = java.lang.String

type EnvironmentAccountConnectionId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MANAGEMENT_ACCOUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.ENVIRONMENT_ACCOUNT
  - java.lang.String
*/
type EnvironmentAccountConnectionRequesterAccountType = _EnvironmentAccountConnectionRequesterAccountType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
  - java.lang.String
*/
type EnvironmentAccountConnectionStatus = _EnvironmentAccountConnectionStatus | java.lang.String

type EnvironmentAccountConnectionStatusList = js.Array[EnvironmentAccountConnectionStatus]

type EnvironmentAccountConnectionSummaryList = js.Array[EnvironmentAccountConnectionSummary]

type EnvironmentArn = java.lang.String

type EnvironmentSummaryList = js.Array[EnvironmentSummary]

type EnvironmentTemplateArn = java.lang.String

type EnvironmentTemplateFilterList = js.Array[EnvironmentTemplateFilter]

type EnvironmentTemplateSummaryList = js.Array[EnvironmentTemplateSummary]

type EnvironmentTemplateVersionArn = java.lang.String

type EnvironmentTemplateVersionSummaryList = js.Array[EnvironmentTemplateVersionSummary]

type FullTemplateVersionNumber = java.lang.String

type GitBranchName = java.lang.String

type MaxPageResults = Double

type NextToken = java.lang.String

type NotifyResourceDeploymentStatusChangeInputOutputsList = js.Array[Output]

type NotifyResourceDeploymentStatusChangeInputStatusMessageString = java.lang.String

type OutputKey = java.lang.String

type OutputValueString = java.lang.String

type OutputsList = js.Array[Output]

type PipelineRoleArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDFORMATION
  - typingsJapgolly.awsSdk.awsSdkStrings.TERRAFORM
  - java.lang.String
*/
type ProvisionedResourceEngine = _ProvisionedResourceEngine | java.lang.String

type ProvisionedResourceIdentifier = java.lang.String

type ProvisionedResourceList = js.Array[ProvisionedResource]

type ProvisionedResourceName = java.lang.String

type Provisioning = CUSTOMER_MANAGED | java.lang.String

type RepositoryArn = java.lang.String

type RepositoryId = java.lang.String

type RepositoryName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GITHUB
  - typingsJapgolly.awsSdk.awsSdkStrings.GITHUB_ENTERPRISE
  - typingsJapgolly.awsSdk.awsSdkStrings.BITBUCKET
  - java.lang.String
*/
type RepositoryProvider = _RepositoryProvider | java.lang.String

type RepositorySummaryList = js.Array[RepositorySummary]

type RepositorySyncDefinitionList = js.Array[RepositorySyncDefinition]

type RepositorySyncEvents = js.Array[RepositorySyncEvent]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INITIATED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
  - java.lang.String
*/
type RepositorySyncStatus = _RepositorySyncStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - java.lang.String
*/
type ResourceDeploymentStatus = _ResourceDeploymentStatus | java.lang.String

type ResourceName = java.lang.String

type ResourceNameOrEmpty = java.lang.String

type ResourceSyncEvents = js.Array[ResourceSyncEvent]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INITIATED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ResourceSyncStatus = _ResourceSyncStatus | java.lang.String

type S3Bucket = java.lang.String

type S3Key = java.lang.String

type SHA = java.lang.String

type ServiceArn = java.lang.String

type ServiceInstanceArn = java.lang.String

type ServiceInstanceSummaryList = js.Array[ServiceInstanceSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED_CLEANUP_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED_CLEANUP_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED_CLEANUP_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED_CLEANUP_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED_CLEANUP_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED_CLEANUP_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_COMPLETE_CLEANUP_FAILED
  - java.lang.String
*/
type ServiceStatus = _ServiceStatus | java.lang.String

type ServiceSummaryList = js.Array[ServiceSummary]

type ServiceTemplateArn = java.lang.String

type ServiceTemplateSummaryList = js.Array[ServiceTemplateSummary]

type ServiceTemplateSupportedComponentSourceInputList = js.Array[ServiceTemplateSupportedComponentSourceType]

type ServiceTemplateSupportedComponentSourceType = DIRECTLY_DEFINED | java.lang.String

type ServiceTemplateVersionArn = java.lang.String

type ServiceTemplateVersionSummaryList = js.Array[ServiceTemplateVersionSummary]

type SpecContents = java.lang.String

type StatusMessage = java.lang.String

type String = java.lang.String

type Subdirectory = java.lang.String

type SyncType = TEMPLATE_SYNC | java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TemplateFileContents = java.lang.String

type TemplateManifestContents = java.lang.String

type TemplateSchema = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENVIRONMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE
  - java.lang.String
*/
type TemplateType = _TemplateType | java.lang.String

type TemplateVersionPart = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REGISTRATION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.REGISTRATION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DRAFT
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLISHED
  - java.lang.String
*/
type TemplateVersionStatus = _TemplateVersionStatus | java.lang.String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-07-20`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
