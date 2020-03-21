package typingsJapgolly.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.exceljs.exceljsStrings.visible
  - typingsJapgolly.exceljs.exceljsStrings.hidden
  - typingsJapgolly.exceljs.exceljsStrings.veryHidden
*/
trait WorksheetState extends js.Object

object WorksheetState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hidden: typingsJapgolly.exceljs.exceljsStrings.hidden = this.cast("hidden")
  @scala.inline
  def veryHidden: typingsJapgolly.exceljs.exceljsStrings.veryHidden = this.cast("veryHidden")
  @scala.inline
  def visible: typingsJapgolly.exceljs.exceljsStrings.visible = this.cast("visible")
}

