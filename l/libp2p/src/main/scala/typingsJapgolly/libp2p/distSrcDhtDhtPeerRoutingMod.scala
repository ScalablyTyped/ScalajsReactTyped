package typingsJapgolly.libp2p

import typingsJapgolly.libp2pInterfaceDht.mod.DHT
import typingsJapgolly.libp2pInterfacePeerRouting.mod.PeerRouting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDhtDhtPeerRoutingMod {
  
  @JSImport("libp2p/dist/src/dht/dht-peer-routing", "DHTPeerRouting")
  @js.native
  open class DHTPeerRouting protected ()
    extends StObject
       with PeerRouting {
    def this(dht: DHT) = this()
    
    /* private */ val dht: Any = js.native
  }
}
