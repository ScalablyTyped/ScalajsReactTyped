package typingsJapgolly.micromarkExtensionGfmFootnote

import typingsJapgolly.micromarkExtensionGfmFootnote.libHtmlMod.HtmlExtension
import typingsJapgolly.micromarkExtensionGfmFootnote.libHtmlMod.Options
import typingsJapgolly.micromarkExtensionGfmFootnote.libSyntaxMod.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-extension-gfm-footnote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gfmFootnote(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFootnote")().asInstanceOf[Extension]
  
  inline def gfmFootnoteHtml(): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFootnoteHtml")().asInstanceOf[HtmlExtension]
  inline def gfmFootnoteHtml(options: Options): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFootnoteHtml")(options.asInstanceOf[js.Any]).asInstanceOf[HtmlExtension]
  
  type HtmlOptions = typingsJapgolly.micromarkExtensionGfmFootnote.devLibHtmlMod.Options
}
