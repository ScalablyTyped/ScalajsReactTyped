package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineValueAxisItem extends js.Object {
  var axisCrossingValue: js.UndefOr[js.Any | js.Date] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var crosshair: js.UndefOr[SparklineValueAxisItemCrosshair] = js.undefined
  var labels: js.UndefOr[SparklineValueAxisItemLabels] = js.undefined
  var line: js.UndefOr[SparklineValueAxisItemLine] = js.undefined
  var majorGridLines: js.UndefOr[SparklineValueAxisItemMajorGridLines] = js.undefined
  var majorTicks: js.UndefOr[SparklineValueAxisItemMajorTicks] = js.undefined
  var majorUnit: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var minorGridLines: js.UndefOr[SparklineValueAxisItemMinorGridLines] = js.undefined
  var minorTicks: js.UndefOr[SparklineValueAxisItemMinorTicks] = js.undefined
  var minorUnit: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[js.Any] = js.undefined
  var narrowRange: js.UndefOr[Boolean] = js.undefined
  var notes: js.UndefOr[SparklineValueAxisItemNotes] = js.undefined
  var plotBands: js.UndefOr[js.Array[SparklineValueAxisItemPlotBand]] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[SparklineValueAxisItemTitle] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SparklineValueAxisItem {
  @scala.inline
  def apply(
    axisCrossingValue: js.Any | js.Date = null,
    color: String = null,
    crosshair: SparklineValueAxisItemCrosshair = null,
    labels: SparklineValueAxisItemLabels = null,
    line: SparklineValueAxisItemLine = null,
    majorGridLines: SparklineValueAxisItemMajorGridLines = null,
    majorTicks: SparklineValueAxisItemMajorTicks = null,
    majorUnit: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    minorGridLines: SparklineValueAxisItemMinorGridLines = null,
    minorTicks: SparklineValueAxisItemMinorTicks = null,
    minorUnit: Int | Double = null,
    name: js.Any = null,
    narrowRange: js.UndefOr[Boolean] = js.undefined,
    notes: SparklineValueAxisItemNotes = null,
    plotBands: js.Array[SparklineValueAxisItemPlotBand] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    title: SparklineValueAxisItemTitle = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SparklineValueAxisItem = {
    val __obj = js.Dynamic.literal()
    if (axisCrossingValue != null) __obj.updateDynamic("axisCrossingValue")(axisCrossingValue.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (majorGridLines != null) __obj.updateDynamic("majorGridLines")(majorGridLines.asInstanceOf[js.Any])
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks.asInstanceOf[js.Any])
    if (majorUnit != null) __obj.updateDynamic("majorUnit")(majorUnit.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minorGridLines != null) __obj.updateDynamic("minorGridLines")(minorGridLines.asInstanceOf[js.Any])
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (minorUnit != null) __obj.updateDynamic("minorUnit")(minorUnit.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(narrowRange)) __obj.updateDynamic("narrowRange")(narrowRange.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineValueAxisItem]
  }
}

