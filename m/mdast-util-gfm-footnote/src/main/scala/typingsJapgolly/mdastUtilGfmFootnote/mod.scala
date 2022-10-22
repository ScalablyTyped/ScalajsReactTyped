package typingsJapgolly.mdastUtilGfmFootnote

import typingsJapgolly.mdastUtilFromMarkdown.mod.Extension
import typingsJapgolly.mdastUtilFromMarkdown.mod.Handle
import typingsJapgolly.mdastUtilToMarkdown.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-gfm-footnote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gfmFootnoteFromMarkdown(): FromMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFootnoteFromMarkdown")().asInstanceOf[FromMarkdownExtension]
  
  inline def gfmFootnoteToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFootnoteToMarkdown")().asInstanceOf[ToMarkdownExtension]
  
  type FootnoteDefinition = typingsJapgolly.mdast.mod.FootnoteDefinition
  
  type FootnoteReference = typingsJapgolly.mdast.mod.FootnoteReference
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type Map = typingsJapgolly.mdastUtilToMarkdown.mod.Map
  
  type ToMarkdownExtension = Options
  
  type ToMarkdownHandle = typingsJapgolly.mdastUtilToMarkdown.mod.Handle
}
