package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotWaterfallOnPointOptions extends StObject {
  
  /**
    * (Highcharts) Options for the connector in the _Series on point_ feature.
    *
    * In styled mode, the connector can be styled with the
    * `.highcharts-connector-seriesonpoint` class name.
    */
  var connectorOptions: js.UndefOr[PlotWaterfallOnPointConnectorOptions | SVGAttributes] = js.undefined
  
  /**
    * (Highcharts) The `id` of the point that we connect the series to. Only
    * points with a given `plotX` and `plotY` values and map points are valid.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) Options allowing to set a position and an offset of the
    * series in the _Series on point_ feature.
    */
  var position: js.UndefOr[js.Object | PlotWaterfallOnPointPositionOptions] = js.undefined
}
object PlotWaterfallOnPointOptions {
  
  inline def apply(): PlotWaterfallOnPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotWaterfallOnPointOptions]
  }
  
  extension [Self <: PlotWaterfallOnPointOptions](x: Self) {
    
    inline def setConnectorOptions(value: PlotWaterfallOnPointConnectorOptions | SVGAttributes): Self = StObject.set(x, "connectorOptions", value.asInstanceOf[js.Any])
    
    inline def setConnectorOptionsUndefined: Self = StObject.set(x, "connectorOptions", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPosition(value: js.Object | PlotWaterfallOnPointPositionOptions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
