package typingsJapgolly.handsontable.mod.Handsontable._editors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.handsontable.handsontableStrings.STATE_VIRGIN
  - typingsJapgolly.handsontable.handsontableStrings.STATE_EDITING
  - typingsJapgolly.handsontable.handsontableStrings.STATE_WAITING
  - typingsJapgolly.handsontable.handsontableStrings.STATE_FINISHED
*/
trait EditorState extends js.Object

object EditorState {
  @scala.inline
  def STATE_EDITING: typingsJapgolly.handsontable.handsontableStrings.STATE_EDITING = this.cast("STATE_EDITING")
  @scala.inline
  def STATE_FINISHED: typingsJapgolly.handsontable.handsontableStrings.STATE_FINISHED = this.cast("STATE_FINISHED")
  @scala.inline
  def STATE_VIRGIN: typingsJapgolly.handsontable.handsontableStrings.STATE_VIRGIN = this.cast("STATE_VIRGIN")
  @scala.inline
  def STATE_WAITING: typingsJapgolly.handsontable.handsontableStrings.STATE_WAITING = this.cast("STATE_WAITING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

