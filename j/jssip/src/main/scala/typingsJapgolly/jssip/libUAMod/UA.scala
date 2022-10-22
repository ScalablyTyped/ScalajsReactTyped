package typingsJapgolly.jssip.libUAMod

import typingsJapgolly.events.mod.EventEmitter
import typingsJapgolly.jssip.jssipStrings.authorization_jwt
import typingsJapgolly.jssip.jssipStrings.authorization_user
import typingsJapgolly.jssip.jssipStrings.connected
import typingsJapgolly.jssip.jssipStrings.connecting
import typingsJapgolly.jssip.jssipStrings.connection_recovery_max_interval
import typingsJapgolly.jssip.jssipStrings.connection_recovery_min_interval
import typingsJapgolly.jssip.jssipStrings.contact_uri
import typingsJapgolly.jssip.jssipStrings.disconnected
import typingsJapgolly.jssip.jssipStrings.display_name
import typingsJapgolly.jssip.jssipStrings.ha1
import typingsJapgolly.jssip.jssipStrings.instance_id
import typingsJapgolly.jssip.jssipStrings.newMessage
import typingsJapgolly.jssip.jssipStrings.newRTCSession
import typingsJapgolly.jssip.jssipStrings.no_answer_timeout
import typingsJapgolly.jssip.jssipStrings.password
import typingsJapgolly.jssip.jssipStrings.realm
import typingsJapgolly.jssip.jssipStrings.register
import typingsJapgolly.jssip.jssipStrings.register_expires
import typingsJapgolly.jssip.jssipStrings.registered
import typingsJapgolly.jssip.jssipStrings.registrar_server
import typingsJapgolly.jssip.jssipStrings.registrationExpiring
import typingsJapgolly.jssip.jssipStrings.registrationFailed
import typingsJapgolly.jssip.jssipStrings.session_timers
import typingsJapgolly.jssip.jssipStrings.session_timers_force_refresher
import typingsJapgolly.jssip.jssipStrings.session_timers_refresh_method
import typingsJapgolly.jssip.jssipStrings.sipEvent
import typingsJapgolly.jssip.jssipStrings.sockets
import typingsJapgolly.jssip.jssipStrings.unregistered
import typingsJapgolly.jssip.jssipStrings.uri
import typingsJapgolly.jssip.jssipStrings.use_preloaded_route
import typingsJapgolly.jssip.jssipStrings.user_agent
import typingsJapgolly.jssip.libMessageMod.Message
import typingsJapgolly.jssip.libMessageMod.SendMessageOptions
import typingsJapgolly.jssip.libRegistratorMod.Registrator
import typingsJapgolly.jssip.libRtcsessionMod.AnyListener
import typingsJapgolly.jssip.libRtcsessionMod.RTCSession
import typingsJapgolly.jssip.libRtcsessionMod.TerminateOptions
import typingsJapgolly.jssip.libUriMod.URI
import typingsJapgolly.jssip.libWebSocketInterfaceMod.Socket
import typingsJapgolly.jssip.libWebSocketInterfaceMod.WeightedSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jssip/lib/UA", "UA")
@js.native
open class UA protected () extends EventEmitter {
  def this(configuration: UAConfiguration) = this()
  
  def C: Any = js.native
  
  def call(target: String): RTCSession = js.native
  def call(target: String, options: CallOptions): RTCSession = js.native
  
  def contact: UAContact = js.native
  
  @JSName("get")
  def get_authorizationjwt(parameter: authorization_jwt): js.UndefOr[String] = js.native
  @JSName("get")
  def get_authorizationuser(parameter: authorization_user): js.UndefOr[String] = js.native
  @JSName("get")
  def get_connectionrecoverymaxinterval(parameter: connection_recovery_max_interval): js.UndefOr[Double] = js.native
  @JSName("get")
  def get_connectionrecoverymininterval(parameter: connection_recovery_min_interval): js.UndefOr[Double] = js.native
  @JSName("get")
  def get_contacturi(parameter: contact_uri): js.UndefOr[String] = js.native
  @JSName("get")
  def get_displayname(parameter: display_name): js.UndefOr[String] = js.native
  @JSName("get")
  def get_ha1(parameter: ha1): js.UndefOr[String] = js.native
  @JSName("get")
  def get_instanceid(parameter: instance_id): js.UndefOr[String] = js.native
  @JSName("get")
  def get_noanswertimeout(parameter: no_answer_timeout): js.UndefOr[Double] = js.native
  @JSName("get")
  def get_password(parameter: password): js.UndefOr[String] = js.native
  @JSName("get")
  def get_realm(parameter: realm): js.UndefOr[String] = js.native
  @JSName("get")
  def get_register(parameter: register): js.UndefOr[Boolean] = js.native
  @JSName("get")
  def get_registerexpires(parameter: register_expires): js.UndefOr[Double] = js.native
  @JSName("get")
  def get_registrarserver(parameter: registrar_server): js.UndefOr[String] = js.native
  @JSName("get")
  def get_sessiontimers(parameter: session_timers): js.UndefOr[Boolean] = js.native
  @JSName("get")
  def get_sessiontimersforcerefresher(parameter: session_timers_force_refresher): js.UndefOr[Boolean] = js.native
  @JSName("get")
  def get_sessiontimersrefreshmethod(parameter: session_timers_refresh_method): js.UndefOr[String] = js.native
  @JSName("get")
  def get_sockets(parameter: sockets): Socket | (js.Array[Socket | WeightedSocket]) = js.native
  @JSName("get")
  def get_uri(parameter: uri): String = js.native
  @JSName("get")
  def get_usepreloadedroute(parameter: use_preloaded_route): js.UndefOr[Boolean] = js.native
  @JSName("get")
  def get_useragent(parameter: user_agent): js.UndefOr[String] = js.native
  
  def isConnected(): Boolean = js.native
  
  def isRegistered(): Boolean = js.native
  
  @JSName("on")
  def on_connected(`type`: connected, listener: ConnectedListener): this.type = js.native
  @JSName("on")
  def on_connecting(`type`: connecting, listener: UAConnectingListener): this.type = js.native
  @JSName("on")
  def on_disconnected(`type`: disconnected, listener: DisconnectedListener): this.type = js.native
  @JSName("on")
  def on_newMessage(`type`: newMessage, listener: MessageListener): this.type = js.native
  @JSName("on")
  def on_newRTCSession(`type`: newRTCSession, listener: RTCSessionListener): this.type = js.native
  @JSName("on")
  def on_registered(`type`: registered, listener: RegisteredListener): this.type = js.native
  @JSName("on")
  def on_registrationExpiring(`type`: registrationExpiring, listener: AnyListener): this.type = js.native
  @JSName("on")
  def on_registrationFailed(`type`: registrationFailed, listener: RegistrationFailedListener): this.type = js.native
  @JSName("on")
  def on_sipEvent(`type`: sipEvent, listener: SipEventListener): this.type = js.native
  @JSName("on")
  def on_unregistered(`type`: unregistered, listener: UnRegisteredListener): this.type = js.native
  
  def register(): Unit = js.native
  
  def registrator(): Registrator = js.native
  
  def sendMessage(target: String, body: String): Message = js.native
  def sendMessage(target: String, body: String, options: SendMessageOptions): Message = js.native
  def sendMessage(target: URI, body: String): Message = js.native
  def sendMessage(target: URI, body: String, options: SendMessageOptions): Message = js.native
  
  @JSName("set")
  def set_authorizationjwt(parameter: authorization_jwt): Boolean = js.native
  @JSName("set")
  def set_authorizationjwt(parameter: authorization_jwt, value: String): Boolean = js.native
  @JSName("set")
  def set_authorizationuser(parameter: authorization_user): Boolean = js.native
  @JSName("set")
  def set_authorizationuser(parameter: authorization_user, value: String): Boolean = js.native
  @JSName("set")
  def set_connectionrecoverymaxinterval(parameter: connection_recovery_max_interval): Boolean = js.native
  @JSName("set")
  def set_connectionrecoverymaxinterval(parameter: connection_recovery_max_interval, value: Double): Boolean = js.native
  @JSName("set")
  def set_connectionrecoverymininterval(parameter: connection_recovery_min_interval): Boolean = js.native
  @JSName("set")
  def set_connectionrecoverymininterval(parameter: connection_recovery_min_interval, value: Double): Boolean = js.native
  @JSName("set")
  def set_contacturi(parameter: contact_uri): Boolean = js.native
  @JSName("set")
  def set_contacturi(parameter: contact_uri, value: String): Boolean = js.native
  @JSName("set")
  def set_displayname(parameter: display_name): Boolean = js.native
  @JSName("set")
  def set_displayname(parameter: display_name, value: String): Boolean = js.native
  @JSName("set")
  def set_ha1(parameter: ha1): Boolean = js.native
  @JSName("set")
  def set_ha1(parameter: ha1, value: String): Boolean = js.native
  @JSName("set")
  def set_instanceid(parameter: instance_id): Boolean = js.native
  @JSName("set")
  def set_instanceid(parameter: instance_id, value: String): Boolean = js.native
  @JSName("set")
  def set_noanswertimeout(parameter: no_answer_timeout): Boolean = js.native
  @JSName("set")
  def set_noanswertimeout(parameter: no_answer_timeout, value: Double): Boolean = js.native
  @JSName("set")
  def set_password(parameter: password): Boolean = js.native
  @JSName("set")
  def set_password(parameter: password, value: String): Boolean = js.native
  @JSName("set")
  def set_realm(parameter: realm): Boolean = js.native
  @JSName("set")
  def set_realm(parameter: realm, value: String): Boolean = js.native
  @JSName("set")
  def set_register(parameter: register): Boolean = js.native
  @JSName("set")
  def set_register(parameter: register, value: Boolean): Boolean = js.native
  @JSName("set")
  def set_registerexpires(parameter: register_expires): Boolean = js.native
  @JSName("set")
  def set_registerexpires(parameter: register_expires, value: Double): Boolean = js.native
  @JSName("set")
  def set_registrarserver(parameter: registrar_server): Boolean = js.native
  @JSName("set")
  def set_registrarserver(parameter: registrar_server, value: String): Boolean = js.native
  @JSName("set")
  def set_sessiontimers(parameter: session_timers): Boolean = js.native
  @JSName("set")
  def set_sessiontimers(parameter: session_timers, value: Boolean): Boolean = js.native
  @JSName("set")
  def set_sessiontimersforcerefresher(parameter: session_timers_force_refresher): Boolean = js.native
  @JSName("set")
  def set_sessiontimersforcerefresher(parameter: session_timers_force_refresher, value: Boolean): Boolean = js.native
  @JSName("set")
  def set_sessiontimersrefreshmethod(parameter: session_timers_refresh_method): Boolean = js.native
  @JSName("set")
  def set_sessiontimersrefreshmethod(parameter: session_timers_refresh_method, value: String): Boolean = js.native
  @JSName("set")
  def set_sockets(parameter: sockets, value: js.Array[Socket | WeightedSocket]): Boolean = js.native
  @JSName("set")
  def set_sockets(parameter: sockets, value: Socket): Boolean = js.native
  @JSName("set")
  def set_uri(parameter: uri, value: String): Boolean = js.native
  @JSName("set")
  def set_usepreloadedroute(parameter: use_preloaded_route): Boolean = js.native
  @JSName("set")
  def set_usepreloadedroute(parameter: use_preloaded_route, value: Boolean): Boolean = js.native
  @JSName("set")
  def set_useragent(parameter: user_agent): Boolean = js.native
  @JSName("set")
  def set_useragent(parameter: user_agent, value: String): Boolean = js.native
  
  def start(): Unit = js.native
  
  def status: UAStatus = js.native
  
  def stop(): Unit = js.native
  
  def terminateSessions(): Unit = js.native
  def terminateSessions(options: TerminateOptions): Unit = js.native
  
  def unregister(): Unit = js.native
  def unregister(options: UnRegisterOptions): Unit = js.native
}
