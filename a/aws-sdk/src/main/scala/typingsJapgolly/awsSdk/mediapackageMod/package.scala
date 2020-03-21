package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mediapackageMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.SCTE35_ENHANCED
    - typingsJapgolly.awsSdk.awsSdkStrings.PASSTHROUGH
    - java.lang.String
  */
  type AdMarkers = typingsJapgolly.awsSdk.mediapackageMod._AdMarkers | java.lang.String
  type AdTriggers = js.Array[typingsJapgolly.awsSdk.mediapackageMod.AdTriggersElement]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SPLICE_INSERT
    - typingsJapgolly.awsSdk.awsSdkStrings.BREAK
    - typingsJapgolly.awsSdk.awsSdkStrings.PROVIDER_ADVERTISEMENT
    - typingsJapgolly.awsSdk.awsSdkStrings.DISTRIBUTOR_ADVERTISEMENT
    - typingsJapgolly.awsSdk.awsSdkStrings.PROVIDER_PLACEMENT_OPPORTUNITY
    - typingsJapgolly.awsSdk.awsSdkStrings.DISTRIBUTOR_PLACEMENT_OPPORTUNITY
    - typingsJapgolly.awsSdk.awsSdkStrings.PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY
    - typingsJapgolly.awsSdk.awsSdkStrings.DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY
    - java.lang.String
  */
  type AdTriggersElement = typingsJapgolly.awsSdk.mediapackageMod._AdTriggersElement | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.RESTRICTED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNRESTRICTED
    - typingsJapgolly.awsSdk.awsSdkStrings.BOTH
    - java.lang.String
  */
  type AdsOnDeliveryRestrictions = typingsJapgolly.awsSdk.mediapackageMod._AdsOnDeliveryRestrictions | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.mediapackageMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AES_128
    - typingsJapgolly.awsSdk.awsSdkStrings.SAMPLE_AES
    - java.lang.String
  */
  type EncryptionMethod = typingsJapgolly.awsSdk.mediapackageMod._EncryptionMethod | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FULL
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPACT
    - java.lang.String
  */
  type ManifestLayout = typingsJapgolly.awsSdk.mediapackageMod._ManifestLayout | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW
    - typingsJapgolly.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type Origination = typingsJapgolly.awsSdk.mediapackageMod._Origination | java.lang.String
  type PeriodTriggersElement = typingsJapgolly.awsSdk.awsSdkStrings.ADS | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.EVENT
    - typingsJapgolly.awsSdk.awsSdkStrings.VOD
    - java.lang.String
  */
  type PlaylistType = typingsJapgolly.awsSdk.mediapackageMod._PlaylistType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.HBBTV_1_5
    - java.lang.String
  */
  type Profile = typingsJapgolly.awsSdk.mediapackageMod._Profile | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NUMBER_WITH_TIMELINE
    - typingsJapgolly.awsSdk.awsSdkStrings.TIME_WITH_TIMELINE
    - typingsJapgolly.awsSdk.awsSdkStrings.NUMBER_WITH_DURATION
    - java.lang.String
  */
  type SegmentTemplateFormat = typingsJapgolly.awsSdk.mediapackageMod._SegmentTemplateFormat | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type Status = typingsJapgolly.awsSdk.mediapackageMod._Status | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ORIGINAL
    - typingsJapgolly.awsSdk.awsSdkStrings.VIDEO_BITRATE_ASCENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.VIDEO_BITRATE_DESCENDING
    - java.lang.String
  */
  type StreamOrder = typingsJapgolly.awsSdk.mediapackageMod._StreamOrder | java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.mediapackageMod.string]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-10-12`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.mediapackageMod._apiVersion | java.lang.String
  type boolean = scala.Boolean
  type integer = scala.Double
  type listOfChannel = js.Array[typingsJapgolly.awsSdk.mediapackageMod.Channel]
  type listOfHarvestJob = js.Array[typingsJapgolly.awsSdk.mediapackageMod.HarvestJob]
  type listOfHlsManifest = js.Array[typingsJapgolly.awsSdk.mediapackageMod.HlsManifest]
  type listOfHlsManifestCreateOrUpdateParameters = js.Array[typingsJapgolly.awsSdk.mediapackageMod.HlsManifestCreateOrUpdateParameters]
  type listOfIngestEndpoint = js.Array[typingsJapgolly.awsSdk.mediapackageMod.IngestEndpoint]
  type listOfOriginEndpoint = js.Array[typingsJapgolly.awsSdk.mediapackageMod.OriginEndpoint]
  type listOfPeriodTriggersElement = js.Array[typingsJapgolly.awsSdk.mediapackageMod.PeriodTriggersElement]
  type listOfString = js.Array[typingsJapgolly.awsSdk.mediapackageMod.string]
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.mediapackageMod.string]
  type string = java.lang.String
}
