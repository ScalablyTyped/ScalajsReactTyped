package typingsJapgolly.libp2p

import typingsJapgolly.libp2p.distSrcTransportManagerMod.TransportManagerInit
import typingsJapgolly.libp2pComponents.mod.Components
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object transportManagerMod {
  
  @JSImport("libp2p/transport-manager", "DefaultTransportManager")
  @js.native
  open class DefaultTransportManager protected ()
    extends typingsJapgolly.libp2p.distSrcTransportManagerMod.DefaultTransportManager {
    def this(components: Components) = this()
    def this(components: Components, init: TransportManagerInit) = this()
  }
  
  @JSImport("libp2p/transport-manager", "FaultTolerance")
  @js.native
  object FaultTolerance extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.libp2p.distSrcTransportManagerMod.FaultTolerance & Double] = js.native
    
    /* 0 */ val FATAL_ALL: typingsJapgolly.libp2p.distSrcTransportManagerMod.FaultTolerance.FATAL_ALL & Double = js.native
    
    /* 1 */ val NO_FATAL: typingsJapgolly.libp2p.distSrcTransportManagerMod.FaultTolerance.NO_FATAL & Double = js.native
  }
}
