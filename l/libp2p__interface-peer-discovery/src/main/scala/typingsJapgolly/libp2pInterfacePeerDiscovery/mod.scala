package typingsJapgolly.libp2pInterfacePeerDiscovery

import org.scalajs.dom.CustomEvent
import typingsJapgolly.libp2pInterfaces.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/interface-peer-discovery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPeerDiscovery(other: Any): /* is @libp2p/interface-peer-discovery.@libp2p/interface-peer-discovery.PeerDiscovery */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPeerDiscovery")(other.asInstanceOf[js.Any]).asInstanceOf[/* is @libp2p/interface-peer-discovery.@libp2p/interface-peer-discovery.PeerDiscovery */ Boolean]
  
  @JSImport("@libp2p/interface-peer-discovery", "symbol")
  @js.native
  val symbol: js.Symbol = js.native
  
  @js.native
  trait PeerDiscovery extends EventEmitter[PeerDiscoveryEvents] {
    
    /**
      * Used to identify the peer discovery mechanism
      */
    @JSName(js.Symbol.toStringTag)
    var toStringTag: String = js.native
  }
  
  trait PeerDiscoveryEvents extends StObject {
    
    var peer: CustomEvent
  }
  object PeerDiscoveryEvents {
    
    inline def apply(peer: CustomEvent): PeerDiscoveryEvents = {
      val __obj = js.Dynamic.literal(peer = peer.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerDiscoveryEvents]
    }
    
    extension [Self <: PeerDiscoveryEvents](x: Self) {
      
      inline def setPeer(value: CustomEvent): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    }
  }
}
