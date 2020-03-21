package typingsJapgolly.bookshelf.mod

import typingsJapgolly.bookshelf.bookshelfStrings.asc_
import typingsJapgolly.bookshelf.bookshelfStrings.desc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bookshelf.bookshelfStrings.ASC
  - typingsJapgolly.bookshelf.bookshelfStrings.asc_
  - typingsJapgolly.bookshelf.bookshelfStrings.DESC
  - typingsJapgolly.bookshelf.bookshelfStrings.desc_
*/
trait SortOrder extends js.Object

object SortOrder {
  @scala.inline
  def ASC: typingsJapgolly.bookshelf.bookshelfStrings.ASC = this.cast("ASC")
  @scala.inline
  def DESC: typingsJapgolly.bookshelf.bookshelfStrings.DESC = this.cast("DESC")
  @scala.inline
  def asc: asc_ = this.cast("asc")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: desc_ = this.cast("desc")
}

