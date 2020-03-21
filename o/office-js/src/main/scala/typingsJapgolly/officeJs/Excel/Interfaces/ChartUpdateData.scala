package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.ChartDisplayBlanksAs
import typingsJapgolly.officeJs.Excel.ChartPlotBy
import typingsJapgolly.officeJs.officeJsStrings.Columns
import typingsJapgolly.officeJs.officeJsStrings.Interplotted
import typingsJapgolly.officeJs.officeJsStrings.NotPlotted
import typingsJapgolly.officeJs.officeJsStrings.Rows
import typingsJapgolly.officeJs.officeJsStrings.Zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Chart object, for use in `chart.set({ ... })`. */
trait ChartUpdateData extends js.Object {
  /**
    *
    * Represents chart axes.
    *
    * [Api set: ExcelApi 1.1]
    */
  var axes: js.UndefOr[ChartAxesUpdateData] = js.undefined
  /**
    *
    * Returns or sets a ChartCategoryLabelLevel enumeration constant referring to
    the level of where the category labels are being sourced from. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var categoryLabelLevel: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the type of the chart. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 84 */ js.Any
  ] = js.undefined
  /**
    *
    * Represents the datalabels on the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsUpdateData] = js.undefined
  /**
    *
    * Returns or sets the way that blank cells are plotted on a chart. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var displayBlanksAs: js.UndefOr[ChartDisplayBlanksAs | NotPlotted | Zero | Interplotted] = js.undefined
  /**
    *
    * Encapsulates the format properties for the chart area.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAreaFormatUpdateData] = js.undefined
  /**
    *
    * Represents the height, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    *
    * The distance, in points, from the left side of the chart to the worksheet origin.
    *
    * [Api set: ExcelApi 1.1]
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the legend for the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var legend: js.UndefOr[ChartLegendUpdateData] = js.undefined
  /**
    *
    * Represents the name of a chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Encapsulates the options for a pivot chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pivotOptions: js.UndefOr[ChartPivotOptionsUpdateData] = js.undefined
  /**
    *
    * Represents the plotArea for the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotArea: js.UndefOr[ChartPlotAreaUpdateData] = js.undefined
  /**
    *
    * Returns or sets the way columns or rows are used as data series on the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotBy: js.UndefOr[ChartPlotBy | Rows | Columns] = js.undefined
  /**
    *
    * True if only visible cells are plotted. False if both visible and hidden cells are plotted. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotVisibleOnly: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets a ChartSeriesNameLevel enumeration constant referring to
    the level of where the series names are being sourced from. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var seriesNameLevel: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents whether to display all field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showAllFieldButtons: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents whether to show the data labels when the value is greater than the maximum value on the value axis.
    If value axis became smaller than the size of data points, you can use this property to set whether to show the data labels.
    This property applies to 2-D charts only.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showDataLabelsOverMaximum: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the chart style for the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var style: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the title of the specified chart, including the text, visibility, position, and formatting of the title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartTitleUpdateData] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
    *
    * [Api set: ExcelApi 1.1]
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the width, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ChartUpdateData {
  @scala.inline
  def apply(
    axes: ChartAxesUpdateData = null,
    categoryLabelLevel: Int | Double = null,
    chartType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 84 */ js.Any = null,
    dataLabels: ChartDataLabelsUpdateData = null,
    displayBlanksAs: ChartDisplayBlanksAs | NotPlotted | Zero | Interplotted = null,
    format: ChartAreaFormatUpdateData = null,
    height: Int | Double = null,
    left: Int | Double = null,
    legend: ChartLegendUpdateData = null,
    name: String = null,
    pivotOptions: ChartPivotOptionsUpdateData = null,
    plotArea: ChartPlotAreaUpdateData = null,
    plotBy: ChartPlotBy | Rows | Columns = null,
    plotVisibleOnly: js.UndefOr[Boolean] = js.undefined,
    seriesNameLevel: Int | Double = null,
    showAllFieldButtons: js.UndefOr[Boolean] = js.undefined,
    showDataLabelsOverMaximum: js.UndefOr[Boolean] = js.undefined,
    style: Int | Double = null,
    title: ChartTitleUpdateData = null,
    top: Int | Double = null,
    width: Int | Double = null
  ): ChartUpdateData = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (categoryLabelLevel != null) __obj.updateDynamic("categoryLabelLevel")(categoryLabelLevel.asInstanceOf[js.Any])
    if (chartType != null) __obj.updateDynamic("chartType")(chartType.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (displayBlanksAs != null) __obj.updateDynamic("displayBlanksAs")(displayBlanksAs.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pivotOptions != null) __obj.updateDynamic("pivotOptions")(pivotOptions.asInstanceOf[js.Any])
    if (plotArea != null) __obj.updateDynamic("plotArea")(plotArea.asInstanceOf[js.Any])
    if (plotBy != null) __obj.updateDynamic("plotBy")(plotBy.asInstanceOf[js.Any])
    if (!js.isUndefined(plotVisibleOnly)) __obj.updateDynamic("plotVisibleOnly")(plotVisibleOnly.asInstanceOf[js.Any])
    if (seriesNameLevel != null) __obj.updateDynamic("seriesNameLevel")(seriesNameLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(showAllFieldButtons)) __obj.updateDynamic("showAllFieldButtons")(showAllFieldButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(showDataLabelsOverMaximum)) __obj.updateDynamic("showDataLabelsOverMaximum")(showDataLabelsOverMaximum.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartUpdateData]
  }
}

