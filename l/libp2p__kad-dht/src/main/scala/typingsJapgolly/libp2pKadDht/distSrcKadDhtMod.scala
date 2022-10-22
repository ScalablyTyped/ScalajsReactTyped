package typingsJapgolly.libp2pKadDht

import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pComponents.mod.Initializable
import typingsJapgolly.libp2pInterfaceDht.mod.DHT
import typingsJapgolly.libp2pInterfacePeerInfo.mod.PeerInfo
import typingsJapgolly.libp2pKadDht.distSrcNetworkMod.Network
import typingsJapgolly.libp2pKadDht.distSrcPeerRoutingMod.PeerRouting
import typingsJapgolly.libp2pKadDht.distSrcProvidersMod.Providers
import typingsJapgolly.libp2pKadDht.distSrcRoutingTableMod.RoutingTable
import typingsJapgolly.libp2pKadDht.mod.KadDHTInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKadDhtMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/kad-dht", "DEFAULT_MAX_INBOUND_STREAMS")
  @js.native
  val DEFAULT_MAX_INBOUND_STREAMS: /* 32 */ Double = js.native
  
  @JSImport("@libp2p/kad-dht/dist/src/kad-dht", "DEFAULT_MAX_OUTBOUND_STREAMS")
  @js.native
  val DEFAULT_MAX_OUTBOUND_STREAMS: /* 64 */ Double = js.native
  
  @JSImport("@libp2p/kad-dht/dist/src/kad-dht", "KadDHT")
  @js.native
  open class KadDHT protected ()
    extends DHT
       with Initializable {
    /**
      * Create a new KadDHT
      */
    def this(init: SingleKadDHTInit) = this()
    
    /* private */ var clientMode: Any = js.native
    
    var components: Components = js.native
    
    /* private */ val contentFetching: Any = js.native
    
    /* private */ val contentRouting: Any = js.native
    
    var get: Any = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /**
      * Is this DHT running.
      */
    def isStarted(): Boolean = js.native
    
    /* private */ val kBucketSize: Any = js.native
    
    /* private */ val lan: Any = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ val maxInboundStreams: Any = js.native
    
    /* private */ val maxOutboundStreams: Any = js.native
    
    var network: Network = js.native
    
    def onPeerConnect(peerData: PeerInfo): js.Promise[Unit] = js.native
    
    var peerRouting: PeerRouting = js.native
    
    var protocol: String = js.native
    
    var providers: Providers = js.native
    
    /* private */ val queryManager: Any = js.native
    
    /* private */ val querySelf: Any = js.native
    
    var routingTable: RoutingTable = js.native
    
    /* private */ val routingTableRefresh: Any = js.native
    
    /* private */ val rpc: Any = js.native
    
    /* private */ var running: Any = js.native
    
    /* private */ val selectors: Any = js.native
    
    /**
      * Start listening to incoming connections.
      */
    def start(): js.Promise[Unit] = js.native
    
    /**
      * Stop accepting incoming connections and sending outgoing
      * messages.
      */
    def stop(): js.Promise[Unit] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_KadDHT: js.Function0[String] = js.native
    
    /* private */ val topologyListener: Any = js.native
    
    /* private */ val validators: Any = js.native
  }
  
  trait SingleKadDHTInit
    extends StObject
       with KadDHTInit {
    
    /**
      * Whether to start up in lan or wan mode
      */
    var lan: js.UndefOr[Boolean] = js.undefined
  }
  object SingleKadDHTInit {
    
    inline def apply(): SingleKadDHTInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SingleKadDHTInit]
    }
    
    extension [Self <: SingleKadDHTInit](x: Self) {
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setLanUndefined: Self = StObject.set(x, "lan", js.undefined)
    }
  }
}
