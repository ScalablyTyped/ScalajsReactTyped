package typingsJapgolly.workboxBackgroundSync

import typingsJapgolly.workboxBackgroundSync.queueMod.QueueOptions
import typingsJapgolly.workboxCore.typesWorkboxPluginMod.FetchDidFailCallback
import typingsJapgolly.workboxCore.typesWorkboxPluginMod.FetchDidFailCallbackParam
import typingsJapgolly.workboxCore.typesWorkboxPluginMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("workbox-background-sync/Plugin", "Plugin")
  @js.native
  open class Plugin protected ()
    extends StObject
       with WorkboxPlugin {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
    
    @JSName("fetchDidFail")
    def fetchDidFail_MPlugin(param: FetchDidFailCallbackParam): js.Promise[Unit] = js.native
    @JSName("fetchDidFail")
    var fetchDidFail_Original: FetchDidFailCallback = js.native
  }
}
