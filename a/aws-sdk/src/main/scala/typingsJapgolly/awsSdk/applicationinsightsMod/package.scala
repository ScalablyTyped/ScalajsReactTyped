package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object applicationinsightsMod {
  type AffectedResource = java.lang.String
  type AmazonResourceName = java.lang.String
  type ApplicationComponentList = js.Array[typingsJapgolly.awsSdk.applicationinsightsMod.ApplicationComponent]
  type ApplicationInfoList = js.Array[typingsJapgolly.awsSdk.applicationinsightsMod.ApplicationInfo]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.applicationinsightsMod.ClientApiVersions
  type ComponentConfiguration = java.lang.String
  type ComponentName = java.lang.String
  type ConfigurationEventDetail = java.lang.String
  type ConfigurationEventList = js.Array[typingsJapgolly.awsSdk.applicationinsightsMod.ConfigurationEvent]
  type ConfigurationEventMonitoredResourceARN = java.lang.String
  type ConfigurationEventResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDWATCH_ALARM
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDFORMATION
    - typingsJapgolly.awsSdk.awsSdkStrings.SSM_ASSOCIATION
    - java.lang.String
  */
  type ConfigurationEventResourceType = typingsJapgolly.awsSdk.applicationinsightsMod._ConfigurationEventResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INFO
    - typingsJapgolly.awsSdk.awsSdkStrings.WARN
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ConfigurationEventStatus = typingsJapgolly.awsSdk.applicationinsightsMod._ConfigurationEventStatus | java.lang.String
  type ConfigurationEventTime = js.Date
  type EndTime = js.Date
  type Feedback = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.applicationinsightsMod.FeedbackValue]
  type FeedbackKey = typingsJapgolly.awsSdk.awsSdkStrings.INSIGHTS_FEEDBACK | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_SPECIFIED
    - typingsJapgolly.awsSdk.awsSdkStrings.USEFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_USEFUL
    - java.lang.String
  */
  type FeedbackValue = typingsJapgolly.awsSdk.applicationinsightsMod._FeedbackValue | java.lang.String
  type Insights = java.lang.String
  type LifeCycle = java.lang.String
  type LineTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.WARN
    - typingsJapgolly.awsSdk.awsSdkStrings.INFO
    - java.lang.String
  */
  type LogFilter = typingsJapgolly.awsSdk.applicationinsightsMod._LogFilter | java.lang.String
  type LogGroup = java.lang.String
  type LogPatternList = js.Array[typingsJapgolly.awsSdk.applicationinsightsMod.LogPattern]
  type LogPatternName = java.lang.String
  type LogPatternRank = scala.Double
  type LogPatternRegex = java.lang.String
  type LogPatternSetList = js.Array[typingsJapgolly.awsSdk.applicationinsightsMod.LogPatternSetName]
  type LogPatternSetName = java.lang.String
  type LogText = java.lang.String
  type MaxEntities = scala.Double
  type MetricName = java.lang.String
  type MetricNamespace = java.lang.String
  type Monitor = scala.Boolean
  type NewComponentName = java.lang.String
  type ObservationId = java.lang.String
  type ObservationList = js.Array[typingsJapgolly.awsSdk.applicationinsightsMod.Observation]
  type OpsCenterEnabled = scala.Boolean
  type OpsItemSNSTopicArn = java.lang.String
  type PaginationToken = java.lang.String
  type ProblemId = java.lang.String
  type ProblemList = js.Array[typingsJapgolly.awsSdk.applicationinsightsMod.Problem]
  type Remarks = java.lang.String
  type RemoveSNSTopic = scala.Boolean
  type ResourceARN = java.lang.String
  type ResourceGroupName = java.lang.String
  type ResourceList = js.Array[typingsJapgolly.awsSdk.applicationinsightsMod.ResourceARN]
  type ResourceType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Low_
    - typingsJapgolly.awsSdk.awsSdkStrings.Medium_
    - typingsJapgolly.awsSdk.awsSdkStrings.High_
    - java.lang.String
  */
  type SeverityLevel = typingsJapgolly.awsSdk.applicationinsightsMod._SeverityLevel | java.lang.String
  type SourceARN = java.lang.String
  type SourceType = java.lang.String
  type StartTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IGNORE
    - typingsJapgolly.awsSdk.awsSdkStrings.RESOLVED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type Status = typingsJapgolly.awsSdk.applicationinsightsMod._Status | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.applicationinsightsMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.applicationinsightsMod.Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.DOT_NET_CORE
    - typingsJapgolly.awsSdk.awsSdkStrings.DOT_NET_WORKER
    - typingsJapgolly.awsSdk.awsSdkStrings.DOT_NET_WEB
    - typingsJapgolly.awsSdk.awsSdkStrings.SQL_SERVER
    - java.lang.String
  */
  type Tier = typingsJapgolly.awsSdk.applicationinsightsMod._Tier | java.lang.String
  type Title = java.lang.String
  type Unit = java.lang.String
  type Value = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-11-25`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.applicationinsightsMod._apiVersion | java.lang.String
}
