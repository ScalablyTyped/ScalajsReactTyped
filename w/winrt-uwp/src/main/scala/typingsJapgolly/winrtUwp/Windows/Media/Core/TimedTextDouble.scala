package typingsJapgolly.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a floating point value that is used to convey the values of timed text style properties. */
trait TimedTextDouble extends js.Object {
  /** The units of the value, either pixels or percentage. */
  var unit: TimedTextUnit
  /** The value. */
  var value: Double
}

object TimedTextDouble {
  @scala.inline
  def apply(unit: TimedTextUnit, value: Double): TimedTextDouble = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimedTextDouble]
  }
}

