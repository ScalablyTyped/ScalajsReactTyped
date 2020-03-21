package typingsJapgolly.fundamentalReact.labelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.success
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.warning
  - typingsJapgolly.fundamentalReact.fundamentalReactStrings.error
*/
trait LabelTypes extends js.Object

object LabelTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.fundamentalReact.fundamentalReactStrings.error = this.cast("error")
  @scala.inline
  def success: typingsJapgolly.fundamentalReact.fundamentalReactStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsJapgolly.fundamentalReact.fundamentalReactStrings.warning = this.cast("warning")
}

