package typingsJapgolly.mdastUtilGfmTaskListItem

import typingsJapgolly.mdastUtilFromMarkdown.mod.Extension
import typingsJapgolly.mdastUtilFromMarkdown.mod.Handle
import typingsJapgolly.mdastUtilGfmTaskListItem.mdastUtilGfmTaskListItemStrings.children
import typingsJapgolly.mdastUtilToMarkdown.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-gfm-task-list-item", "gfmTaskListItemFromMarkdown")
  @js.native
  val gfmTaskListItemFromMarkdown: FromMarkdownExtension = js.native
  
  @JSImport("mdast-util-gfm-task-list-item", "gfmTaskListItemToMarkdown")
  @js.native
  val gfmTaskListItemToMarkdown: ToMarkdownExtension = js.native
  
  type BlockContent = typingsJapgolly.mdast.mod.BlockContent
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type ListItem = typingsJapgolly.mdast.mod.ListItem
  
  type Paragraph = typingsJapgolly.mdast.mod.Paragraph
  
  /* Inlined std.Extract<mdast.mdast.Root | mdast.mdast.Content, unist.unist.Parent<unist.unist.Node<unist.unist.Data>, unist.unist.NodeData<unist.unist.Node<unist.unist.Data>>>> */
  type Parent = children
  
  type ToMarkdownExtension = Options
  
  type ToMarkdownHandle = typingsJapgolly.mdastUtilToMarkdown.mod.Handle
}
