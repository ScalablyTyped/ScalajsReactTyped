package typingsJapgolly.workboxBroadcastUpdate

import typingsJapgolly.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdateOptions
import typingsJapgolly.workboxBroadcastUpdate.broadcastUpdateMod.BroadcastUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-broadcast-update", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BroadcastCacheUpdate ()
    extends typingsJapgolly.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdate {
    def this(options: BroadcastCacheUpdateOptions) = this()
  }
  
  @js.native
  class Plugin ()
    extends typingsJapgolly.workboxBroadcastUpdate.pluginMod.Plugin {
    def this(options: BroadcastCacheUpdateOptions) = this()
  }
  
  def broadcastUpdate(options: BroadcastUpdateOptions): js.Promise[Unit] = js.native
}

