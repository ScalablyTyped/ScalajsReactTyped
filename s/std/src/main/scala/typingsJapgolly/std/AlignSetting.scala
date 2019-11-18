package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.start
  - typings.std.stdStrings.center
  - typings.std.stdStrings.end
  - typings.std.stdStrings.left
  - typings.std.stdStrings.right
*/
trait AlignSetting extends js.Object

object AlignSetting {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typingsJapgolly.std.stdStrings.center = this.cast("center")
  @scala.inline
  def end: typingsJapgolly.std.stdStrings.end = this.cast("end")
  @scala.inline
  def left: typingsJapgolly.std.stdStrings.left = this.cast("left")
  @scala.inline
  def right: typingsJapgolly.std.stdStrings.right = this.cast("right")
  @scala.inline
  def start: typingsJapgolly.std.stdStrings.start = this.cast("start")
}

