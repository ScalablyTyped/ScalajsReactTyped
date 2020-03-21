package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentMod.AbstractComponent
import typingsJapgolly.typedoc.converterConverterMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/DynamicModulePlugin", JSImport.Namespace)
@js.native
object dynamicModulePluginMod extends js.Object {
  @js.native
  class DynamicModulePlugin () extends AbstractComponent[Converter] {
    var basePath: js.Any = js.native
    var onBegin: js.Any = js.native
    var onBeginResolve: js.Any = js.native
    var onDeclaration: js.Any = js.native
    var reflections: js.Any = js.native
  }
  
}

