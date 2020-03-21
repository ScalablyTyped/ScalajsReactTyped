package typingsJapgolly.tablesorter.columnFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tablesorter.tablesorterStrings.`false`
  - typingsJapgolly.tablesorter.tablesorterStrings.parsed
  - typingsJapgolly.tablesorter.tablesorterStrings.default
*/
trait ColumnFilter extends js.Object

object ColumnFilter {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.tablesorter.tablesorterStrings.default = this.cast("default")
  @scala.inline
  def `false`: typingsJapgolly.tablesorter.tablesorterStrings.`false` = this.cast("false")
  @scala.inline
  def parsed: typingsJapgolly.tablesorter.tablesorterStrings.parsed = this.cast("parsed")
}

