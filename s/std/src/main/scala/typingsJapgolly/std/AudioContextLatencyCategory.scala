package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.balanced
  - typingsJapgolly.std.stdStrings.interactive
  - typingsJapgolly.std.stdStrings.playback
*/
trait AudioContextLatencyCategory extends js.Object

object AudioContextLatencyCategory {
  @scala.inline
  def balanced: typingsJapgolly.std.stdStrings.balanced = this.cast("balanced")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def interactive: typingsJapgolly.std.stdStrings.interactive = this.cast("interactive")
  @scala.inline
  def playback: typingsJapgolly.std.stdStrings.playback = this.cast("playback")
}

