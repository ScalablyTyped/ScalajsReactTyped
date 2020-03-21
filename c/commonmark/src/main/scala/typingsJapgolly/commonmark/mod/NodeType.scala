package typingsJapgolly.commonmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.commonmark.commonmarkStrings.text
  - typingsJapgolly.commonmark.commonmarkStrings.softbreak
  - typingsJapgolly.commonmark.commonmarkStrings.linebreak
  - typingsJapgolly.commonmark.commonmarkStrings.emph
  - typingsJapgolly.commonmark.commonmarkStrings.strong
  - typingsJapgolly.commonmark.commonmarkStrings.html_inline
  - typingsJapgolly.commonmark.commonmarkStrings.link
  - typingsJapgolly.commonmark.commonmarkStrings.image
  - typingsJapgolly.commonmark.commonmarkStrings.code
  - typingsJapgolly.commonmark.commonmarkStrings.document
  - typingsJapgolly.commonmark.commonmarkStrings.paragraph
  - typingsJapgolly.commonmark.commonmarkStrings.block_quote
  - typingsJapgolly.commonmark.commonmarkStrings.item
  - typingsJapgolly.commonmark.commonmarkStrings.list
  - typingsJapgolly.commonmark.commonmarkStrings.heading
  - typingsJapgolly.commonmark.commonmarkStrings.code_block
  - typingsJapgolly.commonmark.commonmarkStrings.html_block
  - typingsJapgolly.commonmark.commonmarkStrings.thematic_break
  - typingsJapgolly.commonmark.commonmarkStrings.custom_inline
  - typingsJapgolly.commonmark.commonmarkStrings.custom_block
*/
trait NodeType extends js.Object

object NodeType {
  @scala.inline
  def block_quote: typingsJapgolly.commonmark.commonmarkStrings.block_quote = this.cast("block_quote")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typingsJapgolly.commonmark.commonmarkStrings.code = this.cast("code")
  @scala.inline
  def code_block: typingsJapgolly.commonmark.commonmarkStrings.code_block = this.cast("code_block")
  @scala.inline
  def custom_block: typingsJapgolly.commonmark.commonmarkStrings.custom_block = this.cast("custom_block")
  @scala.inline
  def custom_inline: typingsJapgolly.commonmark.commonmarkStrings.custom_inline = this.cast("custom_inline")
  @scala.inline
  def document: typingsJapgolly.commonmark.commonmarkStrings.document = this.cast("document")
  @scala.inline
  def emph: typingsJapgolly.commonmark.commonmarkStrings.emph = this.cast("emph")
  @scala.inline
  def heading: typingsJapgolly.commonmark.commonmarkStrings.heading = this.cast("heading")
  @scala.inline
  def html_block: typingsJapgolly.commonmark.commonmarkStrings.html_block = this.cast("html_block")
  @scala.inline
  def html_inline: typingsJapgolly.commonmark.commonmarkStrings.html_inline = this.cast("html_inline")
  @scala.inline
  def image: typingsJapgolly.commonmark.commonmarkStrings.image = this.cast("image")
  @scala.inline
  def item: typingsJapgolly.commonmark.commonmarkStrings.item = this.cast("item")
  @scala.inline
  def linebreak: typingsJapgolly.commonmark.commonmarkStrings.linebreak = this.cast("linebreak")
  @scala.inline
  def link: typingsJapgolly.commonmark.commonmarkStrings.link = this.cast("link")
  @scala.inline
  def list: typingsJapgolly.commonmark.commonmarkStrings.list = this.cast("list")
  @scala.inline
  def paragraph: typingsJapgolly.commonmark.commonmarkStrings.paragraph = this.cast("paragraph")
  @scala.inline
  def softbreak: typingsJapgolly.commonmark.commonmarkStrings.softbreak = this.cast("softbreak")
  @scala.inline
  def strong: typingsJapgolly.commonmark.commonmarkStrings.strong = this.cast("strong")
  @scala.inline
  def text: typingsJapgolly.commonmark.commonmarkStrings.text = this.cast("text")
  @scala.inline
  def thematic_break: typingsJapgolly.commonmark.commonmarkStrings.thematic_break = this.cast("thematic_break")
}

