package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codestarnotificationsMod {
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.codestarnotificationsMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CreatedTimestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BASIC
    - typingsJapgolly.awsSdk.awsSdkStrings.FULL
    - java.lang.String
  */
  type DetailType = typingsJapgolly.awsSdk.codestarnotificationsMod._DetailType | java.lang.String
  type EventTypeBatch = js.Array[typingsJapgolly.awsSdk.codestarnotificationsMod.EventTypeSummary]
  type EventTypeId = java.lang.String
  type EventTypeIds = js.Array[typingsJapgolly.awsSdk.codestarnotificationsMod.EventTypeId]
  type EventTypeName = java.lang.String
  type ForceUnsubscribeAll = scala.Boolean
  type LastModifiedTimestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_NAME
    - java.lang.String
  */
  type ListEventTypesFilterName = typingsJapgolly.awsSdk.codestarnotificationsMod._ListEventTypesFilterName | java.lang.String
  type ListEventTypesFilterValue = java.lang.String
  type ListEventTypesFilters = js.Array[typingsJapgolly.awsSdk.codestarnotificationsMod.ListEventTypesFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EVENT_TYPE_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATED_BY
    - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE
    - typingsJapgolly.awsSdk.awsSdkStrings.TARGET_ADDRESS
    - java.lang.String
  */
  type ListNotificationRulesFilterName = typingsJapgolly.awsSdk.codestarnotificationsMod._ListNotificationRulesFilterName | java.lang.String
  type ListNotificationRulesFilterValue = java.lang.String
  type ListNotificationRulesFilters = js.Array[typingsJapgolly.awsSdk.codestarnotificationsMod.ListNotificationRulesFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TARGET_TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.TARGET_ADDRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.TARGET_STATUS
    - java.lang.String
  */
  type ListTargetsFilterName = typingsJapgolly.awsSdk.codestarnotificationsMod._ListTargetsFilterName | java.lang.String
  type ListTargetsFilterValue = java.lang.String
  type ListTargetsFilters = js.Array[typingsJapgolly.awsSdk.codestarnotificationsMod.ListTargetsFilter]
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type NotificationRuleArn = java.lang.String
  type NotificationRuleBatch = js.Array[typingsJapgolly.awsSdk.codestarnotificationsMod.NotificationRuleSummary]
  type NotificationRuleCreatedBy = java.lang.String
  type NotificationRuleId = java.lang.String
  type NotificationRuleName = java.lang.String
  type NotificationRuleResource = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type NotificationRuleStatus = typingsJapgolly.awsSdk.codestarnotificationsMod._NotificationRuleStatus | java.lang.String
  type ResourceType = java.lang.String
  type ServiceName = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsJapgolly.awsSdk.codestarnotificationsMod.TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.codestarnotificationsMod.TagValue]
  type TargetAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.UNREACHABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEACTIVATED
    - java.lang.String
  */
  type TargetStatus = typingsJapgolly.awsSdk.codestarnotificationsMod._TargetStatus | java.lang.String
  type TargetType = java.lang.String
  type Targets = js.Array[typingsJapgolly.awsSdk.codestarnotificationsMod.Target]
  type TargetsBatch = js.Array[typingsJapgolly.awsSdk.codestarnotificationsMod.TargetSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-10-15`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.codestarnotificationsMod._apiVersion | java.lang.String
}
