package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.defaultThemeMod.DefaultTheme
import typingsJapgolly.typedoc.navigationItemMod.NavigationItem
import typingsJapgolly.typedoc.reflectionsMod.DeclarationReflection
import typingsJapgolly.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/themes/MinimalTheme", JSImport.Namespace)
@js.native
object minimalThemeMod extends js.Object {
  @js.native
  class MinimalTheme protected () extends DefaultTheme {
    def this(renderer: Renderer, basePath: String) = this()
    var onRendererBeginPage: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object MinimalTheme extends js.Object {
    def buildToc(model: DeclarationReflection, parent: NavigationItem): Unit = js.native
  }
  
}

