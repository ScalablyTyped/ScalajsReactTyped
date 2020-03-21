package typingsJapgolly.workboxCacheableResponse

import typingsJapgolly.workboxCacheableResponse.cacheableResponseMod.CacheableResponseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-cacheable-response", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CacheableResponse ()
    extends typingsJapgolly.workboxCacheableResponse.cacheableResponseMod.CacheableResponse {
    def this(config: CacheableResponseConfig) = this()
  }
  
  @js.native
  class Plugin ()
    extends typingsJapgolly.workboxCacheableResponse.pluginMod.Plugin {
    def this(config: CacheableResponseConfig) = this()
  }
  
}

