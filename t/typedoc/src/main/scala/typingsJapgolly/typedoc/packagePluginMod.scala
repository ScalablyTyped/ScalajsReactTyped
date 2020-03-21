package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentMod.AbstractComponent
import typingsJapgolly.typedoc.converterConverterMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/PackagePlugin", JSImport.Namespace)
@js.native
object packagePluginMod extends js.Object {
  @js.native
  class PackagePlugin () extends AbstractComponent[Converter] {
    var noReadmeFile: js.UndefOr[js.Any] = js.native
    var onBegin: js.Any = js.native
    var onBeginDocument: js.Any = js.native
    var onBeginResolve: js.Any = js.native
    var packageFile: js.UndefOr[js.Any] = js.native
    var readme: String = js.native
    var readmeFile: js.UndefOr[js.Any] = js.native
    var visited: js.Any = js.native
  }
  
}

