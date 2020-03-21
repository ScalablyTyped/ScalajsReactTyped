package typingsJapgolly.workboxBackgroundSync

import typingsJapgolly.workboxBackgroundSync.queueMod.QueueOptions
import typingsJapgolly.workboxCore.workboxPluginMod.FetchDidFailCallback
import typingsJapgolly.workboxCore.workboxPluginMod.FetchDidFailCallbackParam
import typingsJapgolly.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-background-sync/Plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  @js.native
  class Plugin protected () extends WorkboxPlugin {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
    @JSName("fetchDidFail")
    var fetchDidFail_Original: FetchDidFailCallback = js.native
    @JSName("fetchDidFail")
    def fetchDidFail_MPlugin(param: FetchDidFailCallbackParam): js.Promise[Unit] = js.native
  }
  
}

