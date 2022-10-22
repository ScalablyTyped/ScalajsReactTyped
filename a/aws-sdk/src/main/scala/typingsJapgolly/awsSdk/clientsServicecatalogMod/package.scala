package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
import typingsJapgolly.awsSdk.awsSdkStrings.CLOUDFORMATION
import typingsJapgolly.awsSdk.awsSdkStrings.CopyTags
import typingsJapgolly.awsSdk.awsSdkStrings.IAM
import typingsJapgolly.awsSdk.awsSdkStrings.Id_
import typingsJapgolly.awsSdk.awsSdkStrings.SSM_AUTOMATION
import typingsJapgolly.awsSdk.awsSdkStrings.SearchQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AcceptLanguage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Account_
  - typingsJapgolly.awsSdk.awsSdkStrings.Role_
  - typingsJapgolly.awsSdk.awsSdkStrings.User_
  - java.lang.String
*/
type AccessLevelFilterKey = _AccessLevelFilterKey | java.lang.String

type AccessLevelFilterValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.UNDER_CHANGE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AccessStatus = _AccessStatus | java.lang.String

type AccountId = java.lang.String

type AccountIds = js.Array[AccountId]

type AddTags = js.Array[Tag]

type AllowedValues = js.Array[String]

type ApproximateCount = Double

type AttributeValue = java.lang.String

type Boolean = scala.Boolean

type BudgetName = java.lang.String

type Budgets = js.Array[BudgetDetail]

type CausingEntity = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ADD
  - typingsJapgolly.awsSdk.awsSdkStrings.MODIFY
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE
  - java.lang.String
*/
type ChangeAction = _ChangeAction | java.lang.String

type CloudWatchDashboardName = java.lang.String

type CloudWatchDashboards = js.Array[CloudWatchDashboard]

type ConstraintDescription = java.lang.String

type ConstraintDetails = js.Array[ConstraintDetail]

type ConstraintParameters = java.lang.String

type ConstraintSummaries = js.Array[ConstraintSummary]

type ConstraintType = java.lang.String

type CopyOption = CopyTags | java.lang.String

type CopyOptions = js.Array[CopyOption]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type CopyProductStatus = _CopyProductStatus | java.lang.String

type CreatedTime = js.Date

type CreationTime = js.Date

type DefaultValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION
  - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
  - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION_MEMBER_ACCOUNT
  - java.lang.String
*/
type DescribePortfolioShareType = _DescribePortfolioShareType | java.lang.String

type Description = java.lang.String

type DisableTemplateValidation = scala.Boolean

type Error = java.lang.String

type ErrorCode = java.lang.String

type ErrorDescription = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STATIC
  - typingsJapgolly.awsSdk.awsSdkStrings.DYNAMIC
  - java.lang.String
*/
type EvaluationType = _EvaluationType | java.lang.String

type ExecutionParameterKey = java.lang.String

type ExecutionParameterMap = StringDictionary[ExecutionParameterValueList]

type ExecutionParameterType = java.lang.String

type ExecutionParameterValue = java.lang.String

type ExecutionParameterValueList = js.Array[ExecutionParameterValue]

type ExecutionParameters = js.Array[ExecutionParameter]

type FailedServiceActionAssociations = js.Array[FailedServiceActionAssociation]

type HasDefaultPath = scala.Boolean

type Id = java.lang.String

type IdempotencyToken = java.lang.String

type IgnoreErrors = scala.Boolean

type InstructionType = java.lang.String

type InstructionValue = java.lang.String

type LastRequestId = java.lang.String

type LaunchPathSummaries = js.Array[LaunchPathSummary]

type LaunchPaths = js.Array[LaunchPath]

type LogicalResourceId = java.lang.String

type Message = java.lang.String

type Namespaces = js.Array[AccountId]

type NoEcho = scala.Boolean

type NotificationArn = java.lang.String

type NotificationArns = js.Array[NotificationArn]

type NullableBoolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION
  - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
  - java.lang.String
*/
type OrganizationNodeType = _OrganizationNodeType | java.lang.String

type OrganizationNodeValue = java.lang.String

type OrganizationNodes = js.Array[OrganizationNode]

type OutputDescription = java.lang.String

type OutputKey = java.lang.String

type OutputKeys = js.Array[OutputKey]

type OutputValue = java.lang.String

type Owner = java.lang.String

type PageSize = Double

type PageSizeMax100 = Double

type PageToken = java.lang.String

type ParameterKey = java.lang.String

type ParameterType = java.lang.String

type ParameterValue = java.lang.String

type PhysicalId = java.lang.String

type PhysicalResourceId = java.lang.String

type PlanResourceType = java.lang.String

type PortfolioDescription = java.lang.String

type PortfolioDetails = js.Array[PortfolioDetail]

type PortfolioDisplayName = java.lang.String

type PortfolioName = java.lang.String

type PortfolioShareDetails = js.Array[PortfolioShareDetail]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORTED
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_SERVICECATALOG
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_ORGANIZATIONS
  - java.lang.String
*/
type PortfolioShareType = _PortfolioShareType | java.lang.String

type PrincipalARN = java.lang.String

type PrincipalType = IAM | java.lang.String

type Principals = js.Array[Principal]

type ProductArn = java.lang.String

type ProductSource = ACCOUNT | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOUD_FORMATION_TEMPLATE
  - typingsJapgolly.awsSdk.awsSdkStrings.MARKETPLACE
  - java.lang.String
*/
type ProductType = _ProductType | java.lang.String

type ProductViewAggregationType = java.lang.String

type ProductViewAggregationValues = js.Array[ProductViewAggregationValue]

type ProductViewAggregations = StringDictionary[ProductViewAggregationValues]

type ProductViewDetails = js.Array[ProductViewDetail]

type ProductViewDistributor = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FullTextSearch
  - typingsJapgolly.awsSdk.awsSdkStrings.Owner_
  - typingsJapgolly.awsSdk.awsSdkStrings.ProductType
  - typingsJapgolly.awsSdk.awsSdkStrings.SourceProductId
  - java.lang.String
*/
type ProductViewFilterBy = _ProductViewFilterBy | java.lang.String

type ProductViewFilterValue = java.lang.String

type ProductViewFilterValues = js.Array[ProductViewFilterValue]

type ProductViewFilters = StringDictionary[ProductViewFilterValues]

type ProductViewName = java.lang.String

type ProductViewOwner = java.lang.String

type ProductViewShortDescription = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Title_
  - typingsJapgolly.awsSdk.awsSdkStrings.VersionCount
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationDate
  - java.lang.String
*/
type ProductViewSortBy = _ProductViewSortBy | java.lang.String

type ProductViewSummaries = js.Array[ProductViewSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OWNER
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_ROLE
  - java.lang.String
*/
type PropertyKey = _PropertyKey | java.lang.String

type PropertyName = java.lang.String

type PropertyValue = java.lang.String

type ProviderName = java.lang.String

type ProvisionedProductAttributes = js.Array[ProvisionedProductAttribute]

type ProvisionedProductDetails = js.Array[ProvisionedProductDetail]

type ProvisionedProductFilters = StringDictionary[ProvisionedProductViewFilterValues]

type ProvisionedProductId = java.lang.String

type ProvisionedProductName = java.lang.String

type ProvisionedProductNameOrArn = java.lang.String

type ProvisionedProductPlanName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTE_SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTE_FAILED
  - java.lang.String
*/
type ProvisionedProductPlanStatus = _ProvisionedProductPlanStatus | java.lang.String

type ProvisionedProductPlanType = CLOUDFORMATION | java.lang.String

type ProvisionedProductPlans = js.Array[ProvisionedProductPlanSummary]

type ProvisionedProductProperties = StringDictionary[PropertyValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNDER_CHANGE
  - typingsJapgolly.awsSdk.awsSdkStrings.TAINTED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.PLAN_IN_PROGRESS
  - java.lang.String
*/
type ProvisionedProductStatus = _ProvisionedProductStatus | java.lang.String

type ProvisionedProductStatusMessage = java.lang.String

type ProvisionedProductType = java.lang.String

type ProvisionedProductViewFilterBy = SearchQuery | java.lang.String

type ProvisionedProductViewFilterValue = java.lang.String

type ProvisionedProductViewFilterValues = js.Array[ProvisionedProductViewFilterValue]

type ProvisioningArtifactActive = scala.Boolean

type ProvisioningArtifactCreatedTime = js.Date

type ProvisioningArtifactDescription = java.lang.String

type ProvisioningArtifactDetails = js.Array[ProvisioningArtifactDetail]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPRECATED
  - java.lang.String
*/
type ProvisioningArtifactGuidance = _ProvisioningArtifactGuidance | java.lang.String

type ProvisioningArtifactInfo = StringDictionary[ProvisioningArtifactInfoValue]

type ProvisioningArtifactInfoKey = java.lang.String

type ProvisioningArtifactInfoValue = java.lang.String

type ProvisioningArtifactName = java.lang.String

type ProvisioningArtifactOutputKey = java.lang.String

type ProvisioningArtifactOutputs = js.Array[ProvisioningArtifactOutput]

type ProvisioningArtifactParameters = js.Array[ProvisioningArtifactParameter]

type ProvisioningArtifactPropertyName = Id_ | java.lang.String

type ProvisioningArtifactPropertyValue = java.lang.String

type ProvisioningArtifactSummaries = js.Array[ProvisioningArtifactSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOUD_FORMATION_TEMPLATE
  - typingsJapgolly.awsSdk.awsSdkStrings.MARKETPLACE_AMI
  - typingsJapgolly.awsSdk.awsSdkStrings.MARKETPLACE_CAR
  - java.lang.String
*/
type ProvisioningArtifactType = _ProvisioningArtifactType | java.lang.String

type ProvisioningArtifactViews = js.Array[ProvisioningArtifactView]

type ProvisioningArtifacts = js.Array[ProvisioningArtifact]

type ProvisioningParameters = js.Array[ProvisioningParameter]

type RecordDetails = js.Array[RecordDetail]

type RecordErrors = js.Array[RecordError]

type RecordOutputs = js.Array[RecordOutput]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS_IN_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type RecordStatus = _RecordStatus | java.lang.String

type RecordTagKey = java.lang.String

type RecordTagValue = java.lang.String

type RecordTags = js.Array[RecordTag]

type RecordType = java.lang.String

type Region = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TRUE
  - typingsJapgolly.awsSdk.awsSdkStrings.FALSE
  - typingsJapgolly.awsSdk.awsSdkStrings.CONDITIONAL
  - java.lang.String
*/
type Replacement = _Replacement | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NEVER
  - typingsJapgolly.awsSdk.awsSdkStrings.CONDITIONALLY
  - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
  - java.lang.String
*/
type RequiresRecreation = _RequiresRecreation | java.lang.String

type ResourceARN = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PROPERTIES
  - typingsJapgolly.awsSdk.awsSdkStrings.METADATA
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATIONPOLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATEPOLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETIONPOLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.TAGS
  - java.lang.String
*/
type ResourceAttribute = _ResourceAttribute | java.lang.String

type ResourceChangeDetails = js.Array[ResourceChangeDetail]

type ResourceChanges = js.Array[ResourceChange]

type ResourceDetailARN = java.lang.String

type ResourceDetailCreatedTime = js.Date

type ResourceDetailDescription = java.lang.String

type ResourceDetailId = java.lang.String

type ResourceDetailName = java.lang.String

type ResourceDetails = js.Array[ResourceDetail]

type ResourceId = java.lang.String

type ResourceType = java.lang.String

type RetainPhysicalResources = scala.Boolean

type RoleArn = java.lang.String

type Scope = js.Array[ResourceAttribute]

type SearchFilterKey = java.lang.String

type SearchFilterValue = java.lang.String

type SearchProvisionedProductsPageSize = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DUPLICATE_RESOURCE
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.LIMIT_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.THROTTLING
  - java.lang.String
*/
type ServiceActionAssociationErrorCode = _ServiceActionAssociationErrorCode | java.lang.String

type ServiceActionAssociationErrorMessage = java.lang.String

type ServiceActionAssociations = js.Array[ServiceActionAssociation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Name_
  - typingsJapgolly.awsSdk.awsSdkStrings.Version_
  - typingsJapgolly.awsSdk.awsSdkStrings.AssumeRole
  - typingsJapgolly.awsSdk.awsSdkStrings.Parameters
  - java.lang.String
*/
type ServiceActionDefinitionKey = _ServiceActionDefinitionKey | java.lang.String

type ServiceActionDefinitionMap = StringDictionary[ServiceActionDefinitionValue]

type ServiceActionDefinitionType = SSM_AUTOMATION | java.lang.String

type ServiceActionDefinitionValue = java.lang.String

type ServiceActionDescription = java.lang.String

type ServiceActionName = java.lang.String

type ServiceActionSummaries = js.Array[ServiceActionSummary]

type ShareErrors = js.Array[ShareError]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED_WITH_ERRORS
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type ShareStatus = _ShareStatus | java.lang.String

type SortField = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type SourceProvisioningArtifactProperties = js.Array[SourceProvisioningArtifactPropertiesMap]

type SourceProvisioningArtifactPropertiesMap = StringDictionary[ProvisioningArtifactPropertyValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CURRENT
  - typingsJapgolly.awsSdk.awsSdkStrings.OUTDATED
  - typingsJapgolly.awsSdk.awsSdkStrings.INOPERABLE
  - java.lang.String
*/
type StackInstanceStatus = _StackInstanceStatus | java.lang.String

type StackInstances = js.Array[StackInstance]

type StackSetAccounts = js.Array[AccountId]

type StackSetFailureToleranceCount = Double

type StackSetFailureTolerancePercentage = Double

type StackSetMaxConcurrencyCount = Double

type StackSetMaxConcurrencyPercentage = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type StackSetOperationType = _StackSetOperationType | java.lang.String

type StackSetRegions = js.Array[Region]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type Status = _Status | java.lang.String

type StatusDetail = java.lang.String

type StatusMessage = java.lang.String

type String = java.lang.String

type SuccessfulShares = js.Array[AccountId]

type SupportDescription = java.lang.String

type SupportEmail = java.lang.String

type SupportUrl = java.lang.String

type TagKey = java.lang.String

type TagKeys = js.Array[TagKey]

type TagOptionActive = scala.Boolean

type TagOptionDetails = js.Array[TagOptionDetail]

type TagOptionId = java.lang.String

type TagOptionKey = java.lang.String

type TagOptionSummaries = js.Array[TagOptionSummary]

type TagOptionValue = java.lang.String

type TagOptionValues = js.Array[TagOptionValue]

type TagValue = java.lang.String

type Tags = js.Array[Tag]

type TotalResultsCount = Double

type UpdateProvisioningParameters = js.Array[UpdateProvisioningParameter]

type UpdatedTime = js.Date

type UsageInstructions = js.Array[UsageInstruction]

type UsePreviousValue = scala.Boolean

type UserArn = java.lang.String

type UserArnSession = java.lang.String

type Verbose = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2015-12-10`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
