package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.required_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.discouraged
  - typingsJapgolly.std.stdStrings.preferred
  - typingsJapgolly.std.stdStrings.required_
*/
trait UserVerificationRequirement extends js.Object

object UserVerificationRequirement {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def discouraged: typingsJapgolly.std.stdStrings.discouraged = this.cast("discouraged")
  @scala.inline
  def preferred: typingsJapgolly.std.stdStrings.preferred = this.cast("preferred")
  @scala.inline
  def required: required_ = this.cast("required")
}

