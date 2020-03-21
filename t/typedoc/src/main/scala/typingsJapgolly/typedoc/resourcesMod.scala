package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.helpersMod.HelperStack
import typingsJapgolly.typedoc.templatesMod.PartialStack
import typingsJapgolly.typedoc.templatesMod.TemplateStack
import typingsJapgolly.typedoc.themeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/utils/resources", JSImport.Namespace)
@js.native
object resourcesMod extends js.Object {
  @js.native
  class Resources protected () extends js.Object {
    def this(theme: Theme) = this()
    var helpers: HelperStack = js.native
    var isActive: js.Any = js.native
    var layouts: TemplateStack = js.native
    var partials: PartialStack = js.native
    var templates: TemplateStack = js.native
    var theme: js.Any = js.native
    def activate(): Boolean = js.native
    def addDirectory(name: String, path: String): Unit = js.native
    def deactivate(): Boolean = js.native
    def getTheme(): Theme = js.native
    def removeAllDirectories(): Unit = js.native
    def removeDirectory(name: String): Unit = js.native
  }
  
}

