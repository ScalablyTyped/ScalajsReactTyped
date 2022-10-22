package typingsJapgolly.libp2p

import typingsJapgolly.libp2p.anon.From
import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pInterfaceContentRouting.mod.ContentRouting
import typingsJapgolly.libp2pInterfaces.distSrcStartableMod.Startable
import typingsJapgolly.libp2pInterfaces.mod.AbortOptions
import typingsJapgolly.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcContentRoutingMod {
  
  @JSImport("libp2p/dist/src/content-routing", "CompoundContentRouting")
  @js.native
  open class CompoundContentRouting protected ()
    extends StObject
       with ContentRouting
       with Startable {
    def this(components: Components, init: CompoundContentRoutingInit) = this()
    
    /* private */ val components: Any = js.native
    
    /**
      * Get the `n` values to the given key without sorting
      */
    def getMany(key: js.typedarray.Uint8Array, nVals: Double, options: AbortOptions): AsyncGenerator[From, Unit, Any] = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val routers: Any = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
  }
  
  trait CompoundContentRoutingInit extends StObject {
    
    var routers: js.Array[ContentRouting]
  }
  object CompoundContentRoutingInit {
    
    inline def apply(routers: js.Array[ContentRouting]): CompoundContentRoutingInit = {
      val __obj = js.Dynamic.literal(routers = routers.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompoundContentRoutingInit]
    }
    
    extension [Self <: CompoundContentRoutingInit](x: Self) {
      
      inline def setRouters(value: js.Array[ContentRouting]): Self = StObject.set(x, "routers", value.asInstanceOf[js.Any])
      
      inline def setRoutersVarargs(value: ContentRouting*): Self = StObject.set(x, "routers", js.Array(value*))
    }
  }
}
