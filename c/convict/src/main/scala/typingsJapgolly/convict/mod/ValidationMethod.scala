package typingsJapgolly.convict.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.convict.convictStrings.strict
  - typingsJapgolly.convict.convictStrings.warn
*/
trait ValidationMethod extends js.Object

object ValidationMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def strict: typingsJapgolly.convict.convictStrings.strict = this.cast("strict")
  @scala.inline
  def warn: typingsJapgolly.convict.convictStrings.warn = this.cast("warn")
}

