package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object budgetsMod {
  type AccountId = java.lang.String
  type BudgetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.COST
    - typingsJapgolly.awsSdk.awsSdkStrings.RI_UTILIZATION
    - typingsJapgolly.awsSdk.awsSdkStrings.RI_COVERAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.SAVINGS_PLANS_UTILIZATION
    - typingsJapgolly.awsSdk.awsSdkStrings.SAVINGS_PLANS_COVERAGE
    - java.lang.String
  */
  type BudgetType = typingsJapgolly.awsSdk.budgetsMod._BudgetType | java.lang.String
  type BudgetedAndActualAmountsList = js.Array[typingsJapgolly.awsSdk.budgetsMod.BudgetedAndActualAmounts]
  type Budgets = js.Array[typingsJapgolly.awsSdk.budgetsMod.Budget]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.budgetsMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
    - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
    - typingsJapgolly.awsSdk.awsSdkStrings.EQUAL_TO
    - java.lang.String
  */
  type ComparisonOperator = typingsJapgolly.awsSdk.budgetsMod._ComparisonOperator | java.lang.String
  type CostFilters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.budgetsMod.DimensionValues]
  type DimensionValues = js.Array[typingsJapgolly.awsSdk.budgetsMod.GenericString]
  type GenericString = java.lang.String
  type GenericTimestamp = js.Date
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OK
    - typingsJapgolly.awsSdk.awsSdkStrings.ALARM
    - java.lang.String
  */
  type NotificationState = typingsJapgolly.awsSdk.budgetsMod._NotificationState | java.lang.String
  type NotificationThreshold = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTUAL
    - typingsJapgolly.awsSdk.awsSdkStrings.FORECASTED
    - java.lang.String
  */
  type NotificationType = typingsJapgolly.awsSdk.budgetsMod._NotificationType | java.lang.String
  type NotificationWithSubscribersList = js.Array[typingsJapgolly.awsSdk.budgetsMod.NotificationWithSubscribers]
  type Notifications = js.Array[typingsJapgolly.awsSdk.budgetsMod.Notification]
  type NullableBoolean = scala.Boolean
  type NumericValue = java.lang.String
  type PlannedBudgetLimits = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.budgetsMod.Spend]
  type SubscriberAddress = java.lang.String
  type Subscribers = js.Array[typingsJapgolly.awsSdk.budgetsMod.Subscriber]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SNS
    - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
    - java.lang.String
  */
  type SubscriptionType = typingsJapgolly.awsSdk.budgetsMod._SubscriptionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PERCENTAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.ABSOLUTE_VALUE
    - java.lang.String
  */
  type ThresholdType = typingsJapgolly.awsSdk.budgetsMod._ThresholdType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DAILY
    - typingsJapgolly.awsSdk.awsSdkStrings.MONTHLY
    - typingsJapgolly.awsSdk.awsSdkStrings.QUARTERLY
    - typingsJapgolly.awsSdk.awsSdkStrings.ANNUALLY
    - java.lang.String
  */
  type TimeUnit = typingsJapgolly.awsSdk.budgetsMod._TimeUnit | java.lang.String
  type UnitValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-10-20`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.budgetsMod._apiVersion | java.lang.String
}
