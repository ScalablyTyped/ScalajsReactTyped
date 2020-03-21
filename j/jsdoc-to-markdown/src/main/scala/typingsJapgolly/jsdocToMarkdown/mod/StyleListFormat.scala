package typingsJapgolly.jsdocToMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsdocToMarkdown.jsdocToMarkdownStrings.none
  - typingsJapgolly.jsdocToMarkdown.jsdocToMarkdownStrings.grouped
  - typingsJapgolly.jsdocToMarkdown.jsdocToMarkdownStrings.table
  - typingsJapgolly.jsdocToMarkdown.jsdocToMarkdownStrings.dl
*/
trait StyleListFormat extends js.Object

object StyleListFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dl: typingsJapgolly.jsdocToMarkdown.jsdocToMarkdownStrings.dl = this.cast("dl")
  @scala.inline
  def grouped: typingsJapgolly.jsdocToMarkdown.jsdocToMarkdownStrings.grouped = this.cast("grouped")
  @scala.inline
  def none: typingsJapgolly.jsdocToMarkdown.jsdocToMarkdownStrings.none = this.cast("none")
  @scala.inline
  def table: typingsJapgolly.jsdocToMarkdown.jsdocToMarkdownStrings.table = this.cast("table")
}

