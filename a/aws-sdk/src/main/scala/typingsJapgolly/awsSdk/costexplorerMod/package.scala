package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object costexplorerMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PAYER
    - typingsJapgolly.awsSdk.awsSdkStrings.LINKED
    - java.lang.String
  */
  type AccountScope = typingsJapgolly.awsSdk.costexplorerMod._AccountScope | java.lang.String
  type AmortizedRecurringFee = java.lang.String
  type AmortizedUpfrontFee = java.lang.String
  type Arn = java.lang.String
  type AttributeType = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.costexplorerMod.AttributeValue]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.costexplorerMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COST_AND_USAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.RESERVATIONS
    - typingsJapgolly.awsSdk.awsSdkStrings.SAVINGS_PLANS
    - java.lang.String
  */
  type Context = typingsJapgolly.awsSdk.costexplorerMod._Context | java.lang.String
  type CostCategoryName = java.lang.String
  type CostCategoryReferencesList = js.Array[typingsJapgolly.awsSdk.costexplorerMod.CostCategoryReference]
  type CostCategoryRuleVersion = typingsJapgolly.awsSdk.awsSdkStrings.CostCategoryExpressionDotv1 | java.lang.String
  type CostCategoryRulesList = js.Array[typingsJapgolly.awsSdk.costexplorerMod.CostCategoryRule]
  type CostCategoryValue = java.lang.String
  type CoverageHoursPercentage = java.lang.String
  type CoverageNormalizedUnitsPercentage = java.lang.String
  type CoveragesByTime = js.Array[typingsJapgolly.awsSdk.costexplorerMod.CoverageByTime]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AZ
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.LINKED_ACCOUNT
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATION
    - typingsJapgolly.awsSdk.awsSdkStrings.PURCHASE_TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.REGION
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE
    - typingsJapgolly.awsSdk.awsSdkStrings.USAGE_TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.USAGE_TYPE_GROUP
    - typingsJapgolly.awsSdk.awsSdkStrings.RECORD_TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.OPERATING_SYSTEM
    - typingsJapgolly.awsSdk.awsSdkStrings.TENANCY
    - typingsJapgolly.awsSdk.awsSdkStrings.SCOPE
    - typingsJapgolly.awsSdk.awsSdkStrings.PLATFORM
    - typingsJapgolly.awsSdk.awsSdkStrings.SUBSCRIPTION_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.LEGAL_ENTITY_NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_OPTION
    - typingsJapgolly.awsSdk.awsSdkStrings.DATABASE_ENGINE
    - typingsJapgolly.awsSdk.awsSdkStrings.CACHE_ENGINE
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_TYPE_FAMILY
    - typingsJapgolly.awsSdk.awsSdkStrings.BILLING_ENTITY
    - typingsJapgolly.awsSdk.awsSdkStrings.RESERVATION_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.RIGHTSIZING_TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.SAVINGS_PLANS_TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.SAVINGS_PLAN_ARN
    - typingsJapgolly.awsSdk.awsSdkStrings.PAYMENT_OPTION
    - java.lang.String
  */
  type Dimension = typingsJapgolly.awsSdk.costexplorerMod._Dimension | java.lang.String
  type DimensionValuesWithAttributesList = js.Array[typingsJapgolly.awsSdk.costexplorerMod.DimensionValuesWithAttributes]
  type Entity = java.lang.String
  type Estimated = scala.Boolean
  type Expressions = js.Array[typingsJapgolly.awsSdk.costexplorerMod.Expression]
  type ForecastResultsByTime = js.Array[typingsJapgolly.awsSdk.costexplorerMod.ForecastResult]
  type GenericBoolean = scala.Boolean
  type GenericString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DAILY
    - typingsJapgolly.awsSdk.awsSdkStrings.MONTHLY
    - typingsJapgolly.awsSdk.awsSdkStrings.HOURLY
    - java.lang.String
  */
  type Granularity = typingsJapgolly.awsSdk.costexplorerMod._Granularity | java.lang.String
  type GroupDefinitionKey = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DIMENSION
    - typingsJapgolly.awsSdk.awsSdkStrings.TAG
    - typingsJapgolly.awsSdk.awsSdkStrings.COST_CATEGORY
    - java.lang.String
  */
  type GroupDefinitionType = typingsJapgolly.awsSdk.costexplorerMod._GroupDefinitionType | java.lang.String
  type GroupDefinitions = js.Array[typingsJapgolly.awsSdk.costexplorerMod.GroupDefinition]
  type Groups = js.Array[typingsJapgolly.awsSdk.costexplorerMod.Group]
  type Key = java.lang.String
  type Keys = js.Array[typingsJapgolly.awsSdk.costexplorerMod.Key]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SEVEN_DAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.THIRTY_DAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.SIXTY_DAYS
    - java.lang.String
  */
  type LookbackPeriodInDays = typingsJapgolly.awsSdk.costexplorerMod._LookbackPeriodInDays | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BLENDED_COST
    - typingsJapgolly.awsSdk.awsSdkStrings.UNBLENDED_COST
    - typingsJapgolly.awsSdk.awsSdkStrings.AMORTIZED_COST
    - typingsJapgolly.awsSdk.awsSdkStrings.NET_UNBLENDED_COST
    - typingsJapgolly.awsSdk.awsSdkStrings.NET_AMORTIZED_COST
    - typingsJapgolly.awsSdk.awsSdkStrings.USAGE_QUANTITY
    - typingsJapgolly.awsSdk.awsSdkStrings.NORMALIZED_USAGE_AMOUNT
    - java.lang.String
  */
  type Metric = typingsJapgolly.awsSdk.costexplorerMod._Metric | java.lang.String
  type MetricAmount = java.lang.String
  type MetricName = java.lang.String
  type MetricNames = js.Array[typingsJapgolly.awsSdk.costexplorerMod.MetricName]
  type MetricUnit = java.lang.String
  type Metrics = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.costexplorerMod.MetricValue]
  type NetRISavings = java.lang.String
  type NextPageToken = java.lang.String
  type NonNegativeInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - typingsJapgolly.awsSdk.awsSdkStrings.CONVERTIBLE
    - java.lang.String
  */
  type OfferingClass = typingsJapgolly.awsSdk.costexplorerMod._OfferingClass | java.lang.String
  type OnDemandCost = java.lang.String
  type OnDemandCostOfRIHoursUsed = java.lang.String
  type OnDemandHours = java.lang.String
  type OnDemandNormalizedUnits = java.lang.String
  type PageSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NO_UPFRONT
    - typingsJapgolly.awsSdk.awsSdkStrings.PARTIAL_UPFRONT
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL_UPFRONT
    - typingsJapgolly.awsSdk.awsSdkStrings.LIGHT_UTILIZATION
    - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM_UTILIZATION
    - typingsJapgolly.awsSdk.awsSdkStrings.HEAVY_UTILIZATION
    - java.lang.String
  */
  type PaymentOption = typingsJapgolly.awsSdk.costexplorerMod._PaymentOption | java.lang.String
  type PredictionIntervalLevel = scala.Double
  type PurchasedHours = java.lang.String
  type PurchasedUnits = java.lang.String
  type ReservationCoverageGroups = js.Array[typingsJapgolly.awsSdk.costexplorerMod.ReservationCoverageGroup]
  type ReservationGroupKey = java.lang.String
  type ReservationGroupValue = java.lang.String
  type ReservationPurchaseRecommendationDetails = js.Array[typingsJapgolly.awsSdk.costexplorerMod.ReservationPurchaseRecommendationDetail]
  type ReservationPurchaseRecommendations = js.Array[typingsJapgolly.awsSdk.costexplorerMod.ReservationPurchaseRecommendation]
  type ReservationUtilizationGroups = js.Array[typingsJapgolly.awsSdk.costexplorerMod.ReservationUtilizationGroup]
  type ReservedHours = java.lang.String
  type ReservedNormalizedUnits = java.lang.String
  type ResultsByTime = js.Array[typingsJapgolly.awsSdk.costexplorerMod.ResultByTime]
  type RightsizingRecommendationList = js.Array[typingsJapgolly.awsSdk.costexplorerMod.RightsizingRecommendation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE
    - typingsJapgolly.awsSdk.awsSdkStrings.MODIFY
    - java.lang.String
  */
  type RightsizingType = typingsJapgolly.awsSdk.costexplorerMod._RightsizingType | java.lang.String
  type SavingsPlanArn = java.lang.String
  type SavingsPlansCoverages = js.Array[typingsJapgolly.awsSdk.costexplorerMod.SavingsPlansCoverage]
  type SavingsPlansPurchaseRecommendationDetailList = js.Array[typingsJapgolly.awsSdk.costexplorerMod.SavingsPlansPurchaseRecommendationDetail]
  type SavingsPlansUtilizationDetails = js.Array[typingsJapgolly.awsSdk.costexplorerMod.SavingsPlansUtilizationDetail]
  type SavingsPlansUtilizationsByTime = js.Array[typingsJapgolly.awsSdk.costexplorerMod.SavingsPlansUtilizationByTime]
  type SearchString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPUTE_SP
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2_INSTANCE_SP
    - java.lang.String
  */
  type SupportedSavingsPlansType = typingsJapgolly.awsSdk.costexplorerMod._SupportedSavingsPlansType | java.lang.String
  type TagKey = java.lang.String
  type TagList = js.Array[typingsJapgolly.awsSdk.costexplorerMod.Entity]
  type TagValuesList = js.Array[typingsJapgolly.awsSdk.costexplorerMod.TagValues]
  type TargetInstancesList = js.Array[typingsJapgolly.awsSdk.costexplorerMod.TargetInstance]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ONE_YEAR
    - typingsJapgolly.awsSdk.awsSdkStrings.THREE_YEARS
    - java.lang.String
  */
  type TermInYears = typingsJapgolly.awsSdk.costexplorerMod._TermInYears | java.lang.String
  type TotalActualHours = java.lang.String
  type TotalActualUnits = java.lang.String
  type TotalAmortizedFee = java.lang.String
  type TotalPotentialRISavings = java.lang.String
  type TotalRunningHours = java.lang.String
  type TotalRunningNormalizedUnits = java.lang.String
  type UnusedHours = java.lang.String
  type UnusedUnits = java.lang.String
  type UtilizationPercentage = java.lang.String
  type UtilizationPercentageInUnits = java.lang.String
  type UtilizationsByTime = js.Array[typingsJapgolly.awsSdk.costexplorerMod.UtilizationByTime]
  type Value = java.lang.String
  type Values = js.Array[typingsJapgolly.awsSdk.costexplorerMod.Value]
  type YearMonthDay = java.lang.String
  type ZonedDateTime = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-10-25`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.costexplorerMod._apiVersion | java.lang.String
}
