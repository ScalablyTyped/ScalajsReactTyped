package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.start
  - typings.std.stdStrings.center
  - typings.std.stdStrings.end
  - typings.std.stdStrings.nearest
*/
trait ScrollLogicalPosition extends js.Object

object ScrollLogicalPosition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typingsJapgolly.std.stdStrings.center = this.cast("center")
  @scala.inline
  def end: typingsJapgolly.std.stdStrings.end = this.cast("end")
  @scala.inline
  def nearest: typingsJapgolly.std.stdStrings.nearest = this.cast("nearest")
  @scala.inline
  def start: typingsJapgolly.std.stdStrings.start = this.cast("start")
}

