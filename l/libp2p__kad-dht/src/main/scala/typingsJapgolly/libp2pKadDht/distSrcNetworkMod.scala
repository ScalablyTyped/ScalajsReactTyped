package typingsJapgolly.libp2pKadDht

import org.scalajs.dom.CustomEvent
import typingsJapgolly.itStreamTypes.mod.Duplex
import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pComponents.mod.Initializable
import typingsJapgolly.libp2pInterfaceDht.mod.DialingPeerEvent
import typingsJapgolly.libp2pInterfaceDht.mod.PeerResponseEvent
import typingsJapgolly.libp2pInterfaceDht.mod.QueryErrorEvent
import typingsJapgolly.libp2pInterfaceDht.mod.SendingQueryEvent
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pInterfaces.distSrcStartableMod.Startable
import typingsJapgolly.libp2pInterfaces.eventsMod.EventEmitter
import typingsJapgolly.libp2pInterfaces.mod.AbortOptions
import typingsJapgolly.libp2pKadDht.distSrcMessageMod.Message
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNetworkMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/network", "Network")
  @js.native
  open class Network protected ()
    extends EventEmitter[NetworkEvents]
       with Startable
       with Initializable {
    /**
      * Create a new network
      */
    def this(init: NetworkInit) = this()
    
    /**
      * Write a message to the given stream
      */
    def _writeMessage(
      stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
      msg: js.typedarray.Uint8Array,
      options: AbortOptions
    ): js.Promise[Unit] = js.native
    def _writeMessage(
      stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
      msg: Uint8ArrayList,
      options: AbortOptions
    ): js.Promise[Unit] = js.native
    
    /**
      * Write a message and read its response.
      * If no response is received after the specified timeout
      * this will error out.
      */
    def _writeReadMessage(
      stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
      msg: js.typedarray.Uint8Array,
      options: AbortOptions
    ): js.Promise[Message] = js.native
    def _writeReadMessage(
      stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
      msg: Uint8ArrayList,
      options: AbortOptions
    ): js.Promise[Message] = js.native
    
    /* private */ var components: Any = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ val protocol: Any = js.native
    
    /* private */ var running: Any = js.native
    
    /**
      * Sends a message without expecting an answer
      */
    def sendMessage(to: PeerId, msg: Message): AsyncGenerator[
        SendingQueryEvent | PeerResponseEvent | QueryErrorEvent | DialingPeerEvent, 
        Unit, 
        Any
      ] = js.native
    def sendMessage(to: PeerId, msg: Message, options: AbortOptions): AsyncGenerator[
        SendingQueryEvent | PeerResponseEvent | QueryErrorEvent | DialingPeerEvent, 
        Unit, 
        Any
      ] = js.native
    
    /**
      * Send a request and record RTT for latency measurements
      */
    def sendRequest(to: PeerId, msg: Message): AsyncGenerator[
        SendingQueryEvent | PeerResponseEvent | QueryErrorEvent | DialingPeerEvent, 
        Unit, 
        Any
      ] = js.native
    def sendRequest(to: PeerId, msg: Message, options: AbortOptions): AsyncGenerator[
        SendingQueryEvent | PeerResponseEvent | QueryErrorEvent | DialingPeerEvent, 
        Unit, 
        Any
      ] = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
  }
  
  trait NetworkEvents extends StObject {
    
    var peer: CustomEvent
  }
  object NetworkEvents {
    
    inline def apply(peer: CustomEvent): NetworkEvents = {
      val __obj = js.Dynamic.literal(peer = peer.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkEvents]
    }
    
    extension [Self <: NetworkEvents](x: Self) {
      
      inline def setPeer(value: CustomEvent): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkInit extends StObject {
    
    var lan: Boolean
    
    var protocol: String
  }
  object NetworkInit {
    
    inline def apply(lan: Boolean, protocol: String): NetworkInit = {
      val __obj = js.Dynamic.literal(lan = lan.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkInit]
    }
    
    extension [Self <: NetworkInit](x: Self) {
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
}
