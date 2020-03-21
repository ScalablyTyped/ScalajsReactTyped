package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinpointMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OPEN_APP
    - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_LINK
    - typingsJapgolly.awsSdk.awsSdkStrings.URL
    - java.lang.String
  */
  type Action = typingsJapgolly.awsSdk.pinpointMod._Action | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INCLUSIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.EXCLUSIVE
    - java.lang.String
  */
  type AttributeType = typingsJapgolly.awsSdk.pinpointMod._AttributeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULED
    - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTING
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_NEXT_RUN
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.PAUSED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type CampaignStatus = typingsJapgolly.awsSdk.pinpointMod._CampaignStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GCM
    - typingsJapgolly.awsSdk.awsSdkStrings.APNS
    - typingsJapgolly.awsSdk.awsSdkStrings.APNS_SANDBOX
    - typingsJapgolly.awsSdk.awsSdkStrings.APNS_VOIP
    - typingsJapgolly.awsSdk.awsSdkStrings.APNS_VOIP_SANDBOX
    - typingsJapgolly.awsSdk.awsSdkStrings.ADM
    - typingsJapgolly.awsSdk.awsSdkStrings.SMS
    - typingsJapgolly.awsSdk.awsSdkStrings.VOICE
    - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
    - typingsJapgolly.awsSdk.awsSdkStrings.BAIDU
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
    - java.lang.String
  */
  type ChannelType = typingsJapgolly.awsSdk.pinpointMod._ChannelType | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.pinpointMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESSFUL
    - typingsJapgolly.awsSdk.awsSdkStrings.THROTTLED
    - typingsJapgolly.awsSdk.awsSdkStrings.TEMPORARY_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.PERMANENT_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.OPT_OUT
    - typingsJapgolly.awsSdk.awsSdkStrings.DUPLICATE
    - java.lang.String
  */
  type DeliveryStatus = typingsJapgolly.awsSdk.pinpointMod._DeliveryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INCLUSIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.EXCLUSIVE
    - java.lang.String
  */
  type DimensionType = typingsJapgolly.awsSdk.pinpointMod._DimensionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HR_24
    - typingsJapgolly.awsSdk.awsSdkStrings.DAY_7
    - typingsJapgolly.awsSdk.awsSdkStrings.DAY_14
    - typingsJapgolly.awsSdk.awsSdkStrings.DAY_30
    - java.lang.String
  */
  type Duration = typingsJapgolly.awsSdk.pinpointMod._Duration | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM
    - typingsJapgolly.awsSdk.awsSdkStrings.ENDPOINT
    - java.lang.String
  */
  type FilterType = typingsJapgolly.awsSdk.pinpointMod._FilterType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CSV
    - typingsJapgolly.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type Format = typingsJapgolly.awsSdk.pinpointMod._Format | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ONCE
    - typingsJapgolly.awsSdk.awsSdkStrings.HOURLY
    - typingsJapgolly.awsSdk.awsSdkStrings.DAILY
    - typingsJapgolly.awsSdk.awsSdkStrings.WEEKLY
    - typingsJapgolly.awsSdk.awsSdkStrings.MONTHLY
    - typingsJapgolly.awsSdk.awsSdkStrings.EVENT
    - java.lang.String
  */
  type Frequency = typingsJapgolly.awsSdk.pinpointMod._Frequency | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - typingsJapgolly.awsSdk.awsSdkStrings.ANY
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type Include = typingsJapgolly.awsSdk.pinpointMod._Include | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
    - typingsJapgolly.awsSdk.awsSdkStrings.PREPARING_FOR_INITIALIZATION
    - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZING
    - typingsJapgolly.awsSdk.awsSdkStrings.PROCESSING
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_JOB
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETING
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type JobStatus = typingsJapgolly.awsSdk.pinpointMod._JobStatus | java.lang.String
  type ListOfActivityResponse = js.Array[typingsJapgolly.awsSdk.pinpointMod.ActivityResponse]
  type ListOfApplicationResponse = js.Array[typingsJapgolly.awsSdk.pinpointMod.ApplicationResponse]
  type ListOfCampaignResponse = js.Array[typingsJapgolly.awsSdk.pinpointMod.CampaignResponse]
  type ListOfEndpointBatchItem = js.Array[typingsJapgolly.awsSdk.pinpointMod.EndpointBatchItem]
  type ListOfEndpointResponse = js.Array[typingsJapgolly.awsSdk.pinpointMod.EndpointResponse]
  type ListOfExportJobResponse = js.Array[typingsJapgolly.awsSdk.pinpointMod.ExportJobResponse]
  type ListOfImportJobResponse = js.Array[typingsJapgolly.awsSdk.pinpointMod.ImportJobResponse]
  type ListOfJourneyResponse = js.Array[typingsJapgolly.awsSdk.pinpointMod.JourneyResponse]
  type ListOfMultiConditionalBranch = js.Array[typingsJapgolly.awsSdk.pinpointMod.MultiConditionalBranch]
  type ListOfRandomSplitEntry = js.Array[typingsJapgolly.awsSdk.pinpointMod.RandomSplitEntry]
  type ListOfResultRow = js.Array[typingsJapgolly.awsSdk.pinpointMod.ResultRow]
  type ListOfResultRowValue = js.Array[typingsJapgolly.awsSdk.pinpointMod.ResultRowValue]
  type ListOfSegmentDimensions = js.Array[typingsJapgolly.awsSdk.pinpointMod.SegmentDimensions]
  type ListOfSegmentGroup = js.Array[typingsJapgolly.awsSdk.pinpointMod.SegmentGroup]
  type ListOfSegmentReference = js.Array[typingsJapgolly.awsSdk.pinpointMod.SegmentReference]
  type ListOfSegmentResponse = js.Array[typingsJapgolly.awsSdk.pinpointMod.SegmentResponse]
  type ListOfSimpleCondition = js.Array[typingsJapgolly.awsSdk.pinpointMod.SimpleCondition]
  type ListOfString = js.Array[typingsJapgolly.awsSdk.pinpointMod.string]
  type ListOfTemplateResponse = js.Array[typingsJapgolly.awsSdk.pinpointMod.TemplateResponse]
  type ListOfTemplateVersionResponse = js.Array[typingsJapgolly.awsSdk.pinpointMod.TemplateVersionResponse]
  type ListOfTreatmentResource = js.Array[typingsJapgolly.awsSdk.pinpointMod.TreatmentResource]
  type ListOfWriteTreatmentResource = js.Array[typingsJapgolly.awsSdk.pinpointMod.WriteTreatmentResource]
  type MapOfActivity = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.Activity]
  type MapOfAddressConfiguration = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.AddressConfiguration]
  type MapOfAttributeDimension = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.AttributeDimension]
  type MapOfChannelResponse = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.ChannelResponse]
  type MapOfDouble = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.double]
  type MapOfEndpointMessageResult = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.EndpointMessageResult]
  type MapOfEndpointSendConfiguration = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.EndpointSendConfiguration]
  type MapOfEvent = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.Event]
  type MapOfEventItemResponse = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.EventItemResponse]
  type MapOfEventsBatch = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.EventsBatch]
  type MapOfInteger = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.integer]
  type MapOfItemResponse = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.ItemResponse]
  type MapOfListOfString = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.ListOfString]
  type MapOfMapOfEndpointMessageResult = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.MapOfEndpointMessageResult]
  type MapOfMessageResult = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.MessageResult]
  type MapOfMetricDimension = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.MetricDimension]
  type MapOfString = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.pinpointMod.string]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TRANSACTIONAL
    - typingsJapgolly.awsSdk.awsSdkStrings.PROMOTIONAL
    - java.lang.String
  */
  type MessageType = typingsJapgolly.awsSdk.pinpointMod._MessageType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DELIVERY
    - typingsJapgolly.awsSdk.awsSdkStrings.FILTER
    - java.lang.String
  */
  type Mode = typingsJapgolly.awsSdk.pinpointMod._Mode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - typingsJapgolly.awsSdk.awsSdkStrings.ANY
    - java.lang.String
  */
  type Operator = typingsJapgolly.awsSdk.pinpointMod._Operator | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type RecencyType = typingsJapgolly.awsSdk.pinpointMod._RecencyType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DIMENSIONAL
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT
    - java.lang.String
  */
  type SegmentType = typingsJapgolly.awsSdk.pinpointMod._SegmentType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - typingsJapgolly.awsSdk.awsSdkStrings.ANY
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type SourceType = typingsJapgolly.awsSdk.pinpointMod._SourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DRAFT
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type State = typingsJapgolly.awsSdk.pinpointMod._State | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
    - typingsJapgolly.awsSdk.awsSdkStrings.SMS
    - typingsJapgolly.awsSdk.awsSdkStrings.VOICE
    - typingsJapgolly.awsSdk.awsSdkStrings.PUSH
    - java.lang.String
  */
  type TemplateType = typingsJapgolly.awsSdk.pinpointMod._TemplateType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - typingsJapgolly.awsSdk.awsSdkStrings.ANY
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type Type = typingsJapgolly.awsSdk.pinpointMod._Type | java.lang.String
  type _Blob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.pinpointMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-12-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.pinpointMod._apiVersion | java.lang.String
  type boolean = scala.Boolean
  type double = scala.Double
  type integer = scala.Double
  type string = java.lang.String
  type timestampIso8601 = js.Date
}
