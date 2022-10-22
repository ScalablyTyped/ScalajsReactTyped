package typingsJapgolly.libp2pKadDht

import org.scalajs.dom.CustomEvent
import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pComponents.mod.Initializable
import typingsJapgolly.libp2pInterfaces.distSrcStartableMod.Startable
import typingsJapgolly.libp2pInterfaces.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTopologyListenerMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/topology-listener", "TopologyListener")
  @js.native
  open class TopologyListener protected ()
    extends EventEmitter[TopologyListenerEvents]
       with Startable
       with Initializable {
    def this(init: TopologyListenerInit) = this()
    
    /* private */ var components: Any = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ val protocol: Any = js.native
    
    /* private */ var registrarId: Any = js.native
    
    /* private */ var running: Any = js.native
    
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
  
  trait TopologyListenerEvents extends StObject {
    
    var peer: CustomEvent
  }
  object TopologyListenerEvents {
    
    inline def apply(peer: CustomEvent): TopologyListenerEvents = {
      val __obj = js.Dynamic.literal(peer = peer.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopologyListenerEvents]
    }
    
    extension [Self <: TopologyListenerEvents](x: Self) {
      
      inline def setPeer(value: CustomEvent): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    }
  }
  
  trait TopologyListenerInit extends StObject {
    
    var lan: Boolean
    
    var protocol: String
  }
  object TopologyListenerInit {
    
    inline def apply(lan: Boolean, protocol: String): TopologyListenerInit = {
      val __obj = js.Dynamic.literal(lan = lan.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopologyListenerInit]
    }
    
    extension [Self <: TopologyListenerInit](x: Self) {
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
}
