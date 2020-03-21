package typingsJapgolly.fabric.fabricImplMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilArc extends js.Object {
  /**
  	 * Draws arc
  	 */
  def drawArc(ctx: CanvasRenderingContext2D, fx: Double, fy: Double, coords: js.Array[Double]): Unit
  /**
  	 * Calculate bounding box of a elliptic-arc
  	 * @param fx start point of arc
  	 * @param rx horizontal radius
  	 * @param ry vertical radius
  	 * @param rot angle of horizontal axe
  	 * @param large 1 or 0, whatever the arc is the big or the small on the 2 points
  	 * @param sweep 1 or 0, 1 clockwise or counterclockwise direction
  	 * @param tx end point of arc
  	 */
  def getBoundsOfArc(
    fx: Double,
    fy: Double,
    rx: Double,
    ry: Double,
    rot: Double,
    large: Double,
    sweep: Double,
    tx: Double,
    ty: Double
  ): js.Array[Point]
  /**
  	 * Calculate bounding box of a beziercurve
  	 * @param x0 starting point
  	 * @param x1 first control point
  	 * @param x2 secondo control point
  	 * @param x3 end of beizer
  	 */
  def getBoundsOfCurve(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): js.Array[Point]
}

object IUtilArc {
  @scala.inline
  def apply(
    drawArc: (CanvasRenderingContext2D, Double, Double, js.Array[Double]) => Callback,
    getBoundsOfArc: (Double, Double, Double, Double, Double, Double, Double, Double, Double) => CallbackTo[js.Array[Point]],
    getBoundsOfCurve: (Double, Double, Double, Double, Double, Double, Double, Double) => CallbackTo[js.Array[Point]]
  ): IUtilArc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("drawArc")(js.Any.fromFunction4((t0: org.scalajs.dom.raw.CanvasRenderingContext2D, t1: scala.Double, t2: scala.Double, t3: js.Array[scala.Double]) => drawArc(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getBoundsOfArc")(js.Any.fromFunction9((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: scala.Double, t6: scala.Double, t7: scala.Double, t8: scala.Double) => getBoundsOfArc(t0, t1, t2, t3, t4, t5, t6, t7, t8).runNow()))
    __obj.updateDynamic("getBoundsOfCurve")(js.Any.fromFunction8((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: scala.Double, t6: scala.Double, t7: scala.Double) => getBoundsOfCurve(t0, t1, t2, t3, t4, t5, t6, t7).runNow()))
    __obj.asInstanceOf[IUtilArc]
  }
}

