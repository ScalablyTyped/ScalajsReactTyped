package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.Empty
  - typings.std.stdStrings.left
  - typings.std.stdStrings.right
*/
trait GamepadHand extends js.Object

object GamepadHand {
  @scala.inline
  def Empty: typingsJapgolly.std.stdStrings.Empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typingsJapgolly.std.stdStrings.left = this.cast("left")
  @scala.inline
  def right: typingsJapgolly.std.stdStrings.right = this.cast("right")
}

