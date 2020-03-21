package typingsJapgolly.filePathFilter.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.filePathFilter.filePathFilterStrings.include
  - typingsJapgolly.filePathFilter.filePathFilterStrings.exclude
*/
trait Filter extends js.Object

object Filter {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exclude: typingsJapgolly.filePathFilter.filePathFilterStrings.exclude = this.cast("exclude")
  @scala.inline
  def include: typingsJapgolly.filePathFilter.filePathFilterStrings.include = this.cast("include")
}

