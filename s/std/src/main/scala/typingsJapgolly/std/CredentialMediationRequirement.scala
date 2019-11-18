package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.required_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.silent
  - typings.std.stdStrings.optional
  - typings.std.stdStrings.required_
*/
trait CredentialMediationRequirement extends js.Object

object CredentialMediationRequirement {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def optional: typingsJapgolly.std.stdStrings.optional = this.cast("optional")
  @scala.inline
  def required: required_ = this.cast("required")
  @scala.inline
  def silent: typingsJapgolly.std.stdStrings.silent = this.cast("silent")
}

