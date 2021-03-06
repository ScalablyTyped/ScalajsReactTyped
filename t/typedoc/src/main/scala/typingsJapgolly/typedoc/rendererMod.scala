package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.applicationMod.Application
import typingsJapgolly.typedoc.componentMod.ChildableComponent
import typingsJapgolly.typedoc.outputComponentsMod.RendererComponent
import typingsJapgolly.typedoc.projectMod.ProjectReflection
import typingsJapgolly.typedoc.themeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/renderer", JSImport.Namespace)
@js.native
object rendererMod extends js.Object {
  @js.native
  class Renderer () extends ChildableComponent[Application, RendererComponent] {
    var disableOutputCheck: Boolean = js.native
    var entryPoint: String = js.native
    var gaID: String = js.native
    var gaSite: String = js.native
    var hideGenerator: Boolean = js.native
    var prepareOutputDirectory: js.Any = js.native
    var prepareTheme: js.Any = js.native
    var renderDocument: js.Any = js.native
    var theme: js.UndefOr[Theme] = js.native
    var themeName: String = js.native
    var toc: js.Array[String] = js.native
    def render(project: ProjectReflection, outputDirectory: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Renderer extends js.Object {
    def getDefaultTheme(): String = js.native
    def getThemeDirectory(): String = js.native
  }
  
}

