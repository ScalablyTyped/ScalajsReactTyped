package typingsJapgolly.jssip

import japgolly.scalajs.react.Callback
import typingsJapgolly.jssip.libMessageMod.MessageFailedEvent
import typingsJapgolly.jssip.libMessageMod.MessageFailedListener
import typingsJapgolly.jssip.libRtcsessionMod.AnyListener
import typingsJapgolly.jssip.libRtcsessionMod.CallListener
import typingsJapgolly.jssip.libRtcsessionMod.ConfirmedListener
import typingsJapgolly.jssip.libRtcsessionMod.ConnectingEvent
import typingsJapgolly.jssip.libRtcsessionMod.ConnectingListener
import typingsJapgolly.jssip.libRtcsessionMod.DTMFListener
import typingsJapgolly.jssip.libRtcsessionMod.EndEvent
import typingsJapgolly.jssip.libRtcsessionMod.EndListener
import typingsJapgolly.jssip.libRtcsessionMod.HoldEvent
import typingsJapgolly.jssip.libRtcsessionMod.HoldListener
import typingsJapgolly.jssip.libRtcsessionMod.IceCandidateEvent
import typingsJapgolly.jssip.libRtcsessionMod.IceCandidateListener
import typingsJapgolly.jssip.libRtcsessionMod.IncomingAckEvent
import typingsJapgolly.jssip.libRtcsessionMod.IncomingDTMFEvent
import typingsJapgolly.jssip.libRtcsessionMod.IncomingEvent
import typingsJapgolly.jssip.libRtcsessionMod.IncomingInfoEvent
import typingsJapgolly.jssip.libRtcsessionMod.InfoListener
import typingsJapgolly.jssip.libRtcsessionMod.MediaConstraints
import typingsJapgolly.jssip.libRtcsessionMod.MuteListener
import typingsJapgolly.jssip.libRtcsessionMod.OutgoingAckEvent
import typingsJapgolly.jssip.libRtcsessionMod.OutgoingDTMFEvent
import typingsJapgolly.jssip.libRtcsessionMod.OutgoingEvent
import typingsJapgolly.jssip.libRtcsessionMod.OutgoingInfoEvent
import typingsJapgolly.jssip.libRtcsessionMod.OutgoingListener
import typingsJapgolly.jssip.libRtcsessionMod.PeerConnectionEvent
import typingsJapgolly.jssip.libRtcsessionMod.PeerConnectionListener
import typingsJapgolly.jssip.libRtcsessionMod.ReInviteEvent
import typingsJapgolly.jssip.libRtcsessionMod.ReInviteListener
import typingsJapgolly.jssip.libRtcsessionMod.ReferEvent
import typingsJapgolly.jssip.libRtcsessionMod.ReferListener
import typingsJapgolly.jssip.libRtcsessionMod.SDPEvent
import typingsJapgolly.jssip.libRtcsessionMod.SDPListener
import typingsJapgolly.jssip.libRtcsessionMod.SendingEvent
import typingsJapgolly.jssip.libRtcsessionMod.SendingListener
import typingsJapgolly.jssip.libRtcsessionMod.UpdateListener
import typingsJapgolly.jssip.libSipmessageMod.IncomingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Event[T] extends StObject {
    
    var event: T
    
    var request: IncomingRequest
  }
  object Event {
    
    inline def apply[T](event: T, request: IncomingRequest): Event[T] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event[T]]
    }
    
    extension [Self <: Event[?], T](x: Self & Event[T]) {
      
      inline def setEvent(value: T): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<jssip.jssip/lib/Message.MessageEventMap> */
  trait PartialMessageEventMap extends StObject {
    
    var failed: js.UndefOr[MessageFailedListener] = js.undefined
    
    var succeeded: js.UndefOr[OutgoingListener] = js.undefined
  }
  object PartialMessageEventMap {
    
    inline def apply(): PartialMessageEventMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMessageEventMap]
    }
    
    extension [Self <: PartialMessageEventMap](x: Self) {
      
      inline def setFailed(value: /* event */ MessageFailedEvent => Callback): Self = StObject.set(x, "failed", js.Any.fromFunction1((t0: /* event */ MessageFailedEvent) => value(t0).runNow()))
      
      inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
      
      inline def setSucceeded(value: /* event */ OutgoingEvent => Callback): Self = StObject.set(x, "succeeded", js.Any.fromFunction1((t0: /* event */ OutgoingEvent) => value(t0).runNow()))
      
      inline def setSucceededUndefined: Self = StObject.set(x, "succeeded", js.undefined)
    }
  }
  
  /* Inlined std.Partial<jssip.jssip/lib/RTCSession.RTCSessionEventMap> */
  trait PartialRTCSessionEventMap extends StObject {
    
    var accepted: js.UndefOr[CallListener] = js.undefined
    
    var confirmed: js.UndefOr[ConfirmedListener] = js.undefined
    
    var connecting: js.UndefOr[ConnectingListener] = js.undefined
    
    var ended: js.UndefOr[EndListener] = js.undefined
    
    var failed: js.UndefOr[EndListener] = js.undefined
    
    var getusermediafailed: js.UndefOr[AnyListener] = js.undefined
    
    var hold: js.UndefOr[HoldListener] = js.undefined
    
    var icecandidate: js.UndefOr[IceCandidateListener] = js.undefined
    
    var muted: js.UndefOr[MuteListener] = js.undefined
    
    var newDTMF: js.UndefOr[DTMFListener] = js.undefined
    
    var newInfo: js.UndefOr[InfoListener] = js.undefined
    
    var peerconnection: js.UndefOr[PeerConnectionListener] = js.undefined
    
    @JSName("peerconnection:createanswerfailed")
    var peerconnectionColoncreateanswerfailed: js.UndefOr[AnyListener] = js.undefined
    
    @JSName("peerconnection:createofferfailed")
    var peerconnectionColoncreateofferfailed: js.UndefOr[AnyListener] = js.undefined
    
    @JSName("peerconnection:setlocaldescriptionfailed")
    var peerconnectionColonsetlocaldescriptionfailed: js.UndefOr[AnyListener] = js.undefined
    
    @JSName("peerconnection:setremotedescriptionfailed")
    var peerconnectionColonsetremotedescriptionfailed: js.UndefOr[AnyListener] = js.undefined
    
    var progress: js.UndefOr[CallListener] = js.undefined
    
    var refer: js.UndefOr[ReferListener] = js.undefined
    
    var reinvite: js.UndefOr[ReInviteListener] = js.undefined
    
    var replaces: js.UndefOr[ReferListener] = js.undefined
    
    var sdp: js.UndefOr[SDPListener] = js.undefined
    
    var sending: js.UndefOr[SendingListener] = js.undefined
    
    var unhold: js.UndefOr[HoldListener] = js.undefined
    
    var unmuted: js.UndefOr[MuteListener] = js.undefined
    
    var update: js.UndefOr[UpdateListener] = js.undefined
  }
  object PartialRTCSessionEventMap {
    
    inline def apply(): PartialRTCSessionEventMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRTCSessionEventMap]
    }
    
    extension [Self <: PartialRTCSessionEventMap](x: Self) {
      
      inline def setAccepted(value: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent) => Callback): Self = StObject.set(x, "accepted", js.Any.fromFunction1((t0: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent)) => value(t0).runNow()))
      
      inline def setAcceptedUndefined: Self = StObject.set(x, "accepted", js.undefined)
      
      inline def setConfirmed(value: (/* event */ IncomingAckEvent) | (/* event */ OutgoingAckEvent) => Callback): Self = StObject.set(x, "confirmed", js.Any.fromFunction1((t0: (/* event */ IncomingAckEvent) | (/* event */ OutgoingAckEvent)) => value(t0).runNow()))
      
      inline def setConfirmedUndefined: Self = StObject.set(x, "confirmed", js.undefined)
      
      inline def setConnecting(value: /* event */ ConnectingEvent => Callback): Self = StObject.set(x, "connecting", js.Any.fromFunction1((t0: /* event */ ConnectingEvent) => value(t0).runNow()))
      
      inline def setConnectingUndefined: Self = StObject.set(x, "connecting", js.undefined)
      
      inline def setEnded(value: /* event */ EndEvent => Callback): Self = StObject.set(x, "ended", js.Any.fromFunction1((t0: /* event */ EndEvent) => value(t0).runNow()))
      
      inline def setEndedUndefined: Self = StObject.set(x, "ended", js.undefined)
      
      inline def setFailed(value: /* event */ EndEvent => Callback): Self = StObject.set(x, "failed", js.Any.fromFunction1((t0: /* event */ EndEvent) => value(t0).runNow()))
      
      inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
      
      inline def setGetusermediafailed(value: AnyListener): Self = StObject.set(x, "getusermediafailed", value.asInstanceOf[js.Any])
      
      inline def setGetusermediafailedUndefined: Self = StObject.set(x, "getusermediafailed", js.undefined)
      
      inline def setHold(value: /* event */ HoldEvent => Callback): Self = StObject.set(x, "hold", js.Any.fromFunction1((t0: /* event */ HoldEvent) => value(t0).runNow()))
      
      inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      
      inline def setIcecandidate(value: /* event */ IceCandidateEvent => Callback): Self = StObject.set(x, "icecandidate", js.Any.fromFunction1((t0: /* event */ IceCandidateEvent) => value(t0).runNow()))
      
      inline def setIcecandidateUndefined: Self = StObject.set(x, "icecandidate", js.undefined)
      
      inline def setMuted(value: /* event */ MediaConstraints => Callback): Self = StObject.set(x, "muted", js.Any.fromFunction1((t0: /* event */ MediaConstraints) => value(t0).runNow()))
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setNewDTMF(value: (/* event */ IncomingDTMFEvent) | (/* event */ OutgoingDTMFEvent) => Callback): Self = StObject.set(x, "newDTMF", js.Any.fromFunction1((t0: (/* event */ IncomingDTMFEvent) | (/* event */ OutgoingDTMFEvent)) => value(t0).runNow()))
      
      inline def setNewDTMFUndefined: Self = StObject.set(x, "newDTMF", js.undefined)
      
      inline def setNewInfo(value: (/* event */ IncomingInfoEvent) | (/* event */ OutgoingInfoEvent) => Callback): Self = StObject.set(x, "newInfo", js.Any.fromFunction1((t0: (/* event */ IncomingInfoEvent) | (/* event */ OutgoingInfoEvent)) => value(t0).runNow()))
      
      inline def setNewInfoUndefined: Self = StObject.set(x, "newInfo", js.undefined)
      
      inline def setPeerconnection(value: /* event */ PeerConnectionEvent => Callback): Self = StObject.set(x, "peerconnection", js.Any.fromFunction1((t0: /* event */ PeerConnectionEvent) => value(t0).runNow()))
      
      inline def setPeerconnectionColoncreateanswerfailed(value: AnyListener): Self = StObject.set(x, "peerconnection:createanswerfailed", value.asInstanceOf[js.Any])
      
      inline def setPeerconnectionColoncreateanswerfailedUndefined: Self = StObject.set(x, "peerconnection:createanswerfailed", js.undefined)
      
      inline def setPeerconnectionColoncreateofferfailed(value: AnyListener): Self = StObject.set(x, "peerconnection:createofferfailed", value.asInstanceOf[js.Any])
      
      inline def setPeerconnectionColoncreateofferfailedUndefined: Self = StObject.set(x, "peerconnection:createofferfailed", js.undefined)
      
      inline def setPeerconnectionColonsetlocaldescriptionfailed(value: AnyListener): Self = StObject.set(x, "peerconnection:setlocaldescriptionfailed", value.asInstanceOf[js.Any])
      
      inline def setPeerconnectionColonsetlocaldescriptionfailedUndefined: Self = StObject.set(x, "peerconnection:setlocaldescriptionfailed", js.undefined)
      
      inline def setPeerconnectionColonsetremotedescriptionfailed(value: AnyListener): Self = StObject.set(x, "peerconnection:setremotedescriptionfailed", value.asInstanceOf[js.Any])
      
      inline def setPeerconnectionColonsetremotedescriptionfailedUndefined: Self = StObject.set(x, "peerconnection:setremotedescriptionfailed", js.undefined)
      
      inline def setPeerconnectionUndefined: Self = StObject.set(x, "peerconnection", js.undefined)
      
      inline def setProgress(value: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent) => Callback): Self = StObject.set(x, "progress", js.Any.fromFunction1((t0: (/* event */ IncomingEvent) | (/* event */ OutgoingEvent)) => value(t0).runNow()))
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setRefer(value: /* event */ ReferEvent => Callback): Self = StObject.set(x, "refer", js.Any.fromFunction1((t0: /* event */ ReferEvent) => value(t0).runNow()))
      
      inline def setReferUndefined: Self = StObject.set(x, "refer", js.undefined)
      
      inline def setReinvite(value: /* event */ ReInviteEvent => Callback): Self = StObject.set(x, "reinvite", js.Any.fromFunction1((t0: /* event */ ReInviteEvent) => value(t0).runNow()))
      
      inline def setReinviteUndefined: Self = StObject.set(x, "reinvite", js.undefined)
      
      inline def setReplaces(value: /* event */ ReferEvent => Callback): Self = StObject.set(x, "replaces", js.Any.fromFunction1((t0: /* event */ ReferEvent) => value(t0).runNow()))
      
      inline def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
      
      inline def setSdp(value: /* event */ SDPEvent => Callback): Self = StObject.set(x, "sdp", js.Any.fromFunction1((t0: /* event */ SDPEvent) => value(t0).runNow()))
      
      inline def setSdpUndefined: Self = StObject.set(x, "sdp", js.undefined)
      
      inline def setSending(value: /* event */ SendingEvent => Callback): Self = StObject.set(x, "sending", js.Any.fromFunction1((t0: /* event */ SendingEvent) => value(t0).runNow()))
      
      inline def setSendingUndefined: Self = StObject.set(x, "sending", js.undefined)
      
      inline def setUnhold(value: /* event */ HoldEvent => Callback): Self = StObject.set(x, "unhold", js.Any.fromFunction1((t0: /* event */ HoldEvent) => value(t0).runNow()))
      
      inline def setUnholdUndefined: Self = StObject.set(x, "unhold", js.undefined)
      
      inline def setUnmuted(value: /* event */ MediaConstraints => Callback): Self = StObject.set(x, "unmuted", js.Any.fromFunction1((t0: /* event */ MediaConstraints) => value(t0).runNow()))
      
      inline def setUnmutedUndefined: Self = StObject.set(x, "unmuted", js.undefined)
      
      inline def setUpdate(value: /* event */ ReInviteEvent => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* event */ ReInviteEvent) => value(t0).runNow()))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
}
