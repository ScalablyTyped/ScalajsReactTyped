package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.balanced
  - typingsJapgolly.std.stdStrings.`maintain-framerate`
  - typingsJapgolly.std.stdStrings.`maintain-resolution`
*/
trait RTCDegradationPreference extends js.Object

object RTCDegradationPreference {
  @scala.inline
  def balanced: typingsJapgolly.std.stdStrings.balanced = this.cast("balanced")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `maintain-framerate`: typingsJapgolly.std.stdStrings.`maintain-framerate` = this.cast("maintain-framerate")
  @scala.inline
  def `maintain-resolution`: typingsJapgolly.std.stdStrings.`maintain-resolution` = this.cast("maintain-resolution")
}

