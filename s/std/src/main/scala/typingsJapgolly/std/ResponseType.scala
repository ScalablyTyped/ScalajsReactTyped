package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.basic
  - typings.std.stdStrings.cors
  - typings.std.stdStrings.default
  - typings.std.stdStrings.error
  - typings.std.stdStrings.opaque
  - typings.std.stdStrings.opaqueredirect
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def basic: typingsJapgolly.std.stdStrings.basic = this.cast("basic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typingsJapgolly.std.stdStrings.cors = this.cast("cors")
  @scala.inline
  def default: typingsJapgolly.std.stdStrings.default = this.cast("default")
  @scala.inline
  def error: typingsJapgolly.std.stdStrings.error = this.cast("error")
  @scala.inline
  def opaque: typingsJapgolly.std.stdStrings.opaque = this.cast("opaque")
  @scala.inline
  def opaqueredirect: typingsJapgolly.std.stdStrings.opaqueredirect = this.cast("opaqueredirect")
}

