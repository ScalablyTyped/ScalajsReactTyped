package typingsJapgolly.handsontable.mod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default validator aliases the table has built-in.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.handsontable.handsontableStrings.autocomplete
  - typingsJapgolly.handsontable.handsontableStrings.date
  - typingsJapgolly.handsontable.handsontableStrings.numeric
  - typingsJapgolly.handsontable.handsontableStrings.time
*/
trait ValidatorType extends js.Object

object ValidatorType {
  @scala.inline
  def autocomplete: typingsJapgolly.handsontable.handsontableStrings.autocomplete = this.cast("autocomplete")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsJapgolly.handsontable.handsontableStrings.date = this.cast("date")
  @scala.inline
  def numeric: typingsJapgolly.handsontable.handsontableStrings.numeric = this.cast("numeric")
  @scala.inline
  def time: typingsJapgolly.handsontable.handsontableStrings.time = this.cast("time")
}

