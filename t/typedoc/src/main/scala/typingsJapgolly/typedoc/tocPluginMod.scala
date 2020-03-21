package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentMod.AbstractComponent
import typingsJapgolly.typedoc.navigationItemMod.NavigationItem
import typingsJapgolly.typedoc.reflectionsMod.Reflection
import typingsJapgolly.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/TocPlugin", JSImport.Namespace)
@js.native
object tocPluginMod extends js.Object {
  @js.native
  class TocPlugin () extends AbstractComponent[Renderer] {
    var onRendererBeginPage: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TocPlugin extends js.Object {
    def buildToc(model: Reflection, trail: js.Array[Reflection], parent: NavigationItem): Unit = js.native
    def buildToc(
      model: Reflection,
      trail: js.Array[Reflection],
      parent: NavigationItem,
      restriction: js.Array[String]
    ): Unit = js.native
  }
  
}

