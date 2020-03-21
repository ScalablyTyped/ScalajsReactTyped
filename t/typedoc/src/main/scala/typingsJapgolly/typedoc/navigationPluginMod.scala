package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentMod.AbstractComponent
import typingsJapgolly.typedoc.navigationItemMod.NavigationItem
import typingsJapgolly.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/NavigationPlugin", JSImport.Namespace)
@js.native
object navigationPluginMod extends js.Object {
  @js.native
  class NavigationPlugin () extends AbstractComponent[Renderer] {
    var navigation: NavigationItem = js.native
    var onBeginPage: js.Any = js.native
    var onBeginRenderer: js.Any = js.native
  }
  
}

