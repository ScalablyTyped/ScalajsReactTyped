package typingsJapgolly.socketclusterServer.serverMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.agSimpleBroker.mod.SimpleExchange
import typingsJapgolly.jsonwebtoken.mod.Secret
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.socketclusterServer.anon.Algorithm
import typingsJapgolly.socketclusterServer.anon.Algorithms
import typingsJapgolly.socketclusterServer.anon.Error
import typingsJapgolly.socketclusterServer.anon.Socket
import typingsJapgolly.socketclusterServer.anon.Warning
import typingsJapgolly.socketclusterServer.socketclusterServerInts.`1`
import typingsJapgolly.socketclusterServer.socketclusterServerInts.`2`
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
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.subscription
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.unsubscription
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.warning
import typingsJapgolly.ws.anon.Origin
import typingsJapgolly.ws.mod.VerifyClientCallbackAsync
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AGServer
  extends typingsJapgolly.asyncStreamEmitter.mod.^[Any] {
  
  val MIDDLEWARE_HANDSHAKE: /* "handshake" */ String = js.native
  
  val MIDDLEWARE_INBOUND: /* "inbound" */ String = js.native
  
  val MIDDLEWARE_INBOUND_RAW: /* "inboundRaw" */ String = js.native
  
  val MIDDLEWARE_OUTBOUND: /* "outbound" */ String = js.native
  
  val SYMBOL_MIDDLEWARE_HANDSHAKE_STREAM: js.Symbol = js.native
  
  var ackTimeout: Double = js.native
  
  var allowClientPublish: Boolean = js.native
  
  var auth: AuthEngineType = js.native
  
  var brokerEngine: typingsJapgolly.agSimpleBroker.mod.^ = js.native
  
  var clients: StringDictionary[typingsJapgolly.socketclusterServer.serversocketMod.^] = js.native
  
  var clientsCount: Double = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  var codec: CodecEngine = js.native
  
  var defaultSignatureOptions: Algorithm = js.native
  
  var defaultVerificationOptions: Algorithms = js.native
  
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
  def emit_error(eventName: error, data: Error): Unit = js.native
  @JSName("emit")
  def emit_handshake(eventName: handshake, data: Socket): Unit = js.native
  @JSName("emit")
  def emit_subscription(eventName: subscription, data: SubscriptionData): Unit = js.native
  @JSName("emit")
  def emit_unsubscription(eventName: unsubscription, data: UnsubscriptionData): Unit = js.native
  @JSName("emit")
  def emit_warning(eventName: warning, data: Warning): Unit = js.native
  
  var exchange: SimpleExchange = js.native
  
  def generateId(): String = js.native
  
  def getPath(): String = js.native
  
  var handshakeTimeout: Double = js.native
  
  def hasMiddleware(`type`: Middlewares): Boolean = js.native
  
  var httpServer: Server[
    Instantiable1[/* socket */ typingsJapgolly.node.nodeColonnetMod.Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  
  var isReady: Boolean = js.native
  
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
  def listener_error(eventName: error): typingsJapgolly.consumableStream.mod.^[Error] = js.native
  @JSName("listener")
  def listener_handshake(eventName: handshake): typingsJapgolly.consumableStream.mod.^[Socket] = js.native
  @JSName("listener")
  def listener_subscription(eventName: subscription): typingsJapgolly.consumableStream.mod.^[SubscriptionData] = js.native
  @JSName("listener")
  def listener_unsubscription(eventName: unsubscription): typingsJapgolly.consumableStream.mod.^[UnsubscriptionData] = js.native
  @JSName("listener")
  def listener_warning(eventName: warning): typingsJapgolly.consumableStream.mod.^[Warning] = js.native
  
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
  
  def removeMiddleware(`type`: Middlewares): Unit = js.native
  
  def setAuthEngine(authEngine: AuthEngineType): Unit = js.native
  
  def setCodecEngine(codecEngine: CodecEngine): Unit = js.native
  
  def setMiddleware(
    `type`: /* "handshake" */ /* "inboundRaw" */ /* "inbound" */ /* "outbound" */ String,
    middleware: handshakeMiddlewareFunction | inboundMiddlewareFunction | inboundRawMiddlewareFunction | outboundMiddlewareFunction
  ): Unit = js.native
  
  var signatureKey: js.UndefOr[Secret] = js.native
  
  var socketChannelLimit: js.UndefOr[Double] = js.native
  
  var strictHandshake: Boolean = js.native
  
  var verificationKey: js.UndefOr[Secret] = js.native
  
  def verifyHandshake(
    info: Origin,
    callback: js.Function4[
      /* res */ Boolean, 
      /* code */ js.UndefOr[Double], 
      /* message */ js.UndefOr[String], 
      /* headers */ js.UndefOr[OutgoingHttpHeaders], 
      Unit
    ]
  ): Unit = js.native
  @JSName("verifyHandshake")
  var verifyHandshake_Original: VerifyClientCallbackAsync = js.native
  
  var wsServer: typingsJapgolly.ws.mod.Server[WebSocket] = js.native
}
