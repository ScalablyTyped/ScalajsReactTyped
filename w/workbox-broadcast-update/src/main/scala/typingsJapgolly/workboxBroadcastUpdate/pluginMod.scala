package typingsJapgolly.workboxBroadcastUpdate

import typingsJapgolly.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdateOptions
import typingsJapgolly.workboxCore.workboxPluginMod.CacheDidUpdateCallback
import typingsJapgolly.workboxCore.workboxPluginMod.CacheDidUpdateCallbackParam
import typingsJapgolly.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-broadcast-update/Plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  @js.native
  class Plugin () extends WorkboxPlugin {
    def this(options: BroadcastCacheUpdateOptions) = this()
    @JSName("cacheDidUpdate")
    var cacheDidUpdate_Original: CacheDidUpdateCallback = js.native
    @JSName("cacheDidUpdate")
    def cacheDidUpdate_MPlugin(param: CacheDidUpdateCallbackParam): js.Promise[Unit] = js.native
  }
  
}

