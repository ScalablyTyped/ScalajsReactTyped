package typingsJapgolly.fundamentalReact.formInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.normal
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.valid
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.invalid
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.warning
*/
trait InputType extends js.Object

object InputType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invalid: typingsJapgolly.fundamentalReact.fundamentalReactStrings.invalid = this.cast("invalid")
  @scala.inline
  def normal: typingsJapgolly.fundamentalReact.fundamentalReactStrings.normal = this.cast("normal")
  @scala.inline
  def valid: typingsJapgolly.fundamentalReact.fundamentalReactStrings.valid = this.cast("valid")
  @scala.inline
  def warning: typingsJapgolly.fundamentalReact.fundamentalReactStrings.warning = this.cast("warning")
}

