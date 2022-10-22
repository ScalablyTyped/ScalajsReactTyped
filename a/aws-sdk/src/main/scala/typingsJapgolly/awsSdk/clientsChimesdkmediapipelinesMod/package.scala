package typingsJapgolly.awsSdk.clientsChimesdkmediapipelinesMod

import typingsJapgolly.awsSdk.awsSdkStrings.ChimeSdkMeeting
import typingsJapgolly.awsSdk.awsSdkStrings.ContentOnly
import typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
import typingsJapgolly.awsSdk.awsSdkStrings.GridView
import typingsJapgolly.awsSdk.awsSdkStrings.RTMP
import typingsJapgolly.awsSdk.awsSdkStrings.S3Bucket
import typingsJapgolly.awsSdk.awsSdkStrings.VideoOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceName = java.lang.String

type Arn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ArtifactsConcatenationState = _ArtifactsConcatenationState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ArtifactsState = _ArtifactsState | java.lang.String

type AttendeeIdList = js.Array[GuidString]

type AudioArtifactsConcatenationState = Enabled_ | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Stereo_
  - typingsJapgolly.awsSdk.awsSdkStrings.Mono
  - java.lang.String
*/
type AudioChannelsOption = _AudioChannelsOption | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AudioOnly
  - typingsJapgolly.awsSdk.awsSdkStrings.AudioWithActiveSpeakerVideo
  - typingsJapgolly.awsSdk.awsSdkStrings.AudioWithCompositedVideo
  - java.lang.String
*/
type AudioMuxType = _AudioMuxType | java.lang.String

type AudioSampleRateOption = java.lang.String

type ClientRequestToken = java.lang.String

type ConcatenationSinkList = js.Array[ConcatenationSink]

type ConcatenationSinkType = S3Bucket | java.lang.String

type ConcatenationSourceList = js.Array[ConcatenationSource]

type ConcatenationSourceType = typingsJapgolly.awsSdk.awsSdkStrings.MediaCapturePipeline | java.lang.String

type ContentMuxType = ContentOnly | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PresenterOnly
  - typingsJapgolly.awsSdk.awsSdkStrings.Horizontal
  - typingsJapgolly.awsSdk.awsSdkStrings.Vertical
  - java.lang.String
*/
type ContentShareLayoutOption = _ContentShareLayoutOption | java.lang.String

type ExternalUserIdList = js.Array[ExternalUserIdType]

type ExternalUserIdType = java.lang.String

type GuidString = java.lang.String

type Iso8601Timestamp = js.Date

type LayoutOption = GridView | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AudioWithCompositedVideo
  - typingsJapgolly.awsSdk.awsSdkStrings.AudioWithActiveSpeakerVideo
  - java.lang.String
*/
type LiveConnectorMuxType = _LiveConnectorMuxType | java.lang.String

type LiveConnectorSinkList = js.Array[LiveConnectorSinkConfiguration]

type LiveConnectorSinkType = RTMP | java.lang.String

type LiveConnectorSourceList = js.Array[LiveConnectorSourceConfiguration]

type LiveConnectorSourceType = ChimeSdkMeeting | java.lang.String

type MediaCapturePipelineSummaryList = js.Array[MediaCapturePipelineSummary]

type MediaPipelineList = js.Array[MediaPipelineSummary]

type MediaPipelineSinkType = S3Bucket | java.lang.String

type MediaPipelineSourceType = ChimeSdkMeeting | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Initializing_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type MediaPipelineStatus = _MediaPipelineStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TopLeft
  - typingsJapgolly.awsSdk.awsSdkStrings.TopRight
  - typingsJapgolly.awsSdk.awsSdkStrings.BottomLeft
  - typingsJapgolly.awsSdk.awsSdkStrings.BottomRight
  - java.lang.String
*/
type PresenterPosition = _PresenterPosition | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HD
  - typingsJapgolly.awsSdk.awsSdkStrings.FHD
  - java.lang.String
*/
type ResolutionOption = _ResolutionOption | java.lang.String

type ResultMax = Double

type SensitiveString = java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type VideoMuxType = VideoOnly | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2021-07-15`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
