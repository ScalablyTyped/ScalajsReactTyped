package typingsJapgolly.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.blessed.blessedStrings.error
  - typingsJapgolly.blessed.blessedStrings.submit
  - typingsJapgolly.blessed.blessedStrings.cancel
  - typingsJapgolly.blessed.blessedStrings.action
*/
trait TextareaElementEventType extends js.Object

object TextareaElementEventType {
  @scala.inline
  def action: typingsJapgolly.blessed.blessedStrings.action = this.cast("action")
  @scala.inline
  def cancel: typingsJapgolly.blessed.blessedStrings.cancel = this.cast("cancel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.blessed.blessedStrings.error = this.cast("error")
  @scala.inline
  def submit: typingsJapgolly.blessed.blessedStrings.submit = this.cast("submit")
}

