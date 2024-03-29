package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libApiInvitationAcceptOptionsMod.InvitationAcceptOptions
import typingsJapgolly.sipJs.libApiInvitationProgressOptionsMod.InvitationProgressOptions
import typingsJapgolly.sipJs.libApiInvitationRejectOptionsMod.InvitationRejectOptions
import typingsJapgolly.sipJs.libApiSessionMod.Session
import typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent
import typingsJapgolly.sipJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest
import typingsJapgolly.sipJs.libCoreMod.IncomingRequestMessage
import typingsJapgolly.sipJs.libCoreMod.NameAddrHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiInvitationMod {
  
  @JSImport("sip.js/lib/api/invitation", "Invitation")
  @js.native
  open class Invitation protected () extends Session {
    /** @internal */
    def this(userAgent: UserAgent, incomingInviteRequest: IncomingInviteRequest) = this()
    
    /**
      * Handle CANCEL request.
      *
      * @param message - CANCEL message.
      * @internal
      */
    def _onCancel(message: IncomingRequestMessage): Unit = js.native
    
    /**
      * Accept the invitation.
      *
      * @remarks
      * Accept the incoming INVITE request to start a Session.
      * Replies to the INVITE request with a 200 Ok response.
      * Resolves once the response sent, otherwise rejects.
      *
      * This method may reject for a variety of reasons including
      * the receipt of a CANCEL request before `accept` is able
      * to construct a response.
      * @param options - Options bucket.
      */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: InvitationAcceptOptions): js.Promise[Unit] = js.native
    
    /**
      * If true, a first provisional response after the 100 Trying
      * will be sent automatically. This is false it the UAC required
      * reliable provisional responses (100rel in Require header) or
      * the user agent configuration has specified to not send an
      * initial response, otherwise it is true. The provisional is sent by
      * calling `progress()` without any options.
      */
    def autoSendAnInitialProvisionalResponse: Boolean = js.native
    
    /**
      * Initial incoming INVITE request message body.
      */
    def body: js.UndefOr[String] = js.native
    
    /** True if dispose() has been called. */
    /* private */ var disposed: Any = js.native
    
    /** INVITE will be rejected if not accepted within a certain period time. */
    /* private */ var expiresTimer: Any = js.native
    
    /**
      * Helper function to handle offer/answer in a PRACK.
      */
    /* private */ var handlePrackOfferAnswer: Any = js.native
    
    /**
      * A handler for errors which occur while attempting to send 1xx and 2xx responses.
      * In all cases, an attempt is made to reject the request if it is still outstanding.
      * And while there are a variety of things which can go wrong and we log something here
      * for all errors, there are a handful of common exceptions we pay some extra attention to.
      * @param error - The error which occurred.
      */
    /* private */ var handleResponseError: Any = js.native
    
    /* private */ var incomingInviteRequest: Any = js.native
    
    /** True if this Session has been Terminated due to a CANCEL request. */
    /* private */ var isCanceled: Any = js.native
    
    /**
      * The identity of the local user.
      */
    @JSName("localIdentity")
    def localIdentity_MInvitation: NameAddrHeader = js.native
    
    /**
      * Callback for when ACK for a 2xx response is never received.
      * @param session - Session the ACK never arrived for.
      */
    /* private */ var onAckTimeout: Any = js.native
    
    /**
      * Here we are resolving the promise which in turn will cause
      * the accept to proceed (it may still fail for other reasons, but...).
      */
    /* private */ var prackArrived: Any = js.native
    
    /**
      * Here we are rejecting the promise which in turn will cause
      * the accept to fail and the session to transition to "terminated".
      */
    /* private */ var prackNeverArrived: Any = js.native
    
    /**
      * Indicate progress processing the invitation.
      *
      * @remarks
      * Report progress to the the caller.
      * Replies to the INVITE request with a 1xx provisional response.
      * Resolves once the response sent, otherwise rejects.
      * @param options - Options bucket.
      */
    def progress(): js.Promise[Unit] = js.native
    def progress(options: InvitationProgressOptions): js.Promise[Unit] = js.native
    
    /**
      * Reject the invitation.
      *
      * @remarks
      * Replies to the INVITE request with a 4xx, 5xx, or 6xx final response.
      * Resolves once the response sent, otherwise rejects.
      *
      * The expectation is that this method is used to reject an INVITE request.
      * That is indeed the case - a call to `progress` followed by `reject` is
      * a typical way to "decline" an incoming INVITE request. However it may
      * also be called after calling `accept` (but only before it completes)
      * which will reject the call and cause `accept` to reject.
      * @param options - Options bucket.
      */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: InvitationRejectOptions): js.Promise[Unit] = js.native
    
    /** Are reliable provisional responses required or supported. */
    /* private */ var rel100: Any = js.native
    
    /**
      * The identity of the remote user.
      */
    @JSName("remoteIdentity")
    def remoteIdentity_MInvitation: NameAddrHeader = js.native
    
    /**
      * Initial incoming INVITE request message.
      */
    def request: IncomingRequestMessage = js.native
    
    /** The current RSeq header value. */
    /* private */ var rseq: Any = js.native
    
    /**
      * A version of `accept` which resolves a session when the 200 Ok response is sent.
      * @param options - Options bucket.
      */
    /* private */ var sendAccept: Any = js.native
    
    /**
      * A version of `progress` which resolves when the provisional response is sent.
      * @param options - Options bucket.
      */
    /* private */ var sendProgress: Any = js.native
    
    /**
      * A version of `progress` which resolves when the reliable provisional response is sent.
      * @param options - Options bucket.
      */
    /* private */ var sendProgressReliable: Any = js.native
    
    /**
      * A version of `progress` which resolves when the reliable provisional response is acknowledged.
      * @param options - Options bucket.
      */
    /* private */ var sendProgressReliableWaitForPrack: Any = js.native
    
    /**
      * A version of `progress` which resolves when a 100 Trying provisional response is sent.
      */
    /* private */ var sendProgressTrying: Any = js.native
    
    /**
      * A version of `progress` which resolves when the provisional response with sdp is sent.
      * @param options - Options bucket.
      */
    /* private */ var sendProgressWithSDP: Any = js.native
    
    /** INVITE will be rejected if final response not sent in a certain period time. */
    /* private */ var userNoAnswerTimer: Any = js.native
    
    /**
      * When attempting to accept the INVITE, an invitation waits
      * for any outstanding PRACK to arrive before sending the 200 Ok.
      * It will be waiting on this Promise to resolve which lets it know
      * the PRACK has arrived and it may proceed to send the 200 Ok.
      */
    /* private */ var waitForArrivalOfPrack: Any = js.native
    
    /** True if waiting for a PRACK before sending a 200 Ok. */
    /* private */ var waitingForPrack: Any = js.native
    
    /** A Promise providing a defer when waiting for a PRACK. */
    /* private */ var waitingForPrackPromise: Any = js.native
    
    /** Function to reject when PRACK never arrives. */
    /* private */ var waitingForPrackReject: Any = js.native
    
    /** Function to resolve when PRACK arrives. */
    /* private */ var waitingForPrackResolve: Any = js.native
  }
}
