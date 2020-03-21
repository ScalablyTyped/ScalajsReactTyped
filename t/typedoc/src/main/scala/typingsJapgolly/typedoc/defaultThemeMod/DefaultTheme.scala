package typingsJapgolly.typedoc.defaultThemeMod

import typingsJapgolly.typedoc.navigationItemMod.NavigationItem
import typingsJapgolly.typedoc.reflectionGroupMod.ReflectionGroup
import typingsJapgolly.typedoc.reflectionsMod.ContainerReflection
import typingsJapgolly.typedoc.reflectionsMod.DeclarationReflection
import typingsJapgolly.typedoc.reflectionsMod.ProjectReflection
import typingsJapgolly.typedoc.reflectionsMod.Reflection
import typingsJapgolly.typedoc.rendererMod.Renderer
import typingsJapgolly.typedoc.themeMod.Theme
import typingsJapgolly.typedoc.urlMappingMod.UrlMapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme")
@js.native
class DefaultTheme protected () extends Theme {
  def this(renderer: Renderer, basePath: String) = this()
  var onRendererBegin: js.Any = js.native
  def getEntryPoint(project: ProjectReflection): ContainerReflection = js.native
  def getNavigation(project: ProjectReflection): NavigationItem = js.native
  def getUrls(project: ProjectReflection): js.Array[UrlMapping] = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme")
@js.native
object DefaultTheme extends js.Object {
  var MAPPINGS: js.Array[TemplateMapping] = js.native
  var URL_PREFIX: js.RegExp = js.native
  def applyAnchorUrl(reflection: Reflection, container: Reflection): Unit = js.native
  def applyGroupClasses(group: ReflectionGroup): Unit = js.native
  def applyReflectionClasses(reflection: DeclarationReflection): Unit = js.native
  def buildUrls(reflection: DeclarationReflection, urls: js.Array[UrlMapping]): js.Array[UrlMapping] = js.native
  def getMapping(reflection: DeclarationReflection): js.UndefOr[TemplateMapping] = js.native
  def getUrl(reflection: Reflection): String = js.native
  def getUrl(reflection: Reflection, relative: Reflection): String = js.native
  def getUrl(reflection: Reflection, relative: Reflection, separator: String): String = js.native
  def toStyleClass(str: String): String = js.native
}

