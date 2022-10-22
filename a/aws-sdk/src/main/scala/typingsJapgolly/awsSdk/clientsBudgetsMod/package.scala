package typingsJapgolly.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type ActionHistories = js.Array[ActionHistory]

type ActionId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDBY
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTION_SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTION_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.REVERSE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.REVERSE_SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.REVERSE_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.RESET_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.RESET_FAILURE
  - java.lang.String
*/
type ActionStatus = _ActionStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STOP_EC2_INSTANCES
  - typingsJapgolly.awsSdk.awsSdkStrings.STOP_RDS_INSTANCES
  - java.lang.String
*/
type ActionSubType = _ActionSubType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.APPLY_IAM_POLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.APPLY_SCP_POLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.RUN_SSM_DOCUMENTS
  - java.lang.String
*/
type ActionType = _ActionType | String

type Actions = js.Array[Action]

type AdjustmentPeriod = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATIC
  - typingsJapgolly.awsSdk.awsSdkStrings.MANUAL
  - java.lang.String
*/
type ApprovalModel = _ApprovalModel | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HISTORICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.FORECAST
  - java.lang.String
*/
type AutoAdjustType = _AutoAdjustType | String

type BudgetName = String

type BudgetNotificationsForAccountList = js.Array[BudgetNotificationsForAccount]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.COST
  - typingsJapgolly.awsSdk.awsSdkStrings.RI_UTILIZATION
  - typingsJapgolly.awsSdk.awsSdkStrings.RI_COVERAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.SAVINGS_PLANS_UTILIZATION
  - typingsJapgolly.awsSdk.awsSdkStrings.SAVINGS_PLANS_COVERAGE
  - java.lang.String
*/
type BudgetType = _BudgetType | String

type BudgetedAndActualAmountsList = js.Array[BudgetedAndActualAmounts]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.EQUAL_TO
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | String

type CostFilters = StringDictionary[DimensionValues]

type DimensionValue = String

type DimensionValues = js.Array[DimensionValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_ACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_ACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_ACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTE_ACTION
  - java.lang.String
*/
type EventType = _EventType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.APPROVE_BUDGET_ACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.RETRY_BUDGET_ACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.REVERSE_BUDGET_ACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.RESET_BUDGET_ACTION
  - java.lang.String
*/
type ExecutionType = _ExecutionType | String

type GenericString = String

type GenericTimestamp = js.Date

type Group = String

type Groups = js.Array[Group]

type InstanceId = String

type InstanceIds = js.Array[InstanceId]

type MaxResults = Double

type MaxResultsBudgetNotifications = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OK
  - typingsJapgolly.awsSdk.awsSdkStrings.ALARM
  - java.lang.String
*/
type NotificationState = _NotificationState | String

type NotificationThreshold = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.FORECASTED
  - java.lang.String
*/
type NotificationType = _NotificationType | String

type NotificationWithSubscribersList = js.Array[NotificationWithSubscribers]

type Notifications = js.Array[Notification]

type NullableBoolean = Boolean

type NumericValue = String

type PlannedBudgetLimits = StringDictionary[Spend]

type PolicyArn = String

type PolicyId = String

type Region = String

type Role = String

type RoleArn = String

type Roles = js.Array[Role]

type SubscriberAddress = String

type Subscribers = js.Array[Subscriber]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SNS
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
type SubscriptionType = _SubscriptionType | String

type TargetId = String

type TargetIds = js.Array[TargetId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PERCENTAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.ABSOLUTE_VALUE
  - java.lang.String
*/
type ThresholdType = _ThresholdType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DAILY
  - typingsJapgolly.awsSdk.awsSdkStrings.MONTHLY
  - typingsJapgolly.awsSdk.awsSdkStrings.QUARTERLY
  - typingsJapgolly.awsSdk.awsSdkStrings.ANNUALLY
  - java.lang.String
*/
type TimeUnit = _TimeUnit | String

type UnitValue = String

type User = String

type Users = js.Array[User]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-10-20`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
