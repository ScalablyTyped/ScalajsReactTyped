package typingsJapgolly.jsdocToMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsdocToMarkdown.jsdocToMarkdownStrings.list
  - typingsJapgolly.jsdocToMarkdown.jsdocToMarkdownStrings.table
*/
trait RenderListFormat extends js.Object

object RenderListFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def list: typingsJapgolly.jsdocToMarkdown.jsdocToMarkdownStrings.list = this.cast("list")
  @scala.inline
  def table: typingsJapgolly.jsdocToMarkdown.jsdocToMarkdownStrings.table = this.cast("table")
}

