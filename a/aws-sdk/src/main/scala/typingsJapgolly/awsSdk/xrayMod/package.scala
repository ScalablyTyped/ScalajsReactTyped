package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xrayMod {
  type AliasList = js.Array[typingsJapgolly.awsSdk.xrayMod.Alias]
  type AliasNames = js.Array[typingsJapgolly.awsSdk.xrayMod.String]
  type AnnotationKey = java.lang.String
  type Annotations = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.xrayMod.ValuesWithServiceIds]
  type AttributeKey = java.lang.String
  type AttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.xrayMod.AttributeValue]
  type AttributeValue = java.lang.String
  type Boolean = scala.Boolean
  type BorrowCount = scala.Double
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.xrayMod.ClientApiVersions
  type ClientID = java.lang.String
  type Double = scala.Double
  type EC2InstanceId = java.lang.String
  type EdgeList = js.Array[typingsJapgolly.awsSdk.xrayMod.Edge]
  type EncryptionKeyId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type EncryptionStatus = typingsJapgolly.awsSdk.xrayMod._EncryptionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type EncryptionType = typingsJapgolly.awsSdk.xrayMod._EncryptionType | java.lang.String
  type EntitySelectorExpression = java.lang.String
  type ErrorRootCauseEntityPath = js.Array[typingsJapgolly.awsSdk.xrayMod.ErrorRootCauseEntity]
  type ErrorRootCauseServices = js.Array[typingsJapgolly.awsSdk.xrayMod.ErrorRootCauseService]
  type ErrorRootCauses = js.Array[typingsJapgolly.awsSdk.xrayMod.ErrorRootCause]
  type FaultRootCauseEntityPath = js.Array[typingsJapgolly.awsSdk.xrayMod.FaultRootCauseEntity]
  type FaultRootCauseServices = js.Array[typingsJapgolly.awsSdk.xrayMod.FaultRootCauseService]
  type FaultRootCauses = js.Array[typingsJapgolly.awsSdk.xrayMod.FaultRootCause]
  type FilterExpression = java.lang.String
  type FixedRate = scala.Double
  type GetGroupsNextToken = java.lang.String
  type GroupARN = java.lang.String
  type GroupName = java.lang.String
  type GroupSummaryList = js.Array[typingsJapgolly.awsSdk.xrayMod.GroupSummary]
  type HTTPMethod = java.lang.String
  type Histogram = js.Array[typingsJapgolly.awsSdk.xrayMod.HistogramEntry]
  type Host = java.lang.String
  type Hostname = java.lang.String
  type Integer = scala.Double
  type NullableBoolean = scala.Boolean
  type NullableDouble = scala.Double
  type NullableInteger = scala.Double
  type NullableLong = scala.Double
  type Priority = scala.Double
  type RequestCount = scala.Double
  type ReservoirSize = scala.Double
  type ResourceARN = java.lang.String
  type ResponseTimeRootCauseEntityPath = js.Array[typingsJapgolly.awsSdk.xrayMod.ResponseTimeRootCauseEntity]
  type ResponseTimeRootCauseServices = js.Array[typingsJapgolly.awsSdk.xrayMod.ResponseTimeRootCauseService]
  type ResponseTimeRootCauses = js.Array[typingsJapgolly.awsSdk.xrayMod.ResponseTimeRootCause]
  type RootCauseExceptions = js.Array[typingsJapgolly.awsSdk.xrayMod.RootCauseException]
  type RuleName = java.lang.String
  type SampledCount = scala.Double
  type SamplingRuleRecordList = js.Array[typingsJapgolly.awsSdk.xrayMod.SamplingRuleRecord]
  type SamplingStatisticSummaryList = js.Array[typingsJapgolly.awsSdk.xrayMod.SamplingStatisticSummary]
  type SamplingStatisticsDocumentList = js.Array[typingsJapgolly.awsSdk.xrayMod.SamplingStatisticsDocument]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PartialScan
    - typingsJapgolly.awsSdk.awsSdkStrings.FixedRate
    - java.lang.String
  */
  type SamplingStrategyName = typingsJapgolly.awsSdk.xrayMod._SamplingStrategyName | java.lang.String
  type SamplingTargetDocumentList = js.Array[typingsJapgolly.awsSdk.xrayMod.SamplingTargetDocument]
  type SegmentDocument = java.lang.String
  type SegmentId = java.lang.String
  type SegmentList = js.Array[typingsJapgolly.awsSdk.xrayMod.Segment]
  type ServiceIds = js.Array[typingsJapgolly.awsSdk.xrayMod.ServiceId]
  type ServiceList = js.Array[typingsJapgolly.awsSdk.xrayMod.Service]
  type ServiceName = java.lang.String
  type ServiceNames = js.Array[typingsJapgolly.awsSdk.xrayMod.String]
  type ServiceType = java.lang.String
  type String = java.lang.String
  type TelemetryRecordList = js.Array[typingsJapgolly.awsSdk.xrayMod.TelemetryRecord]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TraceId
    - typingsJapgolly.awsSdk.awsSdkStrings.Event_
    - java.lang.String
  */
  type TimeRangeType = typingsJapgolly.awsSdk.xrayMod._TimeRangeType | java.lang.String
  type TimeSeriesServiceStatisticsList = js.Array[typingsJapgolly.awsSdk.xrayMod.TimeSeriesServiceStatistics]
  type Timestamp = js.Date
  type TraceAvailabilityZones = js.Array[typingsJapgolly.awsSdk.xrayMod.AvailabilityZoneDetail]
  type TraceId = java.lang.String
  type TraceIdList = js.Array[typingsJapgolly.awsSdk.xrayMod.TraceId]
  type TraceInstanceIds = js.Array[typingsJapgolly.awsSdk.xrayMod.InstanceIdDetail]
  type TraceList = js.Array[typingsJapgolly.awsSdk.xrayMod.Trace]
  type TraceResourceARNs = js.Array[typingsJapgolly.awsSdk.xrayMod.ResourceARNDetail]
  type TraceSegmentDocument = java.lang.String
  type TraceSegmentDocumentList = js.Array[typingsJapgolly.awsSdk.xrayMod.TraceSegmentDocument]
  type TraceSummaryList = js.Array[typingsJapgolly.awsSdk.xrayMod.TraceSummary]
  type TraceUsers = js.Array[typingsJapgolly.awsSdk.xrayMod.TraceUser]
  type URLPath = java.lang.String
  type UnprocessedStatisticsList = js.Array[typingsJapgolly.awsSdk.xrayMod.UnprocessedStatistics]
  type UnprocessedTraceIdList = js.Array[typingsJapgolly.awsSdk.xrayMod.TraceId]
  type UnprocessedTraceSegmentList = js.Array[typingsJapgolly.awsSdk.xrayMod.UnprocessedTraceSegment]
  type ValuesWithServiceIds = js.Array[typingsJapgolly.awsSdk.xrayMod.ValueWithServiceIds]
  type Version = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-04-12`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.xrayMod._apiVersion | java.lang.String
}
