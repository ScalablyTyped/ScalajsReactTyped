package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.granted
  - typings.std.stdStrings.denied
  - typings.std.stdStrings.prompt
*/
trait PermissionState extends js.Object

object PermissionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def denied: typingsJapgolly.std.stdStrings.denied = this.cast("denied")
  @scala.inline
  def granted: typingsJapgolly.std.stdStrings.granted = this.cast("granted")
  @scala.inline
  def prompt: typingsJapgolly.std.stdStrings.prompt = this.cast("prompt")
}

