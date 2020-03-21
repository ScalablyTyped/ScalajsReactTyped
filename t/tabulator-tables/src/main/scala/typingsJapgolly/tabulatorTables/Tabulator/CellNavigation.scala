package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Components-------------------------------------------------------------------
trait CellNavigation extends js.Object {
  /** down - move to the same cell in the row below */
  def down(): Unit
  /** left - next editable cell on the left, return false if none available on row */
  def left(): Boolean
  /** next - next editable cell on the right, if none available move to left most editable cell on the row below */
  def next(): Boolean
  /** prev - next editable cell on the left, if none available move to the right most editable cell on the row above */
  def prev(): Boolean
  /** right - next editable cell on the right, return false if none available on row */
  def right(): Boolean
  /** up - move to the same cell in the row above */
  def up(): Unit
}

object CellNavigation {
  @scala.inline
  def apply(
    down: Callback,
    left: CallbackTo[Boolean],
    next: CallbackTo[Boolean],
    prev: CallbackTo[Boolean],
    right: CallbackTo[Boolean],
    up: Callback
  ): CellNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("down")(down.toJsFn)
    __obj.updateDynamic("left")(left.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("prev")(prev.toJsFn)
    __obj.updateDynamic("right")(right.toJsFn)
    __obj.updateDynamic("up")(up.toJsFn)
    __obj.asInstanceOf[CellNavigation]
  }
}

