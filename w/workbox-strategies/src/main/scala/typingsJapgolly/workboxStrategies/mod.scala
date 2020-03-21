package typingsJapgolly.workboxStrategies

import typingsJapgolly.workboxStrategies.cacheFirstMod.CacheFirstOptions
import typingsJapgolly.workboxStrategies.cacheOnlyMod.CacheOnlyOptions
import typingsJapgolly.workboxStrategies.networkFirstMod.NetworkFirstOptions
import typingsJapgolly.workboxStrategies.networkOnlyMod.NetworkOnlyOptions
import typingsJapgolly.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-strategies", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CacheFirst ()
    extends typingsJapgolly.workboxStrategies.cacheFirstMod.CacheFirst {
    def this(options: CacheFirstOptions) = this()
  }
  
  @js.native
  class CacheOnly ()
    extends typingsJapgolly.workboxStrategies.cacheOnlyMod.CacheOnly {
    def this(options: CacheOnlyOptions) = this()
  }
  
  @js.native
  class NetworkFirst ()
    extends typingsJapgolly.workboxStrategies.networkFirstMod.NetworkFirst {
    def this(options: NetworkFirstOptions) = this()
  }
  
  @js.native
  class NetworkOnly ()
    extends typingsJapgolly.workboxStrategies.networkOnlyMod.NetworkOnly {
    def this(options: NetworkOnlyOptions) = this()
  }
  
  @js.native
  class StaleWhileRevalidate ()
    extends typingsJapgolly.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidate {
    def this(options: StaleWhileRevalidateOptions) = this()
  }
  
}

