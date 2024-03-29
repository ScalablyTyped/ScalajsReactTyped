package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XrangePointConnectorsOptionsObject extends StObject {
  
  /**
    * (Gantt) Set the default dash style for this chart's connecting lines.
    */
  var dashStyle: js.UndefOr[String] = js.undefined
  
  /**
    * (Gantt) Marker options specific to the end markers for this chart's
    * Pathfinder connectors. Overrides the generic marker options.
    */
  var endMarker: js.UndefOr[ConnectorsEndMarkerOptions] = js.undefined
  
  /**
    * (Gantt) Set the default color for this chart's Pathfinder connecting
    * lines. Defaults to the color of the point being connected.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Gantt) Set the default pixel width for this chart's Pathfinder
    * connecting lines.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Gantt) Marker options for this chart's Pathfinder connectors. Note that
    * this option is overridden by the `startMarker` and `endMarker` options.
    */
  var marker: js.UndefOr[ConnectorsMarkerOptions] = js.undefined
  
  /**
    * (Gantt) Marker options specific to the start markers for this chart's
    * Pathfinder connectors. Overrides the generic marker options.
    */
  var startMarker: js.UndefOr[ConnectorsStartMarkerOptions] = js.undefined
  
  /**
    * (Gantt) The ID of the point to connect to.
    */
  var to: js.UndefOr[String] = js.undefined
  
  /**
    * (Gantt) Set the default pathfinder algorithm to use for this chart. It is
    * possible to define your own algorithms by adding them to the
    * Highcharts.Pathfinder.prototype.algorithms object before the chart has
    * been created.
    *
    * The default algorithms are as follows:
    *
    * `straight`: Draws a straight line between the connecting points. Does not
    * avoid other points when drawing.
    *
    * `simpleConnect`: Finds a path between the points using right angles only.
    * Takes only starting/ending points into account, and will not avoid other
    * points.
    *
    * `fastAvoid`: Finds a path between the points using right angles only.
    * Will attempt to avoid other points, but its focus is performance over
    * accuracy. Works well with less dense datasets.
    *
    * Default value: `straight` is used as default for most series types, while
    * `simpleConnect` is used as default for Gantt series, to show dependencies
    * between points.
    */
  var `type`: js.UndefOr[PathfinderTypeValue] = js.undefined
}
object XrangePointConnectorsOptionsObject {
  
  inline def apply(): XrangePointConnectorsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XrangePointConnectorsOptionsObject]
  }
  
  extension [Self <: XrangePointConnectorsOptionsObject](x: Self) {
    
    inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setEndMarker(value: ConnectorsEndMarkerOptions): Self = StObject.set(x, "endMarker", value.asInstanceOf[js.Any])
    
    inline def setEndMarkerUndefined: Self = StObject.set(x, "endMarker", js.undefined)
    
    inline def setLineColor(value: ColorString): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setMarker(value: ConnectorsMarkerOptions): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setStartMarker(value: ConnectorsStartMarkerOptions): Self = StObject.set(x, "startMarker", value.asInstanceOf[js.Any])
    
    inline def setStartMarkerUndefined: Self = StObject.set(x, "startMarker", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setType(value: PathfinderTypeValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
