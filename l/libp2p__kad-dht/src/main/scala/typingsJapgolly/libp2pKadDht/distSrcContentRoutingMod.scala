package typingsJapgolly.libp2pKadDht

import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pComponents.mod.Initializable
import typingsJapgolly.libp2pInterfaceDht.mod.AddingPeerEvent
import typingsJapgolly.libp2pInterfaceDht.mod.DialingPeerEvent
import typingsJapgolly.libp2pInterfaceDht.mod.PeerResponseEvent
import typingsJapgolly.libp2pInterfaceDht.mod.ProviderEvent
import typingsJapgolly.libp2pInterfaceDht.mod.QueryErrorEvent
import typingsJapgolly.libp2pInterfaceDht.mod.QueryEvent
import typingsJapgolly.libp2pInterfaceDht.mod.QueryOptions
import typingsJapgolly.libp2pInterfaceDht.mod.SendingQueryEvent
import typingsJapgolly.libp2pInterfaceDht.mod.ValueEvent
import typingsJapgolly.libp2pInterfaces.mod.AbortOptions
import typingsJapgolly.libp2pKadDht.distSrcNetworkMod.Network
import typingsJapgolly.libp2pKadDht.distSrcPeerRoutingMod.PeerRouting
import typingsJapgolly.libp2pKadDht.distSrcProvidersMod.Providers
import typingsJapgolly.libp2pKadDht.distSrcQueryManagerMod.QueryManager
import typingsJapgolly.libp2pKadDht.distSrcRoutingTableMod.RoutingTable
import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import typingsJapgolly.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcContentRoutingMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/content-routing", "ContentRouting")
  @js.native
  open class ContentRouting protected ()
    extends StObject
       with Initializable {
    def this(init: ContentRoutingInit) = this()
    
    /* private */ var components: Any = js.native
    
    /**
      * Search the dht for up to `K` providers of the given CID.
      */
    def findProviders(key: CID[Any, Double, Double, Version], options: QueryOptions): AsyncGenerator[QueryEvent, Unit, Any] = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ val network: Any = js.native
    
    /* private */ val peerRouting: Any = js.native
    
    /**
      * Announce to the network that we can provide the value for a given key and
      * are contactable on the given multiaddrs
      */
    def provide(key: CID[Any, Double, Double, Version], multiaddrs: js.Array[Multiaddr_]): AsyncGenerator[
        SendingQueryEvent | PeerResponseEvent | QueryErrorEvent | ProviderEvent | ValueEvent | AddingPeerEvent | DialingPeerEvent, 
        Unit, 
        Unit
      ] = js.native
    def provide(key: CID[Any, Double, Double, Version], multiaddrs: js.Array[Multiaddr_], options: AbortOptions): AsyncGenerator[
        SendingQueryEvent | PeerResponseEvent | QueryErrorEvent | ProviderEvent | ValueEvent | AddingPeerEvent | DialingPeerEvent, 
        Unit, 
        Unit
      ] = js.native
    
    /* private */ val providers: Any = js.native
    
    /* private */ val queryManager: Any = js.native
    
    /* private */ val routingTable: Any = js.native
  }
  
  trait ContentRoutingInit extends StObject {
    
    var lan: Boolean
    
    var network: Network
    
    var peerRouting: PeerRouting
    
    var providers: Providers
    
    var queryManager: QueryManager
    
    var routingTable: RoutingTable
  }
  object ContentRoutingInit {
    
    inline def apply(
      lan: Boolean,
      network: Network,
      peerRouting: PeerRouting,
      providers: Providers,
      queryManager: QueryManager,
      routingTable: RoutingTable
    ): ContentRoutingInit = {
      val __obj = js.Dynamic.literal(lan = lan.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], peerRouting = peerRouting.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], queryManager = queryManager.asInstanceOf[js.Any], routingTable = routingTable.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentRoutingInit]
    }
    
    extension [Self <: ContentRoutingInit](x: Self) {
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setPeerRouting(value: PeerRouting): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
      
      inline def setProviders(value: Providers): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      inline def setQueryManager(value: QueryManager): Self = StObject.set(x, "queryManager", value.asInstanceOf[js.Any])
      
      inline def setRoutingTable(value: RoutingTable): Self = StObject.set(x, "routingTable", value.asInstanceOf[js.Any])
    }
  }
}
