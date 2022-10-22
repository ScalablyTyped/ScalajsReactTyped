package typingsJapgolly.libp2pWebrtcStar

import org.scalajs.dom.CustomEvent
import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pComponents.mod.Initializable
import typingsJapgolly.libp2pInterfaceConnection.mod.Connection
import typingsJapgolly.libp2pInterfaceConnection.mod.MultiaddrConnection
import typingsJapgolly.libp2pInterfacePeerDiscovery.mod.PeerDiscovery
import typingsJapgolly.libp2pInterfaceTransport.mod.CreateListenerOptions
import typingsJapgolly.libp2pInterfaceTransport.mod.DialOptions
import typingsJapgolly.libp2pInterfaceTransport.mod.Listener
import typingsJapgolly.libp2pInterfaceTransport.mod.Transport
import typingsJapgolly.libp2pInterfaceTransport.mod.Upgrader
import typingsJapgolly.libp2pInterfaces.distSrcStartableMod.Startable
import typingsJapgolly.libp2pInterfaces.eventsMod.EventEmitter
import typingsJapgolly.libp2pWebrtcPeer.mod.WRTC
import typingsJapgolly.libp2pWebrtcPeer.mod.WebRTCInitiator
import typingsJapgolly.libp2pWebrtcPeer.mod.WebRTCInitiatorInit
import typingsJapgolly.libp2pWebrtcPeer.mod.WebRTCReceiver
import typingsJapgolly.libp2pWebrtcPeer.mod.WebRTCReceiverInit
import typingsJapgolly.libp2pWebrtcStarProtocol.mod.HandshakeSignal
import typingsJapgolly.libp2pWebrtcStarProtocol.mod.WebRTCStarSocket
import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/webrtc-star", "WebRTCStar")
  @js.native
  open class WebRTCStar ()
    extends StObject
       with Transport
       with Initializable {
    def this(options: WebRTCStarInit) = this()
    
    def _connect(ma: Multiaddr_, options: WebRTCStarDialOptions): js.Promise[WebRTCInitiator] = js.native
    
    /* private */ var components: Any = js.native
    
    /**
      * Creates a WebrtcStar listener. The provided `handler` function will be called
      * anytime a new incoming Connection has been successfully upgraded via
      * `upgrader.upgradeInbound`.
      */
    def createListener(options: WebRTCStarListenerOptions): Listener = js.native
    
    def dial(ma: Multiaddr_, options: WebRTCStarDialOptions): js.Promise[Connection] = js.native
    
    var discovery: PeerDiscovery & Startable = js.native
    
    var get: Any = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    def peerDiscovered(maStr: String): Unit = js.native
    
    var sigServers: Map[String, SignalServer] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_WebRTCStar: js.Function0[String] = js.native
    
    var wrtc: js.UndefOr[WRTC] = js.native
  }
  
  @js.native
  trait SignalServer extends EventEmitter[SignalServerServerEvents] {
    
    var channels: Map[String, WebRTCReceiver] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    var connections: js.Array[MultiaddrConnection] = js.native
    
    var pendingSignals: Map[String, js.Array[HandshakeSignal]] = js.native
    
    var signallingAddr: Multiaddr_ = js.native
    
    var socket: WebRTCStarSocket = js.native
  }
  
  trait SignalServerServerEvents extends StObject {
    
    var connection: CustomEvent
    
    var disconnect: CustomEvent
    
    var error: CustomEvent
    
    var listening: CustomEvent
    
    var peer: CustomEvent
    
    var reconnect: CustomEvent
  }
  object SignalServerServerEvents {
    
    inline def apply(
      connection: CustomEvent,
      disconnect: CustomEvent,
      error: CustomEvent,
      listening: CustomEvent,
      peer: CustomEvent,
      reconnect: CustomEvent
    ): SignalServerServerEvents = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], disconnect = disconnect.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], listening = listening.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], reconnect = reconnect.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignalServerServerEvents]
    }
    
    extension [Self <: SignalServerServerEvents](x: Self) {
      
      inline def setConnection(value: CustomEvent): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setDisconnect(value: CustomEvent): Self = StObject.set(x, "disconnect", value.asInstanceOf[js.Any])
      
      inline def setError(value: CustomEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setListening(value: CustomEvent): Self = StObject.set(x, "listening", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: CustomEvent): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setReconnect(value: CustomEvent): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebRTCStarDialOptions
    extends StObject
       with DialOptions {
    
    var channelOptions: js.UndefOr[WebRTCInitiatorInit] = js.undefined
  }
  object WebRTCStarDialOptions {
    
    inline def apply(upgrader: Upgrader): WebRTCStarDialOptions = {
      val __obj = js.Dynamic.literal(upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebRTCStarDialOptions]
    }
    
    extension [Self <: WebRTCStarDialOptions](x: Self) {
      
      inline def setChannelOptions(value: WebRTCInitiatorInit): Self = StObject.set(x, "channelOptions", value.asInstanceOf[js.Any])
      
      inline def setChannelOptionsUndefined: Self = StObject.set(x, "channelOptions", js.undefined)
    }
  }
  
  trait WebRTCStarInit extends StObject {
    
    var wrtc: js.UndefOr[WRTC] = js.undefined
  }
  object WebRTCStarInit {
    
    inline def apply(): WebRTCStarInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebRTCStarInit]
    }
    
    extension [Self <: WebRTCStarInit](x: Self) {
      
      inline def setWrtc(value: WRTC): Self = StObject.set(x, "wrtc", value.asInstanceOf[js.Any])
      
      inline def setWrtcUndefined: Self = StObject.set(x, "wrtc", js.undefined)
    }
  }
  
  trait WebRTCStarListenerOptions
    extends StObject
       with CreateListenerOptions
       with WebRTCInitiatorInit {
    
    var channelOptions: js.UndefOr[WebRTCReceiverInit] = js.undefined
  }
  object WebRTCStarListenerOptions {
    
    inline def apply(upgrader: Upgrader): WebRTCStarListenerOptions = {
      val __obj = js.Dynamic.literal(upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebRTCStarListenerOptions]
    }
    
    extension [Self <: WebRTCStarListenerOptions](x: Self) {
      
      inline def setChannelOptions(value: WebRTCReceiverInit): Self = StObject.set(x, "channelOptions", value.asInstanceOf[js.Any])
      
      inline def setChannelOptionsUndefined: Self = StObject.set(x, "channelOptions", js.undefined)
    }
  }
}
