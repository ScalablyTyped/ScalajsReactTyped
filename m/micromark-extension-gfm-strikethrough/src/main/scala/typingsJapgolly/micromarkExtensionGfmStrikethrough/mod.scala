package typingsJapgolly.micromarkExtensionGfmStrikethrough

import typingsJapgolly.micromarkExtensionGfmStrikethrough.libHtmlMod.HtmlExtension
import typingsJapgolly.micromarkExtensionGfmStrikethrough.libSyntaxMod.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-extension-gfm-strikethrough", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gfmStrikethrough(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmStrikethrough")().asInstanceOf[Extension]
  inline def gfmStrikethrough(options: typingsJapgolly.micromarkExtensionGfmStrikethrough.libSyntaxMod.Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmStrikethrough")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  @JSImport("micromark-extension-gfm-strikethrough", "gfmStrikethroughHtml")
  @js.native
  val gfmStrikethroughHtml: HtmlExtension = js.native
  
  type Options = typingsJapgolly.micromarkExtensionGfmStrikethrough.devLibSyntaxMod.Options
}
