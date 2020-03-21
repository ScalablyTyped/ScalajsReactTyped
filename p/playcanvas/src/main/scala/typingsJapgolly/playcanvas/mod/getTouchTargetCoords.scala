package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("playcanvas", "getTouchTargetCoords")
@js.native
object getTouchTargetCoords extends js.Object {
  /**
    * @function
    * @name pc.getTouchTargetCoords
    * @description Similiar to {@link pc.getTargetCoords} for the MouseEvents.
    * This function takes a browser Touch object and returns the co-ordinates of the
    * touch relative to the target element.
    * @param {Touch} touch - The browser Touch object.
    * @returns {object} The co-ordinates of the touch relative to the touch.target element. In the format {x, y}.
    */
  def apply(touch: typingsJapgolly.playcanvas.pc.Touch): js.Any = js.native
}

