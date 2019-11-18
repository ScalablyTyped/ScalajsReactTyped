package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.required_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.required_
  - typings.std.stdStrings.optional
  - typings.std.stdStrings.`not-allowed`
*/
trait MediaKeysRequirement extends js.Object

object MediaKeysRequirement {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `not-allowed`: typingsJapgolly.std.stdStrings.`not-allowed` = this.cast("not-allowed")
  @scala.inline
  def optional: typingsJapgolly.std.stdStrings.optional = this.cast("optional")
  @scala.inline
  def required: required_ = this.cast("required")
}

