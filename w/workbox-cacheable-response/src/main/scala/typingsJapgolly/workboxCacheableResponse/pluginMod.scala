package typingsJapgolly.workboxCacheableResponse

import org.scalajs.dom.experimental.Response
import typingsJapgolly.workboxCacheableResponse.cacheableResponseMod.CacheableResponseConfig
import typingsJapgolly.workboxCore.workboxPluginMod.CacheWillUpdateCallback
import typingsJapgolly.workboxCore.workboxPluginMod.CacheWillUpdateCallbackParamParam
import typingsJapgolly.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-cacheable-response/Plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  @js.native
  class Plugin () extends WorkboxPlugin {
    def this(config: CacheableResponseConfig) = this()
    @JSName("cacheWillUpdate")
    var cacheWillUpdate_Original: CacheWillUpdateCallback = js.native
    @JSName("cacheWillUpdate")
    def cacheWillUpdate_MPlugin(param: CacheWillUpdateCallbackParamParam): js.Promise[js.UndefOr[Response]] = js.native
  }
  
}

