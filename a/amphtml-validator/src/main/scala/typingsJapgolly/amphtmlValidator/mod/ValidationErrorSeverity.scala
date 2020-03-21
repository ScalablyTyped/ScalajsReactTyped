package typingsJapgolly.amphtmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_SEVERITY
  - typingsJapgolly.amphtmlValidator.amphtmlValidatorStrings.ERROR
  - typingsJapgolly.amphtmlValidator.amphtmlValidatorStrings.WARNING
*/
trait ValidationErrorSeverity extends js.Object

object ValidationErrorSeverity {
  @scala.inline
  def ERROR: typingsJapgolly.amphtmlValidator.amphtmlValidatorStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def UNKNOWN_SEVERITY: typingsJapgolly.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_SEVERITY = this.cast("UNKNOWN_SEVERITY")
  @scala.inline
  def WARNING: typingsJapgolly.amphtmlValidator.amphtmlValidatorStrings.WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

