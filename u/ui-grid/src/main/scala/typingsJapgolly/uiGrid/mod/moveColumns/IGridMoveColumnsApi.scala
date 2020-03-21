package typingsJapgolly.uiGrid.mod.moveColumns

import japgolly.scalajs.react.Callback
import typingsJapgolly.uiGrid.AnonColumnPositionChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridMoveColumnsApi extends js.Object {
  // Events
  var on: AnonColumnPositionChanged
  // Methods
  /**
    * Method can be used to change column position
    * @param {number} originalPosition Original column position as a 0 indexed integer
    * @param {number} newPosition New column position as a 0 indexed integer
    */
  def moveColumn(originalPosition: Double, newPosition: Double): Unit
}

object IGridMoveColumnsApi {
  @scala.inline
  def apply(moveColumn: (Double, Double) => Callback, on: AnonColumnPositionChanged): IGridMoveColumnsApi = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.updateDynamic("moveColumn")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => moveColumn(t0, t1).runNow()))
    __obj.asInstanceOf[IGridMoveColumnsApi]
  }
}

