package typingsJapgolly.reactNativeWebrtc.mod

import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-webrtc", "RTCPeerConnection")
@js.native
open class RTCPeerConnection protected () extends StObject {
  def this(configuration: RTCPeerConnectionConfiguration) = this()
  
  /* private */ var _dataChannelIds: Any = js.native
  
  /* private */ def _getTrack(streamReactTag: String, trackId: String): MediaStreamTrack = js.native
  
  /* private */ var _localStreams: js.Array[MediaStream] = js.native
  
  /* private */ var _peerConnectionId: Double = js.native
  
  /* private */ def _registerEvents(): Unit = js.native
  
  /* private */ var _remoteStreams: js.Array[MediaStream] = js.native
  
  /* private */ var _subscriptions: js.Array[Any] = js.native
  
  /* private */ def _unregisterEvents(): Unit = js.native
  
  def addIceCandidate(candidate: RTCIceCandidateType): js.Promise[Unit] = js.native
  
  def addStream(stream: MediaStream): Unit = js.native
  
  def close(): Unit = js.native
  
  var connectionState: RTCPeerConnectionState = js.native
  
  def createAnswer(): js.Promise[RTCSessionDescriptionType] = js.native
  def createAnswer(options: RTCAnswerOptions): js.Promise[RTCSessionDescriptionType] = js.native
  
  def createDataChannel(label: String): Unit = js.native
  def createDataChannel(label: String, dataChannelDict: Any): Unit = js.native
  
  def createOffer(): js.Promise[RTCSessionDescriptionType] = js.native
  def createOffer(options: RTCOfferOptions): js.Promise[RTCSessionDescriptionType] = js.native
  
  def getLocalStreams(): js.Array[MediaStream] = js.native
  
  def getRemoteStreams(): js.Array[MediaStream] = js.native
  
  def getStats(): js.Promise[Any] = js.native
  def getStats(selector: MediaStreamTrack): js.Promise[Any] = js.native
  
  var localDescription: RTCSessionDescriptionType = js.native
  
  def onaddstream(event: EventOnAddStream): js.UndefOr[Unit] = js.native
  
  def onconnectionstatechange(event: Event): js.UndefOr[Unit] = js.native
  
  def onicecandidate(event: EventOnCandidate): js.UndefOr[Unit] = js.native
  
  def onicecandidateerror(error: js.Error): js.UndefOr[Unit] = js.native
  
  def oniceconnectionstatechange(event: EventOnConnectionStateChange): js.UndefOr[Unit] = js.native
  
  def onicegatheringstatechange(): js.UndefOr[Unit] = js.native
  
  def onnegotiationneeded(): js.UndefOr[Unit] = js.native
  
  def onremovestream(): js.UndefOr[Unit] = js.native
  
  def onsignalingstatechange(): js.UndefOr[Unit] = js.native
  
  /* private */ var privateiceConnectionState: RTCIceConnectionState = js.native
  
  /* private */ var privateiceGatheringState: RTCIceGatheringState = js.native
  
  var remoteDescription: RTCSessionDescriptionType = js.native
  
  def removeStream(stream: MediaStream): Unit = js.native
  
  def setConfiguration(configuration: RTCPeerConnectionConfiguration): Unit = js.native
  
  def setLocalDescription(sessionDescription: RTCSessionDescriptionType): js.Promise[Unit] = js.native
  
  def setRemoteDescription(sessionDescription: RTCSessionDescriptionType): js.Promise[Unit] = js.native
  
  var signalingState: RTCSignalingState = js.native
}
