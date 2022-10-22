package typingsJapgolly.mdastUtilGfm

import typingsJapgolly.mdastUtilFromMarkdown.mod.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-util-gfm/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gfmFromMarkdown(): js.Array[FromMarkdownExtension] = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFromMarkdown")().asInstanceOf[js.Array[FromMarkdownExtension]]
  
  inline def gfmToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmToMarkdown")().asInstanceOf[ToMarkdownExtension]
  inline def gfmToMarkdown(options: typingsJapgolly.mdastUtilGfmTable.mod.Options): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmToMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[ToMarkdownExtension]
  
  type FromMarkdownExtension = Extension
  
  type Options = typingsJapgolly.mdastUtilGfmTable.mod.Options
  
  type ToMarkdownExtension = typingsJapgolly.mdastUtilToMarkdown.mod.Options
}
