package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.up
  - typings.std.stdStrings.down
  - typings.std.stdStrings.left
  - typings.std.stdStrings.right
*/
trait NavigationReason extends js.Object

object NavigationReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def down: typingsJapgolly.std.stdStrings.down = this.cast("down")
  @scala.inline
  def left: typingsJapgolly.std.stdStrings.left = this.cast("left")
  @scala.inline
  def right: typingsJapgolly.std.stdStrings.right = this.cast("right")
  @scala.inline
  def up: typingsJapgolly.std.stdStrings.up = this.cast("up")
}

