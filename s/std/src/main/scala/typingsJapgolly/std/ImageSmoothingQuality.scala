package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.low
  - typings.std.stdStrings.medium
  - typings.std.stdStrings.high
*/
trait ImageSmoothingQuality extends js.Object

object ImageSmoothingQuality {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsJapgolly.std.stdStrings.high = this.cast("high")
  @scala.inline
  def low: typingsJapgolly.std.stdStrings.low = this.cast("low")
  @scala.inline
  def medium: typingsJapgolly.std.stdStrings.medium = this.cast("medium")
}

