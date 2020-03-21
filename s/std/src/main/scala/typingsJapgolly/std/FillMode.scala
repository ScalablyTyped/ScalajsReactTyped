package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.auto
  - typingsJapgolly.std.stdStrings.backwards
  - typingsJapgolly.std.stdStrings.both
  - typingsJapgolly.std.stdStrings.forwards
  - typingsJapgolly.std.stdStrings.none
*/
trait FillMode extends js.Object

object FillMode {
  @scala.inline
  def auto: typingsJapgolly.std.stdStrings.auto = this.cast("auto")
  @scala.inline
  def backwards: typingsJapgolly.std.stdStrings.backwards = this.cast("backwards")
  @scala.inline
  def both: typingsJapgolly.std.stdStrings.both = this.cast("both")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forwards: typingsJapgolly.std.stdStrings.forwards = this.cast("forwards")
  @scala.inline
  def none: typingsJapgolly.std.stdStrings.none = this.cast("none")
}

