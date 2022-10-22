package typingsJapgolly.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.SSM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AlarmRecommendationList = js.Array[AlarmRecommendation]

type AlarmReferenceIdList = js.Array[String500]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Metric_
  - typingsJapgolly.awsSdk.awsSdkStrings.Composite
  - typingsJapgolly.awsSdk.awsSdkStrings.Canary_
  - typingsJapgolly.awsSdk.awsSdkStrings.Logs
  - typingsJapgolly.awsSdk.awsSdkStrings.Event_
  - java.lang.String
*/
type AlarmType = _AlarmType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Daily_
  - java.lang.String
*/
type AppAssessmentScheduleType = _AppAssessmentScheduleType | String

type AppAssessmentSummaryList = js.Array[AppAssessmentSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PolicyBreached
  - typingsJapgolly.awsSdk.awsSdkStrings.PolicyMet
  - typingsJapgolly.awsSdk.awsSdkStrings.NotAssessed
  - typingsJapgolly.awsSdk.awsSdkStrings.ChangesDetected
  - java.lang.String
*/
type AppComplianceStatusType = _AppComplianceStatusType | String

type AppComponentList = js.Array[AppComponent]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
  - java.lang.String
*/
type AppStatusType = _AppStatusType | String

type AppSummaryList = js.Array[AppSummary]

type AppTemplateBody = String

type AppVersionList = js.Array[AppVersionSummary]

type Arn = String

type ArnList = js.Array[Arn]

type AssessmentCompliance = StringDictionary[DisruptionCompliance]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.User_
  - typingsJapgolly.awsSdk.awsSdkStrings.System_
  - java.lang.String
*/
type AssessmentInvoker = _AssessmentInvoker | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - java.lang.String
*/
type AssessmentStatus = _AssessmentStatus | String

type AssessmentStatusList = js.Array[AssessmentStatus]

type AwsRegion = String

type BooleanOptional = Boolean

type ClientToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PolicyBreached
  - typingsJapgolly.awsSdk.awsSdkStrings.PolicyMet
  - java.lang.String
*/
type ComplianceStatus = _ComplianceStatus | String

type ComponentCompliancesList = js.Array[AppComponentCompliance]

type ComponentRecommendationList = js.Array[ComponentRecommendation]

type ConfigRecommendationList = js.Array[ConfigRecommendation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LeastCost
  - typingsJapgolly.awsSdk.awsSdkStrings.LeastChange
  - typingsJapgolly.awsSdk.awsSdkStrings.BestAZRecovery
  - typingsJapgolly.awsSdk.awsSdkStrings.LeastErrors
  - typingsJapgolly.awsSdk.awsSdkStrings.BestAttainable
  - java.lang.String
*/
type ConfigRecommendationOptimizationType = _ConfigRecommendationOptimizationType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Hourly_
  - typingsJapgolly.awsSdk.awsSdkStrings.Daily_
  - typingsJapgolly.awsSdk.awsSdkStrings.Monthly_
  - typingsJapgolly.awsSdk.awsSdkStrings.Yearly
  - java.lang.String
*/
type CostFrequency = _CostFrequency | String

type CurrencyCode = String

type CustomerId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AnyLocation
  - typingsJapgolly.awsSdk.awsSdkStrings.SameContinent
  - typingsJapgolly.awsSdk.awsSdkStrings.SameCountry
  - java.lang.String
*/
type DataLocationConstraint = _DataLocationConstraint | String

type DisruptionPolicy = StringDictionary[FailurePolicy]

type DisruptionResiliencyScore = StringDictionary[Double]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Software_
  - typingsJapgolly.awsSdk.awsSdkStrings.Hardware
  - typingsJapgolly.awsSdk.awsSdkStrings.AZ
  - typingsJapgolly.awsSdk.awsSdkStrings.Region_
  - java.lang.String
*/
type DisruptionType = _DisruptionType | String

type DocumentName = String

type Double = scala.Double

type EntityDescription = String

type EntityId = String

type EntityName = String

type EntityNameList = js.Array[EntityName]

type EntityVersion = String

type ErrorMessage = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.L1
  - typingsJapgolly.awsSdk.awsSdkStrings.L2
  - typingsJapgolly.awsSdk.awsSdkStrings.L3
  - typingsJapgolly.awsSdk.awsSdkStrings.L4
  - java.lang.String
*/
type EstimatedCostTier = _EstimatedCostTier | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MultiSite
  - typingsJapgolly.awsSdk.awsSdkStrings.WarmStandby
  - typingsJapgolly.awsSdk.awsSdkStrings.PilotLight
  - typingsJapgolly.awsSdk.awsSdkStrings.BackupAndRestore
  - typingsJapgolly.awsSdk.awsSdkStrings.NoRecoveryPlan
  - java.lang.String
*/
type HaArchitecture = _HaArchitecture | String

type MaxResults = scala.Double

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Arn_
  - typingsJapgolly.awsSdk.awsSdkStrings.Native
  - java.lang.String
*/
type PhysicalIdentifierType = _PhysicalIdentifierType | String

type PhysicalResourceList = js.Array[PhysicalResource]

type RecommendationCompliance = StringDictionary[RecommendationDisruptionCompliance]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BreachedUnattainable
  - typingsJapgolly.awsSdk.awsSdkStrings.BreachedCanMeet
  - typingsJapgolly.awsSdk.awsSdkStrings.MetCanImprove
  - java.lang.String
*/
type RecommendationComplianceStatus = _RecommendationComplianceStatus | String

type RecommendationIdList = js.Array[Uuid]

type RecommendationItemList = js.Array[RecommendationItem]

type RecommendationTemplateList = js.Array[RecommendationTemplate]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - java.lang.String
*/
type RecommendationTemplateStatus = _RecommendationTemplateStatus | String

type RecommendationTemplateStatusList = js.Array[RecommendationTemplateStatus]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Alarm_
  - typingsJapgolly.awsSdk.awsSdkStrings.Sop
  - typingsJapgolly.awsSdk.awsSdkStrings.Test_
  - java.lang.String
*/
type RenderRecommendationType = _RenderRecommendationType | String

type RenderRecommendationTypeList = js.Array[RenderRecommendationType]

type ResiliencyPolicies = js.Array[ResiliencyPolicy]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MissionCritical
  - typingsJapgolly.awsSdk.awsSdkStrings.Critical_
  - typingsJapgolly.awsSdk.awsSdkStrings.Important
  - typingsJapgolly.awsSdk.awsSdkStrings.CoreServices
  - typingsJapgolly.awsSdk.awsSdkStrings.NonCritical
  - java.lang.String
*/
type ResiliencyPolicyTier = _ResiliencyPolicyTier | String

type ResourceErrorList = js.Array[ResourceError]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - java.lang.String
*/
type ResourceImportStatusType = _ResourceImportStatusType | String

type ResourceMappingList = js.Array[ResourceMapping]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CfnStack
  - typingsJapgolly.awsSdk.awsSdkStrings.Resource_
  - typingsJapgolly.awsSdk.awsSdkStrings.AppRegistryApp
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceGroup
  - typingsJapgolly.awsSdk.awsSdkStrings.Terraform_
  - java.lang.String
*/
type ResourceMappingType = _ResourceMappingType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - java.lang.String
*/
type ResourceResolutionStatusType = _ResourceResolutionStatusType | String

type S3Url = String

type Seconds = scala.Double

type SopRecommendationList = js.Array[SopRecommendation]

type SopServiceType = SSM | String

type SpecReferenceId = String

type String255 = String

type String255List = js.Array[String255]

type String500 = String

type SuggestedChangesList = js.Array[EntityDescription]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CfnYaml
  - typingsJapgolly.awsSdk.awsSdkStrings.CfnJson
  - java.lang.String
*/
type TemplateFormat = _TemplateFormat | String

type TerraformSourceList = js.Array[TerraformSource]

type TestRecommendationList = js.Array[TestRecommendation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Small_
  - typingsJapgolly.awsSdk.awsSdkStrings.Medium_
  - typingsJapgolly.awsSdk.awsSdkStrings.High_
  - java.lang.String
*/
type TestRisk = _TestRisk | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Software_
  - typingsJapgolly.awsSdk.awsSdkStrings.Hardware
  - typingsJapgolly.awsSdk.awsSdkStrings.AZ
  - typingsJapgolly.awsSdk.awsSdkStrings.Region_
  - java.lang.String
*/
type TestType = _TestType | String

type TimeStamp = js.Date

type UnsupportedResourceList = js.Array[UnsupportedResource]

type Uuid = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-04-30`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
