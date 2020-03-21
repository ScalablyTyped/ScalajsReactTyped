package typingsJapgolly.vfileLocation.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vfileLocation.AnonColumn
import typingsJapgolly.vfileLocation.AnonLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * Get the `offset` (`number`) for a line and column-based `position` in the bound file.
    * Returns `-1` when given invalid or out of bounds input.
    */
  def toOffset(position: AnonColumn): Double
  /**
    * Get the line and column-based `position` for `offset` in the bound file.
    */
  def toPosition(offset: Double): AnonLine
}

object Location {
  @scala.inline
  def apply(toOffset: AnonColumn => CallbackTo[Double], toPosition: Double => CallbackTo[AnonLine]): Location = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toOffset")(js.Any.fromFunction1((t0: typingsJapgolly.vfileLocation.AnonColumn) => toOffset(t0).runNow()))
    __obj.updateDynamic("toPosition")(js.Any.fromFunction1((t0: scala.Double) => toPosition(t0).runNow()))
    __obj.asInstanceOf[Location]
  }
}

