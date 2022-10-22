package typingsJapgolly.awsSdk.clientsKinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.JPEGQuality
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
  - java.lang.String
*/
type ClipFragmentSelectorType = _ClipFragmentSelectorType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FRAGMENTED_MP4
  - typingsJapgolly.awsSdk.awsSdkStrings.MPEG_TS
  - java.lang.String
*/
type ContainerFormat = _ContainerFormat | String

type ContentType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
  - typingsJapgolly.awsSdk.awsSdkStrings.NEVER
  - java.lang.String
*/
type DASHDisplayFragmentNumber = _DASHDisplayFragmentNumber | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
  - typingsJapgolly.awsSdk.awsSdkStrings.NEVER
  - java.lang.String
*/
type DASHDisplayFragmentTimestamp = _DASHDisplayFragmentTimestamp | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
  - java.lang.String
*/
type DASHFragmentSelectorType = _DASHFragmentSelectorType | String

type DASHMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.LIVE_REPLAY
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND
  - java.lang.String
*/
type DASHPlaybackMode = _DASHPlaybackMode | String

type DASHStreamingSessionURL = String

type Expires = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JPEG
  - typingsJapgolly.awsSdk.awsSdkStrings.PNG
  - java.lang.String
*/
type Format = _Format | String

type FormatConfig = StringDictionary[FormatConfigValue]

type FormatConfigKey = JPEGQuality | String

type FormatConfigValue = String

type FragmentList = js.Array[Fragment]

type FragmentNumberList = js.Array[FragmentNumberString]

type FragmentNumberString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
  - java.lang.String
*/
type FragmentSelectorType = _FragmentSelectorType | String

type GetImagesMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
  - typingsJapgolly.awsSdk.awsSdkStrings.NEVER
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DISCONTINUITY
  - java.lang.String
*/
type HLSDiscontinuityMode = _HLSDiscontinuityMode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
  - typingsJapgolly.awsSdk.awsSdkStrings.NEVER
  - java.lang.String
*/
type HLSDisplayFragmentTimestamp = _HLSDisplayFragmentTimestamp | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
  - java.lang.String
*/
type HLSFragmentSelectorType = _HLSFragmentSelectorType | String

type HLSMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.LIVE_REPLAY
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND
  - java.lang.String
*/
type HLSPlaybackMode = _HLSPlaybackMode | String

type HLSStreamingSessionURL = String

type HeightPixels = Double

type ImageContent = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_MEDIA
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIA_ERROR
  - java.lang.String
*/
type ImageError = _ImageError | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
  - java.lang.String
*/
type ImageSelectorType = _ImageSelectorType | String

type Images = js.Array[Image]

type ListFragmentsMaxResults = Double

type Long = Double

type NextToken = String

type Payload = Buffer | js.typedarray.Uint8Array | Blob | String | Readable

type ResourceARN = String

type SamplingInterval = Double

type StreamName = String

type Timestamp = js.Date

type WidthPixels = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-09-30`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
