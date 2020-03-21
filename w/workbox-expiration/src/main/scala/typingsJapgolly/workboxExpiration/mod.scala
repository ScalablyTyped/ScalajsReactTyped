package typingsJapgolly.workboxExpiration

import typingsJapgolly.workboxExpiration.cacheExpirationMod.CacheExpirationConfig
import typingsJapgolly.workboxExpiration.pluginMod.ExpirationPluginConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-expiration", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CacheExpiration protected ()
    extends typingsJapgolly.workboxExpiration.cacheExpirationMod.CacheExpiration {
    def this(cacheName: String) = this()
    def this(cacheName: String, config: CacheExpirationConfig) = this()
  }
  
  @js.native
  class Plugin ()
    extends typingsJapgolly.workboxExpiration.pluginMod.Plugin {
    def this(config: ExpirationPluginConfig) = this()
  }
  
}

