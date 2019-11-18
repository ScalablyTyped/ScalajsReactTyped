package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.default
  - typings.std.stdStrings.denied
  - typings.std.stdStrings.granted
*/
trait NotificationPermission extends js.Object

object NotificationPermission {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.std.stdStrings.default = this.cast("default")
  @scala.inline
  def denied: typingsJapgolly.std.stdStrings.denied = this.cast("denied")
  @scala.inline
  def granted: typingsJapgolly.std.stdStrings.granted = this.cast("granted")
}

