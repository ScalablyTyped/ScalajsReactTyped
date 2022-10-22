package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotHistogramDataSortingOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) Enable or disable data sorting for the series.
    * Use xAxis.reversed to change the sorting order.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock) Whether to allow matching points by name in an
    * update. If this option is disabled, points will be matched by order.
    */
  var matchByName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock) Determines what data value should be used to sort
    * by.
    */
  var sortKey: js.UndefOr[String] = js.undefined
}
object PlotHistogramDataSortingOptions {
  
  inline def apply(): PlotHistogramDataSortingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotHistogramDataSortingOptions]
  }
  
  extension [Self <: PlotHistogramDataSortingOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMatchByName(value: Boolean): Self = StObject.set(x, "matchByName", value.asInstanceOf[js.Any])
    
    inline def setMatchByNameUndefined: Self = StObject.set(x, "matchByName", js.undefined)
    
    inline def setSortKey(value: String): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
    
    inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
  }
}
