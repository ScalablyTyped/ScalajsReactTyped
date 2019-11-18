package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.select
  - typings.std.stdStrings.start
  - typings.std.stdStrings.end
  - typings.std.stdStrings.preserve
*/
trait SelectionMode extends js.Object

object SelectionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typingsJapgolly.std.stdStrings.end = this.cast("end")
  @scala.inline
  def preserve: typingsJapgolly.std.stdStrings.preserve = this.cast("preserve")
  @scala.inline
  def select: typingsJapgolly.std.stdStrings.select = this.cast("select")
  @scala.inline
  def start: typingsJapgolly.std.stdStrings.start = this.cast("start")
}

