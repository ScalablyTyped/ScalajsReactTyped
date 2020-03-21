package typingsJapgolly.tablesorter.parserTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tablesorter.tablesorterStrings.text
  - typingsJapgolly.tablesorter.tablesorterStrings.numeric
*/
trait ParserType extends js.Object

object ParserType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def numeric: typingsJapgolly.tablesorter.tablesorterStrings.numeric = this.cast("numeric")
  @scala.inline
  def text: typingsJapgolly.tablesorter.tablesorterStrings.text = this.cast("text")
}

