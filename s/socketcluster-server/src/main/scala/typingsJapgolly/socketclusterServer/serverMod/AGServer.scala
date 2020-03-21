package typingsJapgolly.socketclusterServer.serverMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.asyncStreamEmitter.mod.AsyncStreamEmitter
import typingsJapgolly.jsonwebtoken.mod.Secret
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.scAuth.mod.SCAuthEngine
import typingsJapgolly.socketclusterServer.AnonAlgorithm
import typingsJapgolly.socketclusterServer.AnonAlgorithms
import typingsJapgolly.socketclusterServer.AnonError
import typingsJapgolly.socketclusterServer.AnonSocket
import typingsJapgolly.socketclusterServer.AnonWarning
import typingsJapgolly.socketclusterServer.socketclusterServerNumbers.`1`
import typingsJapgolly.socketclusterServer.socketclusterServerNumbers.`2`
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.authentication
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.authenticationStateChange
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.badSocketAuthToken
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.closure
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.connection
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.connectionAbort
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.deauthentication
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.disconnection
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.error
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.handshake
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.inbound
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.inboundRaw
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.outbound
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.subscription
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.unsubscription
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.warning
import typingsJapgolly.ws.AnonOrigin
import typingsJapgolly.ws.mod.VerifyClientCallbackAsync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AGServer
  extends AsyncStreamEmitter[js.Any] {
  val MIDDLEWARE_HANDSHAKE: handshake = js.native
  val MIDDLEWARE_INBOUND: inbound = js.native
  val MIDDLEWARE_INBOUND_RAW: inboundRaw = js.native
  val MIDDLEWARE_OUTBOUND: outbound = js.native
  val SYMBOL_MIDDLEWARE_HANDSHAKE_STREAM: js.Symbol = js.native
  var ackTimeout: Double = js.native
  var allowClientPublish: Boolean = js.native
  var auth: SCAuthEngine = js.native
  var brokerEngine: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AGSimpleBroker */ js.Any = js.native
  var clients: StringDictionary[typingsJapgolly.socketclusterServer.serversocketMod.^] = js.native
  var clientsCount: Double = js.native
  var codec: CodecEngine = js.native
  var defaultSignatureOptions: AnonAlgorithm = js.native
  var defaultVerificationOptions: AnonAlgorithms = js.native
  var exchange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AGSimpleBroker.SimpleExchange */ js.Any = js.native
  var handshakeTimeout: Double = js.native
  var httpServer: Server = js.native
  var isReady: Boolean = js.native
  var middlewareEmitFailures: Boolean = js.native
  var options: AGServerOptions = js.native
  var origins: String = js.native
  var pendingClients: StringDictionary[typingsJapgolly.socketclusterServer.serversocketMod.^] = js.native
  var pendingClientsCount: Double = js.native
  var perMessageDeflate: js.UndefOr[Boolean | js.Object] = js.native
  var pingInterval: Double = js.native
  var pingTimeout: Double = js.native
  var pingTimeoutDisabled: Boolean = js.native
  var protocolVersion: `1` | `2` = js.native
  var signatureKey: js.UndefOr[Secret] = js.native
  var socketChannelLimit: js.UndefOr[Double] = js.native
  var strictHandshake: Boolean = js.native
  var verificationKey: js.UndefOr[Secret] = js.native
  @JSName("verifyHandshake")
  var verifyHandshake_Original: VerifyClientCallbackAsync = js.native
  var wsServer: typingsJapgolly.ws.mod.Server = js.native
  def close(): js.Promise[Unit] = js.native
  def emitError(error: js.Error): Unit = js.native
  def emitWarning(warning: js.Error): Unit = js.native
  @JSName("emit")
  def emit_authentication(eventName: authentication, data: AuthenticationData): Unit = js.native
  @JSName("emit")
  def emit_authenticationStateChange(eventName: authenticationStateChange, data: AuthStateChangeData): Unit = js.native
  @JSName("emit")
  def emit_badSocketAuthToken(eventName: badSocketAuthToken, data: BadSocketAuthTokenData): Unit = js.native
  @JSName("emit")
  def emit_closure(eventName: closure, data: ClosureData): Unit = js.native
  @JSName("emit")
  def emit_connection(eventName: connection, data: ConnectionData): Unit = js.native
  @JSName("emit")
  def emit_connectionAbort(eventName: connectionAbort, data: ConnectionAbortData): Unit = js.native
  @JSName("emit")
  def emit_deauthentication(eventName: deauthentication, data: DeauthenticationData): Unit = js.native
  @JSName("emit")
  def emit_disconnection(eventName: disconnection, data: DisconnectionData): Unit = js.native
  @JSName("emit")
  def emit_error(eventName: error, data: AnonError): Unit = js.native
  @JSName("emit")
  def emit_handshake(eventName: handshake, data: AnonSocket): Unit = js.native
  @JSName("emit")
  def emit_subscription(eventName: subscription, data: SubscriptionData): Unit = js.native
  @JSName("emit")
  def emit_unsubscription(eventName: unsubscription, data: UnsubscriptionData): Unit = js.native
  @JSName("emit")
  def emit_warning(eventName: warning, data: AnonWarning): Unit = js.native
  def generateId(): String = js.native
  def getPath(): String = js.native
  def hasMiddleware(`type`: Middlewares): Boolean = js.native
  @JSName("listener")
  def listener_authentication(eventName: authentication): typingsJapgolly.consumableStream.mod.^[AuthenticationData] = js.native
  @JSName("listener")
  def listener_authenticationStateChange(eventName: authenticationStateChange): typingsJapgolly.consumableStream.mod.^[AuthStateChangeData] = js.native
  @JSName("listener")
  def listener_badSocketAuthToken(eventName: badSocketAuthToken): typingsJapgolly.consumableStream.mod.^[BadSocketAuthTokenData] = js.native
  @JSName("listener")
  def listener_closure(eventName: closure): typingsJapgolly.consumableStream.mod.^[ClosureData] = js.native
  @JSName("listener")
  def listener_connection(eventName: connection): typingsJapgolly.consumableStream.mod.^[ConnectionData] = js.native
  @JSName("listener")
  def listener_connectionAbort(eventName: connectionAbort): typingsJapgolly.consumableStream.mod.^[ConnectionAbortData] = js.native
  @JSName("listener")
  def listener_deauthentication(eventName: deauthentication): typingsJapgolly.consumableStream.mod.^[DeauthenticationData] = js.native
  @JSName("listener")
  def listener_disconnection(eventName: disconnection): typingsJapgolly.consumableStream.mod.^[DisconnectionData] = js.native
  @JSName("listener")
  def listener_error(eventName: error): typingsJapgolly.consumableStream.mod.^[AnonError] = js.native
  @JSName("listener")
  def listener_handshake(eventName: handshake): typingsJapgolly.consumableStream.mod.^[AnonSocket] = js.native
  @JSName("listener")
  def listener_subscription(eventName: subscription): typingsJapgolly.consumableStream.mod.^[SubscriptionData] = js.native
  @JSName("listener")
  def listener_unsubscription(eventName: unsubscription): typingsJapgolly.consumableStream.mod.^[UnsubscriptionData] = js.native
  @JSName("listener")
  def listener_warning(eventName: warning): typingsJapgolly.consumableStream.mod.^[AnonWarning] = js.native
  def removeMiddleware(`type`: Middlewares): Unit = js.native
  def setAuthEngine(authEngine: SCAuthEngine): Unit = js.native
  def setCodecEngine(codecEngine: CodecEngine): Unit = js.native
  @JSName("setMiddleware")
  def setMiddleware_handshake(`type`: handshake, middleware: handshakeMiddlewareFunction): Unit = js.native
  @JSName("setMiddleware")
  def setMiddleware_inbound(`type`: inbound, middleware: inboundMiddlewareFunction): Unit = js.native
  @JSName("setMiddleware")
  def setMiddleware_inboundRaw(`type`: inboundRaw, middleware: inboundRawMiddlewareFunction): Unit = js.native
  @JSName("setMiddleware")
  def setMiddleware_outbound(`type`: outbound, middleware: outboundMiddlewareFunction): Unit = js.native
  def verifyHandshake(
    info: AnonOrigin,
    callback: js.Function4[
      /* res */ Boolean, 
      /* code */ js.UndefOr[Double], 
      /* message */ js.UndefOr[String], 
      /* headers */ js.UndefOr[OutgoingHttpHeaders], 
      Unit
    ]
  ): Unit = js.native
}

