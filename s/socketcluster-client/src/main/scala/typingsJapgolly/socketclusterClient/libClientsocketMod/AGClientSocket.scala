package typingsJapgolly.socketclusterClient.libClientsocketMod

import typingsJapgolly.agChannel.mod.Client
import typingsJapgolly.scErrors.mod.SocketProtocolErrorStatuses_
import typingsJapgolly.scErrors.mod.SocketProtocolIgnoreStatuses_
import typingsJapgolly.socketclusterClient.anon.AckTimeout
import typingsJapgolly.socketclusterClient.anon.Error
import typingsJapgolly.socketclusterClient.anon.OldAuthToken
import typingsJapgolly.socketclusterClient.libAuthMod.AGAuthEngine
import typingsJapgolly.socketclusterClient.libAuthMod.AuthToken
import typingsJapgolly.socketclusterClient.libAuthMod.SignedAuthToken
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.authStateChange
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.authenticate
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.authenticated
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.close
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.closed
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.connect
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.connectAbort
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.connecting
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.deauthenticate
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.disconnect
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.error
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.kickOut
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.open
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.pending
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.removeAuthToken
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.subscribe
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.subscribeFail
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.subscribeRequest
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.subscribeStateChange
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.subscribed
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.unauthenticated
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.unsubscribe
import typingsJapgolly.socketclusterClient.socketclusterClientStrings.unsubscribed
import typingsJapgolly.socketclusterServer.serverMod.CodecEngine
import typingsJapgolly.writableConsumableStream.consumerMod.ConsumerStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AGClientSocket
  extends typingsJapgolly.asyncStreamEmitter.mod.^[Any]
     with Client {
  
  val AUTHENTICATED: authenticated = js.native
  
  val CLOSED: closed = js.native
  
  val CONNECTING: connecting = js.native
  
  val OPEN: open = js.native
  
  val PENDING: pending = js.native
  
  val SUBSCRIBED: subscribed = js.native
  
  val UNAUTHENTICATED: unauthenticated = js.native
  
  val UNSUBSCRIBED: unsubscribed = js.native
  
  var ackTimeout: Double = js.native
  
  var auth: AGAuthEngine = js.native
  
  var authState: AuthStates = js.native
  
  var authToken: AuthToken | Null = js.native
  
  var authTokenName: String = js.native
  
  // Perform client-initiated authentication by providing an encrypted token string.
  def authenticate(signedAuthToken: String): js.Promise[AuthStatus] = js.native
  
  var batchOnHandshake: Boolean = js.native
  
  var batchOnHandshakeDuration: Double = js.native
  
  def cancelBatch(): Unit = js.native
  
  def cancelBatching(): Unit = js.native
  
  // ---- Channel logic ----
  def channel(channelName: String): typingsJapgolly.agChannel.mod.^[Any] = js.native
  
  var channelPrefix: String | Null = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  def closeAllChannelListeners(): Unit = js.native
  
  def closeAllChannelOutputs(): Unit = js.native
  
  def closeAllChannels(): Unit = js.native
  
  /* CompleteClass */
  /* InferMemberOverrides */
  override def closeAllListeners(): Unit = js.native
  
  def closeAllProcedures(): Unit = js.native
  
  def closeAllReceivers(): Unit = js.native
  
  /* CompleteClass */
  /* InferMemberOverrides */
  override def closeListener(eventName: String): Unit = js.native
  
  def closeProcedure(procedureName: String): Unit = js.native
  
  def closeReceiver(receiverName: String): Unit = js.native
  
  var codec: CodecEngine = js.native
  
  def connect(): Unit = js.native
  
  var connectAttempts: Double = js.native
  
  var connectTimeout: Double = js.native
  
  def deauthenticate(): js.Promise[Unit] = js.native
  
  def decode(message: Any): Any = js.native
  
  def decodeBase64(encodedString: String): String = js.native
  
  def disconnect(): Unit = js.native
  def disconnect(code: Double): Unit = js.native
  def disconnect(code: Double, reason: String): Unit = js.native
  def disconnect(code: Unit, reason: String): Unit = js.native
  
  var disconnectOnUnload: Boolean = js.native
  
  def emit(eventName: connectAbort | disconnect | close, data: CloseData): Unit = js.native
  def emit(eventName: subscribe | subscribeRequest, data: SubscribeData): Unit = js.native
  /* CompleteClass */
  /* InferMemberOverrides */
  override def emit(eventName: String, data: Any): Unit = js.native
  @JSName("emit")
  def emit_authStateChange(eventName: authStateChange, data: AuthStateChangeData): Unit = js.native
  @JSName("emit")
  def emit_authenticate(eventName: authenticate, data: AuthenticateData): Unit = js.native
  @JSName("emit")
  def emit_connect(eventName: connect, data: ConnectData): Unit = js.native
  @JSName("emit")
  def emit_connecting(eventName: connecting, data: js.Object): Unit = js.native
  @JSName("emit")
  def emit_deauthenticate(eventName: deauthenticate, data: DeauthenticateData): Unit = js.native
  @JSName("emit")
  def emit_error(eventName: error, data: Error): Unit = js.native
  @JSName("emit")
  def emit_kickOut(eventName: kickOut, data: KickOutData): Unit = js.native
  @JSName("emit")
  def emit_removeAuthToken(eventName: removeAuthToken, data: OldAuthToken): Unit = js.native
  @JSName("emit")
  def emit_subscribeFail(eventName: subscribeFail, data: SubscribeFailData): Unit = js.native
  @JSName("emit")
  def emit_subscribeStateChange(eventName: subscribeStateChange, data: SubscribeStateChangeData): Unit = js.native
  @JSName("emit")
  def emit_unsubscribe(eventName: unsubscribe, data: UnsubscribeData): Unit = js.native
  
  def encode(`object`: Any): Any = js.native
  
  def encodeBase64(decodedString: String): String = js.native
  
  val errorStatuses: SocketProtocolErrorStatuses_ = js.native
  
  def flushBatch(): Unit = js.native
  
  def getAllChannelListenersBackpressure(): Double = js.native
  
  def getAllChannelListenersConsumerStatsList(): js.Array[Any] = js.native
  
  def getAllChannelOutputsBackpressure(): Double = js.native
  
  def getAllChannelOutputsConsumerStatsList(): js.Array[Any] = js.native
  
  def getAllChannelsBackpressure(): Double = js.native
  
  /* CompleteClass */
  /* InferMemberOverrides */
  override def getAllListenersBackpressure(): Double = js.native
  
  /* CompleteClass */
  /* InferMemberOverrides */
  override def getAllListenersConsumerStatsList(): js.Array[ConsumerStats] = js.native
  
  def getAllProceduresBackpressure(): Double = js.native
  
  def getAllProceduresConsumerStatsList(): js.Array[ConsumerStats] = js.native
  
  def getAllReceiversBackpressure(): Double = js.native
  
  def getAllReceiversConsumerStatsList(): js.Array[ConsumerStats] = js.native
  
  def getAuthToken(): AuthToken | Null = js.native
  
  /* AGChannel.Client end */
  def getBackpressure(): Double = js.native
  
  def getBytesReceived(): Double = js.native
  
  /* CompleteClass */
  /* InferMemberOverrides */
  override def getListenerBackpressure(eventName: String): Double = js.native
  
  /* CompleteClass */
  /* InferMemberOverrides */
  override def getListenerConsumerBackpressure(consumerId: Double): Double = js.native
  
  /* CompleteClass */
  /* InferMemberOverrides */
  override def getListenerConsumerStats(consumerId: Double): ConsumerStats = js.native
  
  /* CompleteClass */
  /* InferMemberOverrides */
  override def getListenerConsumerStatsList(eventName: String): js.Array[ConsumerStats] = js.native
  
  def getProcedureBackpressure(procedureName: String): Double = js.native
  
  def getProcedureConsumerBackpressure(consumerId: Double): Double = js.native
  
  def getProcedureConsumerStats(consumerId: Double): ConsumerStats = js.native
  
  def getProcedureConsumerStatsList(procedureName: String): js.Array[ConsumerStats] = js.native
  
  def getReceiverBackpressure(receiverName: String): Double = js.native
  
  def getReceiverConsumerBackpressure(consumerId: Double): Double = js.native
  
  def getReceiverConsumerStats(consumerId: Double): ConsumerStats = js.native
  
  def getReceiverConsumerStatsList(receiverName: String): js.Array[ConsumerStats] = js.native
  
  def getSignedAuthToken(): SignedAuthToken | Null = js.native
  
  def getState(): States = js.native
  
  def hasAnyChannelListenerConsumer(consumerId: Any): Boolean = js.native
  
  def hasAnyChannelOutputConsumer(consumerId: Any): Boolean = js.native
  
  /* CompleteClass */
  /* InferMemberOverrides */
  override def hasAnyListenerConsumer(consumerId: Double): Boolean = js.native
  
  def hasAnyProcedureConsumer(consumerId: Double): Boolean = js.native
  
  def hasAnyReceiverConsumer(consumerId: Double): Boolean = js.native
  
  /* CompleteClass */
  /* InferMemberOverrides */
  override def hasListenerConsumer(eventName: String, consumerId: Double): Boolean = js.native
  
  def hasProcedureConsumer(procedureName: String, consumerId: Double): Boolean = js.native
  
  def hasReceiverConsumer(receiverName: String, consumerId: Double): Boolean = js.native
  
  var id: String | Null = js.native
  
  val ignoreStatuses: SocketProtocolIgnoreStatuses_ = js.native
  
  def invoke(event: String, data: Any): js.Promise[Any] = js.native
  def invoke(event: String, data: Any, options: AckTimeout): js.Promise[Any] = js.native
  
  var isBatching: Boolean = js.native
  
  var isBufferingBatch: Boolean = js.native
  
  def killAllChannelListeners(): Unit = js.native
  
  def killAllChannelOutputs(): Unit = js.native
  
  def killAllChannels(): Unit = js.native
  
  /* CompleteClass */
  /* InferMemberOverrides */
  override def killAllListeners(): Unit = js.native
  
  def killAllProcedures(): Unit = js.native
  
  def killAllReceivers(): Unit = js.native
  
  /* CompleteClass */
  /* InferMemberOverrides */
  override def killListener(eventName: String): Unit = js.native
  
  /* CompleteClass */
  /* InferMemberOverrides */
  override def killListenerConsumer(consumerId: Double): Unit = js.native
  
  def killProcedure(procedureName: String): Unit = js.native
  
  def killProcedureConsumer(consumerId: Double): Unit = js.native
  
  def killReceiver(receiverName: String): Unit = js.native
  
  def killReceiverConsumer(consumerId: Double): Unit = js.native
  
  def listener(eventName: close | connectAbort | disconnect | subscribe | subscribeRequest): typingsJapgolly.consumableStream.mod.^[CloseData] = js.native
  /* CompleteClass */
  /* InferMemberOverrides */
  override def listener(eventName: String): typingsJapgolly.consumableStream.mod.^[Any] = js.native
  @JSName("listener")
  def listener_authStateChange(eventName: authStateChange): typingsJapgolly.consumableStream.mod.^[AuthStateChangeData] = js.native
  @JSName("listener")
  def listener_authenticate(eventName: authenticate): typingsJapgolly.consumableStream.mod.^[AuthenticateData] = js.native
  @JSName("listener")
  def listener_connect(eventName: connect): typingsJapgolly.consumableStream.mod.^[ConnectData] = js.native
  @JSName("listener")
  def listener_connecting(eventName: connecting): typingsJapgolly.consumableStream.mod.^[js.Object] = js.native
  @JSName("listener")
  def listener_deauthenticate(eventName: deauthenticate): typingsJapgolly.consumableStream.mod.^[DeauthenticateData] = js.native
  @JSName("listener")
  def listener_error(eventName: error): typingsJapgolly.consumableStream.mod.^[Error] = js.native
  @JSName("listener")
  def listener_kickOut(eventName: kickOut): typingsJapgolly.consumableStream.mod.^[KickOutData] = js.native
  @JSName("listener")
  def listener_removeAuthToken(eventName: removeAuthToken): typingsJapgolly.consumableStream.mod.^[OldAuthToken] = js.native
  @JSName("listener")
  def listener_subscribeFail(eventName: subscribeFail): typingsJapgolly.consumableStream.mod.^[SubscribeFailData] = js.native
  @JSName("listener")
  def listener_subscribeStateChange(eventName: subscribeStateChange): typingsJapgolly.consumableStream.mod.^[SubscribeStateChangeData] = js.native
  @JSName("listener")
  def listener_unsubscribe(eventName: unsubscribe): typingsJapgolly.consumableStream.mod.^[UnsubscribeData] = js.native
  
  var options: ClientOptions = js.native
  
  var pendingReconnect: Boolean = js.native
  
  var pendingReconnectTimeout: Double = js.native
  
  var pingTimeout: Double = js.native
  
  var pingTimeoutDisabled: Boolean = js.native
  
  var poolIndex: js.UndefOr[Double] = js.native
  
  var preparingPendingSubscriptions: Boolean = js.native
  
  // ---- Procedure logic ----
  def procedure(procedureName: String): typingsJapgolly.streamDemux.demuxedConsumableStreamMod.^[Any] = js.native
  
  def processPendingSubscriptions(): Unit = js.native
  
  var protocolVersion: ProtocolVersions = js.native
  
  // ---- Receiver logic ----
  def receiver(receiverName: String): typingsJapgolly.streamDemux.demuxedConsumableStreamMod.^[Any] = js.native
  
  def reconnect(): Unit = js.native
  def reconnect(code: Double): Unit = js.native
  def reconnect(code: Double, reason: String): Unit = js.native
  def reconnect(code: Unit, reason: String): Unit = js.native
  
  def send(data: Any): Unit = js.native
  
  var signedAuthToken: SignedAuthToken | Null = js.native
  
  def startBatch(): Unit = js.native
  
  def startBatching(): Unit = js.native
  
  var state: States = js.native
  
  def stopBatching(): Unit = js.native
  
  def subscribe(channelName: String, options: SubscribeOptions): typingsJapgolly.agChannel.mod.^[Any] = js.native
  
  // ---- Subscriptions ----
  def subscriptions(): js.Array[String] = js.native
  def subscriptions(includePending: Boolean): js.Array[String] = js.native
  
  def transmit(event: String, data: Any): js.Promise[Unit] = js.native
  def transmit(event: String, data: Any, options: AckTimeout): js.Promise[Unit] = js.native
  
  var transport: js.UndefOr[typingsJapgolly.socketclusterClient.libTransportMod.^] = js.native
  
  var version: String | Null = js.native
  
  var wsOptions: js.UndefOr[typingsJapgolly.ws.mod.ClientOptions] = js.native
}
