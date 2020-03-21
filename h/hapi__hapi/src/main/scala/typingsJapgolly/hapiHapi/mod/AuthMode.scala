package typingsJapgolly.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hapiHapi.hapiHapiStrings.required
  - typingsJapgolly.hapiHapi.hapiHapiStrings.optional
  - typingsJapgolly.hapiHapi.hapiHapiStrings.`try`
*/
trait AuthMode extends js.Object

object AuthMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def optional: typingsJapgolly.hapiHapi.hapiHapiStrings.optional = this.cast("optional")
  @scala.inline
  def required: typingsJapgolly.hapiHapi.hapiHapiStrings.required = this.cast("required")
  @scala.inline
  def `try`: typingsJapgolly.hapiHapi.hapiHapiStrings.`try` = this.cast("try")
}

