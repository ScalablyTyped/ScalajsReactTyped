package typingsJapgolly.reactReduxToastr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.success
  - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.info
  - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.warning
  - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.light
  - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.error
  - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.confirm
  - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.message
*/
trait toastType extends js.Object

object toastType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirm: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.confirm = this.cast("confirm")
  @scala.inline
  def error: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.info = this.cast("info")
  @scala.inline
  def light: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.light = this.cast("light")
  @scala.inline
  def message: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.message = this.cast("message")
  @scala.inline
  def success: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.warning = this.cast("warning")
}

