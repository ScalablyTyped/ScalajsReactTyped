package typingsJapgolly.amphtmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN
  - typingsJapgolly.amphtmlValidator.amphtmlValidatorStrings.PASS
  - typingsJapgolly.amphtmlValidator.amphtmlValidatorStrings.FAIL
*/
trait ValidationResultStatus extends js.Object

object ValidationResultStatus {
  @scala.inline
  def FAIL: typingsJapgolly.amphtmlValidator.amphtmlValidatorStrings.FAIL = this.cast("FAIL")
  @scala.inline
  def PASS: typingsJapgolly.amphtmlValidator.amphtmlValidatorStrings.PASS = this.cast("PASS")
  @scala.inline
  def UNKNOWN: typingsJapgolly.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

