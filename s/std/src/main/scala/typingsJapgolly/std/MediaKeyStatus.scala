package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.usable
  - typings.std.stdStrings.expired
  - typings.std.stdStrings.released
  - typings.std.stdStrings.`output-restricted`
  - typings.std.stdStrings.`output-downscaled`
  - typings.std.stdStrings.`status-pending`
  - typings.std.stdStrings.`internal-error`
*/
trait MediaKeyStatus extends js.Object

object MediaKeyStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def expired: typingsJapgolly.std.stdStrings.expired = this.cast("expired")
  @scala.inline
  def `internal-error`: typingsJapgolly.std.stdStrings.`internal-error` = this.cast("internal-error")
  @scala.inline
  def `output-downscaled`: typingsJapgolly.std.stdStrings.`output-downscaled` = this.cast("output-downscaled")
  @scala.inline
  def `output-restricted`: typingsJapgolly.std.stdStrings.`output-restricted` = this.cast("output-restricted")
  @scala.inline
  def released: typingsJapgolly.std.stdStrings.released = this.cast("released")
  @scala.inline
  def `status-pending`: typingsJapgolly.std.stdStrings.`status-pending` = this.cast("status-pending")
  @scala.inline
  def usable: typingsJapgolly.std.stdStrings.usable = this.cast("usable")
}

