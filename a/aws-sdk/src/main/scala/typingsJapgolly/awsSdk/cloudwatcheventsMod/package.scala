package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudwatcheventsMod {
  type AccountId = java.lang.String
  type Action = java.lang.String
  type Arn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AssignPublicIp = typingsJapgolly.awsSdk.cloudwatcheventsMod._AssignPublicIp | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.cloudwatcheventsMod.ClientApiVersions
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type EventBusList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.EventBus]
  type EventBusName = java.lang.String
  type EventId = java.lang.String
  type EventPattern = java.lang.String
  type EventResource = java.lang.String
  type EventResourceList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.EventResource]
  type EventSourceList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.EventSource]
  type EventSourceName = java.lang.String
  type EventSourceNamePrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type EventSourceState = typingsJapgolly.awsSdk.cloudwatcheventsMod._EventSourceState | java.lang.String
  type EventTime = js.Date
  type InputTransformerPathKey = java.lang.String
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2
    - typingsJapgolly.awsSdk.awsSdkStrings.FARGATE
    - java.lang.String
  */
  type LaunchType = typingsJapgolly.awsSdk.cloudwatcheventsMod._LaunchType | java.lang.String
  type LimitMax100 = scala.Double
  type LimitMin1 = scala.Double
  type ManagedBy = java.lang.String
  type MessageGroupId = java.lang.String
  type NextToken = java.lang.String
  type NonPartnerEventBusName = java.lang.String
  type PartnerEventSourceAccountList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.PartnerEventSourceAccount]
  type PartnerEventSourceList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.PartnerEventSource]
  type PartnerEventSourceNamePrefix = java.lang.String
  type Principal = java.lang.String
  type PutEventsRequestEntryList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.PutEventsRequestEntry]
  type PutEventsResultEntryList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.PutEventsResultEntry]
  type PutPartnerEventsRequestEntryList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.PutPartnerEventsRequestEntry]
  type PutPartnerEventsResultEntryList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.PutPartnerEventsResultEntry]
  type PutTargetsResultEntryList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.PutTargetsResultEntry]
  type RemoveTargetsResultEntryList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.RemoveTargetsResultEntry]
  type RoleArn = java.lang.String
  type RuleArn = java.lang.String
  type RuleDescription = java.lang.String
  type RuleName = java.lang.String
  type RuleNameList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.RuleName]
  type RuleResponseList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.Rule]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type RuleState = typingsJapgolly.awsSdk.cloudwatcheventsMod._RuleState | java.lang.String
  type RunCommandTargetKey = java.lang.String
  type RunCommandTargetValue = java.lang.String
  type RunCommandTargetValues = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.RunCommandTargetValue]
  type RunCommandTargets = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.RunCommandTarget]
  type ScheduleExpression = java.lang.String
  type StatementId = java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.Tag]
  type TagValue = java.lang.String
  type TargetArn = java.lang.String
  type TargetId = java.lang.String
  type TargetIdList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.TargetId]
  type TargetInput = java.lang.String
  type TargetInputPath = java.lang.String
  type TargetList = js.Array[typingsJapgolly.awsSdk.cloudwatcheventsMod.Target]
  type TargetPartitionKeyPath = java.lang.String
  type Timestamp = js.Date
  type TransformerInput = java.lang.String
  type TransformerPaths = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cloudwatcheventsMod.TargetInputPath]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-02-03`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-10-07`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.cloudwatcheventsMod._apiVersion | java.lang.String
}
