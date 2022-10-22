package typingsJapgolly.kurentoClient

import typingsJapgolly.kurentoClient.mod.ConnectionState
import typingsJapgolly.kurentoClient.mod.CryptoSuite
import typingsJapgolly.kurentoClient.mod.IceComponentState
import typingsJapgolly.kurentoClient.mod.MediaFlowState
import typingsJapgolly.kurentoClient.mod.MediaProfileSpecType
import typingsJapgolly.kurentoClient.mod.MediaState
import typingsJapgolly.kurentoClient.mod.MediaTranscodingState
import typingsJapgolly.kurentoClient.mod.MediaType
import typingsJapgolly.kurentoClient.mod.UriEndpointState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kurentoClientStrings {
  
  @js.native
  sealed trait AES_128_CM_HMAC_SHA1_32
    extends StObject
       with CryptoSuite
  inline def AES_128_CM_HMAC_SHA1_32: AES_128_CM_HMAC_SHA1_32 = "AES_128_CM_HMAC_SHA1_32".asInstanceOf[AES_128_CM_HMAC_SHA1_32]
  
  @js.native
  sealed trait AES_128_CM_HMAC_SHA1_80
    extends StObject
       with CryptoSuite
  inline def AES_128_CM_HMAC_SHA1_80: AES_128_CM_HMAC_SHA1_80 = "AES_128_CM_HMAC_SHA1_80".asInstanceOf[AES_128_CM_HMAC_SHA1_80]
  
  @js.native
  sealed trait AES_256_CM_HMAC_SHA1_32
    extends StObject
       with CryptoSuite
  inline def AES_256_CM_HMAC_SHA1_32: AES_256_CM_HMAC_SHA1_32 = "AES_256_CM_HMAC_SHA1_32".asInstanceOf[AES_256_CM_HMAC_SHA1_32]
  
  @js.native
  sealed trait AES_256_CM_HMAC_SHA1_80
    extends StObject
       with CryptoSuite
  inline def AES_256_CM_HMAC_SHA1_80: AES_256_CM_HMAC_SHA1_80 = "AES_256_CM_HMAC_SHA1_80".asInstanceOf[AES_256_CM_HMAC_SHA1_80]
  
  @js.native
  sealed trait AUDIO
    extends StObject
       with MediaType
  inline def AUDIO: AUDIO = "AUDIO".asInstanceOf[AUDIO]
  
  @js.native
  sealed trait CONNECTED
    extends StObject
       with ConnectionState
       with IceComponentState
       with MediaState
  inline def CONNECTED: CONNECTED = "CONNECTED".asInstanceOf[CONNECTED]
  
  @js.native
  sealed trait CONNECTING
    extends StObject
       with IceComponentState
  inline def CONNECTING: CONNECTING = "CONNECTING".asInstanceOf[CONNECTING]
  
  @js.native
  sealed trait Composite extends StObject
  inline def Composite: Composite = "Composite".asInstanceOf[Composite]
  
  @js.native
  sealed trait ConnectionStateChanged extends StObject
  inline def ConnectionStateChanged: ConnectionStateChanged = "ConnectionStateChanged".asInstanceOf[ConnectionStateChanged]
  
  @js.native
  sealed trait DATA
    extends StObject
       with MediaType
  inline def DATA: DATA = "DATA".asInstanceOf[DATA]
  
  @js.native
  sealed trait DISCONNECTED
    extends StObject
       with ConnectionState
       with IceComponentState
       with MediaState
  inline def DISCONNECTED: DISCONNECTED = "DISCONNECTED".asInstanceOf[DISCONNECTED]
  
  @js.native
  sealed trait DataChannelClose extends StObject
  inline def DataChannelClose: DataChannelClose = "DataChannelClose".asInstanceOf[DataChannelClose]
  
  @js.native
  sealed trait DataChannelOpen extends StObject
  inline def DataChannelOpen: DataChannelOpen = "DataChannelOpen".asInstanceOf[DataChannelOpen]
  
  @js.native
  sealed trait ElementConnected extends StObject
  inline def ElementConnected: ElementConnected = "ElementConnected".asInstanceOf[ElementConnected]
  
  @js.native
  sealed trait ElementDisconnected extends StObject
  inline def ElementDisconnected: ElementDisconnected = "ElementDisconnected".asInstanceOf[ElementDisconnected]
  
  @js.native
  sealed trait EndOfStream extends StObject
  inline def EndOfStream: EndOfStream = "EndOfStream".asInstanceOf[EndOfStream]
  
  @js.native
  sealed trait FAILED
    extends StObject
       with IceComponentState
  inline def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait FLOWING
    extends StObject
       with MediaFlowState
  inline def FLOWING: FLOWING = "FLOWING".asInstanceOf[FLOWING]
  
  @js.native
  sealed trait GATHERING
    extends StObject
       with IceComponentState
  inline def GATHERING: GATHERING = "GATHERING".asInstanceOf[GATHERING]
  
  @js.native
  sealed trait IceCandidate extends StObject
  inline def IceCandidate: IceCandidate = "IceCandidate".asInstanceOf[IceCandidate]
  
  @js.native
  sealed trait IceCandidateFound extends StObject
  inline def IceCandidateFound: IceCandidateFound = "IceCandidateFound".asInstanceOf[IceCandidateFound]
  
  @js.native
  sealed trait IceComponentStateChange extends StObject
  inline def IceComponentStateChange: IceComponentStateChange = "IceComponentStateChange".asInstanceOf[IceComponentStateChange]
  
  @js.native
  sealed trait IceGatheringDone extends StObject
  inline def IceGatheringDone: IceGatheringDone = "IceGatheringDone".asInstanceOf[IceGatheringDone]
  
  @js.native
  sealed trait JPEG_VIDEO_ONLY
    extends StObject
       with MediaProfileSpecType
  inline def JPEG_VIDEO_ONLY: JPEG_VIDEO_ONLY = "JPEG_VIDEO_ONLY".asInstanceOf[JPEG_VIDEO_ONLY]
  
  @js.native
  sealed trait KURENTO_SPLIT_RECORDER
    extends StObject
       with MediaProfileSpecType
  inline def KURENTO_SPLIT_RECORDER: KURENTO_SPLIT_RECORDER = "KURENTO_SPLIT_RECORDER".asInstanceOf[KURENTO_SPLIT_RECORDER]
  
  @js.native
  sealed trait MKV
    extends StObject
       with MediaProfileSpecType
  inline def MKV: MKV = "MKV".asInstanceOf[MKV]
  
  @js.native
  sealed trait MKV_AUDIO_ONLY
    extends StObject
       with MediaProfileSpecType
  inline def MKV_AUDIO_ONLY: MKV_AUDIO_ONLY = "MKV_AUDIO_ONLY".asInstanceOf[MKV_AUDIO_ONLY]
  
  @js.native
  sealed trait MKV_VIDEO_ONLY
    extends StObject
       with MediaProfileSpecType
  inline def MKV_VIDEO_ONLY: MKV_VIDEO_ONLY = "MKV_VIDEO_ONLY".asInstanceOf[MKV_VIDEO_ONLY]
  
  @js.native
  sealed trait MP4
    extends StObject
       with MediaProfileSpecType
  inline def MP4: MP4 = "MP4".asInstanceOf[MP4]
  
  @js.native
  sealed trait MP4_AUDIO_ONLY
    extends StObject
       with MediaProfileSpecType
  inline def MP4_AUDIO_ONLY: MP4_AUDIO_ONLY = "MP4_AUDIO_ONLY".asInstanceOf[MP4_AUDIO_ONLY]
  
  @js.native
  sealed trait MP4_VIDEO_ONLY
    extends StObject
       with MediaProfileSpecType
  inline def MP4_VIDEO_ONLY: MP4_VIDEO_ONLY = "MP4_VIDEO_ONLY".asInstanceOf[MP4_VIDEO_ONLY]
  
  @js.native
  sealed trait MediaFlowInStateChange extends StObject
  inline def MediaFlowInStateChange: MediaFlowInStateChange = "MediaFlowInStateChange".asInstanceOf[MediaFlowInStateChange]
  
  @js.native
  sealed trait MediaFlowOutStateChange extends StObject
  inline def MediaFlowOutStateChange: MediaFlowOutStateChange = "MediaFlowOutStateChange".asInstanceOf[MediaFlowOutStateChange]
  
  @js.native
  sealed trait MediaPipeline extends StObject
  inline def MediaPipeline: MediaPipeline = "MediaPipeline".asInstanceOf[MediaPipeline]
  
  @js.native
  sealed trait MediaStateChanged extends StObject
  inline def MediaStateChanged: MediaStateChanged = "MediaStateChanged".asInstanceOf[MediaStateChanged]
  
  @js.native
  sealed trait MediaTranscodingStateChange extends StObject
  inline def MediaTranscodingStateChange: MediaTranscodingStateChange = "MediaTranscodingStateChange".asInstanceOf[MediaTranscodingStateChange]
  
  @js.native
  sealed trait NOT_FLOWING
    extends StObject
       with MediaFlowState
  inline def NOT_FLOWING: NOT_FLOWING = "NOT_FLOWING".asInstanceOf[NOT_FLOWING]
  
  @js.native
  sealed trait NOT_TRANSCODING
    extends StObject
       with MediaTranscodingState
  inline def NOT_TRANSCODING: NOT_TRANSCODING = "NOT_TRANSCODING".asInstanceOf[NOT_TRANSCODING]
  
  @js.native
  sealed trait NewCandidatePairSelected extends StObject
  inline def NewCandidatePairSelected: NewCandidatePairSelected = "NewCandidatePairSelected".asInstanceOf[NewCandidatePairSelected]
  
  @js.native
  sealed trait ObjectCreated extends StObject
  inline def ObjectCreated: ObjectCreated = "ObjectCreated".asInstanceOf[ObjectCreated]
  
  @js.native
  sealed trait ObjectDestroyed extends StObject
  inline def ObjectDestroyed: ObjectDestroyed = "ObjectDestroyed".asInstanceOf[ObjectDestroyed]
  
  @js.native
  sealed trait OnIceCandidate extends StObject
  inline def OnIceCandidate: OnIceCandidate = "OnIceCandidate".asInstanceOf[OnIceCandidate]
  
  @js.native
  sealed trait OnKeySoftLimit extends StObject
  inline def OnKeySoftLimit: OnKeySoftLimit = "OnKeySoftLimit".asInstanceOf[OnKeySoftLimit]
  
  @js.native
  sealed trait PAUSE
    extends StObject
       with UriEndpointState
  inline def PAUSE: PAUSE = "PAUSE".asInstanceOf[PAUSE]
  
  @js.native
  sealed trait Paused extends StObject
  inline def Paused: Paused = "Paused".asInstanceOf[Paused]
  
  @js.native
  sealed trait PlayerEndpoint extends StObject
  inline def PlayerEndpoint: PlayerEndpoint = "PlayerEndpoint".asInstanceOf[PlayerEndpoint]
  
  @js.native
  sealed trait READY
    extends StObject
       with IceComponentState
  inline def READY: READY = "READY".asInstanceOf[READY]
  
  @js.native
  sealed trait RecorderEndpoint extends StObject
  inline def RecorderEndpoint: RecorderEndpoint = "RecorderEndpoint".asInstanceOf[RecorderEndpoint]
  
  @js.native
  sealed trait Recording extends StObject
  inline def Recording: Recording = "Recording".asInstanceOf[Recording]
  
  @js.native
  sealed trait RtpEndpoint extends StObject
  inline def RtpEndpoint: RtpEndpoint = "RtpEndpoint".asInstanceOf[RtpEndpoint]
  
  @js.native
  sealed trait START
    extends StObject
       with UriEndpointState
  inline def START: START = "START".asInstanceOf[START]
  
  @js.native
  sealed trait STOP
    extends StObject
       with UriEndpointState
  inline def STOP: STOP = "STOP".asInstanceOf[STOP]
  
  @js.native
  sealed trait Stopped extends StObject
  inline def Stopped: Stopped = "Stopped".asInstanceOf[Stopped]
  
  @js.native
  sealed trait TRANSCODING
    extends StObject
       with MediaTranscodingState
  inline def TRANSCODING: TRANSCODING = "TRANSCODING".asInstanceOf[TRANSCODING]
  
  @js.native
  sealed trait UriEndpointStateChanged extends StObject
  inline def UriEndpointStateChanged: UriEndpointStateChanged = "UriEndpointStateChanged".asInstanceOf[UriEndpointStateChanged]
  
  @js.native
  sealed trait VIDEO
    extends StObject
       with MediaType
  inline def VIDEO: VIDEO = "VIDEO".asInstanceOf[VIDEO]
  
  @js.native
  sealed trait WEBM
    extends StObject
       with MediaProfileSpecType
  inline def WEBM: WEBM = "WEBM".asInstanceOf[WEBM]
  
  @js.native
  sealed trait WEBM_AUDIO_ONLY
    extends StObject
       with MediaProfileSpecType
  inline def WEBM_AUDIO_ONLY: WEBM_AUDIO_ONLY = "WEBM_AUDIO_ONLY".asInstanceOf[WEBM_AUDIO_ONLY]
  
  @js.native
  sealed trait WEBM_VIDEO_ONLY
    extends StObject
       with MediaProfileSpecType
  inline def WEBM_VIDEO_ONLY: WEBM_VIDEO_ONLY = "WEBM_VIDEO_ONLY".asInstanceOf[WEBM_VIDEO_ONLY]
  
  @js.native
  sealed trait WebRtcEndpoint extends StObject
  inline def WebRtcEndpoint: WebRtcEndpoint = "WebRtcEndpoint".asInstanceOf[WebRtcEndpoint]
}
