package typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Entry point for creating Charts in scripts.
  *
  * This example creates a basic data table, populates an area chart with the data, and adds it
  * into a web page as an image:
  *
  *     function doGet() {
  *       var data = Charts.newDataTable()
  *           .addColumn(Charts.ColumnType.STRING, "Month")
  *           .addColumn(Charts.ColumnType.NUMBER, "In Store")
  *           .addColumn(Charts.ColumnType.NUMBER, "Online")
  *           .addRow(["January", 10, 1])
  *           .addRow(["February", 12, 1])
  *           .addRow(["March", 20, 2])
  *           .addRow(["April", 25, 3])
  *           .addRow(["May", 30, 4])
  *           .build();
  *
  *       var chart = Charts.newAreaChart()
  *           .setDataTable(data)
  *           .setStacked()
  *           .setRange(0, 40)
  *           .setTitle("Sales per Month")
  *           .build();
  *
  *        var htmlOutput = HtmlService.createHtmlOutput().setTitle('My Chart');
  *        var imageData = Utilities.base64Encode(chart.getAs('image/png').getBytes());
  *        var imageUrl = "data:image/png;base64," + encodeURI(imageData);
  *        htmlOutput.append("Render chart server side: <br/>");
  *        htmlOutput.append("<img border=\"1\" src=\"" + imageUrl + "\">");
  *        return htmlOutput;
  *     }
  */
trait Charts extends StObject {
  
  var ChartHiddenDimensionStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartHiddenDimensionStrategy */ Any
  
  var ChartMergeStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartMergeStrategy */ Any
  
  var ChartType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartType */ Any
  
  var ColumnType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColumnType */ Any
  
  var CurveStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CurveStyle */ Any
  
  var PointStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ Any
  
  var Position: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ Any
  
  def newAreaChart(): AreaChartBuilder
  
  def newBarChart(): BarChartBuilder
  
  def newColumnChart(): ColumnChartBuilder
  
  def newDataTable(): DataTableBuilder
  
  def newDataViewDefinition(): DataViewDefinitionBuilder
  
  def newLineChart(): LineChartBuilder
  
  def newPieChart(): PieChartBuilder
  
  def newScatterChart(): ScatterChartBuilder
  
  def newTableChart(): TableChartBuilder
  
  def newTextStyle(): TextStyleBuilder
}
object Charts {
  
  inline def apply(
    ChartHiddenDimensionStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartHiddenDimensionStrategy */ Any,
    ChartMergeStrategy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartMergeStrategy */ Any,
    ChartType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartType */ Any,
    ColumnType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColumnType */ Any,
    CurveStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CurveStyle */ Any,
    PointStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ Any,
    Position: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ Any,
    newAreaChart: CallbackTo[AreaChartBuilder],
    newBarChart: CallbackTo[BarChartBuilder],
    newColumnChart: CallbackTo[ColumnChartBuilder],
    newDataTable: CallbackTo[DataTableBuilder],
    newDataViewDefinition: CallbackTo[DataViewDefinitionBuilder],
    newLineChart: CallbackTo[LineChartBuilder],
    newPieChart: CallbackTo[PieChartBuilder],
    newScatterChart: CallbackTo[ScatterChartBuilder],
    newTableChart: CallbackTo[TableChartBuilder],
    newTextStyle: CallbackTo[TextStyleBuilder]
  ): typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.Charts = {
    val __obj = js.Dynamic.literal(ChartHiddenDimensionStrategy = ChartHiddenDimensionStrategy.asInstanceOf[js.Any], ChartMergeStrategy = ChartMergeStrategy.asInstanceOf[js.Any], ChartType = ChartType.asInstanceOf[js.Any], ColumnType = ColumnType.asInstanceOf[js.Any], CurveStyle = CurveStyle.asInstanceOf[js.Any], PointStyle = PointStyle.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], newAreaChart = newAreaChart.toJsFn, newBarChart = newBarChart.toJsFn, newColumnChart = newColumnChart.toJsFn, newDataTable = newDataTable.toJsFn, newDataViewDefinition = newDataViewDefinition.toJsFn, newLineChart = newLineChart.toJsFn, newPieChart = newPieChart.toJsFn, newScatterChart = newScatterChart.toJsFn, newTableChart = newTableChart.toJsFn, newTextStyle = newTextStyle.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.Charts]
  }
  
  extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.Charts](x: Self) {
    
    inline def setChartHiddenDimensionStrategy(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartHiddenDimensionStrategy */ Any
    ): Self = StObject.set(x, "ChartHiddenDimensionStrategy", value.asInstanceOf[js.Any])
    
    inline def setChartMergeStrategy(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartMergeStrategy */ Any
    ): Self = StObject.set(x, "ChartMergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setChartType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartType */ Any): Self = StObject.set(x, "ChartType", value.asInstanceOf[js.Any])
    
    inline def setColumnType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColumnType */ Any): Self = StObject.set(x, "ColumnType", value.asInstanceOf[js.Any])
    
    inline def setCurveStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CurveStyle */ Any): Self = StObject.set(x, "CurveStyle", value.asInstanceOf[js.Any])
    
    inline def setNewAreaChart(value: CallbackTo[AreaChartBuilder]): Self = StObject.set(x, "newAreaChart", value.toJsFn)
    
    inline def setNewBarChart(value: CallbackTo[BarChartBuilder]): Self = StObject.set(x, "newBarChart", value.toJsFn)
    
    inline def setNewColumnChart(value: CallbackTo[ColumnChartBuilder]): Self = StObject.set(x, "newColumnChart", value.toJsFn)
    
    inline def setNewDataTable(value: CallbackTo[DataTableBuilder]): Self = StObject.set(x, "newDataTable", value.toJsFn)
    
    inline def setNewDataViewDefinition(value: CallbackTo[DataViewDefinitionBuilder]): Self = StObject.set(x, "newDataViewDefinition", value.toJsFn)
    
    inline def setNewLineChart(value: CallbackTo[LineChartBuilder]): Self = StObject.set(x, "newLineChart", value.toJsFn)
    
    inline def setNewPieChart(value: CallbackTo[PieChartBuilder]): Self = StObject.set(x, "newPieChart", value.toJsFn)
    
    inline def setNewScatterChart(value: CallbackTo[ScatterChartBuilder]): Self = StObject.set(x, "newScatterChart", value.toJsFn)
    
    inline def setNewTableChart(value: CallbackTo[TableChartBuilder]): Self = StObject.set(x, "newTableChart", value.toJsFn)
    
    inline def setNewTextStyle(value: CallbackTo[TextStyleBuilder]): Self = StObject.set(x, "newTextStyle", value.toJsFn)
    
    inline def setPointStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PointStyle */ Any): Self = StObject.set(x, "PointStyle", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Position */ Any): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
  }
}
