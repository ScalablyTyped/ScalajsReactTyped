package typingsJapgolly.chartJs.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.chartJs.chartJsStrings.after
import typingsJapgolly.chartJs.chartJsStrings.before
import typingsJapgolly.chartJs.chartJsStrings.bevel
import typingsJapgolly.chartJs.chartJsStrings.butt
import typingsJapgolly.chartJs.chartJsStrings.default
import typingsJapgolly.chartJs.chartJsStrings.flex
import typingsJapgolly.chartJs.chartJsStrings.middle
import typingsJapgolly.chartJs.chartJsStrings.miter
import typingsJapgolly.chartJs.chartJsStrings.monotone
import typingsJapgolly.chartJs.chartJsStrings.round
import typingsJapgolly.chartJs.chartJsStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartDataSets extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var barPercentage: js.UndefOr[Double] = js.undefined
  var barThickness: js.UndefOr[Double | flex] = js.undefined
  var borderAlign: js.UndefOr[BorderAlignment | js.Array[BorderAlignment] | Scriptable[BorderAlignment]] = js.undefined
  var borderCapStyle: js.UndefOr[butt | round | square] = js.undefined
  var borderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var borderDash: js.UndefOr[js.Array[Double]] = js.undefined
  var borderDashOffset: js.UndefOr[Double] = js.undefined
  var borderJoinStyle: js.UndefOr[bevel | round | miter] = js.undefined
  var borderSkipped: js.UndefOr[PositionType | js.Array[PositionType] | Scriptable[PositionType]] = js.undefined
  var borderWidth: js.UndefOr[BorderWidth | js.Array[BorderWidth] | Scriptable[BorderWidth]] = js.undefined
  var categoryPercentage: js.UndefOr[Double] = js.undefined
  var cubicInterpolationMode: js.UndefOr[default | monotone] = js.undefined
  var data: js.UndefOr[js.Array[js.UndefOr[ChartPoint | Double | Null]]] = js.undefined
  var fill: js.UndefOr[Boolean | Double | String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var hideInLegendAndTooltip: js.UndefOr[Boolean] = js.undefined
  var hitRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var hoverBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var hoverBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var hoverBorderWidth: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var hoverRadius: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var lineTension: js.UndefOr[Double] = js.undefined
  var maxBarThickness: js.UndefOr[Double] = js.undefined
  var minBarLength: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var pointBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var pointBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var pointBorderWidth: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var pointHitRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var pointHoverBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var pointHoverBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.undefined
  var pointHoverBorderWidth: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var pointHoverRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var pointRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var pointRotation: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var pointStyle: js.UndefOr[
    PointStyle | HTMLImageElement | HTMLCanvasElement | (js.Array[PointStyle | HTMLImageElement | HTMLCanvasElement]) | (Scriptable[PointStyle | HTMLImageElement | HTMLCanvasElement])
  ] = js.undefined
  var radius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var rotation: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.undefined
  var showLine: js.UndefOr[Boolean] = js.undefined
  var spanGaps: js.UndefOr[Boolean] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
  var steppedLine: js.UndefOr[before | after | middle | Boolean] = js.undefined
  var `type`: js.UndefOr[ChartType | String] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
  var xAxisID: js.UndefOr[String] = js.undefined
  var yAxisID: js.UndefOr[String] = js.undefined
}

object ChartDataSets {
  @scala.inline
  def apply(
    backgroundColor: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor] = null,
    barPercentage: Int | Double = null,
    barThickness: Double | flex = null,
    borderAlign: BorderAlignment | js.Array[BorderAlignment] | Scriptable[BorderAlignment] = null,
    borderCapStyle: butt | round | square = null,
    borderColor: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor] = null,
    borderDash: js.Array[Double] = null,
    borderDashOffset: Int | Double = null,
    borderJoinStyle: bevel | round | miter = null,
    borderSkipped: PositionType | js.Array[PositionType] | Scriptable[PositionType] = null,
    borderWidth: BorderWidth | js.Array[BorderWidth] | Scriptable[BorderWidth] = null,
    categoryPercentage: Int | Double = null,
    cubicInterpolationMode: default | monotone = null,
    data: js.Array[js.UndefOr[ChartPoint | Double | Null]] = null,
    fill: Boolean | Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hideInLegendAndTooltip: js.UndefOr[Boolean] = js.undefined,
    hitRadius: Double | js.Array[Double] | Scriptable[Double] = null,
    hoverBackgroundColor: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor] = null,
    hoverBorderColor: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor] = null,
    hoverBorderWidth: Double | js.Array[Double] | Scriptable[Double] = null,
    hoverRadius: Int | Double = null,
    label: String = null,
    lineTension: Int | Double = null,
    maxBarThickness: Int | Double = null,
    minBarLength: Int | Double = null,
    order: Int | Double = null,
    pointBackgroundColor: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor] = null,
    pointBorderColor: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor] = null,
    pointBorderWidth: Double | js.Array[Double] | Scriptable[Double] = null,
    pointHitRadius: Double | js.Array[Double] | Scriptable[Double] = null,
    pointHoverBackgroundColor: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor] = null,
    pointHoverBorderColor: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor] = null,
    pointHoverBorderWidth: Double | js.Array[Double] | Scriptable[Double] = null,
    pointHoverRadius: Double | js.Array[Double] | Scriptable[Double] = null,
    pointRadius: Double | js.Array[Double] | Scriptable[Double] = null,
    pointRotation: Double | js.Array[Double] | Scriptable[Double] = null,
    pointStyle: PointStyle | HTMLImageElement | HTMLCanvasElement | (js.Array[PointStyle | HTMLImageElement | HTMLCanvasElement]) | (Scriptable[PointStyle | HTMLImageElement | HTMLCanvasElement]) = null,
    radius: Double | js.Array[Double] | Scriptable[Double] = null,
    rotation: Double | js.Array[Double] | Scriptable[Double] = null,
    showLine: js.UndefOr[Boolean] = js.undefined,
    spanGaps: js.UndefOr[Boolean] = js.undefined,
    stack: String = null,
    steppedLine: before | after | middle | Boolean = null,
    `type`: ChartType | String = null,
    weight: Int | Double = null,
    xAxisID: String = null,
    yAxisID: String = null
  ): ChartDataSets = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (barPercentage != null) __obj.updateDynamic("barPercentage")(barPercentage.asInstanceOf[js.Any])
    if (barThickness != null) __obj.updateDynamic("barThickness")(barThickness.asInstanceOf[js.Any])
    if (borderAlign != null) __obj.updateDynamic("borderAlign")(borderAlign.asInstanceOf[js.Any])
    if (borderCapStyle != null) __obj.updateDynamic("borderCapStyle")(borderCapStyle.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderDash != null) __obj.updateDynamic("borderDash")(borderDash.asInstanceOf[js.Any])
    if (borderDashOffset != null) __obj.updateDynamic("borderDashOffset")(borderDashOffset.asInstanceOf[js.Any])
    if (borderJoinStyle != null) __obj.updateDynamic("borderJoinStyle")(borderJoinStyle.asInstanceOf[js.Any])
    if (borderSkipped != null) __obj.updateDynamic("borderSkipped")(borderSkipped.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (categoryPercentage != null) __obj.updateDynamic("categoryPercentage")(categoryPercentage.asInstanceOf[js.Any])
    if (cubicInterpolationMode != null) __obj.updateDynamic("cubicInterpolationMode")(cubicInterpolationMode.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(hideInLegendAndTooltip)) __obj.updateDynamic("hideInLegendAndTooltip")(hideInLegendAndTooltip.asInstanceOf[js.Any])
    if (hitRadius != null) __obj.updateDynamic("hitRadius")(hitRadius.asInstanceOf[js.Any])
    if (hoverBackgroundColor != null) __obj.updateDynamic("hoverBackgroundColor")(hoverBackgroundColor.asInstanceOf[js.Any])
    if (hoverBorderColor != null) __obj.updateDynamic("hoverBorderColor")(hoverBorderColor.asInstanceOf[js.Any])
    if (hoverBorderWidth != null) __obj.updateDynamic("hoverBorderWidth")(hoverBorderWidth.asInstanceOf[js.Any])
    if (hoverRadius != null) __obj.updateDynamic("hoverRadius")(hoverRadius.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineTension != null) __obj.updateDynamic("lineTension")(lineTension.asInstanceOf[js.Any])
    if (maxBarThickness != null) __obj.updateDynamic("maxBarThickness")(maxBarThickness.asInstanceOf[js.Any])
    if (minBarLength != null) __obj.updateDynamic("minBarLength")(minBarLength.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pointBackgroundColor != null) __obj.updateDynamic("pointBackgroundColor")(pointBackgroundColor.asInstanceOf[js.Any])
    if (pointBorderColor != null) __obj.updateDynamic("pointBorderColor")(pointBorderColor.asInstanceOf[js.Any])
    if (pointBorderWidth != null) __obj.updateDynamic("pointBorderWidth")(pointBorderWidth.asInstanceOf[js.Any])
    if (pointHitRadius != null) __obj.updateDynamic("pointHitRadius")(pointHitRadius.asInstanceOf[js.Any])
    if (pointHoverBackgroundColor != null) __obj.updateDynamic("pointHoverBackgroundColor")(pointHoverBackgroundColor.asInstanceOf[js.Any])
    if (pointHoverBorderColor != null) __obj.updateDynamic("pointHoverBorderColor")(pointHoverBorderColor.asInstanceOf[js.Any])
    if (pointHoverBorderWidth != null) __obj.updateDynamic("pointHoverBorderWidth")(pointHoverBorderWidth.asInstanceOf[js.Any])
    if (pointHoverRadius != null) __obj.updateDynamic("pointHoverRadius")(pointHoverRadius.asInstanceOf[js.Any])
    if (pointRadius != null) __obj.updateDynamic("pointRadius")(pointRadius.asInstanceOf[js.Any])
    if (pointRotation != null) __obj.updateDynamic("pointRotation")(pointRotation.asInstanceOf[js.Any])
    if (pointStyle != null) __obj.updateDynamic("pointStyle")(pointStyle.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine.asInstanceOf[js.Any])
    if (!js.isUndefined(spanGaps)) __obj.updateDynamic("spanGaps")(spanGaps.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (steppedLine != null) __obj.updateDynamic("steppedLine")(steppedLine.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    if (xAxisID != null) __obj.updateDynamic("xAxisID")(xAxisID.asInstanceOf[js.Any])
    if (yAxisID != null) __obj.updateDynamic("yAxisID")(yAxisID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataSets]
  }
}

