package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.denied
  - typingsJapgolly.std.stdStrings.granted
  - typingsJapgolly.std.stdStrings.prompt
*/
trait PushPermissionState extends js.Object

object PushPermissionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def denied: typingsJapgolly.std.stdStrings.denied = this.cast("denied")
  @scala.inline
  def granted: typingsJapgolly.std.stdStrings.granted = this.cast("granted")
  @scala.inline
  def prompt: typingsJapgolly.std.stdStrings.prompt = this.cast("prompt")
}

