package typingsJapgolly.socketclusterServer.serversocketMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.asyncStreamEmitter.mod.AsyncStreamEmitter
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.scErrors.mod.SocketProtocolErrorStatuses_
import typingsJapgolly.scErrors.mod.SocketProtocolIgnoreStatuses_
import typingsJapgolly.socketclusterServer.AnonBinary
import typingsJapgolly.socketclusterServer.AnonError
import typingsJapgolly.socketclusterServer.AnonMessage
import typingsJapgolly.socketclusterServer.AnonRejectOnFailedDelivery
import typingsJapgolly.socketclusterServer.AnonSignedAuthToken
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.authStateChange
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.authTokenSigned
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.authenticate
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.authenticated
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.badAuthToken
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.close
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.closed
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.connect
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.connectAbort
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.connecting
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.deauthenticate
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.disconnect
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.error
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.message
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.open
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.raw
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.subscribe
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.unauthenticated
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.unsubscribe
import typingsJapgolly.writableConsumableStream.consumerMod.ConsumerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AGServerSocket
  extends AsyncStreamEmitter[js.Any] {
  val AUTHENTICATED: authenticated = js.native
  val CLOSED: closed = js.native
  val CONNECTING: connecting = js.native
  val OPEN: open = js.native
  val UNAUTHENTICATED: unauthenticated = js.native
  var authState: authenticated | unauthenticated = js.native
  var authToken: js.UndefOr[AuthToken] = js.native
  var batchInterval: Double = js.native
  var batchOnHandshake: Boolean = js.native
  var batchOnHandshakeDuration: Double = js.native
  var channelSubscriptions: StringDictionary[Boolean] = js.native
  var channelSubscriptionsCount: Double = js.native
  var cloneData: Boolean = js.native
  val errorStatuses: SocketProtocolErrorStatuses_ = js.native
  var exchange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AGSimpleBroker.SimpleExchange */ js.Any = js.native
  var forwardedForAddress: js.UndefOr[String] = js.native
  var id: String = js.native
  val ignoreStatuses: SocketProtocolIgnoreStatuses_ = js.native
  var inboundMessageStream: typingsJapgolly.writableConsumableStream.mod.^[_] = js.native
  var inboundProcessedMessageCount: Double = js.native
  var inboundReceivedMessageCount: Double = js.native
  var isBatching: Boolean = js.native
  var isBufferingBatch: Boolean = js.native
  var middlewareHandshakeStream: typingsJapgolly.writableConsumableStream.mod.^[_] = js.native
  var middlewareInboundRawStream: typingsJapgolly.writableConsumableStream.mod.^[_] = js.native
  var middlewareInboundStream: typingsJapgolly.writableConsumableStream.mod.^[_] = js.native
  var middlewareOutboundStream: typingsJapgolly.writableConsumableStream.mod.^[_] = js.native
  var outboundPacketStream: typingsJapgolly.writableConsumableStream.mod.^[_] = js.native
  var outboundPreparedMessageCount: Double = js.native
  var outboundSentMessageCount: Double = js.native
  var protocolVersion: Double = js.native
  var remoteAddress: String = js.native
  var remoteFamily: String = js.native
  var remotePort: Double = js.native
  var request: IncomingMessage = js.native
  var server: typingsJapgolly.socketclusterServer.serverMod.^ = js.native
  var signedAuthToken: js.UndefOr[String] = js.native
  var socket: typingsJapgolly.ws.mod.^ = js.native
  var state: connecting | open | closed = js.native
  def cancelBatch(): Unit = js.native
  def cancelBatching(): Unit = js.native
  def closeAllMiddlewares(): Unit = js.native
  def closeAllProcedures(): Unit = js.native
  def closeAllReceivers(): Unit = js.native
  def closeAllStreams(): Unit = js.native
  def closeIO(): Unit = js.native
  def closeInput(): Unit = js.native
  def closeOutput(): Unit = js.native
  def closeProcedure(procedureName: String): Unit = js.native
  def closeReceiver(receiverName: String): Unit = js.native
  def deauthenticate(): js.Promise[Unit] = js.native
  def deauthenticate(options: AnonRejectOnFailedDelivery): js.Promise[Unit] = js.native
  def deauthenticateSelf(): Unit = js.native
  def decode(message: js.Any): js.Any = js.native
  def disconnect(): Unit = js.native
  def disconnect(code: Double): Unit = js.native
  def disconnect(code: Double, reason: String): Unit = js.native
  def emitError(error: js.Error): Unit = js.native
  @JSName("emit")
  def emit_authStateChange(eventName: authStateChange): typingsJapgolly.consumableStream.mod.^[StateChangeData] = js.native
  @JSName("emit")
  def emit_authStateChange(eventName: authStateChange, data: StateChangeData): Unit = js.native
  @JSName("emit")
  def emit_authTokenSigned(eventName: authTokenSigned): typingsJapgolly.consumableStream.mod.^[AnonSignedAuthToken] = js.native
  @JSName("emit")
  def emit_authTokenSigned(eventName: authTokenSigned, data: AnonSignedAuthToken): Unit = js.native
  @JSName("emit")
  def emit_authenticate(eventName: authenticate): typingsJapgolly.consumableStream.mod.^[AuthenticateData] = js.native
  @JSName("emit")
  def emit_authenticate(eventName: authenticate, data: AuthenticateData): Unit = js.native
  @JSName("emit")
  def emit_badAuthToken(eventName: badAuthToken): typingsJapgolly.consumableStream.mod.^[BadAuthTokenData] = js.native
  @JSName("emit")
  def emit_badAuthToken(eventName: badAuthToken, data: BadAuthTokenData): Unit = js.native
  @JSName("emit")
  def emit_close(eventName: close): typingsJapgolly.consumableStream.mod.^[CloseData] = js.native
  @JSName("emit")
  def emit_close(eventName: close, data: CloseData): Unit = js.native
  @JSName("emit")
  def emit_connect(eventName: connect): typingsJapgolly.consumableStream.mod.^[ConnectData] = js.native
  @JSName("emit")
  def emit_connect(eventName: connect, data: ConnectData): Unit = js.native
  @JSName("emit")
  def emit_connectAbort(eventName: connectAbort): typingsJapgolly.consumableStream.mod.^[ConnectAbortData] = js.native
  @JSName("emit")
  def emit_connectAbort(eventName: connectAbort, data: ConnectAbortData): Unit = js.native
  @JSName("emit")
  def emit_deauthenticate(eventName: deauthenticate): typingsJapgolly.consumableStream.mod.^[DeauthenticateData] = js.native
  @JSName("emit")
  def emit_deauthenticate(eventName: deauthenticate, data: DeauthenticateData): Unit = js.native
  @JSName("emit")
  def emit_disconnect(eventName: disconnect): typingsJapgolly.consumableStream.mod.^[DisconnectData] = js.native
  @JSName("emit")
  def emit_disconnect(eventName: disconnect, data: DisconnectData): Unit = js.native
  @JSName("emit")
  def emit_error(eventName: error): typingsJapgolly.consumableStream.mod.^[AnonError] = js.native
  @JSName("emit")
  def emit_error(eventName: error, data: AnonError): Unit = js.native
  @JSName("emit")
  def emit_message(eventName: message): typingsJapgolly.consumableStream.mod.^[AnonMessage] = js.native
  @JSName("emit")
  def emit_message(eventName: message, data: AnonMessage): Unit = js.native
  @JSName("emit")
  def emit_raw(eventName: raw): typingsJapgolly.consumableStream.mod.^[AnonMessage] = js.native
  @JSName("emit")
  def emit_raw(eventName: raw, data: AnonMessage): Unit = js.native
  @JSName("emit")
  def emit_subscribe(eventName: subscribe): typingsJapgolly.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("emit")
  def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
  @JSName("emit")
  def emit_unsubscribe(eventName: unsubscribe): typingsJapgolly.consumableStream.mod.^[UnsubscribeData] = js.native
  @JSName("emit")
  def emit_unsubscribe(eventName: unsubscribe, data: UnsubscribeData): Unit = js.native
  def encode(`object`: js.Any): js.Any = js.native
  def flushBatch(): Unit = js.native
  def getAllProceduresBackpressure(): Double = js.native
  def getAllProceduresConsumerStatsList(): js.Array[ConsumerStats] = js.native
  def getAllReceiversBackpressure(): Double = js.native
  def getAllReceiversConsumerStatsList(): js.Array[ConsumerStats] = js.native
  def getAuthToken(): AuthToken = js.native
  def getBackpressure(): Double = js.native
  def getBytesReceived(): Double = js.native
  def getInboundBackpressure(): Double = js.native
  def getOutboundBackpressure(): Double = js.native
  def getProcedureBackpressure(procedureName: String): Double = js.native
  def getProcedureConsumerBackpressure(consumerId: Double): Double = js.native
  def getProcedureConsumerStats(consumerId: Double): ConsumerStats = js.native
  def getProcedureConsumerStatsList(procedureName: String): js.Array[ConsumerStats] = js.native
  def getReceiverBackpressure(receiverName: String): Double = js.native
  def getReceiverConsumerBackpressure(consumerId: Double): Double = js.native
  def getReceiverConsumerStats(consumerId: Double): ConsumerStats = js.native
  def getReceiverConsumerStatsList(receiverName: String): js.Array[ConsumerStats] = js.native
  def getState(): connecting | open | closed = js.native
  def hasAnyProcedureConsumer(consumerId: Double): Boolean = js.native
  def hasAnyReceiverConsumer(consumerId: Double): Boolean = js.native
  def hasProcedureConsumer(procedureName: String, consumerId: Double): Boolean = js.native
  def hasReceiverConsumer(receiverName: String, consumerId: Double): Boolean = js.native
  def invoke(event: String, data: js.Any, options: js.Any): js.Promise[_] = js.native
  def isAuthTokenExpired(token: AuthToken): Boolean = js.native
  def isSubscribed(channel: String): Boolean = js.native
  def kickOut(): js.Any = js.native
  def kickOut(channel: String): js.Any = js.native
  def kickOut(channel: String, message: String): js.Any = js.native
  def killAllMiddlewares(): Unit = js.native
  def killAllProcedures(): Unit = js.native
  def killAllReceivers(): Unit = js.native
  def killAllStreams(): Unit = js.native
  def killIO(): Unit = js.native
  def killInput(): Unit = js.native
  def killOutput(): Unit = js.native
  def killProcedure(procedureName: String): Unit = js.native
  def killProcedureConsumer(consumerId: Double): Unit = js.native
  def killReceiver(receiverName: String): Unit = js.native
  def killReceiverConsumer(consumerId: Double): Unit = js.native
  def procedure(procedureName: String): typingsJapgolly.streamDemux.demuxedConsumableStreamMod.^[_] = js.native
  def receiver(receiverName: String): typingsJapgolly.streamDemux.demuxedConsumableStreamMod.^[_] = js.native
  def send(data: js.Any, options: AnonBinary): Unit = js.native
  def sendObject(`object`: js.Any): Unit = js.native
  def serializeObject(`object`: js.Any): js.Any = js.native
  def setAuthToken(data: AuthToken): js.Promise[Unit] = js.native
  def setAuthToken(data: AuthToken, options: AuthTokenOptions): js.Promise[Unit] = js.native
  def startBatch(): Unit = js.native
  def startBatching(): Unit = js.native
  def stopBatching(): Unit = js.native
  def subscriptions(): js.Array[String] = js.native
  def terminate(): Unit = js.native
  def transmit(event: String, data: js.Any, options: js.Any): js.Promise[Unit] = js.native
  @JSName("triggerAuthenticationEvents")
  def triggerAuthenticationEvents_authenticated(oldAuthState: authenticated): Unit = js.native
  @JSName("triggerAuthenticationEvents")
  def triggerAuthenticationEvents_unauthenticated(oldAuthState: unauthenticated): Unit = js.native
}

