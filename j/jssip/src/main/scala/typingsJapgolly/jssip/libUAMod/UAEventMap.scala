package typingsJapgolly.jssip.libUAMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jssip.anon.Event
import typingsJapgolly.jssip.libRtcsessionMod.AnyListener
import typingsJapgolly.jssip.libWebSocketInterfaceMod.DisconnectEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UAEventMap extends StObject {
  
  def connected(event: ConnectedEvent): Unit
  @JSName("connected")
  var connected_Original: ConnectedListener
  
  def connecting(event: UAConnectingEvent): Unit
  @JSName("connecting")
  var connecting_Original: UAConnectingListener
  
  def disconnected(event: DisconnectEvent): Unit
  @JSName("disconnected")
  var disconnected_Original: DisconnectedListener
  
  var newMessage: MessageListener
  
  var newRTCSession: RTCSessionListener
  
  def registered(event: RegisteredEvent): Unit
  @JSName("registered")
  var registered_Original: RegisteredListener
  
  def registrationExpiring(args: Any*): Unit
  @JSName("registrationExpiring")
  var registrationExpiring_Original: AnyListener
  
  def registrationFailed(event: UnRegisteredEvent): Unit
  @JSName("registrationFailed")
  var registrationFailed_Original: RegistrationFailedListener
  
  def sipEvent[T](event: Event[T]): Unit
  @JSName("sipEvent")
  var sipEvent_Original: SipEventListener
  
  def unregistered(event: UnRegisteredEvent): Unit
  @JSName("unregistered")
  var unregistered_Original: UnRegisteredListener
}
object UAEventMap {
  
  inline def apply(
    connected: /* event */ ConnectedEvent => Callback,
    connecting: /* event */ UAConnectingEvent => Callback,
    disconnected: /* event */ DisconnectEvent => Callback,
    newMessage: (/* event */ IncomingMessageEvent) | (/* event */ OutgoingMessageEvent) => Callback,
    newRTCSession: (/* event */ IncomingRTCSessionEvent) | (/* event */ OutgoingRTCSessionEvent) => Callback,
    registered: /* event */ RegisteredEvent => Callback,
    registrationExpiring: AnyListener,
    registrationFailed: /* event */ UnRegisteredEvent => Callback,
    sipEvent: /* event */ Event[Any] => Callback,
    unregistered: /* event */ UnRegisteredEvent => Callback
  ): UAEventMap = {
    val __obj = js.Dynamic.literal(connected = js.Any.fromFunction1((t0: /* event */ ConnectedEvent) => connected(t0).runNow()), connecting = js.Any.fromFunction1((t0: /* event */ UAConnectingEvent) => connecting(t0).runNow()), disconnected = js.Any.fromFunction1((t0: /* event */ DisconnectEvent) => disconnected(t0).runNow()), newMessage = js.Any.fromFunction1((t0: (/* event */ IncomingMessageEvent) | (/* event */ OutgoingMessageEvent)) => newMessage(t0).runNow()), newRTCSession = js.Any.fromFunction1((t0: (/* event */ IncomingRTCSessionEvent) | (/* event */ OutgoingRTCSessionEvent)) => newRTCSession(t0).runNow()), registered = js.Any.fromFunction1((t0: /* event */ RegisteredEvent) => registered(t0).runNow()), registrationExpiring = registrationExpiring.asInstanceOf[js.Any], registrationFailed = js.Any.fromFunction1((t0: /* event */ UnRegisteredEvent) => registrationFailed(t0).runNow()), sipEvent = js.Any.fromFunction1((t0: /* event */ Event[Any]) => sipEvent(t0).runNow()), unregistered = js.Any.fromFunction1((t0: /* event */ UnRegisteredEvent) => unregistered(t0).runNow()))
    __obj.asInstanceOf[UAEventMap]
  }
  
  extension [Self <: UAEventMap](x: Self) {
    
    inline def setConnected(value: /* event */ ConnectedEvent => Callback): Self = StObject.set(x, "connected", js.Any.fromFunction1((t0: /* event */ ConnectedEvent) => value(t0).runNow()))
    
    inline def setConnecting(value: /* event */ UAConnectingEvent => Callback): Self = StObject.set(x, "connecting", js.Any.fromFunction1((t0: /* event */ UAConnectingEvent) => value(t0).runNow()))
    
    inline def setDisconnected(value: /* event */ DisconnectEvent => Callback): Self = StObject.set(x, "disconnected", js.Any.fromFunction1((t0: /* event */ DisconnectEvent) => value(t0).runNow()))
    
    inline def setNewMessage(value: (/* event */ IncomingMessageEvent) | (/* event */ OutgoingMessageEvent) => Callback): Self = StObject.set(x, "newMessage", js.Any.fromFunction1((t0: (/* event */ IncomingMessageEvent) | (/* event */ OutgoingMessageEvent)) => value(t0).runNow()))
    
    inline def setNewRTCSession(value: (/* event */ IncomingRTCSessionEvent) | (/* event */ OutgoingRTCSessionEvent) => Callback): Self = StObject.set(x, "newRTCSession", js.Any.fromFunction1((t0: (/* event */ IncomingRTCSessionEvent) | (/* event */ OutgoingRTCSessionEvent)) => value(t0).runNow()))
    
    inline def setRegistered(value: /* event */ RegisteredEvent => Callback): Self = StObject.set(x, "registered", js.Any.fromFunction1((t0: /* event */ RegisteredEvent) => value(t0).runNow()))
    
    inline def setRegistrationExpiring(value: AnyListener): Self = StObject.set(x, "registrationExpiring", value.asInstanceOf[js.Any])
    
    inline def setRegistrationFailed(value: /* event */ UnRegisteredEvent => Callback): Self = StObject.set(x, "registrationFailed", js.Any.fromFunction1((t0: /* event */ UnRegisteredEvent) => value(t0).runNow()))
    
    inline def setSipEvent(value: /* event */ Event[Any] => Callback): Self = StObject.set(x, "sipEvent", js.Any.fromFunction1((t0: /* event */ Event[Any]) => value(t0).runNow()))
    
    inline def setUnregistered(value: /* event */ UnRegisteredEvent => Callback): Self = StObject.set(x, "unregistered", js.Any.fromFunction1((t0: /* event */ UnRegisteredEvent) => value(t0).runNow()))
  }
}
