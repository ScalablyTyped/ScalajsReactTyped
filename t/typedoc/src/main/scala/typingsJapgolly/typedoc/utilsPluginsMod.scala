package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.applicationMod.Application
import typingsJapgolly.typedoc.componentMod.AbstractComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/plugins", JSImport.Namespace)
@js.native
object utilsPluginsMod extends js.Object {
  @js.native
  class PluginHost () extends AbstractComponent[Application] {
    var discoverNpmPlugins: js.Any = js.native
    var plugins: js.Array[String] = js.native
    def load(): Boolean = js.native
  }
  
}

