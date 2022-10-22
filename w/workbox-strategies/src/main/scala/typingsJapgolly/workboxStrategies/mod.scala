package typingsJapgolly.workboxStrategies

import typingsJapgolly.workboxStrategies.cacheFirstMod.CacheFirstOptions
import typingsJapgolly.workboxStrategies.cacheOnlyMod.CacheOnlyOptions
import typingsJapgolly.workboxStrategies.networkFirstMod.NetworkFirstOptions
import typingsJapgolly.workboxStrategies.networkOnlyMod.NetworkOnlyOptions
import typingsJapgolly.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-strategies", "CacheFirst")
  @js.native
  open class CacheFirst ()
    extends typingsJapgolly.workboxStrategies.cacheFirstMod.CacheFirst {
    def this(options: CacheFirstOptions) = this()
  }
  
  @JSImport("workbox-strategies", "CacheOnly")
  @js.native
  open class CacheOnly ()
    extends typingsJapgolly.workboxStrategies.cacheOnlyMod.CacheOnly {
    def this(options: CacheOnlyOptions) = this()
  }
  
  @JSImport("workbox-strategies", "NetworkFirst")
  @js.native
  open class NetworkFirst ()
    extends typingsJapgolly.workboxStrategies.networkFirstMod.NetworkFirst {
    def this(options: NetworkFirstOptions) = this()
  }
  
  @JSImport("workbox-strategies", "NetworkOnly")
  @js.native
  open class NetworkOnly ()
    extends typingsJapgolly.workboxStrategies.networkOnlyMod.NetworkOnly {
    def this(options: NetworkOnlyOptions) = this()
  }
  
  @JSImport("workbox-strategies", "StaleWhileRevalidate")
  @js.native
  open class StaleWhileRevalidate ()
    extends typingsJapgolly.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidate {
    def this(options: StaleWhileRevalidateOptions) = this()
  }
}
