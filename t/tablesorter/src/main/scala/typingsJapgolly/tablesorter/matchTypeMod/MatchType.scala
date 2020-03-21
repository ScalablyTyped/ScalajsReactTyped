package typingsJapgolly.tablesorter.matchTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tablesorter.tablesorterStrings.exact
  - typingsJapgolly.tablesorter.tablesorterStrings.`match`
*/
trait MatchType extends js.Object

object MatchType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exact: typingsJapgolly.tablesorter.tablesorterStrings.exact = this.cast("exact")
  @scala.inline
  def `match`: typingsJapgolly.tablesorter.tablesorterStrings.`match` = this.cast("match")
}

