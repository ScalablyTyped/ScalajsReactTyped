package typingsJapgolly.libp2pMdns

import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pComponents.mod.Initializable
import typingsJapgolly.multicastDns.mod.QueryPacket
import typingsJapgolly.node.dgramMod.RemoteInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCompatResponderMod {
  
  @JSImport("@libp2p/mdns/dist/src/compat/responder", "Responder")
  @js.native
  open class Responder ()
    extends StObject
       with Initializable {
    
    /* private */ var _mdns: Any = js.native
    
    def _onQuery(event: QueryPacket, info: RemoteInfo): Unit = js.native
    
    /* private */ var components: Any = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): js.UndefOr[js.Promise[Unit]] = js.native
  }
}
