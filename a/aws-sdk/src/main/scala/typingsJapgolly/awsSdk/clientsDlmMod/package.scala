package typingsJapgolly.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.HOURS
import typingsJapgolly.awsSdk.awsSdkStrings.MANAGED_CWE
import typingsJapgolly.awsSdk.awsSdkStrings.shareSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActionList = js.Array[Action]

type ActionName = java.lang.String

type AvailabilityZone = java.lang.String

type AvailabilityZoneList = js.Array[AvailabilityZone]

type AwsAccountId = java.lang.String

type CmkArn = java.lang.String

type CopyTags = Boolean

type CopyTagsNullable = Boolean

type Count = Double

type CronExpression = java.lang.String

type CrossRegionCopyActionList = js.Array[CrossRegionCopyAction]

type CrossRegionCopyRules = js.Array[CrossRegionCopyRule]

type DescriptionRegex = java.lang.String

type Encrypted = Boolean

type EventSourceValues = MANAGED_CWE | java.lang.String

type EventTypeValues = shareSnapshot | java.lang.String

type ExcludeBootVolume = Boolean

type ExcludeDataVolumeTagList = js.Array[Tag]

type ExecutionRoleArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type GettablePolicyStateValues = _GettablePolicyStateValues | java.lang.String

type Interval = Double

type IntervalUnitValues = HOURS | java.lang.String

type LifecyclePolicySummaryList = js.Array[LifecyclePolicySummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOUD
  - typingsJapgolly.awsSdk.awsSdkStrings.OUTPOST_LOCAL
  - java.lang.String
*/
type LocationValues = _LocationValues | java.lang.String

type NoReboot = Boolean

type PolicyArn = java.lang.String

type PolicyDescription = java.lang.String

type PolicyId = java.lang.String

type PolicyIdList = js.Array[PolicyId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EBS_SNAPSHOT_MANAGEMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.IMAGE_MANAGEMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.EVENT_BASED_POLICY
  - java.lang.String
*/
type PolicyTypeValues = _PolicyTypeValues | java.lang.String

type ResourceLocationList = js.Array[ResourceLocationValues]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOUD
  - typingsJapgolly.awsSdk.awsSdkStrings.OUTPOST
  - java.lang.String
*/
type ResourceLocationValues = _ResourceLocationValues | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VOLUME
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE
  - java.lang.String
*/
type ResourceTypeValues = _ResourceTypeValues | java.lang.String

type ResourceTypeValuesList = js.Array[ResourceTypeValues]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DAYS
  - typingsJapgolly.awsSdk.awsSdkStrings.WEEKS
  - typingsJapgolly.awsSdk.awsSdkStrings.MONTHS
  - typingsJapgolly.awsSdk.awsSdkStrings.YEARS
  - java.lang.String
*/
type RetentionIntervalUnitValues = _RetentionIntervalUnitValues | java.lang.String

type ScheduleList = js.Array[Schedule]

type ScheduleName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type SettablePolicyStateValues = _SettablePolicyStateValues | java.lang.String

type ShareRules = js.Array[ShareRule]

type ShareTargetAccountList = js.Array[AwsAccountId]

type SnapshotOwnerList = js.Array[AwsAccountId]

type StandardTierRetainRuleCount = Double

type StandardTierRetainRuleInterval = Double

type StatusMessage = java.lang.String

type String = java.lang.String

type TagFilter = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type TagsToAddFilterList = js.Array[TagFilter]

type TagsToAddList = js.Array[Tag]

type Target = java.lang.String

type TargetRegion = java.lang.String

type TargetTagList = js.Array[Tag]

type TargetTagsFilterList = js.Array[TagFilter]

type Time = java.lang.String

type TimesList = js.Array[Time]

type Timestamp = js.Date

type VariableTagsList = js.Array[Tag]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-01-12`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
