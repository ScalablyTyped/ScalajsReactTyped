package typingsJapgolly.d3Shape.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurveGenerator extends CurveGeneratorLineOnly {
  /**
    * Indicates the end of the current area segment.
    */
  def areaEnd(): Unit
  /**
    * Indicates the start of a new area segment.
    * Each area segment consists of exactly two line segments: the topline, followed by the baseline, with the baseline points in reverse order.
    */
  def areaStart(): Unit
}

object CurveGenerator {
  @scala.inline
  def apply(
    areaEnd: Callback,
    areaStart: Callback,
    lineEnd: Callback,
    lineStart: Callback,
    point: (Double, Double) => Callback
  ): CurveGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("areaEnd")(areaEnd.toJsFn)
    __obj.updateDynamic("areaStart")(areaStart.toJsFn)
    __obj.updateDynamic("lineEnd")(lineEnd.toJsFn)
    __obj.updateDynamic("lineStart")(lineStart.toJsFn)
    __obj.updateDynamic("point")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => point(t0, t1).runNow()))
    __obj.asInstanceOf[CurveGenerator]
  }
}

