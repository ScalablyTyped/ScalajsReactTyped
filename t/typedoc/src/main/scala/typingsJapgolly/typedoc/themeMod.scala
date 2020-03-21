package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentMod.AbstractComponent
import typingsJapgolly.typedoc.navigationItemMod.NavigationItem
import typingsJapgolly.typedoc.projectMod.ProjectReflection
import typingsJapgolly.typedoc.rendererMod.Renderer
import typingsJapgolly.typedoc.resourcesMod.Resources
import typingsJapgolly.typedoc.urlMappingMod.UrlMapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/theme", JSImport.Namespace)
@js.native
object themeMod extends js.Object {
  @js.native
  abstract class Theme protected () extends AbstractComponent[Renderer] {
    def this(renderer: Renderer, basePath: String) = this()
    var basePath: String = js.native
    var resources: Resources = js.native
    def getNavigation(project: ProjectReflection): NavigationItem = js.native
    def getUrls(project: ProjectReflection): js.Array[UrlMapping] = js.native
    def isOutputDirectory(path: String): Boolean = js.native
  }
  
}

