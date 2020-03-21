package typingsJapgolly.sipJs.libSessionMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.events.mod.EventEmitter
import typingsJapgolly.sipJs.ackMod.IncomingAckRequest
import typingsJapgolly.sipJs.coreMod.IncomingRequestMessage
import typingsJapgolly.sipJs.coreMod.IncomingResponseMessage
import typingsJapgolly.sipJs.coreMod.Logger
import typingsJapgolly.sipJs.coreMod.NameAddrHeader
import typingsJapgolly.sipJs.coreMod.OutgoingRequestMessage
import typingsJapgolly.sipJs.enumsMod.SessionStatus
import typingsJapgolly.sipJs.enumsMod.TypeStrings
import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest
import typingsJapgolly.sipJs.libConstantsMod.C.causes
import typingsJapgolly.sipJs.libSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typingsJapgolly.sipJs.libSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactoryOptions
import typingsJapgolly.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandler
import typingsJapgolly.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typingsJapgolly.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifiers
import typingsJapgolly.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import typingsJapgolly.sipJs.libSessionMod.Session.DtmfOptions
import typingsJapgolly.sipJs.referContextMod.ReferClientContext
import typingsJapgolly.sipJs.referContextMod.ReferServerContext
import typingsJapgolly.sipJs.sessionDtmfMod.DTMF
import typingsJapgolly.sipJs.sipJsStrings.`SessionDescriptionHandler-created`
import typingsJapgolly.sipJs.sipJsStrings.accepted
import typingsJapgolly.sipJs.sipJsStrings.ack_
import typingsJapgolly.sipJs.sipJsStrings.bye_
import typingsJapgolly.sipJs.sipJsStrings.cancel_
import typingsJapgolly.sipJs.sipJsStrings.confirmed
import typingsJapgolly.sipJs.sipJsStrings.connecting
import typingsJapgolly.sipJs.sipJsStrings.dialog
import typingsJapgolly.sipJs.sipJsStrings.directionChanged
import typingsJapgolly.sipJs.sipJsStrings.dtmf
import typingsJapgolly.sipJs.sipJsStrings.failed
import typingsJapgolly.sipJs.sipJsStrings.notify_
import typingsJapgolly.sipJs.sipJsStrings.progress
import typingsJapgolly.sipJs.sipJsStrings.referAccepted
import typingsJapgolly.sipJs.sipJsStrings.referInviteSent
import typingsJapgolly.sipJs.sipJsStrings.referProgress
import typingsJapgolly.sipJs.sipJsStrings.referRejected
import typingsJapgolly.sipJs.sipJsStrings.referRequestAccepted
import typingsJapgolly.sipJs.sipJsStrings.referRequestProgress
import typingsJapgolly.sipJs.sipJsStrings.referRequestRejected
import typingsJapgolly.sipJs.sipJsStrings.referRequested
import typingsJapgolly.sipJs.sipJsStrings.reinvite
import typingsJapgolly.sipJs.sipJsStrings.reinviteAccepted
import typingsJapgolly.sipJs.sipJsStrings.reinviteFailed
import typingsJapgolly.sipJs.sipJsStrings.rejected
import typingsJapgolly.sipJs.sipJsStrings.renegotiationError
import typingsJapgolly.sipJs.sipJsStrings.replaced
import typingsJapgolly.sipJs.sipJsStrings.terminated
import typingsJapgolly.sipJs.sipJsStrings.trackAdded
import typingsJapgolly.sipJs.uAMod.UA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Session", "Session")
@js.native
abstract class Session_ protected () extends EventEmitter {
  protected def this(sessionDescriptionHandlerFactory: SessionDescriptionHandlerFactory) = this()
  var assertedIdentity: js.UndefOr[NameAddrHeader] = js.native
  var body: js.Any = js.native
  var contact: js.UndefOr[String] = js.native
  var contentType: String = js.native
  var data: js.Any = js.native
  var earlySdp: js.UndefOr[String] = js.native
  var endTime: js.UndefOr[js.Date] = js.native
  var fromTag: js.UndefOr[String] = js.native
  var hasAnswer: Boolean = js.native
  var hasOffer: Boolean = js.native
  var id: String = js.native
  var localHold: Boolean = js.native
  var localIdentity: NameAddrHeader = js.native
  var logger: Logger = js.native
  var method: String = js.native
  var modifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
  var onInfo: js.UndefOr[js.Function1[/* request */ IncomingRequestMessage, Unit]] = js.native
  var passedOptions: js.Any = js.native
  var pendingReinvite: js.Any = js.native
  var referContext: js.Any = js.native
  var rel100: String = js.native
  var remoteIdentity: NameAddrHeader = js.native
  var renderbody: js.UndefOr[String] = js.native
  var rendertype: js.UndefOr[String] = js.native
  var replacee: js.UndefOr[InviteClientContext | InviteServerContext] = js.native
  var session: js.UndefOr[typingsJapgolly.sipJs.sessionSessionMod.Session] = js.native
  var sessionDescriptionHandler: js.UndefOr[SessionDescriptionHandler] = js.native
  @JSName("sessionDescriptionHandlerFactory")
  var sessionDescriptionHandlerFactory_Original: SessionDescriptionHandlerFactory = js.native
  var sessionDescriptionHandlerOptions: js.Any = js.native
  var startTime: js.UndefOr[js.Date] = js.native
  var status: SessionStatus = js.native
  var timers: StringDictionary[js.Any] = js.native
  var tones: js.Any = js.native
  var `type`: TypeStrings = js.native
  var ua: UA = js.native
  /* protected */ def accepted(): this.type = js.native
  /* protected */ def accepted(response: String): this.type = js.native
  /* protected */ def accepted(response: String, cause: String): this.type = js.native
  /* protected */ def accepted(response: IncomingResponseMessage): this.type = js.native
  /* protected */ def accepted(response: IncomingResponseMessage, cause: String): this.type = js.native
  def bye(): this.type = js.native
  def bye(options: js.Any): this.type = js.native
  /* protected */ def canceled(): this.type = js.native
  def close(): this.type = js.native
  /* protected */ def connecting(request: IncomingRequestMessage): this.type = js.native
  def dtmf(tones: String): this.type = js.native
  def dtmf(tones: String, options: DtmfOptions): this.type = js.native
  def dtmf(tones: Double): this.type = js.native
  def dtmf(tones: Double, options: DtmfOptions): this.type = js.native
  /* protected */ def errorListener(args: js.Any*): Unit = js.native
  /* protected */ def failed(response: js.UndefOr[scala.Nothing], cause: String): this.type = js.native
  /* protected */ def failed(response: IncomingRequestMessage, cause: String): this.type = js.native
  /* protected */ def failed(response: IncomingResponseMessage, cause: String): this.type = js.native
  def hold(): Unit = js.native
  def hold(options: SessionDescriptionHandlerOptions): Unit = js.native
  def hold(options: SessionDescriptionHandlerOptions, modifiers: SessionDescriptionHandlerModifiers): Unit = js.native
  def on(
    event: referInviteSent | referProgress | referAccepted | referRejected | referRequestProgress | referRequestAccepted | referRequestRejected | reinvite | reinviteAccepted | reinviteFailed | replaced,
    listener: js.Function1[/* session */ this.type, Unit]
  ): this.type = js.native
  /* protected */ def onAck(incomingRequest: IncomingAckRequest): Unit = js.native
  def onDialogError(response: IncomingResponseMessage): Unit = js.native
  def onRequestTimeout(): Unit = js.native
  def onTransportError(): Unit = js.native
  @JSName("on")
  def on_SessionDescriptionHandlercreated(
    event: `SessionDescriptionHandler-created`,
    listener: js.Function1[/* sessionDescriptionHandler */ SessionDescriptionHandler, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_accepted(event: accepted, listener: js.Function2[/* response */ js.Any, /* cause */ causes, Unit]): this.type = js.native
  @JSName("on")
  def on_ack(event: ack_, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_bye(event: bye_, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_cancel(event: cancel_, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_confirmed(event: confirmed, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_connecting(event: connecting, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_dialog(event: dialog, listener: js.Function1[/* dialog */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_directionChanged(event: directionChanged, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_dtmf(
    event: dtmf,
    listener: js.Function2[/* request */ IncomingRequestMessage | OutgoingRequestMessage, /* dtmf */ DTMF, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_failed(
    event: failed,
    listener: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[causes], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_notify(event: notify_, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_progress(
    event: progress,
    listener: js.Function2[
      /* response */ IncomingResponseMessage | String, 
      /* reasonPhrase */ js.UndefOr[js.Any], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_referRequested(event: referRequested, listener: js.Function1[/* context */ ReferServerContext, Unit]): this.type = js.native
  @JSName("on")
  def on_rejected(
    event: rejected,
    listener: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[causes], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_renegotiationError(event: renegotiationError, listener: js.Function1[/* error */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_terminated(
    event: terminated,
    listener: js.Function2[/* message */ js.UndefOr[js.Any], /* cause */ js.UndefOr[causes], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_trackAdded(event: trackAdded, listener: js.Function0[Unit]): this.type = js.native
  /* protected */ def receiveReinvite(incomingRequest: IncomingRequest): Unit = js.native
  /* protected */ def receiveRequest(incomingRequest: IncomingRequest): Unit = js.native
  def refer(target: String): ReferClientContext = js.native
  def refer(target: String, options: js.Any): ReferClientContext = js.native
  def refer(target: InviteClientContext): ReferClientContext = js.native
  def refer(target: InviteClientContext, options: js.Any): ReferClientContext = js.native
  def refer(target: InviteServerContext): ReferClientContext = js.native
  def refer(target: InviteServerContext, options: js.Any): ReferClientContext = js.native
  def reinvite(): Unit = js.native
  def reinvite(options: js.Any): Unit = js.native
  def reinvite(options: js.Any, modifiers: SessionDescriptionHandlerModifiers): Unit = js.native
  /* protected */ def rejected(response: IncomingRequestMessage, cause: String): this.type = js.native
  /* protected */ def rejected(response: IncomingResponseMessage, cause: String): this.type = js.native
  /* protected */ def sendReinvite(): Unit = js.native
  /* protected */ def sendReinvite(options: js.Any): Unit = js.native
  /**
    * Sends in dialog request.
    * @param method Request method.
    * @param options Options bucket.
    */
  def sendRequest(method: String): this.type = js.native
  def sendRequest(method: String, options: js.Any): this.type = js.native
  /* protected */ def sessionDescriptionHandlerFactory(session: InviteClientContext): SessionDescriptionHandler = js.native
  /* protected */ def sessionDescriptionHandlerFactory(session: InviteClientContext, options: SessionDescriptionHandlerFactoryOptions): SessionDescriptionHandler = js.native
  /* protected */ def sessionDescriptionHandlerFactory(session: InviteServerContext): SessionDescriptionHandler = js.native
  /* protected */ def sessionDescriptionHandlerFactory(session: InviteServerContext, options: SessionDescriptionHandlerFactoryOptions): SessionDescriptionHandler = js.native
  def terminate(): this.type = js.native
  def terminate(options: js.Any): this.type = js.native
  /* protected */ def terminated(): this.type = js.native
  /* protected */ def terminated(message: IncomingRequestMessage): this.type = js.native
  /* protected */ def terminated(message: IncomingRequestMessage, cause: String): this.type = js.native
  /* protected */ def terminated(message: IncomingResponseMessage): this.type = js.native
  /* protected */ def terminated(message: IncomingResponseMessage, cause: String): this.type = js.native
  def unhold(): Unit = js.native
  def unhold(options: SessionDescriptionHandlerOptions): Unit = js.native
  def unhold(options: SessionDescriptionHandlerOptions, modifiers: SessionDescriptionHandlerModifiers): Unit = js.native
}

