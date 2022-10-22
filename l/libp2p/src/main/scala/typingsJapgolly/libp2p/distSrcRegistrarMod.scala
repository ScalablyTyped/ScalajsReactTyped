package typingsJapgolly.libp2p

import org.scalajs.dom.CustomEvent
import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pInterfaceRegistrar.mod.Registrar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRegistrarMod {
  
  @JSImport("libp2p/dist/src/registrar", "DEFAULT_MAX_INBOUND_STREAMS")
  @js.native
  val DEFAULT_MAX_INBOUND_STREAMS: /* 32 */ Double = js.native
  
  @JSImport("libp2p/dist/src/registrar", "DEFAULT_MAX_OUTBOUND_STREAMS")
  @js.native
  val DEFAULT_MAX_OUTBOUND_STREAMS: /* 64 */ Double = js.native
  
  @JSImport("libp2p/dist/src/registrar", "DefaultRegistrar")
  @js.native
  open class DefaultRegistrar protected ()
    extends StObject
       with Registrar {
    def this(components: Components) = this()
    
    /**
      * Remove a disconnected peer from the record
      */
    def _onDisconnect(evt: CustomEvent): Unit = js.native
    
    /**
      * Check if a new peer support the multicodecs for this topology
      */
    def _onProtocolChange(evt: CustomEvent): Unit = js.native
    
    /* private */ val components: Any = js.native
    
    /* private */ val handlers: Any = js.native
    
    /* private */ val topologies: Any = js.native
    
    def unhandle(protocols: js.Array[String]): js.Promise[Unit] = js.native
  }
}
