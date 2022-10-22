package typingsJapgolly.webrtc

import org.scalajs.dom.Event
import org.scalajs.dom.RTCIceCandidate
import org.scalajs.dom.RTCIceCandidateInit
import org.scalajs.dom.RTCSessionDescription
import org.scalajs.dom.RTCSessionDescriptionInit
import org.scalajs.dom.RTCSignalingState
import org.scalajs.dom.RTCStatsReport
import typingsJapgolly.std.EventTarget
import typingsJapgolly.std.RTCAnswerOptions
import typingsJapgolly.std.RTCPeerConnectionErrorCallback
import typingsJapgolly.std.RTCPeerConnectionState
import typingsJapgolly.std.RTCSessionDescriptionCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCPeerConnection
  extends StObject
     with EventTarget {
  
  def addIceCandidate(): js.Promise[Unit] = js.native
  def addIceCandidate(candidate: RTCIceCandidate): js.Promise[Unit] = js.native
  def addIceCandidate(candidate: RTCIceCandidateInit): js.Promise[Unit] = js.native
  def addIceCandidate(
    candidate: RTCIceCandidateInit,
    successCallback: js.Function0[Unit],
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  def addIceCandidate(
    candidate: RTCIceCandidate,
    successCallback: js.Function0[Unit],
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  
  def addTrack(track: MediaStreamTrack, streams: MediaStream*): RTCRtpSender = js.native
  
  def addTransceiver(trackOrKind: String): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: String, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: MediaStreamTrack): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: MediaStreamTrack, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  
  def close(): Unit = js.native
  
  val connectionState: RTCPeerConnectionState = js.native
  
  def createAnswer(): js.Promise[RTCSessionDescriptionInit] = js.native
  def createAnswer(options: RTCAnswerOptions): js.Promise[RTCSessionDescriptionInit] = js.native
  def createAnswer(successCallback: RTCSessionDescriptionCallback, failureCallback: RTCPeerConnectionErrorCallback): js.Promise[Unit] = js.native
  
  def createDataChannel(): RTCDataChannel = js.native
  def createDataChannel(label: String): RTCDataChannel = js.native
  def createDataChannel(label: String, dataChannelDict: RTCDataChannelInit): RTCDataChannel = js.native
  def createDataChannel(label: Null, dataChannelDict: RTCDataChannelInit): RTCDataChannel = js.native
  
  def createOffer(): js.Promise[RTCSessionDescriptionInit] = js.native
  def createOffer(options: RTCOfferOptions): js.Promise[RTCSessionDescriptionInit] = js.native
  // Extension: https://www.w3.org/TR/webrtc/#legacy-interface-extensions
  // Deprecated!
  def createOffer(successCallback: RTCSessionDescriptionCallback, failureCallback: RTCPeerConnectionErrorCallback): js.Promise[Unit] = js.native
  def createOffer(
    successCallback: RTCSessionDescriptionCallback,
    failureCallback: RTCPeerConnectionErrorCallback,
    options: RTCOfferOptions
  ): js.Promise[Unit] = js.native
  
  val currentLocalDescription: RTCSessionDescription | Null = js.native
  
  val currentRemoteDescription: RTCSessionDescription | Null = js.native
  
  def getConfiguration(): RTCConfiguration = js.native
  
  def getReceivers(): js.Array[RTCRtpReceiver] = js.native
  
  // Extension: https://www.w3.org/TR/webrtc/#h-rtcpeerconnection-interface-extensions
  def getSenders(): js.Array[RTCRtpSender] = js.native
  
  // Extension: https://www.w3.org/TR/webrtc/#h-rtcpeerconnection-interface-extensions-2
  def getStats(): js.Promise[RTCStatsReport] = js.native
  def getStats(
    selector: Null,
    successCallback: js.Function1[/* report */ RTCStatsReport, Unit],
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  def getStats(selector: MediaStreamTrack): js.Promise[RTCStatsReport] = js.native
  def getStats(
    selector: MediaStreamTrack,
    successCallback: js.Function1[/* report */ RTCStatsReport, Unit],
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  
  def getTransceivers(): js.Array[RTCRtpTransceiver] = js.native
  
  val localDescription: RTCSessionDescription | Null = js.native
  
  var onconnectionstatechange: PeerConnectionEventHandler[Event] = js.native
  
  var ondatachannel: PeerConnectionEventHandler[RTCDataChannelEvent] = js.native
  
  var onicecandidateerror: PeerConnectionEventHandler[Event] = js.native
  
  var ontrack: PeerConnectionEventHandler[RTCTrackEvent] = js.native
  
  val pendingLocalDescription: RTCSessionDescription | Null = js.native
  
  val pendingRemoteDescription: RTCSessionDescription | Null = js.native
  
  val remoteDescription: RTCSessionDescription | Null = js.native
  
  def removeTrack(sender: RTCRtpSender): Unit = js.native
  
  // Extension: https://www.w3.org/TR/webrtc/#h-rtcpeerconnection-interface-extensions-1
  val sctp: RTCSctpTransport | Null = js.native
  
  def setConfiguration(configuration: RTCConfiguration): Unit = js.native
  
  def setLocalDescription(description: RTCSessionDescriptionInit): js.Promise[Unit] = js.native
  def setLocalDescription(
    description: RTCSessionDescriptionInit,
    successCallback: js.Function0[Unit],
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  
  def setRemoteDescription(description: RTCSessionDescriptionInit): js.Promise[Unit] = js.native
  def setRemoteDescription(
    description: RTCSessionDescriptionInit,
    successCallback: js.Function0[Unit],
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  
  val signalingState: RTCSignalingState = js.native
}
