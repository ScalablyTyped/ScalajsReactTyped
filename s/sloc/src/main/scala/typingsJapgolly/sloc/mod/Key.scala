package typingsJapgolly.sloc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sloc.slocStrings.total
  - typingsJapgolly.sloc.slocStrings.source
  - typingsJapgolly.sloc.slocStrings.comment
  - typingsJapgolly.sloc.slocStrings.single
  - typingsJapgolly.sloc.slocStrings.block
  - typingsJapgolly.sloc.slocStrings.mixed
  - typingsJapgolly.sloc.slocStrings.blockEmpty
  - typingsJapgolly.sloc.slocStrings.empty
  - typingsJapgolly.sloc.slocStrings.todo
*/
trait Key extends js.Object

object Key {
  @scala.inline
  def block: typingsJapgolly.sloc.slocStrings.block = this.cast("block")
  @scala.inline
  def blockEmpty: typingsJapgolly.sloc.slocStrings.blockEmpty = this.cast("blockEmpty")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def comment: typingsJapgolly.sloc.slocStrings.comment = this.cast("comment")
  @scala.inline
  def empty: typingsJapgolly.sloc.slocStrings.empty = this.cast("empty")
  @scala.inline
  def mixed: typingsJapgolly.sloc.slocStrings.mixed = this.cast("mixed")
  @scala.inline
  def single: typingsJapgolly.sloc.slocStrings.single = this.cast("single")
  @scala.inline
  def source: typingsJapgolly.sloc.slocStrings.source = this.cast("source")
  @scala.inline
  def todo: typingsJapgolly.sloc.slocStrings.todo = this.cast("todo")
  @scala.inline
  def total: typingsJapgolly.sloc.slocStrings.total = this.cast("total")
}

