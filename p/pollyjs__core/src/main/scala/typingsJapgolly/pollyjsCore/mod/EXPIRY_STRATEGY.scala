package typingsJapgolly.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.record
  - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.warn
  - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.error
*/
trait EXPIRY_STRATEGY extends js.Object

object EXPIRY_STRATEGY {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.error = this.cast("error")
  @scala.inline
  def record: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.record = this.cast("record")
  @scala.inline
  def warn: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.warn = this.cast("warn")
}

