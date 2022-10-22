package typingsJapgolly.libp2pKadDht

import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pKadDht.distSrcMessageMod.Message
import typingsJapgolly.libp2pKadDht.distSrcProvidersMod.Providers
import typingsJapgolly.libp2pKadDht.distSrcRpcMod.DHTMessageHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRpcHandlersAddProviderMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/rpc/handlers/add-provider", "AddProviderHandler")
  @js.native
  open class AddProviderHandler protected ()
    extends StObject
       with DHTMessageHandler {
    def this(init: AddProviderHandlerInit) = this()
    
    /* CompleteClass */
    override def handle(peerId: PeerId, msg: Message): js.Promise[js.UndefOr[Message]] = js.native
    
    def init(): Unit = js.native
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /* private */ val providers: Any = js.native
  }
  
  trait AddProviderHandlerInit extends StObject {
    
    var providers: Providers
  }
  object AddProviderHandlerInit {
    
    inline def apply(providers: Providers): AddProviderHandlerInit = {
      val __obj = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddProviderHandlerInit]
    }
    
    extension [Self <: AddProviderHandlerInit](x: Self) {
      
      inline def setProviders(value: Providers): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    }
  }
}
