package typingsJapgolly.reactAlert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactAlert.reactAlertStrings.info
  - typingsJapgolly.reactAlert.reactAlertStrings.success
  - typingsJapgolly.reactAlert.reactAlertStrings.error
*/
trait AlertType extends js.Object

object AlertType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.reactAlert.reactAlertStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.reactAlert.reactAlertStrings.info = this.cast("info")
  @scala.inline
  def success: typingsJapgolly.reactAlert.reactAlertStrings.success = this.cast("success")
}

