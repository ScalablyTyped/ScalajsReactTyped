package typingsJapgolly.reactReduxToastr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.success
  - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.info
  - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.warning
  - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.error
*/
trait iconType extends js.Object

object iconType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.info = this.cast("info")
  @scala.inline
  def success: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.warning = this.cast("warning")
}

