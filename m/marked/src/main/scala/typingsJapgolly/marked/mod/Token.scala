package typingsJapgolly.marked.mod

import typingsJapgolly.marked.markedStrings.blockquote_end
import typingsJapgolly.marked.markedStrings.blockquote_start
import typingsJapgolly.marked.markedStrings.center
import typingsJapgolly.marked.markedStrings.code
import typingsJapgolly.marked.markedStrings.heading
import typingsJapgolly.marked.markedStrings.hr
import typingsJapgolly.marked.markedStrings.html
import typingsJapgolly.marked.markedStrings.indented
import typingsJapgolly.marked.markedStrings.left
import typingsJapgolly.marked.markedStrings.list_end
import typingsJapgolly.marked.markedStrings.list_item_end
import typingsJapgolly.marked.markedStrings.list_item_start
import typingsJapgolly.marked.markedStrings.list_start
import typingsJapgolly.marked.markedStrings.loose_item_start
import typingsJapgolly.marked.markedStrings.paragraph
import typingsJapgolly.marked.markedStrings.right
import typingsJapgolly.marked.markedStrings.space
import typingsJapgolly.marked.markedStrings.table
import typingsJapgolly.marked.markedStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.marked.mod.Tokens.Space
  - typingsJapgolly.marked.mod.Tokens.Code
  - typingsJapgolly.marked.mod.Tokens.Heading
  - typingsJapgolly.marked.mod.Tokens.Table
  - typingsJapgolly.marked.mod.Tokens.Hr
  - typingsJapgolly.marked.mod.Tokens.BlockquoteStart
  - typingsJapgolly.marked.mod.Tokens.BlockquoteEnd
  - typingsJapgolly.marked.mod.Tokens.ListStart
  - typingsJapgolly.marked.mod.Tokens.LooseItemStart
  - typingsJapgolly.marked.mod.Tokens.ListItemStart
  - typingsJapgolly.marked.mod.Tokens.ListItemEnd
  - typingsJapgolly.marked.mod.Tokens.ListEnd
  - typingsJapgolly.marked.mod.Tokens.Paragraph
  - typingsJapgolly.marked.mod.Tokens.HTML
  - typingsJapgolly.marked.mod.Tokens.Text
*/
trait Token extends js.Object

object Token {
  @scala.inline
  def LooseItemStart(`type`: loose_item_start): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def BlockquoteEnd(`type`: blockquote_end): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Code(text: String, `type`: code, codeBlockStyle: indented = null, lang: String = null): Token = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (codeBlockStyle != null) __obj.updateDynamic("codeBlockStyle")(codeBlockStyle.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def BlockquoteStart(`type`: blockquote_start): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Heading(depth: Double, text: String, `type`: heading): Token = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Table(
    align: js.Array[center | left | right | Null],
    cells: js.Array[js.Array[String]],
    header: js.Array[String],
    `type`: table
  ): Token = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ListStart(ordered: Boolean, `type`: list_start): Token = {
    val __obj = js.Dynamic.literal(ordered = ordered.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def HTML(pre: Boolean, text: String, `type`: html): Token = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Paragraph(text: String, `type`: paragraph, pre: js.UndefOr[Boolean] = js.undefined): Token = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(pre)) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ListItemStart(`type`: list_item_start): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Space(`type`: space): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ListEnd(`type`: list_end): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ListItemEnd(`type`: list_item_end): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Hr(`type`: hr): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Text(text: String, `type`: text): Token = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

