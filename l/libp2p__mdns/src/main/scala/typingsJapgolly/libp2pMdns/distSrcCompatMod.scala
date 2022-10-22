package typingsJapgolly.libp2pMdns

import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pComponents.mod.Initializable
import typingsJapgolly.libp2pInterfacePeerDiscovery.mod.PeerDiscovery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCompatMod {
  
  @JSImport("@libp2p/mdns/dist/src/compat", "GoMulticastDNS")
  @js.native
  open class GoMulticastDNS ()
    extends PeerDiscovery
       with Initializable {
    def this(options: GoMulticastDNSInit) = this()
    
    /* private */ val _querier: Any = js.native
    
    /* private */ val _responder: Any = js.native
    
    /* private */ var _started: Any = js.native
    
    var get: Any = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    def isStarted(): Boolean = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[Unit] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_GoMulticastDNS: js.Function0[String] = js.native
  }
  
  trait GoMulticastDNSInit extends StObject {
    
    var queryInterval: js.UndefOr[Double] = js.undefined
    
    var queryPeriod: js.UndefOr[Double] = js.undefined
  }
  object GoMulticastDNSInit {
    
    inline def apply(): GoMulticastDNSInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoMulticastDNSInit]
    }
    
    extension [Self <: GoMulticastDNSInit](x: Self) {
      
      inline def setQueryInterval(value: Double): Self = StObject.set(x, "queryInterval", value.asInstanceOf[js.Any])
      
      inline def setQueryIntervalUndefined: Self = StObject.set(x, "queryInterval", js.undefined)
      
      inline def setQueryPeriod(value: Double): Self = StObject.set(x, "queryPeriod", value.asInstanceOf[js.Any])
      
      inline def setQueryPeriodUndefined: Self = StObject.set(x, "queryPeriod", js.undefined)
    }
  }
}
