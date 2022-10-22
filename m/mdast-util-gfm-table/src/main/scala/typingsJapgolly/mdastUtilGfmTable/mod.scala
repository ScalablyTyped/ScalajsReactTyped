package typingsJapgolly.mdastUtilGfmTable

import typingsJapgolly.mdastUtilGfmTable.libMod.FromMarkdownExtension
import typingsJapgolly.mdastUtilGfmTable.libMod.ToMarkdownExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-gfm-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mdast-util-gfm-table", "gfmTableFromMarkdown")
  @js.native
  val gfmTableFromMarkdown: FromMarkdownExtension = js.native
  
  inline def gfmTableToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmTableToMarkdown")().asInstanceOf[ToMarkdownExtension]
  inline def gfmTableToMarkdown(options: typingsJapgolly.mdastUtilGfmTable.libMod.Options): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmTableToMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[ToMarkdownExtension]
  
  type Options = typingsJapgolly.mdastUtilGfmTable.libMod.Options
}
