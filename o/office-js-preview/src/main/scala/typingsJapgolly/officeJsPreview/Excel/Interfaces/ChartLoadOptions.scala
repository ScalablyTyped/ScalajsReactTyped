package typingsJapgolly.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a chart object in a workbook.
  To learn more about the chart object model, see {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-charts | Work with charts using the Excel JavaScript API}.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
trait ChartLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents chart axes.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var axes: js.UndefOr[ChartAxesLoadOptions] = js.undefined
  
  /**
    * Specifies a chart category label level enumeration constant, referring to the level of the source category labels.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var categoryLabelLevel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the type of the chart. See `Excel.ChartType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the data labels on the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsLoadOptions] = js.undefined
  
  /**
    * Specifies the way that blank cells are plotted on a chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var displayBlanksAs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Encapsulates the format properties for the chart area.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAreaFormatLoadOptions] = js.undefined
  
  /**
    * Specifies the height, in points, of the chart object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The unique ID of chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The distance, in points, from the left side of the chart to the worksheet origin.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the legend for the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var legend: js.UndefOr[ChartLegendLoadOptions] = js.undefined
  
  /**
    * Specifies the name of a chart object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Encapsulates the options for a pivot chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var pivotOptions: js.UndefOr[ChartPivotOptionsLoadOptions] = js.undefined
  
  /**
    * Represents the plot area for the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var plotArea: js.UndefOr[ChartPlotAreaLoadOptions] = js.undefined
  
  /**
    * Specifies the way columns or rows are used as data series on the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var plotBy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if only visible cells are plotted. False if both visible and hidden cells are plotted.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var plotVisibleOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents either a single series or collection of series in the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var series: js.UndefOr[ChartSeriesCollectionLoadOptions] = js.undefined
  
  /**
    * Specifies a chart series name level enumeration constant, referring to the level of the source series names.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var seriesNameLevel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display all field buttons on a PivotChart.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showAllFieldButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to show the data labels when the value is greater than the maximum value on the value axis.
    If the value axis becomes smaller than the size of the data points, you can use this property to set whether to show the data labels.
    This property applies to 2-D charts only.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showDataLabelsOverMaximum: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the chart style for the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the title of the specified chart, including the text, visibility, position, and formatting of the title.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartTitleLoadOptions] = js.undefined
  
  /**
    * Specifies the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width, in points, of the chart object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var width: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The worksheet containing the current chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}
object ChartLoadOptions {
  
  inline def apply(): ChartLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLoadOptions]
  }
  
  extension [Self <: ChartLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAxes(value: ChartAxesLoadOptions): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    inline def setCategoryLabelLevel(value: Boolean): Self = StObject.set(x, "categoryLabelLevel", value.asInstanceOf[js.Any])
    
    inline def setCategoryLabelLevelUndefined: Self = StObject.set(x, "categoryLabelLevel", js.undefined)
    
    inline def setChartType(value: Boolean): Self = StObject.set(x, "chartType", value.asInstanceOf[js.Any])
    
    inline def setChartTypeUndefined: Self = StObject.set(x, "chartType", js.undefined)
    
    inline def setDataLabels(value: ChartDataLabelsLoadOptions): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    inline def setDisplayBlanksAs(value: Boolean): Self = StObject.set(x, "displayBlanksAs", value.asInstanceOf[js.Any])
    
    inline def setDisplayBlanksAsUndefined: Self = StObject.set(x, "displayBlanksAs", js.undefined)
    
    inline def setFormat(value: ChartAreaFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLegend(value: ChartLegendLoadOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPivotOptions(value: ChartPivotOptionsLoadOptions): Self = StObject.set(x, "pivotOptions", value.asInstanceOf[js.Any])
    
    inline def setPivotOptionsUndefined: Self = StObject.set(x, "pivotOptions", js.undefined)
    
    inline def setPlotArea(value: ChartPlotAreaLoadOptions): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    inline def setPlotAreaUndefined: Self = StObject.set(x, "plotArea", js.undefined)
    
    inline def setPlotBy(value: Boolean): Self = StObject.set(x, "plotBy", value.asInstanceOf[js.Any])
    
    inline def setPlotByUndefined: Self = StObject.set(x, "plotBy", js.undefined)
    
    inline def setPlotVisibleOnly(value: Boolean): Self = StObject.set(x, "plotVisibleOnly", value.asInstanceOf[js.Any])
    
    inline def setPlotVisibleOnlyUndefined: Self = StObject.set(x, "plotVisibleOnly", js.undefined)
    
    inline def setSeries(value: ChartSeriesCollectionLoadOptions): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesNameLevel(value: Boolean): Self = StObject.set(x, "seriesNameLevel", value.asInstanceOf[js.Any])
    
    inline def setSeriesNameLevelUndefined: Self = StObject.set(x, "seriesNameLevel", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setShowAllFieldButtons(value: Boolean): Self = StObject.set(x, "showAllFieldButtons", value.asInstanceOf[js.Any])
    
    inline def setShowAllFieldButtonsUndefined: Self = StObject.set(x, "showAllFieldButtons", js.undefined)
    
    inline def setShowDataLabelsOverMaximum(value: Boolean): Self = StObject.set(x, "showDataLabelsOverMaximum", value.asInstanceOf[js.Any])
    
    inline def setShowDataLabelsOverMaximumUndefined: Self = StObject.set(x, "showDataLabelsOverMaximum", js.undefined)
    
    inline def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitle(value: ChartTitleLoadOptions): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWorksheet(value: WorksheetLoadOptions): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    inline def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
