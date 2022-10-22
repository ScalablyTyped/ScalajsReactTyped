package typingsJapgolly.canvasjs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartDataCommon extends StObject {
  
  /**
    * Sets the click event handler for dataSeries which is triggered when user clicks on a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var click: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.undefined
  
  /**
    * Sets the color of dataSeries. The value of tickColor can be a "HTML Color Name" or "Hex Code".
    * Default: Automatically set from Theme.
    * Example: "red", "green" ..
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Enables or Disables highlighting of dataPoints on mouse hover.
    * Default: true
    * Example: true,false
    */
  var highlightEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Instead of setting string values for all indexLabels, you can also use keywords like x, y, etc that will automatically show corresponding properties as indexLabel.
    * This will allow you to define indexLabel at the series level once. While setting indexLabel you specify a keyword by enclosing it in flower brackets like {x}, {y}, {color}, etc.
    * Range Charts have two indexLabels – one for each y value. This requires the use of a special keyword #index to show index label on either sides of the column/bar/area.
    * eg: indexLabel: "{x}: {y[#index]}"
    * Important keywords to keep in mind are. {x}, {y}, {name}, {label}.
    * Default: null
    * Example: "{label}", "Win", "x: {x}, y: {y} "
    */
  var indexLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Background color of Index Labels. The value of indexLabelBackgroundColor can be a "HTML Color Name" or "Hex Code".
    * Default: null
    * Example: "red", "#FAC003" ..
    */
  var indexLabelBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Index Label’s Font color. The value of IndexLabelFontColor can be a "HTML Color Name" or "Hex Code".
    * Default: "grey"
    * Example: "red", "#FAC003" ..
    */
  var indexLabelFontColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Index Label’s Font Family.
    * Default: "Calibri, Optima, Candara, Verdana, Geneva, sans-serif"
    * Example: "calibri", "tahoma", "verdana"..
    */
  var indexLabelFontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Index Label’s Font Size in pixels.
    * Default: 18
    * Example: 12, 16, 22..
    */
  var indexLabelFontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the Index Label’s Font Style. It can be set to one of the below options.
    * Default: "normal"
    * Options: "italic", "oblique", "normal"
    */
  var indexLabelFontStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Index Label’s Font Weight. It can be set to one of the below options.
    * Default: "normal"
    * Example: "lighter", "normal" ,"bold" , "bolder"
    */
  var indexLabelFontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * A custom formatter function which returns the text to be displayed as indexLabel on dataPoints.
    * @param e event object
    */
  var indexLabelFormatter: js.UndefOr[js.Function1[/* e */ typingsJapgolly.canvasjs.anon.Chart, String]] = js.undefined
  
  /**
    * Sets the color of line connecting index labels with their dataPoint. It is only applicable for pie and doughnut chart when indexLabelPlacment is outside.
    * The value of indexLineColor can be a "HTML Color Name" or "Hex Code".
    * Default: "lightgrey"
    * Example: "red", "#FAC003" ..
    */
  var indexLabelLineColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Dash Type for indexLabel’s line. It is applicable only for pie and doughnut charts when indexLabelPlacement is set to “outside”.
    * For other chart-types, indexLabelLineThickness should be set greater than zero.
    * Default: solid
    */
  var indexLabelLineDashType: js.UndefOr[DashType] = js.undefined
  
  /**
    * Sets the thickness of line connecting indexLabel with its corresponding dataPoint.
    * It is only applicable for pie and doughnut chart when indexLabelPlacement is set to "outside".
    * Default: 2
    * Example: 4, 6
    */
  var indexLabelLineThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the Orientation of indexLabel to "horizontal" or "vertical".
    * Default: "horizontal"
    * Options: "horizontal", "vertical"
    */
  var indexLabelOrientation: js.UndefOr[String] = js.undefined
  
  /**
    * Using this property you can define whether to render indexLabel "inside" or "outside" the dataPoint.
    * Default: "outside"
    * Example: "outside", "inside"
    */
  var indexLabelPlacement: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border color around the legend marker. Value of legendMarkerBorderColor can be “color names” or “hex code”.
    * Default: dataSeries color.
    * Example: “red”, “#008000” ..
    */
  var legendMarkerBorderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the thickness of the legend’s Marker Border in pixels.
    * Default: 0
    * Example: 2, 4 ..
    */
  var legendMarkerBorderThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the color of marker that is displayed on legend. This property overrides default Marker’s Color in Legend, which is same as dataSeries Marker Color.
    * Value of legendMarkerColor can be "HTML Color Name" or "hex code".
    * Default: dataSeries marker color
    * Example: "red", "#008000" ..
    */
  var legendMarkerColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Legend Marker to one of the options below. This property is used to override the default marker in legend, which is same as dataSeries Marker Type.
    * Default: same as markerType
    * Options: "circle", "square", "cross" and "triangle"
    */
  var legendMarkerType: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the text that describes the dataSeries in legend.
    * Default: "DataSeries 1", "DataSeries 2" ..etc
    * Example: "2010", "2011"..
    */
  var legendText: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border color around marker. Value of markerBorderColor can be "HTML Color Name" or "hex code".
    * Default: dataSeries color.
    * Example: "red", "#008000" ..
    */
  var markerBorderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the thickness of the Marker’s Border in pixels.
    * Default: 1
    * Example: 2,4 ..
    */
  var markerBorderThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the color of marker that is displayed on the Chart. Legend Marker for the series uses the same Color as set here unless overridden using legendMarkerColor property.
    * Default: dataSeries Color
    * Example: "red", "#008000" ..
    */
  var markerColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Size of the marker that is drawn. To display marker in area Chart, set markerSize to a value greater than zero.
    * For line, scatter chart, size it is automatically set unless overridden.
    * Default: auto. Zero for area chart
    * Example: 5, 10..
    */
  var markerSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets marker type to be rendered at each dataPoint. While markers are helpful in highlighting individual dataPoints, they do not help much when the dataPoints are crowded.
    * In case of large number of dataPoints it is recommended to disable markers in order to improve the appearance and performance of chart.
    * Same marker type is also used in legend unless overridden by legendMarkerType property.
    * Default: "circle"
    * Options: "none", "circle", "square", "triangle" and "cross"
    */
  var markerType: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the mousemove event handler for dataSeries which is triggered when user Moves mouse on a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mousemove: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.undefined
  
  /**
    * Sets the mouseout event handler for dataSeries which is triggered when user moves mouse out of a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mouseout: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.undefined
  
  /**
    * Sets the mouseover event handler for dataSeries which is triggered when user moves Mouse Over a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mouseover: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.undefined
  
  /**
    * Sets the dataPoint Name. dataPoint name is shown in various places like toolTip & legend unless overridden.
    * Default: Automatically Named ("dataPoint 1", "dataPoint 2" .. )
    * Example: "apple", "mango" ..
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Default Tooltip can be modified at dataSeries or dataPoint level. You can add content to be displayed in toolTip using toolTipContent.
    * toolTipContent set at dataPoint will override toolTipContent set at dataSeries level.
    * Default: auto set depending on chart type.
    */
  var toolTipContent: js.UndefOr[String] = js.undefined
}
object ChartDataCommon {
  
  inline def apply(): ChartDataCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataCommon]
  }
  
  extension [Self <: ChartDataCommon](x: Self) {
    
    inline def setClick(value: /* event */ ChartEvent => Callback): Self = StObject.set(x, "click", js.Any.fromFunction1((t0: /* event */ ChartEvent) => value(t0).runNow()))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHighlightEnabled(value: Boolean): Self = StObject.set(x, "highlightEnabled", value.asInstanceOf[js.Any])
    
    inline def setHighlightEnabledUndefined: Self = StObject.set(x, "highlightEnabled", js.undefined)
    
    inline def setIndexLabel(value: String): Self = StObject.set(x, "indexLabel", value.asInstanceOf[js.Any])
    
    inline def setIndexLabelBackgroundColor(value: String): Self = StObject.set(x, "indexLabelBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setIndexLabelBackgroundColorUndefined: Self = StObject.set(x, "indexLabelBackgroundColor", js.undefined)
    
    inline def setIndexLabelFontColor(value: String): Self = StObject.set(x, "indexLabelFontColor", value.asInstanceOf[js.Any])
    
    inline def setIndexLabelFontColorUndefined: Self = StObject.set(x, "indexLabelFontColor", js.undefined)
    
    inline def setIndexLabelFontFamily(value: String): Self = StObject.set(x, "indexLabelFontFamily", value.asInstanceOf[js.Any])
    
    inline def setIndexLabelFontFamilyUndefined: Self = StObject.set(x, "indexLabelFontFamily", js.undefined)
    
    inline def setIndexLabelFontSize(value: Double): Self = StObject.set(x, "indexLabelFontSize", value.asInstanceOf[js.Any])
    
    inline def setIndexLabelFontSizeUndefined: Self = StObject.set(x, "indexLabelFontSize", js.undefined)
    
    inline def setIndexLabelFontStyle(value: String): Self = StObject.set(x, "indexLabelFontStyle", value.asInstanceOf[js.Any])
    
    inline def setIndexLabelFontStyleUndefined: Self = StObject.set(x, "indexLabelFontStyle", js.undefined)
    
    inline def setIndexLabelFontWeight(value: String): Self = StObject.set(x, "indexLabelFontWeight", value.asInstanceOf[js.Any])
    
    inline def setIndexLabelFontWeightUndefined: Self = StObject.set(x, "indexLabelFontWeight", js.undefined)
    
    inline def setIndexLabelFormatter(value: /* e */ typingsJapgolly.canvasjs.anon.Chart => String): Self = StObject.set(x, "indexLabelFormatter", js.Any.fromFunction1(value))
    
    inline def setIndexLabelFormatterUndefined: Self = StObject.set(x, "indexLabelFormatter", js.undefined)
    
    inline def setIndexLabelLineColor(value: String): Self = StObject.set(x, "indexLabelLineColor", value.asInstanceOf[js.Any])
    
    inline def setIndexLabelLineColorUndefined: Self = StObject.set(x, "indexLabelLineColor", js.undefined)
    
    inline def setIndexLabelLineDashType(value: DashType): Self = StObject.set(x, "indexLabelLineDashType", value.asInstanceOf[js.Any])
    
    inline def setIndexLabelLineDashTypeUndefined: Self = StObject.set(x, "indexLabelLineDashType", js.undefined)
    
    inline def setIndexLabelLineThickness(value: Double): Self = StObject.set(x, "indexLabelLineThickness", value.asInstanceOf[js.Any])
    
    inline def setIndexLabelLineThicknessUndefined: Self = StObject.set(x, "indexLabelLineThickness", js.undefined)
    
    inline def setIndexLabelOrientation(value: String): Self = StObject.set(x, "indexLabelOrientation", value.asInstanceOf[js.Any])
    
    inline def setIndexLabelOrientationUndefined: Self = StObject.set(x, "indexLabelOrientation", js.undefined)
    
    inline def setIndexLabelPlacement(value: String): Self = StObject.set(x, "indexLabelPlacement", value.asInstanceOf[js.Any])
    
    inline def setIndexLabelPlacementUndefined: Self = StObject.set(x, "indexLabelPlacement", js.undefined)
    
    inline def setIndexLabelUndefined: Self = StObject.set(x, "indexLabel", js.undefined)
    
    inline def setLegendMarkerBorderColor(value: String): Self = StObject.set(x, "legendMarkerBorderColor", value.asInstanceOf[js.Any])
    
    inline def setLegendMarkerBorderColorUndefined: Self = StObject.set(x, "legendMarkerBorderColor", js.undefined)
    
    inline def setLegendMarkerBorderThickness(value: Double): Self = StObject.set(x, "legendMarkerBorderThickness", value.asInstanceOf[js.Any])
    
    inline def setLegendMarkerBorderThicknessUndefined: Self = StObject.set(x, "legendMarkerBorderThickness", js.undefined)
    
    inline def setLegendMarkerColor(value: String): Self = StObject.set(x, "legendMarkerColor", value.asInstanceOf[js.Any])
    
    inline def setLegendMarkerColorUndefined: Self = StObject.set(x, "legendMarkerColor", js.undefined)
    
    inline def setLegendMarkerType(value: String): Self = StObject.set(x, "legendMarkerType", value.asInstanceOf[js.Any])
    
    inline def setLegendMarkerTypeUndefined: Self = StObject.set(x, "legendMarkerType", js.undefined)
    
    inline def setLegendText(value: String): Self = StObject.set(x, "legendText", value.asInstanceOf[js.Any])
    
    inline def setLegendTextUndefined: Self = StObject.set(x, "legendText", js.undefined)
    
    inline def setMarkerBorderColor(value: String): Self = StObject.set(x, "markerBorderColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerBorderColorUndefined: Self = StObject.set(x, "markerBorderColor", js.undefined)
    
    inline def setMarkerBorderThickness(value: Double): Self = StObject.set(x, "markerBorderThickness", value.asInstanceOf[js.Any])
    
    inline def setMarkerBorderThicknessUndefined: Self = StObject.set(x, "markerBorderThickness", js.undefined)
    
    inline def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
    
    inline def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    inline def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
    
    inline def setMarkerType(value: String): Self = StObject.set(x, "markerType", value.asInstanceOf[js.Any])
    
    inline def setMarkerTypeUndefined: Self = StObject.set(x, "markerType", js.undefined)
    
    inline def setMousemove(value: /* event */ ChartEvent => Callback): Self = StObject.set(x, "mousemove", js.Any.fromFunction1((t0: /* event */ ChartEvent) => value(t0).runNow()))
    
    inline def setMousemoveUndefined: Self = StObject.set(x, "mousemove", js.undefined)
    
    inline def setMouseout(value: /* event */ ChartEvent => Callback): Self = StObject.set(x, "mouseout", js.Any.fromFunction1((t0: /* event */ ChartEvent) => value(t0).runNow()))
    
    inline def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
    
    inline def setMouseover(value: /* event */ ChartEvent => Callback): Self = StObject.set(x, "mouseover", js.Any.fromFunction1((t0: /* event */ ChartEvent) => value(t0).runNow()))
    
    inline def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setToolTipContent(value: String): Self = StObject.set(x, "toolTipContent", value.asInstanceOf[js.Any])
    
    inline def setToolTipContentUndefined: Self = StObject.set(x, "toolTipContent", js.undefined)
  }
}
