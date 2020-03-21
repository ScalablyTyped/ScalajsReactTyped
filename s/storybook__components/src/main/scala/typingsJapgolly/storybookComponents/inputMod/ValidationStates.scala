package typingsJapgolly.storybookComponents.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.storybookComponents.storybookComponentsStrings.valid
  - typingsJapgolly.storybookComponents.storybookComponentsStrings.error
  - typingsJapgolly.storybookComponents.storybookComponentsStrings.warn
*/
trait ValidationStates extends js.Object

object ValidationStates {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.storybookComponents.storybookComponentsStrings.error = this.cast("error")
  @scala.inline
  def valid: typingsJapgolly.storybookComponents.storybookComponentsStrings.valid = this.cast("valid")
  @scala.inline
  def warn: typingsJapgolly.storybookComponents.storybookComponentsStrings.warn = this.cast("warn")
}

