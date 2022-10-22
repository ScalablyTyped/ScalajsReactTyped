package typingsJapgolly.micromarkExtensionGfm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-extension-gfm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gfm(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfm")().asInstanceOf[Extension]
  inline def gfm(options: typingsJapgolly.micromarkExtensionGfmStrikethrough.libSyntaxMod.Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfm")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  inline def gfmHtml(): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmHtml")().asInstanceOf[HtmlExtension]
  inline def gfmHtml(options: typingsJapgolly.micromarkExtensionGfmFootnote.libHtmlMod.Options): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmHtml")(options.asInstanceOf[js.Any]).asInstanceOf[HtmlExtension]
  
  type Extension = typingsJapgolly.micromarkUtilTypes.mod.Extension
  
  type HtmlExtension = typingsJapgolly.micromarkUtilTypes.mod.HtmlExtension
  
  type HtmlOptions = typingsJapgolly.micromarkExtensionGfmFootnote.mod.HtmlOptions
  
  type Options = typingsJapgolly.micromarkExtensionGfmStrikethrough.mod.Options
}
