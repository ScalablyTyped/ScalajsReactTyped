package typingsJapgolly.sipJs.libWebSessionDescriptionHandlerMod

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.experimental.mediastream.MediaStreamConstraints
import org.scalajs.dom.experimental.mediastream.MediaStreamTrack
import org.scalajs.dom.experimental.webrtc.RTCIceCandidate
import org.scalajs.dom.experimental.webrtc.RTCPeerConnection
import org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit
import typingsJapgolly.events.mod.EventEmitter
import typingsJapgolly.sipJs.coreMod.Logger
import typingsJapgolly.sipJs.enumsMod.TypeStrings
import typingsJapgolly.sipJs.libSessionDescriptionHandlerMod.BodyObj
import typingsJapgolly.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifiers
import typingsJapgolly.sipJs.libSessionMod.InviteClientContext
import typingsJapgolly.sipJs.libSessionMod.InviteServerContext
import typingsJapgolly.sipJs.sessionMod.Session
import typingsJapgolly.sipJs.sipJsStrings.`peerConnection-SetLocalDescriptionFailed`
import typingsJapgolly.sipJs.sipJsStrings.`peerConnection-createAnswerFailed`
import typingsJapgolly.sipJs.sipJsStrings.`peerConnection-createOfferFailed`
import typingsJapgolly.sipJs.sipJsStrings.`peerConnection-setRemoteDescriptionFailed`
import typingsJapgolly.sipJs.sipJsStrings.addStream
import typingsJapgolly.sipJs.sipJsStrings.addTrack
import typingsJapgolly.sipJs.sipJsStrings.confirmed
import typingsJapgolly.sipJs.sipJsStrings.getDescription
import typingsJapgolly.sipJs.sipJsStrings.iceCandidate
import typingsJapgolly.sipJs.sipJsStrings.iceConectionClosed
import typingsJapgolly.sipJs.sipJsStrings.iceConnection
import typingsJapgolly.sipJs.sipJsStrings.iceConnectionChecking
import typingsJapgolly.sipJs.sipJsStrings.iceConnectionCompleted
import typingsJapgolly.sipJs.sipJsStrings.iceConnectionConnected
import typingsJapgolly.sipJs.sipJsStrings.iceConnectionDisconnected
import typingsJapgolly.sipJs.sipJsStrings.iceConnectionFailed
import typingsJapgolly.sipJs.sipJsStrings.iceGathering
import typingsJapgolly.sipJs.sipJsStrings.iceGatheringComplete
import typingsJapgolly.sipJs.sipJsStrings.setDescription
import typingsJapgolly.sipJs.sipJsStrings.setRemoteDescription
import typingsJapgolly.sipJs.sipJsStrings.userMedia
import typingsJapgolly.sipJs.sipJsStrings.userMediaFailed
import typingsJapgolly.sipJs.sipJsStrings.userMediaRequest
import typingsJapgolly.sipJs.webSessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver
import typingsJapgolly.std.RTCRtpReceiver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web/SessionDescriptionHandler", "SessionDescriptionHandler")
@js.native
class SessionDescriptionHandler protected ()
  extends EventEmitter
     with typingsJapgolly.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandler {
  def this(logger: Logger, observer: SessionDescriptionHandlerObserver, options: js.Any) = this()
  var C: js.Any = js.native
  var CONTENT_TYPE: js.Any = js.native
  var acquire: js.Any = js.native
  var addDefaultIceCheckingTimeout: js.Any = js.native
  var addDefaultIceServers: js.Any = js.native
  var checkAndDefaultConstraints: js.Any = js.native
  var constraints: js.Any = js.native
  var createOfferOrAnswer: js.Any = js.native
  var createRTCSessionDescriptionInit: js.Any = js.native
  var direction: js.Any = js.native
  var dtmfSender: js.Any = js.native
  var hasBrowserGetSenderSupport: js.Any = js.native
  var hasBrowserTrackSupport: js.Any = js.native
  var hasOffer: js.Any = js.native
  var iceGatheringDeferred: js.Any = js.native
  var iceGatheringTimeout: js.Any = js.native
  var iceGatheringTimer: js.Any = js.native
  var initPeerConnection: js.Any = js.native
  var isIceGatheringComplete: js.Any = js.native
  var logger: js.Any = js.native
  var modifiers: js.Any = js.native
  var observer: js.Any = js.native
  var options: js.Any = js.native
  var peerConnection: RTCPeerConnection = js.native
  var resetIceGatheringComplete: js.Any = js.native
  var setDirection: js.Any = js.native
  var shouldAcquireMedia: js.Any = js.native
  var triggerIceGatheringComplete: js.Any = js.native
  var `type`: TypeStrings = js.native
  var waitForIceGatheringComplete: js.Any = js.native
  def getDescription(options: WebSessionDescriptionHandlerOptions): js.Promise[BodyObj] = js.native
  def getDescription(options: WebSessionDescriptionHandlerOptions, modifiers: SessionDescriptionHandlerModifiers): js.Promise[BodyObj] = js.native
  /**
    * Get the direction of the session description
    * @returns {String} direction of the description
    */
  def getDirection(): String = js.native
  /* protected */ def getMediaStream(constraints: MediaStreamConstraints): js.Promise[MediaStream] = js.native
  @JSName("on")
  def on_addStream(event: addStream, listener: js.Function1[/* track */ MediaStream, Unit]): this.type = js.native
  @JSName("on")
  def on_addTrack(event: addTrack, listener: js.Function1[/* track */ MediaStreamTrack, Unit]): this.type = js.native
  @JSName("on")
  def on_confirmed(event: confirmed, listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_getDescription(event: getDescription, listener: js.Function1[/* description */ RTCSessionDescriptionInit, Unit]): this.type = js.native
  @JSName("on")
  def on_iceCandidate(event: iceCandidate, listener: js.Function1[/* candidate */ RTCIceCandidate, Unit]): this.type = js.native
  @JSName("on")
  def on_iceConectionClosed(event: iceConectionClosed, listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_iceConnection(event: iceConnection, listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_iceConnectionChecking(
    event: iceConnectionChecking,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionCompleted(
    event: iceConnectionCompleted,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionConnected(
    event: iceConnectionConnected,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionDisconnected(
    event: iceConnectionDisconnected,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionFailed(
    event: iceConnectionFailed,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceGathering(event: iceGathering, listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_iceGatheringComplete(
    event: iceGatheringComplete,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_peerConnectionSetLocalDescriptionFailed(
    event: `peerConnection-SetLocalDescriptionFailed`,
    listener: js.Function1[/* error */ js.Any, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_peerConnectioncreateAnswerFailed(event: `peerConnection-createAnswerFailed`, listener: js.Function1[/* error */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_peerConnectioncreateOfferFailed(event: `peerConnection-createOfferFailed`, listener: js.Function1[/* error */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_peerConnectionsetRemoteDescriptionFailed(
    event: `peerConnection-setRemoteDescriptionFailed`,
    listener: js.Function1[/* error */ js.Any, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_setDescription(event: setDescription, listener: js.Function1[/* description */ RTCSessionDescriptionInit, Unit]): this.type = js.native
  @JSName("on")
  def on_setRemoteDescription(
    event: setRemoteDescription,
    listener: js.Function1[/* receivers */ js.Array[RTCRtpReceiver], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_userMedia(event: userMedia, listener: js.Function1[/* streams */ MediaStream, Unit]): this.type = js.native
  @JSName("on")
  def on_userMediaFailed(event: userMediaFailed, listener: js.Function1[/* error */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_userMediaRequest(event: userMediaRequest, listener: js.Function1[/* constraints */ MediaStreamConstraints, Unit]): this.type = js.native
  def setDescription(sessionDescription: String, options: WebSessionDescriptionHandlerOptions): js.Promise[Unit] = js.native
  def setDescription(
    sessionDescription: String,
    options: WebSessionDescriptionHandlerOptions,
    modifiers: SessionDescriptionHandlerModifiers
  ): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("sip.js/lib/Web/SessionDescriptionHandler", "SessionDescriptionHandler")
@js.native
object SessionDescriptionHandler extends js.Object {
  /**
    * @param {SIP.Session} session
    * @param {Object} [options]
    */
  def defaultFactory(session: InviteClientContext, options: js.Any): SessionDescriptionHandler = js.native
  def defaultFactory(session: InviteServerContext, options: js.Any): SessionDescriptionHandler = js.native
  def defaultFactory(session: Session, options: js.Any): SessionDescriptionHandler = js.native
}

