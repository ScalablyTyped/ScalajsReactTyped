package typingsJapgolly.workboxBroadcastUpdate

import typingsJapgolly.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdateOptions
import typingsJapgolly.workboxBroadcastUpdate.broadcastUpdateMod.BroadcastUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-broadcast-update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("workbox-broadcast-update", "BroadcastCacheUpdate")
  @js.native
  open class BroadcastCacheUpdate ()
    extends typingsJapgolly.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdate {
    def this(options: BroadcastCacheUpdateOptions) = this()
  }
  
  @JSImport("workbox-broadcast-update", "Plugin")
  @js.native
  open class Plugin ()
    extends typingsJapgolly.workboxBroadcastUpdate.pluginMod.Plugin {
    def this(options: BroadcastCacheUpdateOptions) = this()
  }
  
  inline def broadcastUpdate(options: BroadcastUpdateOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("broadcastUpdate")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
