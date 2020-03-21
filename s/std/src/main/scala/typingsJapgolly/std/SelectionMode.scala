package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.end
  - typingsJapgolly.std.stdStrings.preserve
  - typingsJapgolly.std.stdStrings.select
  - typingsJapgolly.std.stdStrings.start
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

