package typingsJapgolly.libp2pKadDht

import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pInterfaceDht.mod.Validators
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pKadDht.distSrcMessageMod.Message
import typingsJapgolly.libp2pKadDht.distSrcRpcMod.DHTMessageHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRpcHandlersPutValueMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/rpc/handlers/put-value", "PutValueHandler")
  @js.native
  open class PutValueHandler protected ()
    extends StObject
       with DHTMessageHandler {
    def this(init: PutValueHandlerInit) = this()
    
    /* private */ var components: Any = js.native
    
    /* CompleteClass */
    override def handle(peerId: PeerId, msg: Message): js.Promise[js.UndefOr[Message]] = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ val validators: Any = js.native
  }
  
  trait PutValueHandlerInit extends StObject {
    
    var validators: Validators
  }
  object PutValueHandlerInit {
    
    inline def apply(validators: Validators): PutValueHandlerInit = {
      val __obj = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutValueHandlerInit]
    }
    
    extension [Self <: PutValueHandlerInit](x: Self) {
      
      inline def setValidators(value: Validators): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    }
  }
}
