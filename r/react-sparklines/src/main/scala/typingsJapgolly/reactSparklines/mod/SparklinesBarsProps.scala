package typingsJapgolly.reactSparklines.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesBarsProps extends js.Object {
  var barWidth: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function2[/* p */ Point, /* event */ ReactMouseEventFrom[ReactSVGElement with Element], Unit]
  ] = js.undefined
  var points: js.UndefOr[js.Array[Point]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SparklinesBarsProps {
  @scala.inline
  def apply(
    barWidth: Int | Double = null,
    height: Int | Double = null,
    margin: Int | Double = null,
    onMouseMove: (/* p */ Point, /* event */ ReactMouseEventFrom[ReactSVGElement with Element]) => Callback = null,
    points: js.Array[Point] = null,
    style: CSSProperties = null
  ): SparklinesBarsProps = {
    val __obj = js.Dynamic.literal()
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2((t0: /* p */ typingsJapgolly.reactSparklines.mod.Point, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[typingsJapgolly.react.mod.ReactSVGElement with org.scalajs.dom.raw.Element]) => onMouseMove(t0, t1).runNow()))
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinesBarsProps]
  }
}

