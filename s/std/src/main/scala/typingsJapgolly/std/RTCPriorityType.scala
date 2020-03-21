package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.high
  - typingsJapgolly.std.stdStrings.low
  - typingsJapgolly.std.stdStrings.medium
  - typingsJapgolly.std.stdStrings.`very-low`
*/
trait RTCPriorityType extends js.Object

object RTCPriorityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsJapgolly.std.stdStrings.high = this.cast("high")
  @scala.inline
  def low: typingsJapgolly.std.stdStrings.low = this.cast("low")
  @scala.inline
  def medium: typingsJapgolly.std.stdStrings.medium = this.cast("medium")
  @scala.inline
  def `very-low`: typingsJapgolly.std.stdStrings.`very-low` = this.cast("very-low")
}

