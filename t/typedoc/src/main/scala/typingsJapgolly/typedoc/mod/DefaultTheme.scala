package typingsJapgolly.typedoc.mod

import typingsJapgolly.typedoc.defaultThemeMod.TemplateMapping
import typingsJapgolly.typedoc.reflectionGroupMod.ReflectionGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "DefaultTheme")
@js.native
class DefaultTheme protected ()
  extends typingsJapgolly.typedoc.defaultThemeMod.DefaultTheme {
  def this(renderer: typingsJapgolly.typedoc.rendererMod.Renderer, basePath: String) = this()
}

/* static members */
@JSImport("typedoc", "DefaultTheme")
@js.native
object DefaultTheme extends js.Object {
  var MAPPINGS: js.Array[TemplateMapping] = js.native
  var URL_PREFIX: js.RegExp = js.native
  def applyAnchorUrl(
    reflection: typingsJapgolly.typedoc.reflectionsMod.Reflection,
    container: typingsJapgolly.typedoc.reflectionsMod.Reflection
  ): Unit = js.native
  def applyGroupClasses(group: ReflectionGroup): Unit = js.native
  def applyReflectionClasses(reflection: typingsJapgolly.typedoc.reflectionsMod.DeclarationReflection): Unit = js.native
  def buildUrls(
    reflection: typingsJapgolly.typedoc.reflectionsMod.DeclarationReflection,
    urls: js.Array[typingsJapgolly.typedoc.urlMappingMod.UrlMapping]
  ): js.Array[typingsJapgolly.typedoc.urlMappingMod.UrlMapping] = js.native
  def getMapping(reflection: typingsJapgolly.typedoc.reflectionsMod.DeclarationReflection): js.UndefOr[TemplateMapping] = js.native
  def getUrl(reflection: typingsJapgolly.typedoc.reflectionsMod.Reflection): String = js.native
  def getUrl(
    reflection: typingsJapgolly.typedoc.reflectionsMod.Reflection,
    relative: typingsJapgolly.typedoc.reflectionsMod.Reflection
  ): String = js.native
  def getUrl(
    reflection: typingsJapgolly.typedoc.reflectionsMod.Reflection,
    relative: typingsJapgolly.typedoc.reflectionsMod.Reflection,
    separator: String
  ): String = js.native
  def toStyleClass(str: String): String = js.native
}

