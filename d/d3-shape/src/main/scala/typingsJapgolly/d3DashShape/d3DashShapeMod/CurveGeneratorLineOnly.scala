package typingsJapgolly.d3DashShape.d3DashShapeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurveGeneratorLineOnly extends js.Object {
  /**
    * Indicates the end of the current line segment.
    */
  def lineEnd(): Unit
  /**
    * Indicates the start of a new line segment. Zero or more points will follow.
    */
  def lineStart(): Unit
  /**
    * Indicates a new point in the current line segment with the given x- and y-values.
    */
  def point(x: Double, y: Double): Unit
}

object CurveGeneratorLineOnly {
  @scala.inline
  def apply(lineEnd: Callback, lineStart: Callback, point: (Double, Double) => Callback): CurveGeneratorLineOnly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lineEnd")(lineEnd.toJsFn)
    __obj.updateDynamic("lineStart")(lineStart.toJsFn)
    __obj.updateDynamic("point")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => point(t0, t1).runNow()))
    __obj.asInstanceOf[CurveGeneratorLineOnly]
  }
}

