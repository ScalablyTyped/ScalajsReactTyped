package typingsJapgolly.googleVisualization.google.visualization

import typingsJapgolly.googleVisualization.googleVisualizationStrings.function
import typingsJapgolly.googleVisualization.googleVisualizationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineChartSeriesOptions extends ChartSeriesOptionsBase {
  var annotations: js.UndefOr[ChartAnnotations] = js.undefined
  var curveType: js.UndefOr[none | function] = js.undefined
  var labelInLegend: js.UndefOr[String] = js.undefined
  var lineDashStyle: js.UndefOr[js.Array[Double]] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var pointShape: js.UndefOr[ChartPointShape] = js.undefined
  var pointSize: js.UndefOr[Double] = js.undefined
  var pointsVisible: js.UndefOr[Boolean] = js.undefined
  var targetAxisIndex: js.UndefOr[Double] = js.undefined
  var visibleInLegend: js.UndefOr[Boolean] = js.undefined
}

object LineChartSeriesOptions {
  @scala.inline
  def apply(
    annotations: ChartAnnotations = null,
    color: String = null,
    curveType: none | function = null,
    labelInLegend: String = null,
    lineDashStyle: js.Array[Double] = null,
    lineWidth: Int | Double = null,
    pointShape: ChartPointShape = null,
    pointSize: Int | Double = null,
    pointsVisible: js.UndefOr[Boolean] = js.undefined,
    targetAxisIndex: Int | Double = null,
    visibleInLegend: js.UndefOr[Boolean] = js.undefined
  ): LineChartSeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (curveType != null) __obj.updateDynamic("curveType")(curveType.asInstanceOf[js.Any])
    if (labelInLegend != null) __obj.updateDynamic("labelInLegend")(labelInLegend.asInstanceOf[js.Any])
    if (lineDashStyle != null) __obj.updateDynamic("lineDashStyle")(lineDashStyle.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (pointShape != null) __obj.updateDynamic("pointShape")(pointShape.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (!js.isUndefined(pointsVisible)) __obj.updateDynamic("pointsVisible")(pointsVisible.asInstanceOf[js.Any])
    if (targetAxisIndex != null) __obj.updateDynamic("targetAxisIndex")(targetAxisIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleInLegend)) __obj.updateDynamic("visibleInLegend")(visibleInLegend.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineChartSeriesOptions]
  }
}

