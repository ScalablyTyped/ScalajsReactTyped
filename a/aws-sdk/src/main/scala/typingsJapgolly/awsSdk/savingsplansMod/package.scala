package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object savingsplansMod {
  type Amount = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.savingsplansMod.ClientApiVersions
  type ClientToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CNY
    - typingsJapgolly.awsSdk.awsSdkStrings.USD
    - java.lang.String
  */
  type CurrencyCode = typingsJapgolly.awsSdk.savingsplansMod._CurrencyCode | java.lang.String
  type CurrencyList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.CurrencyCode]
  type DurationsList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlansDuration]
  type EC2InstanceFamily = java.lang.String
  type FilterValuesList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.JsonSafeFilterValueString]
  type JsonSafeFilterValueString = java.lang.String
  type ListOfStrings = js.Array[typingsJapgolly.awsSdk.savingsplansMod.String]
  type MaxResults = scala.Double
  type PageSize = scala.Double
  type PaginationToken = java.lang.String
  type Region = java.lang.String
  type SavingsPlanArn = java.lang.String
  type SavingsPlanArnList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanArn]
  type SavingsPlanDescription = java.lang.String
  type SavingsPlanDescriptionsList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanDescription]
  type SavingsPlanFilterList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanFilter]
  type SavingsPlanId = java.lang.String
  type SavingsPlanIdList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanId]
  type SavingsPlanList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlan]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.region__
    - typingsJapgolly.awsSdk.awsSdkStrings.instanceFamily
    - java.lang.String
  */
  type SavingsPlanOfferingFilterAttribute = typingsJapgolly.awsSdk.savingsplansMod._SavingsPlanOfferingFilterAttribute | java.lang.String
  type SavingsPlanOfferingFiltersList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanOfferingFilterElement]
  type SavingsPlanOfferingId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.region__
    - typingsJapgolly.awsSdk.awsSdkStrings.instanceFamily
    - java.lang.String
  */
  type SavingsPlanOfferingPropertyKey = typingsJapgolly.awsSdk.savingsplansMod._SavingsPlanOfferingPropertyKey | java.lang.String
  type SavingsPlanOfferingPropertyList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanOfferingProperty]
  type SavingsPlanOfferingRateFiltersList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanOfferingRateFilterElement]
  type SavingsPlanOfferingRatePropertyList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanOfferingRateProperty]
  type SavingsPlanOfferingRatesList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanOfferingRate]
  type SavingsPlanOfferingsList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanOffering]
  type SavingsPlanOperation = java.lang.String
  type SavingsPlanOperationList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanOperation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`All Upfront`
    - typingsJapgolly.awsSdk.awsSdkStrings.`Partial Upfront`
    - typingsJapgolly.awsSdk.awsSdkStrings.`No Upfront`
    - java.lang.String
  */
  type SavingsPlanPaymentOption = typingsJapgolly.awsSdk.savingsplansMod._SavingsPlanPaymentOption | java.lang.String
  type SavingsPlanPaymentOptionList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanPaymentOption]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2
    - typingsJapgolly.awsSdk.awsSdkStrings.Fargate_
    - java.lang.String
  */
  type SavingsPlanProductType = typingsJapgolly.awsSdk.savingsplansMod._SavingsPlanProductType | java.lang.String
  type SavingsPlanProductTypeList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanProductType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.region__
    - typingsJapgolly.awsSdk.awsSdkStrings.instanceFamily
    - typingsJapgolly.awsSdk.awsSdkStrings.instanceType_
    - typingsJapgolly.awsSdk.awsSdkStrings.productDescription
    - typingsJapgolly.awsSdk.awsSdkStrings.tenancy_
    - typingsJapgolly.awsSdk.awsSdkStrings.productId
    - java.lang.String
  */
  type SavingsPlanRateFilterAttribute = typingsJapgolly.awsSdk.savingsplansMod._SavingsPlanRateFilterAttribute | java.lang.String
  type SavingsPlanRateFilterList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanRateFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.region__
    - typingsJapgolly.awsSdk.awsSdkStrings.instanceType_
    - typingsJapgolly.awsSdk.awsSdkStrings.productDescription
    - typingsJapgolly.awsSdk.awsSdkStrings.tenancy_
    - typingsJapgolly.awsSdk.awsSdkStrings.productType_
    - typingsJapgolly.awsSdk.awsSdkStrings.serviceCode
    - typingsJapgolly.awsSdk.awsSdkStrings.usageType
    - typingsJapgolly.awsSdk.awsSdkStrings.operation_
    - java.lang.String
  */
  type SavingsPlanRateFilterName = typingsJapgolly.awsSdk.savingsplansMod._SavingsPlanRateFilterName | java.lang.String
  type SavingsPlanRateList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanRate]
  type SavingsPlanRateOperation = java.lang.String
  type SavingsPlanRateOperationList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanRateOperation]
  type SavingsPlanRatePricePerUnit = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.region__
    - typingsJapgolly.awsSdk.awsSdkStrings.instanceType_
    - typingsJapgolly.awsSdk.awsSdkStrings.instanceFamily
    - typingsJapgolly.awsSdk.awsSdkStrings.productDescription
    - typingsJapgolly.awsSdk.awsSdkStrings.tenancy_
    - java.lang.String
  */
  type SavingsPlanRatePropertyKey = typingsJapgolly.awsSdk.savingsplansMod._SavingsPlanRatePropertyKey | java.lang.String
  type SavingsPlanRatePropertyList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanRateProperty]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AmazonEC2
    - typingsJapgolly.awsSdk.awsSdkStrings.AmazonECS
    - java.lang.String
  */
  type SavingsPlanRateServiceCode = typingsJapgolly.awsSdk.savingsplansMod._SavingsPlanRateServiceCode | java.lang.String
  type SavingsPlanRateServiceCodeList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanRateServiceCode]
  type SavingsPlanRateUnit = typingsJapgolly.awsSdk.awsSdkStrings.Hrs | java.lang.String
  type SavingsPlanRateUsageType = java.lang.String
  type SavingsPlanRateUsageTypeList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanRateUsageType]
  type SavingsPlanServiceCode = java.lang.String
  type SavingsPlanServiceCodeList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanServiceCode]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`payment-pending`
    - typingsJapgolly.awsSdk.awsSdkStrings.`payment-failed`
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.retired
    - java.lang.String
  */
  type SavingsPlanState = typingsJapgolly.awsSdk.savingsplansMod._SavingsPlanState | java.lang.String
  type SavingsPlanStateList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanState]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Compute
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2Instance
    - java.lang.String
  */
  type SavingsPlanType = typingsJapgolly.awsSdk.savingsplansMod._SavingsPlanType | java.lang.String
  type SavingsPlanTypeList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanType]
  type SavingsPlanUsageType = java.lang.String
  type SavingsPlanUsageTypeList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.SavingsPlanUsageType]
  type SavingsPlansDuration = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.region__
    - typingsJapgolly.awsSdk.awsSdkStrings.`ec2-instance-family`
    - typingsJapgolly.awsSdk.awsSdkStrings.commitment
    - typingsJapgolly.awsSdk.awsSdkStrings.upfront
    - typingsJapgolly.awsSdk.awsSdkStrings.term
    - typingsJapgolly.awsSdk.awsSdkStrings.`savings-plan-type`
    - typingsJapgolly.awsSdk.awsSdkStrings.`payment-option`
    - typingsJapgolly.awsSdk.awsSdkStrings.start_
    - typingsJapgolly.awsSdk.awsSdkStrings.end_
    - java.lang.String
  */
  type SavingsPlansFilterName = typingsJapgolly.awsSdk.savingsplansMod._SavingsPlansFilterName | java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.savingsplansMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.savingsplansMod.TagValue]
  type TagValue = java.lang.String
  type TermDurationInSeconds = scala.Double
  type UUID = java.lang.String
  type UUIDs = js.Array[typingsJapgolly.awsSdk.savingsplansMod.UUID]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-06-28`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.savingsplansMod._apiVersion | java.lang.String
}
