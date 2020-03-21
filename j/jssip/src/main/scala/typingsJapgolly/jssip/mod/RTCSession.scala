package typingsJapgolly.jssip.mod

import org.scalajs.dom.experimental.webrtc.RTCPeerConnection
import org.scalajs.dom.raw.DOMError
import typingsJapgolly.jssip.jssipStrings.accepted
import typingsJapgolly.jssip.jssipStrings.confirmed
import typingsJapgolly.jssip.jssipStrings.connecting
import typingsJapgolly.jssip.jssipStrings.ended
import typingsJapgolly.jssip.jssipStrings.failed
import typingsJapgolly.jssip.jssipStrings.getusermediafailed
import typingsJapgolly.jssip.jssipStrings.hold
import typingsJapgolly.jssip.jssipStrings.icecandidate
import typingsJapgolly.jssip.jssipStrings.muted
import typingsJapgolly.jssip.jssipStrings.newDTMF
import typingsJapgolly.jssip.jssipStrings.newInfo
import typingsJapgolly.jssip.jssipStrings.peerconnection
import typingsJapgolly.jssip.jssipStrings.peerconnectionColoncreateanswerfailed
import typingsJapgolly.jssip.jssipStrings.peerconnectionColoncreateofferfailed
import typingsJapgolly.jssip.jssipStrings.peerconnectionColonsetlocaldescriptionfailed
import typingsJapgolly.jssip.jssipStrings.peerconnectionColonsetremotedescriptionfailed
import typingsJapgolly.jssip.jssipStrings.progress
import typingsJapgolly.jssip.jssipStrings.refer
import typingsJapgolly.jssip.jssipStrings.reinvite
import typingsJapgolly.jssip.jssipStrings.replaces
import typingsJapgolly.jssip.jssipStrings.sdp
import typingsJapgolly.jssip.jssipStrings.sending
import typingsJapgolly.jssip.jssipStrings.unhold
import typingsJapgolly.jssip.jssipStrings.unmuted
import typingsJapgolly.jssip.jssipStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jssip", "RTCSession")
@js.native
class RTCSession () extends js.Object {
  var connection: js.UndefOr[RTCPeerConnection] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var direction: String = js.native
  var end_time: js.Date = js.native
  var local_identity: NameAddrHeader = js.native
  var remote_identity: NameAddrHeader = js.native
  var start_time: js.UndefOr[js.Date] = js.native
  def answer(): Unit = js.native
  def answer(options: SessionAnswerOptions): Unit = js.native
  def hold(): Unit = js.native
  def hold(options: SessionHoldOptions): Unit = js.native
  def hold(options: SessionHoldOptions, done: js.Function0[Unit]): Unit = js.native
  def isEnded(): Boolean = js.native
  def isEstablished(): Boolean = js.native
  def isInProgress(): Boolean = js.native
  def isMuted(): Boolean = js.native
  def isOnHold(): Boolean = js.native
  def isReadyToReOffer(): Boolean = js.native
  def mute(): Unit = js.native
  def mute(options: SessionMuteOptions): Unit = js.native
  @JSName("on")
  def on_accepted(eventName: accepted, handler: EventHandler[SessionAcceptedEvent]): Unit = js.native
  @JSName("on")
  def on_confirmed(eventName: confirmed, handler: EventHandler[SessionConfirmedEvent]): Unit = js.native
  @JSName("on")
  def on_connecting(eventName: connecting, handler: EventHandler[SessionConnectingEvent]): Unit = js.native
  @JSName("on")
  def on_ended(eventName: ended, handler: EventHandler[SessionEndedEvent]): Unit = js.native
  @JSName("on")
  def on_failed(eventName: failed, handler: EventHandler[SessionFailedEvent]): Unit = js.native
  @JSName("on")
  def on_getusermediafailed(eventName: getusermediafailed, handler: EventHandler[DOMError]): Unit = js.native
  @JSName("on")
  def on_hold(eventName: hold, handler: EventHandler[SessionHoldEvent]): Unit = js.native
  @JSName("on")
  def on_icecandidate(eventName: icecandidate, handler: EventHandler[SessionIceCandidateEvent]): Unit = js.native
  @JSName("on")
  def on_muted(eventName: muted, handler: EventHandler[SessionMuteEvent]): Unit = js.native
  @JSName("on")
  def on_newDTMF(eventName: newDTMF, handler: EventHandler[SessionNewDtmfEvent]): Unit = js.native
  @JSName("on")
  def on_newInfo(eventName: newInfo, handler: EventHandler[SessionNewInfoEvent]): Unit = js.native
  @JSName("on")
  def on_peerconnection(eventName: peerconnection, handler: EventHandler[RTCPeerConnection]): Unit = js.native
  @JSName("on")
  def on_peerconnectioncreateanswerfailed(eventName: peerconnectionColoncreateanswerfailed, handler: EventHandler[DOMError]): Unit = js.native
  @JSName("on")
  def on_peerconnectioncreateofferfailed(eventName: peerconnectionColoncreateofferfailed, handler: EventHandler[DOMError]): Unit = js.native
  @JSName("on")
  def on_peerconnectionsetlocaldescriptionfailed(eventName: peerconnectionColonsetlocaldescriptionfailed, handler: EventHandler[DOMError]): Unit = js.native
  @JSName("on")
  def on_peerconnectionsetremotedescriptionfailed(eventName: peerconnectionColonsetremotedescriptionfailed, handler: EventHandler[DOMError]): Unit = js.native
  @JSName("on")
  def on_progress(eventName: progress, handler: EventHandler[SessionProgressEvent]): Unit = js.native
  @JSName("on")
  def on_refer(eventName: refer, handler: EventHandler[SessionReferEvent]): Unit = js.native
  @JSName("on")
  def on_reinvite(eventName: reinvite, handler: EventHandler[SessionReinviteEvent]): Unit = js.native
  @JSName("on")
  def on_replaces(eventName: replaces, handler: EventHandler[SessionReplaceEvent]): Unit = js.native
  @JSName("on")
  def on_sdp(eventName: sdp, handler: EventHandler[SessionSdpEvent]): Unit = js.native
  @JSName("on")
  def on_sending(eventName: sending, handler: EventHandler[SessionSendingEvent]): Unit = js.native
  @JSName("on")
  def on_unhold(eventName: unhold, handler: EventHandler[SessionUnholdEvent]): Unit = js.native
  @JSName("on")
  def on_unmuted(eventName: unmuted, handler: EventHandler[SessionUnmuteEvent]): Unit = js.native
  @JSName("on")
  def on_update(eventName: update, handler: EventHandler[SessionUpdateEvent]): Unit = js.native
  def refer(target: String): Unit = js.native
  def refer(target: String, options: SessionReferOptions): Unit = js.native
  def refer(target: URI): Unit = js.native
  def refer(target: URI, options: SessionReferOptions): Unit = js.native
  def renegotiate(): Unit = js.native
  def renegotiate(options: SessionRenegotiateOptions): Unit = js.native
  def renegotiate(options: SessionRenegotiateOptions, done: js.Function0[Unit]): Unit = js.native
  def resetLocalMedia(): Unit = js.native
  def sendDTMF(tone: String): Unit = js.native
  def sendDTMF(tone: String, options: SessionSendDtmfOptions): Unit = js.native
  def sendDTMF(tone: Double): Unit = js.native
  def sendDTMF(tone: Double, options: SessionSendDtmfOptions): Unit = js.native
  def sendInfo(contentType: String): Unit = js.native
  def sendInfo(contentType: String, body: String): Unit = js.native
  def sendInfo(contentType: String, body: String, options: SessionSendInfoOptions): Unit = js.native
  def terminate(): Unit = js.native
  def terminate(options: SessionTerminateOptions): Unit = js.native
  def unhold(): Unit = js.native
  def unhold(options: SessionHoldOptions): Unit = js.native
  def unhold(options: SessionHoldOptions, done: js.Function0[Unit]): Unit = js.native
  def unmute(): Unit = js.native
  def unmute(options: SessionMuteOptions): Unit = js.native
}

@JSImport("jssip", "RTCSession")
@js.native
object RTCSession extends js.Object {
  @js.native
  class DTMF () extends js.Object {
    var duration: Double = js.native
    var tone: String = js.native
  }
  
  @js.native
  class Info () extends js.Object {
    var body: String = js.native
    var contentType: String = js.native
  }
  
}

