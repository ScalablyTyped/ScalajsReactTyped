package typingsJapgolly.micromarkExtensionFrontmatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHtmlMod {
  
  @JSImport("micromark-extension-frontmatter/lib/html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def frontmatterHtml(): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterHtml")().asInstanceOf[HtmlExtension]
  inline def frontmatterHtml(options: typingsJapgolly.micromarkExtensionFrontmatter.devMattersMod.Options): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterHtml")(options.asInstanceOf[js.Any]).asInstanceOf[HtmlExtension]
  
  type Handle = typingsJapgolly.micromarkUtilTypes.mod.Handle
  
  type HtmlExtension = typingsJapgolly.micromarkUtilTypes.mod.HtmlExtension
  
  type Options = typingsJapgolly.micromarkExtensionFrontmatter.devMattersMod.Options
}
