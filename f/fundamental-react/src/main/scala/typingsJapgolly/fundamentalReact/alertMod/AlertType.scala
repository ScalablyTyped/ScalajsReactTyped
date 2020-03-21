package typingsJapgolly.fundamentalReact.alertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.warning
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.error
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.success
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.information
*/
trait AlertType extends js.Object

object AlertType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.fundamentalReact.fundamentalReactStrings.error = this.cast("error")
  @scala.inline
  def information: typingsJapgolly.fundamentalReact.fundamentalReactStrings.information = this.cast("information")
  @scala.inline
  def success: typingsJapgolly.fundamentalReact.fundamentalReactStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsJapgolly.fundamentalReact.fundamentalReactStrings.warning = this.cast("warning")
}

