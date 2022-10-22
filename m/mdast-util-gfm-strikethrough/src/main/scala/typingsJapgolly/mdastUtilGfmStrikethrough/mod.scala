package typingsJapgolly.mdastUtilGfmStrikethrough

import typingsJapgolly.mdastUtilFromMarkdown.mod.Extension
import typingsJapgolly.mdastUtilFromMarkdown.mod.Handle
import typingsJapgolly.mdastUtilToMarkdown.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-gfm-strikethrough", "gfmStrikethroughFromMarkdown")
  @js.native
  val gfmStrikethroughFromMarkdown: FromMarkdownExtension = js.native
  
  @JSImport("mdast-util-gfm-strikethrough", "gfmStrikethroughToMarkdown")
  @js.native
  val gfmStrikethroughToMarkdown: ToMarkdownExtension = js.native
  
  type Delete = typingsJapgolly.mdast.mod.Delete
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type ToMarkdownExtension = Options
  
  type ToMarkdownHandle = typingsJapgolly.mdastUtilToMarkdown.mod.Handle
}
