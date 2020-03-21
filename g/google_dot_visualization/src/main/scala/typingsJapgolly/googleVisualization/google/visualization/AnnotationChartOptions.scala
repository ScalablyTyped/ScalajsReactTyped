package typingsJapgolly.googleVisualization.google.visualization

import typingsJapgolly.googleVisualization.googleVisualizationStrings.newRow
import typingsJapgolly.googleVisualization.googleVisualizationStrings.sameRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationChartOptions extends js.Object {
  var allValuesSuffix: js.UndefOr[String] = js.undefined
  var allowHtml: js.UndefOr[Boolean] = js.undefined
  var annotationsWidth: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var dateFormat: js.UndefOr[String] = js.undefined
  var displayAnnotations: js.UndefOr[Boolean] = js.undefined
  var displayAnnotationsFilter: js.UndefOr[Boolean] = js.undefined
  var displayDateBarSeparator: js.UndefOr[Boolean] = js.undefined
  var displayExactValues: js.UndefOr[Boolean] = js.undefined
  var displayLegendDots: js.UndefOr[Boolean] = js.undefined
  var displayLegendValues: js.UndefOr[Boolean] = js.undefined
  var displayRangeSelector: js.UndefOr[Boolean] = js.undefined
  var displayZoomButtons: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[Double] = js.undefined
  var legendPosition: js.UndefOr[sameRow | newRow] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var numberFormats: js.UndefOr[js.Any] = js.undefined
  var scaleColumns: js.UndefOr[js.Array[Double]] = js.undefined
  var scaleFormat: js.UndefOr[String] = js.undefined
  var scaleType: js.UndefOr[String] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
  var zoomEndTime: js.UndefOr[js.Date] = js.undefined
  var zoomStartTime: js.UndefOr[js.Date] = js.undefined
}

object AnnotationChartOptions {
  @scala.inline
  def apply(
    allValuesSuffix: String = null,
    allowHtml: js.UndefOr[Boolean] = js.undefined,
    annotationsWidth: Int | Double = null,
    colors: js.Array[String] = null,
    dateFormat: String = null,
    displayAnnotations: js.UndefOr[Boolean] = js.undefined,
    displayAnnotationsFilter: js.UndefOr[Boolean] = js.undefined,
    displayDateBarSeparator: js.UndefOr[Boolean] = js.undefined,
    displayExactValues: js.UndefOr[Boolean] = js.undefined,
    displayLegendDots: js.UndefOr[Boolean] = js.undefined,
    displayLegendValues: js.UndefOr[Boolean] = js.undefined,
    displayRangeSelector: js.UndefOr[Boolean] = js.undefined,
    displayZoomButtons: js.UndefOr[Boolean] = js.undefined,
    fill: Int | Double = null,
    legendPosition: sameRow | newRow = null,
    max: Int | Double = null,
    min: Int | Double = null,
    numberFormats: js.Any = null,
    scaleColumns: js.Array[Double] = null,
    scaleFormat: String = null,
    scaleType: String = null,
    thickness: Int | Double = null,
    zoomEndTime: js.Date = null,
    zoomStartTime: js.Date = null
  ): AnnotationChartOptions = {
    val __obj = js.Dynamic.literal()
    if (allValuesSuffix != null) __obj.updateDynamic("allValuesSuffix")(allValuesSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml.asInstanceOf[js.Any])
    if (annotationsWidth != null) __obj.updateDynamic("annotationsWidth")(annotationsWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(displayAnnotations)) __obj.updateDynamic("displayAnnotations")(displayAnnotations.asInstanceOf[js.Any])
    if (!js.isUndefined(displayAnnotationsFilter)) __obj.updateDynamic("displayAnnotationsFilter")(displayAnnotationsFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(displayDateBarSeparator)) __obj.updateDynamic("displayDateBarSeparator")(displayDateBarSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(displayExactValues)) __obj.updateDynamic("displayExactValues")(displayExactValues.asInstanceOf[js.Any])
    if (!js.isUndefined(displayLegendDots)) __obj.updateDynamic("displayLegendDots")(displayLegendDots.asInstanceOf[js.Any])
    if (!js.isUndefined(displayLegendValues)) __obj.updateDynamic("displayLegendValues")(displayLegendValues.asInstanceOf[js.Any])
    if (!js.isUndefined(displayRangeSelector)) __obj.updateDynamic("displayRangeSelector")(displayRangeSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(displayZoomButtons)) __obj.updateDynamic("displayZoomButtons")(displayZoomButtons.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (numberFormats != null) __obj.updateDynamic("numberFormats")(numberFormats.asInstanceOf[js.Any])
    if (scaleColumns != null) __obj.updateDynamic("scaleColumns")(scaleColumns.asInstanceOf[js.Any])
    if (scaleFormat != null) __obj.updateDynamic("scaleFormat")(scaleFormat.asInstanceOf[js.Any])
    if (scaleType != null) __obj.updateDynamic("scaleType")(scaleType.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (zoomEndTime != null) __obj.updateDynamic("zoomEndTime")(zoomEndTime.asInstanceOf[js.Any])
    if (zoomStartTime != null) __obj.updateDynamic("zoomStartTime")(zoomStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationChartOptions]
  }
}

