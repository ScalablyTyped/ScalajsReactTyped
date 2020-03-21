package typingsJapgolly.pixiJs.PIXI

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for classes that represent a hit area.
  *
  * It is implemented by the following classes:
  * - {@link PIXI.Circle}
  * - {@link PIXI.Ellipse}
  * - {@link PIXI.Polygon}
  * - {@link PIXI.RoundedRectangle}
  *
  * @interface IHitArea
  * @memberof PIXI
  */
trait IHitArea extends js.Object {
  /**
    * Checks whether the x and y coordinates given are contained within this area
    *
    * @method
    * @name contains
    * @memberof PIXI.IHitArea#
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this area
    */
  def contains(x: Double, y: Double): Boolean
}

object IHitArea {
  @scala.inline
  def apply(contains: (Double, Double) => CallbackTo[Boolean]): IHitArea = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contains")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => contains(t0, t1).runNow()))
    __obj.asInstanceOf[IHitArea]
  }
}

