package typingsJapgolly.highcharts.mod

import typingsJapgolly.highcharts.highchartsStrings.sankey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, `type`, xAxis, yAxis */ trait SeriesSankeyOptions
  extends StObject
     with PlotSankeyOptions {
  
  /**
    * Not available
    */
  var borderRadius: Unit
  
  /**
    * (Highcharts) An array of data points for the series. For the `sankey`
    * series type, points can be given in the following way:
    *
    * An array of objects with named values. The following snippet shows only a
    * few settings, see the complete options set below. If the total number of
    * data points exceeds the series' turboThreshold, this option is not
    * available. (see online documentation for example)
    *
    *  When you provide the data as tuples, the keys option has to be set as
    * well. (see online documentation for example)
    */
  var data: js.UndefOr[js.Array[(js.Array[String | Double]) | SeriesSankeyPointOptionsObject]] = js.undefined
  
  /**
    * Not available
    */
  var dataParser: Unit
  
  /**
    * Not available
    */
  var dataURL: Unit
  
  /**
    * Not available
    */
  var depth: Unit
  
  /**
    * Not available
    */
  var edgeColor: Unit
  
  /**
    * Not available
    */
  var edgeWidth: Unit
  
  /**
    * Not available
    */
  var groupPadding: Unit
  
  /**
    * Not available
    */
  var groupZPadding: Unit
  
  /**
    * Not available
    */
  var grouping: Unit
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An id for the series. This can
    * be used after render time to get a pointer to the series object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The index of the series in the
    * chart, affecting the internal index in the `chart.series` array, the
    * visible Z index as well as the order in the legend.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The sequential index of the
    * series in the legend.
    */
  var legendIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highmaps) An array of objects containing a `geometry` or `path`
    * definition and optionally additional properties to join in the `data` as
    * per the `joinBy` option. GeoJSON and TopoJSON structures can also be
    * passed directly into `mapData`.
    */
  var mapData: js.UndefOr[GeoJSON | TopoJSON | js.Array[SeriesMapDataOptions]] = js.undefined
  
  /**
    * Not available
    */
  var maxPointWidth: Unit
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
    * in the legend, tooltip etc.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) A collection of options for the individual nodes. The nodes
    * in a sankey diagram are auto-generated instances of `Highcharts.Point`,
    * but options can be applied here and linked by the `id`.
    */
  var nodes: js.UndefOr[js.Array[SeriesSankeyNodesOptionsObject]] = js.undefined
  
  /**
    * Not available
    */
  var pointPadding: Unit
  
  /**
    * Not available
    */
  var pointWidth: Unit
  
  /**
    * (Highcharts, Highstock) This option allows grouping series in a stacked
    * chart. The stack option can be a string or anything else, as long as the
    * grouped series' stack options match each other after conversion into a
    * string.
    */
  var stack: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | sankey
  
  /**
    * (Highcharts, Highstock) When using dual or multiple x axes, this number
    * defines which xAxis the particular series is connected to. It refers to
    * either the axis id or the index of the axis in the xAxis array, with 0
    * being the first.
    */
  var xAxis: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highcharts, Highstock) When using dual or multiple y axes, this number
    * defines which yAxis the particular series is connected to. It refers to
    * either the axis id or the index of the axis in the yAxis array, with 0
    * being the first.
    */
  var yAxis: js.UndefOr[Double | String] = js.undefined
}
object SeriesSankeyOptions {
  
  inline def apply(
    borderRadius: Unit,
    dataParser: Unit,
    dataURL: Unit,
    depth: Unit,
    edgeColor: Unit,
    edgeWidth: Unit,
    groupPadding: Unit,
    groupZPadding: Unit,
    grouping: Unit,
    maxPointWidth: Unit,
    pointPadding: Unit,
    pointWidth: Unit,
    `type`: String | sankey
  ): SeriesSankeyOptions = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], dataParser = dataParser.asInstanceOf[js.Any], dataURL = dataURL.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], edgeColor = edgeColor.asInstanceOf[js.Any], edgeWidth = edgeWidth.asInstanceOf[js.Any], groupPadding = groupPadding.asInstanceOf[js.Any], groupZPadding = groupZPadding.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], maxPointWidth = maxPointWidth.asInstanceOf[js.Any], pointPadding = pointPadding.asInstanceOf[js.Any], pointWidth = pointWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSankeyOptions]
  }
  
  extension [Self <: SeriesSankeyOptions](x: Self) {
    
    inline def setBorderRadius(value: Unit): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[(js.Array[String | Double]) | SeriesSankeyPointOptionsObject]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataParser(value: Unit): Self = StObject.set(x, "dataParser", value.asInstanceOf[js.Any])
    
    inline def setDataURL(value: Unit): Self = StObject.set(x, "dataURL", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: ((js.Array[String | Double]) | SeriesSankeyPointOptionsObject)*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDepth(value: Unit): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setEdgeColor(value: Unit): Self = StObject.set(x, "edgeColor", value.asInstanceOf[js.Any])
    
    inline def setEdgeWidth(value: Unit): Self = StObject.set(x, "edgeWidth", value.asInstanceOf[js.Any])
    
    inline def setGroupPadding(value: Unit): Self = StObject.set(x, "groupPadding", value.asInstanceOf[js.Any])
    
    inline def setGroupZPadding(value: Unit): Self = StObject.set(x, "groupZPadding", value.asInstanceOf[js.Any])
    
    inline def setGrouping(value: Unit): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLegendIndex(value: Double): Self = StObject.set(x, "legendIndex", value.asInstanceOf[js.Any])
    
    inline def setLegendIndexUndefined: Self = StObject.set(x, "legendIndex", js.undefined)
    
    inline def setMapData(value: GeoJSON | TopoJSON | js.Array[SeriesMapDataOptions]): Self = StObject.set(x, "mapData", value.asInstanceOf[js.Any])
    
    inline def setMapDataUndefined: Self = StObject.set(x, "mapData", js.undefined)
    
    inline def setMapDataVarargs(value: SeriesMapDataOptions*): Self = StObject.set(x, "mapData", js.Array(value*))
    
    inline def setMaxPointWidth(value: Unit): Self = StObject.set(x, "maxPointWidth", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodes(value: js.Array[SeriesSankeyNodesOptionsObject]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: SeriesSankeyNodesOptionsObject*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setPointPadding(value: Unit): Self = StObject.set(x, "pointPadding", value.asInstanceOf[js.Any])
    
    inline def setPointWidth(value: Unit): Self = StObject.set(x, "pointWidth", value.asInstanceOf[js.Any])
    
    inline def setStack(value: Double | String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setType(value: String | sankey): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXAxis(value: Double | String): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setYAxis(value: Double | String): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
