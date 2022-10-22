package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreUtilEventEmitterMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreUtilVisibilityMonitorMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/VisibilityMonitor", "VisibilityMonitor")
  @js.native
  open class VisibilityMonitor () extends EventEmitter {
    
    /* private */ var visible_ : Any = js.native
  }
  /* static members */
  object VisibilityMonitor {
    
    @JSImport("@firebase/database/dist/node-esm/src/core/util/VisibilityMonitor", "VisibilityMonitor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): VisibilityMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[VisibilityMonitor]
  }
}
