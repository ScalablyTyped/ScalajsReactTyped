package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAxis extends js.Object {
  var automatic: Boolean
   // %
  var axisSize: Double
   // readonly
  var bounds: IRectangle
  var chart: IChart
  var custom: Boolean
   // %
  var end: Double
  var endPos: Double
  var format: IFormat
   // readonly
  var grid: IGrid
  var horizontal: Boolean
  var increm: Double
  var increment: Double
  var innerTicks: ITicks
  var inverted: Boolean
  var labels: IAxisLabels
  var log: Boolean
  var maximum: Double
  var minimum: Double
  var minorTicks: IMinorTicks
    // readonly
  var otherSize: Boolean
    // readonly?
  var position: Double
  var scale: Double
  var start: Double
  var startPos: Double
  var ticks: ITicks
  var title: IAxisTitle
  var visible: Boolean
  def calc(value: Double): Double
  def fromPos(position: Double): Double
  def fromSize(size: Double): Double
  def hasAnySeries(): Boolean
  def scroll(delta: Double): Unit
  def setMinMax(minimum: Double, maximum: Double): Unit
}

object IAxis {
  @scala.inline
  def apply(
    automatic: Boolean,
    axisSize: Double,
    bounds: IRectangle,
    calc: Double => CallbackTo[Double],
    chart: IChart,
    custom: Boolean,
    end: Double,
    endPos: Double,
    format: IFormat,
    fromPos: Double => CallbackTo[Double],
    fromSize: Double => CallbackTo[Double],
    grid: IGrid,
    hasAnySeries: CallbackTo[Boolean],
    horizontal: Boolean,
    increm: Double,
    increment: Double,
    innerTicks: ITicks,
    inverted: Boolean,
    labels: IAxisLabels,
    log: Boolean,
    maximum: Double,
    minimum: Double,
    minorTicks: IMinorTicks,
    otherSize: Boolean,
    position: Double,
    scale: Double,
    scroll: Double => Callback,
    setMinMax: (Double, Double) => Callback,
    start: Double,
    startPos: Double,
    ticks: ITicks,
    title: IAxisTitle,
    visible: Boolean
  ): IAxis = {
    val __obj = js.Dynamic.literal(automatic = automatic.asInstanceOf[js.Any], axisSize = axisSize.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], endPos = endPos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], increm = increm.asInstanceOf[js.Any], increment = increment.asInstanceOf[js.Any], innerTicks = innerTicks.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], minorTicks = minorTicks.asInstanceOf[js.Any], otherSize = otherSize.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("calc")(js.Any.fromFunction1((t0: scala.Double) => calc(t0).runNow()))
    __obj.updateDynamic("fromPos")(js.Any.fromFunction1((t0: scala.Double) => fromPos(t0).runNow()))
    __obj.updateDynamic("fromSize")(js.Any.fromFunction1((t0: scala.Double) => fromSize(t0).runNow()))
    __obj.updateDynamic("hasAnySeries")(hasAnySeries.toJsFn)
    __obj.updateDynamic("scroll")(js.Any.fromFunction1((t0: scala.Double) => scroll(t0).runNow()))
    __obj.updateDynamic("setMinMax")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setMinMax(t0, t1).runNow()))
    __obj.asInstanceOf[IAxis]
  }
}

