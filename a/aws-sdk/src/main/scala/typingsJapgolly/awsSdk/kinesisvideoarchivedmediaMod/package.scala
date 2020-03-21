package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisvideoarchivedmediaMod {
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FRAGMENTED_MP4
    - typingsJapgolly.awsSdk.awsSdkStrings.MPEG_TS
    - java.lang.String
  */
  type ContainerFormat = typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod._ContainerFormat | java.lang.String
  type ContentType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.NEVER
    - java.lang.String
  */
  type DASHDisplayFragmentNumber = typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod._DASHDisplayFragmentNumber | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.NEVER
    - java.lang.String
  */
  type DASHDisplayFragmentTimestamp = typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod._DASHDisplayFragmentTimestamp | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type DASHFragmentSelectorType = typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod._DASHFragmentSelectorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.LIVE_REPLAY
    - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type DASHPlaybackMode = typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod._DASHPlaybackMode | java.lang.String
  type DASHStreamingSessionURL = java.lang.String
  type Expires = scala.Double
  type FragmentList = js.Array[typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod.Fragment]
  type FragmentNumberList = js.Array[typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod.FragmentNumberString]
  type FragmentNumberString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type FragmentSelectorType = typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod._FragmentSelectorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.NEVER
    - typingsJapgolly.awsSdk.awsSdkStrings.ON_DISCONTINUITY
    - java.lang.String
  */
  type HLSDiscontinuityMode = typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod._HLSDiscontinuityMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.NEVER
    - java.lang.String
  */
  type HLSDisplayFragmentTimestamp = typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod._HLSDisplayFragmentTimestamp | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type HLSFragmentSelectorType = typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod._HLSFragmentSelectorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.LIVE_REPLAY
    - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type HLSPlaybackMode = typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod._HLSPlaybackMode | java.lang.String
  type HLSStreamingSessionURL = java.lang.String
  type Long = scala.Double
  type PageLimit = scala.Double
  type Payload = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod.Blob | java.lang.String | typingsJapgolly.node.streamMod.Readable
  type ResourceARN = java.lang.String
  type StreamName = java.lang.String
  type String = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-09-30`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod._apiVersion | java.lang.String
}
