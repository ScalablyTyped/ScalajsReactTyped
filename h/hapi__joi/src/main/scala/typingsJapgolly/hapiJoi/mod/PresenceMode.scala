package typingsJapgolly.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hapiJoi.hapiJoiStrings.optional
  - typingsJapgolly.hapiJoi.hapiJoiStrings.required
  - typingsJapgolly.hapiJoi.hapiJoiStrings.forbidden
*/
trait PresenceMode extends js.Object

object PresenceMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forbidden: typingsJapgolly.hapiJoi.hapiJoiStrings.forbidden = this.cast("forbidden")
  @scala.inline
  def optional: typingsJapgolly.hapiJoi.hapiJoiStrings.optional = this.cast("optional")
  @scala.inline
  def required: typingsJapgolly.hapiJoi.hapiJoiStrings.required = this.cast("required")
}

