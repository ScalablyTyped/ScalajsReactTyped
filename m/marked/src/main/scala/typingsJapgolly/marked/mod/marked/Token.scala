package typingsJapgolly.marked.mod.marked

import typingsJapgolly.marked.markedStrings._empty
import typingsJapgolly.marked.markedStrings.center
import typingsJapgolly.marked.markedStrings.html
import typingsJapgolly.marked.markedStrings.left
import typingsJapgolly.marked.markedStrings.right
import typingsJapgolly.marked.markedStrings.text
import typingsJapgolly.marked.mod.marked.Tokens.ListItem
import typingsJapgolly.marked.mod.marked.Tokens.TableCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.marked.mod.marked.Tokens.Space
  - typingsJapgolly.marked.mod.marked.Tokens.Code
  - typingsJapgolly.marked.mod.marked.Tokens.Heading
  - typingsJapgolly.marked.mod.marked.Tokens.Table
  - typingsJapgolly.marked.mod.marked.Tokens.Hr
  - typingsJapgolly.marked.mod.marked.Tokens.Blockquote
  - typingsJapgolly.marked.mod.marked.Tokens.List
  - typingsJapgolly.marked.mod.marked.Tokens.ListItem
  - typingsJapgolly.marked.mod.marked.Tokens.Paragraph
  - typingsJapgolly.marked.mod.marked.Tokens.HTML
  - typingsJapgolly.marked.mod.marked.Tokens.Text
  - typingsJapgolly.marked.mod.marked.Tokens.Def
  - typingsJapgolly.marked.mod.marked.Tokens.Escape
  - typingsJapgolly.marked.mod.marked.Tokens.Tag
  - typingsJapgolly.marked.mod.marked.Tokens.Image
  - typingsJapgolly.marked.mod.marked.Tokens.Link
  - typingsJapgolly.marked.mod.marked.Tokens.Strong
  - typingsJapgolly.marked.mod.marked.Tokens.Em
  - typingsJapgolly.marked.mod.marked.Tokens.Codespan
  - typingsJapgolly.marked.mod.marked.Tokens.Br
  - typingsJapgolly.marked.mod.marked.Tokens.Del
*/
trait Token extends StObject
object Token {
  
  inline def Blockquote(raw: String, text: String, tokens: js.Array[Token]): typingsJapgolly.marked.mod.marked.Tokens.Blockquote = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blockquote")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Blockquote]
  }
  
  inline def Br(raw: String): typingsJapgolly.marked.mod.marked.Tokens.Br = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("br")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Br]
  }
  
  inline def Code(raw: String, text: String): typingsJapgolly.marked.mod.marked.Tokens.Code = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("code")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Code]
  }
  
  inline def Codespan(raw: String, text: String): typingsJapgolly.marked.mod.marked.Tokens.Codespan = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("codespan")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Codespan]
  }
  
  inline def Def(href: String, raw: String, tag: String, title: String): typingsJapgolly.marked.mod.marked.Tokens.Def = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("def")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Def]
  }
  
  inline def Del(raw: String, text: String, tokens: js.Array[Token]): typingsJapgolly.marked.mod.marked.Tokens.Del = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("del")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Del]
  }
  
  inline def Em(raw: String, text: String, tokens: js.Array[Token]): typingsJapgolly.marked.mod.marked.Tokens.Em = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("em")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Em]
  }
  
  inline def Escape(raw: String, text: String): typingsJapgolly.marked.mod.marked.Tokens.Escape = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("escape")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Escape]
  }
  
  inline def HTML(pre: Boolean, raw: String, text: String): typingsJapgolly.marked.mod.marked.Tokens.HTML = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("html")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.HTML]
  }
  
  inline def Heading(depth: Double, raw: String, text: String, tokens: js.Array[Token]): typingsJapgolly.marked.mod.marked.Tokens.Heading = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heading")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Heading]
  }
  
  inline def Hr(raw: String): typingsJapgolly.marked.mod.marked.Tokens.Hr = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hr")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Hr]
  }
  
  inline def Image(href: String, raw: String, text: String, title: String): typingsJapgolly.marked.mod.marked.Tokens.Image = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Image]
  }
  
  inline def Link(href: String, raw: String, text: String, title: String, tokens: js.Array[Token]): typingsJapgolly.marked.mod.marked.Tokens.Link = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("link")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Link]
  }
  
  inline def List(items: js.Array[ListItem], loose: Boolean, ordered: Boolean, raw: String, start: Double | _empty): typingsJapgolly.marked.mod.marked.Tokens.List = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], ordered = ordered.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.List]
  }
  
  inline def ListItem(loose: Boolean, raw: String, task: Boolean, text: String, tokens: js.Array[Token]): typingsJapgolly.marked.mod.marked.Tokens.ListItem = {
    val __obj = js.Dynamic.literal(loose = loose.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list_item")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.ListItem]
  }
  
  inline def Paragraph(raw: String, text: String, tokens: js.Array[Token]): typingsJapgolly.marked.mod.marked.Tokens.Paragraph = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("paragraph")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Paragraph]
  }
  
  inline def Space(raw: String): typingsJapgolly.marked.mod.marked.Tokens.Space = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("space")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Space]
  }
  
  inline def Strong(raw: String, text: String, tokens: js.Array[Token]): typingsJapgolly.marked.mod.marked.Tokens.Strong = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("strong")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Strong]
  }
  
  inline def Table(
    align: js.Array[center | left | right | Null],
    header: js.Array[TableCell],
    raw: String,
    rows: js.Array[js.Array[TableCell]]
  ): typingsJapgolly.marked.mod.marked.Tokens.Table = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("table")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Table]
  }
  
  inline def Tag(inLink: Boolean, inRawBlock: Boolean, raw: String, text: String, `type`: text | html): typingsJapgolly.marked.mod.marked.Tokens.Tag = {
    val __obj = js.Dynamic.literal(inLink = inLink.asInstanceOf[js.Any], inRawBlock = inRawBlock.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Tag]
  }
  
  inline def Text(raw: String, text: String): typingsJapgolly.marked.mod.marked.Tokens.Text = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[typingsJapgolly.marked.mod.marked.Tokens.Text]
  }
}
