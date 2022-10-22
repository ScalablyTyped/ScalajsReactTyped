package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libCoreMessagesBodyMod.Body
import typingsJapgolly.sipJs.libCoreMessagesMethodsByeMod.OutgoingByeRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsInfoMod.OutgoingInfoRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import typingsJapgolly.sipJs.libCoreMessagesMethodsMessageMod.OutgoingMessageRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsNotifyMod.OutgoingNotifyRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsPrackMod.OutgoingPrackRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsReferMod.OutgoingReferRequest
import typingsJapgolly.sipJs.libCoreMessagesMod.URI
import typingsJapgolly.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typingsJapgolly.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import typingsJapgolly.sipJs.libCoreSessionSessionDelegateMod.SessionDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreSessionSessionMod {
  
  @js.native
  sealed trait SessionState extends StObject
  @JSImport("sip.js/lib/core/session/session", "SessionState")
  @js.native
  object SessionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SessionState & String] = js.native
    
    @js.native
    sealed trait AckWait
      extends StObject
         with SessionState
    /* "AckWait" */ val AckWait: typingsJapgolly.sipJs.libCoreSessionSessionMod.SessionState.AckWait & String = js.native
    
    @js.native
    sealed trait Confirmed
      extends StObject
         with SessionState
    /* "Confirmed" */ val Confirmed: typingsJapgolly.sipJs.libCoreSessionSessionMod.SessionState.Confirmed & String = js.native
    
    @js.native
    sealed trait Early
      extends StObject
         with SessionState
    /* "Early" */ val Early: typingsJapgolly.sipJs.libCoreSessionSessionMod.SessionState.Early & String = js.native
    
    @js.native
    sealed trait Initial
      extends StObject
         with SessionState
    /* "Initial" */ val Initial: typingsJapgolly.sipJs.libCoreSessionSessionMod.SessionState.Initial & String = js.native
    
    @js.native
    sealed trait Terminated
      extends StObject
         with SessionState
    /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.libCoreSessionSessionMod.SessionState.Terminated & String = js.native
  }
  
  @js.native
  sealed trait SignalingState extends StObject
  @JSImport("sip.js/lib/core/session/session", "SignalingState")
  @js.native
  object SignalingState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SignalingState & String] = js.native
    
    @js.native
    sealed trait Closed
      extends StObject
         with SignalingState
    /* "Closed" */ val Closed: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.Closed & String = js.native
    
    @js.native
    sealed trait HaveLocalOffer
      extends StObject
         with SignalingState
    /* "HaveLocalOffer" */ val HaveLocalOffer: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.HaveLocalOffer & String = js.native
    
    @js.native
    sealed trait HaveRemoteOffer
      extends StObject
         with SignalingState
    /* "HaveRemoteOffer" */ val HaveRemoteOffer: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.HaveRemoteOffer & String = js.native
    
    @js.native
    sealed trait Initial
      extends StObject
         with SignalingState
    /* "Initial" */ val Initial: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.Initial & String = js.native
    
    @js.native
    sealed trait Stable
      extends StObject
         with SignalingState
    /* "Stable" */ val Stable: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.Stable & String = js.native
  }
  
  @js.native
  trait Session extends StObject {
    
    /** The current answer if signalingState is stable. Otherwise undefined. */
    val answer: js.UndefOr[Body] = js.native
    
    /**
      * Send a BYE request.
      * Terminating a session.
      * https://tools.ietf.org/html/rfc3261#section-15
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def bye(): OutgoingByeRequest = js.native
    def bye(delegate: Unit, options: RequestOptions): OutgoingByeRequest = js.native
    def bye(delegate: OutgoingRequestDelegate): OutgoingByeRequest = js.native
    def bye(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingByeRequest = js.native
    
    /** Call Id. */
    val callId: String = js.native
    
    /** Session delegate. */
    var delegate: js.UndefOr[SessionDelegate] = js.native
    
    /**
      * Destroy session.
      */
    def dispose(): Unit = js.native
    
    /** The session id. Equal to callId + localTag + remoteTag. */
    val id: String = js.native
    
    /**
      * Send an INFO request.
      * Exchange information during a session.
      * https://tools.ietf.org/html/rfc6086#section-4.2.1
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def info(): OutgoingInfoRequest = js.native
    def info(delegate: Unit, options: RequestOptions): OutgoingInfoRequest = js.native
    def info(delegate: OutgoingRequestDelegate): OutgoingInfoRequest = js.native
    def info(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingInfoRequest = js.native
    
    /**
      * Send re-INVITE request.
      * Modifying a session.
      * https://tools.ietf.org/html/rfc3261#section-14.1
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def invite(): OutgoingInviteRequest = js.native
    def invite(delegate: Unit, options: RequestOptions): OutgoingInviteRequest = js.native
    def invite(delegate: OutgoingInviteRequestDelegate): OutgoingInviteRequest = js.native
    def invite(delegate: OutgoingInviteRequestDelegate, options: RequestOptions): OutgoingInviteRequest = js.native
    
    /** Local Tag. */
    val localTag: String = js.native
    
    /** Local URI. */
    val localURI: URI = js.native
    
    /**
      * Send MESSAGE request.
      * Deliver a message during a session.
      * https://tools.ietf.org/html/rfc3428#section-4
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def message(): OutgoingMessageRequest = js.native
    def message(delegate: Unit, options: RequestOptions): OutgoingMessageRequest = js.native
    def message(delegate: OutgoingRequestDelegate): OutgoingMessageRequest = js.native
    def message(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingMessageRequest = js.native
    
    def notify(delegate: Unit, options: RequestOptions): OutgoingNotifyRequest = js.native
    def notify(delegate: OutgoingRequestDelegate): OutgoingNotifyRequest = js.native
    def notify(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingNotifyRequest = js.native
    
    /** The current offer if signalingState is not initial or closed. Otherwise undefined. */
    val offer: js.UndefOr[Body] = js.native
    
    /**
      * Send PRACK request.
      * Acknowledge a reliable provisional response.
      * https://tools.ietf.org/html/rfc3262#section-4
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def prack(): OutgoingPrackRequest = js.native
    def prack(delegate: Unit, options: RequestOptions): OutgoingPrackRequest = js.native
    def prack(delegate: OutgoingRequestDelegate): OutgoingPrackRequest = js.native
    def prack(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingPrackRequest = js.native
    
    /**
      * Send REFER request.
      * Transfer a session.
      * https://tools.ietf.org/html/rfc3515#section-2.4.1
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def refer(): OutgoingReferRequest = js.native
    def refer(delegate: Unit, options: RequestOptions): OutgoingReferRequest = js.native
    def refer(delegate: OutgoingRequestDelegate): OutgoingReferRequest = js.native
    def refer(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingReferRequest = js.native
    
    /** Remote Tag. */
    val remoteTag: String = js.native
    
    /** Remote Target. */
    val remoteTarget: URI = js.native
    
    /** Remote URI. */
    val remoteURI: URI = js.native
    
    /** Session state. */
    val sessionState: SessionState = js.native
    
    /** Current state of the offer/answer exchange. */
    val signalingState: SignalingState = js.native
  }
}
