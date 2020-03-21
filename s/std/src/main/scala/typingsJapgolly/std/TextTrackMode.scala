package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.disabled
  - typingsJapgolly.std.stdStrings.hidden
  - typingsJapgolly.std.stdStrings.showing
*/
trait TextTrackMode extends js.Object

object TextTrackMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typingsJapgolly.std.stdStrings.disabled = this.cast("disabled")
  @scala.inline
  def hidden: typingsJapgolly.std.stdStrings.hidden = this.cast("hidden")
  @scala.inline
  def showing: typingsJapgolly.std.stdStrings.showing = this.cast("showing")
}

