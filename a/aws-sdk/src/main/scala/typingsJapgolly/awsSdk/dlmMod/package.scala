package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dlmMod {
  type AvailabilityZone = java.lang.String
  type AvailabilityZoneList = js.Array[typingsJapgolly.awsSdk.dlmMod.AvailabilityZone]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.dlmMod.ClientApiVersions
  type CmkArn = java.lang.String
  type CopyTags = scala.Boolean
  type CopyTagsNullable = scala.Boolean
  type Count = scala.Double
  type CrossRegionCopyRules = js.Array[typingsJapgolly.awsSdk.dlmMod.CrossRegionCopyRule]
  type Encrypted = scala.Boolean
  type ExcludeBootVolume = scala.Boolean
  type ExecutionRoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type GettablePolicyStateValues = typingsJapgolly.awsSdk.dlmMod._GettablePolicyStateValues | java.lang.String
  type Interval = scala.Double
  type IntervalUnitValues = typingsJapgolly.awsSdk.awsSdkStrings.HOURS | java.lang.String
  type LifecyclePolicySummaryList = js.Array[typingsJapgolly.awsSdk.dlmMod.LifecyclePolicySummary]
  type PolicyArn = java.lang.String
  type PolicyDescription = java.lang.String
  type PolicyId = java.lang.String
  type PolicyIdList = js.Array[typingsJapgolly.awsSdk.dlmMod.PolicyId]
  type PolicyTypeValues = typingsJapgolly.awsSdk.awsSdkStrings.EBS_SNAPSHOT_MANAGEMENT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.VOLUME
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE
    - java.lang.String
  */
  type ResourceTypeValues = typingsJapgolly.awsSdk.dlmMod._ResourceTypeValues | java.lang.String
  type ResourceTypeValuesList = js.Array[typingsJapgolly.awsSdk.dlmMod.ResourceTypeValues]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.WEEKS
    - typingsJapgolly.awsSdk.awsSdkStrings.MONTHS
    - typingsJapgolly.awsSdk.awsSdkStrings.YEARS
    - java.lang.String
  */
  type RetentionIntervalUnitValues = typingsJapgolly.awsSdk.dlmMod._RetentionIntervalUnitValues | java.lang.String
  type ScheduleList = js.Array[typingsJapgolly.awsSdk.dlmMod.Schedule]
  type ScheduleName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type SettablePolicyStateValues = typingsJapgolly.awsSdk.dlmMod._SettablePolicyStateValues | java.lang.String
  type StatusMessage = java.lang.String
  type String = java.lang.String
  type TagFilter = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.dlmMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dlmMod.TagValue]
  type TagValue = java.lang.String
  type TagsToAddFilterList = js.Array[typingsJapgolly.awsSdk.dlmMod.TagFilter]
  type TagsToAddList = js.Array[typingsJapgolly.awsSdk.dlmMod.Tag]
  type TargetRegion = java.lang.String
  type TargetTagList = js.Array[typingsJapgolly.awsSdk.dlmMod.Tag]
  type TargetTagsFilterList = js.Array[typingsJapgolly.awsSdk.dlmMod.TagFilter]
  type Time = java.lang.String
  type TimesList = js.Array[typingsJapgolly.awsSdk.dlmMod.Time]
  type Timestamp = js.Date
  type VariableTagsList = js.Array[typingsJapgolly.awsSdk.dlmMod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-01-12`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.dlmMod._apiVersion | java.lang.String
}
