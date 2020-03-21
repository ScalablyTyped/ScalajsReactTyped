package typingsJapgolly.toastr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.toastr.toastrStrings.error
  - typingsJapgolly.toastr.toastrStrings.info
  - typingsJapgolly.toastr.toastrStrings.success
  - typingsJapgolly.toastr.toastrStrings.warning
*/
trait ToastrType extends js.Object

object ToastrType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.toastr.toastrStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.toastr.toastrStrings.info = this.cast("info")
  @scala.inline
  def success: typingsJapgolly.toastr.toastrStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsJapgolly.toastr.toastrStrings.warning = this.cast("warning")
}

