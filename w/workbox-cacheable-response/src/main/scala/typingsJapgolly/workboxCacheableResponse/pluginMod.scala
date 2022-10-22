package typingsJapgolly.workboxCacheableResponse

import org.scalajs.dom.Response
import typingsJapgolly.workboxCacheableResponse.cacheableResponseMod.CacheableResponseConfig
import typingsJapgolly.workboxCore.typesWorkboxPluginMod.CacheWillUpdateCallback
import typingsJapgolly.workboxCore.typesWorkboxPluginMod.CacheWillUpdateCallbackParamParam
import typingsJapgolly.workboxCore.typesWorkboxPluginMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("workbox-cacheable-response/Plugin", "Plugin")
  @js.native
  open class Plugin ()
    extends StObject
       with WorkboxPlugin {
    def this(config: CacheableResponseConfig) = this()
    
    @JSName("cacheWillUpdate")
    def cacheWillUpdate_MPlugin(param: CacheWillUpdateCallbackParamParam): js.Promise[js.UndefOr[Response]] = js.native
    @JSName("cacheWillUpdate")
    var cacheWillUpdate_Original: CacheWillUpdateCallback = js.native
  }
}
