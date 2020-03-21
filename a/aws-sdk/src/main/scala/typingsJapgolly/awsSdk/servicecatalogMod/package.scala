package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object servicecatalogMod {
  type AcceptLanguage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Account_
    - typingsJapgolly.awsSdk.awsSdkStrings.Role_
    - typingsJapgolly.awsSdk.awsSdkStrings.User_
    - java.lang.String
  */
  type AccessLevelFilterKey = typingsJapgolly.awsSdk.servicecatalogMod._AccessLevelFilterKey | java.lang.String
  type AccessLevelFilterValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNDER_CHANGE
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AccessStatus = typingsJapgolly.awsSdk.servicecatalogMod._AccessStatus | java.lang.String
  type AccountId = java.lang.String
  type AccountIds = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.AccountId]
  type AddTags = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.Tag]
  type AllowedValue = java.lang.String
  type AllowedValues = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.AllowedValue]
  type ApproximateCount = scala.Double
  type AttributeValue = java.lang.String
  type BudgetName = java.lang.String
  type Budgets = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.BudgetDetail]
  type CausingEntity = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ADD
    - typingsJapgolly.awsSdk.awsSdkStrings.MODIFY
    - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE
    - java.lang.String
  */
  type ChangeAction = typingsJapgolly.awsSdk.servicecatalogMod._ChangeAction | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.servicecatalogMod.ClientApiVersions
  type CloudWatchDashboardName = java.lang.String
  type CloudWatchDashboards = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.CloudWatchDashboard]
  type ConstraintDescription = java.lang.String
  type ConstraintDetails = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ConstraintDetail]
  type ConstraintParameters = java.lang.String
  type ConstraintSummaries = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ConstraintSummary]
  type ConstraintType = java.lang.String
  type CopyOption = typingsJapgolly.awsSdk.awsSdkStrings.CopyTags | java.lang.String
  type CopyOptions = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.CopyOption]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CopyProductStatus = typingsJapgolly.awsSdk.servicecatalogMod._CopyProductStatus | java.lang.String
  type CreatedTime = js.Date
  type CreationTime = js.Date
  type DefaultValue = java.lang.String
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
  type EvaluationType = typingsJapgolly.awsSdk.servicecatalogMod._EvaluationType | java.lang.String
  type ExecutionParameterKey = java.lang.String
  type ExecutionParameterMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.servicecatalogMod.ExecutionParameterValueList]
  type ExecutionParameterType = java.lang.String
  type ExecutionParameterValue = java.lang.String
  type ExecutionParameterValueList = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ExecutionParameterValue]
  type ExecutionParameters = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ExecutionParameter]
  type FailedServiceActionAssociations = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.FailedServiceActionAssociation]
  type HasDefaultPath = scala.Boolean
  type Id = java.lang.String
  type IdempotencyToken = java.lang.String
  type IgnoreErrors = scala.Boolean
  type InstructionType = java.lang.String
  type InstructionValue = java.lang.String
  type LastRequestId = java.lang.String
  type LaunchPathSummaries = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.LaunchPathSummary]
  type LogicalResourceId = java.lang.String
  type Message = java.lang.String
  type Namespaces = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.AccountId]
  type NoEcho = scala.Boolean
  type NotificationArn = java.lang.String
  type NotificationArns = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.NotificationArn]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION
    - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
    - java.lang.String
  */
  type OrganizationNodeType = typingsJapgolly.awsSdk.servicecatalogMod._OrganizationNodeType | java.lang.String
  type OrganizationNodeValue = java.lang.String
  type OrganizationNodes = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.OrganizationNode]
  type OutputKey = java.lang.String
  type OutputValue = java.lang.String
  type PageSize = scala.Double
  type PageToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterType = java.lang.String
  type ParameterValue = java.lang.String
  type PhysicalId = java.lang.String
  type PhysicalResourceId = java.lang.String
  type PlanResourceType = java.lang.String
  type PortfolioDescription = java.lang.String
  type PortfolioDetails = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.PortfolioDetail]
  type PortfolioDisplayName = java.lang.String
  type PortfolioName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORTED
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_SERVICECATALOG
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_ORGANIZATIONS
    - java.lang.String
  */
  type PortfolioShareType = typingsJapgolly.awsSdk.servicecatalogMod._PortfolioShareType | java.lang.String
  type PrincipalARN = java.lang.String
  type PrincipalType = typingsJapgolly.awsSdk.awsSdkStrings.IAM | java.lang.String
  type Principals = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.Principal]
  type ProductArn = java.lang.String
  type ProductSource = typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOUD_FORMATION_TEMPLATE
    - typingsJapgolly.awsSdk.awsSdkStrings.MARKETPLACE
    - java.lang.String
  */
  type ProductType = typingsJapgolly.awsSdk.servicecatalogMod._ProductType | java.lang.String
  type ProductViewAggregationType = java.lang.String
  type ProductViewAggregationValues = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ProductViewAggregationValue]
  type ProductViewAggregations = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.servicecatalogMod.ProductViewAggregationValues]
  type ProductViewDetails = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ProductViewDetail]
  type ProductViewDistributor = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FullTextSearch
    - typingsJapgolly.awsSdk.awsSdkStrings.Owner_
    - typingsJapgolly.awsSdk.awsSdkStrings.ProductType
    - typingsJapgolly.awsSdk.awsSdkStrings.SourceProductId
    - java.lang.String
  */
  type ProductViewFilterBy = typingsJapgolly.awsSdk.servicecatalogMod._ProductViewFilterBy | java.lang.String
  type ProductViewFilterValue = java.lang.String
  type ProductViewFilterValues = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ProductViewFilterValue]
  type ProductViewFilters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.servicecatalogMod.ProductViewFilterValues]
  type ProductViewName = java.lang.String
  type ProductViewOwner = java.lang.String
  type ProductViewShortDescription = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Title_
    - typingsJapgolly.awsSdk.awsSdkStrings.VersionCount
    - typingsJapgolly.awsSdk.awsSdkStrings.CreationDate
    - java.lang.String
  */
  type ProductViewSortBy = typingsJapgolly.awsSdk.servicecatalogMod._ProductViewSortBy | java.lang.String
  type ProductViewSummaries = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ProductViewSummary]
  type PropertyKey = typingsJapgolly.awsSdk.awsSdkStrings.OWNER | java.lang.String
  type PropertyName = java.lang.String
  type PropertyValue = java.lang.String
  type ProviderName = java.lang.String
  type ProvisionedProductAttributes = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ProvisionedProductAttribute]
  type ProvisionedProductDetails = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ProvisionedProductDetail]
  type ProvisionedProductFilters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.servicecatalogMod.ProvisionedProductViewFilterValues]
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
  type ProvisionedProductPlanStatus = typingsJapgolly.awsSdk.servicecatalogMod._ProvisionedProductPlanStatus | java.lang.String
  type ProvisionedProductPlanType = typingsJapgolly.awsSdk.awsSdkStrings.CLOUDFORMATION | java.lang.String
  type ProvisionedProductPlans = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ProvisionedProductPlanSummary]
  type ProvisionedProductProperties = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.servicecatalogMod.PropertyValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.UNDER_CHANGE
    - typingsJapgolly.awsSdk.awsSdkStrings.TAINTED
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.PLAN_IN_PROGRESS
    - java.lang.String
  */
  type ProvisionedProductStatus = typingsJapgolly.awsSdk.servicecatalogMod._ProvisionedProductStatus | java.lang.String
  type ProvisionedProductStatusMessage = java.lang.String
  type ProvisionedProductType = java.lang.String
  type ProvisionedProductViewFilterBy = typingsJapgolly.awsSdk.awsSdkStrings.SearchQuery | java.lang.String
  type ProvisionedProductViewFilterValue = java.lang.String
  type ProvisionedProductViewFilterValues = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ProvisionedProductViewFilterValue]
  type ProvisioningArtifactActive = scala.Boolean
  type ProvisioningArtifactCreatedTime = js.Date
  type ProvisioningArtifactDescription = java.lang.String
  type ProvisioningArtifactDetails = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ProvisioningArtifactDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPRECATED
    - java.lang.String
  */
  type ProvisioningArtifactGuidance = typingsJapgolly.awsSdk.servicecatalogMod._ProvisioningArtifactGuidance | java.lang.String
  type ProvisioningArtifactInfo = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.servicecatalogMod.ProvisioningArtifactInfoValue]
  type ProvisioningArtifactInfoKey = java.lang.String
  type ProvisioningArtifactInfoValue = java.lang.String
  type ProvisioningArtifactName = java.lang.String
  type ProvisioningArtifactParameters = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ProvisioningArtifactParameter]
  type ProvisioningArtifactPropertyName = typingsJapgolly.awsSdk.awsSdkStrings.Id_ | java.lang.String
  type ProvisioningArtifactPropertyValue = java.lang.String
  type ProvisioningArtifactSummaries = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ProvisioningArtifactSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOUD_FORMATION_TEMPLATE
    - typingsJapgolly.awsSdk.awsSdkStrings.MARKETPLACE_AMI
    - typingsJapgolly.awsSdk.awsSdkStrings.MARKETPLACE_CAR
    - java.lang.String
  */
  type ProvisioningArtifactType = typingsJapgolly.awsSdk.servicecatalogMod._ProvisioningArtifactType | java.lang.String
  type ProvisioningArtifactViews = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ProvisioningArtifactView]
  type ProvisioningArtifacts = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ProvisioningArtifact]
  type ProvisioningParameters = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ProvisioningParameter]
  type RecordDetails = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.RecordDetail]
  type RecordErrors = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.RecordError]
  type RecordOutputs = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.RecordOutput]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS_IN_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RecordStatus = typingsJapgolly.awsSdk.servicecatalogMod._RecordStatus | java.lang.String
  type RecordTagKey = java.lang.String
  type RecordTagValue = java.lang.String
  type RecordTags = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.RecordTag]
  type RecordType = java.lang.String
  type Region = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TRUE
    - typingsJapgolly.awsSdk.awsSdkStrings.FALSE
    - typingsJapgolly.awsSdk.awsSdkStrings.CONDITIONAL
    - java.lang.String
  */
  type Replacement = typingsJapgolly.awsSdk.servicecatalogMod._Replacement | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NEVER
    - typingsJapgolly.awsSdk.awsSdkStrings.CONDITIONALLY
    - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
    - java.lang.String
  */
  type RequiresRecreation = typingsJapgolly.awsSdk.servicecatalogMod._RequiresRecreation | java.lang.String
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
  type ResourceAttribute = typingsJapgolly.awsSdk.servicecatalogMod._ResourceAttribute | java.lang.String
  type ResourceChangeDetails = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ResourceChangeDetail]
  type ResourceChanges = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ResourceChange]
  type ResourceDetailARN = java.lang.String
  type ResourceDetailCreatedTime = js.Date
  type ResourceDetailDescription = java.lang.String
  type ResourceDetailId = java.lang.String
  type ResourceDetailName = java.lang.String
  type ResourceDetails = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ResourceDetail]
  type ResourceId = java.lang.String
  type ResourceType = java.lang.String
  type Scope = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ResourceAttribute]
  type SearchFilterKey = java.lang.String
  type SearchFilterValue = java.lang.String
  type SearchProvisionedProductsPageSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DUPLICATE_RESOURCE
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND
    - typingsJapgolly.awsSdk.awsSdkStrings.THROTTLING
    - java.lang.String
  */
  type ServiceActionAssociationErrorCode = typingsJapgolly.awsSdk.servicecatalogMod._ServiceActionAssociationErrorCode | java.lang.String
  type ServiceActionAssociationErrorMessage = java.lang.String
  type ServiceActionAssociations = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ServiceActionAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Name_
    - typingsJapgolly.awsSdk.awsSdkStrings.Version_
    - typingsJapgolly.awsSdk.awsSdkStrings.AssumeRole
    - typingsJapgolly.awsSdk.awsSdkStrings.Parameters
    - java.lang.String
  */
  type ServiceActionDefinitionKey = typingsJapgolly.awsSdk.servicecatalogMod._ServiceActionDefinitionKey | java.lang.String
  type ServiceActionDefinitionMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.servicecatalogMod.ServiceActionDefinitionValue]
  type ServiceActionDefinitionType = typingsJapgolly.awsSdk.awsSdkStrings.SSM_AUTOMATION | java.lang.String
  type ServiceActionDefinitionValue = java.lang.String
  type ServiceActionDescription = java.lang.String
  type ServiceActionName = java.lang.String
  type ServiceActionSummaries = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ServiceActionSummary]
  type ShareErrors = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.ShareError]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED_WITH_ERRORS
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ShareStatus = typingsJapgolly.awsSdk.servicecatalogMod._ShareStatus | java.lang.String
  type SortField = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrder = typingsJapgolly.awsSdk.servicecatalogMod._SortOrder | java.lang.String
  type SourceProvisioningArtifactProperties = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.SourceProvisioningArtifactPropertiesMap]
  type SourceProvisioningArtifactPropertiesMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.servicecatalogMod.ProvisioningArtifactPropertyValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CURRENT
    - typingsJapgolly.awsSdk.awsSdkStrings.OUTDATED
    - typingsJapgolly.awsSdk.awsSdkStrings.INOPERABLE
    - java.lang.String
  */
  type StackInstanceStatus = typingsJapgolly.awsSdk.servicecatalogMod._StackInstanceStatus | java.lang.String
  type StackInstances = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.StackInstance]
  type StackSetAccounts = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.AccountId]
  type StackSetFailureToleranceCount = scala.Double
  type StackSetFailureTolerancePercentage = scala.Double
  type StackSetMaxConcurrencyCount = scala.Double
  type StackSetMaxConcurrencyPercentage = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type StackSetOperationType = typingsJapgolly.awsSdk.servicecatalogMod._StackSetOperationType | java.lang.String
  type StackSetRegions = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.Region]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type Status = typingsJapgolly.awsSdk.servicecatalogMod._Status | java.lang.String
  type StatusDetail = java.lang.String
  type StatusMessage = java.lang.String
  type SuccessfulShares = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.AccountId]
  type SupportDescription = java.lang.String
  type SupportEmail = java.lang.String
  type SupportUrl = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.TagKey]
  type TagOptionActive = scala.Boolean
  type TagOptionDetails = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.TagOptionDetail]
  type TagOptionId = java.lang.String
  type TagOptionKey = java.lang.String
  type TagOptionSummaries = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.TagOptionSummary]
  type TagOptionValue = java.lang.String
  type TagOptionValues = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.TagOptionValue]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.Tag]
  type TotalResultsCount = scala.Double
  type UpdateProvisioningParameters = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.UpdateProvisioningParameter]
  type UpdatedTime = js.Date
  type UsageInstructions = js.Array[typingsJapgolly.awsSdk.servicecatalogMod.UsageInstruction]
  type UsePreviousValue = scala.Boolean
  type UserArn = java.lang.String
  type UserArnSession = java.lang.String
  type Verbose = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-12-10`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.servicecatalogMod._apiVersion | java.lang.String
}
