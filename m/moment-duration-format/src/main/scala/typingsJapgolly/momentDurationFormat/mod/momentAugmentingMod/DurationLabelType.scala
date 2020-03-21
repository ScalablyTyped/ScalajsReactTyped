package typingsJapgolly.momentDurationFormat.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.long
  - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.standard
  - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.short
*/
trait DurationLabelType extends js.Object

object DurationLabelType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def long: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.long = this.cast("long")
  @scala.inline
  def short: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.short = this.cast("short")
  @scala.inline
  def standard: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.standard = this.cast("standard")
}

