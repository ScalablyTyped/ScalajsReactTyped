package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.coreservicesMod.LocationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/memoryLocationConfig", JSImport.Namespace)
@js.native
object memoryLocationConfigMod extends js.Object {
  @js.native
  class MemoryLocationConfig () extends LocationConfig {
    var _baseHref: String = js.native
    var _hashPrefix: String = js.native
    var _host: String = js.native
    var _port: Double = js.native
    var _protocol: String = js.native
    @JSName("dispose")
    var dispose_Original: js.Function0[_] = js.native
    def hashPrefix(newval: js.Any): js.Any = js.native
  }
  
}

