package typingsJapgolly.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the size of padding around a timed text region. */
trait TimedTextPadding extends js.Object {
  /** The padding after the timed text region. */
  var after: Double
  /** The padding before the timed text region. */
  var before: Double
  /** The padding towards the end of the timed text. */
  var end: Double
  /** The padding towards the start of the timed text. */
  var start: Double
  /** The units in which the other members of the structure are expressed. */
  var unit: TimedTextUnit
}

object TimedTextPadding {
  @scala.inline
  def apply(after: Double, before: Double, end: Double, start: Double, unit: TimedTextUnit): TimedTextPadding = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimedTextPadding]
  }
}

