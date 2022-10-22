package typingsJapgolly.jssip.libRtcsessionMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCSessionEventMap extends StObject {
  
  var accepted: CallListener
  
  var confirmed: ConfirmedListener
  
  def connecting(event: ConnectingEvent): Unit
  @JSName("connecting")
  var connecting_Original: ConnectingListener
  
  def ended(event: EndEvent): Unit
  @JSName("ended")
  var ended_Original: EndListener
  
  def failed(event: EndEvent): Unit
  @JSName("failed")
  var failed_Original: EndListener
  
  def getusermediafailed(args: Any*): Unit
  @JSName("getusermediafailed")
  var getusermediafailed_Original: AnyListener
  
  def hold(event: HoldEvent): Unit
  @JSName("hold")
  var hold_Original: HoldListener
  
  def icecandidate(event: IceCandidateEvent): Unit
  @JSName("icecandidate")
  var icecandidate_Original: IceCandidateListener
  
  def muted(event: MediaConstraints): Unit
  @JSName("muted")
  var muted_Original: MuteListener
  
  var newDTMF: DTMFListener
  
  var newInfo: InfoListener
  
  def peerconnection(event: PeerConnectionEvent): Unit
  
  @JSName("peerconnection:createanswerfailed")
  def peerconnectionColoncreateanswerfailed(args: Any*): Unit
  @JSName("peerconnection:createanswerfailed")
  var peerconnectionColoncreateanswerfailed_Original: AnyListener
  
  @JSName("peerconnection:createofferfailed")
  def peerconnectionColoncreateofferfailed(args: Any*): Unit
  @JSName("peerconnection:createofferfailed")
  var peerconnectionColoncreateofferfailed_Original: AnyListener
  
  @JSName("peerconnection:setlocaldescriptionfailed")
  def peerconnectionColonsetlocaldescriptionfailed(args: Any*): Unit
  @JSName("peerconnection:setlocaldescriptionfailed")
  var peerconnectionColonsetlocaldescriptionfailed_Original: AnyListener
  
  @JSName("peerconnection:setremotedescriptionfailed")
  def peerconnectionColonsetremotedescriptionfailed(args: Any*): Unit
  @JSName("peerconnection:setremotedescriptionfailed")
  var peerconnectionColonsetremotedescriptionfailed_Original: AnyListener
  
  @JSName("peerconnection")
  var peerconnection_Original: PeerConnectionListener
  
  var progress: CallListener
  
  def refer(event: ReferEvent): Unit
  @JSName("refer")
  var refer_Original: ReferListener
  
  def reinvite(event: ReInviteEvent): Unit
  @JSName("reinvite")
  var reinvite_Original: ReInviteListener
  
  def replaces(event: ReferEvent): Unit
  @JSName("replaces")
  var replaces_Original: ReferListener
  
  def sdp(event: SDPEvent): Unit
  @JSName("sdp")
  var sdp_Original: SDPListener
  
  def sending(event: SendingEvent): Unit
  @JSName("sending")
  var sending_Original: SendingListener
  
  def unhold(event: HoldEvent): Unit
  @JSName("unhold")
  var unhold_Original: HoldListener
  
  def unmuted(event: MediaConstraints): Unit
  @JSName("unmuted")
  var unmuted_Original: MuteListener
  
  def update(event: ReInviteEvent): Unit
  @JSName("update")
  var update_Original: UpdateListener
}
object RTCSessionEventMap {
  
  inline def apply(
    accepted: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent) => Callback,
    confirmed: (/* event */ IncomingAckEvent) | (/* event */ OutgoingAckEvent) => Callback,
    connecting: /* event */ ConnectingEvent => Callback,
    ended: /* event */ EndEvent => Callback,
    failed: /* event */ EndEvent => Callback,
    getusermediafailed: AnyListener,
    hold: /* event */ HoldEvent => Callback,
    icecandidate: /* event */ IceCandidateEvent => Callback,
    muted: /* event */ MediaConstraints => Callback,
    newDTMF: (/* event */ IncomingDTMFEvent) | (/* event */ OutgoingDTMFEvent) => Callback,
    newInfo: (/* event */ IncomingInfoEvent) | (/* event */ OutgoingInfoEvent) => Callback,
    peerconnection: /* event */ PeerConnectionEvent => Callback,
    peerconnectionColoncreateanswerfailed: AnyListener,
    peerconnectionColoncreateofferfailed: AnyListener,
    peerconnectionColonsetlocaldescriptionfailed: AnyListener,
    peerconnectionColonsetremotedescriptionfailed: AnyListener,
    progress: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent) => Callback,
    refer: /* event */ ReferEvent => Callback,
    reinvite: /* event */ ReInviteEvent => Callback,
    replaces: /* event */ ReferEvent => Callback,
    sdp: /* event */ SDPEvent => Callback,
    sending: /* event */ SendingEvent => Callback,
    unhold: /* event */ HoldEvent => Callback,
    unmuted: /* event */ MediaConstraints => Callback,
    update: /* event */ ReInviteEvent => Callback
  ): RTCSessionEventMap = {
    val __obj = js.Dynamic.literal(accepted = js.Any.fromFunction1((t0: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent)) => accepted(t0).runNow()), confirmed = js.Any.fromFunction1((t0: (/* event */ IncomingAckEvent) | (/* event */ OutgoingAckEvent)) => confirmed(t0).runNow()), connecting = js.Any.fromFunction1((t0: /* event */ ConnectingEvent) => connecting(t0).runNow()), ended = js.Any.fromFunction1((t0: /* event */ EndEvent) => ended(t0).runNow()), failed = js.Any.fromFunction1((t0: /* event */ EndEvent) => failed(t0).runNow()), getusermediafailed = getusermediafailed.asInstanceOf[js.Any], hold = js.Any.fromFunction1((t0: /* event */ HoldEvent) => hold(t0).runNow()), icecandidate = js.Any.fromFunction1((t0: /* event */ IceCandidateEvent) => icecandidate(t0).runNow()), muted = js.Any.fromFunction1((t0: /* event */ MediaConstraints) => muted(t0).runNow()), newDTMF = js.Any.fromFunction1((t0: (/* event */ IncomingDTMFEvent) | (/* event */ OutgoingDTMFEvent)) => newDTMF(t0).runNow()), newInfo = js.Any.fromFunction1((t0: (/* event */ IncomingInfoEvent) | (/* event */ OutgoingInfoEvent)) => newInfo(t0).runNow()), peerconnection = js.Any.fromFunction1((t0: /* event */ PeerConnectionEvent) => peerconnection(t0).runNow()), progress = js.Any.fromFunction1((t0: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent)) => progress(t0).runNow()), refer = js.Any.fromFunction1((t0: /* event */ ReferEvent) => refer(t0).runNow()), reinvite = js.Any.fromFunction1((t0: /* event */ ReInviteEvent) => reinvite(t0).runNow()), replaces = js.Any.fromFunction1((t0: /* event */ ReferEvent) => replaces(t0).runNow()), sdp = js.Any.fromFunction1((t0: /* event */ SDPEvent) => sdp(t0).runNow()), sending = js.Any.fromFunction1((t0: /* event */ SendingEvent) => sending(t0).runNow()), unhold = js.Any.fromFunction1((t0: /* event */ HoldEvent) => unhold(t0).runNow()), unmuted = js.Any.fromFunction1((t0: /* event */ MediaConstraints) => unmuted(t0).runNow()), update = js.Any.fromFunction1((t0: /* event */ ReInviteEvent) => update(t0).runNow()))
    __obj.updateDynamic("peerconnection:createanswerfailed")(peerconnectionColoncreateanswerfailed.asInstanceOf[js.Any])
    __obj.updateDynamic("peerconnection:createofferfailed")(peerconnectionColoncreateofferfailed.asInstanceOf[js.Any])
    __obj.updateDynamic("peerconnection:setlocaldescriptionfailed")(peerconnectionColonsetlocaldescriptionfailed.asInstanceOf[js.Any])
    __obj.updateDynamic("peerconnection:setremotedescriptionfailed")(peerconnectionColonsetremotedescriptionfailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSessionEventMap]
  }
  
  extension [Self <: RTCSessionEventMap](x: Self) {
    
    inline def setAccepted(value: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent) => Callback): Self = StObject.set(x, "accepted", js.Any.fromFunction1((t0: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent)) => value(t0).runNow()))
    
    inline def setConfirmed(value: (/* event */ IncomingAckEvent) | (/* event */ OutgoingAckEvent) => Callback): Self = StObject.set(x, "confirmed", js.Any.fromFunction1((t0: (/* event */ IncomingAckEvent) | (/* event */ OutgoingAckEvent)) => value(t0).runNow()))
    
    inline def setConnecting(value: /* event */ ConnectingEvent => Callback): Self = StObject.set(x, "connecting", js.Any.fromFunction1((t0: /* event */ ConnectingEvent) => value(t0).runNow()))
    
    inline def setEnded(value: /* event */ EndEvent => Callback): Self = StObject.set(x, "ended", js.Any.fromFunction1((t0: /* event */ EndEvent) => value(t0).runNow()))
    
    inline def setFailed(value: /* event */ EndEvent => Callback): Self = StObject.set(x, "failed", js.Any.fromFunction1((t0: /* event */ EndEvent) => value(t0).runNow()))
    
    inline def setGetusermediafailed(value: AnyListener): Self = StObject.set(x, "getusermediafailed", value.asInstanceOf[js.Any])
    
    inline def setHold(value: /* event */ HoldEvent => Callback): Self = StObject.set(x, "hold", js.Any.fromFunction1((t0: /* event */ HoldEvent) => value(t0).runNow()))
    
    inline def setIcecandidate(value: /* event */ IceCandidateEvent => Callback): Self = StObject.set(x, "icecandidate", js.Any.fromFunction1((t0: /* event */ IceCandidateEvent) => value(t0).runNow()))
    
    inline def setMuted(value: /* event */ MediaConstraints => Callback): Self = StObject.set(x, "muted", js.Any.fromFunction1((t0: /* event */ MediaConstraints) => value(t0).runNow()))
    
    inline def setNewDTMF(value: (/* event */ IncomingDTMFEvent) | (/* event */ OutgoingDTMFEvent) => Callback): Self = StObject.set(x, "newDTMF", js.Any.fromFunction1((t0: (/* event */ IncomingDTMFEvent) | (/* event */ OutgoingDTMFEvent)) => value(t0).runNow()))
    
    inline def setNewInfo(value: (/* event */ IncomingInfoEvent) | (/* event */ OutgoingInfoEvent) => Callback): Self = StObject.set(x, "newInfo", js.Any.fromFunction1((t0: (/* event */ IncomingInfoEvent) | (/* event */ OutgoingInfoEvent)) => value(t0).runNow()))
    
    inline def setPeerconnection(value: /* event */ PeerConnectionEvent => Callback): Self = StObject.set(x, "peerconnection", js.Any.fromFunction1((t0: /* event */ PeerConnectionEvent) => value(t0).runNow()))
    
    inline def setPeerconnectionColoncreateanswerfailed(value: AnyListener): Self = StObject.set(x, "peerconnection:createanswerfailed", value.asInstanceOf[js.Any])
    
    inline def setPeerconnectionColoncreateofferfailed(value: AnyListener): Self = StObject.set(x, "peerconnection:createofferfailed", value.asInstanceOf[js.Any])
    
    inline def setPeerconnectionColonsetlocaldescriptionfailed(value: AnyListener): Self = StObject.set(x, "peerconnection:setlocaldescriptionfailed", value.asInstanceOf[js.Any])
    
    inline def setPeerconnectionColonsetremotedescriptionfailed(value: AnyListener): Self = StObject.set(x, "peerconnection:setremotedescriptionfailed", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent) => Callback): Self = StObject.set(x, "progress", js.Any.fromFunction1((t0: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent)) => value(t0).runNow()))
    
    inline def setRefer(value: /* event */ ReferEvent => Callback): Self = StObject.set(x, "refer", js.Any.fromFunction1((t0: /* event */ ReferEvent) => value(t0).runNow()))
    
    inline def setReinvite(value: /* event */ ReInviteEvent => Callback): Self = StObject.set(x, "reinvite", js.Any.fromFunction1((t0: /* event */ ReInviteEvent) => value(t0).runNow()))
    
    inline def setReplaces(value: /* event */ ReferEvent => Callback): Self = StObject.set(x, "replaces", js.Any.fromFunction1((t0: /* event */ ReferEvent) => value(t0).runNow()))
    
    inline def setSdp(value: /* event */ SDPEvent => Callback): Self = StObject.set(x, "sdp", js.Any.fromFunction1((t0: /* event */ SDPEvent) => value(t0).runNow()))
    
    inline def setSending(value: /* event */ SendingEvent => Callback): Self = StObject.set(x, "sending", js.Any.fromFunction1((t0: /* event */ SendingEvent) => value(t0).runNow()))
    
    inline def setUnhold(value: /* event */ HoldEvent => Callback): Self = StObject.set(x, "unhold", js.Any.fromFunction1((t0: /* event */ HoldEvent) => value(t0).runNow()))
    
    inline def setUnmuted(value: /* event */ MediaConstraints => Callback): Self = StObject.set(x, "unmuted", js.Any.fromFunction1((t0: /* event */ MediaConstraints) => value(t0).runNow()))
    
    inline def setUpdate(value: /* event */ ReInviteEvent => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* event */ ReInviteEvent) => value(t0).runNow()))
  }
}
